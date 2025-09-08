package net.mreizy.mysticaltrees.blocks;

import net.minecraft.util.valueproviders.UniformInt;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.*;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.mreizy.mysticaltrees.blocks.logs.ModFlammableRotatedPillarBlock;
import net.mreizy.mysticaltrees.items.ModItems;
import net.mreizy.mysticaltrees.worldgen.tree.ModTreeGrowers;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredBlock;
import net.neoforged.neoforge.registries.DeferredRegister;
import net.mreizy.mysticaltrees.MysticalTrees;

import java.util.function.Supplier;

public class ModBlocks {
    public static final DeferredRegister.Blocks BLOCK =
            DeferredRegister.createBlocks(MysticalTrees.MOD_ID);



    //Vanilla Ore Trees
    public static final DeferredBlock<Block> COAL_OAK_LOG = registerBlock("coal_oak_log",
            () -> new ModFlammableRotatedPillarBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_LOG)));
    public static final DeferredBlock<Block> COAL_OAK_WOOD = registerBlock("coal_oak_wood",
            () -> new ModFlammableRotatedPillarBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_WOOD)));
    public static final DeferredBlock<Block> COAL_OAK_LEAVES = registerBlock("coal_oak_leaves",
            () -> new LeavesBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_LEAVES)));
    public static final DeferredBlock<Block> COAL_OAK_SAPLING = registerBlock("coal_oak_sapling",
            () -> new SaplingBlock(ModTreeGrowers.COAL_OAK, BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_SAPLING)));
    public static final DeferredBlock<Block> COAL_AMBER = registerBlock("coal_amber",
            () -> new TransparentBlock(BlockBehaviour.Properties.of().noOcclusion().sound(SoundType.WOOL).strength(0.6f, 0.6f)));

    private static <T extends Block> DeferredBlock<T> registerBlock(String name, Supplier<T> block) {
        DeferredBlock<T> toReturn = BLOCK.register(name, block);
        registerBlockItem(name, toReturn);
        return toReturn;
    }

    private static <T extends Block> void registerBlockItem(String name, DeferredBlock<T> block) {
        ModItems.ITEMS.register(name, () -> new BlockItem(block.get(), new Item.Properties()));
    }

    public static void register(IEventBus eventBus) {
        BLOCK.register(eventBus);
    }
}
