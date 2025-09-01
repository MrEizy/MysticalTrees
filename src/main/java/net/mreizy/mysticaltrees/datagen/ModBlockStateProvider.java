package net.mreizy.mysticaltrees.datagen;

import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.data.PackOutput;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.RotatedPillarBlock;
import net.mreizy.mysticaltrees.MysticalTrees;
import net.mreizy.mysticaltrees.blocks.ModBlocks;
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
        //simpleBlockWithItem(ModBlocks.JADE_ORE);
        //logBlock(((RotatedPillarBlock) ModBlocks.COAL_OAK_LOG.get()));
        logMBlock(((RotatedPillarBlock) ModBlocks.COAL_OAK_LOG.get()));
        axisBlock(((RotatedPillarBlock) ModBlocks.COAL_OAK_WOOD.get()), blockTexture(ModBlocks.COAL_OAK_LOG.get()), blockTexture(ModBlocks.COAL_OAK_LOG.get()));


        blockItem(ModBlocks.COAL_OAK_LOG);
        blockItem(ModBlocks.COAL_OAK_WOOD);
        leavesBlock(ModBlocks.COAL_OAK_LEAVES);
        saplingBlock(ModBlocks.COAL_OAK_SAPLING);
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

    private void blockItem(DeferredBlock<?> deferredBlock) {
        simpleBlockItem(deferredBlock.get(), new ModelFile.UncheckedModelFile("mysticaltrees:block/" + deferredBlock.getId().getPath()));
    }

    private void blockItem(DeferredBlock<?> deferredBlock, String appendix) {
        simpleBlockItem(deferredBlock.get(), new ModelFile.UncheckedModelFile("mysticaltrees:block/" + deferredBlock.getId().getPath() + appendix));
    }
}
