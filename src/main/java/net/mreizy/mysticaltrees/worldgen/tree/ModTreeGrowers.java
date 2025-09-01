package net.mreizy.mysticaltrees.worldgen.tree;

import net.minecraft.world.level.block.grower.TreeGrower;
import net.mreizy.mysticaltrees.MysticalTrees;
import net.mreizy.mysticaltrees.worldgen.ModConfiguredFeatures;

import java.util.Optional;

public class ModTreeGrowers {
    public static final TreeGrower COAL_OAK = new TreeGrower(MysticalTrees.MOD_ID + ":coal_oak",
            Optional.empty(), Optional.of(ModConfiguredFeatures.COAL_OAK_KEY), Optional.empty());
}
