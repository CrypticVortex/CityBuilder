package com.crypticvortex.cb;

import com.crypticvortex.cb.core.CoreThread;
import com.crypticvortex.cb.core.Nation;
import com.crypticvortex.cb.core.World;
import com.crypticvortex.cb.menus.PanelActions;
import com.crypticvortex.cb.menus.PanelOverview;
import com.crypticvortex.cb.menus.PanelWorldView;
import net.miginfocom.swing.MigLayout;

import javax.swing.*;
import javax.swing.border.Border;

/**
 * Application startup code.
 *
 * @author Jatboy
 */
public class Application extends JFrame {
    private World world;
    private Nation nation;
    private PanelActions actions;
    private PanelOverview overview;
    private PanelWorldView worldView;
    private Border empty = BorderFactory.createEmptyBorder();

    public Application() {
        new CoreThread();
        setTitle("Code-name 'CityBuilder'");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(800, 600);
        setLocationRelativeTo(null);
        setLayout(new MigLayout());

        world = new World(9, 12);
        actions = new PanelActions(nation, world);
        overview = new PanelOverview(nation, world);
        worldView = new PanelWorldView(nation, world);

        JScrollPane actionsPane = new JScrollPane(actions);
        actionsPane.setBorder(empty);

        JScrollPane worldPane = new JScrollPane(worldView);
        worldPane.setBorder(empty);

        JScrollPane overviewPane = new JScrollPane(overview);
        overviewPane.setBorder(empty);

        add(actionsPane, "span 1 2, w 180!, h 600!");
        add(overviewPane, "cell 1 0, w 600!, h 50!");
        add(worldPane, "cell 1 1, w 600!, h 550!");
    }

    public static void main(String[] args) {
        try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());

            Application app = new Application();
            app.setResizable(false);
            app.setIconImage(new ImageIcon(Application.class.getResource("/images/favicon.png")).getImage());
            app.setVisible(true);
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    private static final long serialVersionUID = -1L;
}
