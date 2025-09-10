package net.mreizy.mysticaltrees.ether;

import net.minecraft.core.HolderLookup;
import net.minecraft.nbt.CompoundTag;
import net.neoforged.neoforge.common.NeoForge;
import net.neoforged.neoforge.event.tick.ServerTickEvent;

import java.math.BigDecimal;

public class EtherData {

    public EtherData(){
        //NeoForge.EVENT_BUS.addListener(this::onServerTick);
    }
    //use this if tick event does not work
    public void onServerTick(ServerTickEvent.Pre event){
        System.out.println("server ticked in chunk. updating ether");
    }
    private BigDecimal ether = BigDecimal.ZERO;


    public void setEther(BigDecimal ether){
        this.ether = ether;
    }
    public void setEther(double ether){
        this.ether = new BigDecimal(ether);
    }
    public BigDecimal getEther(){
        return ether;
    }
    //tries to subtract the amount from ether.
    //works if amount is < remaining ether
    //else returns false
    public boolean decreaseEther(double amount){
        if(ether.compareTo(new BigDecimal(amount)) > 0) return false;
        ether = ether.subtract(new BigDecimal(amount));
        return true;
    }
    public void loadNBTData(CompoundTag tag, HolderLookup.Provider provider){
        ether = new BigDecimal(tag.getString("ether"));
    }
    public void saveNBTData(CompoundTag tag,HolderLookup.Provider provider){
        tag.putString("ether",ether.toString());
    }
}
