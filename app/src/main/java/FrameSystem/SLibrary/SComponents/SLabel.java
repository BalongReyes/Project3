
package FrameSystem.SLibrary.SComponents;

import MainSystem.CustomGraphics;
import java.awt.Cursor;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.beans.BeanProperty;
import java.beans.JavaBean;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.border.Border;

@JavaBean(description = "A component that displays a jlabel that renders with RenderingHints")
public class SLabel extends JLabel{

// ==== Constructor ==========================================================================================
    
    public SLabel(){
        super();
        setDefault();
    }
    
// ==== Methods ==============================================================================================
    
    private void setDefault(){
        setFont(new java.awt.Font("Segoe UI", 1, 11));
    }
    
// ==== Getters And Setters ==================================================================================
    
    protected ImageIcon scaledIcon = null;
    protected ImageIcon scaledImageIcon = null;

    @BeanProperty(preferred = true, visualUpdate = true, description = "Scaled icon")
    public void setScaledIcon(Icon icon){
        if(icon == null){
            this.scaledIcon = null;
            setIcon(null);
            return;
        }

        if(icon instanceof ImageIcon imageIcon){
            this.scaledIcon = imageIcon;
            scaledImageIcon = this.scaledIcon;

            if(iconSize > 0){
                scaledImageIcon = new ImageIcon(CustomGraphics.getSmoothScaledImage(this.scaledIcon.getImage(), iconSize, iconSize));
            }
            setIcon(scaledImageIcon);
        }else{
            this.scaledIcon = null;
            setIcon(icon);
        }
    }

    public Icon getScaledIcon(){ // Remains as Icon!
        return scaledIcon;
    }

// ---- Icon Size --------------------------------------------------------------------------------------------
    
    protected int iconSize = 16;

    @BeanProperty(preferred = true, visualUpdate = true, description = "Size of scaled icon")
    public void setIconSize(int iconSize){
        this.iconSize = iconSize;
        if(scaledIcon != null){
            scaledImageIcon = scaledIcon;
            if(iconSize > 0){
                scaledImageIcon = new ImageIcon(CustomGraphics.getSmoothScaledImage(scaledIcon.getImage(), iconSize, iconSize));
            }
            setIcon(scaledImageIcon);
        }
    }

    public int getIconSize(){
        return iconSize;
    }

// ---- Component Properties ---------------------------------------------------------------------------------
    
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
    
// ==== Overrided Methods ====================================================================================
    
    @Override
    public void setCursor(Cursor cursor){
        super.setCursor(cursor);
    }
    
    public void paintOverrideAll(Graphics g){
        super.paint(g);
    }
    
    public void paintOverride(Graphics g, int n){
        super.paint(g);
    }
    
    public void paintOverride(Graphics g){
        super.paint(g);
    }
    
// ---- Painting & Font --------------------------------------------------------------------------------------
    
    @Override
    @BeanProperty(preferred = true)
    public void setFont(Font font){
        super.setFont(font);
    }
    
    @Override
    public void paint(Graphics g){
        Graphics2D g2 = CustomGraphics.getGraphics2D(g);
        super.paint(g2);
    }

}
