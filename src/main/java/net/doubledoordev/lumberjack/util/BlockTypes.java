package net.doubledoordev.lumberjack.util;

import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockState;

public class BlockTypes {

    public static boolean isLeaves (BlockState state){
        return state.getBlock().equals(Blocks.ACACIA_LEAVES)
                ||state.getBlock().equals(Blocks.BIRCH_LEAVES)
                ||state.getBlock().equals(Blocks.AZALEA_LEAVES)
                ||state.getBlock().equals(Blocks.CHERRY_LEAVES)
                ||state.getBlock().equals(Blocks.JUNGLE_LEAVES)
                ||state.getBlock().equals(Blocks.DARK_OAK_LEAVES)
                ||state.getBlock().equals(Blocks.FLOWERING_AZALEA_LEAVES)
                ||state.getBlock().equals(Blocks.MANGROVE_LEAVES)
                ||state.getBlock().equals(Blocks.OAK_LEAVES)
                ||state.getBlock().equals(Blocks.SPRUCE_LEAVES)
                ;
    }

    public static boolean isAnyWood(BlockState state){
        return isNetherWood(state)||isWood(state);
    }

    public static boolean isNetherWood(BlockState state){
        return state.getBlock().equals(Blocks.CRIMSON_STEM)
                || state.getBlock().equals(Blocks.WARPED_STEM)
                ;
    }

    public static boolean isWood (BlockState state){
        return state.getBlock().equals(Blocks.ACACIA_WOOD)
                ||state.getBlock().equals(Blocks.BIRCH_WOOD)
                ||state.getBlock().equals(Blocks.CHERRY_WOOD)
                ||state.getBlock().equals(Blocks.OAK_WOOD)
                ||state.getBlock().equals(Blocks.JUNGLE_WOOD)
                ||state.getBlock().equals(Blocks.DARK_OAK_WOOD)
                ||state.getBlock().equals(Blocks.MANGROVE_WOOD)
                ||state.getBlock().equals(Blocks.SPRUCE_WOOD)
                ;
    }
}
