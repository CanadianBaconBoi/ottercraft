package ca.otterspace.ottercraft;

import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.fabricmc.fabric.api.client.rendering.v1.EntityRendererRegistry;
import net.minecraft.core.Registry;
import net.fabricmc.fabric.api.client.rendering.v1.EntityModelLayerRegistry;


@Environment(EnvType.CLIENT)
public class OttercraftClient implements ClientModInitializer {
    
    @Override
    public void onInitializeClient() {
        EntityRendererRegistry.register(Ottercraft.OTTER, OtterRenderer::new);
        EntityRendererRegistry.register(Ottercraft.GIANT_OTTER, GiantOtterRenderer::new);
        EntityModelLayerRegistry.registerModelLayer(Ottercraft.GIANT_OTTER_LAYER, GiantOtterModel::getTexturedModelData);
        EntityModelLayerRegistry.registerModelLayer(Ottercraft.OTTER_LAYER, OtterModel::getTexturedModelData);
    
        Registry.register(Registry.SOUND_EVENT, Ottercraft.OTTER_SQUEAK_ID, Ottercraft.OTTER_SQUEAK);
        Registry.register(Registry.SOUND_EVENT, Ottercraft.OTTER_ANGRY_ID, Ottercraft.OTTER_ANGRY);
    }
}
