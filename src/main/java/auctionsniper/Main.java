package auctionsniper;

import javax.swing.*;

/**
 * Created by ecomba on 21/03/15.
 */
public class Main {
    private MainWindow ui;

    public static final String MAIN_WINDOW_NAME = "";
    public static final String SNIPER_STATUS_NAME = "";
    public static final String STATUS_JOINING = "joining";
    public static final String STATUS_LOST = "lost";

    public Main() throws Exception {
        startUserInterface();
    }

    private void startUserInterface() throws Exception {
        SwingUtilities.invokeAndWait(new Runnable() {
            @Override
            public void run() {
                ui = new MainWindow();
            }
        });
    }

    public static void main(String... args) throws Exception {
        new Main();
    }
}

