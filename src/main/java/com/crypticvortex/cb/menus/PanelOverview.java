package com.crypticvortex.cb.menus;

import com.crypticvortex.cb.core.GlobalVars;
import com.crypticvortex.cb.core.MenuIcons;
import com.crypticvortex.cb.core.Nation;
import com.crypticvortex.cb.core.World;
import net.miginfocom.swing.MigLayout;

import javax.swing.*;

/**
 * Top aligned panel showcasing important statistics about your town.
 *
 * @author Jatboy
 */
public class PanelOverview extends JPanel {

    public PanelOverview(Nation nation, World world) {
        setLayout(new MigLayout());

        JLabel moneyIco = new JLabel(MenuIcons.MONEY.getIcon());
        JLabel money = new JLabel(GlobalVars.MONEY + " (+" + GlobalVars.MONEY_TICK + "/d)");

        add(moneyIco,"cell 0 0");
        add(money, "cell 1 0");
    }
}