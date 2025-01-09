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
    }
}
