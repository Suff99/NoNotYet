package mc.craig.software.notnotyet.client;

import net.minecraft.client.animation.AnimationChannel;
import net.minecraft.client.animation.AnimationDefinition;
import net.minecraft.client.animation.Keyframe;
import net.minecraft.client.animation.KeyframeAnimations;

public class Animations {




    public static final AnimationDefinition GLIDING = AnimationDefinition.Builder.withLength(26.791666666666668f).addAnimation("Head", new AnimationChannel(AnimationChannel.Targets.POSITION, new Keyframe(0.041666666666666664f, KeyframeAnimations.posVec(0f, 0f, 0f), AnimationChannel.Interpolations.CATMULLROM), new Keyframe(0.2916666666666667f, KeyframeAnimations.posVec(0f, -1f, 0f), AnimationChannel.Interpolations.CATMULLROM), new Keyframe(1f, KeyframeAnimations.posVec(0f, 0f, 0f), AnimationChannel.Interpolations.CATMULLROM), new Keyframe(26.791666666666668f, KeyframeAnimations.posVec(0f, 0f, 0f), AnimationChannel.Interpolations.CATMULLROM))).addAnimation("Head", new AnimationChannel(AnimationChannel.Targets.ROTATION, new Keyframe(0.08333333333333333f, KeyframeAnimations.degreeVec(-5f, 0f, 0f), AnimationChannel.Interpolations.CATMULLROM), new Keyframe(0.5f, KeyframeAnimations.degreeVec(-23.07f, 0f, 0f), AnimationChannel.Interpolations.CATMULLROM), new Keyframe(0.7083333333333334f, KeyframeAnimations.degreeVec(-8.69f, 0f, 0f), AnimationChannel.Interpolations.CATMULLROM), new Keyframe(1f, KeyframeAnimations.degreeVec(34.93f, 0f, 0f), AnimationChannel.Interpolations.CATMULLROM), new Keyframe(1.5416666666666667f, KeyframeAnimations.degreeVec(-15f, 0f, 0f), AnimationChannel.Interpolations.CATMULLROM), new Keyframe(2.5833333333333335f, KeyframeAnimations.degreeVec(7.8f, 0f, 0f), AnimationChannel.Interpolations.CATMULLROM), new Keyframe(5.291666666666667f, KeyframeAnimations.degreeVec(7.5f, 0f, 0f), AnimationChannel.Interpolations.CATMULLROM), new Keyframe(9.041666666666666f, KeyframeAnimations.degreeVec(0f, 0f, 0f), AnimationChannel.Interpolations.CATMULLROM), new Keyframe(13.958333333333334f, KeyframeAnimations.degreeVec(7.5f, 0f, 0f), AnimationChannel.Interpolations.CATMULLROM), new Keyframe(18.208333333333332f, KeyframeAnimations.degreeVec(0f, 0f, 0f), AnimationChannel.Interpolations.CATMULLROM), new Keyframe(21.208333333333332f, KeyframeAnimations.degreeVec(7.5f, 0f, 0f), AnimationChannel.Interpolations.CATMULLROM), new Keyframe(25.708333333333332f, KeyframeAnimations.degreeVec(0f, 0f, 0f), AnimationChannel.Interpolations.CATMULLROM), new Keyframe(26.791666666666668f, KeyframeAnimations.degreeVec(0f, 0f, 0f), AnimationChannel.Interpolations.CATMULLROM))).addAnimation("Head", new AnimationChannel(AnimationChannel.Targets.SCALE, new Keyframe(26.791666666666668f, KeyframeAnimations.scaleVec(1f, 1f, 1f), AnimationChannel.Interpolations.LINEAR))).addAnimation("Body", new AnimationChannel(AnimationChannel.Targets.POSITION, new Keyframe(0.041666666666666664f, KeyframeAnimations.posVec(0f, 0f, 0f), AnimationChannel.Interpolations.CATMULLROM), new Keyframe(0.2916666666666667f, KeyframeAnimations.posVec(0f, -1f, 0f), AnimationChannel.Interpolations.CATMULLROM), new Keyframe(0.7083333333333334f, KeyframeAnimations.posVec(0f, 0f, 0f), AnimationChannel.Interpolations.CATMULLROM), new Keyframe(1.0416666666666667f, KeyframeAnimations.posVec(0f, 0f, -1f), AnimationChannel.Interpolations.CATMULLROM), new Keyframe(26.791666666666668f, KeyframeAnimations.posVec(0f, 0f, -1f), AnimationChannel.Interpolations.CATMULLROM))).addAnimation("Body", new AnimationChannel(AnimationChannel.Targets.ROTATION, new Keyframe(0.041666666666666664f, KeyframeAnimations.degreeVec(-5f, 0f, 0f), AnimationChannel.Interpolations.CATMULLROM), new Keyframe(0.16666666666666666f, KeyframeAnimations.degreeVec(-42.5f, 0f, 0f), AnimationChannel.Interpolations.CATMULLROM), new Keyframe(0.5416666666666666f, KeyframeAnimations.degreeVec(-77.5f, 0f, 0f), AnimationChannel.Interpolations.CATMULLROM), new Keyframe(1f, KeyframeAnimations.degreeVec(31.409999999999997f, 0f, 0f), AnimationChannel.Interpolations.CATMULLROM), new Keyframe(1.5833333333333333f, KeyframeAnimations.degreeVec(-10f, 0f, 0f), AnimationChannel.Interpolations.CATMULLROM), new Keyframe(2.375f, KeyframeAnimations.degreeVec(10f, 0f, 0f), AnimationChannel.Interpolations.CATMULLROM), new Keyframe(3.0833333333333335f, KeyframeAnimations.degreeVec(-5f, 0f, 0f), AnimationChannel.Interpolations.CATMULLROM), new Keyframe(4.25f, KeyframeAnimations.degreeVec(0f, 0f, 0f), AnimationChannel.Interpolations.CATMULLROM), new Keyframe(7.375f, KeyframeAnimations.degreeVec(-5f, 0f, 0f), AnimationChannel.Interpolations.CATMULLROM), new Keyframe(12f, KeyframeAnimations.degreeVec(0f, 0f, 0f), AnimationChannel.Interpolations.CATMULLROM), new Keyframe(16f, KeyframeAnimations.degreeVec(-5f, 0f, 0f), AnimationChannel.Interpolations.CATMULLROM), new Keyframe(19.291666666666668f, KeyframeAnimations.degreeVec(0f, 0f, 0f), AnimationChannel.Interpolations.CATMULLROM), new Keyframe(23.125f, KeyframeAnimations.degreeVec(-5f, 0f, 0f), AnimationChannel.Interpolations.CATMULLROM), new Keyframe(26.791666666666668f, KeyframeAnimations.degreeVec(0f, 0f, 0f), AnimationChannel.Interpolations.CATMULLROM))).addAnimation("Body", new AnimationChannel(AnimationChannel.Targets.SCALE, new Keyframe(26.791666666666668f, KeyframeAnimations.scaleVec(1f, 1f, 1f), AnimationChannel.Interpolations.LINEAR))).addAnimation("RightArm", new AnimationChannel(AnimationChannel.Targets.POSITION, new Keyframe(26.791666666666668f, KeyframeAnimations.posVec(0f, 0f, 0f), AnimationChannel.Interpolations.LINEAR))).addAnimation("RightArm", new AnimationChannel(AnimationChannel.Targets.ROTATION, new Keyframe(0f, KeyframeAnimations.degreeVec(-27.5f, 0f, 112.5f), AnimationChannel.Interpolations.CATMULLROM), new Keyframe(0.125f, KeyframeAnimations.degreeVec(0f, 0f, 165f), AnimationChannel.Interpolations.CATMULLROM), new Keyframe(0.5416666666666666f, KeyframeAnimations.degreeVec(0f, 0f, 162.5f), AnimationChannel.Interpolations.CATMULLROM), new Keyframe(1f, KeyframeAnimations.degreeVec(0f, 0f, 165f), AnimationChannel.Interpolations.CATMULLROM), new Keyframe(26.791666666666668f, KeyframeAnimations.degreeVec(0f, 0f, 165f), AnimationChannel.Interpolations.CATMULLROM))).addAnimation("RightArm", new AnimationChannel(AnimationChannel.Targets.SCALE, new Keyframe(26.791666666666668f, KeyframeAnimations.scaleVec(1f, 1f, 1f), AnimationChannel.Interpolations.LINEAR))).addAnimation("LeftArm", new AnimationChannel(AnimationChannel.Targets.POSITION, new Keyframe(26.791666666666668f, KeyframeAnimations.posVec(0f, 0f, 0f), AnimationChannel.Interpolations.LINEAR))).addAnimation("LeftArm", new AnimationChannel(AnimationChannel.Targets.ROTATION, new Keyframe(0f, KeyframeAnimations.degreeVec(-19.842303908053964f, 2.5586821924989636f, -112.94760707065143f), AnimationChannel.Interpolations.CATMULLROM), new Keyframe(0.125f, KeyframeAnimations.degreeVec(0f, 0f, -165f), AnimationChannel.Interpolations.CATMULLROM), new Keyframe(0.5416666666666666f, KeyframeAnimations.degreeVec(0f, 0f, -162.5f), AnimationChannel.Interpolations.CATMULLROM), new Keyframe(1f, KeyframeAnimations.degreeVec(0f, 0f, -165f), AnimationChannel.Interpolations.CATMULLROM), new Keyframe(26.791666666666668f, KeyframeAnimations.degreeVec(0f, 0f, -165f), AnimationChannel.Interpolations.CATMULLROM))).addAnimation("LeftArm", new AnimationChannel(AnimationChannel.Targets.SCALE, new Keyframe(26.791666666666668f, KeyframeAnimations.scaleVec(1f, 1f, 1f), AnimationChannel.Interpolations.LINEAR))).addAnimation("RightLeg", new AnimationChannel(AnimationChannel.Targets.POSITION, new Keyframe(0f, KeyframeAnimations.posVec(0f, 0f, -1f), AnimationChannel.Interpolations.CATMULLROM), new Keyframe(0.041666666666666664f, KeyframeAnimations.posVec(0f, 0f, -1f), AnimationChannel.Interpolations.CATMULLROM), new Keyframe(0.08333333333333333f, KeyframeAnimations.posVec(0f, 0.53f, -2.95f), AnimationChannel.Interpolations.CATMULLROM), new Keyframe(0.125f, KeyframeAnimations.posVec(0f, 1f, -5.7f), AnimationChannel.Interpolations.CATMULLROM), new Keyframe(0.16666666666666666f, KeyframeAnimations.posVec(0f, 2.4f, -7.870000000000001f), AnimationChannel.Interpolations.CATMULLROM), new Keyframe(0.4583333333333333f, KeyframeAnimations.posVec(0f, 9.12f, -11.6f), AnimationChannel.Interpolations.CATMULLROM), new Keyframe(0.5f, KeyframeAnimations.posVec(0f, 9.42f, -11.72f), AnimationChannel.Interpolations.CATMULLROM), new Keyframe(0.5416666666666666f, KeyframeAnimations.posVec(0f, 9f, -11.75f), AnimationChannel.Interpolations.CATMULLROM), new Keyframe(0.625f, KeyframeAnimations.posVec(0f, 7.0600000000000005f, -10.85f), AnimationChannel.Interpolations.CATMULLROM), new Keyframe(0.75f, KeyframeAnimations.posVec(0f, 1.4800000000000004f, -5.71f), AnimationChannel.Interpolations.CATMULLROM), new Keyframe(0.875f, KeyframeAnimations.posVec(0f, 0.5f, 1.3599999999999999f), AnimationChannel.Interpolations.CATMULLROM), new Keyframe(1f, KeyframeAnimations.posVec(0f, 1.7f, 5.4f), AnimationChannel.Interpolations.CATMULLROM), new Keyframe(1.0416666666666667f, KeyframeAnimations.posVec(0f, 1.8f, 5.66f), AnimationChannel.Interpolations.CATMULLROM), new Keyframe(1.125f, KeyframeAnimations.posVec(0f, 1.81f, 5.06f), AnimationChannel.Interpolations.CATMULLROM), new Keyframe(1.3333333333333333f, KeyframeAnimations.posVec(0f, 0.3700000000000001f, 1.24f), AnimationChannel.Interpolations.CATMULLROM), new Keyframe(1.5833333333333333f, KeyframeAnimations.posVec(0f, 0.25f, -3f), AnimationChannel.Interpolations.CATMULLROM), new Keyframe(2.375f, KeyframeAnimations.posVec(0f, 0.25f, 1f), AnimationChannel.Interpolations.CATMULLROM), new Keyframe(3.0833333333333335f, KeyframeAnimations.posVec(0f, 0.25f, -2f), AnimationChannel.Interpolations.CATMULLROM), new Keyframe(4.375f, KeyframeAnimations.posVec(0f, 0.25f, -1f), AnimationChannel.Interpolations.CATMULLROM), new Keyframe(7.375f, KeyframeAnimations.posVec(0f, 0.25f, -2f), AnimationChannel.Interpolations.CATMULLROM), new Keyframe(12f, KeyframeAnimations.posVec(0f, 0.25f, -1f), AnimationChannel.Interpolations.CATMULLROM), new Keyframe(16f, KeyframeAnimations.posVec(0f, 0.25f, -2f), AnimationChannel.Interpolations.CATMULLROM), new Keyframe(19.291666666666668f, KeyframeAnimations.posVec(0f, 0.25f, -1f), AnimationChannel.Interpolations.CATMULLROM), new Keyframe(23.083333333333332f, KeyframeAnimations.posVec(0f, 0.25f, -2f), AnimationChannel.Interpolations.CATMULLROM), new Keyframe(26.791666666666668f, KeyframeAnimations.posVec(0f, 0.25f, -1f), AnimationChannel.Interpolations.CATMULLROM))).addAnimation("RightLeg", new AnimationChannel(AnimationChannel.Targets.ROTATION, new Keyframe(0f, KeyframeAnimations.degreeVec(5f, 0f, 0f), AnimationChannel.Interpolations.CATMULLROM), new Keyframe(0.08333333333333333f, KeyframeAnimations.degreeVec(5f, 0f, 0f), AnimationChannel.Interpolations.CATMULLROM), new Keyframe(0.4583333333333333f, KeyframeAnimations.degreeVec(-110f, 0f, 0f), AnimationChannel.Interpolations.CATMULLROM), new Keyframe(1.0416666666666667f, KeyframeAnimations.degreeVec(42.42f, 0f, 0f), AnimationChannel.Interpolations.CATMULLROM), new Keyframe(1.25f, KeyframeAnimations.degreeVec(27.5f, 0f, 0f), AnimationChannel.Interpolations.CATMULLROM), new Keyframe(1.375f, KeyframeAnimations.degreeVec(22.5f, 0f, 0f), AnimationChannel.Interpolations.CATMULLROM), new Keyframe(1.5833333333333333f, KeyframeAnimations.degreeVec(-20f, 0f, 0f), AnimationChannel.Interpolations.CATMULLROM), new Keyframe(2.1666666666666665f, KeyframeAnimations.degreeVec(10f, 0f, 0f), AnimationChannel.Interpolations.CATMULLROM), new Keyframe(2.9583333333333335f, KeyframeAnimations.degreeVec(-2.5f, 0f, 0f), AnimationChannel.Interpolations.CATMULLROM), new Keyframe(4.375f, KeyframeAnimations.degreeVec(10f, 0f, 0f), AnimationChannel.Interpolations.CATMULLROM), new Keyframe(7.375f, KeyframeAnimations.degreeVec(-5f, 0f, 0f), AnimationChannel.Interpolations.CATMULLROM), new Keyframe(12f, KeyframeAnimations.degreeVec(2.5f, 0f, 0f), AnimationChannel.Interpolations.CATMULLROM), new Keyframe(16f, KeyframeAnimations.degreeVec(-12.5f, 0f, 0f), AnimationChannel.Interpolations.CATMULLROM), new Keyframe(19.291666666666668f, KeyframeAnimations.degreeVec(2.5f, 0f, 0f), AnimationChannel.Interpolations.CATMULLROM), new Keyframe(23.125f, KeyframeAnimations.degreeVec(5f, 0f, 0f), AnimationChannel.Interpolations.CATMULLROM), new Keyframe(26.791666666666668f, KeyframeAnimations.degreeVec(2.5f, 0f, 0f), AnimationChannel.Interpolations.CATMULLROM))).addAnimation("RightLeg", new AnimationChannel(AnimationChannel.Targets.SCALE, new Keyframe(0f, KeyframeAnimations.scaleVec(1f, 1f, 1f), AnimationChannel.Interpolations.LINEAR), new Keyframe(26.791666666666668f, KeyframeAnimations.scaleVec(1f, 1f, 1f), AnimationChannel.Interpolations.LINEAR))).addAnimation("LeftLeg", new AnimationChannel(AnimationChannel.Targets.POSITION, new Keyframe(0f, KeyframeAnimations.posVec(0f, 0f, -1f), AnimationChannel.Interpolations.CATMULLROM), new Keyframe(0.041666666666666664f, KeyframeAnimations.posVec(0f, 0f, -1f), AnimationChannel.Interpolations.CATMULLROM), new Keyframe(0.08333333333333333f, KeyframeAnimations.posVec(0f, 0.6f, -3f), AnimationChannel.Interpolations.CATMULLROM), new Keyframe(0.125f, KeyframeAnimations.posVec(0f, 1.34f, -5.71f), AnimationChannel.Interpolations.CATMULLROM), new Keyframe(0.16666666666666666f, KeyframeAnimations.posVec(0f, 2.7f, -7.9f), AnimationChannel.Interpolations.CATMULLROM), new Keyframe(0.4583333333333333f, KeyframeAnimations.posVec(0f, 9.12f, -11.6f), AnimationChannel.Interpolations.CATMULLROM), new Keyframe(0.5f, KeyframeAnimations.posVec(0f, 9.42f, -11.72f), AnimationChannel.Interpolations.CATMULLROM), new Keyframe(0.5416666666666666f, KeyframeAnimations.posVec(0f, 9f, -11.75f), AnimationChannel.Interpolations.CATMULLROM), new Keyframe(0.625f, KeyframeAnimations.posVec(0f, 7.0600000000000005f, -10.85f), AnimationChannel.Interpolations.CATMULLROM), new Keyframe(0.75f, KeyframeAnimations.posVec(0f, 1.4800000000000004f, -5.71f), AnimationChannel.Interpolations.CATMULLROM), new Keyframe(0.875f, KeyframeAnimations.posVec(0f, 0.5f, 1.3599999999999999f), AnimationChannel.Interpolations.CATMULLROM), new Keyframe(1f, KeyframeAnimations.posVec(0f, 2f, 5.25f), AnimationChannel.Interpolations.CATMULLROM), new Keyframe(1.125f, KeyframeAnimations.posVec(0f, 1.81f, 5.06f), AnimationChannel.Interpolations.CATMULLROM), new Keyframe(1.3333333333333333f, KeyframeAnimations.posVec(0f, 0.3700000000000001f, 1.24f), AnimationChannel.Interpolations.CATMULLROM), new Keyframe(1.4583333333333333f, KeyframeAnimations.posVec(0f, 0.22f, -1.37f), AnimationChannel.Interpolations.CATMULLROM), new Keyframe(1.5833333333333333f, KeyframeAnimations.posVec(0f, 0.25f, -3f), AnimationChannel.Interpolations.CATMULLROM), new Keyframe(1.875f, KeyframeAnimations.posVec(0f, 0.25f, -2.09f), AnimationChannel.Interpolations.CATMULLROM), new Keyframe(2.375f, KeyframeAnimations.posVec(0f, 0.25f, 1.1f), AnimationChannel.Interpolations.CATMULLROM), new Keyframe(3.0833333333333335f, KeyframeAnimations.posVec(0f, 0.25f, -2f), AnimationChannel.Interpolations.CATMULLROM), new Keyframe(4.375f, KeyframeAnimations.posVec(0f, 0.25f, -1f), AnimationChannel.Interpolations.CATMULLROM), new Keyframe(7.375f, KeyframeAnimations.posVec(0f, 0.25f, -2f), AnimationChannel.Interpolations.CATMULLROM), new Keyframe(12f, KeyframeAnimations.posVec(0f, 0.25f, -1f), AnimationChannel.Interpolations.CATMULLROM), new Keyframe(16f, KeyframeAnimations.posVec(0f, 0.25f, -2f), AnimationChannel.Interpolations.CATMULLROM), new Keyframe(19.291666666666668f, KeyframeAnimations.posVec(0f, 0.25f, -1f), AnimationChannel.Interpolations.CATMULLROM), new Keyframe(23.083333333333332f, KeyframeAnimations.posVec(0f, 0.25f, -2f), AnimationChannel.Interpolations.CATMULLROM), new Keyframe(26.791666666666668f, KeyframeAnimations.posVec(0f, 0.25f, -1f), AnimationChannel.Interpolations.CATMULLROM))).addAnimation("LeftLeg", new AnimationChannel(AnimationChannel.Targets.ROTATION, new Keyframe(0f, KeyframeAnimations.degreeVec(2.5f, -0.11f, 0f), AnimationChannel.Interpolations.CATMULLROM), new Keyframe(0.041666666666666664f, KeyframeAnimations.degreeVec(2.497623568589006f, -0.10901393533140435f, -0.0023764314109939733f), AnimationChannel.Interpolations.CATMULLROM), new Keyframe(0.16666666666666666f, KeyframeAnimations.degreeVec(-41.008996674730284f, -0.08906691575779405f, -0.4593835659456636f), AnimationChannel.Interpolations.CATMULLROM), new Keyframe(0.4583333333333333f, KeyframeAnimations.degreeVec(-125f, 0f, -2.5f), AnimationChannel.Interpolations.CATMULLROM), new Keyframe(0.8333333333333334f, KeyframeAnimations.degreeVec(57.5f, 0f, -2.5f), AnimationChannel.Interpolations.CATMULLROM), new Keyframe(1.125f, KeyframeAnimations.degreeVec(45.74194947288561f, 0f, -2.5f), AnimationChannel.Interpolations.CATMULLROM), new Keyframe(1.5833333333333333f, KeyframeAnimations.degreeVec(-29.25805052711417f, 0f, -2.5f), AnimationChannel.Interpolations.CATMULLROM), new Keyframe(2.1666666666666665f, KeyframeAnimations.degreeVec(15.741949472885828f, 0f, -2.5f), AnimationChannel.Interpolations.CATMULLROM), new Keyframe(2.9583333333333335f, KeyframeAnimations.degreeVec(-6.7580505271141735f, 0f, -2.5f), AnimationChannel.Interpolations.CATMULLROM), new Keyframe(4.375f, KeyframeAnimations.degreeVec(5.7419494728858265f, 0f, -2.5f), AnimationChannel.Interpolations.CATMULLROM), new Keyframe(7.375f, KeyframeAnimations.degreeVec(-1.7580505271141735f, 0f, -2.5f), AnimationChannel.Interpolations.CATMULLROM), new Keyframe(12f, KeyframeAnimations.degreeVec(-4.2580505271141735f, 0f, -2.5f), AnimationChannel.Interpolations.CATMULLROM), new Keyframe(16f, KeyframeAnimations.degreeVec(8.241949472885826f, 0f, -2.5f), AnimationChannel.Interpolations.CATMULLROM), new Keyframe(19.291666666666668f, KeyframeAnimations.degreeVec(5.83250518957364f, 0f, -2.5f), AnimationChannel.Interpolations.CATMULLROM), new Keyframe(23.125f, KeyframeAnimations.degreeVec(-6.758050527114172f, 0f, -2.5f), AnimationChannel.Interpolations.CATMULLROM), new Keyframe(26.791666666666668f, KeyframeAnimations.degreeVec(8.241949472885826f, 0f, -2.5f), AnimationChannel.Interpolations.CATMULLROM))).addAnimation("LeftLeg", new AnimationChannel(AnimationChannel.Targets.SCALE, new Keyframe(0f, KeyframeAnimations.scaleVec(1f, 1f, 1f), AnimationChannel.Interpolations.LINEAR), new Keyframe(26.791666666666668f, KeyframeAnimations.scaleVec(1f, 1f, 1f), AnimationChannel.Interpolations.LINEAR))).build();
}