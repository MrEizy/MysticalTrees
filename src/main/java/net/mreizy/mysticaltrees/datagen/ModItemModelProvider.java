package net.mreizy.mysticaltrees.datagen;

import net.minecraft.data.PackOutput;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.block.Block;
import net.mreizy.mysticaltrees.MysticalTrees;
import net.mreizy.mysticaltrees.blocks.ModBlocks;
import net.mreizy.mysticaltrees.items.ModItems;
import net.neoforged.neoforge.client.model.generators.ItemModelBuilder;
import net.neoforged.neoforge.client.model.generators.ItemModelProvider;
import net.neoforged.neoforge.common.data.ExistingFileHelper;
import net.neoforged.neoforge.registries.DeferredBlock;

public class ModItemModelProvider extends ItemModelProvider {
    public ModItemModelProvider(PackOutput output, ExistingFileHelper existingFileHelper) {
        super(output, MysticalTrees.MOD_ID, existingFileHelper);
    }

    @Override
    protected void registerModels() {
        // COAL
        saplingItem(ModBlocks.COAL_OAK_SAPLING);
        basicItem(ModItems.COAL_RESIN.get());
        basicItem(ModItems.COAL_ACORN.get());
        // COPPER
        saplingItem(ModBlocks.COPPER_OAK_SAPLING);
        basicItem(ModItems.COPPER_RESIN.get());
        basicItem(ModItems.COPPER_ACORN.get());
        // IRON
        saplingItem(ModBlocks.IRON_OAK_SAPLING);
        basicItem(ModItems.IRON_RESIN.get());
        basicItem(ModItems.IRON_ACORN.get());
        // GOLD
        saplingItem(ModBlocks.GOLD_OAK_SAPLING);
        basicItem(ModItems.GOLD_RESIN.get());
        basicItem(ModItems.GOLD_ACORN.get());
        // DIAMOND
        saplingItem(ModBlocks.DIAMOND_OAK_SAPLING);
        basicItem(ModItems.DIAMOND_RESIN.get());
        basicItem(ModItems.DIAMOND_ACORN.get());
        // NETHERITE
        saplingItem(ModBlocks.NETHERITE_OAK_SAPLING);
        basicItem(ModItems.NETHERITE_RESIN.get());
        basicItem(ModItems.NETHERITE_ACORN.get());
        // AMETHYST
        saplingItem(ModBlocks.AMETHYST_OAK_SAPLING);
        basicItem(ModItems.AMETHYST_RESIN.get());
        basicItem(ModItems.AMETHYST_ACORN.get());
        // QUARTZ
        saplingItem(ModBlocks.QUARTZ_OAK_SAPLING);
        basicItem(ModItems.QUARTZ_RESIN.get());
        basicItem(ModItems.QUARTZ_ACORN.get());
        // EMERALD
        saplingItem(ModBlocks.EMERALD_OAK_SAPLING);
        basicItem(ModItems.EMERALD_RESIN.get());
        basicItem(ModItems.EMERALD_ACORN.get());
        // REDSTONE
        saplingItem(ModBlocks.REDSTONE_OAK_SAPLING);
        basicItem(ModItems.REDSTONE_RESIN.get());
        basicItem(ModItems.REDSTONE_ACORN.get());
        // LAPIS
        saplingItem(ModBlocks.LAPIS_OAK_SAPLING);
        basicItem(ModItems.LAPIS_RESIN.get());
        basicItem(ModItems.LAPIS_ACORN.get());
        // STONE
        saplingItem(ModBlocks.STONE_OAK_SAPLING);
        basicItem(ModItems.STONE_RESIN.get());
        basicItem(ModItems.STONE_ACORN.get());
        // DIRT
        saplingItem(ModBlocks.DIRT_OAK_SAPLING);
        basicItem(ModItems.DIRT_RESIN.get());
        basicItem(ModItems.DIRT_ACORN.get());

        // SAND
        saplingItem(ModBlocks.SAND_OAK_SAPLING);
        basicItem(ModItems.SAND_RESIN.get());
        basicItem(ModItems.SAND_ACORN.get());

        // CLAY
        saplingItem(ModBlocks.CLAY_OAK_SAPLING);
        basicItem(ModItems.CLAY_RESIN.get());
        basicItem(ModItems.CLAY_ACORN.get());

        // GRAVEL
        saplingItem(ModBlocks.GRAVEL_OAK_SAPLING);
        basicItem(ModItems.GRAVEL_RESIN.get());
        basicItem(ModItems.GRAVEL_ACORN.get());

        // LAVA
        saplingItem(ModBlocks.LAVA_OAK_SAPLING);
        basicItem(ModItems.LAVA_RESIN.get());
        basicItem(ModItems.LAVA_ACORN.get());



    }

    private ItemModelBuilder saplingItem(DeferredBlock<Block> item) {
        return withExistingParent(item.getId().getPath(),
                ResourceLocation.parse("item/generated")).texture("layer0",
                ResourceLocation.fromNamespaceAndPath(MysticalTrees.MOD_ID,"block/" + item.getId().getPath()));
    }
}
