package net.mreizy.mysticaltrees.network;

import net.mreizy.mysticaltrees.MysticalTrees;
import net.mreizy.mysticaltrees.network.client_bound.ChunkEtherData;
import net.mreizy.mysticaltrees.network.server_bound.RequestChunkEtherData;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.neoforge.network.event.RegisterPayloadHandlersEvent;
import net.neoforged.neoforge.network.registration.PayloadRegistrar;
import org.checkerframework.checker.units.qual.C;

public class ModPayloads {
    @SubscribeEvent
    public static void registerPayloads(final RegisterPayloadHandlersEvent event){
        final PayloadRegistrar registrar =event.registrar(MysticalTrees.MOD_ID).versioned("1.0");
        registrar.playToClient(
                ChunkEtherData.TYPE,
                ChunkEtherData.STREAM_CODEC,
                ChunkEtherData::handlePayload
        );
        registrar.playToServer(
                RequestChunkEtherData.TYPE,
                RequestChunkEtherData.STREAM_CODEC,
                RequestChunkEtherData::handlePayload
        );
        registrar.playToClient(
                PedestalCraftCountS2C.TYPE,
                PedestalCraftCountS2C.STREAM_CODEC,
                ClientPayloadHandler::handleCountOnClient
        );
    }
}
