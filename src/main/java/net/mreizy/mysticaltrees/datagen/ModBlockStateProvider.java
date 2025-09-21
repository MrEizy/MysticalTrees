package net.mreizy.mysticaltrees.datagen;

import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.data.PackOutput;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.RotatedPillarBlock;
import net.mreizy.mysticaltrees.MysticalTrees;
import net.mreizy.mysticaltrees.blocks.ModBlocks;
import net.neoforged.neoforge.client.model.generators.BlockModelBuilder;
import net.neoforged.neoforge.client.model.generators.BlockStateProvider;
import net.neoforged.neoforge.client.model.generators.ModelFile;
import net.neoforged.neoforge.common.data.ExistingFileHelper;
import net.neoforged.neoforge.registries.DeferredBlock;

public class ModBlockStateProvider extends BlockStateProvider {
    public ModBlockStateProvider(PackOutput output, ExistingFileHelper exFileHelper) {
        super(output, MysticalTrees.MOD_ID, exFileHelper);
    }

    @Override
    protected void registerStatesAndModels() {
        // COAL
        logMBlock(((RotatedPillarBlock) ModBlocks.COAL_OAK_LOG.get()));
        axisBlock(((RotatedPillarBlock) ModBlocks.COAL_OAK_WOOD.get()), blockTexture(ModBlocks.COAL_OAK_LOG.get()), blockTexture(ModBlocks.COAL_OAK_LOG.get()));
        simpleBlockWithItem(ModBlocks.COAL_AMBER);
        blockItem(ModBlocks.COAL_OAK_LOG);
        blockItem(ModBlocks.COAL_OAK_WOOD);
        leavesBlock(ModBlocks.COAL_OAK_LEAVES);
        saplingBlock(ModBlocks.COAL_OAK_SAPLING);

        // COPPER
        logMBlock(((RotatedPillarBlock) ModBlocks.COPPER_OAK_LOG.get()));
        axisBlock(((RotatedPillarBlock) ModBlocks.COPPER_OAK_WOOD.get()), blockTexture(ModBlocks.COPPER_OAK_LOG.get()), blockTexture(ModBlocks.COPPER_OAK_LOG.get()));
        simpleBlockWithItem(ModBlocks.COPPER_AMBER);
        blockItem(ModBlocks.COPPER_OAK_LOG);
        blockItem(ModBlocks.COPPER_OAK_WOOD);
        leavesBlock(ModBlocks.COPPER_OAK_LEAVES);
        saplingBlock(ModBlocks.COPPER_OAK_SAPLING);

        // IRON
        logMBlock(((RotatedPillarBlock) ModBlocks.IRON_OAK_LOG.get()));
        axisBlock(((RotatedPillarBlock) ModBlocks.IRON_OAK_WOOD.get()), blockTexture(ModBlocks.IRON_OAK_LOG.get()), blockTexture(ModBlocks.IRON_OAK_LOG.get()));
        simpleBlockWithItem(ModBlocks.IRON_AMBER);
        blockItem(ModBlocks.IRON_OAK_LOG);
        blockItem(ModBlocks.IRON_OAK_WOOD);
        leavesBlock(ModBlocks.IRON_OAK_LEAVES);
        saplingBlock(ModBlocks.IRON_OAK_SAPLING);

        // GOLD
        logMBlock(((RotatedPillarBlock) ModBlocks.GOLD_OAK_LOG.get()));
        axisBlock(((RotatedPillarBlock) ModBlocks.GOLD_OAK_WOOD.get()), blockTexture(ModBlocks.GOLD_OAK_LOG.get()), blockTexture(ModBlocks.GOLD_OAK_LOG.get()));
        simpleBlockWithItem(ModBlocks.GOLD_AMBER);
        blockItem(ModBlocks.GOLD_OAK_LOG);
        blockItem(ModBlocks.GOLD_OAK_WOOD);
        leavesBlock(ModBlocks.GOLD_OAK_LEAVES);
        saplingBlock(ModBlocks.GOLD_OAK_SAPLING);

        // DIAMOND
        logMBlock(((RotatedPillarBlock) ModBlocks.DIAMOND_OAK_LOG.get()));
        axisBlock(((RotatedPillarBlock) ModBlocks.DIAMOND_OAK_WOOD.get()), blockTexture(ModBlocks.DIAMOND_OAK_LOG.get()), blockTexture(ModBlocks.DIAMOND_OAK_LOG.get()));
        simpleBlockWithItem(ModBlocks.DIAMOND_AMBER);
        blockItem(ModBlocks.DIAMOND_OAK_LOG);
        blockItem(ModBlocks.DIAMOND_OAK_WOOD);
        leavesBlock(ModBlocks.DIAMOND_OAK_LEAVES);
        saplingBlock(ModBlocks.DIAMOND_OAK_SAPLING);

        // NETHERITE
        logMBlock(((RotatedPillarBlock) ModBlocks.NETHERITE_OAK_LOG.get()));
        axisBlock(((RotatedPillarBlock) ModBlocks.NETHERITE_OAK_WOOD.get()), blockTexture(ModBlocks.NETHERITE_OAK_LOG.get()), blockTexture(ModBlocks.NETHERITE_OAK_LOG.get()));
        simpleBlockWithItem(ModBlocks.NETHERITE_AMBER);
        blockItem(ModBlocks.NETHERITE_OAK_LOG);
        blockItem(ModBlocks.NETHERITE_OAK_WOOD);
        leavesBlock(ModBlocks.NETHERITE_OAK_LEAVES);
        saplingBlock(ModBlocks.NETHERITE_OAK_SAPLING);

        // AMETHYST
        logMBlock(((RotatedPillarBlock) ModBlocks.AMETHYST_OAK_LOG.get()));
        axisBlock(((RotatedPillarBlock) ModBlocks.AMETHYST_OAK_WOOD.get()), blockTexture(ModBlocks.AMETHYST_OAK_LOG.get()), blockTexture(ModBlocks.AMETHYST_OAK_LOG.get()));
        simpleBlockWithItem(ModBlocks.AMETHYST_AMBER);
        blockItem(ModBlocks.AMETHYST_OAK_LOG);
        blockItem(ModBlocks.AMETHYST_OAK_WOOD);
        leavesBlock(ModBlocks.AMETHYST_OAK_LEAVES);
        saplingBlock(ModBlocks.AMETHYST_OAK_SAPLING);

        // QUARTZ
        logMBlock(((RotatedPillarBlock) ModBlocks.QUARTZ_OAK_LOG.get()));
        axisBlock(((RotatedPillarBlock) ModBlocks.QUARTZ_OAK_WOOD.get()), blockTexture(ModBlocks.QUARTZ_OAK_LOG.get()), blockTexture(ModBlocks.QUARTZ_OAK_LOG.get()));
        simpleBlockWithItem(ModBlocks.QUARTZ_AMBER);
        blockItem(ModBlocks.QUARTZ_OAK_LOG);
        blockItem(ModBlocks.QUARTZ_OAK_WOOD);
        leavesBlock(ModBlocks.QUARTZ_OAK_LEAVES);
        saplingBlock(ModBlocks.QUARTZ_OAK_SAPLING);

        // EMERALD
        logMBlock(((RotatedPillarBlock) ModBlocks.EMERALD_OAK_LOG.get()));
        axisBlock(((RotatedPillarBlock) ModBlocks.EMERALD_OAK_WOOD.get()), blockTexture(ModBlocks.EMERALD_OAK_LOG.get()), blockTexture(ModBlocks.EMERALD_OAK_LOG.get()));
        simpleBlockWithItem(ModBlocks.EMERALD_AMBER);
        blockItem(ModBlocks.EMERALD_OAK_LOG);
        blockItem(ModBlocks.EMERALD_OAK_WOOD);
        leavesBlock(ModBlocks.EMERALD_OAK_LEAVES);
        saplingBlock(ModBlocks.EMERALD_OAK_SAPLING);

        // REDSTONE
        logMBlock(((RotatedPillarBlock) ModBlocks.REDSTONE_OAK_LOG.get()));
        axisBlock(((RotatedPillarBlock) ModBlocks.REDSTONE_OAK_WOOD.get()), blockTexture(ModBlocks.REDSTONE_OAK_LOG.get()), blockTexture(ModBlocks.REDSTONE_OAK_LOG.get()));
        simpleBlockWithItem(ModBlocks.REDSTONE_AMBER);
        blockItem(ModBlocks.REDSTONE_OAK_LOG);
        blockItem(ModBlocks.REDSTONE_OAK_WOOD);
        leavesBlock(ModBlocks.REDSTONE_OAK_LEAVES);
        saplingBlock(ModBlocks.REDSTONE_OAK_SAPLING);

        // LAPIS
        logMBlock(((RotatedPillarBlock) ModBlocks.LAPIS_OAK_LOG.get()));
        axisBlock(((RotatedPillarBlock) ModBlocks.LAPIS_OAK_WOOD.get()), blockTexture(ModBlocks.LAPIS_OAK_LOG.get()), blockTexture(ModBlocks.LAPIS_OAK_LOG.get()));
        simpleBlockWithItem(ModBlocks.LAPIS_AMBER);
        blockItem(ModBlocks.LAPIS_OAK_LOG);
        blockItem(ModBlocks.LAPIS_OAK_WOOD);
        leavesBlock(ModBlocks.LAPIS_OAK_LEAVES);
        saplingBlock(ModBlocks.LAPIS_OAK_SAPLING);

        // STONE
        logMBlock(((RotatedPillarBlock) ModBlocks.STONE_OAK_LOG.get()));
        axisBlock(((RotatedPillarBlock) ModBlocks.STONE_OAK_WOOD.get()), blockTexture(ModBlocks.STONE_OAK_LOG.get()), blockTexture(ModBlocks.STONE_OAK_LOG.get()));
        simpleBlockWithItem(ModBlocks.STONE_AMBER);
        blockItem(ModBlocks.STONE_OAK_LOG);
        blockItem(ModBlocks.STONE_OAK_WOOD);
        leavesBlock(ModBlocks.STONE_OAK_LEAVES);
        saplingBlock(ModBlocks.STONE_OAK_SAPLING);

        // STONE
        logMBlock(((RotatedPillarBlock) ModBlocks.DIRT_OAK_LOG.get()));
        axisBlock(((RotatedPillarBlock) ModBlocks.DIRT_OAK_WOOD.get()), blockTexture(ModBlocks.DIRT_OAK_LOG.get()), blockTexture(ModBlocks.DIRT_OAK_LOG.get()));
        simpleBlockWithItem(ModBlocks.DIRT_AMBER);
        blockItem(ModBlocks.DIRT_OAK_LOG);
        blockItem(ModBlocks.DIRT_OAK_WOOD);
        leavesBlock(ModBlocks.DIRT_OAK_LEAVES);
        saplingBlock(ModBlocks.DIRT_OAK_SAPLING);

        // SAND
        logMBlock(((RotatedPillarBlock) ModBlocks.SAND_OAK_LOG.get()));
        axisBlock(((RotatedPillarBlock) ModBlocks.SAND_OAK_WOOD.get()), blockTexture(ModBlocks.SAND_OAK_LOG.get()), blockTexture(ModBlocks.SAND_OAK_LOG.get()));
        simpleBlockWithItem(ModBlocks.SAND_AMBER);
        blockItem(ModBlocks.SAND_OAK_LOG);
        blockItem(ModBlocks.SAND_OAK_WOOD);
        leavesBlock(ModBlocks.SAND_OAK_LEAVES);
        saplingBlock(ModBlocks.SAND_OAK_SAPLING);

        // CLAY
        logMBlock(((RotatedPillarBlock) ModBlocks.CLAY_OAK_LOG.get()));
        axisBlock(((RotatedPillarBlock) ModBlocks.CLAY_OAK_WOOD.get()), blockTexture(ModBlocks.CLAY_OAK_LOG.get()), blockTexture(ModBlocks.CLAY_OAK_LOG.get()));
        simpleBlockWithItem(ModBlocks.CLAY_AMBER);
        blockItem(ModBlocks.CLAY_OAK_LOG);
        blockItem(ModBlocks.CLAY_OAK_WOOD);
        leavesBlock(ModBlocks.CLAY_OAK_LEAVES);
        saplingBlock(ModBlocks.CLAY_OAK_SAPLING);

        // GRAVEL
        logMBlock(((RotatedPillarBlock) ModBlocks.GRAVEL_OAK_LOG.get()));
        axisBlock(((RotatedPillarBlock) ModBlocks.GRAVEL_OAK_WOOD.get()), blockTexture(ModBlocks.GRAVEL_OAK_LOG.get()), blockTexture(ModBlocks.GRAVEL_OAK_LOG.get()));
        simpleBlockWithItem(ModBlocks.GRAVEL_AMBER);
        blockItem(ModBlocks.GRAVEL_OAK_LOG);
        blockItem(ModBlocks.GRAVEL_OAK_WOOD);
        leavesBlock(ModBlocks.GRAVEL_OAK_LEAVES);
        saplingBlock(ModBlocks.GRAVEL_OAK_SAPLING);

        // LAVA
        logMBlock(((RotatedPillarBlock) ModBlocks.LAVA_OAK_LOG.get()));
        axisBlock(((RotatedPillarBlock) ModBlocks.LAVA_OAK_WOOD.get()), blockTexture(ModBlocks.LAVA_OAK_LOG.get()), blockTexture(ModBlocks.LAVA_OAK_LOG.get()));
        simpleBlockWithItem(ModBlocks.LAVA_AMBER);
        blockItem(ModBlocks.LAVA_OAK_LOG);
        blockItem(ModBlocks.LAVA_OAK_WOOD);
        leavesBlock(ModBlocks.LAVA_OAK_LEAVES);
        saplingBlock(ModBlocks.LAVA_OAK_SAPLING);

        // DYE
        logMBlock(((RotatedPillarBlock) ModBlocks.DYE_OAK_LOG.get()));
        axisBlock(((RotatedPillarBlock) ModBlocks.DYE_OAK_WOOD.get()), blockTexture(ModBlocks.DYE_OAK_LOG.get()), blockTexture(ModBlocks.DYE_OAK_LOG.get()));
        simpleBlockWithItem(ModBlocks.DYE_AMBER);
        blockItem(ModBlocks.DYE_OAK_LOG);
        blockItem(ModBlocks.DYE_OAK_WOOD);
        leavesBlock(ModBlocks.DYE_OAK_LEAVES);
        saplingBlock(ModBlocks.DYE_OAK_SAPLING);
    }


    private void saplingBlock(DeferredBlock<Block> blockRegistryObject) {
        simpleBlock(blockRegistryObject.get(),
                models().cross(BuiltInRegistries.BLOCK.getKey(blockRegistryObject.get()).getPath(), blockTexture(blockRegistryObject.get())).renderType("cutout"));
    }

    private void leavesBlock(DeferredBlock<Block> blockRegistryObject) {
        simpleBlockWithItem(blockRegistryObject.get(),
                models().singleTexture(BuiltInRegistries.BLOCK.getKey(blockRegistryObject.get()).getPath(), ResourceLocation.parse("minecraft:block/leaves"),
                        "all", blockTexture(blockRegistryObject.get())).renderType("cutout"));
    }

    private void simpleBlockWithItem(DeferredBlock<?> deferredBlock) {
        simpleBlockWithItem(deferredBlock.get(), cubeAll(deferredBlock.get()));
    }

    private void logMBlock(RotatedPillarBlock block) {
        this.axisBlock(block,
                this.blockTexture(block),
                ResourceLocation.fromNamespaceAndPath("minecraft", "block/oak_log_top")
        );
    }

    private void blockWithItem(DeferredBlock<?> deferredBlock) {
        simpleBlockWithItem(deferredBlock.get(), cubeAll(deferredBlock.get()));
    }
    private void translucentBlockWithItem(DeferredBlock<?> deferredBlock) {
        Block block = deferredBlock.get();
        String path = key(deferredBlock).getPath();

        // Create cubeAll-like model with translucent render type
        ModelFile model = models().withExistingParent(path, mcLoc("block/cube_all"))
                .texture("all", blockTexture(block))
                .renderType("translucent"); // NeoForge 1.21.1 uses renderType() method

        // Generate block state and item model
        simpleBlock(block, model);
        simpleBlockItem(block, model);
    }

    // Helper method to get ResourceLocation key from DeferredBlock
    private ResourceLocation key(DeferredBlock<?> deferredBlock) {
        return deferredBlock.getId();
    }

    private void blockItem(DeferredBlock<?> deferredBlock) {
        simpleBlockItem(deferredBlock.get(), new ModelFile.UncheckedModelFile("mysticaltrees:block/" + deferredBlock.getId().getPath()));
    }

    private void blockItem(DeferredBlock<?> deferredBlock, String appendix) {
        simpleBlockItem(deferredBlock.get(), new ModelFile.UncheckedModelFile("mysticaltrees:block/" + deferredBlock.getId().getPath() + appendix));
    }
}
