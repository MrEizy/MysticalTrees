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
                .add(ModBlocks.COAL_OAK_WOOD.get())
                .add(ModBlocks.COPPER_OAK_LOG.get())
                .add(ModBlocks.COPPER_OAK_WOOD.get())
                .add(ModBlocks.IRON_OAK_LOG.get())
                .add(ModBlocks.IRON_OAK_WOOD.get())
                .add(ModBlocks.GOLD_OAK_LOG.get())
                .add(ModBlocks.GOLD_OAK_WOOD.get())
                .add(ModBlocks.DIAMOND_OAK_LOG.get())
                .add(ModBlocks.DIAMOND_OAK_WOOD.get())
                .add(ModBlocks.NETHERITE_OAK_LOG.get())
                .add(ModBlocks.NETHERITE_OAK_WOOD.get())
                .add(ModBlocks.AMETHYST_OAK_LOG.get())
                .add(ModBlocks.AMETHYST_OAK_WOOD.get())
                .add(ModBlocks.QUARTZ_OAK_LOG.get())
                .add(ModBlocks.QUARTZ_OAK_WOOD.get())
                .add(ModBlocks.EMERALD_OAK_LOG.get())
                .add(ModBlocks.EMERALD_OAK_WOOD.get())
                .add(ModBlocks.REDSTONE_OAK_LOG.get())
                .add(ModBlocks.REDSTONE_OAK_WOOD.get())
                .add(ModBlocks.LAPIS_OAK_LOG.get())
                .add(ModBlocks.LAPIS_OAK_WOOD.get())
                .add(ModBlocks.STONE_OAK_LOG.get())
                .add(ModBlocks.STONE_OAK_WOOD.get())
                .add(ModBlocks.DIRT_OAK_LOG.get())
                .add(ModBlocks.DIRT_OAK_WOOD.get())
                .add(ModBlocks.SAND_OAK_LOG.get())
                .add(ModBlocks.SAND_OAK_WOOD.get())
                .add(ModBlocks.CLAY_OAK_LOG.get())
                .add(ModBlocks.CLAY_OAK_WOOD.get())
                .add(ModBlocks.GRAVEL_OAK_LOG.get())
                .add(ModBlocks.GRAVEL_OAK_WOOD.get());

    }
}
