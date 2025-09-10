package net.mreizy.mysticaltrees.items;

import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.food.FoodProperties;

public class ModFoodProperties {
    public static final FoodProperties ACORNS = new FoodProperties.Builder().nutrition(2).saturationModifier(0.2f).fast().build();
}