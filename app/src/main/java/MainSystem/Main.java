package MainSystem;

import ConsoleSystem.Console;
import com.formdev.flatlaf.FlatLightLaf;

import javax.swing.SwingUtilities;

public class Main {

    public static boolean coloredOutput = true;

    public static SFrame frame;

    public static void main(String[] args) {
        try {
            FlatLightLaf.setup();
        } catch (Exception ex) {
            Console.errorOut("Failed to initialize FlatLaf", ex);
        }
        
        SwingUtilities.invokeLater(() -> {
            frame = new SFrame();
            Manager.setDefault(frame);
            frame.initShowDefaultLayer();
            frame.setVisible(true);
        });
    }

}
