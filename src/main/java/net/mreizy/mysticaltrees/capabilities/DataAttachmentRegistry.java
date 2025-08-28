package net.mreizy.mysticaltrees.capabilities;

import net.mreizy.mysticaltrees.MysticalTrees;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.attachment.AttachmentType;
import net.neoforged.neoforge.common.NeoForge;
import net.neoforged.neoforge.event.level.ChunkEvent;
import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.NeoForgeRegistries;


public class DataAttachmentRegistry {
    public static final DeferredRegister<AttachmentType<?>> ATTACHMENT_TYPES =
            DeferredRegister.create(NeoForgeRegistries.ATTACHMENT_TYPES, MysticalTrees.MOD_ID);

    public static final AttachmentType<EtherAttachment> ETHER = AttachmentType.builder(EtherAttachment::new)
            .serialize(EtherAttachment::save) // Fixed: Use method reference instead of lambda
            .deserialize(EtherAttachment::load) // Add deserialize method
            .build();

    public static void register(IEventBus eventBus) {
        ATTACHMENT_TYPES.register(eventBus);

        // Ensure the attachment is initialized on chunk load
        NeoForge.EVENT_BUS.addListener(DataAttachmentRegistry::onChunkLoad);
    }

    private static void onChunkLoad(ChunkEvent.Load event) {
        if (!event.getLevel().isClientSide()) { // Only on server side
            // Only create if it doesn't exist
            if (event.getChunk().getData(ETHER) == null) {
                event.getChunk().setData(ETHER, new EtherAttachment());
            }
        }
    }
}
