package net.mreizy.mysticaltrees.blocks.saplings;

import net.minecraft.core.BlockPos;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.util.RandomSource;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.LevelReader;
import net.minecraft.world.level.block.EntityBlock;
import net.minecraft.world.level.block.SaplingBlock;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.entity.BlockEntityTicker;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraft.world.level.block.grower.TreeGrower;
import net.minecraft.world.level.block.state.BlockState;
import net.mreizy.mysticaltrees.blocks.ModBlockEntities;
import org.jetbrains.annotations.Nullable;

import java.math.BigDecimal;

public class EtherSapling extends SaplingBlock implements EntityBlock {
    public final BigDecimal requiredEther;
    public final BigDecimal etherRate;

    public EtherSapling(TreeGrower treeGrower, Properties properties, BigDecimal requiredEther, BigDecimal etherRate) {
        super(treeGrower, properties);
        this.requiredEther = requiredEther;
        this.etherRate = etherRate;

    }
    public EtherSapling(TreeGrower treeGrower,Properties properties){
        this(treeGrower,properties,new BigDecimal("100"),new BigDecimal("0.1"));
    }
    //ether trees do not grow using random tick instead they consume ether per tick until threshold
    @Override
    protected void randomTick(BlockState state, ServerLevel level, BlockPos pos, RandomSource random) {

    }

    @Override
    protected void tick(BlockState state, ServerLevel level, BlockPos pos, RandomSource random) {
        super.tick(state, level, pos, random);
    }

    @Override
    public boolean isValidBonemealTarget(LevelReader level, BlockPos pos, BlockState state) {
        return false;
    }

    @Override
    public @Nullable BlockEntity newBlockEntity(BlockPos blockPos, BlockState blockState) {
        return new EtherSaplingBlockEntity(
                blockPos,
                blockState
        );

    }

    @SuppressWarnings("unchecked")
    @Override
    public @Nullable <T extends BlockEntity> BlockEntityTicker<T> getTicker(Level level, BlockState state, BlockEntityType<T> blockEntityType) {
        if(level.isClientSide()) return null;

        return blockEntityType == ModBlockEntities.ETHER_SAPLING_BE.get() ? (BlockEntityTicker<T>) EtherSaplingBlockEntity::tick : null;
    }
}
