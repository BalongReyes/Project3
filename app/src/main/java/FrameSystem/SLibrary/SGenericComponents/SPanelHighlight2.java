
package FrameSystem.SLibrary.SGenericComponents;

import FrameSystem.SLibrary.SComponents.SPanelActivatable;
import MainSystem.CustomGraphics;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.beans.BeanProperty;
import java.beans.JavaBean;

@JavaBean(description = "A SPanel with line highlight")
public class SPanelHighlight2 extends SPanelActivatable{

    public SPanelHighlight2(){
        super();
    }

// Setters and Getters =======================================================================================

    private Color activeLineColor = new Color(255, 255, 255);

    @BeanProperty(preferred = true, visualUpdate = true, description = "")
    public void setActiveLineColor(Color activeLineColor){
        this.activeLineColor = activeLineColor;
    }

    public Color getActiveLineColor(){
        return activeLineColor;
    }
    
    private Color inactiveLineColor = new Color(255, 255, 255);

    @BeanProperty(preferred = true, visualUpdate = true, description = "")
    public void setInactiveLineColor(Color inactiveLineColor){
        this.inactiveLineColor = inactiveLineColor;
    }

    public Color getInactiveLineColor(){
        return inactiveLineColor;
    }
    
// Overrided Methods =========================================================================================
    
    @Override
    @BeanProperty(hidden = true)
    public void setBackground(Color bg){
        super.setBackground(bg);
    }
    
    @Override
    public void paint(Graphics g){
        Graphics2D g2 = CustomGraphics.getGraphics2D(g);
        Dimension s = getSize();

        super.paint(g);
        
        if(active){
            g2.setColor(activeLineColor);
        }else{
            g2.setColor(inactiveLineColor);
        }
        g2.fillRoundRect(0, 0, s.width, s.height, radius, radius);
        
        if(active){
            g2.setColor(activeBackgroundColor);
        }else{
            g2.setColor(inactiveBackgroundColor);
        }
        g2.fillRoundRect(2, 2, s.width - 4, s.height - 4, getRadius(-2), getRadius(-2));
        
        super.paintOverrideAll(g);
    }
    
}
