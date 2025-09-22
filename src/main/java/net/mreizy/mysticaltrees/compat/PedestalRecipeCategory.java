package net.mreizy.mysticaltrees.compat;

import mezz.jei.api.constants.VanillaTypes;
import mezz.jei.api.gui.builder.IRecipeLayoutBuilder;
import mezz.jei.api.gui.drawable.IDrawable;
import mezz.jei.api.gui.ingredient.IRecipeSlotsView;
import mezz.jei.api.helpers.IGuiHelper;
import mezz.jei.api.recipe.IFocusGroup;
import mezz.jei.api.recipe.RecipeIngredientRole;
import mezz.jei.api.recipe.RecipeType;
import mezz.jei.api.recipe.category.IRecipeCategory;
import net.minecraft.client.gui.GuiGraphics;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.ItemStack;
import net.mreizy.mysticaltrees.MysticalTrees;
import net.mreizy.mysticaltrees.blocks.ModBlocks;
import net.mreizy.mysticaltrees.recipe.PedestalRecipe;
import org.jetbrains.annotations.Nullable;

public class PedestalRecipeCategory implements IRecipeCategory<PedestalRecipe> {
    public static final ResourceLocation UID = ResourceLocation.fromNamespaceAndPath(MysticalTrees.MOD_ID, "infusion");
    public static final ResourceLocation TEXTURE = ResourceLocation.fromNamespaceAndPath(MysticalTrees.MOD_ID, "textures/jei/infusion.png");


    public static final RecipeType<PedestalRecipe> PEDESTAL_RECIPE_TYPE =
            new RecipeType<>(UID, PedestalRecipe.class);

    private final IDrawable background;
    private final IDrawable icon;

    public PedestalRecipeCategory(IGuiHelper helper) {
        this.background = helper.createDrawable(TEXTURE, 0, 0, 176, 86);
        this.icon = helper.createDrawableIngredient(VanillaTypes.ITEM_STACK, new ItemStack(ModBlocks.SIDE_PEDESTAL));
    }

    @Override
    public RecipeType<PedestalRecipe> getRecipeType() {
        return PEDESTAL_RECIPE_TYPE;
    }

    @Override
    public Component getTitle() {
        return Component.translatable("block.mysticaltrees.side_pedestal");
    }

    @Override
    public @Nullable IDrawable getIcon() {
        return icon;
    }

    @Override
    public void setRecipe(IRecipeLayoutBuilder builder, PedestalRecipe recipe, IFocusGroup focuses) {
        builder.addSlot(RecipeIngredientRole.INPUT, 54, 34).addIngredients(recipe.getIngredients().get(0));

        builder.addSlot(RecipeIngredientRole.OUTPUT, 104, 34).addItemStack(recipe.getResultItem(null));
    }

    @Override
    public void draw(PedestalRecipe recipe, IRecipeSlotsView recipeSlotsView, GuiGraphics guiGraphics, double mouseX, double mouseY) {
        IRecipeCategory.super.draw(recipe, recipeSlotsView, guiGraphics, mouseX, mouseY);
        background.draw(guiGraphics);
    }
}
