package net.mreizy.mysticaltrees.blocks.logs;

import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.world.item.AxeItem;
import net.minecraft.world.item.context.UseOnContext;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.RotatedPillarBlock;
import net.minecraft.world.level.block.state.BlockState;
import net.mreizy.mysticaltrees.blocks.ModBlocks;
import net.neoforged.neoforge.common.ItemAbility;
import org.jetbrains.annotations.Nullable;

import java.util.HashMap;
import java.util.Map;

public class ModFlammableRotatedPillarBlock extends RotatedPillarBlock {

    private static final Map<Block, Block> STRIPPABLES = new HashMap<>();
    public ModFlammableRotatedPillarBlock(Properties properties) {
        super(properties);
    }


    @Override
    public boolean isFlammable(BlockState state, BlockGetter level, BlockPos pos, Direction direction) {
        return true;
    }

    @Override
    public int getFlammability(BlockState state, BlockGetter level, BlockPos pos, Direction direction) {
        return 5;
    }

    @Override
    public int getFireSpreadSpeed(BlockState state, BlockGetter level, BlockPos pos, Direction direction) {
        return 5;
    }

    @Override
    public @Nullable BlockState getToolModifiedState(BlockState state, UseOnContext context,
                                                     ItemAbility itemAbility, boolean simulate) {
        if (context.getItemInHand().getItem() instanceof AxeItem) {
            if (STRIPPABLES.isEmpty()) {
                STRIPPABLES.put(ModBlocks.COAL_OAK_LOG.get(), Blocks.STRIPPED_OAK_LOG);
                STRIPPABLES.put(ModBlocks.COAL_OAK_WOOD.get(), Blocks.STRIPPED_OAK_WOOD);
                STRIPPABLES.put(ModBlocks.COPPER_OAK_LOG.get(), Blocks.STRIPPED_OAK_LOG);
                STRIPPABLES.put(ModBlocks.COPPER_OAK_WOOD.get(), Blocks.STRIPPED_OAK_WOOD);
                STRIPPABLES.put(ModBlocks.IRON_OAK_LOG.get(), Blocks.STRIPPED_OAK_LOG);
                STRIPPABLES.put(ModBlocks.IRON_OAK_WOOD.get(), Blocks.STRIPPED_OAK_WOOD);
                STRIPPABLES.put(ModBlocks.GOLD_OAK_LOG.get(), Blocks.STRIPPED_OAK_LOG);
                STRIPPABLES.put(ModBlocks.GOLD_OAK_WOOD.get(), Blocks.STRIPPED_OAK_WOOD);
                STRIPPABLES.put(ModBlocks.DIAMOND_OAK_LOG.get(), Blocks.STRIPPED_OAK_LOG);
                STRIPPABLES.put(ModBlocks.DIAMOND_OAK_WOOD.get(), Blocks.STRIPPED_OAK_WOOD);
                STRIPPABLES.put(ModBlocks.NETHERITE_OAK_LOG.get(), Blocks.STRIPPED_OAK_LOG);
                STRIPPABLES.put(ModBlocks.NETHERITE_OAK_WOOD.get(), Blocks.STRIPPED_OAK_WOOD);
                STRIPPABLES.put(ModBlocks.EMERALD_OAK_LOG.get(), Blocks.STRIPPED_OAK_LOG);
                STRIPPABLES.put(ModBlocks.EMERALD_OAK_WOOD.get(), Blocks.STRIPPED_OAK_WOOD);
                STRIPPABLES.put(ModBlocks.AMETHYST_OAK_LOG.get(), Blocks.STRIPPED_OAK_LOG);
                STRIPPABLES.put(ModBlocks.AMETHYST_OAK_WOOD.get(), Blocks.STRIPPED_OAK_WOOD);
                STRIPPABLES.put(ModBlocks.LAPIS_OAK_LOG.get(), Blocks.STRIPPED_OAK_LOG);
                STRIPPABLES.put(ModBlocks.LAPIS_OAK_WOOD.get(), Blocks.STRIPPED_OAK_WOOD);
                STRIPPABLES.put(ModBlocks.QUARTZ_OAK_LOG.get(), Blocks.STRIPPED_OAK_LOG);
                STRIPPABLES.put(ModBlocks.QUARTZ_OAK_WOOD.get(), Blocks.STRIPPED_OAK_WOOD);
                STRIPPABLES.put(ModBlocks.REDSTONE_OAK_LOG.get(), Blocks.STRIPPED_OAK_LOG);
                STRIPPABLES.put(ModBlocks.REDSTONE_OAK_WOOD.get(), Blocks.STRIPPED_OAK_WOOD);
                STRIPPABLES.put(ModBlocks.STONE_OAK_LOG.get(), Blocks.STRIPPED_OAK_LOG);
                STRIPPABLES.put(ModBlocks.STONE_OAK_WOOD.get(), Blocks.STRIPPED_OAK_WOOD);
                STRIPPABLES.put(ModBlocks.DIRT_OAK_LOG.get(), Blocks.STRIPPED_OAK_LOG);
                STRIPPABLES.put(ModBlocks.DIRT_OAK_WOOD.get(), Blocks.STRIPPED_OAK_WOOD);
                STRIPPABLES.put(ModBlocks.GRAVEL_OAK_LOG.get(), Blocks.STRIPPED_OAK_LOG);
                STRIPPABLES.put(ModBlocks.GRAVEL_OAK_WOOD.get(), Blocks.STRIPPED_OAK_WOOD);
                STRIPPABLES.put(ModBlocks.SAND_OAK_LOG.get(), Blocks.STRIPPED_OAK_LOG);
                STRIPPABLES.put(ModBlocks.SAND_OAK_WOOD.get(), Blocks.STRIPPED_OAK_WOOD);
                STRIPPABLES.put(ModBlocks.CLAY_OAK_LOG.get(), Blocks.STRIPPED_OAK_LOG);
                STRIPPABLES.put(ModBlocks.CLAY_OAK_WOOD.get(), Blocks.STRIPPED_OAK_WOOD);

            }

            Block strippedBlock = STRIPPABLES.get(state.getBlock());
            if (strippedBlock != null) {
                return strippedBlock.defaultBlockState().setValue(AXIS, state.getValue(AXIS));
            }
        }
        return super.getToolModifiedState(state, context, itemAbility, simulate);
    }
}
