package net.jannik.herbslightsabers.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricBlockLootTableProvider;
import net.jannik.herbslightsabers.block.ModBlocks;
import net.minecraft.registry.RegistryWrapper;

import java.util.concurrent.CompletableFuture;

public class ModLootTableProvider extends FabricBlockLootTableProvider {
    public ModLootTableProvider(FabricDataOutput dataOutput, CompletableFuture<RegistryWrapper.WrapperLookup> registryLookup) {
        super(dataOutput, registryLookup);
    }

    @Override
    public void generate() {
        addDrop(ModBlocks.DARK_FORCESTONE);
        addDrop(ModBlocks.DARK_FORCESTONE_BRICKS);
        addDrop(ModBlocks.CHISELED_DARK_FORCESTONE);
        addDrop(ModBlocks.CHISELED_DARK_FORCESTONE_BRICKS);
        addDrop(ModBlocks.POLISHED_DARK_FORCESTONE);
        addDrop(ModBlocks.DARK_FORCESTONE_STAIRS);
        addDrop(ModBlocks.DARK_FORCESTONE_BRICK_STAIRS);
        addDrop(ModBlocks.POLISHED_DARK_FORCESTONE_STAIRS);
        addDrop(ModBlocks.DARK_FORCESTONE_SLAB, slabDrops(ModBlocks.DARK_FORCESTONE_SLAB));
        addDrop(ModBlocks.DARK_FORCESTONE_BRICK_SLAB, slabDrops(ModBlocks.DARK_FORCESTONE_BRICK_SLAB));
        addDrop(ModBlocks.POLISHED_DARK_FORCESTONE_SLAB, slabDrops(ModBlocks.POLISHED_DARK_FORCESTONE_SLAB));
        addDrop(ModBlocks.DARK_FORCESTONE_WALL);
        addDrop(ModBlocks.DARK_FORCESTONE_BRICK_WALL);
        addDrop(ModBlocks.POLISHED_DARK_FORCESTONE_WALL);
        addDrop(ModBlocks.DARK_FORCESTONE_AUREBESH_BLOCK);
        addDrop(ModBlocks.DARK_FORCESTONE_AUREBESH_BLOCK2);
        addDrop(ModBlocks.DARK_FORCESTONE_AUREBESH_BLOCK3);
        addDrop(ModBlocks.DARK_FORCESTONE_AUREBESH_BLOCK4);
        addDrop(ModBlocks.DARK_FORCESTONE_AUREBESH_BLOCK5);
    }
}
