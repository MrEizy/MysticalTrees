package net.mreizy.mysticaltrees.datagen;

import net.minecraft.core.Holder;
import net.minecraft.core.HolderLookup;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.loot.BlockLootSubProvider;
import net.minecraft.world.flag.FeatureFlags;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.enchantment.Enchantment;
import net.minecraft.world.item.enchantment.Enchantments;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.storage.loot.LootPool;
import net.minecraft.world.level.storage.loot.LootTable;
import net.minecraft.world.level.storage.loot.entries.AlternativesEntry;
import net.minecraft.world.level.storage.loot.entries.LootItem;
import net.minecraft.world.level.storage.loot.entries.LootPoolSingletonContainer;
import net.minecraft.world.level.storage.loot.functions.ApplyBonusCount;
import net.minecraft.world.level.storage.loot.functions.SetItemCountFunction;
import net.minecraft.world.level.storage.loot.predicates.BonusLevelTableCondition;
import net.minecraft.world.level.storage.loot.predicates.LootItemCondition;
import net.minecraft.world.level.storage.loot.providers.number.ConstantValue;
import net.minecraft.world.level.storage.loot.providers.number.UniformGenerator;
import net.mreizy.mysticaltrees.blocks.ModBlocks;
import net.mreizy.mysticaltrees.items.ModItems;

import java.util.Set;

public class ModBlockLootTableProvider extends BlockLootSubProvider {

    private static final float[] NORMAL_LEAVES_STICK_CHANCES;

    protected ModBlockLootTableProvider(HolderLookup.Provider registries) {
        super(Set.of(), FeatureFlags.REGISTRY.allFlags(), registries);
    }

    @Override
    protected void generate() {

        // COAL
        dropSelf(ModBlocks.COAL_OAK_WOOD.get());
        dropSelf(ModBlocks.COAL_AMBER.get());
        dropSelf(ModBlocks.COAL_OAK_SAPLING.get());
        add(ModBlocks.COAL_OAK_LEAVES.get(), createMystLeafDrop(ModBlocks.COAL_OAK_LEAVES.get(), ModBlocks.COAL_OAK_SAPLING.get(),
                        NORMAL_LEAVES_SAPLING_CHANCES, ModItems.COAL_ACORN.get(), 0.15f));
        add(ModBlocks.COAL_OAK_LOG.get(), createMystLogDrop(ModBlocks.COAL_OAK_LOG.get(), ModItems.COAL_RESIN.get()));

        // COPPER
        add(ModBlocks.COPPER_OAK_LEAVES.get(), createMystLeafDrop(ModBlocks.COPPER_OAK_LEAVES.get(), ModBlocks.COPPER_OAK_SAPLING.get(),
                        NORMAL_LEAVES_SAPLING_CHANCES, ModItems.COPPER_ACORN.get(), 0.15f));
        add(ModBlocks.COPPER_OAK_LOG.get(), createMystLogDrop(ModBlocks.COPPER_OAK_LOG.get(), ModItems.COPPER_RESIN.get()));
        dropSelf(ModBlocks.COPPER_OAK_WOOD.get());
        dropSelf(ModBlocks.COPPER_AMBER.get());
        dropSelf(ModBlocks.COPPER_OAK_SAPLING.get());

        // IRON
        add(ModBlocks.IRON_OAK_LEAVES.get(), createMystLeafDrop(ModBlocks.IRON_OAK_LEAVES.get(), ModBlocks.IRON_OAK_SAPLING.get(),
                NORMAL_LEAVES_SAPLING_CHANCES, ModItems.IRON_ACORN.get(), 0.15f));
        add(ModBlocks.IRON_OAK_LOG.get(), createMystLogDrop(ModBlocks.IRON_OAK_LOG.get(), ModItems.IRON_RESIN.get()));
        dropSelf(ModBlocks.IRON_OAK_WOOD.get());
        dropSelf(ModBlocks.IRON_AMBER.get());
        dropSelf(ModBlocks.IRON_OAK_SAPLING.get());

        // GOLD
        add(ModBlocks.GOLD_OAK_LEAVES.get(), createMystLeafDrop(ModBlocks.GOLD_OAK_LEAVES.get(), ModBlocks.GOLD_OAK_SAPLING.get(),
                NORMAL_LEAVES_SAPLING_CHANCES, ModItems.GOLD_ACORN.get(), 0.15f));
        add(ModBlocks.GOLD_OAK_LOG.get(), createMystLogDrop(ModBlocks.GOLD_OAK_LOG.get(), ModItems.GOLD_RESIN.get()));
        dropSelf(ModBlocks.GOLD_OAK_WOOD.get());
        dropSelf(ModBlocks.GOLD_AMBER.get());
        dropSelf(ModBlocks.GOLD_OAK_SAPLING.get());

        // DIAMOND
        add(ModBlocks.DIAMOND_OAK_LEAVES.get(), createMystLeafDrop(ModBlocks.DIAMOND_OAK_LEAVES.get(), ModBlocks.DIAMOND_OAK_SAPLING.get(),
                NORMAL_LEAVES_SAPLING_CHANCES, ModItems.DIAMOND_ACORN.get(), 0.15f));
        add(ModBlocks.DIAMOND_OAK_LOG.get(), createMystLogDrop(ModBlocks.DIAMOND_OAK_LOG.get(), ModItems.DIAMOND_RESIN.get()));
        dropSelf(ModBlocks.DIAMOND_OAK_WOOD.get());
        dropSelf(ModBlocks.DIAMOND_AMBER.get());
        dropSelf(ModBlocks.DIAMOND_OAK_SAPLING.get());

        // NETHERITE
        add(ModBlocks.NETHERITE_OAK_LEAVES.get(), createMystLeafDrop(ModBlocks.NETHERITE_OAK_LEAVES.get(), ModBlocks.NETHERITE_OAK_SAPLING.get(),
                NORMAL_LEAVES_SAPLING_CHANCES, ModItems.NETHERITE_ACORN.get(), 0.15f));
        add(ModBlocks.NETHERITE_OAK_LOG.get(), createMystLogDrop(ModBlocks.NETHERITE_OAK_LOG.get(), ModItems.NETHERITE_RESIN.get()));
        dropSelf(ModBlocks.NETHERITE_OAK_WOOD.get());
        dropSelf(ModBlocks.NETHERITE_AMBER.get());
        dropSelf(ModBlocks.NETHERITE_OAK_SAPLING.get());

        // AMETHYST
        add(ModBlocks.AMETHYST_OAK_LEAVES.get(), createMystLeafDrop(ModBlocks.AMETHYST_OAK_LEAVES.get(), ModBlocks.AMETHYST_OAK_SAPLING.get(),
                NORMAL_LEAVES_SAPLING_CHANCES, ModItems.AMETHYST_ACORN.get(), 0.15f));
        add(ModBlocks.AMETHYST_OAK_LOG.get(), createMystLogDrop(ModBlocks.AMETHYST_OAK_LOG.get(), ModItems.AMETHYST_RESIN.get()));
        dropSelf(ModBlocks.AMETHYST_OAK_WOOD.get());
        dropSelf(ModBlocks.AMETHYST_AMBER.get());
        dropSelf(ModBlocks.AMETHYST_OAK_SAPLING.get());

        // QUARTZ
        add(ModBlocks.QUARTZ_OAK_LEAVES.get(), createMystLeafDrop(ModBlocks.QUARTZ_OAK_LEAVES.get(), ModBlocks.QUARTZ_OAK_SAPLING.get(),
                NORMAL_LEAVES_SAPLING_CHANCES, ModItems.QUARTZ_ACORN.get(), 0.15f));
        add(ModBlocks.QUARTZ_OAK_LOG.get(), createMystLogDrop(ModBlocks.QUARTZ_OAK_LOG.get(), ModItems.QUARTZ_RESIN.get()));
        dropSelf(ModBlocks.QUARTZ_OAK_WOOD.get());
        dropSelf(ModBlocks.QUARTZ_AMBER.get());
        dropSelf(ModBlocks.QUARTZ_OAK_SAPLING.get());

        // EMERALD
        add(ModBlocks.EMERALD_OAK_LEAVES.get(), createMystLeafDrop(ModBlocks.EMERALD_OAK_LEAVES.get(), ModBlocks.EMERALD_OAK_SAPLING.get(),
                NORMAL_LEAVES_SAPLING_CHANCES, ModItems.EMERALD_ACORN.get(), 0.15f));
        add(ModBlocks.EMERALD_OAK_LOG.get(), createMystLogDrop(ModBlocks.EMERALD_OAK_LOG.get(), ModItems.EMERALD_RESIN.get()));
        dropSelf(ModBlocks.EMERALD_OAK_WOOD.get());
        dropSelf(ModBlocks.EMERALD_AMBER.get());
        dropSelf(ModBlocks.EMERALD_OAK_SAPLING.get());

        // REDSTONE
        add(ModBlocks.REDSTONE_OAK_LEAVES.get(), createMystLeafDrop(ModBlocks.REDSTONE_OAK_LEAVES.get(), ModBlocks.REDSTONE_OAK_SAPLING.get(),
                NORMAL_LEAVES_SAPLING_CHANCES, ModItems.REDSTONE_ACORN.get(), 0.15f));
        add(ModBlocks.REDSTONE_OAK_LOG.get(), createMystLogDrop(ModBlocks.REDSTONE_OAK_LOG.get(), ModItems.REDSTONE_RESIN.get()));
        dropSelf(ModBlocks.REDSTONE_OAK_WOOD.get());
        dropSelf(ModBlocks.REDSTONE_AMBER.get());
        dropSelf(ModBlocks.REDSTONE_OAK_SAPLING.get());

        // LAPIS
        add(ModBlocks.LAPIS_OAK_LEAVES.get(), createMystLeafDrop(ModBlocks.LAPIS_OAK_LEAVES.get(), ModBlocks.LAPIS_OAK_SAPLING.get(),
                NORMAL_LEAVES_SAPLING_CHANCES, ModItems.LAPIS_ACORN.get(), 0.15f));
        add(ModBlocks.LAPIS_OAK_LOG.get(), createMystLogDrop(ModBlocks.LAPIS_OAK_LOG.get(), ModItems.LAPIS_RESIN.get()));
        dropSelf(ModBlocks.LAPIS_OAK_WOOD.get());
        dropSelf(ModBlocks.LAPIS_AMBER.get());
        dropSelf(ModBlocks.LAPIS_OAK_SAPLING.get());

        // STONE
        add(ModBlocks.STONE_OAK_LEAVES.get(), createMystLeafDrop(ModBlocks.STONE_OAK_LEAVES.get(), ModBlocks.STONE_OAK_SAPLING.get(),
                NORMAL_LEAVES_SAPLING_CHANCES, ModItems.STONE_ACORN.get(), 0.15f));
        add(ModBlocks.STONE_OAK_LOG.get(), createMystLogDrop(ModBlocks.STONE_OAK_LOG.get(), ModItems.STONE_RESIN.get()));
        dropSelf(ModBlocks.STONE_OAK_WOOD.get());
        dropSelf(ModBlocks.STONE_AMBER.get());
        dropSelf(ModBlocks.STONE_OAK_SAPLING.get());

        // DIRT
        add(ModBlocks.DIRT_OAK_LEAVES.get(), createMystLeafDrop(ModBlocks.DIRT_OAK_LEAVES.get(), ModBlocks.DIRT_OAK_SAPLING.get(),
                NORMAL_LEAVES_SAPLING_CHANCES, ModItems.DIRT_ACORN.get(), 0.15f));
        add(ModBlocks.DIRT_OAK_LOG.get(), createMystLogDrop(ModBlocks.DIRT_OAK_LOG.get(), ModItems.DIRT_RESIN.get()));
        dropSelf(ModBlocks.DIRT_OAK_WOOD.get());
        dropSelf(ModBlocks.DIRT_AMBER.get());
        dropSelf(ModBlocks.DIRT_OAK_SAPLING.get());

        // SAND
        add(ModBlocks.SAND_OAK_LEAVES.get(), createMystLeafDrop(ModBlocks.SAND_OAK_LEAVES.get(), ModBlocks.SAND_OAK_SAPLING.get(),
                NORMAL_LEAVES_SAPLING_CHANCES, ModItems.SAND_ACORN.get(), 0.15f));
        add(ModBlocks.SAND_OAK_LOG.get(), createMystLogDrop(ModBlocks.SAND_OAK_LOG.get(), ModItems.SAND_RESIN.get()));
        dropSelf(ModBlocks.SAND_OAK_WOOD.get());
        dropSelf(ModBlocks.SAND_AMBER.get());
        dropSelf(ModBlocks.SAND_OAK_SAPLING.get());

        // CLAY
        add(ModBlocks.CLAY_OAK_LEAVES.get(), createMystLeafDrop(ModBlocks.CLAY_OAK_LEAVES.get(), ModBlocks.CLAY_OAK_SAPLING.get(),
                NORMAL_LEAVES_SAPLING_CHANCES, ModItems.CLAY_ACORN.get(), 0.15f));
        add(ModBlocks.CLAY_OAK_LOG.get(), createMystLogDrop(ModBlocks.CLAY_OAK_LOG.get(), ModItems.CLAY_RESIN.get()));
        dropSelf(ModBlocks.CLAY_OAK_WOOD.get());
        dropSelf(ModBlocks.CLAY_AMBER.get());
        dropSelf(ModBlocks.CLAY_OAK_SAPLING.get());

        // GRAVEL
        add(ModBlocks.GRAVEL_OAK_LEAVES.get(), createMystLeafDrop(ModBlocks.GRAVEL_OAK_LEAVES.get(), ModBlocks.GRAVEL_OAK_SAPLING.get(),
                NORMAL_LEAVES_SAPLING_CHANCES, ModItems.GRAVEL_ACORN.get(), 0.15f));
        add(ModBlocks.GRAVEL_OAK_LOG.get(), createMystLogDrop(ModBlocks.GRAVEL_OAK_LOG.get(), ModItems.GRAVEL_RESIN.get()));
        dropSelf(ModBlocks.GRAVEL_OAK_WOOD.get());
        dropSelf(ModBlocks.GRAVEL_AMBER.get());
        dropSelf(ModBlocks.GRAVEL_OAK_SAPLING.get());

        // LAVA
        add(ModBlocks.LAVA_OAK_LEAVES.get(), createMystLeafDrop(ModBlocks.LAVA_OAK_LEAVES.get(), ModBlocks.LAVA_OAK_SAPLING.get(),
                NORMAL_LEAVES_SAPLING_CHANCES, ModItems.LAVA_ACORN.get(), 0.15f));
        add(ModBlocks.LAVA_OAK_LOG.get(), createMystLogDrop(ModBlocks.LAVA_OAK_LOG.get(), ModItems.LAVA_RESIN.get()));
        dropSelf(ModBlocks.LAVA_OAK_WOOD.get());
        dropSelf(ModBlocks.LAVA_AMBER.get());
        dropSelf(ModBlocks.LAVA_OAK_SAPLING.get());

        // DYE
        add(ModBlocks.DYE_OAK_LEAVES.get(), createMystLeafDrop(ModBlocks.DYE_OAK_LEAVES.get(), ModBlocks.DYE_OAK_SAPLING.get(),
                NORMAL_LEAVES_SAPLING_CHANCES, ModItems.DYE_ACORN.get(), 0.15f));
        add(ModBlocks.DYE_OAK_LOG.get(), createMystLogDrop(ModBlocks.DYE_OAK_LOG.get(), ModItems.DYE_RESIN.get()));
        dropSelf(ModBlocks.DYE_OAK_WOOD.get());
        dropSelf(ModBlocks.DYE_AMBER.get());
        dropSelf(ModBlocks.DYE_OAK_SAPLING.get());

    }

    protected LootTable.Builder createMystLogDrop(Block mysticalLog, Item coalResin) {
        return LootTable.lootTable()
                .withPool(LootPool.lootPool()
                        .setRolls(ConstantValue.exactly(1.0F))
                        .add(AlternativesEntry.alternatives(
                                LootItem.lootTableItem(mysticalLog)
                                        .when(hasSilkTouch()),
                                LootItem.lootTableItem(Items.OAK_LOG)
                        ))
                )
                .withPool(LootPool.lootPool()
                        .setRolls(ConstantValue.exactly(1.0F))
                        .when(hasSilkTouch().invert())
                        .add(LootItem.lootTableItem(coalResin)
                                .apply(SetItemCountFunction.setCount(UniformGenerator.between(1.0F, 4.0F)))
                        )
                );
    }

    protected LootTable.Builder createMystLeafDrop(Block leavesBlock, Block saplingBlock, float[] chances, Item customItem, float customChance) {
        HolderLookup.RegistryLookup<Enchantment> registrylookup = this.registries.lookupOrThrow(Registries.ENCHANTMENT);

        return createLeavesDrops(leavesBlock, saplingBlock, chances)
                .withPool(LootPool.lootPool()
                        .setRolls(ConstantValue.exactly(1.0F))
                        .when(HAS_NO_SHEARS_OR_SILK_TOUCH)
                        .add(LootItem.lootTableItem(customItem)
                                .apply(ApplyBonusCount.addBonusBinomialDistributionCount(registrylookup.getOrThrow(Enchantments.FORTUNE), customChance, 1))
                                .when(BonusLevelTableCondition.bonusLevelFlatChance(registrylookup.getOrThrow(Enchantments.FORTUNE),
                                        new float[]{0.05f, customChance, customChance * 1.1f, customChance * 1.25f, customChance * 2.0f}))
                        )
                );
    }

    // Use the standard condition from BlockLootSubProvider
    private final LootItemCondition.Builder HAS_NO_SHEARS_OR_SILK_TOUCH =
            HAS_SHEARS.or(hasSilkTouch()).invert();


    @Override
    protected Iterable<Block> getKnownBlocks() {
        return ModBlocks.BLOCK.getEntries().stream().map(Holder::value)::iterator;
    }


    static {
        //HAS_SHEARS = MatchTool.toolMatches(ItemPredicate.Builder.item().of(new ItemLike[]{Items.SHEARS}));
        NORMAL_LEAVES_STICK_CHANCES = new float[]{0.02F, 0.022222223F, 0.025F, 0.033333335F, 0.1F};
    }
}
