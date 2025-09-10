package net.mreizy.mysticaltrees.datagen;

import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.data.tags.ItemTagsProvider;
import net.minecraft.data.tags.TagsProvider;
import net.minecraft.tags.BlockTags;
import net.minecraft.tags.ItemTags;
import net.minecraft.world.level.block.Block;
import net.mreizy.mysticaltrees.MysticalTrees;
import net.mreizy.mysticaltrees.blocks.ModBlocks;
import net.neoforged.neoforge.common.data.ExistingFileHelper;

import javax.annotation.Nullable;
import java.util.concurrent.CompletableFuture;

public class ModItemTagProvider extends ItemTagsProvider {
    public ModItemTagProvider(PackOutput output, CompletableFuture<HolderLookup.Provider> lookupProvider,
                              CompletableFuture<TagsProvider.TagLookup<Block>> blockTags, @Nullable ExistingFileHelper existingFileHelper){
        super(output, lookupProvider, blockTags, MysticalTrees.MOD_ID, existingFileHelper);
    }
    @Override
    protected void addTags(HolderLookup.Provider provider) {


        this.tag(ItemTags.LOGS_THAT_BURN)
                .add(ModBlocks.IRON_OAK_LOG.get().asItem())
                .add(ModBlocks.IRON_OAK_WOOD.get().asItem())
                .add(ModBlocks.GOLD_OAK_LOG.get().asItem())
                .add(ModBlocks.GOLD_OAK_WOOD.get().asItem())
                .add(ModBlocks.DIAMOND_OAK_LOG.get().asItem())
                .add(ModBlocks.DIAMOND_OAK_WOOD.get().asItem())
                .add(ModBlocks.NETHERITE_OAK_LOG.get().asItem())
                .add(ModBlocks.NETHERITE_OAK_WOOD.get().asItem())
                .add(ModBlocks.AMETHYST_OAK_LOG.get().asItem())
                .add(ModBlocks.AMETHYST_OAK_WOOD.get().asItem())
                .add(ModBlocks.QUARTZ_OAK_LOG.get().asItem())
                .add(ModBlocks.QUARTZ_OAK_WOOD.get().asItem())
                .add(ModBlocks.EMERALD_OAK_LOG.get().asItem())
                .add(ModBlocks.EMERALD_OAK_WOOD.get().asItem())
                .add(ModBlocks.REDSTONE_OAK_LOG.get().asItem())
                .add(ModBlocks.REDSTONE_OAK_WOOD.get().asItem())
                .add(ModBlocks.LAPIS_OAK_LOG.get().asItem())
                .add(ModBlocks.LAPIS_OAK_WOOD.get().asItem())
                .add(ModBlocks.COPPER_OAK_LOG.get().asItem())
                .add(ModBlocks.COPPER_OAK_WOOD.get().asItem())
                .add(ModBlocks.COAL_OAK_LOG.get().asItem())
                .add(ModBlocks.COAL_OAK_WOOD.get().asItem());

    }
}