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
        this.background = helper.createDrawable(TEXTURE, 0, 0, 144, 81);
        this.icon = helper.createDrawableIngredient(VanillaTypes.ITEM_STACK, new ItemStack(ModBlocks.MAIN_PEDESTAL));
    }

    @Override
    public RecipeType<PedestalRecipe> getRecipeType() {
        return PEDESTAL_RECIPE_TYPE;
    }

    @Override
    public Component getTitle() {
        return Component.translatable("jei.mysticaltrees.infusion_crafting");
    }

    @Override
    public @Nullable IDrawable getIcon() {
        return icon;
    }


    @Override
    public int getWidth() {
        return 144; // Width of your background texture
    }

    @Override
    public int getHeight() {
        return 81; // Height of your background texture
    }

    @Override
    public void setRecipe(IRecipeLayoutBuilder builder, PedestalRecipe recipe, IFocusGroup focuses) {
        // Main pedestal input (center slot)
        builder.addSlot(RecipeIngredientRole.INPUT, 33, 33).addIngredients(recipe.getIngredients().get(0));

        // Side pedestal inputs (3x3 grid around the center)
        int[][] sideSlots = {
                {7, 7},  // top-left
                {33, 1},  // top-center
                {59, 7}, // top-right
                {1, 33},  // middle-left
                {59, 59}, // middle-right
                {33, 64},  // bottom-left
                {7, 59},  // bottom-center
                {65, 33}  // bottom-right
        };

        for (int i = 1; i < recipe.getIngredients().size(); i++) {
            if (i - 1 < sideSlots.length) {
                int[] pos = sideSlots[i - 1];
                builder.addSlot(RecipeIngredientRole.INPUT, pos[0], pos[1])
                        .addIngredients(recipe.getIngredients().get(i));
            }
        }

        // Output slot (right side)
        builder.addSlot(RecipeIngredientRole.OUTPUT, 123, 33).addItemStack(recipe.getResultItem(null));
    }

    @Override
    public void draw(PedestalRecipe recipe, IRecipeSlotsView recipeSlotsView, GuiGraphics guiGraphics, double mouseX, double mouseY) {
        background.draw(guiGraphics);

        String etherRequired = recipe.getEther();
        if (etherRequired != null && !etherRequired.isEmpty() && !etherRequired.equals("0")) {
            String etherText = etherRequired + " Ether";
            net.minecraft.client.Minecraft minecraft = net.minecraft.client.Minecraft.getInstance();
            int textWidth = minecraft.font.width(etherText);
            int xPos = 113 + 8 - (textWidth / 2);
            int yPos = 25 - 12;

            // Draw shadow first
            guiGraphics.drawString(minecraft.font, etherText, xPos + 1, yPos + 1, 0x000000, false);
            // Draw main text
            guiGraphics.drawString(minecraft.font, etherText, xPos, yPos, 0x55FF55, false);
        }
    }
}