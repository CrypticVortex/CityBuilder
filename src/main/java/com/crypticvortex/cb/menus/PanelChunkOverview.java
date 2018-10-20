package com.crypticvortex.cb.menus;

import com.crypticvortex.cb.core.Chunk;
import com.crypticvortex.cb.core.Nation;
import net.miginfocom.swing.MigLayout;

import javax.swing.*;

public class PanelChunkOverview extends JPanel {

    public PanelChunkOverview(Nation nation, Chunk chunk) {
        setLayout(new MigLayout());

        if(nation.hasChunk(chunk)) { // Overview

        } else { // Purchase

        }
    }
}
