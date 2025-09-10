package net.mreizy.mysticaltrees.network.server_bound;

import io.netty.buffer.ByteBuf;
import net.minecraft.core.BlockPos;
import net.minecraft.network.codec.ByteBufCodecs;
import net.minecraft.network.codec.StreamCodec;
import net.minecraft.network.protocol.common.custom.CustomPacketPayload;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.server.level.ChunkHolder;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.world.level.chunk.ChunkAccess;
import net.mreizy.mysticaltrees.MysticalTrees;
import net.mreizy.mysticaltrees.network.client_bound.ChunkEtherData;
import net.mreizy.mysticaltrees.util.ModAttachments;
import net.neoforged.neoforge.network.PacketDistributor;
import net.neoforged.neoforge.network.handling.IPayloadContext;
import org.checkerframework.checker.units.qual.C;

import java.math.BigDecimal;

public record RequestChunkEtherData(BlockPos pos) implements CustomPacketPayload {
    public static final CustomPacketPayload.Type<RequestChunkEtherData> TYPE = new CustomPacketPayload.Type<>(ResourceLocation.fromNamespaceAndPath(MysticalTrees.MOD_ID, "request_chunk_ether_data"));
    public static final StreamCodec<ByteBuf, RequestChunkEtherData> STREAM_CODEC = StreamCodec.composite(
            BlockPos.STREAM_CODEC,
            RequestChunkEtherData::pos,
            RequestChunkEtherData::new
    );
    @Override
    public Type<? extends CustomPacketPayload> type() {
        return TYPE;
    }
    public static void handlePayload(RequestChunkEtherData payload, IPayloadContext context) {
        if(payload.pos == null) return;
        ChunkAccess chunk = context.player().level().getChunk(payload.pos);
        ChunkEtherData chunkEtherData = new ChunkEtherData(chunk.getData(ModAttachments.CHUNK_ETHER_DATA).getEther().toString(),chunk.getPos().x,chunk.getPos().z);
        PacketDistributor.sendToPlayer((ServerPlayer) context.player(),chunkEtherData);
    }
}
