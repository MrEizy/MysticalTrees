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

        //Items
        add("item.ascensionitb.raw_jade", "Raw Jade");

        //GUI & Other Stuff
        add("creativetab.mysticaltrees.root", "Mystical Trees");

        //Trees
    //Coal Tree
        add("block.mysticaltrees.coal_oak_log", "Coal Oak Log");
        add("block.mysticaltrees.coal_oak_wood", "Coal Oak Wood");
        add("block.mysticaltrees.coal_oak_leaves", "Coal Oak Leaves");
        add("block.mysticaltrees.coal_oak_sapling", "Coal Oak Sapling");
        add("block.mysticaltrees.coal_amber", "Coal Amber");
        add("item.mysticaltrees.coal_resin", "Coal Resin");
        add("item.mysticaltrees.coal_acorn", "Coal Acorn");
    }
}
