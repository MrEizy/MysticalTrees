package net.mreizy.mysticaltrees.datagen;

import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.mreizy.mysticaltrees.items.ModItems;
import net.neoforged.neoforge.common.data.DataMapProvider;
import net.neoforged.neoforge.registries.datamaps.builtin.FurnaceFuel;
import net.neoforged.neoforge.registries.datamaps.builtin.NeoForgeDataMaps;

import java.util.concurrent.CompletableFuture;

public class ModDataMapProvider extends DataMapProvider {
    protected ModDataMapProvider(PackOutput packOutput, CompletableFuture<HolderLookup.Provider> lookupProvider) {
        super(packOutput, lookupProvider);
    }

    @Override
    protected void gather(HolderLookup.Provider provider) {
        this.builder(NeoForgeDataMaps.FURNACE_FUELS)
                .add(ModItems.LAVA_ACORN.getId(), new FurnaceFuel(7800), false)
                .add(ModItems.LAVA_RESIN.getId(), new FurnaceFuel(8000), false);
    }
}
