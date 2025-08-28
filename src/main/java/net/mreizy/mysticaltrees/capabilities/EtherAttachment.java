package net.mreizy.mysticaltrees.capabilities;


import net.minecraft.nbt.CompoundTag;

public class EtherAttachment{
    private int ether = 500; // Initial value
    private static final int MAX_ETHER = 1000;

    public int getEther() {
        return ether;
    }

    public void setEther(int value) {
        this.ether = Math.clamp(value, 0, MAX_ETHER);
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

    // Make these methods static
    public static CompoundTag save(EtherAttachment attachment, CompoundTag tag) {
        tag.putInt("ether", attachment.ether);
        return tag;
    }

    public static EtherAttachment load(CompoundTag tag) {
        EtherAttachment attachment = new EtherAttachment();
        if (tag.contains("ether", CompoundTag.TAG_INT)) {
            attachment.ether = tag.getInt("ether");
        }
        return attachment;
    }
}
