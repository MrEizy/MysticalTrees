package net.mreizy.mysticaltrees.datagen;

import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.data.recipes.*;
import net.minecraft.world.item.DyeColor;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.crafting.*;
import net.minecraft.world.level.ItemLike;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.mreizy.mysticaltrees.MysticalTrees;
import net.mreizy.mysticaltrees.blocks.ModBlocks;
import net.mreizy.mysticaltrees.items.ModItems;
import net.neoforged.neoforge.common.conditions.IConditionBuilder;

import java.util.List;
import java.util.Map;
import java.util.concurrent.CompletableFuture;
import java.util.function.Supplier;

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
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, Items.COAL, 2)
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
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, Items.DIAMOND, 1)
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
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, Items.AMETHYST_SHARD, 2)
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
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, Items.QUARTZ, 2)
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
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, Items.EMERALD, 1)
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
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, Items.REDSTONE, 2)
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
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, Items.LAPIS_LAZULI, 2)
                .pattern("AAA")
                .pattern("AAA")
                .pattern("AAA")
                .define('A', ModItems.LAPIS_ACORN.get())
                .unlockedBy("has_acorn", has(ModItems.LAPIS_ACORN)).save(recipeOutput);
        // STONE
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.STONE_AMBER.get())
                .pattern("ARA")
                .pattern("RAR")
                .pattern("ARA")
                .define('A', ModItems.STONE_ACORN.get())
                .define('R', ModItems.STONE_RESIN.get())
                .unlockedBy("has_acorn", has(ModItems.STONE_ACORN)).save(recipeOutput);
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, Items.DEEPSLATE, 4)
                .pattern("AAA")
                .pattern("AAA")
                .pattern("AAA")
                .define('A', ModItems.STONE_ACORN.get())
                .unlockedBy("has_acorn", has(ModItems.STONE_ACORN)).save(recipeOutput);
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, Items.ANDESITE, 4)
                .pattern("A A")
                .pattern("AAA")
                .pattern("AAA")
                .define('A', ModItems.STONE_ACORN.get())
                .unlockedBy("has_acorn", has(ModItems.STONE_ACORN)).save(recipeOutput);
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, Items.GRANITE, 4)
                .pattern("AAA")
                .pattern("AAA")
                .pattern("A A")
                .define('A', ModItems.STONE_ACORN.get())
                .unlockedBy("has_acorn", has(ModItems.STONE_ACORN)).save(recipeOutput);
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, Items.DIORITE, 4)
                .pattern("AAA")
                .pattern(" AA")
                .pattern("AAA")
                .define('A', ModItems.STONE_ACORN.get())
                .unlockedBy("has_acorn", has(ModItems.STONE_ACORN)).save(recipeOutput);
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, Items.CALCITE, 4)
                .pattern("A A")
                .pattern(" A ")
                .pattern("A A")
                .define('A', ModItems.STONE_ACORN.get())
                .unlockedBy("has_acorn", has(ModItems.STONE_ACORN)).save(recipeOutput);
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, Items.DRIPSTONE_BLOCK, 4)
                .pattern("AAA")
                .pattern("A A")
                .pattern("A A")
                .define('A', ModItems.STONE_ACORN.get())
                .unlockedBy("has_acorn", has(ModItems.STONE_ACORN)).save(recipeOutput);
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, Items.BLACKSTONE, 4)
                .pattern("A A")
                .pattern("A A")
                .pattern("AAA")
                .define('A', ModItems.STONE_ACORN.get())
                .unlockedBy("has_acorn", has(ModItems.STONE_ACORN)).save(recipeOutput);
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, Items.TUFF, 4)
                .pattern("A A")
                .pattern("A A")
                .pattern("A A")
                .define('A', ModItems.STONE_ACORN.get())
                .unlockedBy("has_acorn", has(ModItems.STONE_ACORN)).save(recipeOutput);
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, Items.COBBLESTONE, 4)
                .requires(ModItems.STONE_ACORN, 4)
                .unlockedBy("has_acorn", has(ModItems.STONE_ACORN)).save(recipeOutput);

        // DIRT
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.DIRT_AMBER.get())
                .pattern("ARA")
                .pattern("RAR")
                .pattern("ARA")
                .define('A', ModItems.DIRT_ACORN.get())
                .define('R', ModItems.DIRT_RESIN.get())
                .unlockedBy("has_acorn", has(ModItems.DIRT_ACORN)).save(recipeOutput);
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, Items.DIRT, 4)
                .requires(ModItems.DIRT_ACORN, 4)
                .unlockedBy("has_acorn", has(ModItems.DIRT_ACORN)).save(recipeOutput);

        // SAND
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.SAND_AMBER.get())
                .pattern("ARA")
                .pattern("RAR")
                .pattern("ARA")
                .define('A', ModItems.SAND_ACORN.get())
                .define('R', ModItems.SAND_RESIN.get())
                .unlockedBy("has_acorn", has(ModItems.SAND_ACORN)).save(recipeOutput);
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, Items.SAND, 4)
                .requires(ModItems.SAND_ACORN, 4)
                .unlockedBy("has_acorn", has(ModItems.SAND_ACORN)).save(recipeOutput);

        // CLAY
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.CLAY_AMBER.get())
                .pattern("ARA")
                .pattern("RAR")
                .pattern("ARA")
                .define('A', ModItems.CLAY_ACORN.get())
                .define('R', ModItems.CLAY_RESIN.get())
                .unlockedBy("has_acorn", has(ModItems.CLAY_ACORN)).save(recipeOutput);
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, Items.CLAY_BALL, 4)
                .requires(ModItems.CLAY_ACORN, 4)
                .unlockedBy("has_acorn", has(ModItems.CLAY_ACORN)).save(recipeOutput);

        // GRAVEL
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.GRAVEL_AMBER.get())
                .pattern("ARA")
                .pattern("RAR")
                .pattern("ARA")
                .define('A', ModItems.GRAVEL_ACORN.get())
                .define('R', ModItems.GRAVEL_RESIN.get())
                .unlockedBy("has_acorn", has(ModItems.GRAVEL_ACORN)).save(recipeOutput);
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, Items.GRAVEL, 4)
                .requires(ModItems.GRAVEL_ACORN, 4)
                .unlockedBy("has_acorn", has(ModItems.GRAVEL_ACORN)).save(recipeOutput);

        // LAVA
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.LAVA_AMBER.get())
                .pattern("ARA")
                .pattern("RAR")
                .pattern("ARA")
                .define('A', ModItems.LAVA_ACORN.get())
                .define('R', ModItems.LAVA_RESIN.get())
                .unlockedBy("has_acorn", has(ModItems.LAVA_ACORN)).save(recipeOutput);
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, Items.LAVA_BUCKET, 1)
                .requires(ModItems.LAVA_ACORN, 4)
                .requires(Items.BUCKET)
                .unlockedBy("has_acorn", has(ModItems.LAVA_ACORN)).save(recipeOutput);
        // WATER
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.WATER_AMBER.get())
                .pattern("ARA")
                .pattern("RAR")
                .pattern("ARA")
                .define('A', ModItems.WATER_ACORN.get())
                .define('R', ModItems.WATER_RESIN.get())
                .unlockedBy("has_acorn", has(ModItems.WATER_ACORN)).save(recipeOutput);
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, Items.WATER_BUCKET, 1)
                .requires(ModItems.WATER_ACORN, 4)
                .requires(Items.BUCKET)
                .unlockedBy("has_acorn", has(ModItems.WATER_ACORN)).save(recipeOutput);
        // ICE
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.ICE_AMBER.get())
                .pattern("ARA")
                .pattern("RAR")
                .pattern("ARA")
                .define('A', ModItems.ICE_ACORN.get())
                .define('R', ModItems.ICE_RESIN.get())
                .unlockedBy("has_acorn", has(ModItems.ICE_ACORN)).save(recipeOutput);
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, Items.ICE, 4)
                .pattern("AAA")
                .pattern("A A")
                .pattern("AAA")
                .define('A', ModItems.ICE_ACORN.get())
                .unlockedBy("has_acorn", has(ModItems.ICE_ACORN)).save(recipeOutput);
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, Items.PACKED_ICE, 4)
                .pattern("AAA")
                .pattern("AAA")
                .pattern("AAA")
                .define('A', ModItems.ICE_ACORN.get())
                .unlockedBy("has_acorn", has(ModItems.ICE_ACORN)).save(recipeOutput);
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, Items.SNOW_BLOCK, 4)
                .pattern(" A ")
                .pattern("A A")
                .pattern(" A ")
                .define('A', ModItems.ICE_ACORN.get())
                .unlockedBy("has_acorn", has(ModItems.ICE_ACORN)).save(recipeOutput);

        // DYE
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.DYE_AMBER.get())
                .pattern("ARA")
                .pattern("RAR")
                .pattern("ARA")
                .define('A', ModItems.DYE_ACORN.get())
                .define('R', ModItems.DYE_RESIN.get())
                .unlockedBy("has_acorn", has(ModItems.DYE_ACORN)).save(recipeOutput);
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, Items.WHITE_DYE, 4)
                .pattern("   ")
                .pattern("AAA")
                .pattern("   ")
                .define('A', ModItems.DYE_ACORN.get())
                .unlockedBy("has_acorn", has(ModItems.DYE_ACORN)).save(recipeOutput);
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, Items.LIGHT_GRAY_DYE, 4)
                .pattern("A  ")
                .pattern("A  ")
                .pattern(" A ")
                .define('A', ModItems.DYE_ACORN.get())
                .unlockedBy("has_acorn", has(ModItems.DYE_ACORN)).save(recipeOutput);
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, Items.GRAY_DYE, 4)
                .pattern("  A")
                .pattern(" A ")
                .pattern("A  ")
                .define('A', ModItems.DYE_ACORN.get())
                .unlockedBy("has_acorn", has(ModItems.DYE_ACORN)).save(recipeOutput);
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, Items.BLACK_DYE, 4)
                .pattern("AA ")
                .pattern("  A")
                .pattern("   ")
                .define('A', ModItems.DYE_ACORN.get())
                .unlockedBy("has_acorn", has(ModItems.DYE_ACORN)).save(recipeOutput);
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, Items.BROWN_DYE, 4)
                .pattern(" A ")
                .pattern("A  ")
                .pattern(" A ")
                .define('A', ModItems.DYE_ACORN.get())
                .unlockedBy("has_acorn", has(ModItems.DYE_ACORN)).save(recipeOutput);
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, Items.RED_DYE, 4)
                .pattern(" A ")
                .pattern("A  ")
                .pattern("A  ")
                .define('A', ModItems.DYE_ACORN.get())
                .unlockedBy("has_acorn", has(ModItems.DYE_ACORN)).save(recipeOutput);
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, Items.ORANGE_DYE, 4)
                .pattern("  A")
                .pattern("   ")
                .pattern("AA ")
                .define('A', ModItems.DYE_ACORN.get())
                .unlockedBy("has_acorn", has(ModItems.DYE_ACORN)).save(recipeOutput);
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, Items.YELLOW_DYE, 4)
                .pattern("  A")
                .pattern("A  ")
                .pattern(" A ")
                .define('A', ModItems.DYE_ACORN.get())
                .unlockedBy("has_acorn", has(ModItems.DYE_ACORN)).save(recipeOutput);
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, Items.LIME_DYE, 4)
                .pattern("  A")
                .pattern("  A")
                .pattern("A  ")
                .define('A', ModItems.DYE_ACORN.get())
                .unlockedBy("has_acorn", has(ModItems.DYE_ACORN)).save(recipeOutput);
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, Items.GREEN_DYE, 4)
                .pattern("  A")
                .pattern("AA ")
                .pattern("   ")
                .define('A', ModItems.DYE_ACORN.get())
                .unlockedBy("has_acorn", has(ModItems.DYE_ACORN)).save(recipeOutput);
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, Items.CYAN_DYE, 4)
                .pattern("A A")
                .pattern(" A ")
                .pattern("   ")
                .define('A', ModItems.DYE_ACORN.get())
                .unlockedBy("has_acorn", has(ModItems.DYE_ACORN)).save(recipeOutput);
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, Items.LIGHT_BLUE_DYE, 4)
                .pattern("AA ")
                .pattern("   ")
                .pattern("  A")
                .define('A', ModItems.DYE_ACORN.get())
                .unlockedBy("has_acorn", has(ModItems.DYE_ACORN)).save(recipeOutput);
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, Items.BLUE_DYE, 4)
                .pattern(" A ")
                .pattern("A A")
                .pattern("   ")
                .define('A', ModItems.DYE_ACORN.get())
                .unlockedBy("has_acorn", has(ModItems.DYE_ACORN)).save(recipeOutput);
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, Items.PURPLE_DYE, 4)
                .pattern("  A")
                .pattern("A A")
                .pattern("   ")
                .define('A', ModItems.DYE_ACORN.get())
                .unlockedBy("has_acorn", has(ModItems.DYE_ACORN)).save(recipeOutput);
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, Items.MAGENTA_DYE, 4)
                .pattern(" A ")
                .pattern("  A")
                .pattern("A  ")
                .define('A', ModItems.DYE_ACORN.get())
                .unlockedBy("has_acorn", has(ModItems.DYE_ACORN)).save(recipeOutput);
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, Items.PINK_DYE, 4)
                .pattern("A  ")
                .pattern("   ")
                .pattern("A A")
                .define('A', ModItems.DYE_ACORN.get())
                .unlockedBy("has_acorn", has(ModItems.DYE_ACORN)).save(recipeOutput);

        // HONEY
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.HONEY_AMBER.get())
                .pattern("ARA")
                .pattern("RAR")
                .pattern("ARA")
                .define('A', ModItems.HONEY_ACORN.get())
                .define('R', ModItems.HONEY_RESIN.get())
                .unlockedBy("has_acorn", has(ModItems.HONEY_ACORN)).save(recipeOutput);
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, Items.HONEYCOMB, 4)
                .pattern("AAA")
                .pattern("A A")
                .pattern("AAA")
                .define('A', ModItems.HONEY_ACORN.get())
                .unlockedBy("has_acorn", has(ModItems.HONEY_ACORN)).save(recipeOutput);
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, Items.HONEY_BOTTLE, 1)
                .requires(ModItems.HONEY_RESIN, 1)
                .requires(Items.GLASS_BOTTLE)
                .unlockedBy("has_acorn", has(ModItems.HONEY_ACORN)).save(recipeOutput);

        //Loops
// Define color mappings for concrete powder and concrete
        Map<DyeColor, Supplier<Block>> COLORED_CONCRETE_POWDERS = Map.ofEntries(
                Map.entry(DyeColor.WHITE, () -> Blocks.WHITE_CONCRETE_POWDER),
                Map.entry(DyeColor.LIGHT_GRAY, () -> Blocks.LIGHT_GRAY_CONCRETE_POWDER),
                Map.entry(DyeColor.GRAY, () -> Blocks.GRAY_CONCRETE_POWDER),
                Map.entry(DyeColor.BLACK, () -> Blocks.BLACK_CONCRETE_POWDER),
                Map.entry(DyeColor.BROWN, () -> Blocks.BROWN_CONCRETE_POWDER),
                Map.entry(DyeColor.RED, () -> Blocks.RED_CONCRETE_POWDER),
                Map.entry(DyeColor.ORANGE, () -> Blocks.ORANGE_CONCRETE_POWDER),
                Map.entry(DyeColor.YELLOW, () -> Blocks.YELLOW_CONCRETE_POWDER),
                Map.entry(DyeColor.LIME, () -> Blocks.LIME_CONCRETE_POWDER),
                Map.entry(DyeColor.GREEN, () -> Blocks.GREEN_CONCRETE_POWDER),
                Map.entry(DyeColor.CYAN, () -> Blocks.CYAN_CONCRETE_POWDER),
                Map.entry(DyeColor.LIGHT_BLUE, () -> Blocks.LIGHT_BLUE_CONCRETE_POWDER),
                Map.entry(DyeColor.BLUE, () -> Blocks.BLUE_CONCRETE_POWDER),
                Map.entry(DyeColor.PURPLE, () -> Blocks.PURPLE_CONCRETE_POWDER),
                Map.entry(DyeColor.MAGENTA, () -> Blocks.MAGENTA_CONCRETE_POWDER),
                Map.entry(DyeColor.PINK, () -> Blocks.PINK_CONCRETE_POWDER)
        );

        Map<DyeColor, Supplier<Block>> COLORED_CONCRETE = Map.ofEntries(
                Map.entry(DyeColor.WHITE, () -> Blocks.WHITE_CONCRETE),
                Map.entry(DyeColor.LIGHT_GRAY, () -> Blocks.LIGHT_GRAY_CONCRETE),
                Map.entry(DyeColor.GRAY, () -> Blocks.GRAY_CONCRETE),
                Map.entry(DyeColor.BLACK, () -> Blocks.BLACK_CONCRETE),
                Map.entry(DyeColor.BROWN, () -> Blocks.BROWN_CONCRETE),
                Map.entry(DyeColor.RED, () -> Blocks.RED_CONCRETE),
                Map.entry(DyeColor.ORANGE, () -> Blocks.ORANGE_CONCRETE),
                Map.entry(DyeColor.YELLOW, () -> Blocks.YELLOW_CONCRETE),
                Map.entry(DyeColor.LIME, () -> Blocks.LIME_CONCRETE),
                Map.entry(DyeColor.GREEN, () -> Blocks.GREEN_CONCRETE),
                Map.entry(DyeColor.CYAN, () -> Blocks.CYAN_CONCRETE),
                Map.entry(DyeColor.LIGHT_BLUE, () -> Blocks.LIGHT_BLUE_CONCRETE),
                Map.entry(DyeColor.BLUE, () -> Blocks.BLUE_CONCRETE),
                Map.entry(DyeColor.PURPLE, () -> Blocks.PURPLE_CONCRETE),
                Map.entry(DyeColor.MAGENTA, () -> Blocks.MAGENTA_CONCRETE),
                Map.entry(DyeColor.PINK, () -> Blocks.PINK_CONCRETE)
        );

// Generate recipes for all colors
        COLORED_CONCRETE_POWDERS.forEach((dyeColor, concretePowder) -> {
            ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, COLORED_CONCRETE.get(dyeColor).get(), 8)
                    .pattern("PPP")
                    .pattern("PWP")
                    .pattern("PPP")
                    .define('P', concretePowder.get())
                    .define('W', ModItems.WATER_RESIN.get())
                    .unlockedBy("has_water_resin", has(ModItems.WATER_RESIN.get()))
                    .save(recipeOutput, "mysticaltrees:concrete_hardening/" + dyeColor.getName());
        });



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
