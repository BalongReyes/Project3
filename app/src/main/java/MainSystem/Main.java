package MainSystem;

import com.formdev.flatlaf.FlatLightLaf;

import DatabaseSystem.Database; // Import FlatLaf
import javax.swing.SwingUtilities;

public class Main {

    public static boolean debugDataHandlerRefresh = true;
    public static boolean coloredOutput = true;

    public static SFrame frame;

    public static void main(String[] args) {
        Database.openConnection();

        try {
            FlatLightLaf.setup();
        } catch (Exception ex) {
            System.err.println("Failed to initialize FlatLaf");
        }
        
        SwingUtilities.invokeLater(() -> {
            frame = new SFrame();
            Manager.setDefault(frame);
            frame.initShowDefaultLayer();
            
            frame.setVisible(true);
        });
    }

}
