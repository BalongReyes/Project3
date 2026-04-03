
package FrameSystem.Layers.Units.Managers;


import EventSystem.Interface.ReconnectExecute;
import FrameSystem.Layers.Home.Module.ModuleHome;
import FrameSystem.Layers.Units.Components.LayerUnits;
import FrameSystem.Layers.Units.Module.ModuleUnits;
import MainSystem.Manager;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

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
        
        moduleUnits.filterTower1.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e){
                moduleUnits.filterTower1.toggleActive();
            }
        });
        
        moduleUnits.filterTower2.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e){
                moduleUnits.filterTower2.toggleActive();
            }
        });
        
        moduleUnits.filterTower3.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e){
                moduleUnits.filterTower3.toggleActive();
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
