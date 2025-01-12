package net.jannik.herbslightsabers.block;

import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.jannik.herbslightsabers.HerbsLightsabersSTARWARS;
import net.jannik.herbslightsabers.block.custom.*;
import net.minecraft.block.*;
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
                    .sounds(BlockSoundGroup.STONE)));
    public static final Block DARK_FORCESTONE = registerBlock("dark_forcestone",
            new Block(AbstractBlock.Settings.create()
                    .requiresTool()
                    .strength(50.0F, 1200.0F)
                    .sounds(BlockSoundGroup.STONE)));
    public static final Block POLISHED_DARK_FORCESTONE = registerBlock("polished_dark_forcestone",
            new Block(AbstractBlock.Settings.create()
                    .requiresTool()
                    .strength(50.0F, 1200.0F)
                    .sounds(BlockSoundGroup.STONE)));
    public static final Block CHISELED_DARK_FORCESTONE = registerBlock("chiseled_dark_forcestone",
            new Block(AbstractBlock.Settings.create()
                    .requiresTool()
                    .strength(50.0F, 1200.0F)
                    .sounds(BlockSoundGroup.STONE)));
    public static final Block CHISELED_DARK_FORCESTONE_BRICKS = registerBlock("chiseled_dark_forcestone_bricks",
            new Block(AbstractBlock.Settings.create()
                    .requiresTool()
                    .strength(50.0F, 1200.0F)
                    .sounds(BlockSoundGroup.STONE)));

    public static final Block DARK_FORCESTONE_STAIRS = registerBlock("dark_forcestone_stairs",
            new StairsBlock(ModBlocks.DARK_FORCESTONE.getDefaultState(),
                    AbstractBlock.Settings.create()
                            .requiresTool()
                            .strength(50.0F, 1200.0F)
                            .sounds(BlockSoundGroup.STONE)));
    public static final Block DARK_FORCESTONE_BRICK_STAIRS = registerBlock("dark_forcestone_brick_stairs",
            new StairsBlock(ModBlocks.DARK_FORCESTONE_BRICKS.getDefaultState(),
                    AbstractBlock.Settings.create()
                            .requiresTool()
                            .strength(50.0F, 1200.0F)
                            .sounds(BlockSoundGroup.STONE)));
    public static final Block POLISHED_DARK_FORCESTONE_STAIRS = registerBlock("polished_dark_forcestone_stairs",
            new StairsBlock(ModBlocks.POLISHED_DARK_FORCESTONE.getDefaultState(),
                    AbstractBlock.Settings.create()
                            .requiresTool()
                            .strength(50.0F, 1200.0F)
                            .sounds(BlockSoundGroup.STONE)));

    public static final Block DARK_FORCESTONE_SLAB = registerBlock("dark_forcestone_slab",
            new SlabBlock(AbstractBlock.Settings.create()
                    .requiresTool()
                    .strength(50.0F, 1200.0F)
                    .sounds(BlockSoundGroup.STONE)));
    public static final Block DARK_FORCESTONE_BRICK_SLAB = registerBlock("dark_forcestone_brick_slab",
            new SlabBlock(AbstractBlock.Settings.create()
                    .requiresTool()
                    .strength(50.0F, 1200.0F)
                    .sounds(BlockSoundGroup.STONE)));
    public static final Block POLISHED_DARK_FORCESTONE_SLAB = registerBlock("polished_dark_forcestone_slab",
            new SlabBlock(AbstractBlock.Settings.create()
                    .requiresTool()
                    .strength(50.0F, 1200.0F)
                    .sounds(BlockSoundGroup.STONE)));

    public static final Block DARK_FORCESTONE_WALL = registerBlock("dark_forcestone_wall",
            new WallBlock(AbstractBlock.Settings.create()
                    .requiresTool()
                    .strength(50.0F, 1200.0F)
                    .sounds(BlockSoundGroup.STONE)));
    public static final Block DARK_FORCESTONE_BRICK_WALL = registerBlock("dark_forcestone_brick_wall",
            new WallBlock(AbstractBlock.Settings.create()
                    .requiresTool()
                    .strength(50.0F, 1200.0F)
                    .sounds(BlockSoundGroup.STONE)));
    public static final Block POLISHED_DARK_FORCESTONE_WALL = registerBlock("polished_dark_forcestone_wall",
            new WallBlock(AbstractBlock.Settings.create()
                    .requiresTool()
                    .strength(50.0F, 1200.0F)
                    .sounds(BlockSoundGroup.STONE)));

    public static final Block DARK_FORCESTONE_BUTTON = registerBlock("dark_forcestone_button",
            new ButtonBlock(BlockSetType.STONE, 2,
                    AbstractBlock.Settings.create()
                            .requiresTool()
                            .noCollision()
                            .strength(50.0F, 1200.0F)
                            .sounds(BlockSoundGroup.STONE)));

    public static final Block DARK_FORCESTONE_PRESSURE_PLATE = registerBlock("dark_forcestone_pressure_plate",
            new PressurePlateBlock(BlockSetType.STONE,
                    AbstractBlock.Settings.create()
                            .requiresTool()
                            .noCollision()
                            .strength(50.0F, 1200.0F)
                            .sounds(BlockSoundGroup.STONE)));

    public static final Block THIN_ROUND_SNOW_LAYER = registerBlock("thin_round_snow_layer",
            new ThinRoundSnowLayerBlock(AbstractBlock.Settings.create()
                    .strength(0.5F)
                    .noCollision()
                    .mapColor(MapColor.PALE_PURPLE)
                    .replaceable()
                    .breakInstantly()
                    .sounds(BlockSoundGroup.SNOW)
                    .pistonBehavior(PistonBehavior.DESTROY)
                    .nonOpaque()
                    .solidBlock(Blocks::never)));

    public static final Block THIN_BRICK_SNOW_LAYER = registerBlock("thin_brick_snow_layer",
            new ThinRoundSnowLayerBlock(AbstractBlock.Settings.create()
                    .strength(0.5F)
                    .noCollision()
                    .mapColor(MapColor.PALE_PURPLE)
                    .replaceable()
                    .breakInstantly()
                    .sounds(BlockSoundGroup.SNOW)
                    .pistonBehavior(PistonBehavior.DESTROY)
                    .nonOpaque()
                    .solidBlock(Blocks::never)));

    public static final Block DARK_FORCESTONE_AUREBESH_BLOCK = registerBlock("dark_forcestone_aurebesh_block",
            new DarkForcestoneAurebeshBlock(AbstractBlock.Settings.create()
                    .requiresTool()
                    .strength(50.0F, 1200.0F)
                    .luminance(state -> state.get(DarkForcestoneAurebeshBlock.CLICKED) ? 15 : 0)));

    public static final Block DARK_FORCESTONE_AUREBESH_BLOCK2 = registerBlock("dark_forcestone_aurebesh_block2",
            new DarkForcestoneAurebeshBlock2(AbstractBlock.Settings.create()
                    .requiresTool()
                    .strength(50.0F, 1200.0F)
                    .luminance(state -> state.get(DarkForcestoneAurebeshBlock2.CLICKED) ? 15 : 0)));

    public static final Block DARK_FORCESTONE_AUREBESH_BLOCK3 = registerBlock("dark_forcestone_aurebesh_block3",
            new DarkForcestoneAurebeshBlock3(AbstractBlock.Settings.create()
                    .requiresTool()
                    .strength(50.0F, 1200.0F)
                    .luminance(state -> state.get(DarkForcestoneAurebeshBlock3.CLICKED) ? 15 : 0)));

    public static final Block DARK_FORCESTONE_AUREBESH_BLOCK4 = registerBlock("dark_forcestone_aurebesh_block4",
            new DarkForcestoneAurebeshBlock4(AbstractBlock.Settings.create()
                    .requiresTool()
                    .strength(50.0F, 1200.0F)
                    .luminance(state -> state.get(DarkForcestoneAurebeshBlock4.CLICKED) ? 15 : 0)));

    public static final Block DARK_FORCESTONE_AUREBESH_BLOCK5 = registerBlock("dark_forcestone_aurebesh_block5",
            new DarkForcestoneAurebeshBlock5(AbstractBlock.Settings.create()
                    .requiresTool()
                    .strength(50.0F, 1200.0F)
                    .luminance(state -> state.get(DarkForcestoneAurebeshBlock5.CLICKED) ? 15 : 0)));






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
            fabricItemGroupEntries.add(DARK_FORCESTONE_AUREBESH_BLOCK);
            fabricItemGroupEntries.add(DARK_FORCESTONE_AUREBESH_BLOCK2);
            fabricItemGroupEntries.add(DARK_FORCESTONE_STAIRS);
            fabricItemGroupEntries.add(POLISHED_DARK_FORCESTONE_STAIRS);
            fabricItemGroupEntries.add(DARK_FORCESTONE_BRICK_STAIRS);
            fabricItemGroupEntries.add(DARK_FORCESTONE_SLAB);
            fabricItemGroupEntries.add(DARK_FORCESTONE_BRICK_SLAB);
            fabricItemGroupEntries.add(POLISHED_DARK_FORCESTONE_SLAB);
            fabricItemGroupEntries.add(DARK_FORCESTONE_BRICK_WALL);
            fabricItemGroupEntries.add(DARK_FORCESTONE_WALL);
            fabricItemGroupEntries.add(POLISHED_DARK_FORCESTONE_WALL);
            fabricItemGroupEntries.add(DARK_FORCESTONE_BUTTON);
            fabricItemGroupEntries.add(DARK_FORCESTONE_PRESSURE_PLATE);
            fabricItemGroupEntries.add(THIN_ROUND_SNOW_LAYER);
            fabricItemGroupEntries.add(THIN_BRICK_SNOW_LAYER);
        });
    }
}

