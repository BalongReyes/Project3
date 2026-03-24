
package FrameSystem.SLibrary.SComponents;

import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.beans.JavaBean;

import EventSystem.Interface.InnerListener;
import MainSystem.CustomGraphics;
import java.awt.Color;
import java.beans.BeanProperty;

@JavaBean(description = "A component that displays a jpanel")
public class SPanelBorder extends SPanel implements InnerListener{

// Constructor ===============================================================================================
    
    public SPanelBorder(){
        super();
    }
    
// ===========================================================================================================
    
    private int borderLine = 0;

    @BeanProperty(preferred = true, visualUpdate = true, description = "The border line width")
    public void setBorderLine(int borderLine){
        this.borderLine = borderLine;
    }
    
    public int getBorderLine(){
        return borderLine;
    }
    
// -----------------------------------------------------------------------------------------------------------
    
    private Color borderColor = Color.white;

    @BeanProperty(preferred = true, visualUpdate = true, description = "The border color")
    public void setBorderColor(Color borderColor){
        this.borderColor = borderColor;
    }

    public Color getBorderColor(){
        return borderColor;
    }
    
// Overrided Methods =========================================================================================
    
    @Override
    public void paint(Graphics g){
        if(!rounded){
            super.paint(g);
            return;
        }
        
        Graphics2D g2 = CustomGraphics.getGraphics2D(g);
        Dimension s = getSize();
        
        g2.setColor(borderColor);
        g2.fillRoundRect(0, 0, s.width, s.height, radius, radius);
        
        g2.setColor(getBackground());
        g2.fillRoundRect(borderLine, borderLine, s.width - (borderLine * 2), s.height - (borderLine * 2), radius - borderLine, radius - borderLine);
        
        if(!cornerUL){
            g2.fillRect(0, 0, radius, radius);
        }
        if(!cornerUR){
            g2.fillRect(s.width - radius, 0, s.width, radius);
        }
        if(!cornerDL){
            g2.fillRect(0, s.height - radius, radius, s.height);
        }
        if(!cornerDR){
            g2.fillRect(s.width - radius, s.height - radius, s.width, s.height);
        }
        
        paintOverrideAll(g);
    }

}
