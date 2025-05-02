package ch.raimu.coinscoinscoins.compat;

import ch.raimu.coinscoinscoins.CoinsCoinsCoins;
import ch.raimu.coinscoinscoins.item.ModItems;
import mezz.jei.api.IModPlugin;
import mezz.jei.api.JeiPlugin;
import mezz.jei.api.constants.VanillaTypes;
import mezz.jei.api.registration.IRecipeRegistration;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.ItemStack;

@JeiPlugin
public class JEICoinsCoinsCoins implements IModPlugin {
    @Override
    public ResourceLocation getPluginUid() {
        return ResourceLocation.fromNamespaceAndPath(CoinsCoinsCoins.MOD_ID, "jei_plugin");
    }

    @Override
    public void registerRecipes(IRecipeRegistration reg) {
        reg.addIngredientInfo(new ItemStack(ModItems.COIN_NETHERITE.get()), VanillaTypes.ITEM_STACK, Component.translatable("info.coinscoinscoins.coin_netherite"));
        reg.addIngredientInfo(new ItemStack(ModItems.COIN_ANCIENT.get()), VanillaTypes.ITEM_STACK, Component.translatable("info.coinscoinscoins.coin_ancient"));
    }
}
