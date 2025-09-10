package net.mreizy.mysticaltrees.worldgen;

import net.minecraft.core.registries.Registries;
import net.minecraft.data.worldgen.BootstrapContext;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.BlockTags;
import net.minecraft.util.valueproviders.ConstantInt;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;
import net.minecraft.world.level.levelgen.feature.Feature;
import net.minecraft.world.level.levelgen.feature.configurations.FeatureConfiguration;
import net.minecraft.world.level.levelgen.feature.configurations.OreConfiguration;
import net.minecraft.world.level.levelgen.feature.configurations.TreeConfiguration;
import net.minecraft.world.level.levelgen.feature.featuresize.TwoLayersFeatureSize;
import net.minecraft.world.level.levelgen.feature.foliageplacers.BlobFoliagePlacer;
import net.minecraft.world.level.levelgen.feature.stateproviders.BlockStateProvider;
import net.minecraft.world.level.levelgen.feature.trunkplacers.StraightTrunkPlacer;
import net.minecraft.world.level.levelgen.feature.trunkplacers.TrunkPlacer;
import net.minecraft.world.level.levelgen.structure.templatesystem.RuleTest;
import net.minecraft.world.level.levelgen.structure.templatesystem.TagMatchTest;
import net.mreizy.mysticaltrees.MysticalTrees;
import net.mreizy.mysticaltrees.blocks.ModBlocks;

import java.util.List;

public class ModConfiguredFeatures {
    //public static final ResourceKey<ConfiguredFeature<?, ?>> OVERWORLD_JADE_ORE_KEY = registerKey("jade_ore");
    public static final ResourceKey<ConfiguredFeature<?, ?>> COAL_OAK_KEY = registerKey("coal_oak");
    public static final ResourceKey<ConfiguredFeature<?, ?>> COPPER_OAK_KEY = registerKey("copper_oak");
    public static final ResourceKey<ConfiguredFeature<?, ?>> IRON_OAK_KEY = registerKey("iron_oak");
    public static final ResourceKey<ConfiguredFeature<?, ?>> GOLD_OAK_KEY = registerKey("gold_oak");
    public static final ResourceKey<ConfiguredFeature<?, ?>> DIAMOND_OAK_KEY = registerKey("diamond_oak");
    public static final ResourceKey<ConfiguredFeature<?, ?>> NETHERITE_OAK_KEY = registerKey("netherite_oak");
    public static final ResourceKey<ConfiguredFeature<?, ?>> AMETHYST_OAK_KEY = registerKey("amethyst_oak");
    public static final ResourceKey<ConfiguredFeature<?, ?>> QUARTZ_OAK_KEY = registerKey("quartz_oak");
    public static final ResourceKey<ConfiguredFeature<?, ?>> EMERALD_OAK_KEY = registerKey("emerald_oak");
    public static final ResourceKey<ConfiguredFeature<?, ?>> REDSTONE_OAK_KEY = registerKey("redstone_oak");
    public static final ResourceKey<ConfiguredFeature<?, ?>> LAPIS_OAK_KEY = registerKey("lapis_oak");

    public static void bootstrap(BootstrapContext<ConfiguredFeature<?, ?>> context) {
        RuleTest stoneReplaceables = new TagMatchTest(BlockTags.DEEPSLATE_ORE_REPLACEABLES);





        register(context, COAL_OAK_KEY, Feature.TREE, new TreeConfiguration.TreeConfigurationBuilder(
                BlockStateProvider.simple(ModBlocks.COAL_OAK_LOG.get()),
                new StraightTrunkPlacer(4, 2, 0),
                BlockStateProvider.simple(ModBlocks.COAL_OAK_LEAVES.get()),
                new BlobFoliagePlacer(ConstantInt.of(2), ConstantInt.of(0), 3),
                new TwoLayersFeatureSize(1, 0, 2)).build());
        register(context, COPPER_OAK_KEY, Feature.TREE, new TreeConfiguration.TreeConfigurationBuilder(
                BlockStateProvider.simple(ModBlocks.COPPER_OAK_LOG.get()),
                new StraightTrunkPlacer(4, 2, 0),
                BlockStateProvider.simple(ModBlocks.COPPER_OAK_LEAVES.get()),
                new BlobFoliagePlacer(ConstantInt.of(2), ConstantInt.of(0), 3),
                new TwoLayersFeatureSize(1, 0, 2)).build());
        register(context, IRON_OAK_KEY, Feature.TREE, new TreeConfiguration.TreeConfigurationBuilder(
                BlockStateProvider.simple(ModBlocks.IRON_OAK_LOG.get()),
                new StraightTrunkPlacer(4, 2, 0),
                BlockStateProvider.simple(ModBlocks.IRON_OAK_LEAVES.get()),
                new BlobFoliagePlacer(ConstantInt.of(2), ConstantInt.of(0), 3),
                new TwoLayersFeatureSize(1, 0, 2)).build());
        register(context, GOLD_OAK_KEY, Feature.TREE, new TreeConfiguration.TreeConfigurationBuilder(
                BlockStateProvider.simple(ModBlocks.GOLD_OAK_LOG.get()),
                new StraightTrunkPlacer(4, 2, 0),
                BlockStateProvider.simple(ModBlocks.GOLD_OAK_LEAVES.get()),
                new BlobFoliagePlacer(ConstantInt.of(2), ConstantInt.of(0), 3),
                new TwoLayersFeatureSize(1, 0, 2)).build());
        register(context, DIAMOND_OAK_KEY, Feature.TREE, new TreeConfiguration.TreeConfigurationBuilder(
                BlockStateProvider.simple(ModBlocks.DIAMOND_OAK_LOG.get()),
                new StraightTrunkPlacer(4, 2, 0),
                BlockStateProvider.simple(ModBlocks.DIAMOND_OAK_LEAVES.get()),
                new BlobFoliagePlacer(ConstantInt.of(2), ConstantInt.of(0), 3),
                new TwoLayersFeatureSize(1, 0, 2)).build());
        register(context, NETHERITE_OAK_KEY, Feature.TREE, new TreeConfiguration.TreeConfigurationBuilder(
                BlockStateProvider.simple(ModBlocks.NETHERITE_OAK_LOG.get()),
                new StraightTrunkPlacer(4, 2, 0),
                BlockStateProvider.simple(ModBlocks.NETHERITE_OAK_LEAVES.get()),
                new BlobFoliagePlacer(ConstantInt.of(2), ConstantInt.of(0), 3),
                new TwoLayersFeatureSize(1, 0, 2)).build());
        register(context, AMETHYST_OAK_KEY, Feature.TREE, new TreeConfiguration.TreeConfigurationBuilder(
                BlockStateProvider.simple(ModBlocks.AMETHYST_OAK_LOG.get()),
                new StraightTrunkPlacer(4, 2, 0),
                BlockStateProvider.simple(ModBlocks.AMETHYST_OAK_LEAVES.get()),
                new BlobFoliagePlacer(ConstantInt.of(2), ConstantInt.of(0), 3),
                new TwoLayersFeatureSize(1, 0, 2)).build());
        register(context, QUARTZ_OAK_KEY, Feature.TREE, new TreeConfiguration.TreeConfigurationBuilder(
                BlockStateProvider.simple(ModBlocks.QUARTZ_OAK_LOG.get()),
                new StraightTrunkPlacer(4, 2, 0),
                BlockStateProvider.simple(ModBlocks.QUARTZ_OAK_LEAVES.get()),
                new BlobFoliagePlacer(ConstantInt.of(2), ConstantInt.of(0), 3),
                new TwoLayersFeatureSize(1, 0, 2)).build());
        register(context, EMERALD_OAK_KEY, Feature.TREE, new TreeConfiguration.TreeConfigurationBuilder(
                BlockStateProvider.simple(ModBlocks.EMERALD_OAK_LOG.get()),
                new StraightTrunkPlacer(4, 2, 0),
                BlockStateProvider.simple(ModBlocks.EMERALD_OAK_LEAVES.get()),
                new BlobFoliagePlacer(ConstantInt.of(2), ConstantInt.of(0), 3),
                new TwoLayersFeatureSize(1, 0, 2)).build());
        register(context, REDSTONE_OAK_KEY, Feature.TREE, new TreeConfiguration.TreeConfigurationBuilder(
                BlockStateProvider.simple(ModBlocks.REDSTONE_OAK_LOG.get()),
                new StraightTrunkPlacer(4, 2, 0),
                BlockStateProvider.simple(ModBlocks.REDSTONE_OAK_LEAVES.get()),
                new BlobFoliagePlacer(ConstantInt.of(2), ConstantInt.of(0), 3),
                new TwoLayersFeatureSize(1, 0, 2)).build());
        register(context, LAPIS_OAK_KEY, Feature.TREE, new TreeConfiguration.TreeConfigurationBuilder(
                BlockStateProvider.simple(ModBlocks.LAPIS_OAK_LOG.get()),
                new StraightTrunkPlacer(4, 2, 0),
                BlockStateProvider.simple(ModBlocks.LAPIS_OAK_LEAVES.get()),
                new BlobFoliagePlacer(ConstantInt.of(2), ConstantInt.of(0), 3),
                new TwoLayersFeatureSize(1, 0, 2)).build());
    }


    public static ResourceKey<ConfiguredFeature<?, ?>> registerKey(String name) {
        return ResourceKey.create(Registries.CONFIGURED_FEATURE, ResourceLocation.fromNamespaceAndPath(MysticalTrees.MOD_ID, name));
    }

    private static <FC extends FeatureConfiguration, F extends Feature<FC>> void register(BootstrapContext<ConfiguredFeature<?, ?>> context,
                                                                                          ResourceKey<ConfiguredFeature<?, ?>> key, F feature, FC configuration) {
        context.register(key, new ConfiguredFeature<>(feature, configuration));
    }
}
