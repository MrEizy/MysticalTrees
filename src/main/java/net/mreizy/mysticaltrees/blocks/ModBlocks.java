package net.mreizy.mysticaltrees.blocks;

import net.minecraft.util.ColorRGBA;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.*;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.mreizy.mysticaltrees.blocks.logs.ModFlammableRotatedPillarBlock;
import net.mreizy.mysticaltrees.blocks.saplings.EtherSapling;
import net.mreizy.mysticaltrees.items.ModItems;
import net.mreizy.mysticaltrees.worldgen.tree.ModTreeGrowers;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredBlock;
import net.neoforged.neoforge.registries.DeferredRegister;
import net.mreizy.mysticaltrees.MysticalTrees;

import java.math.BigDecimal;
import java.util.function.Supplier;

public class ModBlocks {
    public static final DeferredRegister.Blocks BLOCK =
            DeferredRegister.createBlocks(MysticalTrees.MOD_ID);

    //block entity saplings
    //public static final DeferredBlock<Block> TEST_SAPLING = registerBlock("test_sapling",
    //        ()-> new EtherSaplingOld(ModTreeGrowers.DIRT_OAK, BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_SAPLING), BigDecimal.TEN,BigDecimal.ONE));

    //Vanilla Ore Trees
    //Coal
    public static final DeferredBlock<Block> COAL_OAK_LOG = registerBlock("coal_oak_log",
            () -> new ModFlammableRotatedPillarBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_LOG)));
    public static final DeferredBlock<Block> COAL_OAK_WOOD = registerBlock("coal_oak_wood",
            () -> new ModFlammableRotatedPillarBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_WOOD)));
    public static final DeferredBlock<Block> COAL_OAK_LEAVES = registerBlock("coal_oak_leaves",
            () -> new LeavesBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_LEAVES)));
    public static final DeferredBlock<Block> COAL_OAK_SAPLING = registerBlock("coal_oak_sapling",
            () -> new EtherSapling(ModTreeGrowers.COAL_OAK, BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_SAPLING),new BigDecimal(40),new BigDecimal(1)));
    public static final DeferredBlock<Block> COAL_AMBER = registerBlock("coal_amber",
            () -> new ColoredFallingBlock(new ColorRGBA(13214124), BlockBehaviour.Properties.of().strength(0.6f, 0.6f).sound(SoundType.GRAVEL)));
    //Copper
    public static final DeferredBlock<Block> COPPER_OAK_LOG = registerBlock("copper_oak_log",
            () -> new ModFlammableRotatedPillarBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_LOG)));
    public static final DeferredBlock<Block> COPPER_OAK_WOOD = registerBlock("copper_oak_wood",
            () -> new ModFlammableRotatedPillarBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_WOOD)));
    public static final DeferredBlock<Block> COPPER_OAK_LEAVES = registerBlock("copper_oak_leaves",
            () -> new LeavesBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_LEAVES)));
    public static final DeferredBlock<Block> COPPER_OAK_SAPLING = registerBlock("copper_oak_sapling",
            () -> new EtherSapling(ModTreeGrowers.COPPER_OAK, BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_SAPLING),new BigDecimal("200"),new BigDecimal("0.1")));
    public static final DeferredBlock<Block> COPPER_AMBER = registerBlock("copper_amber",
            () -> new ColoredFallingBlock(new ColorRGBA(13214124), BlockBehaviour.Properties.of().strength(0.6f, 0.6f).sound(SoundType.GRAVEL)));
    //Gold
    public static final DeferredBlock<Block> GOLD_OAK_LOG = registerBlock("gold_oak_log",
            () -> new ModFlammableRotatedPillarBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_LOG)));
    public static final DeferredBlock<Block> GOLD_OAK_WOOD = registerBlock("gold_oak_wood",
            () -> new ModFlammableRotatedPillarBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_WOOD)));
    public static final DeferredBlock<Block> GOLD_OAK_LEAVES = registerBlock("gold_oak_leaves",
            () -> new LeavesBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_LEAVES)));
    public static final DeferredBlock<Block> GOLD_OAK_SAPLING = registerBlock("gold_oak_sapling",
            () -> new SaplingBlock(ModTreeGrowers.GOLD_OAK, BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_SAPLING)));
    public static final DeferredBlock<Block> GOLD_AMBER = registerBlock("gold_amber",
            () -> new ColoredFallingBlock(new ColorRGBA(13214124), BlockBehaviour.Properties.of().strength(0.6f, 0.6f).sound(SoundType.GRAVEL)));
    //Iron
    public static final DeferredBlock<Block> IRON_OAK_LOG = registerBlock("iron_oak_log",
            () -> new ModFlammableRotatedPillarBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_LOG)));
    public static final DeferredBlock<Block> IRON_OAK_WOOD = registerBlock("iron_oak_wood",
            () -> new ModFlammableRotatedPillarBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_WOOD)));
    public static final DeferredBlock<Block> IRON_OAK_LEAVES = registerBlock("iron_oak_leaves",
            () -> new LeavesBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_LEAVES)));
    public static final DeferredBlock<Block> IRON_OAK_SAPLING = registerBlock("iron_oak_sapling",
            () -> new SaplingBlock(ModTreeGrowers.IRON_OAK, BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_SAPLING)));
    public static final DeferredBlock<Block> IRON_AMBER = registerBlock("iron_amber",
            () -> new ColoredFallingBlock(new ColorRGBA(13214124), BlockBehaviour.Properties.of().strength(0.6f, 0.6f).sound(SoundType.GRAVEL)));
    //Diamond
    public static final DeferredBlock<Block> DIAMOND_OAK_LOG = registerBlock("diamond_oak_log",
            () -> new ModFlammableRotatedPillarBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_LOG)));
    public static final DeferredBlock<Block> DIAMOND_OAK_WOOD = registerBlock("diamond_oak_wood",
            () -> new ModFlammableRotatedPillarBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_WOOD)));
    public static final DeferredBlock<Block> DIAMOND_OAK_LEAVES = registerBlock("diamond_oak_leaves",
            () -> new LeavesBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_LEAVES)));
    public static final DeferredBlock<Block> DIAMOND_OAK_SAPLING = registerBlock("diamond_oak_sapling",
            () -> new SaplingBlock(ModTreeGrowers.DIAMOND_OAK, BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_SAPLING)));
    public static final DeferredBlock<Block> DIAMOND_AMBER = registerBlock("diamond_amber",
            () -> new ColoredFallingBlock(new ColorRGBA(13214124), BlockBehaviour.Properties.of().strength(0.6f, 0.6f).sound(SoundType.GRAVEL)));
    //Netherite
    public static final DeferredBlock<Block> NETHERITE_OAK_LOG = registerBlock("netherite_oak_log",
            () -> new ModFlammableRotatedPillarBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_LOG)));
    public static final DeferredBlock<Block> NETHERITE_OAK_WOOD = registerBlock("netherite_oak_wood",
            () -> new ModFlammableRotatedPillarBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_WOOD)));
    public static final DeferredBlock<Block> NETHERITE_OAK_LEAVES = registerBlock("netherite_oak_leaves",
            () -> new LeavesBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_LEAVES)));
    public static final DeferredBlock<Block> NETHERITE_OAK_SAPLING = registerBlock("netherite_oak_sapling",
            () -> new SaplingBlock(ModTreeGrowers.NETHERITE_OAK, BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_SAPLING)));
    public static final DeferredBlock<Block> NETHERITE_AMBER = registerBlock("netherite_amber",
            () -> new ColoredFallingBlock(new ColorRGBA(13214124), BlockBehaviour.Properties.of().strength(0.6f, 0.6f).sound(SoundType.GRAVEL)));
    //Amethyst
    public static final DeferredBlock<Block> AMETHYST_OAK_LOG = registerBlock("amethyst_oak_log",
            () -> new ModFlammableRotatedPillarBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_LOG)));
    public static final DeferredBlock<Block> AMETHYST_OAK_WOOD = registerBlock("amethyst_oak_wood",
            () -> new ModFlammableRotatedPillarBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_WOOD)));
    public static final DeferredBlock<Block> AMETHYST_OAK_LEAVES = registerBlock("amethyst_oak_leaves",
            () -> new LeavesBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_LEAVES)));
    public static final DeferredBlock<Block> AMETHYST_OAK_SAPLING = registerBlock("amethyst_oak_sapling",
            () -> new SaplingBlock(ModTreeGrowers.AMETHYST_OAK, BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_SAPLING)));
    public static final DeferredBlock<Block> AMETHYST_AMBER = registerBlock("amethyst_amber",
            () -> new ColoredFallingBlock(new ColorRGBA(13214124), BlockBehaviour.Properties.of().strength(0.6f, 0.6f).sound(SoundType.GRAVEL)));
    //Emerald
    public static final DeferredBlock<Block> EMERALD_OAK_LOG = registerBlock("emerald_oak_log",
            () -> new ModFlammableRotatedPillarBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_LOG)));
    public static final DeferredBlock<Block> EMERALD_OAK_WOOD = registerBlock("emerald_oak_wood",
            () -> new ModFlammableRotatedPillarBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_WOOD)));
    public static final DeferredBlock<Block> EMERALD_OAK_LEAVES = registerBlock("emerald_oak_leaves",
            () -> new LeavesBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_LEAVES)));
    public static final DeferredBlock<Block> EMERALD_OAK_SAPLING = registerBlock("emerald_oak_sapling",
            () -> new SaplingBlock(ModTreeGrowers.EMERALD_OAK, BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_SAPLING)));
    public static final DeferredBlock<Block> EMERALD_AMBER = registerBlock("emerald_amber",
            () -> new ColoredFallingBlock(new ColorRGBA(13214124), BlockBehaviour.Properties.of().strength(0.6f, 0.6f).sound(SoundType.GRAVEL)));
    //Quartz
    public static final DeferredBlock<Block> QUARTZ_OAK_LOG = registerBlock("quartz_oak_log",
            () -> new ModFlammableRotatedPillarBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_LOG)));
    public static final DeferredBlock<Block> QUARTZ_OAK_WOOD = registerBlock("quartz_oak_wood",
            () -> new ModFlammableRotatedPillarBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_WOOD)));
    public static final DeferredBlock<Block> QUARTZ_OAK_LEAVES = registerBlock("quartz_oak_leaves",
            () -> new LeavesBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_LEAVES)));
    public static final DeferredBlock<Block> QUARTZ_OAK_SAPLING = registerBlock("quartz_oak_sapling",
            () -> new SaplingBlock(ModTreeGrowers.QUARTZ_OAK, BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_SAPLING)));
    public static final DeferredBlock<Block> QUARTZ_AMBER = registerBlock("quartz_amber",
            () -> new ColoredFallingBlock(new ColorRGBA(13214124), BlockBehaviour.Properties.of().strength(0.6f, 0.6f).sound(SoundType.GRAVEL)));
    //Redstone
    public static final DeferredBlock<Block> REDSTONE_OAK_LOG = registerBlock("redstone_oak_log",
            () -> new ModFlammableRotatedPillarBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_LOG)));
    public static final DeferredBlock<Block> REDSTONE_OAK_WOOD = registerBlock("redstone_oak_wood",
            () -> new ModFlammableRotatedPillarBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_WOOD)));
    public static final DeferredBlock<Block> REDSTONE_OAK_LEAVES = registerBlock("redstone_oak_leaves",
            () -> new LeavesBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_LEAVES)));
    public static final DeferredBlock<Block> REDSTONE_OAK_SAPLING = registerBlock("redstone_oak_sapling",
            () -> new SaplingBlock(ModTreeGrowers.REDSTONE_OAK, BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_SAPLING)));
    public static final DeferredBlock<Block> REDSTONE_AMBER = registerBlock("redstone_amber",
            () -> new ColoredFallingBlock(new ColorRGBA(13214124), BlockBehaviour.Properties.of().strength(0.6f, 0.6f).sound(SoundType.GRAVEL)));
    //Lapis
    public static final DeferredBlock<Block> LAPIS_OAK_LOG = registerBlock("lapis_oak_log",
            () -> new ModFlammableRotatedPillarBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_LOG)));
    public static final DeferredBlock<Block> LAPIS_OAK_WOOD = registerBlock("lapis_oak_wood",
            () -> new ModFlammableRotatedPillarBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_WOOD)));
    public static final DeferredBlock<Block> LAPIS_OAK_LEAVES = registerBlock("lapis_oak_leaves",
            () -> new LeavesBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_LEAVES)));
    public static final DeferredBlock<Block> LAPIS_OAK_SAPLING = registerBlock("lapis_oak_sapling",
            () -> new SaplingBlock(ModTreeGrowers.LAPIS_OAK, BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_SAPLING)));
    public static final DeferredBlock<Block> LAPIS_AMBER = registerBlock("lapis_amber",
            () -> new ColoredFallingBlock(new ColorRGBA(13214124), BlockBehaviour.Properties.of().strength(0.6f, 0.6f).sound(SoundType.GRAVEL)));
    //Stone
    public static final DeferredBlock<Block> STONE_OAK_LOG = registerBlock("stone_oak_log",
            () -> new ModFlammableRotatedPillarBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_LOG)));
    public static final DeferredBlock<Block> STONE_OAK_WOOD = registerBlock("stone_oak_wood",
            () -> new ModFlammableRotatedPillarBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_WOOD)));
    public static final DeferredBlock<Block> STONE_OAK_LEAVES = registerBlock("stone_oak_leaves",
            () -> new LeavesBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_LEAVES)));
    public static final DeferredBlock<Block> STONE_OAK_SAPLING = registerBlock("stone_oak_sapling",
            () -> new SaplingBlock(ModTreeGrowers.STONE_OAK, BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_SAPLING)));
    public static final DeferredBlock<Block> STONE_AMBER = registerBlock("stone_amber",
            () -> new ColoredFallingBlock(new ColorRGBA(13214124), BlockBehaviour.Properties.of().strength(0.6f, 0.6f).sound(SoundType.GRAVEL)));
    //Dirt
    public static final DeferredBlock<Block> DIRT_OAK_LOG = registerBlock("dirt_oak_log",
            () -> new ModFlammableRotatedPillarBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_LOG)));
    public static final DeferredBlock<Block> DIRT_OAK_WOOD = registerBlock("dirt_oak_wood",
            () -> new ModFlammableRotatedPillarBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_WOOD)));
    public static final DeferredBlock<Block> DIRT_OAK_LEAVES = registerBlock("dirt_oak_leaves",
            () -> new LeavesBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_LEAVES)));
    public static final DeferredBlock<Block> DIRT_OAK_SAPLING = registerBlock("dirt_oak_sapling",
            () -> new SaplingBlock(ModTreeGrowers.DIRT_OAK, BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_SAPLING)));
    public static final DeferredBlock<Block> DIRT_AMBER = registerBlock("dirt_amber",
            () -> new ColoredFallingBlock(new ColorRGBA(13214124), BlockBehaviour.Properties.of().strength(0.6f, 0.6f).sound(SoundType.GRAVEL)));
    //Gravel
    public static final DeferredBlock<Block> GRAVEL_OAK_LOG = registerBlock("gravel_oak_log",
            () -> new ModFlammableRotatedPillarBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_LOG)));
    public static final DeferredBlock<Block> GRAVEL_OAK_WOOD = registerBlock("gravel_oak_wood",
            () -> new ModFlammableRotatedPillarBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_WOOD)));
    public static final DeferredBlock<Block> GRAVEL_OAK_LEAVES = registerBlock("gravel_oak_leaves",
            () -> new LeavesBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_LEAVES)));
    public static final DeferredBlock<Block> GRAVEL_OAK_SAPLING = registerBlock("gravel_oak_sapling",
            () -> new SaplingBlock(ModTreeGrowers.GRAVEL_OAK, BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_SAPLING)));
    public static final DeferredBlock<Block> GRAVEL_AMBER = registerBlock("gravel_amber",
            () -> new ColoredFallingBlock(new ColorRGBA(13214124), BlockBehaviour.Properties.of().strength(0.6f, 0.6f).sound(SoundType.GRAVEL)));
    //Sand
    public static final DeferredBlock<Block> SAND_OAK_LOG = registerBlock("sand_oak_log",
            () -> new ModFlammableRotatedPillarBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_LOG)));
    public static final DeferredBlock<Block> SAND_OAK_WOOD = registerBlock("sand_oak_wood",
            () -> new ModFlammableRotatedPillarBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_WOOD)));
    public static final DeferredBlock<Block> SAND_OAK_LEAVES = registerBlock("sand_oak_leaves",
            () -> new LeavesBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_LEAVES)));
    public static final DeferredBlock<Block> SAND_OAK_SAPLING = registerBlock("sand_oak_sapling",
            () -> new SaplingBlock(ModTreeGrowers.SAND_OAK, BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_SAPLING)));
    public static final DeferredBlock<Block> SAND_AMBER = registerBlock("sand_amber",
            () -> new ColoredFallingBlock(new ColorRGBA(13214124), BlockBehaviour.Properties.of().strength(0.6f, 0.6f).sound(SoundType.GRAVEL)));
    //Clay
    public static final DeferredBlock<Block> CLAY_OAK_LOG = registerBlock("clay_oak_log",
            () -> new ModFlammableRotatedPillarBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_LOG)));
    public static final DeferredBlock<Block> CLAY_OAK_WOOD = registerBlock("clay_oak_wood",
            () -> new ModFlammableRotatedPillarBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_WOOD)));
    public static final DeferredBlock<Block> CLAY_OAK_LEAVES = registerBlock("clay_oak_leaves",
            () -> new LeavesBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_LEAVES)));
    public static final DeferredBlock<Block> CLAY_OAK_SAPLING = registerBlock("clay_oak_sapling",
            () -> new SaplingBlock(ModTreeGrowers.CLAY_OAK, BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_SAPLING)));
    public static final DeferredBlock<Block> CLAY_AMBER = registerBlock("clay_amber",
            () -> new ColoredFallingBlock(new ColorRGBA(13214124), BlockBehaviour.Properties.of().strength(0.6f, 0.6f).sound(SoundType.GRAVEL)));

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
