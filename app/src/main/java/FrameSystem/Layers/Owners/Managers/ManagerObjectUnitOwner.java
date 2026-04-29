package FrameSystem.Layers.Owners.Managers;

import FrameSystem.Layers.Owners.Components.LayerUnitOwners_Main;

public class ManagerObjectUnitOwner extends ManagerModuleUnitOwner {

    public static void initDefault() {
        moduleHome.layerHome_Units.addLayeredPanelShowListener((evt) -> {
            LayerUnitOwners_Main.showLayer(moduleUnitOwners.layerUnitOwnersData);
        });
        
//        initPaginationControls(); FIX
    }
    
}