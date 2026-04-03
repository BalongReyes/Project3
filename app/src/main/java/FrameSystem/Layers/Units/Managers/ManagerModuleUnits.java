
package FrameSystem.Layers.Units.Managers;


import EventSystem.Interface.ReconnectExecute;
import FrameSystem.Layers.Home.Module.ModuleHome;
import FrameSystem.Layers.Units.Components.LayerUnits;
import FrameSystem.Layers.Units.Module.ModuleUnits;
import MainSystem.Manager;

public class ManagerModuleUnits extends Manager{

    public static ModuleHome moduleHome;
    public static ModuleUnits moduleUnits;
    
    public static void initDefault(){
        moduleHome = frame.moduleHome;
        moduleUnits = frame.moduleHome.moduleUnits;
        
        moduleHome.layerHome_Units.addLayeredPanelShowListener(evt -> {
            if(!evt.alreadyShowing){
                moduleUnits.sTextField1.requestFocus();
                LayerUnits.showLayer(moduleUnits.layerUnitsLoading);
                ManagerObjectUnits.setDefaultFilters();
                ManagerObjectUnits.refreshObjects(null, true);
            }
        });
    }
    
// Main Methods ==============================================================================================
    
    private static boolean offlineMode = false;
    
    public static boolean isOfflineMode(){
        return offlineMode;
    }
    
    public static void reconnectMode(ReconnectExecute reconnectExecute){
        LayerUnits.showLayer(moduleUnits.layerUnitsOffline);
        offlineMode = true;
        
        frame.reconnectMode("ManagerItemDetails", () -> {
            LayerUnits.showLayer(moduleUnits.layerUnitsLoading);
            offlineMode = false;
            if(reconnectExecute != null) reconnectExecute.reconnect();
        });
    }

}
