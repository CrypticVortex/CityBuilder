package com.crypticvortex.cb.core;

import com.crypticvortex.cb.core.structure.IStructure;

import java.util.ArrayList;
import java.util.List;

/**
 * Each sliver of the game world.
 *
 * @author Jatboy
 */
public class Chunk {
    private int data;
    private int cost;
    private int index;
    private List<IStructure> structures;

    public Chunk(int index, int data) {
        this.index = index;
        this.data = data;
        this.structures = new ArrayList<>();
        switch(data) { // Test
            case 0: cost = 100; break;
            case 1: cost = 200; break;
            case 2: cost = 300; break;
        }
    }

    public int getCost() {
        return cost;
    }

    public int getIndex() {
        return index;
    }

    public int getData() {
        return data;
    }

    public List<IStructure> getStructures() {
        return structures;
    }
}
