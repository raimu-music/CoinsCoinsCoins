package ch.raimu.coinscoinscoins.mixin;

import ch.raimu.coinscoinscoins.event.CustomAnvilLandEvent;
import net.minecraft.core.BlockPos;
import net.minecraft.world.entity.item.FallingBlockEntity;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.AnvilBlock;
import net.minecraft.world.level.block.state.BlockState;
import net.neoforged.neoforge.common.NeoForge;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

// CREDIT TO SHADOWS OF FIRE - PLACEBO CODE UNDER MIT LICENSE

@Mixin(AnvilBlock.class)
public class AnvilBlockMixin {
    @Inject(at = @At("HEAD"), method = "onLand")
    public void onLand(Level level, BlockPos pos, BlockState newState, BlockState oldState, FallingBlockEntity entity, CallbackInfo ci) {
        NeoForge.EVENT_BUS.post(new CustomAnvilLandEvent(level, pos, newState, oldState, entity));
    }
}