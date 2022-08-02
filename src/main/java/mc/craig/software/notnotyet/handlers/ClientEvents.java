package mc.craig.software.notnotyet.handlers;

import com.mojang.blaze3d.platform.Window;
import com.mojang.blaze3d.systems.RenderSystem;
import com.mojang.blaze3d.vertex.PoseStack;
import mc.craig.software.notnotyet.NoNotYet;
import mc.craig.software.notnotyet.client.sound.GlideSound;
import mc.craig.software.notnotyet.common.items.ParagliderItem;
import mc.craig.software.notnotyet.util.GliderUtil;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.GuiComponent;
import net.minecraft.client.player.LocalPlayer;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.client.event.RenderGuiOverlayEvent;
import net.minecraftforge.client.gui.overlay.VanillaGuiOverlay;
import net.minecraftforge.event.entity.EntityJoinLevelEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(modid = NoNotYet.MODID, value = Dist.CLIENT)
public class ClientEvents {

    @SubscribeEvent
    public static void onJoinWorld(EntityJoinLevelEvent event) {
        Entity living = event.getEntity();
        if (living instanceof Player player) {
            Minecraft.getInstance().getSoundManager().play(new GlideSound(player));
        }
    }

    public static final ResourceLocation TEX = new ResourceLocation(NoNotYet.MODID, "textures/gui/bar_widget.png");

    @SubscribeEvent
    public static void onRenderGameOverlayPre(RenderGuiOverlayEvent.Pre e) {

        if (e.getOverlay().id() == VanillaGuiOverlay.EXPERIENCE_BAR.id()) {
            e.setCanceled(true);
            return;
        }

        PoseStack stack = e.getPoseStack();
        LocalPlayer player = Minecraft.getInstance().player;
        ItemStack itemStack = player.getItemBySlot(EquipmentSlot.CHEST);

        Minecraft minecraft = Minecraft.getInstance();
        Window window = Minecraft.getInstance().getWindow();

        if (itemStack.getItem() instanceof ParagliderItem paragliderItem && GliderUtil.isGliding(player)) {
            int allowedDuration = paragliderItem.getFixedFlightTimeTicks();
            int durationUsed = ParagliderItem.timeInAir(itemStack);
            float progress = (float) durationUsed / allowedDuration;

            stack.pushPose();
            RenderSystem.setShaderTexture(0, TEX);
            int winWid = window.getGuiScaledWidth() / 2 - 91;
            int winHeight = window.getGuiScaledHeight() - 32 + 3;

            minecraft.gui.blit(stack, winWid, winHeight, 0, 64, 182, 5);

            int status = (int) (progress * 182F);

            if (status > 0) {
                minecraft.gui.blit(stack, winWid + 182 - status, winHeight, 182 - status, 69, status, 5);
            }

         /*   String message = "Remaining Flight Time";
            int messageWidth = minecraft.font.width(message);
            drawStringWithOutline(stack, message, e.getWindow().getGuiScaledWidth() / 2 - messageWidth / 2, e.getWindow().getGuiScaledHeight() - 40, Color.GREEN.getRGB(), 0);

*/
            stack.popPose();

        }
    }

    public static void drawStringWithOutline(PoseStack stack, String string, int posX, int posY, int fontColor, int outlineColor) {
        Minecraft mc = Minecraft.getInstance();
        mc.font.draw(stack, string, posX + 1, posY, outlineColor);
        mc.font.draw(stack, string, posX - 1, posY, outlineColor);
        mc.font.draw(stack, string, posX, posY + 1, outlineColor);
        mc.font.draw(stack, string, posX, posY - 1, outlineColor);
        mc.font.draw(stack, string, posX, posY, fontColor);
    }


}
