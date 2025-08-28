package net.mreizy.mysticaltrees.datagen;

import net.minecraft.data.PackOutput;
import net.mreizy.mysticaltrees.MysticalTrees;
import net.mreizy.mysticaltrees.items.ModItems;
import net.neoforged.neoforge.client.model.generators.ItemModelProvider;
import net.neoforged.neoforge.common.data.ExistingFileHelper;

public class ModItemModelProvider extends ItemModelProvider {
    public ModItemModelProvider(PackOutput output, ExistingFileHelper existingFileHelper) {
        super(output, MysticalTrees.MOD_ID, existingFileHelper);
    }

    @Override
    protected void registerModels() {
        basicItem(ModItems.JADE.get());
        basicItem(ModItems.RAW_JADE.get());
        basicItem(ModItems.REGENERATION_PILL.get());
    }
}
