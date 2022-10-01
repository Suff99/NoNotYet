package mc.craig.software.craftplus.handlers;

import mc.craig.software.craftplus.common.ModDamageSource;
import mc.craig.software.craftplus.common.ModItems;
import mc.craig.software.craftplus.common.advancement.TriggerManager;
import mc.craig.software.craftplus.common.capability.ICap;
import mc.craig.software.craftplus.common.capability.ModCapability;
import mc.craig.software.craftplus.common.entities.Owl;
import mc.craig.software.craftplus.common.items.ParagliderItem;
import mc.craig.software.craftplus.util.GliderUtil;
import mc.craig.software.craftplus.util.ModConstants;
import net.minecraft.core.Direction;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.ExperienceOrb;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.ai.goal.target.NonTameRandomTargetGoal;
import net.minecraft.world.entity.animal.Cat;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;
import net.minecraftforge.common.capabilities.Capability;
import net.minecraftforge.common.capabilities.ICapabilitySerializable;
import net.minecraftforge.common.util.LazyOptional;
import net.minecraftforge.event.AnvilUpdateEvent;
import net.minecraftforge.event.AttachCapabilitiesEvent;
import net.minecraftforge.event.entity.EntityJoinLevelEvent;
import net.minecraftforge.event.entity.EntityStruckByLightningEvent;
import net.minecraftforge.event.entity.living.LivingAttackEvent;
import net.minecraftforge.event.entity.living.LivingEntityUseItemEvent;
import net.minecraftforge.event.entity.living.LivingEvent;
import net.minecraftforge.event.entity.living.LivingHurtEvent;
import net.minecraftforge.event.entity.player.PlayerEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.threetag.palladiumcore.event.EntityEvents;
import net.threetag.palladiumcore.event.EventResult;
import net.threetag.palladiumcore.event.LivingEntityEvents;

import javax.annotation.Nonnull;

public class CommonEvents implements EntityEvents.JoinLevel, LivingEntityEvents.Hurt {

    public static void init() {
        var instance = new CommonEvents();
        EntityEvents.JOIN_LEVEL.register(instance);
        LivingEntityEvents.HURT.register(instance);
    }

    @Override
    public void entityJoinLevel(Entity entity, Level level) {
        // Make Cats attack Owls
        if (entity instanceof Cat cat) {
            cat.targetSelector.addGoal(1, new NonTameRandomTargetGoal<>(cat, Owl.class, false, null));
        }

        // Stop all kinds of XP
        if (entity instanceof ExperienceOrb) {
            entity.discard();
        }
    }

    @SubscribeEvent
    public static void onAnvil(AnvilUpdateEvent event) {
        ItemStack leftStack = event.getLeft();
        ItemStack rightStack = event.getRight();

        if (leftStack.getItem() instanceof ParagliderItem && rightStack.getItem() == ModItems.COPPER_FILAMENT.get()) {
            ItemStack copiedStack = leftStack.copy();
            ParagliderItem.setCopper(copiedStack, true);
            event.setCost(5);
            event.setOutput(copiedStack);

            if (event.getPlayer() instanceof ServerPlayer serverPlayer) {
                TriggerManager.COPPER_MODDER.trigger(serverPlayer);
            }
        }
    }

    @SubscribeEvent
    public static void onPlayerStruck(EntityStruckByLightningEvent event) {
        Entity struckEntity = event.getEntity();
        if (struckEntity instanceof ServerPlayer player) {
            ItemStack chestItem = player.getItemBySlot(EquipmentSlot.CHEST);
            boolean hasCopperMod = ParagliderItem.hasCopperMod(chestItem);
            boolean isGliding = GliderUtil.isGlidingWithActiveGlider(player);
            if (hasCopperMod && isGliding) {
                ParagliderItem.setStruck(chestItem, true);
                if (ParagliderItem.hasBeenStruck(chestItem)) {
                    player.hurt(ModDamageSource.LIGHTNING_GLIDER, 2F);
                    TriggerManager.GLIDER_LIGHTNING.trigger(player);
                }
            }
        }
    }

    @Override
    public EventResult livingEntityHurt(LivingEntity entity, DamageSource damageSource, float amount) {
        if (entity instanceof Player player) {
            ItemStack chestItem = player.getItemBySlot(EquipmentSlot.CHEST);
            boolean hasCopperMod = ParagliderItem.hasCopperMod(chestItem);
            boolean isGliding = GliderUtil.isGlidingWithActiveGlider(player);
            boolean isLightning = damageSource == DamageSource.LIGHTNING_BOLT;
            if (hasCopperMod && isGliding && isLightning) {
                return EventResult.cancel();
            }
        }
        return EventResult.pass();
    }

    @SubscribeEvent
    public static void onAttachCapabilities(AttachCapabilitiesEvent<Entity> event) {
        if (event.getObject() instanceof Player player) {
            event.addCapability(ModConstants.CAPABILITY_ID, new ICapabilitySerializable<CompoundTag>() {
                final ModCapability cap = new ModCapability(player);
                final LazyOptional<ICap> capInstance = LazyOptional.of(() -> cap);

                @Nonnull
                @Override
                public <T> LazyOptional<T> getCapability(@Nonnull Capability<T> cap, @javax.annotation.Nullable Direction side) {
                    return cap == ModCapability.CAPABILITY ? (LazyOptional<T>) capInstance : LazyOptional.empty();
                }

                @Override
                public CompoundTag serializeNBT() {
                    return cap.serializeNBT();
                }

                @Override
                public void deserializeNBT(CompoundTag nbt) {
                    cap.deserializeNBT(nbt);
                }
            });
        }
    }

    @SubscribeEvent
    public static void onTrackPlayer(PlayerEvent.StartTracking startTracking) {
        ModCapability.get(startTracking.getEntity()).ifPresent(ICap::sync);
    }

    @SubscribeEvent
    public static void living(LivingEvent.LivingTickEvent event) {
        if(event.getEntity() instanceof Player player){
            ModCapability.get(player).ifPresent(iCap -> iCap.tick(player));
        }
    }

    @SubscribeEvent
    public static void onUseItem(LivingEntityUseItemEvent useItemEvent) {
        if (GliderUtil.isGlidingWithActiveGlider(useItemEvent.getEntity())) {
            useItemEvent.setCanceled(true);
        }
    }

    @SubscribeEvent
    public static void onAttack(LivingAttackEvent attackEvent) {
        if (attackEvent.getSource().getEntity() instanceof LivingEntity livingEntity)
            if (GliderUtil.isGlidingWithActiveGlider(livingEntity)) {
                attackEvent.setCanceled(true);
            }
    }
}