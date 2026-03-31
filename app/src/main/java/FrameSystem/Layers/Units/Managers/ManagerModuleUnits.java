
package FrameSystem.Layers.Units.Managers;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

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
                ManagerObjectUnits.clearFilterObject(false);
                ManagerObjectUnits.refreshObjects(null, true);
            }
        });
        
        moduleUnits.sPanelHover2.addMouseListener(new MouseAdapter(){
            @Override
            public void mousePressed(MouseEvent e){
                super.mousePressed(e);
                moduleUnits.sFilterTower1.setActive(false);
                moduleUnits.sFilterTower2.setActive(false);
                moduleUnits.sFilterTower3.setActive(false);
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
