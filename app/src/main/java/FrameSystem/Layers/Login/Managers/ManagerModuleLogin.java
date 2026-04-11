
package FrameSystem.Layers.Login.Managers;

import ConsoleSystem.Console;
import DatabaseSystem.Database;
import EventSystem.Listeners.MouseClickedAdaptor;
import FrameSystem.Layers.Login.Components.LayerLogin;
import FrameSystem.Layers.Login.Module.ModuleLogin;
import MainSystem.Manager;
import MainSystem.Managers.ManagerLogin;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;
import java.sql.SQLException;

public class ManagerModuleLogin extends Manager{
    
    public static ModuleLogin moduleLogin;

    public static void initDefault(){
        moduleLogin = frame.moduleLogin;
        
        frame.layerMain_Login.addLayeredPanelShowListener(evt -> {
            ManagerLogin.resetUI();
            
            try{
                if(Database.getConnection() == null || Database.getConnection().isClosed()){
                    moduleLogin.offlineMode();
                }else{
                    LayerLogin.showLayer(moduleLogin.layerLogin_Online);
                    moduleLogin.loginUsernameField.requestFocus();
                }
            }catch(SQLException e){
                Console.errorOut("Initialize show default layer", e);
            }
        });
        
        moduleLogin.loginButton.addMouseListener((MouseClickedAdaptor) evt -> {
            ManagerLogin.loginAccount();
        });
        
        moduleLogin.loginUsernameField.addActionListener(evt -> {
            moduleLogin.loginPasswordField.requestFocus();
        });
        moduleLogin.loginPasswordField.addActionListener(evt -> {
            ManagerLogin.loginAccount();
        });
        
        moduleLogin.loginUsernameField.addFocusListener(new FocusAdapter() {
            @Override
            public void focusLost(FocusEvent evt){
                if(!moduleLogin.loginUsernameField.getText().isEmpty()){
                    moduleLogin.loginError1.setVisible(false);
                }
            }
        });
        moduleLogin.loginPasswordField.addFocusListener(new FocusAdapter() {
            @Override
            public void focusLost(FocusEvent evt){
                if(moduleLogin.loginPasswordField.getPassword().length != 0){
                    moduleLogin.loginError2.setVisible(false);
                }
            }
        });
    }
    
}
