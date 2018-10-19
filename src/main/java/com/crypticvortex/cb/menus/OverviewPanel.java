package com.crypticvortex.cb.menus;

import com.crypticvortex.cb.mechanics.World;
import net.miginfocom.swing.MigLayout;

import javax.swing.*;

/**
 * Top aligned panel showcasing important statistics about your town.
 *
 * @author Jatboy
 */
public class OverviewPanel extends JPanel {

    public OverviewPanel(World world) {
        setLayout(new MigLayout());

        JLabel moneyIco = new JLabel(MenuIcons.MONEY.getIcon());
        JLabel money = new JLabel("1000.00 (+0/s)");

        add(moneyIco,"cell 0 0");
        add(money, "cell 1 0");
    }
}