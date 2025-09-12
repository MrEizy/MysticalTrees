package net.mreizy.mysticaltrees.ether;

import com.google.common.eventbus.Subscribe;
import net.minecraft.server.level.ChunkHolder;
import net.minecraft.server.level.ChunkMap;
import net.minecraft.server.level.ServerChunkCache;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.chunk.ChunkAccess;
import net.mreizy.mysticaltrees.MysticalTrees;
import net.mreizy.mysticaltrees.network.client_bound.ChunkEtherData;
import net.mreizy.mysticaltrees.network.server_bound.RequestChunkEtherData;
import net.mreizy.mysticaltrees.util.ModAttachments;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.neoforge.event.level.ChunkDataEvent;
import net.neoforged.neoforge.event.level.ChunkEvent;
import net.neoforged.neoforge.event.level.ChunkTicketLevelUpdatedEvent;
import net.neoforged.neoforge.event.tick.PlayerTickEvent;
import net.neoforged.neoforge.event.tick.ServerTickEvent;
import net.neoforged.neoforge.network.PacketDistributor;

import java.math.BigDecimal;

@EventBusSubscriber(modid = MysticalTrees.MOD_ID)
public class EtherEventHandler {
    //TODO might not be needed.
    public static void onChunkLoaded(ChunkEvent event){}

    /*
    TODO probably want to listen to a tick event. then go through every loaded chunk and regen ether
    TODO this would be server side and then i would have to send a packet to client to update it there
    TODO although i could just keep it server side... and only occasionally update client side like if using
    TODO a reading item or smth
     */
    @SubscribeEvent
    public static void onServerTick(ServerTickEvent.Pre event){
        for (Level level : event.getServer().getAllLevels()){
            if(level.isClientSide) continue;
            //System.out.println("number of loaded chunks: "+level.getChunkSource().getLoadedChunksCount());
            if(level.getChunkSource() instanceof ServerChunkCache serverChunkCache){
                int count = 0;
                for(ChunkHolder holder:serverChunkCache.chunkMap.getChunks()){
                    count += 1;
                    if(holder.getTickingChunk() == null) continue;
                    //TODO potentially change to check with has. and then attach using load.
                    //TODO that would allow for more control on what chunks can have ether
                    EtherData data = holder.getTickingChunk().getData(ModAttachments.CHUNK_ETHER_DATA);
                    data.setEther(data.getEther().add(new BigDecimal("0.05")));
                }
                //System.out.println("number of chunks in map: "+count);

            }
        }
    }
    @SubscribeEvent
    public static void onPlayerTick(PlayerTickEvent.Pre event) {
        if(!event.getEntity().level().isClientSide()) {
            ChunkAccess chunk = event.getEntity().level().getChunk(event.getEntity().getOnPos());
            //System.out.println("chunk ("+chunk.getPos().x+","+chunk.getPos().z+") has ether: "+chunk.getData(ModAttachments.CHUNK_ETHER_DATA).getEther().toString());

        }
        /*
        if(event.getEntity().level().isClientSide){
            System.out.println(event.getEntity().getOnPos());
            //could totally do everything i want to do server side but im extra rn
            PacketDistributor.sendToServer(new RequestChunkEtherData(event.getEntity().getOnPos()));
        }

         */
    }
}
