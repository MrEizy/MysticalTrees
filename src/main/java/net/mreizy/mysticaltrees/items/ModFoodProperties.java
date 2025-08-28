package net.mreizy.mysticaltrees.items;

import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.food.FoodProperties;
import net.mreizy.mysticaltrees.effects.ModEffects;

public class ModFoodProperties {
    public static final FoodProperties REGENERATION_PILL = new FoodProperties.Builder().fast().alwaysEdible()
            .effect(() -> new MobEffectInstance(ModEffects.QI_ENHANCED_REGENERATION, 200), 1f).build();
}