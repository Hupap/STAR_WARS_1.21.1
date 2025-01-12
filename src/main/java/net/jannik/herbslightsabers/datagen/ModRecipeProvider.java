package net.jannik.herbslightsabers.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.jannik.herbslightsabers.block.ModBlocks;
import net.jannik.herbslightsabers.item.ModItems;
import net.minecraft.data.server.recipe.RecipeExporter;
import net.minecraft.data.server.recipe.ShapedRecipeJsonBuilder;
import net.minecraft.item.ItemConvertible;
import net.minecraft.recipe.Ingredient;
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

        offerStonecuttingRecipe(recipeExporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.CHISELED_DARK_FORCESTONE, ModBlocks.DARK_FORCESTONE, 1);

        offerStonecuttingRecipe(recipeExporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.CHISELED_DARK_FORCESTONE_BRICKS, ModBlocks.DARK_FORCESTONE, 1);
        offerStonecuttingRecipe(recipeExporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.CHISELED_DARK_FORCESTONE_BRICKS, ModBlocks.POLISHED_DARK_FORCESTONE, 1);
        offerStonecuttingRecipe(recipeExporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.CHISELED_DARK_FORCESTONE_BRICKS, ModBlocks.DARK_FORCESTONE_BRICKS, 1);

        offerStonecuttingRecipe(recipeExporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.DARK_FORCESTONE_BRICK_SLAB, ModBlocks.DARK_FORCESTONE, 2);
        offerStonecuttingRecipe(recipeExporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.DARK_FORCESTONE_BRICK_SLAB, ModBlocks.POLISHED_DARK_FORCESTONE, 2);
        offerStonecuttingRecipe(recipeExporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.DARK_FORCESTONE_BRICK_SLAB, ModBlocks.DARK_FORCESTONE_BRICKS, 2);

        offerStonecuttingRecipe(recipeExporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.DARK_FORCESTONE_BRICK_STAIRS, ModBlocks.DARK_FORCESTONE, 1);
        offerStonecuttingRecipe(recipeExporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.DARK_FORCESTONE_BRICK_STAIRS, ModBlocks.POLISHED_DARK_FORCESTONE, 1);
        offerStonecuttingRecipe(recipeExporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.DARK_FORCESTONE_BRICK_STAIRS, ModBlocks.DARK_FORCESTONE_BRICKS, 1);

        offerStonecuttingRecipe(recipeExporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.DARK_FORCESTONE_BRICK_WALL, ModBlocks.DARK_FORCESTONE, 1);
        offerStonecuttingRecipe(recipeExporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.DARK_FORCESTONE_BRICK_WALL, ModBlocks.POLISHED_DARK_FORCESTONE, 1);
        offerStonecuttingRecipe(recipeExporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.DARK_FORCESTONE_BRICK_WALL, ModBlocks.DARK_FORCESTONE_BRICKS, 1);

        offerStonecuttingRecipe(recipeExporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.DARK_FORCESTONE_BRICKS, ModBlocks.DARK_FORCESTONE, 1);
        offerStonecuttingRecipe(recipeExporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.DARK_FORCESTONE_BRICKS, ModBlocks.POLISHED_DARK_FORCESTONE, 1);

        offerStonecuttingRecipe(recipeExporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.DARK_FORCESTONE_SLAB, ModBlocks.DARK_FORCESTONE, 2);

        offerStonecuttingRecipe(recipeExporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.DARK_FORCESTONE_STAIRS, ModBlocks.DARK_FORCESTONE, 1);

        offerStonecuttingRecipe(recipeExporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.DARK_FORCESTONE_WALL, ModBlocks.DARK_FORCESTONE, 1);

        offerStonecuttingRecipe(recipeExporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.POLISHED_DARK_FORCESTONE, ModBlocks.DARK_FORCESTONE, 1);

        offerStonecuttingRecipe(recipeExporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.POLISHED_DARK_FORCESTONE_SLAB, ModBlocks.DARK_FORCESTONE, 2);
        offerStonecuttingRecipe(recipeExporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.POLISHED_DARK_FORCESTONE_SLAB, ModBlocks.POLISHED_DARK_FORCESTONE, 2);

        offerStonecuttingRecipe(recipeExporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.POLISHED_DARK_FORCESTONE_STAIRS, ModBlocks.DARK_FORCESTONE, 1);
        offerStonecuttingRecipe(recipeExporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.POLISHED_DARK_FORCESTONE_STAIRS, ModBlocks.POLISHED_DARK_FORCESTONE, 1);

        offerStonecuttingRecipe(recipeExporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.POLISHED_DARK_FORCESTONE_WALL, ModBlocks.DARK_FORCESTONE, 1);
        offerStonecuttingRecipe(recipeExporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.POLISHED_DARK_FORCESTONE_WALL, ModBlocks.POLISHED_DARK_FORCESTONE, 1);


        createStairsRecipe(ModBlocks.DARK_FORCESTONE_STAIRS, Ingredient.ofItems(ModBlocks.DARK_FORCESTONE))
                .criterion(hasItem(ModBlocks.DARK_FORCESTONE), conditionsFromItem(ModBlocks.DARK_FORCESTONE))
                .offerTo(recipeExporter);
        createStairsRecipe(ModBlocks.POLISHED_DARK_FORCESTONE_STAIRS, Ingredient.ofItems(ModBlocks.POLISHED_DARK_FORCESTONE))
                .criterion(hasItem(ModBlocks.POLISHED_DARK_FORCESTONE), conditionsFromItem(ModBlocks.POLISHED_DARK_FORCESTONE))
                .offerTo(recipeExporter);
        createStairsRecipe(ModBlocks.DARK_FORCESTONE_BRICK_STAIRS, Ingredient.ofItems(ModBlocks.DARK_FORCESTONE_BRICKS))
                .criterion(hasItem(ModBlocks.DARK_FORCESTONE_BRICKS), conditionsFromItem(ModBlocks.DARK_FORCESTONE_BRICKS))
                .offerTo(recipeExporter);

        offerSlabRecipe(recipeExporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.DARK_FORCESTONE_SLAB, ModBlocks.DARK_FORCESTONE);
        offerSlabRecipe(recipeExporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.POLISHED_DARK_FORCESTONE_SLAB, ModBlocks.POLISHED_DARK_FORCESTONE);
        offerSlabRecipe(recipeExporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.DARK_FORCESTONE_BRICK_SLAB, ModBlocks.DARK_FORCESTONE_BRICKS);

        offerWallRecipe(recipeExporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.DARK_FORCESTONE_WALL, ModBlocks.DARK_FORCESTONE);
        offerWallRecipe(recipeExporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.POLISHED_DARK_FORCESTONE_WALL, ModBlocks.POLISHED_DARK_FORCESTONE);
        offerWallRecipe(recipeExporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.DARK_FORCESTONE_BRICK_WALL, ModBlocks.DARK_FORCESTONE_BRICKS);

        offerChiseledBlockRecipe(recipeExporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.CHISELED_DARK_FORCESTONE, ModBlocks.DARK_FORCESTONE_SLAB);
        offerChiseledBlockRecipe(recipeExporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.CHISELED_DARK_FORCESTONE_BRICKS, ModBlocks.DARK_FORCESTONE_BRICK_SLAB);

        offerPolishedStoneRecipe(recipeExporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.POLISHED_DARK_FORCESTONE, ModBlocks.DARK_FORCESTONE);
        offerPolishedStoneRecipe(recipeExporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.DARK_FORCESTONE_BRICKS, ModBlocks.POLISHED_DARK_FORCESTONE);
    }
}
