package net.mreizy.mysticaltrees.capabilities;

import net.minecraft.util.Mth;

public class EtherHandler implements IEtherHandler{
    private int ether = 500; // Initial value
    private final int maxEther = 1000;

    @Override
    public int getEther() {
        return ether;
    }

    @Override
    public void setEther(int value) {
        ether = Mth.clamp(value, 0, maxEther);
    }

    @Override
    public void addEther(int value) {
        setEther(ether + value);
    }

    @Override
    public void drainEther(int value) {
        setEther(ether - value);
    }

    @Override
    public int getMaxEther() {
        return maxEther;
    }
}
