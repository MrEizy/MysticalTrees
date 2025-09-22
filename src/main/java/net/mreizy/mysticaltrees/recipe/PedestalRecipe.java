package net.mreizy.mysticaltrees.recipe;

import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import net.minecraft.core.HolderLookup;
import net.minecraft.core.NonNullList;
import net.minecraft.network.RegistryFriendlyByteBuf;
import net.minecraft.network.codec.StreamCodec;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.crafting.*;
import net.minecraft.world.level.Level;

import java.math.BigDecimal;
import java.nio.charset.Charset;

//temporarily just assume ether
public record PedestalRecipe(NonNullList<Ingredient> ingredients, ItemStack output, String ether) implements Recipe<PedestalRecipeInput> {


    @Override
    public NonNullList<Ingredient> getIngredients() {
        return ingredients;
    }

    @Override
    public boolean matches(PedestalRecipeInput pedestalRecipeInput, Level level) {
        if (level.isClientSide) {
            return false;
        }

        // Check main pedestal item
        if(!ingredients.get(0).test(pedestalRecipeInput.mainPedestalItem())) {
            return false;
        }

        // Check side pedestal items
        for(int i = 0; i < pedestalRecipeInput.sidePedestalItems().size(); i++) {
            if(!ingredients.get(i + 1).test(pedestalRecipeInput.sidePedestalItems().get(i))) {
                return false;
            }
        }

        // REMOVED: Entity type check
        return true;
    }

    @Override
    public ItemStack assemble(PedestalRecipeInput pedestalRecipeInput, HolderLookup.Provider provider) {
        return output.copy();
    }

    @Override
    public boolean canCraftInDimensions(int i, int i1) {
        return true;
    }

    @Override
    public ItemStack getResultItem(HolderLookup.Provider provider) {
        return output;
    }

    @Override
    public RecipeSerializer<?> getSerializer() {
        return ModRecipes.PEDESTAL_SERIALIZER.get();
    }

    @Override
    public RecipeType<?> getType() {
        return ModRecipes.PEDESTAL_TYPE.get();
    }

    public String getEther(){return ether();}

    public static class Serializer implements RecipeSerializer<PedestalRecipe> {
        public static final MapCodec<PedestalRecipe> CODEC = RecordCodecBuilder.mapCodec(inst -> inst.group(
                Ingredient.CODEC_NONEMPTY
                        .listOf()
                        .fieldOf("ingredients")
                        .flatXmap(
                                list -> {
                                    Ingredient[] aingredient = list.toArray(Ingredient[]::new);
                                    return DataResult.success(NonNullList.of(Ingredient.EMPTY, aingredient));
                                },
                                DataResult::success
                        ).forGetter(PedestalRecipe::getIngredients),
                ItemStack.CODEC.fieldOf("result").forGetter(PedestalRecipe::output),
                Codec.STRING.fieldOf("ether").forGetter(PedestalRecipe::getEther)
                // REMOVED: entityType field
        ).apply(inst, PedestalRecipe::new));

        public static final StreamCodec<RegistryFriendlyByteBuf, PedestalRecipe> STREAM_CODEC = StreamCodec.of(
                PedestalRecipe.Serializer::toNetwork, PedestalRecipe.Serializer::fromNetwork);

        @Override
        public MapCodec<PedestalRecipe> codec() {
            return CODEC;
        }

        @Override
        public StreamCodec<RegistryFriendlyByteBuf, PedestalRecipe> streamCodec() {
            return STREAM_CODEC;
        }

        private static PedestalRecipe fromNetwork(RegistryFriendlyByteBuf buffer) {
            int i = buffer.readVarInt();
            NonNullList<Ingredient> nonnulllist = NonNullList.withSize(i, Ingredient.EMPTY);
            nonnulllist.replaceAll(p_319735_ -> Ingredient.CONTENTS_STREAM_CODEC.decode(buffer));
            ItemStack itemstack = ItemStack.STREAM_CODEC.decode(buffer);
            String string = (String) buffer.readCharSequence(buffer.readVarInt(),Charset.defaultCharset());
            // REMOVED: entityType decoding

            return new PedestalRecipe(nonnulllist, itemstack,string);
        }

        private static void toNetwork(RegistryFriendlyByteBuf buffer, PedestalRecipe recipe) {
            buffer.writeVarInt(recipe.ingredients.size());

            for (Ingredient ingredient : recipe.ingredients) {
                Ingredient.CONTENTS_STREAM_CODEC.encode(buffer, ingredient);
            }

            ItemStack.STREAM_CODEC.encode(buffer, recipe.output);
            buffer.writeVarInt(recipe.ether.length());
            buffer.writeCharSequence(recipe.ether, Charset.defaultCharset());
            // REMOVED: entityType encoding
        }
    }
}