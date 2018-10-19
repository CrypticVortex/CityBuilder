package com.crypticvortex.cb.menus;

import com.crypticvortex.cb.Application;

import javax.swing.*;

public enum MenuIcons {
    MONEY, GRAIN;

    private String iconPath;

    public ImageIcon getIcon() {
        return getIcon(iconPath);
    }

    private ImageIcon getIcon(String path) {
        return new ImageIcon(Application.class.getResource("/images/" + path));
    }

    private static final String MONEY_ICO = "resources/money.png";
    private static final String GRAIN_ICO = "resources/grain.png";

    static {
        MONEY.iconPath = MONEY_ICO;
        GRAIN.iconPath = GRAIN_ICO;
    }

}
