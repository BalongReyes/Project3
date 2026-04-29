package FrameSystem.Layers.Tenants.Managers;

import FrameSystem.Layers.Tenants.Components.LayerUnitTenants_Main;

public class ManagerObjectUnitTenants extends ManagerModuleUnitTenants {

    public static void initDefault() {
        moduleHome.layerHome_Units.addLayeredPanelShowListener((evt) -> {
            LayerUnitTenants_Main.showLayer(moduleUnitTenants.layerUnitTenantsData);
        });
        
//        initPaginationControls(); FIX
    }
    
}