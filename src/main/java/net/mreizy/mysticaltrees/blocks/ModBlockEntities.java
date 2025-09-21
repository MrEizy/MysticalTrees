package net.mreizy.mysticaltrees.blocks;

import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.mreizy.mysticaltrees.MysticalTrees;
import net.mreizy.mysticaltrees.blocks.entity.PedestalBlockEntity;
import net.mreizy.mysticaltrees.blocks.entity.SidePedestalBlockEntity;
import net.mreizy.mysticaltrees.blocks.saplings.EtherSaplingBlockEntity;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.function.Supplier;

public class ModBlockEntities {

    public static final DeferredRegister<BlockEntityType<?>> BLOCK_ENTITIES =
            DeferredRegister.create(BuiltInRegistries.BLOCK_ENTITY_TYPE, MysticalTrees.MOD_ID);

    public static  final Supplier<BlockEntityType<EtherSaplingBlockEntity>> ETHER_SAPLING_BE =
            BLOCK_ENTITIES.register("ether_sapling_be",() -> BlockEntityType.Builder.of(
                    EtherSaplingBlockEntity::new,
                    ModBlocks.COAL_OAK_SAPLING.get(),
                    ModBlocks.COPPER_OAK_SAPLING.get(),
                    ModBlocks.IRON_OAK_SAPLING.get(),
                    ModBlocks.GOLD_OAK_SAPLING.get(),
                    ModBlocks.DIAMOND_OAK_SAPLING.get(),
                    ModBlocks.NETHERITE_OAK_SAPLING.get(),
                    ModBlocks.AMETHYST_OAK_SAPLING.get(),
                    ModBlocks.QUARTZ_OAK_SAPLING.get(),
                    ModBlocks.EMERALD_OAK_SAPLING.get(),
                    ModBlocks.REDSTONE_OAK_SAPLING.get(),
                    ModBlocks.LAPIS_OAK_SAPLING.get(),
                    ModBlocks.SAND_OAK_SAPLING.get(),
                    ModBlocks.CLAY_OAK_SAPLING.get(),
                    ModBlocks.GRAVEL_OAK_SAPLING.get(),
                    ModBlocks.STONE_OAK_SAPLING.get(),
                    ModBlocks.DIRT_OAK_SAPLING.get(),
                    ModBlocks.WATER_OAK_SAPLING.get(),
                    ModBlocks.LAVA_OAK_SAPLING.get(),
                    ModBlocks.ICE_OAK_SAPLING.get(),
                    ModBlocks.HONEY_OAK_SAPLING.get(),
                    ModBlocks.DYE_OAK_SAPLING.get()

                    ).build(null));

    public static final Supplier<BlockEntityType<PedestalBlockEntity>> MAIN_PEDESTAL_BE =
            BLOCK_ENTITIES.register("main_pedestal_be", () -> BlockEntityType.Builder.of(
                    PedestalBlockEntity::new, ModBlocks.MAIN_PEDESTAL.get()).build(null));

    public static final Supplier<BlockEntityType<SidePedestalBlockEntity>> SIDE_PEDESTAL_BE =
            BLOCK_ENTITIES.register("side_pedestal_be", () -> BlockEntityType.Builder.of(
                    SidePedestalBlockEntity::new, ModBlocks.SIDE_PEDESTAL.get()).build(null));

    public static void register(IEventBus eventBus){

        BLOCK_ENTITIES.register(eventBus);

    }
}
