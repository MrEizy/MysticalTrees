package net.mreizy.mysticaltrees.datagen;

import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.tags.BlockTags;
import net.mreizy.mysticaltrees.MysticalTrees;
import net.mreizy.mysticaltrees.blocks.ModBlocks;
import net.neoforged.neoforge.common.data.BlockTagsProvider;
import net.neoforged.neoforge.common.data.ExistingFileHelper;

import javax.annotation.Nullable;
import java.util.concurrent.CompletableFuture;

public class ModBlockTagProvider extends BlockTagsProvider {
    public ModBlockTagProvider(PackOutput output, CompletableFuture<HolderLookup.Provider> lookupProvider, @Nullable ExistingFileHelper existingFileHelper) {
        super(output, lookupProvider, MysticalTrees.MOD_ID, existingFileHelper);
    }

    @Override
    protected void addTags(HolderLookup.Provider provider) {
       /* tag(BlockTags.MINEABLE_WITH_PICKAXE)
                .add(ModBlocks.JADE_BLOCK.get())
                .add(ModBlocks.JADE_ORE.get());*/

        this.tag(BlockTags.LOGS_THAT_BURN)
                .add(ModBlocks.COAL_OAK_LOG.get())
                .add(ModBlocks.COAL_OAK_WOOD.get());

    }
}
