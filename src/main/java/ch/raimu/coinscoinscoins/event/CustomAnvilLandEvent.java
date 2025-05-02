package ch.raimu.coinscoinscoins.event;

import net.minecraft.core.BlockPos;
import net.minecraft.world.entity.item.FallingBlockEntity;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.state.BlockState;
import net.neoforged.bus.api.Event;

// CREDIT TO SHADOWS OF FIRE - PLACEBO CODE UNDER MIT LICENSE
public class CustomAnvilLandEvent extends Event {
    private final Level level;
    private final BlockPos pos;
    private final BlockState newState;
    private final BlockState oldState;
    private final FallingBlockEntity entity;

    public CustomAnvilLandEvent(Level level, BlockPos pos, BlockState newState, BlockState oldState, FallingBlockEntity entity) {
        this.level = level;
        this.pos = pos;
        this.newState = newState;
        this.oldState = oldState;
        this.entity = entity;
    }

    public Level getLevel() { return level; }
    public BlockPos getPos() { return pos; }
    public BlockState getNewState() { return newState; }
    public BlockState getOldState() { return oldState; }
    public FallingBlockEntity getEntity() { return entity; }
}
