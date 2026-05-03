
package FrameSystem.Layers.Tenants.Components;

import ConsoleSystem.Console;
import ConsoleSystem.ConsoleColors;
import FrameSystem.SLibrary.SAbstractComponents.SLayer;
import FrameSystem.SLibrary.SAbstractComponents.SLayerButton;
import java.awt.event.KeyEvent;
import java.util.ArrayList;

public class LayerUnitTenants_Main extends SLayer{

// ==== Constructor ==========================================================================================
    
    public LayerUnitTenants_Main(){
        addLayer();
    }

    private void addLayer(){
        addLayer(this);
    }
    
// ==== Implementations ======================================================================================
    
    @Override
    protected void showLayeredPanel(){
        showLayer(this);
    }

// ==== Static Methods =======================================================================================

    private static ArrayList<LayerUnitTenants_Main> layeredPanels = new ArrayList<>();
    private static LayerUnitTenants_Main currentLayeredPanel = null;
    
    private static void addLayer(LayerUnitTenants_Main layer){
        layeredPanels.add(layer);
    }
    
    public static LayerUnitTenants_Main getCurrentLayeredPanel(){
        return currentLayeredPanel;
    }
    
    public static void showLayer(LayerUnitTenants_Main showLayer){
        if(currentLayeredPanel != null && (!currentLayeredPanel.fireLayeredPanelHideListener(showLayer.getAccessibleContext().getAccessibleName()))){
            return;
        }
        if(!showLayer.fireLayeredPanelBeforeShowListener(currentLayeredPanel == showLayer, showLayer.toString())){
            return;
        }
        
        Console.line().out("SHOWING LAYER " + showLayer.getLayerPath(), ConsoleColors.GREEN);
        
        for(LayerUnitTenants_Main layer : layeredPanels){
            SLayerButton layeredButton = layer.getLayerButton();
            
            layer.setVisible(layer == showLayer);
            if(layeredButton != null) layeredButton.setActiveButton(layer == showLayer);
        }
        showLayer.fireLayeredPanelShowListener(currentLayeredPanel == showLayer, showLayer.toString());
        currentLayeredPanel = showLayer;
    }
    
    public static void keyPressed(KeyEvent evt){
        if(currentLayeredPanel == null) return;
        currentLayeredPanel.fireLayeredPanelKeyPressedListener(evt);
    }

}
