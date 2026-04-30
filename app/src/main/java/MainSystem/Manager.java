package MainSystem;

import FrameSystem.Layers.Home.Managers.ManagerModuleHome;
import FrameSystem.Layers.Login.Managers.ManagerModuleLogin;
import FrameSystem.Layers.Owners.Managers.ManagerModuleUnitOwner;
import FrameSystem.Layers.Tenants.Managers.ManagerModuleUnitTenants;
import FrameSystem.Layers.Units.Managers.ManagerModuleUnits;
import MainSystem.Managers.ManagerLogin;

public class Manager {

    protected static SFrame frame;

    public static void setDefault(SFrame frame) {
        Manager.frame = frame;
    }
    
    public static void initDefaults(){
        ManagerLogin.initDefault();
        ManagerModuleLogin.initDefault();
        ManagerModuleHome.initDefault();
        
        ManagerModuleUnits.initDefault();
        ManagerModuleUnitOwner.initDefault();
        ManagerModuleUnitTenants.initDefault();
    }

}
