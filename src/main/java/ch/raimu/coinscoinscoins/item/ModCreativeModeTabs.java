package ch.raimu.coinscoinscoins.item;

import ch.raimu.coinscoinscoins.CoinsCoinsCoins;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.function.Supplier;

public class ModCreativeModeTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TAB =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, CoinsCoinsCoins.MOD_ID);


    public static final Supplier<CreativeModeTab> COINS_TAB = CREATIVE_MODE_TAB.register("coins_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.COIN_PILE_GOLD.get()))
                    .title(Component.translatable("creativetab.coinscoinscoins.coins_tab"))
                    .displayItems((itemDisplayParameters, output) -> {

                        output.accept(ModItems.COPPER_NUGGET);
                        output.accept(ModItems.COIN_COPPER);
                        output.accept(ModItems.COIN_PILE_COPPER);
                        output.accept(Items.IRON_NUGGET);
                        output.accept(ModItems.COIN_IRON);
                        output.accept(ModItems.COIN_PILE_IRON);
                        output.accept(Items.GOLD_NUGGET);
                        output.accept(ModItems.COIN_GOLD);
                        output.accept(ModItems.COIN_PILE_GOLD);
                        output.accept(ModItems.DIAMOND_NUGGET);
                        output.accept(ModItems.COIN_DIAMOND);
                        output.accept(ModItems.COIN_PILE_DIAMOND);
                        output.accept(ModItems.EMERALD_NUGGET);
                        output.accept(ModItems.COIN_EMERALD);
                        output.accept(ModItems.COIN_PILE_EMERALD);
                        output.accept(ModItems.NETHERITE_NUGGET);
                        output.accept(ModItems.COIN_NETHERITE);
                        output.accept(ModItems.COIN_PILE_NETHERITE);
                        output.accept(ModItems.COIN_ANCIENT);

                    }).build());


    public static void register (IEventBus eventBus) {
        CREATIVE_MODE_TAB.register(eventBus);
    }
}
