package net.jannik.herbslightsabers.block;

import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.jannik.herbslightsabers.HerbsLightsabersSTARWARS;
import net.jannik.herbslightsabers.block.custom.ThinSnowLayerBlock;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.piston.PistonBehavior;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;

public class ModBlocks {

    // Uses the custom method "registerBlock" on the listet blocks and changes their settings
    public static final Block DARK_FORCESTONE_BRICKS = registerBlock("dark_forcestone_bricks",
            new Block(AbstractBlock.Settings.create()
                    .requiresTool()
                    .strength(50.0F, 1200.0F)
                    .sounds(BlockSoundGroup.STONE)
                    .pistonBehavior(PistonBehavior.IGNORE)));

    public static final Block DARK_FORCESTONE = registerBlock("dark_forcestone",
            new Block(AbstractBlock.Settings.create()
                    .requiresTool()
                    .strength(50.0F, 1200.0F)
                    .sounds(BlockSoundGroup.STONE)
                    .pistonBehavior(PistonBehavior.IGNORE)));

    public static final Block POLISHED_DARK_FORCESTONE = registerBlock("polished_dark_forcestone",
            new Block(AbstractBlock.Settings.create()
                    .requiresTool()
                    .strength(50.0F, 1200.0F)
                    .sounds(BlockSoundGroup.STONE)
                    .pistonBehavior(PistonBehavior.IGNORE)));

    public static final Block CHISELED_DARK_FORCESTONE = registerBlock("chiseled_dark_forcestone",
            new Block(AbstractBlock.Settings.create()
                    .requiresTool()
                    .strength(50.0F, 1200.0F)
                    .sounds(BlockSoundGroup.STONE)
                    .pistonBehavior(PistonBehavior.IGNORE)));

    public static final Block CHISELED_DARK_FORCESTONE_BRICKS = registerBlock("chiseled_dark_forcestone_bricks",
            new Block(AbstractBlock.Settings.create()
                    .requiresTool()
                    .strength(50.0F, 1200.0F)
                    .sounds(BlockSoundGroup.STONE)
                    .pistonBehavior(PistonBehavior.IGNORE)));

    public static final Block THIN_SNOW_LAYER = registerBlock("thin_snow_layer",
            new ThinSnowLayerBlock(AbstractBlock.Settings.create()
                    .requiresTool()
                    .noCollision()
                    .breakInstantly()
                    .sounds(BlockSoundGroup.SNOW)
                    .pistonBehavior(PistonBehavior.DESTROY)
                    .nonOpaque()));



    // Custom method that registers new blocks with parameters "name" and "block"
    private static Block registerBlock(String name, Block block) {
        registerBlockItem(name, block);
        return Registry.register(Registries.BLOCK, Identifier.of(HerbsLightsabersSTARWARS.MOD_ID, name), block);
    }

    // Custom method that registers new blocks as items with parameters "name" and "block"
    public static BlockItem registerBlockItem(String name, Block block) {
        return Registry.register(Registries.ITEM, Identifier.of(HerbsLightsabersSTARWARS.MOD_ID, name),
                new BlockItem(block, new Item.Settings()));
    }

    // Custom method, called on initialization
    public static void registerModBlocks() {

        // Adds blocks to their item groups
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS).register(fabricItemGroupEntries -> {
            fabricItemGroupEntries.add(DARK_FORCESTONE_BRICKS);
            fabricItemGroupEntries.add(DARK_FORCESTONE);
            fabricItemGroupEntries.add(POLISHED_DARK_FORCESTONE);
            fabricItemGroupEntries.add(CHISELED_DARK_FORCESTONE);
            fabricItemGroupEntries.add(CHISELED_DARK_FORCESTONE_BRICKS);
            fabricItemGroupEntries.add(THIN_SNOW_LAYER);
        });
    }
}

