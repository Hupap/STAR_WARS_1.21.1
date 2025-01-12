package net.jannik.herbslightsabers.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.jannik.herbslightsabers.block.ModBlocks;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.registry.tag.BlockTags;

import java.util.concurrent.CompletableFuture;

public class ModBlockTagProvider extends FabricTagProvider.BlockTagProvider {
    public ModBlockTagProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> registriesFuture) {
        super(output, registriesFuture);
    }

    @Override
    protected void configure(RegistryWrapper.WrapperLookup wrapperLookup) {
        getOrCreateTagBuilder(BlockTags.PICKAXE_MINEABLE)
                .add(ModBlocks.CHISELED_DARK_FORCESTONE)
                .add(ModBlocks.DARK_FORCESTONE_BRICKS)
                .add(ModBlocks.DARK_FORCESTONE)
                .add(ModBlocks.POLISHED_DARK_FORCESTONE)
                .add(ModBlocks.CHISELED_DARK_FORCESTONE_BRICKS)
                .add(ModBlocks.DARK_FORCESTONE_AUREBESH_BLOCK)
                .add(ModBlocks.DARK_FORCESTONE_AUREBESH_BLOCK2)
                .add(ModBlocks.DARK_FORCESTONE_AUREBESH_BLOCK3)
                .add(ModBlocks.DARK_FORCESTONE_AUREBESH_BLOCK4)
                .add(ModBlocks.DARK_FORCESTONE_AUREBESH_BLOCK5)
                .add(ModBlocks.DARK_FORCESTONE_STAIRS)
                .add(ModBlocks.DARK_FORCESTONE_BRICK_STAIRS)
                .add(ModBlocks.POLISHED_DARK_FORCESTONE_STAIRS)
                .add(ModBlocks.DARK_FORCESTONE_SLAB)
                .add(ModBlocks.DARK_FORCESTONE_BRICK_SLAB)
                .add(ModBlocks.POLISHED_DARK_FORCESTONE_SLAB)
                .add(ModBlocks.DARK_FORCESTONE_WALL)
                .add(ModBlocks.DARK_FORCESTONE_BRICK_WALL)
                .add(ModBlocks.POLISHED_DARK_FORCESTONE_WALL)
                .add(ModBlocks.DARK_FORCESTONE_BUTTON)
                .add(ModBlocks.DARK_FORCESTONE_PRESSURE_PLATE);

        getOrCreateTagBuilder(BlockTags.NEEDS_DIAMOND_TOOL)
                .add(ModBlocks.CHISELED_DARK_FORCESTONE)
                .add(ModBlocks.DARK_FORCESTONE_BRICKS)
                .add(ModBlocks.DARK_FORCESTONE)
                .add(ModBlocks.POLISHED_DARK_FORCESTONE)
                .add(ModBlocks.CHISELED_DARK_FORCESTONE_BRICKS)
                .add(ModBlocks.DARK_FORCESTONE_AUREBESH_BLOCK)
                .add(ModBlocks.DARK_FORCESTONE_AUREBESH_BLOCK2)
                .add(ModBlocks.DARK_FORCESTONE_AUREBESH_BLOCK3)
                .add(ModBlocks.DARK_FORCESTONE_AUREBESH_BLOCK4)
                .add(ModBlocks.DARK_FORCESTONE_AUREBESH_BLOCK5)
                .add(ModBlocks.DARK_FORCESTONE_STAIRS)
                .add(ModBlocks.DARK_FORCESTONE_BRICK_STAIRS)
                .add(ModBlocks.POLISHED_DARK_FORCESTONE_STAIRS)
                .add(ModBlocks.DARK_FORCESTONE_SLAB)
                .add(ModBlocks.DARK_FORCESTONE_BRICK_SLAB)
                .add(ModBlocks.POLISHED_DARK_FORCESTONE_SLAB)
                .add(ModBlocks.DARK_FORCESTONE_WALL)
                .add(ModBlocks.DARK_FORCESTONE_BRICK_WALL)
                .add(ModBlocks.POLISHED_DARK_FORCESTONE_WALL)
                .add(ModBlocks.DARK_FORCESTONE_BUTTON)
                .add(ModBlocks.DARK_FORCESTONE_PRESSURE_PLATE);


        getOrCreateTagBuilder(BlockTags.WALLS)
                .add(ModBlocks.DARK_FORCESTONE_WALL)
                .add(ModBlocks.DARK_FORCESTONE_BRICK_WALL)
                .add(ModBlocks.POLISHED_DARK_FORCESTONE_WALL);
    }
}
