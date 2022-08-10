package mc.craig.software.craftplus.client.renderers;

import mc.craig.software.craftplus.MinecraftPlus;
import mc.craig.software.craftplus.client.models.Models;
import mc.craig.software.craftplus.client.models.OwlModel;
import mc.craig.software.craftplus.common.entities.OwlEntity;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.resources.ResourceLocation;
import org.jetbrains.annotations.Nullable;

public class RenderOwl extends MobRenderer<OwlEntity, OwlModel<OwlEntity>> {

    public static final ResourceLocation[] OWL_LOCATIONS = new ResourceLocation[]{
            new ResourceLocation(MinecraftPlus.MODID, "textures/entity/owl/owl_0.png"),
            new ResourceLocation(MinecraftPlus.MODID, "textures/entity/owl/owl_1.png"),
            new ResourceLocation(MinecraftPlus.MODID, "textures/entity/owl/owl_2.png"),
            new ResourceLocation(MinecraftPlus.MODID, "textures/entity/owl/owl_3.png"),
            new ResourceLocation(MinecraftPlus.MODID, "textures/entity/owl/owl_4.png"),
            new ResourceLocation(MinecraftPlus.MODID, "textures/entity/owl/owl_5.png"),
            new ResourceLocation(MinecraftPlus.MODID, "textures/entity/owl/owl_6.png")};

    public RenderOwl(EntityRendererProvider.Context p_174304_) {
        super(p_174304_, new OwlModel<>(Minecraft.getInstance().getEntityModels().bakeLayer(Models.OWL)), 0.2F);
    }

    @Nullable
    @Override
    protected RenderType getRenderType(OwlEntity p_115322_, boolean p_115323_, boolean p_115324_, boolean p_115325_) {
        return RenderType.entityTranslucentCull(getTextureLocation(p_115322_));
    }

    @Override
    public ResourceLocation getTextureLocation(OwlEntity p_115658_) {
        return OWL_LOCATIONS[p_115658_.getVariant()];
    }

}
