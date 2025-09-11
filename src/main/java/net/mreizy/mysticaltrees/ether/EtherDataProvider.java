package net.mreizy.mysticaltrees.ether;

import net.minecraft.core.HolderLookup;
import net.minecraft.nbt.CompoundTag;
import net.neoforged.neoforge.attachment.IAttachmentHolder;
import net.neoforged.neoforge.attachment.IAttachmentSerializer;
import org.jetbrains.annotations.Nullable;

public class EtherDataProvider implements IAttachmentSerializer<CompoundTag, EtherData> {
    @Override
    public EtherData read(IAttachmentHolder iAttachmentHolder, CompoundTag compoundTag, HolderLookup.Provider provider) {
        EtherData data = new EtherData();
        data.loadNBTData(compoundTag,provider);
        return data;
    }

    @Override
    public @Nullable CompoundTag write(EtherData etherData, HolderLookup.Provider provider) {
        var tag = new CompoundTag();
        etherData.saveNBTData(tag, provider);
        return tag;
    }
}
