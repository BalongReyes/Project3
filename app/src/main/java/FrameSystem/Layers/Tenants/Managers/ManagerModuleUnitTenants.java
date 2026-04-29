package FrameSystem.Layers.Tenants.Managers;

import EventSystem.Interface.ReconnectExecute;
import FrameSystem.Layers.Home.Module.ModuleHome;
import FrameSystem.Layers.Tenants.Components.LayerUnitTenants;
import FrameSystem.Layers.Tenants.Module.ModuleUnitTenants;
import MainSystem.Manager;

public class ManagerModuleUnitTenants extends Manager {

    public static ModuleHome moduleHome;
    public static ModuleUnitTenants moduleUnitTenants;
    
    public static void initDefault(){
        moduleHome = frame.moduleHome;
        moduleUnitTenants = frame.moduleHome.moduleUnitTenants;
        
        moduleHome.layerHome_Tenants.addLayeredPanelShowListener(evt -> {
            if(!evt.alreadyShowing){
                moduleUnitTenants.sTextField1.requestFocus();
                LayerUnitTenants.showLayer(moduleUnitTenants.layerUnitTenantsLoading);
                ManagerObjectUnitTenants.refreshObjects();
            }
        });
        
        ManagerObjectUnitTenants.initDefault();
        ManagerFilterUnitTenants.initDefault();
    }
    
// Main Methods ==============================================================================================
    
    private static boolean offlineMode = false;
    
    public static boolean isOfflineMode(){
        return offlineMode;
    }
    
    public static void reconnectMode(ReconnectExecute reconnectExecute){
        LayerUnitTenants.showLayer(moduleUnitTenants.layerUnitTenantsOffline);
        offlineMode = true;
        
        frame.reconnectMode("ManagerModuleUnitTenants", () -> {
            LayerUnitTenants.showLayer(moduleUnitTenants.layerUnitTenantsLoading);
            offlineMode = false;
            if(reconnectExecute != null) reconnectExecute.reconnect();
        });
    }
}