
package FrameSystem.SLibrary.SAnimated;

import FrameSystem.SLibrary.SComponents.SPanelAnimated;
import MainSystem.CustomGraphics;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.ActionEvent;

public class SAnimatedOffline extends SPanelAnimated{

    public SAnimatedOffline(){
        super(10);
    }
    
// Overrided Methods =========================================================================================

    @Override
    public void actionPerformed(ActionEvent e){
        // animation state changes
        
        super.actionPerformed(e);
    }
    
    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2 = CustomGraphics.getGraphics2D(g);
        
        // animation draw
    }

}
