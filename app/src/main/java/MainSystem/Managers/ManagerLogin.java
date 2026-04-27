package MainSystem.Managers;

import java.sql.SQLException;

import ConsoleSystem.Console;
import DatabaseSystem.AccountsData.AccountsDataHandler;
import DatabaseSystem.AccountsData.AccountsDataTable;
import FrameSystem.Layers.Home.Components.LayerHome;
import FrameSystem.Layers.Home.Managers.ManagerModuleHome;
import FrameSystem.Layers.Home.Module.ModuleHome;
import FrameSystem.Layers.Login.Module.ModuleLogin;
import FrameSystem.Layers.Main.Components.LayerMain;
import MainSystem.Manager;

public class ManagerLogin extends Manager {

    // FIX #9: Made private so no other class can accidentally reassign these references.
    // Use the getters below to access them where needed.
    private static ModuleLogin moduleLogin;
    private static ModuleHome  moduleHome;

    public static void initDefault() {
        moduleLogin = frame.moduleLogin;
        moduleHome  = frame.moduleHome;
    }

    public static ModuleLogin getModuleLogin() { return moduleLogin; }
    public static ModuleHome  getModuleHome()  { return moduleHome;  }

// Methods ===================================================================================================

    private static AccountsDataTable accountLoggedIn = null;

    public static AccountsDataTable getAccountLoggedIn() {
        return accountLoggedIn;
    }

    public static void updateAccountLoggedIn(AccountsDataTable updateAccountLoggedIn) {
        if (!accountLoggedIn.idEquals(updateAccountLoggedIn.id())) return;
        accountLoggedIn = updateAccountLoggedIn;
    }
    
    public static boolean isLoggedIn() {
        return accountLoggedIn != null;
    }

// -----------------------------------------------------------------------------------------------------------

    public static void resetUI() {
        moduleLogin.loginError1.setVisible(false);
        moduleLogin.loginError2.setVisible(false);
        moduleLogin.loginError3.setVisible(false);
        moduleLogin.loginUsernameField.setText("");
        moduleLogin.loginPasswordField.setText("");
        moduleLogin.loginPasswordField.showPassword(false);
    }

    public static void logoutAccount() {
        accountLoggedIn = null;
        LayerMain.showLayer(frame.layerMain_Login);
        moduleLogin.loginUsernameField.requestFocus();
    }

    public static void loginAccount() {
        boolean insufficientInput = false;

        if (moduleLogin.loginUsernameField.getText().isEmpty()) insufficientInput = true;
        moduleLogin.loginError1.setVisible(moduleLogin.loginUsernameField.getText().isEmpty());

        if (moduleLogin.loginPasswordField.getPassword().length == 0) insufficientInput = true;
        moduleLogin.loginError2.setVisible(moduleLogin.loginPasswordField.getPassword().length == 0);

        if (insufficientInput) {
            moduleLogin.loginError3.setVisible(false);
            return;
        }

        // Capture the password into a local char[] so we can pass it to loginAccount,
        // which will zero it out in its finally block (FIX #8).
        char[] password = moduleLogin.loginPasswordField.getPassword();

        AccountsDataTable accountSuccessLogin = null;
        try {
            accountSuccessLogin = AccountsDataHandler.loginAccount(
                moduleLogin.loginUsernameField.getText(), password
            );
        } catch (SQLException e) {
            Console.errorOut("Login error", e);
            moduleLogin.offlineMode();
        }

        if (accountSuccessLogin != null) {
            accountLoggedIn = accountSuccessLogin;
            LayerMain.showLayer(frame.layerMain_Home);
            LayerHome.showLayer(moduleHome.layerHome_Dashboard);
            resetUI();
            ManagerModuleHome.changeAccount(accountLoggedIn);
        } else {
            moduleLogin.loginError3.setVisible(true);
        }
    }
}