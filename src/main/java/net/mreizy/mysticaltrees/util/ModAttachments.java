package net.mreizy.mysticaltrees.util;

import net.mreizy.mysticaltrees.MysticalTrees;
import net.mreizy.mysticaltrees.ether.EtherData;
import net.mreizy.mysticaltrees.ether.EtherDataProvider;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.attachment.AttachmentType;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.NeoForgeRegistries;

public class ModAttachments {
    public static final DeferredRegister<AttachmentType<?>> ATTACHMENT_TYPES = DeferredRegister.create(NeoForgeRegistries.ATTACHMENT_TYPES, MysticalTrees.MOD_ID);

    public static final DeferredHolder<AttachmentType<?>, AttachmentType<EtherData>> CHUNK_ETHER_DATA = ATTACHMENT_TYPES.register("ether_data",
            () -> AttachmentType.builder((holder) -> new EtherData()).serialize(new EtherDataProvider()).build());


    public static void register(IEventBus modEventBus){
        ATTACHMENT_TYPES.register(modEventBus);
    }
}
