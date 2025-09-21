package net.mreizy.mysticaltrees.network;

import net.mreizy.mysticaltrees.blocks.entity.PedestalBlockEntity;
import net.neoforged.neoforge.network.handling.IPayloadContext;

public class ClientPayloadHandler {


    public static void handleCountOnClient(final PedestalCraftCountS2C data, final IPayloadContext context) {
        ((PedestalBlockEntity) context.player().level().getBlockEntity(data.blockEntityPosition())).setCount(data.count());
    }
}