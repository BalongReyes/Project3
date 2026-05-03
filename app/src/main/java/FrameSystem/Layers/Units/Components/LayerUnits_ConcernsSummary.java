
package FrameSystem.Layers.Units.Components;

import ConsoleSystem.Console;
import ConsoleSystem.ConsoleColors;
import FrameSystem.SLibrary.SAbstractComponents.SLayer;
import FrameSystem.SLibrary.SAbstractComponents.SLayerButton;
import java.awt.event.KeyEvent;
import java.util.ArrayList;

public class LayerUnits_ConcernsSummary extends SLayer{

// ==== Constructor ==========================================================================================
    
    public LayerUnits_ConcernsSummary(){
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

    private static ArrayList<LayerUnits_ConcernsSummary> layeredPanels = new ArrayList<>();
    private static LayerUnits_ConcernsSummary currentLayeredPanel = null;
    
    private static void addLayer(LayerUnits_ConcernsSummary layer){
        layeredPanels.add(layer);
    }
    
    public static LayerUnits_ConcernsSummary getCurrentLayeredPanel(){
        return currentLayeredPanel;
    }
    
    public static void showLayer(LayerUnits_ConcernsSummary showLayer){
        if(currentLayeredPanel != null && (!currentLayeredPanel.fireLayeredPanelHideListener(showLayer.getAccessibleContext().getAccessibleName()))){
            return;
        }
        if(!showLayer.fireLayeredPanelBeforeShowListener(currentLayeredPanel == showLayer, showLayer.toString())){
            return;
        }
        
        Console.line().out("SHOWING LAYER " + showLayer.getLayerPath(), ConsoleColors.GREEN);
        
        for(LayerUnits_ConcernsSummary layer : layeredPanels){
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
