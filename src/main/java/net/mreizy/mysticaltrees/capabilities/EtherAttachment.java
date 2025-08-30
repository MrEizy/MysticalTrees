package net.mreizy.mysticaltrees.capabilities;


import net.minecraft.nbt.CompoundTag;
import net.minecraft.util.Mth;

public class EtherAttachment {
    private int ether = 500; // Initial value
    private static final int MAX_ETHER = 1000;

    public int getEther() {
        return ether;
    }

    public void setEther(int value) {
        this.ether = Mth.clamp(value, 0, MAX_ETHER);
    }

    public void addEther(int value) {
        setEther(ether + value);
    }

    public void drainEther(int value) {
        setEther(ether - value);
    }

    public int getMaxEther() {
        return MAX_ETHER;
    }

    // Instance method for saving (remove static)
    public CompoundTag save(CompoundTag tag) {
        tag.putInt("ether", this.ether);
        return tag;
    }

    // Instance method for loading
    public void load(CompoundTag tag) {
        if (tag.contains("ether", CompoundTag.TAG_INT)) {
            this.setEther(tag.getInt("ether")); // Use setter to ensure clamping
        }
    }

    // Copy data from another instance
    public void copyFrom(EtherAttachment source) {
        this.ether = source.ether;
    }
}
