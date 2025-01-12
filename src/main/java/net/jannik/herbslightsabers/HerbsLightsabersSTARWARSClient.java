package net.jannik.herbslightsabers;

import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.blockrenderlayer.v1.BlockRenderLayerMap;
import net.jannik.herbslightsabers.block.ModBlocks;
import net.minecraft.client.render.RenderLayer;

public class HerbsLightsabersSTARWARSClient implements ClientModInitializer {
    @Override
    public void onInitializeClient() {
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.THIN_ROUND_SNOW_LAYER, RenderLayer.getTranslucent());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.THIN_BRICK_SNOW_LAYER, RenderLayer.getTranslucent());
    }
}
