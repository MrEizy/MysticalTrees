package net.mreizy.mysticaltrees.guis;

import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.mreizy.mysticaltrees.MysticalTrees;
import net.mreizy.mysticaltrees.blocks.ModBlocks;
import net.mreizy.mysticaltrees.items.ModItems;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.function.Supplier;

public class ModCreativeModeTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TAB =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, MysticalTrees.MOD_ID);

    public static final Supplier<CreativeModeTab> ASCENSION_ITEMS_TAB = CREATIVE_MODE_TAB.register("mysticaltrees_main",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.COAL_RESIN.get()))
                    .title(Component.translatable("creativetab.mysticaltrees.root"))
                    .displayItems((itemDisplayParameters, output) -> {
                        output.accept(ModBlocks.MAIN_PEDESTAL);
                        output.accept(ModBlocks.SIDE_PEDESTAL);
                        output.accept(ModItems.KNIFE);
                        output.accept(ModItems.VIAL_EMPTY);
                        output.accept(ModItems.VIAL_BLOOD);



                        output.accept(ModBlocks.STONE_OAK_LOG);
                        output.accept(ModBlocks.STONE_OAK_WOOD);
                        output.accept(ModBlocks.STONE_OAK_LEAVES);
                        output.accept(ModBlocks.STONE_AMBER);
                        output.accept(ModBlocks.STONE_OAK_SAPLING);
                        output.accept(ModItems.STONE_RESIN);
                        output.accept(ModItems.STONE_ACORN);
                        output.accept(ModBlocks.DIRT_OAK_LOG);
                        output.accept(ModBlocks.DIRT_OAK_WOOD);
                        output.accept(ModBlocks.DIRT_OAK_LEAVES);
                        output.accept(ModBlocks.DIRT_AMBER);
                        output.accept(ModBlocks.DIRT_OAK_SAPLING);
                        output.accept(ModItems.DIRT_RESIN);
                        output.accept(ModItems.DIRT_ACORN);
                        output.accept(ModBlocks.SAND_OAK_LOG);
                        output.accept(ModBlocks.SAND_OAK_WOOD);
                        output.accept(ModBlocks.SAND_OAK_LEAVES);
                        output.accept(ModBlocks.SAND_AMBER);
                        output.accept(ModBlocks.SAND_OAK_SAPLING);
                        output.accept(ModItems.SAND_RESIN);
                        output.accept(ModItems.SAND_ACORN);
                        output.accept(ModBlocks.CLAY_OAK_LOG);
                        output.accept(ModBlocks.CLAY_OAK_WOOD);
                        output.accept(ModBlocks.CLAY_OAK_LEAVES);
                        output.accept(ModBlocks.CLAY_AMBER);
                        output.accept(ModBlocks.CLAY_OAK_SAPLING);
                        output.accept(ModItems.CLAY_RESIN);
                        output.accept(ModItems.CLAY_ACORN);
                        output.accept(ModBlocks.GRAVEL_OAK_LOG);
                        output.accept(ModBlocks.GRAVEL_OAK_WOOD);
                        output.accept(ModBlocks.GRAVEL_OAK_LEAVES);
                        output.accept(ModBlocks.GRAVEL_AMBER);
                        output.accept(ModBlocks.GRAVEL_OAK_SAPLING);
                        output.accept(ModItems.GRAVEL_RESIN);
                        output.accept(ModItems.GRAVEL_ACORN);
                        output.accept(ModBlocks.LAVA_OAK_LOG);
                        output.accept(ModBlocks.LAVA_OAK_WOOD);
                        output.accept(ModBlocks.LAVA_OAK_LEAVES);
                        output.accept(ModBlocks.LAVA_AMBER);
                        output.accept(ModBlocks.LAVA_OAK_SAPLING);
                        output.accept(ModItems.LAVA_RESIN);
                        output.accept(ModItems.LAVA_ACORN);
                        output.accept(ModBlocks.WATER_OAK_LOG);
                        output.accept(ModBlocks.WATER_OAK_WOOD);
                        output.accept(ModBlocks.WATER_OAK_LEAVES);
                        output.accept(ModBlocks.WATER_AMBER);
                        output.accept(ModBlocks.WATER_OAK_SAPLING);
                        output.accept(ModItems.WATER_RESIN);
                        output.accept(ModItems.WATER_ACORN);
                        output.accept(ModBlocks.ICE_OAK_LOG);
                        output.accept(ModBlocks.ICE_OAK_WOOD);
                        output.accept(ModBlocks.ICE_OAK_LEAVES);
                        output.accept(ModBlocks.ICE_AMBER);
                        output.accept(ModBlocks.ICE_OAK_SAPLING);
                        output.accept(ModItems.ICE_RESIN);
                        output.accept(ModItems.ICE_ACORN);
                        output.accept(ModBlocks.DYE_OAK_LOG);
                        output.accept(ModBlocks.DYE_OAK_WOOD);
                        output.accept(ModBlocks.DYE_OAK_LEAVES);
                        output.accept(ModBlocks.DYE_AMBER);
                        output.accept(ModBlocks.DYE_OAK_SAPLING);
                        output.accept(ModItems.DYE_RESIN);
                        output.accept(ModItems.DYE_ACORN);
                        output.accept(ModBlocks.HONEY_OAK_LOG);
                        output.accept(ModBlocks.HONEY_OAK_WOOD);
                        output.accept(ModBlocks.HONEY_OAK_LEAVES);
                        output.accept(ModBlocks.HONEY_AMBER);
                        output.accept(ModBlocks.HONEY_OAK_SAPLING);
                        output.accept(ModItems.HONEY_RESIN);
                        output.accept(ModItems.HONEY_ACORN);

                        output.accept(ModBlocks.COAL_OAK_LOG);
                        output.accept(ModBlocks.COAL_OAK_WOOD);
                        output.accept(ModBlocks.COAL_OAK_LEAVES);
                        output.accept(ModBlocks.COAL_AMBER);
                        output.accept(ModBlocks.COAL_OAK_SAPLING);
                        output.accept(ModItems.COAL_RESIN);
                        output.accept(ModItems.COAL_ACORN);
                        output.accept(ModBlocks.AMETHYST_OAK_LOG);
                        output.accept(ModBlocks.AMETHYST_OAK_WOOD);
                        output.accept(ModBlocks.AMETHYST_OAK_LEAVES);
                        output.accept(ModBlocks.AMETHYST_AMBER);
                        output.accept(ModBlocks.AMETHYST_OAK_SAPLING);
                        output.accept(ModItems.AMETHYST_RESIN);
                        output.accept(ModItems.AMETHYST_ACORN);
                        output.accept(ModBlocks.QUARTZ_OAK_LOG);
                        output.accept(ModBlocks.QUARTZ_OAK_WOOD);
                        output.accept(ModBlocks.QUARTZ_OAK_LEAVES);
                        output.accept(ModBlocks.QUARTZ_AMBER);
                        output.accept(ModBlocks.QUARTZ_OAK_SAPLING);
                        output.accept(ModItems.QUARTZ_RESIN);
                        output.accept(ModItems.QUARTZ_ACORN);
                        output.accept(ModBlocks.REDSTONE_OAK_LOG);
                        output.accept(ModBlocks.REDSTONE_OAK_WOOD);
                        output.accept(ModBlocks.REDSTONE_OAK_LEAVES);
                        output.accept(ModBlocks.REDSTONE_AMBER);
                        output.accept(ModBlocks.REDSTONE_OAK_SAPLING);
                        output.accept(ModItems.REDSTONE_RESIN);
                        output.accept(ModItems.REDSTONE_ACORN);
                        output.accept(ModBlocks.LAPIS_OAK_LOG);
                        output.accept(ModBlocks.LAPIS_OAK_WOOD);
                        output.accept(ModBlocks.LAPIS_OAK_LEAVES);
                        output.accept(ModBlocks.LAPIS_AMBER);
                        output.accept(ModBlocks.LAPIS_OAK_SAPLING);
                        output.accept(ModItems.LAPIS_RESIN);
                        output.accept(ModItems.LAPIS_ACORN);
                        output.accept(ModBlocks.COPPER_OAK_LOG);
                        output.accept(ModBlocks.COPPER_OAK_WOOD);
                        output.accept(ModBlocks.COPPER_OAK_LEAVES);
                        output.accept(ModBlocks.COPPER_AMBER);
                        output.accept(ModBlocks.COPPER_OAK_SAPLING);
                        output.accept(ModItems.COPPER_RESIN);
                        output.accept(ModItems.COPPER_ACORN);
                        output.accept(ModBlocks.GOLD_OAK_LOG);
                        output.accept(ModBlocks.GOLD_OAK_WOOD);
                        output.accept(ModBlocks.GOLD_OAK_LEAVES);
                        output.accept(ModBlocks.GOLD_AMBER);
                        output.accept(ModBlocks.GOLD_OAK_SAPLING);
                        output.accept(ModItems.GOLD_RESIN);
                        output.accept(ModItems.GOLD_ACORN);
                        output.accept(ModBlocks.IRON_OAK_LOG);
                        output.accept(ModBlocks.IRON_OAK_WOOD);
                        output.accept(ModBlocks.IRON_OAK_LEAVES);
                        output.accept(ModBlocks.IRON_AMBER);
                        output.accept(ModBlocks.IRON_OAK_SAPLING);
                        output.accept(ModItems.IRON_RESIN);
                        output.accept(ModItems.IRON_ACORN);
                        output.accept(ModBlocks.DIAMOND_OAK_LOG);
                        output.accept(ModBlocks.DIAMOND_OAK_WOOD);
                        output.accept(ModBlocks.DIAMOND_OAK_LEAVES);
                        output.accept(ModBlocks.DIAMOND_AMBER);
                        output.accept(ModBlocks.DIAMOND_OAK_SAPLING);
                        output.accept(ModItems.DIAMOND_RESIN);
                        output.accept(ModItems.DIAMOND_ACORN);
                        output.accept(ModBlocks.NETHERITE_OAK_LOG);
                        output.accept(ModBlocks.NETHERITE_OAK_WOOD);
                        output.accept(ModBlocks.NETHERITE_OAK_LEAVES);
                        output.accept(ModBlocks.NETHERITE_AMBER);
                        output.accept(ModBlocks.NETHERITE_OAK_SAPLING);
                        output.accept(ModItems.NETHERITE_RESIN);
                        output.accept(ModItems.NETHERITE_ACORN);
                    }).build());

    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TAB.register(eventBus);
    }
}
