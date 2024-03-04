package io.github.satorugg.satoruspleef.game;

import org.bukkit.Bukkit;
import org.bukkit.Location;
import org.bukkit.World;
import org.bukkit.block.Block;

import java.util.ArrayList;
import java.util.List;

public class Arena {

    private List<Block> arenaBlocks = new ArrayList<>();
    private Block startingBlock;
    private Block endingBlock;

    public Arena(Block startingBlock, Block endingBlock, World world) {
        for (int i = startingBlock.getX(); i < endingBlock.getX(); i++) {
            for (int j = startingBlock.getY(); j < endingBlock.getY(); j++) {
                for (int k = startingBlock.getZ(); k < endingBlock.getZ(); k++) {
                    arenaBlocks.add(world.getBlockAt(i, j, k));
                }
            }
        }
    }

    public List<Block> getArenaBlocks() {
        return arenaBlocks;
    }
}
