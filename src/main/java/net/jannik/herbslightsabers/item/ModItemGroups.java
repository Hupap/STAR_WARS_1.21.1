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
                        entries.add(ModBlocks.THIN_SNOW_LAYER);

                    }).build());

    // Custom method, called on initialization
    public static void registerItemGroups() {

    }
}
