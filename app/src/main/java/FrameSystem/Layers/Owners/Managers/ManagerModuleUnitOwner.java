package FrameSystem.Layers.Owners.Managers;

import EventSystem.Interface.ReconnectExecute;
import FrameSystem.Layers.Home.Module.ModuleHome;
import FrameSystem.Layers.Owners.Components.LayerUnitOwners;
import FrameSystem.Layers.Owners.Module.ModuleUnitOwners;
import MainSystem.Manager;

public class ManagerModuleUnitOwner extends Manager{

    public static ModuleHome moduleHome;
    public static ModuleUnitOwners moduleUnitOwners;
    
    public static void initDefault(){
        moduleHome = frame.moduleHome;
        moduleUnitOwners = frame.moduleHome.moduleUnitOwners;
        
        moduleHome.layerHome_Owners.addLayeredPanelShowListener(evt -> {
            if(!evt.alreadyShowing){
                moduleUnitOwners.sTextField1.requestFocus();
                LayerUnitOwners.showLayer(moduleUnitOwners.layerUnitOwnersLoading);
//                ManagerObjectUnitOwner.refreshObjects(); FIX
            }
        });
        
        ManagerObjectUnitOwner.initDefault();
        ManagerFilterUnitOwners.initDefault();
    }
    
// Main Methods ==============================================================================================
    
    private static boolean offlineMode = false;
    
    public static boolean isOfflineMode(){
        return offlineMode;
    }
    
    public static void reconnectMode(ReconnectExecute reconnectExecute){
        LayerUnitOwners.showLayer(moduleUnitOwners.layerUnitOwnersOffline);
        offlineMode = true;
        
        frame.reconnectMode("ManagerModuleUnitOwner", () -> {
            LayerUnitOwners.showLayer(moduleUnitOwners.layerUnitOwnersLoading);
            offlineMode = false;
            if(reconnectExecute != null) reconnectExecute.reconnect();
        });
    }
}