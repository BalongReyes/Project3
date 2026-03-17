package MainSystem;

import FrameSystem.LayerFolder_Main.Layers.LayerFolder_Home.Managers.ManagerModuleHome;
import FrameSystem.LayerFolder_Main.Layers.LayerFolder_Login.Managers.ManagerModuleLogin;
import MainSystem.Managers.ManagerLogin;

public class Manager {

    protected static SFrame frame;

    public static void setDefault(SFrame frame) {
        Manager.frame = frame;
        
        ManagerLogin.initDefault(frame.moduleLogin, frame.moduleHome);
        ManagerModuleLogin.initDefault(frame.moduleLogin);
        ManagerModuleHome.initDefault(frame.moduleHome);
    }

}
