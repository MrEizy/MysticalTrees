package net.mreizy.mysticaltrees.network.client_bound;

import io.netty.buffer.ByteBuf;
import net.minecraft.core.BlockPos;
import net.minecraft.network.codec.ByteBufCodecs;
import net.minecraft.network.codec.StreamCodec;
import net.minecraft.network.protocol.common.custom.CustomPacketPayload;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.chunk.ChunkAccess;
import net.mreizy.mysticaltrees.MysticalTrees;
import net.mreizy.mysticaltrees.network.server_bound.RequestChunkEtherData;
import net.mreizy.mysticaltrees.util.ModAttachments;
import net.neoforged.neoforge.network.handling.IPayloadContext;

public record ChunkEtherData(String ether, int chunkX, int chunkZ) implements CustomPacketPayload {
    public static final CustomPacketPayload.Type<ChunkEtherData> TYPE = new CustomPacketPayload.Type<>(ResourceLocation.fromNamespaceAndPath(MysticalTrees.MOD_ID, "chunk_ether_data"));
    public static final StreamCodec<ByteBuf, ChunkEtherData> STREAM_CODEC = StreamCodec.composite(
            ByteBufCodecs.STRING_UTF8,
            ChunkEtherData::ether,
            ByteBufCodecs.VAR_INT,
            ChunkEtherData::chunkX,
            ByteBufCodecs.VAR_INT,
            ChunkEtherData::chunkZ,
            ChunkEtherData::new
    );

    @Override
    public Type<? extends CustomPacketPayload> type() {
        return TYPE;
    }
    public static void handlePayload(ChunkEtherData payload, IPayloadContext context) {
        System.out.println("chunk ("+payload.chunkX+","+payload.chunkZ+") has ether: "+payload.ether);
    }

}
