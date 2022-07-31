package mc.craig.software.notnotyet.client.models;

import mc.craig.software.notnotyet.NoNotYet;
import mc.craig.software.notnotyet.common.entities.StalkerEntity;
import net.minecraft.client.model.geom.ModelLayerLocation;
import net.minecraft.resources.ResourceLocation;
import net.minecraftforge.client.event.EntityRenderersEvent;

public class Models {

    public static ModelLayerLocation STALKER = new ModelLayerLocation(new ResourceLocation(NoNotYet.MODID, "model"), "stalker");

    public static void init(EntityRenderersEvent.RegisterLayerDefinitions registerLayerDefinitions) {
        registerLayerDefinitions.registerLayerDefinition(STALKER, StalkerModel::getModelData);
    }

}