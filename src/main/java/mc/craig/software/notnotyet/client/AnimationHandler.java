package mc.craig.software.notnotyet.client;

import mc.craig.software.notnotyet.util.GliderUtil;
import net.minecraft.client.model.HumanoidModel;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.player.Player;

public class AnimationHandler {
    public static void setupAnim(LivingEntity livingEntity, HumanoidModel<LivingEntity> bipedModel, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
        if (livingEntity.getType() != EntityType.PLAYER) return;
        Player player = (Player) livingEntity;

        if (GliderUtil.isGliding(livingEntity)) {
            if (player.getAbilities().flying) {
                return;
            }

            double offset = Math.cos(player.tickCount * 0.1F) * -1.5F;

            bipedModel.leftArm.xRot = 0;
            bipedModel.rightArm.xRot = 0;
            bipedModel.leftArm.yRot = 0;
            bipedModel.rightArm.yRot = 0;

            bipedModel.leftArm.zRot = (float) Math.toRadians(-165);
            bipedModel.rightArm.zRot = (float) Math.toRadians(165);

            bipedModel.leftLeg.xRot = (float) Math.toRadians(20);
            bipedModel.rightLeg.xRot = (float) Math.toRadians(20);

            bipedModel.leftLeg.yRot = (float) Math.toRadians(0);
            bipedModel.rightLeg.yRot = (float) Math.toRadians(0);

            bipedModel.leftLeg.zRot = (float) Math.toRadians(-5 + (offset * 2));
            bipedModel.rightLeg.zRot = (float) Math.toRadians(5 + (-offset * 2));

        }
    }
}
