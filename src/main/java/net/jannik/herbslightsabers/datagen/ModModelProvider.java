package net.jannik.herbslightsabers.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricModelProvider;
import net.jannik.herbslightsabers.block.ModBlocks;
import net.jannik.herbslightsabers.item.ModItems;
import net.minecraft.data.client.BlockStateModelGenerator;
import net.minecraft.data.client.ItemModelGenerator;
import net.minecraft.data.client.Models;

public class ModModelProvider extends FabricModelProvider {
    public ModModelProvider(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generateBlockStateModels(BlockStateModelGenerator blockStateModelGenerator) {
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.DARK_FORCESTONE);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.DARK_FORCESTONE_BRICKS);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.POLISHED_DARK_FORCESTONE);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.CHISELED_DARK_FORCESTONE);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.CHISELED_DARK_FORCESTONE_BRICKS);
        blockStateModelGenerator.registerWallPlant(ModBlocks.THIN_SNOW_LAYER);
    }

    @Override
    public void generateItemModels(ItemModelGenerator itemModelGenerator) {
        itemModelGenerator.register(ModItems.CHISEL, Models.GENERATED);
        itemModelGenerator.register(ModItems.PINK_GARNET, Models.GENERATED);
    }
}
