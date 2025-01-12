package net.jannik.herbslightsabers.item;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.jannik.herbslightsabers.HerbsLightsabersSTARWARS;
import net.jannik.herbslightsabers.block.ModBlocks;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class ModItemGroups {
    //Adds items to the Creative-Mode tab "Herb's Lightsabers"
    public static final ItemGroup HERBS_LIGHTSABERS_GROUP = Registry.register(Registries.ITEM_GROUP,
            Identifier.of(HerbsLightsabersSTARWARS.MOD_ID, "herbs_lightsabers_items"),
            FabricItemGroup.builder().icon(() -> new ItemStack(ModBlocks.DARK_FORCESTONE_BRICKS))
                    .displayName(Text.translatable("itemgroup.herbslightsabers.herbs_lightsabers"))
                    .entries((displayContext, entries) -> {
                        entries.add(ModBlocks.DARK_FORCESTONE_BRICKS);
                        entries.add(ModBlocks.DARK_FORCESTONE);
                        entries.add(ModBlocks.POLISHED_DARK_FORCESTONE);
                        entries.add(ModBlocks.CHISELED_DARK_FORCESTONE);
                        entries.add(ModBlocks.CHISELED_DARK_FORCESTONE_BRICKS);
                        entries.add(ModBlocks.DARK_FORCESTONE_AUREBESH_BLOCK);
                        entries.add(ModBlocks.DARK_FORCESTONE_AUREBESH_BLOCK2);
                        entries.add(ModBlocks.DARK_FORCESTONE_AUREBESH_BLOCK3);
                        entries.add(ModBlocks.DARK_FORCESTONE_AUREBESH_BLOCK4);
                        entries.add(ModBlocks.DARK_FORCESTONE_AUREBESH_BLOCK5);
                        entries.add(ModBlocks.DARK_FORCESTONE_STAIRS);
                        entries.add(ModBlocks.DARK_FORCESTONE_BRICK_STAIRS);
                        entries.add(ModBlocks.POLISHED_DARK_FORCESTONE_STAIRS);
                        entries.add(ModBlocks.DARK_FORCESTONE_SLAB);
                        entries.add(ModBlocks.DARK_FORCESTONE_BRICK_SLAB);
                        entries.add(ModBlocks.POLISHED_DARK_FORCESTONE_SLAB);
                        entries.add(ModBlocks.DARK_FORCESTONE_WALL);
                        entries.add(ModBlocks.DARK_FORCESTONE_BRICK_WALL);
                        entries.add(ModBlocks.POLISHED_DARK_FORCESTONE_WALL);
                        entries.add(ModBlocks.DARK_FORCESTONE_BUTTON);
                        entries.add(ModBlocks.DARK_FORCESTONE_PRESSURE_PLATE);
                        entries.add(ModBlocks.THIN_ROUND_SNOW_LAYER);
                        entries.add(ModBlocks.THIN_BRICK_SNOW_LAYER);
                        entries.add(ModItems.CHISEL);

                    }).build());

    // Custom method, called on initialization
    public static void registerItemGroups() {

    }
}
