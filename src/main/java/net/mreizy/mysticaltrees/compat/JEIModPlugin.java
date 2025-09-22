package net.mreizy.mysticaltrees.compat;

import mezz.jei.api.IModPlugin;
import mezz.jei.api.JeiPlugin;
import mezz.jei.api.registration.IGuiHandlerRegistration;
import mezz.jei.api.registration.IRecipeCatalystRegistration;
import mezz.jei.api.registration.IRecipeCategoryRegistration;
import mezz.jei.api.registration.IRecipeRegistration;
import net.minecraft.client.Minecraft;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.crafting.RecipeHolder;
import net.minecraft.world.item.crafting.RecipeManager;
import net.mreizy.mysticaltrees.MysticalTrees;
import net.mreizy.mysticaltrees.blocks.ModBlocks;
import net.mreizy.mysticaltrees.recipe.ModRecipes;
import net.mreizy.mysticaltrees.recipe.PedestalRecipe;

import java.util.List;

@JeiPlugin
public class JEIModPlugin implements IModPlugin {
    @Override
    public ResourceLocation getPluginUid() {
        return ResourceLocation.fromNamespaceAndPath(MysticalTrees.MOD_ID, "jei_plugin");
    }

    @Override
    public void registerCategories(IRecipeCategoryRegistration registration) {
        registration.addRecipeCategories(new PedestalRecipeCategory(registration.getJeiHelpers().getGuiHelper()));
    }

    @Override
    public void registerRecipes(IRecipeRegistration registration) {
        RecipeManager recipeManager = Minecraft.getInstance().level.getRecipeManager();

        List<PedestalRecipe> pedestalRecipes = recipeManager
                .getAllRecipesFor(ModRecipes.PEDESTAL_TYPE.get()).stream()
                .map(RecipeHolder::value)
                .toList();

        registration.addRecipes(PedestalRecipeCategory.PEDESTAL_RECIPE_TYPE, pedestalRecipes);
    }

    @Override
    public void registerRecipeCatalysts(IRecipeCatalystRegistration registration) {
        // Register MAIN_PEDESTAL as a recipe catalyst for pedestal recipes
        registration.addRecipeCatalyst(
                new ItemStack(ModBlocks.MAIN_PEDESTAL.get()),
                PedestalRecipeCategory.PEDESTAL_RECIPE_TYPE
        );

        // Also register SIDE_PEDESTAL if you want it to show recipes too
        registration.addRecipeCatalyst(
                new ItemStack(ModBlocks.SIDE_PEDESTAL.get()),
                PedestalRecipeCategory.PEDESTAL_RECIPE_TYPE
        );
    }

    @Override
    public void registerGuiHandlers(IGuiHandlerRegistration registration) {
        // Register any GUIs if you have them
    }
}