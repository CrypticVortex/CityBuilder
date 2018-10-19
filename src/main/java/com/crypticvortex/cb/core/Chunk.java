package com.crypticvortex.cb.core;

/**
 * Each sliver of the game world.
 *
 * @author Jatboy
 */
public class Chunk {
    private int data;
    private int index;

    public Chunk(int index, int data) {
        this.index = index;
        this.data = data;
    }

    public int getIndex() {
        return index;
    }

    public int getData() {
        return data;
    }
}
