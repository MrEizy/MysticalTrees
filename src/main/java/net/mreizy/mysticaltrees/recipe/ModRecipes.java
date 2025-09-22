package net.mreizy.mysticaltrees.recipe;

import net.minecraft.core.registries.Registries;
import net.minecraft.world.item.crafting.RecipeSerializer;
import net.minecraft.world.item.crafting.RecipeType;
import net.mreizy.mysticaltrees.MysticalTrees;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.registries.DeferredRegister;

public class ModRecipes {
    public static final DeferredRegister<RecipeSerializer<?>> SERIALIZERS =
            DeferredRegister.create(Registries.RECIPE_SERIALIZER, MysticalTrees.MOD_ID);
    public static final DeferredRegister<RecipeType<?>> TYPES =
            DeferredRegister.create(Registries.RECIPE_TYPE, MysticalTrees.MOD_ID);

    public static final DeferredHolder<RecipeSerializer<?>, RecipeSerializer<PedestalRecipe>> PEDESTAL_SERIALIZER =
            SERIALIZERS.register("infusion", PedestalRecipe.Serializer::new);
    public static final DeferredHolder<RecipeType<?>, RecipeType<PedestalRecipe>> PEDESTAL_TYPE =
            TYPES.register("infusion", () -> new RecipeType<PedestalRecipe>() {
                @Override
                public String toString() {
                    return "infusion";
                }
            });


    public static void register(IEventBus eventBus) {
        SERIALIZERS.register(eventBus);
        TYPES.register(eventBus);
    }
}
