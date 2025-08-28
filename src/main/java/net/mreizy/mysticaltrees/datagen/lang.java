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
        add("item.ascensionitb.jade", "Jade");
        add("item.ascensionitb.raw_jade", "Raw Jade");
        add("item.ascensionitb.regeneration_pill", "Regeneration Pill");

        //Blocks
        add("block.ascensionitb.jade_ore", "Jade Ore");
        add("block.ascensionitb.jade_block", "Jade Block");

        //GUI & Other Stuff
        add("creativetab.ascensionitb.items", "Ascension Items");
        add("creativetab.ascensionitb.blocks", "Ascension Blocks");
        add("effect.ascensionitb.qi_enhanced_regeneration", "Qi Enhanced Regen");
        add("block.ascension.pill_cauldron", "Pill Cauldron");

    }
}
