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


        dropSelf(ModBlocks.COAL_OAK_WOOD.get());
        dropSelf(ModBlocks.COAL_AMBER.get());
        dropSelf(ModBlocks.COAL_OAK_SAPLING.get());
        add(ModBlocks.COAL_OAK_LEAVES.get(), createMystLeafDrop(ModBlocks.COAL_OAK_LEAVES.get(), ModBlocks.COAL_OAK_SAPLING.get(),
                        NORMAL_LEAVES_SAPLING_CHANCES, ModItems.COAL_ACORN.get(), 0.15f));
        add(ModBlocks.COAL_OAK_LOG.get(), createMystLogDrop(ModBlocks.COAL_OAK_LOG.get(), ModItems.COAL_RESIN.get()));



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
