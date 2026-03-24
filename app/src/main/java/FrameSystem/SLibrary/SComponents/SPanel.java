
package FrameSystem.SLibrary.SComponents;

import java.awt.Component;
import java.awt.Cursor;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.MouseListener;
import java.beans.BeanProperty;
import java.beans.JavaBean;

import javax.swing.JPanel;
import javax.swing.border.Border;

import EventSystem.Interface.InnerListener;
import MainSystem.CustomGraphics;
import java.awt.Color;
import javax.swing.border.EmptyBorder;

@JavaBean(description = "A component that displays a jpanel")
public class SPanel extends JPanel implements InnerListener{

    public SPanel(){
        super();
        super.setBorder(null);
    }
    
// Setters and Getters =======================================================================================
    
    protected int radius = 0;
    
    @BeanProperty(preferred = true, visualUpdate = true, description = "The corner radius")
    public void setRadius(int radius){
        this.radius = radius;
    }

    public int getRadius(){
        return radius;
    }
    
    public int getRadius(int add){
        int output = radius + add;
        return output < 0 ? 0 : output;
    }
    
// -----------------------------------------------------------------------------------------------------------
    
    protected boolean rounded = false;

    @BeanProperty(preferred = true, visualUpdate = true, description = "If the panel is rounded")
    public void setRounded(boolean rounded){
        this.rounded = rounded;
        setOpaque(!rounded);
    }

    public boolean isRounded(){
        return rounded;
    }
    
// -----------------------------------------------------------------------------------------------------------

    @Override
    @BeanProperty(hidden = true)
    public void setToolTipText(String text){
        super.setToolTipText(text);
    }

    @Override
    @BeanProperty(hidden = true)
    public void setBorder(Border border){
        super.setBorder(border);
    }
    
// ===========================================================================================================
    
    protected int borderLine = 0;

    @BeanProperty(preferred = true, visualUpdate = true, description = "The border line width")
    public void setBorderLine(int borderLine){
        this.borderLine = borderLine;
    }
    
    public int getBorderLine(){
        return borderLine;
    }
    
// -----------------------------------------------------------------------------------------------------------
    
    protected Color borderColor = Color.white;

    @BeanProperty(preferred = true, visualUpdate = true, description = "The border color")
    public void setBorderColor(Color borderColor){
        this.borderColor = borderColor;
    }

    public Color getBorderColor(){
        return borderColor;
    }
    
// Drop Shadow ===============================================================================================
    
    protected int shadowSize;

    @BeanProperty(preferred = true, visualUpdate = true, description = "")
    public void setShadowSize(int shadowSize){
        this.shadowSize = shadowSize;
        
        setBorderPadding();
    }

    public int getShadowSize(){
        return shadowSize;
    }
    
// -----------------------------------------------------------------------------------------------------------
    
    protected float shadowOpacity;

    @BeanProperty(preferred = true, visualUpdate = true, description = "")
    public void setShadowOpacity(float shadowOpacity){
        this.shadowOpacity = shadowOpacity;
    }

    public float getShadowOpacity(){
        return shadowOpacity;
    }
    
// -----------------------------------------------------------------------------------------------------------
    
    protected Color shadowColor;

    @BeanProperty(preferred = true, visualUpdate = true, description = "")
    public void setShadowColor(Color shadowColor){
        this.shadowColor = shadowColor;
    }

    public Color getShadowColor(){
        return shadowColor;
    }
    
// -----------------------------------------------------------------------------------------------------------
    
    protected int shadowOffsetLeft;

    @BeanProperty(preferred = true, visualUpdate = true, description = "")
    public void setShadowOffsetLeft(int shadowOffsetLeft){
        this.shadowOffsetLeft = shadowOffsetLeft;
    }

    public int getShadowOffsetLeft(){
        return shadowOffsetLeft;
    }
    
// -----------------------------------------------------------------------------------------------------------
    
    protected int shadowOffsetRight;

    @BeanProperty(preferred = true, visualUpdate = true, description = "")
    public void setShadowOffsetRight(int shadowOffsetRight){
        this.shadowOffsetRight = shadowOffsetRight;
    }

    public int getShadowOffsetRight(){
        return shadowOffsetRight;
    }
    
// -----------------------------------------------------------------------------------------------------------
    
    protected int shadowOffsetUp;

    @BeanProperty(preferred = true, visualUpdate = true, description = "")
    public void setShadowOffsetUp(int shadowOffsetUp){
        this.shadowOffsetUp = shadowOffsetUp;
    }

    public int getShadowOffsetUp(){
        return shadowOffsetUp;
    }
    
// -----------------------------------------------------------------------------------------------------------
    
    protected int shadowOffsetDown;

    @BeanProperty(preferred = true, visualUpdate = true, description = "")
    public void setShadowOffsetDown(int shadowOffsetDown){
        this.shadowOffsetDown = shadowOffsetDown;
    }

    public int getShadowOffsetDown(){
        return shadowOffsetDown;
    }
    
// -----------------------------------------------------------------------------------------------------------
    
    private void setBorderPadding(){
        // Top, Left, Bottom, Right
        setBorder(new EmptyBorder(shadowSize - shadowOffsetUp, shadowSize - shadowOffsetLeft, shadowSize + shadowOffsetDown, shadowSize + shadowOffsetRight));
    }
    
// Overrided Methods =========================================================================================

    public void paintOverrideAll(Graphics g){
        super.paint(g);
    }
    
    public void paintOverride(Graphics g, int n){
        super.paint(g);
    }
    
    public void paintOverride(Graphics g){
        super.paint(g);
    }
    
// -----------------------------------------------------------------------------------------------------------
    
    @Override
    public void setCursor(Cursor cursor){
        super.setCursor(cursor);
    }
    
    @Override
    public void addInnerListeners(MouseListener listener){
        super.addMouseListener(listener);
        synchronized(getTreeLock()){
            int i = getComponentCount() - 1;
            if(i < 0) return;
            for(; i >= 0; i--){
                Component c = getComponent(i);
                if(c == null) continue;
                if(c instanceof InnerListener innerListener){
                    innerListener.addInnerListeners(listener);
                }else{
                    c.addMouseListener(listener);
                }
            }
        }
    }
    
    @Override
    public void paint(Graphics g){
        if(!rounded){
            super.paint(g);
            return;
        }
        
        Graphics2D g2 = CustomGraphics.getGraphics2D(g);
        
        // ------------
        
        int width = getWidth();
        int height = getHeight();

        // Calculate the actual size of the inner panel content area
        int x = shadowSize;
        int y = shadowSize;
        int w = width - (shadowSize * 2) - shadowOffsetX;
        int h = height - (shadowSize * 2) - shadowOffsetY;

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
                x - i + shadowOffsetX, 
                y - i + shadowOffsetY, 
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
