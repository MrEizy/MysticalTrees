package net.mreizy.mysticaltrees.datagen;

import net.minecraft.data.PackOutput;
import net.mreizy.mysticaltrees.MysticalTrees;
import net.neoforged.neoforge.common.data.LanguageProvider;

public class lang extends LanguageProvider {
    public lang(PackOutput output, String locale) {
        super(output, MysticalTrees.MOD_ID, locale);
    }

    @Override
    protected void addTranslations() {

        //GUI & Other Stuff
        add("creativetab.mysticaltrees.root", "Mystical Trees");
        add("mysticaltrees.config.useEtherMechanics", "Ether Mechanics");
        add("mysticaltrees.config.useEtherMechanics.tooltip", "Whether Saplings uses Ether-Based mechanics (§2True§f) or behaves like a normal Saplings (§4False§f)");
        add("mysticaltrees.configuration.EtherSaplingOptions", "Ether Sapling Options");
        add("mysticaltrees.configuration.EtherSaplingOptions.tooltip", "Here you can change all things related to Ether Mechanics");
        add("mysticaltrees.configuration.section.mysticaltrees.common.toml.title", "All Configs for Mystical Trees");
        add("mysticaltrees.configuration.section.mysticaltrees.common.toml", "All Configs for Mystical Trees");
        add("mysticaltrees.configuration.EtherSaplingOptions.button", "Ether Mechanic");
        add("mysticaltrees.configuration.title", "Mystical Trees");

        // COAL
        add("block.mysticaltrees.coal_oak_log", "Coal Oak Log");
        add("block.mysticaltrees.coal_oak_wood", "Coal Oak Wood");
        add("block.mysticaltrees.coal_oak_leaves", "Coal Oak Leaves");
        add("block.mysticaltrees.coal_oak_sapling", "Coal Oak Sapling");
        add("block.mysticaltrees.coal_amber", "Coal Amber");
        add("item.mysticaltrees.coal_resin", "Coal Resin");
        add("item.mysticaltrees.coal_acorn", "Coal Acorn");

        // COPPER
        add("block.mysticaltrees.copper_oak_log", "Copper Oak Log");
        add("block.mysticaltrees.copper_oak_wood", "Copper Oak Wood");
        add("block.mysticaltrees.copper_oak_leaves", "Copper Oak Leaves");
        add("block.mysticaltrees.copper_oak_sapling", "Copper Oak Sapling");
        add("block.mysticaltrees.copper_amber", "Copper Amber");
        add("item.mysticaltrees.copper_resin", "Copper Resin");
        add("item.mysticaltrees.copper_acorn", "Copper Acorn");

        // IRON
        add("block.mysticaltrees.iron_oak_log", "Iron Oak Log");
        add("block.mysticaltrees.iron_oak_wood", "Iron Oak Wood");
        add("block.mysticaltrees.iron_oak_leaves", "Iron Oak Leaves");
        add("block.mysticaltrees.iron_oak_sapling", "Iron Oak Sapling");
        add("block.mysticaltrees.iron_amber", "Iron Amber");
        add("item.mysticaltrees.iron_resin", "Iron Resin");
        add("item.mysticaltrees.iron_acorn", "Iron Acorn");

        // GOLD
        add("block.mysticaltrees.gold_oak_log", "Gold Oak Log");
        add("block.mysticaltrees.gold_oak_wood", "Gold Oak Wood");
        add("block.mysticaltrees.gold_oak_leaves", "Gold Oak Leaves");
        add("block.mysticaltrees.gold_oak_sapling", "Gold Oak Sapling");
        add("block.mysticaltrees.gold_amber", "Gold Amber");
        add("item.mysticaltrees.gold_resin", "Gold Resin");
        add("item.mysticaltrees.gold_acorn", "Gold Acorn");

        // DIAMOND
        add("block.mysticaltrees.diamond_oak_log", "Diamond Oak Log");
        add("block.mysticaltrees.diamond_oak_wood", "Diamond Oak Wood");
        add("block.mysticaltrees.diamond_oak_leaves", "Diamond Oak Leaves");
        add("block.mysticaltrees.diamond_oak_sapling", "Diamond Oak Sapling");
        add("block.mysticaltrees.diamond_amber", "Diamond Amber");
        add("item.mysticaltrees.diamond_resin", "Diamond Resin");
        add("item.mysticaltrees.diamond_acorn", "Diamond Acorn");

        // NETHERITE
        add("block.mysticaltrees.netherite_oak_log", "Netherite Oak Log");
        add("block.mysticaltrees.netherite_oak_wood", "Netherite Oak Wood");
        add("block.mysticaltrees.netherite_oak_leaves", "Netherite Oak Leaves");
        add("block.mysticaltrees.netherite_oak_sapling", "Netherite Oak Sapling");
        add("block.mysticaltrees.netherite_amber", "Netherite Amber");
        add("item.mysticaltrees.netherite_resin", "Netherite Resin");
        add("item.mysticaltrees.netherite_acorn", "Netherite Acorn");

        // AMETHYST
        add("block.mysticaltrees.amethyst_oak_log", "Amethyst Oak Log");
        add("block.mysticaltrees.amethyst_oak_wood", "Amethyst Oak Wood");
        add("block.mysticaltrees.amethyst_oak_leaves", "Amethyst Oak Leaves");
        add("block.mysticaltrees.amethyst_oak_sapling", "Amethyst Oak Sapling");
        add("block.mysticaltrees.amethyst_amber", "Amethyst Amber");
        add("item.mysticaltrees.amethyst_resin", "Amethyst Resin");
        add("item.mysticaltrees.amethyst_acorn", "Amethyst Acorn");

        // QUARTZ
        add("block.mysticaltrees.quartz_oak_log", "Quartz Oak Log");
        add("block.mysticaltrees.quartz_oak_wood", "Quartz Oak Wood");
        add("block.mysticaltrees.quartz_oak_leaves", "Quartz Oak Leaves");
        add("block.mysticaltrees.quartz_oak_sapling", "Quartz Oak Sapling");
        add("block.mysticaltrees.quartz_amber", "Quartz Amber");
        add("item.mysticaltrees.quartz_resin", "Quartz Resin");
        add("item.mysticaltrees.quartz_acorn", "Quartz Acorn");

        // EMERALD
        add("block.mysticaltrees.emerald_oak_log", "Emerald Oak Log");
        add("block.mysticaltrees.emerald_oak_wood", "Emerald Oak Wood");
        add("block.mysticaltrees.emerald_oak_leaves", "Emerald Oak Leaves");
        add("block.mysticaltrees.emerald_oak_sapling", "Emerald Oak Sapling");
        add("block.mysticaltrees.emerald_amber", "Emerald Amber");
        add("item.mysticaltrees.emerald_resin", "Emerald Resin");
        add("item.mysticaltrees.emerald_acorn", "Emerald Acorn");

        // REDSTONE
        add("block.mysticaltrees.redstone_oak_log", "Redstone Oak Log");
        add("block.mysticaltrees.redstone_oak_wood", "Redstone Oak Wood");
        add("block.mysticaltrees.redstone_oak_leaves", "Redstone Oak Leaves");
        add("block.mysticaltrees.redstone_oak_sapling", "Redstone Oak Sapling");
        add("block.mysticaltrees.redstone_amber", "Redstone Amber");
        add("item.mysticaltrees.redstone_resin", "Redstone Resin");
        add("item.mysticaltrees.redstone_acorn", "Redstone Acorn");

        // LAPIS
        add("block.mysticaltrees.lapis_oak_log", "Lapis Oak Log");
        add("block.mysticaltrees.lapis_oak_wood", "Lapis Oak Wood");
        add("block.mysticaltrees.lapis_oak_leaves", "Lapis Oak Leaves");
        add("block.mysticaltrees.lapis_oak_sapling", "Lapis Oak Sapling");
        add("block.mysticaltrees.lapis_amber", "Lapis Amber");
        add("item.mysticaltrees.lapis_resin", "Lapis Resin");
        add("item.mysticaltrees.lapis_acorn", "Lapis Acorn");

        // STONE
        add("block.mysticaltrees.stone_oak_log", "Stone Oak Log");
        add("block.mysticaltrees.stone_oak_wood", "Stone Oak Wood");
        add("block.mysticaltrees.stone_oak_leaves", "Stone Oak Leaves");
        add("block.mysticaltrees.stone_oak_sapling", "Stone Oak Sapling");
        add("block.mysticaltrees.stone_amber", "Stone Amber");
        add("item.mysticaltrees.stone_resin", "Stone Resin");
        add("item.mysticaltrees.stone_acorn", "Stone Acorn");
        add("tooltip.mysticaltrees.stone_acorn", "Omniscient & Omnipresent Stone Acorn");

        // DIRT
        add("block.mysticaltrees.dirt_oak_log", "Dirt Oak Log");
        add("block.mysticaltrees.dirt_oak_wood", "Dirt Oak Wood");
        add("block.mysticaltrees.dirt_oak_leaves", "Dirt Oak Leaves");
        add("block.mysticaltrees.dirt_oak_sapling", "Dirt Oak Sapling");
        add("block.mysticaltrees.dirt_amber", "Dirt Amber");
        add("item.mysticaltrees.dirt_resin", "Dirt Resin");
        add("item.mysticaltrees.dirt_acorn", "Dirt Acorn");

        // SAND
        add("block.mysticaltrees.sand_oak_log", "Sand Oak Log");
        add("block.mysticaltrees.sand_oak_wood", "Sand Oak Wood");
        add("block.mysticaltrees.sand_oak_leaves", "Sand Oak Leaves");
        add("block.mysticaltrees.sand_oak_sapling", "Sand Oak Sapling");
        add("block.mysticaltrees.sand_amber", "Sand Amber");
        add("item.mysticaltrees.sand_resin", "Sand Resin");
        add("item.mysticaltrees.sand_acorn", "Sand Acorn");

        // CLAY
        add("block.mysticaltrees.clay_oak_log", "Clay Oak Log");
        add("block.mysticaltrees.clay_oak_wood", "Clay Oak Wood");
        add("block.mysticaltrees.clay_oak_leaves", "Clay Oak Leaves");
        add("block.mysticaltrees.clay_oak_sapling", "Clay Oak Sapling");
        add("block.mysticaltrees.clay_amber", "Clay Amber");
        add("item.mysticaltrees.clay_resin", "Clay Resin");
        add("item.mysticaltrees.clay_acorn", "Clay Acorn");

        // GRAVEL
        add("block.mysticaltrees.gravel_oak_log", "Gravel Oak Log");
        add("block.mysticaltrees.gravel_oak_wood", "Gravel Oak Wood");
        add("block.mysticaltrees.gravel_oak_leaves", "Gravel Oak Leaves");
        add("block.mysticaltrees.gravel_oak_sapling", "Gravel Oak Sapling");
        add("block.mysticaltrees.gravel_amber", "Gravel Amber");
        add("item.mysticaltrees.gravel_resin", "Gravel Resin");
        add("item.mysticaltrees.gravel_acorn", "Gravel Acorn");

        // LAVA
        add("block.mysticaltrees.lava_oak_log", "Lava Oak Log");
        add("block.mysticaltrees.lava_oak_wood", "Lava Oak Wood");
        add("block.mysticaltrees.lava_oak_leaves", "Lava Oak Leaves");
        add("block.mysticaltrees.lava_oak_sapling", "Lava Oak Sapling");
        add("block.mysticaltrees.lava_amber", "Lava Amber");
        add("item.mysticaltrees.lava_resin", "Lava Resin");
        add("item.mysticaltrees.lava_acorn", "Lava Acorn");
        // WATER
        add("block.mysticaltrees.water_oak_log", "Water Oak Log");
        add("block.mysticaltrees.water_oak_wood", "Water Oak Wood");
        add("block.mysticaltrees.water_oak_leaves", "Water Oak Leaves");
        add("block.mysticaltrees.water_oak_sapling", "Water Oak Sapling");
        add("block.mysticaltrees.water_amber", "Water Amber");
        add("item.mysticaltrees.water_resin", "Water Resin");
        add("item.mysticaltrees.water_acorn", "Water Acorn");
        // ICE
        add("block.mysticaltrees.ice_oak_log", "Ice Oak Log");
        add("block.mysticaltrees.ice_oak_wood", "Ice Oak Wood");
        add("block.mysticaltrees.ice_oak_leaves", "Ice Oak Leaves");
        add("block.mysticaltrees.ice_oak_sapling", "Ice Oak Sapling");
        add("block.mysticaltrees.ice_amber", "Ice Amber");
        add("item.mysticaltrees.ice_resin", "Ice Resin");
        add("item.mysticaltrees.ice_acorn", "Ice Acorn");

        // DYE
        add("block.mysticaltrees.dye_oak_log", "Dye Oak Log");
        add("block.mysticaltrees.dye_oak_wood", "Dye Oak Wood");
        add("block.mysticaltrees.dye_oak_leaves", "Dye Oak Leaves");
        add("block.mysticaltrees.dye_oak_sapling", "Dye Oak Sapling");
        add("block.mysticaltrees.dye_amber", "Dye Amber");
        add("item.mysticaltrees.dye_resin", "Dye Resin");
        add("item.mysticaltrees.dye_acorn", "Dye Acorn");
        add("tooltip.mysticaltrees.dye_acorn", "Omniscient & Omnipresent Dye Acorn");

        // HONEY
        add("block.mysticaltrees.honey_oak_log", "Honey Oak Log");
        add("block.mysticaltrees.honey_oak_wood", "Honey Oak Wood");
        add("block.mysticaltrees.honey_oak_leaves", "Honey Oak Leaves");
        add("block.mysticaltrees.honey_oak_sapling", "Honey Oak Sapling");
        add("block.mysticaltrees.honey_amber", "Honey Amber");
        add("item.mysticaltrees.honey_resin", "Honey Resin");
        add("item.mysticaltrees.honey_acorn", "Honey Acorn");

    }
}
