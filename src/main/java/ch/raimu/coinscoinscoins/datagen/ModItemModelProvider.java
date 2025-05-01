package ch.raimu.coinscoinscoins.datagen;

import ch.raimu.coinscoinscoins.CoinsCoinsCoins;
import ch.raimu.coinscoinscoins.item.ModItems;
import net.minecraft.data.PackOutput;
import net.neoforged.neoforge.client.model.generators.ItemModelProvider;
import net.neoforged.neoforge.common.data.ExistingFileHelper;

public class ModItemModelProvider extends ItemModelProvider {
    public ModItemModelProvider(PackOutput output, ExistingFileHelper existingFileHelper) {
        super(output, CoinsCoinsCoins.MOD_ID, existingFileHelper);
    }

    @Override
    protected void registerModels() {
        basicItem(ModItems.COPPER_NUGGET.get());
        basicItem(ModItems.DIAMOND_NUGGET.get());
        basicItem(ModItems.EMERALD_NUGGET.get());
        basicItem(ModItems.NETHERITE_NUGGET.get());

        basicItem(ModItems.COIN_COPPER.get());
        basicItem(ModItems.COIN_IRON.get());
        basicItem(ModItems.COIN_GOLD.get());
        basicItem(ModItems.COIN_DIAMOND.get());
        basicItem(ModItems.COIN_EMERALD.get());
        basicItem(ModItems.COIN_NETHERITE.get());
        basicItem(ModItems.COIN_ANCIENT.get());

        basicItem(ModItems.COIN_PILE_COPPER.get());
        basicItem(ModItems.COIN_PILE_IRON.get());
        basicItem(ModItems.COIN_PILE_GOLD.get());
        basicItem(ModItems.COIN_PILE_DIAMOND.get());
        basicItem(ModItems.COIN_PILE_EMERALD.get());
        basicItem(ModItems.COIN_PILE_NETHERITE.get());



    }
}
