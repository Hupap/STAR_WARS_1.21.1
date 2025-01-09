package net.jannik.herbslightsabers.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.jannik.herbslightsabers.block.ModBlocks;
import net.minecraft.data.server.recipe.RecipeExporter;
import net.minecraft.data.server.recipe.ShapedRecipeJsonBuilder;
import net.minecraft.item.ItemConvertible;
import net.minecraft.recipe.book.RecipeCategory;
import net.minecraft.registry.RegistryWrapper;

import java.util.List;
import java.util.concurrent.CompletableFuture;

public class ModRecipeProvider extends FabricRecipeProvider {
    public ModRecipeProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> registriesFuture) {
        super(output, registriesFuture);
    }

    @Override
    public void generate(RecipeExporter recipeExporter) {
        offerStonecuttingRecipe(recipeExporter, RecipeCategory.MISC, ModBlocks.CHISELED_DARK_FORCESTONE_BRICKS, ModBlocks.DARK_FORCESTONE_BRICKS, 1);
        offerStonecuttingRecipe(recipeExporter, RecipeCategory.MISC, ModBlocks.CHISELED_DARK_FORCESTONE_BRICKS, ModBlocks.DARK_FORCESTONE, 1);
        offerStonecuttingRecipe(recipeExporter, RecipeCategory.MISC, ModBlocks.CHISELED_DARK_FORCESTONE_BRICKS, ModBlocks.POLISHED_DARK_FORCESTONE, 1);

        offerStonecuttingRecipe(recipeExporter, RecipeCategory.MISC, ModBlocks.CHISELED_DARK_FORCESTONE, ModBlocks.DARK_FORCESTONE, 1);

        offerStonecuttingRecipe(recipeExporter, RecipeCategory.MISC, ModBlocks.DARK_FORCESTONE_BRICKS, ModBlocks.DARK_FORCESTONE, 1);
        offerStonecuttingRecipe(recipeExporter, RecipeCategory.MISC, ModBlocks.DARK_FORCESTONE_BRICKS, ModBlocks.POLISHED_DARK_FORCESTONE, 1);

        offerStonecuttingRecipe(recipeExporter, RecipeCategory.MISC, ModBlocks.POLISHED_DARK_FORCESTONE, ModBlocks.DARK_FORCESTONE, 1);
/*
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModBlocks.CHISELED_DARK_FORCESTONE)
                .pattern("#")
                .pattern("#")
                .input('#', ModBlocks.DARK_FORCESTONE_SLABS)
                .criterion(hasItem(ModBlocks.DARK_FORCESTONE_SLABS), conditionsFromItem(ModBlocks.DARK_FORCESTONE_SLABS))
                .offerTo(recipeExporter);

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModBlocks.CHISELED_DARK_FORCESTONE_BRICKS)
                .pattern("#")
                .pattern("#")
                .input('#', ModBlocks.DARK_FORCESTONE_BRICKS_SLABS)
                .criterion(hasItem(ModBlocks.DARK_FORCESTONE_BRICKS_SLABS), conditionsFromItem(ModBlocks.DARK_FORCESTONE_BRICKS_SLABS))
                .offerTo(recipeExporter);
*/
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModBlocks.DARK_FORCESTONE_BRICKS, 4)
                .pattern("##")
                .pattern("##")
                .input('#', ModBlocks.POLISHED_DARK_FORCESTONE)
                .criterion(hasItem(ModBlocks.POLISHED_DARK_FORCESTONE), conditionsFromItem(ModBlocks.POLISHED_DARK_FORCESTONE))
                .offerTo(recipeExporter);

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModBlocks.POLISHED_DARK_FORCESTONE, 4)
                .pattern("##")
                .pattern("##")
                .input('#', ModBlocks.DARK_FORCESTONE)
                .criterion(hasItem(ModBlocks.DARK_FORCESTONE), conditionsFromItem(ModBlocks.DARK_FORCESTONE))
                .offerTo(recipeExporter);


    }
}
