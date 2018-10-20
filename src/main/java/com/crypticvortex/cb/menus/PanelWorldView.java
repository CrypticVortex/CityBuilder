package com.crypticvortex.cb.menus;

import com.crypticvortex.cb.core.Nation;
import com.crypticvortex.cb.core.World;
import net.miginfocom.swing.MigLayout;

import javax.swing.*;
import java.awt.*;

/**
 * (Clickable) Overview panel of the game world.
 *
 * @author Jatboy
 */
public class PanelWorldView extends JPanel {
    private JButton[] grid;

    public PanelWorldView(Nation nation, World world) {
        setLayout(new MigLayout());

        grid = new JButton[world.getChunks().length];
        for(int y = 0; y < world.getWidth(); y++) {
            for(int x = 0; x < world.getHeight(); x++) {
                int index = world.getWidth() * y + x;
                JButton button = new JButton("(" + (x + 1) + "," + (y + 1) + ")");
                button.addActionListener(e -> {
                    JFrame frame = new JFrame("Chunk Overview");
                    frame.setContentPane(new PanelChunkOverview(nation, world.getChunk(index)));
                });
                switch(world.getChunk(index).getData()) {
                    case 0: // GRASS
                        button.setBackground(Color.green);
                        break;
                    case 1: // WATER
                        button.setBackground(Color.blue);
                        break;
                    case 2: // FOREST
                        button.setBackground(Color.orange);
                        break;
                }
                grid[index] = button;
                add(grid[index], "cell " + y + " " + x);
            }
        }
    }

}
