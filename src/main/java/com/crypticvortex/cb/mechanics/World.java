package com.crypticvortex.cb.mechanics;

import java.util.Random;

/**
 * Creates the world and handles all that goes on inside of it.
 *
 * @author Jatboy
 */
public class World {
    private int seed;
    private int width;
    private int height;
    private Chunk[] chunks;

    public World(int width, int height) {
        seed = new Random().nextInt();
        this.width = width;
        this.height = height;
        this.chunks = new Chunk[width * height];

        generate();
    }

    public void generate() {
        // TODO : 'Procedurally' generate the landscape and the features such as Forests, Lakes, Oceans, Mountains, etc.
        Random rand = new Random();
        for (int y = 0; y < width; y++) {
            for (int x = 0; x < height; x++) {
                int index = width * y + x;
                chunks[index] = new Chunk(index, rand.nextInt(3)); // Randomly assign terrain features for test purposes.
            }
        }
    }

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }

    public int getSeed() {
        return seed;
    }

    public Chunk getChunk(int index) {
        return chunks[index];
    }

    public Chunk[] getChunks() {
        return chunks;
    }

}
