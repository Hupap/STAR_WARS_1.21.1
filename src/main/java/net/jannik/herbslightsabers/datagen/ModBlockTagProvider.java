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
                .add(ModBlocks.CHISELED_DARK_FORCESTONE_BRICKS);

        getOrCreateTagBuilder(BlockTags.NEEDS_DIAMOND_TOOL)
                .add(ModBlocks.CHISELED_DARK_FORCESTONE)
                .add(ModBlocks.DARK_FORCESTONE_BRICKS)
                .add(ModBlocks.DARK_FORCESTONE)
                .add(ModBlocks.POLISHED_DARK_FORCESTONE)
                .add(ModBlocks.CHISELED_DARK_FORCESTONE_BRICKS);
    }
}
