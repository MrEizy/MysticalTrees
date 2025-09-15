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
import net.mreizy.mysticaltrees.Config;
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

    public EtherSapling(TreeGrower treeGrower, Properties properties) {
        this(treeGrower, properties, new BigDecimal("100"), new BigDecimal("0.1"));
    }

    @Override
    protected void randomTick(BlockState state, ServerLevel level, BlockPos pos, RandomSource random) {
        if (!Config.isUseEtherMechanics()) {
            super.randomTick(state, level, pos, random); // Use normal sapling growth when ether mechanics are disabled
        }
        // When useEtherMechanics is true, do nothing to prevent random growth
    }

    @Override
    protected void tick(BlockState state, ServerLevel level, BlockPos pos, RandomSource random) {
        super.tick(state, level, pos, random);
    }

    @Override
    public boolean isValidBonemealTarget(LevelReader level, BlockPos pos, BlockState state) {
        return !Config.isUseEtherMechanics(); // Allow bonemeal only when ether mechanics are disabled
    }

    @Override
    public @Nullable BlockEntity newBlockEntity(BlockPos blockPos, BlockState blockState) {
        return Config.isUseEtherMechanics() ? new EtherSaplingBlockEntity(blockPos, blockState) : null; // Only use block entity for ether mechanics
    }

    @SuppressWarnings("unchecked")
    @Override
    public @Nullable <T extends BlockEntity> BlockEntityTicker<T> getTicker(Level level, BlockState state, BlockEntityType<T> blockEntityType) {
        if (level.isClientSide() || !Config.isUseEtherMechanics()) {
            return null; // No ticker when on client side or ether mechanics are disabled
        }
        return blockEntityType == ModBlockEntities.ETHER_SAPLING_BE.get() ? (BlockEntityTicker<T>) EtherSaplingBlockEntity::tick : null;
    }
}