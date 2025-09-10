package net.mreizy.mysticaltrees.datagen;

import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.data.recipes.*;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.crafting.*;
import net.minecraft.world.level.ItemLike;
import net.mreizy.mysticaltrees.MysticalTrees;
import net.mreizy.mysticaltrees.blocks.ModBlocks;
import net.mreizy.mysticaltrees.items.ModItems;
import net.neoforged.neoforge.common.conditions.IConditionBuilder;

import java.util.List;
import java.util.concurrent.CompletableFuture;

public class ModRecipeProvider extends RecipeProvider implements IConditionBuilder {
    public ModRecipeProvider(PackOutput output, CompletableFuture<HolderLookup.Provider> registries) {
        super(output, registries);
    }


    @Override
    protected void buildRecipes(RecipeOutput recipeOutput) {
        /*List<ItemLike> JADE_SMELTABLES = List.of(ModItems.RAW_JADE,
                ModBlocks.JADE_ORE);*/


        // COAL
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.COAL_AMBER.get())
                .pattern("ARA")
                .pattern("RAR")
                .pattern("ARA")
                .define('A', ModItems.COAL_ACORN.get())
                .define('R', ModItems.COAL_RESIN.get())
                .unlockedBy("has_acorn", has(ModItems.COAL_ACORN)).save(recipeOutput);
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, Items.COAL, 8)
                .pattern("AAA")
                .pattern("AAA")
                .pattern("AAA")
                .define('A', ModItems.COAL_ACORN.get())
                .unlockedBy("has_acorn", has(ModItems.COAL_ACORN)).save(recipeOutput);
        // COPPER
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.COPPER_AMBER.get())
                .pattern("ARA")
                .pattern("RAR")
                .pattern("ARA")
                .define('A', ModItems.COPPER_ACORN.get())
                .define('R', ModItems.COPPER_RESIN.get())
                .unlockedBy("has_acorn", has(ModItems.COPPER_ACORN)).save(recipeOutput);
        // IRON
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.IRON_AMBER.get())
                .pattern("ARA")
                .pattern("RAR")
                .pattern("ARA")
                .define('A', ModItems.IRON_ACORN.get())
                .define('R', ModItems.IRON_RESIN.get())
                .unlockedBy("has_acorn", has(ModItems.IRON_ACORN)).save(recipeOutput);
        // GOLD
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.GOLD_AMBER.get())
                .pattern("ARA")
                .pattern("RAR")
                .pattern("ARA")
                .define('A', ModItems.GOLD_ACORN.get())
                .define('R', ModItems.GOLD_RESIN.get())
                .unlockedBy("has_acorn", has(ModItems.GOLD_ACORN)).save(recipeOutput);
        // DIAMOND
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.DIAMOND_AMBER.get())
                .pattern("ARA")
                .pattern("RAR")
                .pattern("ARA")
                .define('A', ModItems.DIAMOND_ACORN.get())
                .define('R', ModItems.DIAMOND_RESIN.get())
                .unlockedBy("has_acorn", has(ModItems.DIAMOND_ACORN)).save(recipeOutput);
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, Items.DIAMOND, 4)
                .pattern("AAA")
                .pattern("AAA")
                .pattern("AAA")
                .define('A', ModItems.DIAMOND_ACORN.get())
                .unlockedBy("has_acorn", has(ModItems.DIAMOND_ACORN)).save(recipeOutput);
        // NETHERITE
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.NETHERITE_AMBER.get())
                .pattern("ARA")
                .pattern("RAR")
                .pattern("ARA")
                .define('A', ModItems.NETHERITE_ACORN.get())
                .define('R', ModItems.NETHERITE_RESIN.get())
                .unlockedBy("has_acorn", has(ModItems.NETHERITE_ACORN)).save(recipeOutput);
        // AMETHYST
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.AMETHYST_AMBER.get())
                .pattern("ARA")
                .pattern("RAR")
                .pattern("ARA")
                .define('A', ModItems.AMETHYST_ACORN.get())
                .define('R', ModItems.AMETHYST_RESIN.get())
                .unlockedBy("has_acorn", has(ModItems.AMETHYST_ACORN)).save(recipeOutput);
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, Items.AMETHYST_SHARD, 8)
                .pattern("AAA")
                .pattern("AAA")
                .pattern("AAA")
                .define('A', ModItems.AMETHYST_ACORN.get())
                .unlockedBy("has_acorn", has(ModItems.AMETHYST_ACORN)).save(recipeOutput);
        // QUARTZ
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.QUARTZ_AMBER.get())
                .pattern("ARA")
                .pattern("RAR")
                .pattern("ARA")
                .define('A', ModItems.QUARTZ_ACORN.get())
                .define('R', ModItems.QUARTZ_RESIN.get())
                .unlockedBy("has_acorn", has(ModItems.QUARTZ_ACORN)).save(recipeOutput);
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, Items.QUARTZ, 8)
                .pattern("AAA")
                .pattern("AAA")
                .pattern("AAA")
                .define('A', ModItems.QUARTZ_ACORN.get())
                .unlockedBy("has_acorn", has(ModItems.QUARTZ_ACORN)).save(recipeOutput);
        // EMERALD
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.EMERALD_AMBER.get())
                .pattern("ARA")
                .pattern("RAR")
                .pattern("ARA")
                .define('A', ModItems.EMERALD_ACORN.get())
                .define('R', ModItems.EMERALD_RESIN.get())
                .unlockedBy("has_acorn", has(ModItems.EMERALD_ACORN)).save(recipeOutput);
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, Items.EMERALD, 4)
                .pattern("AAA")
                .pattern("AAA")
                .pattern("AAA")
                .define('A', ModItems.EMERALD_ACORN.get())
                .unlockedBy("has_acorn", has(ModItems.EMERALD_ACORN)).save(recipeOutput);
        // REDSTONE
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.REDSTONE_AMBER.get())
                .pattern("ARA")
                .pattern("RAR")
                .pattern("ARA")
                .define('A', ModItems.REDSTONE_ACORN.get())
                .define('R', ModItems.REDSTONE_RESIN.get())
                .unlockedBy("has_acorn", has(ModItems.REDSTONE_ACORN)).save(recipeOutput);
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, Items.REDSTONE, 8)
                .pattern("AAA")
                .pattern("AAA")
                .pattern("AAA")
                .define('A', ModItems.REDSTONE_ACORN.get())
                .unlockedBy("has_acorn", has(ModItems.REDSTONE_ACORN)).save(recipeOutput);
        // LAPIS
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.LAPIS_AMBER.get())
                .pattern("ARA")
                .pattern("RAR")
                .pattern("ARA")
                .define('A', ModItems.LAPIS_ACORN.get())
                .define('R', ModItems.LAPIS_RESIN.get())
                .unlockedBy("has_acorn", has(ModItems.LAPIS_ACORN)).save(recipeOutput);
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, Items.LAPIS_LAZULI, 8)
                .pattern("AAA")
                .pattern("AAA")
                .pattern("AAA")
                .define('A', ModItems.LAPIS_ACORN.get())
                .unlockedBy("has_acorn", has(ModItems.LAPIS_ACORN)).save(recipeOutput);

        /*ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.JADE.get(), 9)
                .requires(ModBlocks.JADE_BLOCK)
                .unlockedBy("has_jade_block", has(ModBlocks.JADE_BLOCK)).save(recipeOutput);*/



        /*oreSmelting(recipeOutput, JADE_SMELTABLES, RecipeCategory.MISC, ModItems.JADE.get(), 0.25f, 200, "jade");
        oreBlasting(recipeOutput, JADE_SMELTABLES, RecipeCategory.MISC, ModItems.JADE.get(), 0.30f, 100, "jade");*/


    }


    protected static void oreSmelting(RecipeOutput recipeOutput, List<ItemLike> pIngredients, RecipeCategory pCategory, ItemLike pResult,
                                      float pExperience, int pCookingTIme, String pGroup) {
        oreCooking(recipeOutput, RecipeSerializer.SMELTING_RECIPE, SmeltingRecipe::new, pIngredients, pCategory, pResult,
                pExperience, pCookingTIme, pGroup, "_from_smelting");
    }

    protected static void oreBlasting(RecipeOutput recipeOutput, List<ItemLike> pIngredients, RecipeCategory pCategory, ItemLike pResult,
                                      float pExperience, int pCookingTime, String pGroup) {
        oreCooking(recipeOutput, RecipeSerializer.BLASTING_RECIPE, BlastingRecipe::new, pIngredients, pCategory, pResult,
                pExperience, pCookingTime, pGroup, "_from_blasting");
    }

    protected static <T extends AbstractCookingRecipe> void oreCooking(RecipeOutput recipeOutput, RecipeSerializer<T> pCookingSerializer, AbstractCookingRecipe.Factory<T> factory,
                                                                       List<ItemLike> pIngredients, RecipeCategory pCategory, ItemLike pResult, float pExperience, int pCookingTime, String pGroup, String pRecipeName) {
        for(ItemLike itemlike : pIngredients) {
            SimpleCookingRecipeBuilder.generic(Ingredient.of(itemlike), pCategory, pResult, pExperience, pCookingTime, pCookingSerializer, factory).group(pGroup).unlockedBy(getHasName(itemlike), has(itemlike))
                    .save(recipeOutput, MysticalTrees.MOD_ID + ":" + getItemName(pResult) + pRecipeName + "_" + getItemName(itemlike));
        }
    }
}
