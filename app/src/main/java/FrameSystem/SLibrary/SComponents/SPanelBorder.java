
package FrameSystem.SLibrary.SComponents;

import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.beans.JavaBean;

import EventSystem.Interface.InnerListener;
import MainSystem.CustomGraphics;
import java.awt.Color;
import java.beans.BeanProperty;
import javax.swing.border.EmptyBorder;

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
    
// Drop Shadow ===============================================================================================
    
    private int shadowSize;

    @BeanProperty(preferred = true, visualUpdate = true, description = "")
    public void setShadowSize(int shadowSize){
        this.shadowSize = shadowSize;
        
        int padding = shadowSize + shadowOffset;
        setBorder(new EmptyBorder(padding, padding, padding, padding));
    }

    public int getShadowSize(){
        return shadowSize;
    }
    
// -----------------------------------------------------------------------------------------------------------
    
    private float shadowOpacity;

    @BeanProperty(preferred = true, visualUpdate = true, description = "")
    public void setShadowOpacity(float shadowOpacity){
        this.shadowOpacity = shadowOpacity;
    }

    public float getShadowOpacity(){
        return shadowOpacity;
    }
    
// -----------------------------------------------------------------------------------------------------------
    
    private Color shadowColor;

    @BeanProperty(preferred = true, visualUpdate = true, description = "")
    public void setShadowColor(Color shadowColor){
        this.shadowColor = shadowColor;
    }

    public Color getShadowColor(){
        return shadowColor;
    }
    
// -----------------------------------------------------------------------------------------------------------
    
    private int shadowOffset;

    @BeanProperty(preferred = true, visualUpdate = true, description = "")
    public void setShadowOffset(int shadowOffset){
        this.shadowOffset = shadowOffset;
        
        int padding = shadowSize + shadowOffset;
        setBorder(new EmptyBorder(padding, padding, padding, padding));
    }

    public int getShadowOffset(){
        return shadowOffset;
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
        
        // ------------
        
        int width = getWidth();
        int height = getHeight();

        // Calculate the actual size of the inner panel content area
        int x = shadowSize;
        int y = shadowSize;
        int w = width - (shadowSize * 2) - shadowOffset;
        int h = height - (shadowSize * 2) - shadowOffset;

        // Draw the drop shadow
        for (int i = 0; i < shadowSize; i++) {
            // Gradually decrease the alpha to create a blur effect
            float opacity = shadowOpacity * (1.0f - ((float) i / shadowSize));
            g.setColor(new Color(
                    shadowColor.getRed(),
                    shadowColor.getGreen(),
                    shadowColor.getBlue(),
                    (int) (opacity * 255)
            ));

            // Draw concentric rounded rectangles expanding outwards
            g.fillRoundRect(
                    x - i + shadowOffset, 
                    y - i + shadowOffset, 
                    w + (i * 2), 
                    h + (i * 2), 
                    radius + i, 
                    radius + i
            );
        }

        // ------------
        
        g2.setColor(borderColor);
        g2.fillRoundRect(x, y, w, h, radius, radius);
        
        g2.setColor(getBackground());
        g2.fillRoundRect(x + borderLine, y + borderLine, w - (borderLine * 2), h - (borderLine * 2), radius - borderLine, radius - borderLine);
        
        paintOverrideAll(g);
    }

}
