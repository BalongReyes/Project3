package MainSystem;

import DatabaseSystem.AccountsData.AccountsDataHandler;
import DatabaseSystem.AccountsData.AccountsDataTable;
import com.formdev.flatlaf.FlatLightLaf;

import DatabaseSystem.Database; // Import FlatLaf
import java.time.LocalDate;

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

        frame = new SFrame();
        frame.setVisible(true);

        Manager.setDefault(frame);
        frame.initShowDefaultLayer();
        frame.setVisible(true);
        
        AccountsDataTable myNewAccount = new AccountsDataTable(
        null,                                   // ID 
        "Sedian",                               // Name
        11,                                     // UserID
        "BalongReyes",                          // Username
        "",                                     // Password (leave empty)
        "",                                     // Salt (leave empty)
        1,                                      // Role
        java.sql.Date.valueOf(LocalDate.now())  // Last Change (Today)
        );

        // 2. Insert it securely! Pass the object AND the raw password.
        // The DataHandler will instantly generate a unique salt, hash "1321" 65,536 times, 
        // and save it all to your database.
        AccountsDataHandler.insertData(myNewAccount, "5946");

        System.out.println("Account successfully secured and inserted!");
    }

}
