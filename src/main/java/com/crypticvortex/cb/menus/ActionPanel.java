package com.crypticvortex.cb.menus;

import com.crypticvortex.cb.mechanics.World;
import net.miginfocom.layout.LC;
import net.miginfocom.swing.MigLayout;

import javax.swing.*;

/**
 * Left-aligned panel in main application for all the various actions.
 *
 * @author Jatboy
 */
public class ActionPanel extends JPanel {

    public ActionPanel(World world) {
        setLayout(new MigLayout(new LC().insets("5", "5", "15", "5")));

        JButton overview = new JButton("Nation Overview");
        add(overview, "cell 0 0, w 150!");
    }
}
