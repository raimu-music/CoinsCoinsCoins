package ch.raimu.coinscoinscoins.item;

import ch.raimu.coinscoinscoins.CoinsCoinsCoins;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemNameBlockItem;
import net.minecraft.world.item.SmithingTemplateItem;
import net.minecraft.world.item.SwordItem;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.List;

public class ModItems {
    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(CoinsCoinsCoins.MOD_ID);


    //public static final DeferredItem<Item> NAME = ITEMS.registerSimpleItem("name); == NO PROPRIETIES ITEMS
    //public static final DeferredItem<Item> NAME = ITEMS.register("name", () -> new Item(new Item.Proprieties().PROPERTY)); == PROPRIETIES ITEMS

    public static final DeferredItem<Item> COPPER_NUGGET = ITEMS.registerSimpleItem("copper_nugget");
    public static final DeferredItem<Item> DIAMOND_NUGGET = ITEMS.registerSimpleItem("diamond_nugget");
    public static final DeferredItem<Item> EMERALD_NUGGET = ITEMS.registerSimpleItem("emerald_nugget");
    public static final DeferredItem<Item> NETHERITE_NUGGET = ITEMS.registerSimpleItem("netherite_nugget");

    public static final DeferredItem<Item> COIN_COPPER = ITEMS.registerSimpleItem("coin_copper");
    public static final DeferredItem<Item> COIN_IRON = ITEMS.registerSimpleItem("coin_iron");
    public static final DeferredItem<Item> COIN_GOLD = ITEMS.registerSimpleItem("coin_gold");
    public static final DeferredItem<Item> COIN_DIAMOND = ITEMS.registerSimpleItem("coin_diamond");
    public static final DeferredItem<Item> COIN_EMERALD = ITEMS.registerSimpleItem("coin_emerald");
    public static final DeferredItem<Item> COIN_NETHERITE = ITEMS.registerSimpleItem("coin_netherite");
    public static final DeferredItem<Item> COIN_ANCIENT = ITEMS.registerSimpleItem("coin_ancient");

    public static final DeferredItem<Item> COIN_PILE_COPPER = ITEMS.registerSimpleItem("coin_pile_copper");
    public static final DeferredItem<Item> COIN_PILE_IRON = ITEMS.registerSimpleItem("coin_pile_iron");
    public static final DeferredItem<Item> COIN_PILE_GOLD = ITEMS.registerSimpleItem("coin_pile_gold");
    public static final DeferredItem<Item> COIN_PILE_DIAMOND = ITEMS.registerSimpleItem("coin_pile_diamond");
    public static final DeferredItem<Item> COIN_PILE_EMERALD = ITEMS.registerSimpleItem("coin_pile_emerald");
    public static final DeferredItem<Item> COIN_PILE_NETHERITE = ITEMS.registerSimpleItem("coin_pile_netherite");

    //public static final DeferredItem<Item> NETHERITE_COIN_CORE = ITEMS.registerSimpleItem("netherite_coin_core");


    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
