package com.crypticvortex.cb.core;

import com.crypticvortex.cb.core.structure.IStructure;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Stores all information pertaining to a singular nation.
 * Will allow multiplayer route in future if each player has their own data.
 *
 * @author Jatboy
 */
public class Nation {
    private World world;
    private List<Chunk> ownedChunks;
    private List<IStructure> structures;
    private Map<String,Integer> resources;

    public Nation(World world) {
        this.world = world;
        this.ownedChunks = new ArrayList<>();
        this.structures = new ArrayList<>();
        this.resources = new HashMap<>(GlobalVars.GetAllResources());
    }

    public void purchaseChunk(Chunk chunk) {
        int funds = resources.get("MONEY");
        if(funds >= chunk.getCost()) {
            ownedChunks.add(chunk);
            funds -= chunk.getCost();
            resources.replace("MONEY", funds);
        } else {
            // Inform user they are too poor.
        }
    }

    public void sellChunk(Chunk chunk) {
        if(ownedChunks.contains(chunk)) {
            if(chunk.getStructures().size() > 0) {
                // Cannot sell a chunk with structures.
            } else {
                ownedChunks.remove(chunk);
                resources.replace("MONEY", (int) (resources.get("MONEY") + (chunk.getCost() * 0.5)));
            }
        } else {
            // Inform user they do not own the chunk.
        }
    }

    public boolean hasChunk(Chunk chunk) {
        return ownedChunks.contains(chunk);
    }

    public List<Chunk> getOwnedChunks() {
        return ownedChunks;
    }

    public List<IStructure> getStructures() {
        return structures;
    }
}
