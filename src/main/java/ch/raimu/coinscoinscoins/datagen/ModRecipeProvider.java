package ch.raimu.coinscoinscoins.datagen;

import ch.raimu.coinscoinscoins.CoinsCoinsCoins;
import ch.raimu.coinscoinscoins.item.ModItems;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.data.recipes.*;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.crafting.*;
import net.minecraft.world.level.ItemLike;
import net.neoforged.neoforge.common.Tags;
import net.neoforged.neoforge.common.conditions.IConditionBuilder;


import java.util.List;
import java.util.concurrent.CompletableFuture;

public class ModRecipeProvider extends RecipeProvider implements IConditionBuilder {
    public ModRecipeProvider(PackOutput output, CompletableFuture<HolderLookup.Provider> registries) {
        super(output, registries);
    }

    @Override
    protected void buildRecipes(RecipeOutput recipeOutput) {

        //SMELTING LISTS DEFINITIONS
        List<ItemLike> COPPER_SMELTABLES = List.of(
                ModItems.COPPER_NUGGET);
        List<ItemLike> IRON_SMELTABLES = List.of(
                Items.IRON_NUGGET);
        List<ItemLike> GOLD_SMELTABLES = List.of(
                Items.GOLD_NUGGET);
        List<ItemLike> DIAMOND_SMELTABLES = List.of(
                ModItems.DIAMOND_NUGGET);
        List<ItemLike> EMERALD_SMELTABLES = List.of(
                ModItems.EMERALD_NUGGET);

        List<ItemLike> COPPER_PILES_SMELTABLES = List.of(
                ModItems.COIN_PILE_COPPER);
        List<ItemLike> IRON_PILES_SMELTABLES = List.of(
                ModItems.COIN_PILE_IRON);
        List<ItemLike> GOLD_PILES_SMELTABLES = List.of(
                ModItems.COIN_PILE_GOLD);
        List<ItemLike> DIAMOND_PILES_SMELTABLES = List.of(
                ModItems.COIN_PILE_DIAMOND);
        List<ItemLike> EMERALD_PILES_SMELTABLES = List.of(
                ModItems.COIN_PILE_EMERALD);

        //RECIPE DEFINITION SECTION
        //ADDITIONAL NUGGETS
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.COPPER_NUGGET.get(), 9)
                .requires(Items.COPPER_INGOT)
                .unlockedBy("has_copper_ingot", has(Items.COPPER_INGOT)).save(recipeOutput);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.DIAMOND_NUGGET.get(), 9)
                .requires(Items.DIAMOND)
                .unlockedBy("has_diamond", has(Items.DIAMOND)).save(recipeOutput);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.EMERALD_NUGGET.get(), 9)
                .requires(Items.EMERALD)
                .unlockedBy("has_emerald", has(Items.EMERALD)).save(recipeOutput);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.NETHERITE_NUGGET.get(), 9)
                .requires(Items.NETHERITE_INGOT)
                .unlockedBy("has_netherite_ingot", has(Items.NETHERITE_INGOT)).save(recipeOutput);

        //COPPER COIN PILE
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.COIN_PILE_COPPER.get())
                .pattern("CCC")
                .pattern("CCC")
                .pattern("CCC")
                .define('C', ModItems.COIN_COPPER.get())
                .unlockedBy("has_coin_copper", has(ModItems.COIN_COPPER)).save(recipeOutput);
        //COPPER COIN FROM PILE
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.COIN_COPPER.get(), 9)
                .requires(ModItems.COIN_PILE_COPPER)
                .unlockedBy("has_coin_pile_copper", has(ModItems.COIN_PILE_COPPER)).save(recipeOutput);
        //COPPER COIN FROM IRON COIN
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.COIN_COPPER.get(), 9)
                .requires(ModItems.COIN_IRON)
                .unlockedBy("has_coin_iron", has(ModItems.COIN_IRON)).save(recipeOutput, "coinscoinscoins:coin_copper_from_coin_iron");

        //IRON COIN PILE
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.COIN_PILE_IRON.get())
                .pattern("CCC")
                .pattern("CCC")
                .pattern("CCC")
                .define('C', ModItems.COIN_IRON.get())
                .unlockedBy("has_coin_iron", has(ModItems.COIN_IRON)).save(recipeOutput);
        //IRON COIN FROM PILE
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.COIN_IRON.get(), 9)
                .requires(ModItems.COIN_PILE_IRON)
                .unlockedBy("has_coin_pile_iron", has(ModItems.COIN_PILE_IRON)).save(recipeOutput);
        //IRON COIN FROM GOLD COIN
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.COIN_IRON.get(), 9)
                .requires(ModItems.COIN_GOLD)
                .unlockedBy("has_coin_gold", has(ModItems.COIN_GOLD)).save(recipeOutput, "coinscoinscoins:coin_iron_from_coin_gold");

        //GOLD COIN PILE
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.COIN_PILE_GOLD.get())
                .pattern("CCC")
                .pattern("CCC")
                .pattern("CCC")
                .define('C', ModItems.COIN_GOLD.get())
                .unlockedBy("has_coin_gold", has(ModItems.COIN_GOLD)).save(recipeOutput);
        //GOLD COIN FROM PILE
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.COIN_GOLD.get(), 9)
                .requires(ModItems.COIN_PILE_GOLD)
                .unlockedBy("has_coin_pile_gold", has(ModItems.COIN_PILE_GOLD)).save(recipeOutput);
        //GOLD COIN FROM DIAMOND COIN
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.COIN_GOLD.get(), 9)
                .requires(ModItems.COIN_DIAMOND)
                .unlockedBy("has_coin_diamond", has(ModItems.COIN_DIAMOND)).save(recipeOutput, "coinscoinscoins:coin_gold_from_coin_diamond");

        //DIAMOND COIN PILE
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.COIN_PILE_DIAMOND.get())
                .pattern("CCC")
                .pattern("CCC")
                .pattern("CCC")
                .define('C', ModItems.COIN_DIAMOND.get())
                .unlockedBy("has_coin_diamond", has(ModItems.COIN_DIAMOND)).save(recipeOutput);
        //DIAMOND COIN FROM PILE
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.COIN_DIAMOND.get(), 9)
                .requires(ModItems.COIN_PILE_DIAMOND)
                .unlockedBy("has_coin_pile_diamond", has(ModItems.COIN_PILE_DIAMOND)).save(recipeOutput);
        //DIAMOND COIN FROM EMERALD COIN
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.COIN_DIAMOND.get(), 9)
                .requires(ModItems.COIN_EMERALD)
                .unlockedBy("has_coin_emerald", has(ModItems.COIN_EMERALD)).save(recipeOutput, "coinscoinscoins:coin_diamond_from_coin_emerald");


        //EMERALD COIN PILE
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.COIN_PILE_EMERALD.get())
                .pattern("CCC")
                .pattern("CCC")
                .pattern("CCC")
                .define('C', ModItems.COIN_EMERALD.get())
                .unlockedBy("has_coin_emerald", has(ModItems.COIN_EMERALD)).save(recipeOutput);
        //EMERALD COIN FROM PILE
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.COIN_EMERALD.get(), 9)
                .requires(ModItems.COIN_PILE_EMERALD)
                .unlockedBy("has_coin_pile_emerald", has(ModItems.COIN_PILE_EMERALD)).save(recipeOutput);
        //EMERALD COIN FROM NETHERITE COIN
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.COIN_EMERALD.get(), 9)
                .requires(ModItems.COIN_NETHERITE)
                .unlockedBy("has_coin_netherite", has(ModItems.COIN_NETHERITE)).save(recipeOutput, "coinscoinscoins:coin_emerald_from_coin_netherite");


        //NETHERITE COIN PILE
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.COIN_PILE_NETHERITE.get())
                .pattern("CCC")
                .pattern("CCC")
                .pattern("CCC")
                .define('C', ModItems.COIN_NETHERITE.get())
                .unlockedBy("has_coin_netherite", has(ModItems.COIN_NETHERITE)).save(recipeOutput);
        //NETHERITE COIN FROM PILE
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.COIN_NETHERITE.get(), 9)
                .requires(ModItems.COIN_PILE_NETHERITE)
                .unlockedBy("has_coin_pile_netherite", has(ModItems.COIN_PILE_NETHERITE)).save(recipeOutput);
        //NETHERITE COIN FROM ANCIENT COIN
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.COIN_NETHERITE.get(), 9)
                .requires(ModItems.COIN_ANCIENT)
                .unlockedBy("has_coin_ancient", has(ModItems.COIN_ANCIENT)).save(recipeOutput, "coinscoinscoins:coin_netherite_from_coin_ancient");


        //SMELTING SECTION

        //NUGGETS INTO COINS
        oreSmelting(recipeOutput, COPPER_SMELTABLES, RecipeCategory.MISC, ModItems.COIN_COPPER.get(), 0.05f, 100, "coin_copper");
        oreBlasting(recipeOutput, COPPER_SMELTABLES, RecipeCategory.MISC, ModItems.COIN_COPPER.get(), 0.05f, 50, "coin_copper");
        oreSmelting(recipeOutput, IRON_SMELTABLES, RecipeCategory.MISC, ModItems.COIN_IRON.get(), 0.05f, 100, "coin_iron");
        oreBlasting(recipeOutput, IRON_SMELTABLES, RecipeCategory.MISC, ModItems.COIN_IRON.get(), 0.05f, 50, "coin_iron");
        oreSmelting(recipeOutput, GOLD_SMELTABLES, RecipeCategory.MISC, ModItems.COIN_GOLD.get(), 0.05f, 100, "coin_gold");
        oreBlasting(recipeOutput, GOLD_SMELTABLES, RecipeCategory.MISC, ModItems.COIN_GOLD.get(), 0.05f, 50, "coin_gold");
        oreSmelting(recipeOutput, DIAMOND_SMELTABLES, RecipeCategory.MISC, ModItems.COIN_DIAMOND.get(), 0.05f, 100, "coin_diamond");
        oreBlasting(recipeOutput, DIAMOND_SMELTABLES, RecipeCategory.MISC, ModItems.COIN_DIAMOND.get(), 0.05f, 50, "coin_diamond");
        oreSmelting(recipeOutput, EMERALD_SMELTABLES, RecipeCategory.MISC, ModItems.COIN_EMERALD.get(), 0.05f, 100, "coin_emerald");
        oreBlasting(recipeOutput, EMERALD_SMELTABLES, RecipeCategory.MISC, ModItems.COIN_EMERALD.get(), 0.05f, 50, "coin_emerald");
        //oreSmelting(recipeOutput, NETHERITE_SMELTABLES, RecipeCategory.MISC, ModItems.COIN_NETHERITE.get(), 0.05f, 100, "coin_netherite");
        //oreBlasting(recipeOutput, NETHERITE_SMELTABLES, RecipeCategory.MISC, ModItems.COIN_NETHERITE.get(), 0.05f, 50, "coin_netherite");

        // PILES UPGRADES
        oreSmelting(recipeOutput, COPPER_PILES_SMELTABLES, RecipeCategory.MISC, ModItems.COIN_IRON.get(), 0.25f, 200, "coin_iron");
        oreBlasting(recipeOutput, COPPER_PILES_SMELTABLES, RecipeCategory.MISC, ModItems.COIN_IRON.get(), 0.25f, 100, "coin_iron");
        oreSmelting(recipeOutput, IRON_PILES_SMELTABLES, RecipeCategory.MISC, ModItems.COIN_GOLD.get(), 0.25f, 200, "coin_gold");
        oreBlasting(recipeOutput, IRON_PILES_SMELTABLES, RecipeCategory.MISC, ModItems.COIN_GOLD.get(), 0.25f, 100, "coin_gold");
        oreSmelting(recipeOutput, GOLD_PILES_SMELTABLES, RecipeCategory.MISC, ModItems.COIN_DIAMOND.get(), 0.25f, 200, "coin_diamond");
        oreBlasting(recipeOutput, GOLD_PILES_SMELTABLES, RecipeCategory.MISC, ModItems.COIN_DIAMOND.get(), 0.25f, 100, "coin_diamond");
        oreSmelting(recipeOutput, DIAMOND_PILES_SMELTABLES, RecipeCategory.MISC, ModItems.COIN_EMERALD.get(), 0.25f, 200, "coin_emerald");
        oreBlasting(recipeOutput, DIAMOND_PILES_SMELTABLES, RecipeCategory.MISC, ModItems.COIN_EMERALD.get(), 0.25f, 100, "coin_emerald");
        oreSmelting(recipeOutput, EMERALD_PILES_SMELTABLES, RecipeCategory.MISC, ModItems.COIN_NETHERITE.get(), 0.25f, 200, "coin_netherite");
        oreBlasting(recipeOutput, EMERALD_PILES_SMELTABLES, RecipeCategory.MISC, ModItems.COIN_NETHERITE.get(), 0.25f, 100, "coin_netherite");
        //oreSmelting(recipeOutput, NETHERITE_PILES_SMELTABLES, RecipeCategory.MISC, ModItems.COIN_ANCIENT.get(), 0.25f, 200, "coin_ancient");
        //oreBlasting(recipeOutput, NETHERITE_PILES_SMELTABLES, RecipeCategory.MISC, ModItems.COIN_ANCIENT.get(), 0.25f, 100, "coin_ancient");

        //NOTE: THE EMERALD UPGRADE IS MANUALLY DONE IN DATA
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
        for (ItemLike itemlike : pIngredients) {
            SimpleCookingRecipeBuilder.generic(Ingredient.of(itemlike), pCategory, pResult, pExperience, pCookingTime, pCookingSerializer, factory).group(pGroup).unlockedBy(getHasName(itemlike), has(itemlike))
                    .save(recipeOutput, CoinsCoinsCoins.MOD_ID + ":" + getItemName(pResult) + pRecipeName + "_" + getItemName(itemlike));
        }


    }
}