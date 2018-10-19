package com.crypticvortex.cb;

import javax.swing.*;

/**
 * Application startup code.
 *
 * @author Jatboy
 */
public class Application extends JFrame {

    public Application() {
        setTitle("Code-name 'CityBuilder'");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(800, 600);
        setLocationRelativeTo(null);

    }

    public static void main(String[] args) {
        try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        } catch (Exception ex) {
            ex.printStackTrace();
        }

        Application app = new Application();
        app.setResizable(false);
        app.setVisible(true);
    }

    private static final long serialVerisonUID = -1L;
}
