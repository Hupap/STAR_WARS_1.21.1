package net.jannik.herbslightsabers.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricModelProvider;
import net.jannik.herbslightsabers.block.ModBlocks;
import net.jannik.herbslightsabers.block.custom.*;
import net.jannik.herbslightsabers.item.ModItems;
import net.minecraft.block.Block;
import net.minecraft.data.client.*;
import net.minecraft.util.Identifier;

public class ModModelProvider extends FabricModelProvider {
    public ModModelProvider(FabricDataOutput output) {
        super(output);
    }


    @Override
    public void generateBlockStateModels(BlockStateModelGenerator blockStateModelGenerator) {
        BlockStateModelGenerator.BlockTexturePool darkForcestonePool = blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.DARK_FORCESTONE);
        BlockStateModelGenerator.BlockTexturePool darkForcestoneBricksPool = blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.DARK_FORCESTONE_BRICKS);
        BlockStateModelGenerator.BlockTexturePool polishedDarkForcestonePool = blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.POLISHED_DARK_FORCESTONE);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.CHISELED_DARK_FORCESTONE);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.CHISELED_DARK_FORCESTONE_BRICKS);
        blockStateModelGenerator.registerWallPlant(ModBlocks.THIN_ROUND_SNOW_LAYER);
        blockStateModelGenerator.registerWallPlant(ModBlocks.THIN_BRICK_SNOW_LAYER);
        darkForcestonePool.stairs(ModBlocks.DARK_FORCESTONE_STAIRS);
        darkForcestonePool.slab(ModBlocks.DARK_FORCESTONE_SLAB);
        darkForcestonePool.wall(ModBlocks.DARK_FORCESTONE_WALL);
        darkForcestoneBricksPool.stairs(ModBlocks.DARK_FORCESTONE_BRICK_STAIRS);
        darkForcestoneBricksPool.slab(ModBlocks.DARK_FORCESTONE_BRICK_SLAB);
        darkForcestoneBricksPool.wall(ModBlocks.DARK_FORCESTONE_BRICK_WALL);
        polishedDarkForcestonePool.stairs(ModBlocks.POLISHED_DARK_FORCESTONE_STAIRS);
        polishedDarkForcestonePool.slab(ModBlocks.POLISHED_DARK_FORCESTONE_SLAB);
        polishedDarkForcestonePool.wall(ModBlocks.POLISHED_DARK_FORCESTONE_WALL);

        darkForcestonePool.button(ModBlocks.DARK_FORCESTONE_BUTTON);
        darkForcestonePool.pressurePlate(ModBlocks.DARK_FORCESTONE_PRESSURE_PLATE);
    }

    @Override
    public void generateItemModels(ItemModelGenerator itemModelGenerator) {
        itemModelGenerator.register(ModItems.CHISEL, Models.GENERATED);
        itemModelGenerator.register(ModItems.PINK_GARNET, Models.GENERATED);
    }
}
