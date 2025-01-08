package net.jannik.herbslightsabers.item.custom;

import net.jannik.herbslightsabers.block.ModBlocks;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.item.Item;
import net.minecraft.item.ItemUsageContext;
import net.minecraft.server.network.ServerPlayerEntity;
import net.minecraft.server.world.ServerWorld;
import net.minecraft.sound.SoundCategory;
import net.minecraft.sound.SoundEvent;
import net.minecraft.sound.SoundEvents;
import net.minecraft.util.ActionResult;
import net.minecraft.world.World;

import java.util.Map;

public class ChiselItem extends Item {
    // Map of blocks and their replacements
    public static final Map<Block, Block> CHISEL_MAP =
            Map.of(
                    ModBlocks.DARK_FORCESTONE, ModBlocks.POLISHED_DARK_FORCESTONE,
                    ModBlocks.POLISHED_DARK_FORCESTONE, ModBlocks.DARK_FORCESTONE_BRICKS,
                    ModBlocks.DARK_FORCESTONE_BRICKS, ModBlocks.CHISELED_DARK_FORCESTONE_BRICKS,
                    ModBlocks.CHISELED_DARK_FORCESTONE_BRICKS, ModBlocks.CHISELED_DARK_FORCESTONE,
                    ModBlocks.CHISELED_DARK_FORCESTONE, ModBlocks.DARK_FORCESTONE
            );

    public ChiselItem(Settings settings) {
        super(settings);
    }

    @Override
    public ActionResult useOnBlock(ItemUsageContext context) {
        World world = context.getWorld();
        // Get block position and type
        Block clickedBlock = world.getBlockState(context.getBlockPos()).getBlock();

        // Checks whether clicked block is a key in the map
        if (CHISEL_MAP.containsKey(clickedBlock)) {
            if (!world.isClient()) {
                // replaces key-block with new block
                world.setBlockState(context.getBlockPos(), CHISEL_MAP.get(clickedBlock).getDefaultState());

                // Damages item
                context.getStack().damage(1, ((ServerWorld) world), ((ServerPlayerEntity) context.getPlayer()),
                        item -> context.getPlayer().sendEquipmentBreakStatus(item, EquipmentSlot.MAINHAND));

                // Plays Grindstone-sound at block position
                world.playSound(null, context.getBlockPos(), SoundEvents.BLOCK_GRINDSTONE_USE, SoundCategory.BLOCKS);
            }
        }

        // Registers right-clicking for right-clicking-animation
        return ActionResult.SUCCESS;
    }
}
