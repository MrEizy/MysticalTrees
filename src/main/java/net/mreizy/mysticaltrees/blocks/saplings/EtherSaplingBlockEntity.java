package net.mreizy.mysticaltrees.blocks.saplings;

import net.minecraft.core.BlockPos;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.SaplingBlock;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraft.world.level.block.state.BlockState;
import net.mreizy.mysticaltrees.blocks.ModBlockEntities;
import net.mreizy.mysticaltrees.ether.EtherData;
import net.mreizy.mysticaltrees.util.ModAttachments;

import java.math.BigDecimal;

public class EtherSaplingBlockEntity extends BlockEntity {
    public BigDecimal storedEther = BigDecimal.ZERO;

    public EtherSaplingBlockEntity(BlockEntityType<?> type, BlockPos pos, BlockState blockState) {
        super(type, pos, blockState);
    }
    public EtherSaplingBlockEntity(BlockPos pos,BlockState blockState){
        this(ModBlockEntities.ETHER_SAPLING_BE.get(),pos,blockState);
    }

    public static <T extends BlockEntity> void tick(Level level, BlockPos blockPos, BlockState blockState, T blockEntity) {
        if(level.isClientSide()) return;

        if(!(blockEntity instanceof EtherSaplingBlockEntity etherSapling)) return;

        if(!(blockState.getBlock() instanceof EtherSapling etherSaplingBlock)) return;

        EtherData data = level.getChunk(blockPos).getData(ModAttachments.CHUNK_ETHER_DATA);


        if(data.decreaseEther(etherSaplingBlock.etherRate)) etherSapling.storedEther =  etherSapling.storedEther.add(etherSaplingBlock.etherRate);
        //System.out.println("ether("+etherSapling.storedEther +"/"+etherSaplingBlock.requiredEther+")");



        if(etherSapling.storedEther.compareTo(etherSaplingBlock.requiredEther) >= 0)  {
            blockState.setValue(SaplingBlock.STAGE,1);
            etherSaplingBlock.advanceTree((ServerLevel) level,blockPos,blockState,level.getRandom());
        }
        level.getChunk(blockPos).setUnsaved(true);
    }

}
