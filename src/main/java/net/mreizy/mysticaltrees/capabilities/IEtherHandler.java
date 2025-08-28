package net.mreizy.mysticaltrees.capabilities;

public interface IEtherHandler {
    int getEther();
    void setEther(int value);
    void addEther(int value);
    void drainEther(int value);
    int getMaxEther();
}
