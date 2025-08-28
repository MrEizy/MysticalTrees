package net.mreizy.mysticaltrees.capabilities;

import net.minecraft.core.HolderLookup;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.nbt.Tag;
import net.neoforged.neoforge.common.util.INBTSerializable;
import org.jetbrains.annotations.UnknownNullability;

import javax.annotation.Nonnull;

public class EtherStorage implements INBTSerializable<CompoundTag> {
    private final IEtherHandler handler;

    public EtherStorage(IEtherHandler handler) {
        this.handler = handler;
    }

    @Override
    public @UnknownNullability CompoundTag serializeNBT(HolderLookup.Provider provider) {
        CompoundTag tag = new CompoundTag();
        tag.putInt("ether", handler.getEther());
        return tag;
    }

    @Override
    public void deserializeNBT(HolderLookup.Provider provider, CompoundTag tag) {
        if (tag != null && tag.contains("ether", Tag.TAG_INT)) {
            handler.setEther(tag.getInt("ether"));
        }
    }
}
