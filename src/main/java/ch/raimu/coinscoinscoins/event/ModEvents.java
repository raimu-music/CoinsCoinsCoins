package ch.raimu.coinscoinscoins.event;

import ch.raimu.coinscoinscoins.CoinsCoinsCoins;
import ch.raimu.coinscoinscoins.item.ModItems;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.sounds.SoundSource;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.item.ItemEntity;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;
import net.minecraft.world.phys.AABB;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.EventBusSubscriber;

import java.util.List;

@EventBusSubscriber(modid = CoinsCoinsCoins.MOD_ID, bus = EventBusSubscriber.Bus.GAME)
public class ModEvents {


    //ANVIL SQUASH USAGE
    @SubscribeEvent
    public static void onAnvilLand(CustomAnvilLandEvent event) {
        Level level = event.getLevel();
        if (level.isClientSide) return; // Server-side only

        List<ItemEntity> items = level.getEntitiesOfClass(ItemEntity.class, new AABB(event.getPos()));
        for (ItemEntity entity : items) {
            ItemStack stack = entity.getItem();
            if (stack.is(ModItems.COIN_PILE_NETHERITE)) {
                processItem(level, entity, stack, ModItems.COIN_ANCIENT.get(), 1, SoundEvents.METAL_BREAK);
            } else if (stack.is(ModItems.NETHERITE_NUGGET.get())) {
               processItem(level, entity, stack, ModItems.COIN_NETHERITE.get(), 1, SoundEvents.METAL_BREAK);
            }
        }
    }

    //(stack.is(Items.IRON_INGOT) || stack.is(Items.GOLD_INGOT))  for multiple conditions in one, or ModTags
    private static void processItem(Level level, ItemEntity entity, ItemStack inputStack, Item outputItem, int outputCountPerInput, SoundEvent sound) {
        int inputCount = inputStack.getCount();
        entity.remove(Entity.RemovalReason.DISCARDED);
        ItemStack outputStack = new ItemStack(outputItem, inputCount * outputCountPerInput);
        ItemEntity outputEntity = new ItemEntity(level, entity.getX(), entity.getY(), entity.getZ(), outputStack);
        outputEntity.setDefaultPickUpDelay();
        level.addFreshEntity(outputEntity);
        level.playSound(null, entity.blockPosition(), sound, SoundSource.BLOCKS, 1.0F, 1.0F);
    }

}
