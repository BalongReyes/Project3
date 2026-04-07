
package FrameSystem.SLibrary.SComponents;

import java.awt.Color;
import java.awt.Graphics;
import java.beans.BeanProperty;
import java.beans.JavaBean;

@JavaBean(description = "A custom panel with highlighted sides and rounded corners")
public class SPanelHighlight extends SPanel{

// Constructor ===============================================================================================
    
    public SPanelHighlight(){
    }
    
// Setters and Getters =======================================================================================
    
    protected Color defaultBorderColor = Color.white;
    protected Color activeBorderColor = Color.white;
    protected Color hoverBorderColor = Color.white;
    protected Color dangerBorderColor = Color.white;

    @Override
    @BeanProperty(hidden = true)
    public void setBorderColor(Color borderColor){
    }
    
    @BeanProperty(preferred = true, visualUpdate = true, description = "")
    public void setDefaultBorderColor(Color defaultBorderColor){
        this.defaultBorderColor = defaultBorderColor;
    }

    public Color getDefaultBorderColor(){
        return defaultBorderColor;
    }

    @BeanProperty(preferred = true, visualUpdate = true, description = "")
    public void setActiveBorderColor(Color activeBorderColor){
        this.activeBorderColor = activeBorderColor;
    }

    public Color getActiveBorderColor(){
        return activeBorderColor;
    }

    @BeanProperty(preferred = true, visualUpdate = true, description = "")
    public void setHoverBorderColor(Color hoverBorderColor){
        this.hoverBorderColor = hoverBorderColor;
    }

    public Color getHoverBorderColor(){
        return hoverBorderColor;
    }

    @BeanProperty(preferred = true, visualUpdate = true, description = "")
    public void setDangerBorderColor(Color dangerBorderColor){
        this.dangerBorderColor = dangerBorderColor;
    }

    public Color getDangerBorderColor(){
        return dangerBorderColor;
    }
    
// Overrided Methods =========================================================================================

    @Override
    public void paint(Graphics g){
        Color border;
        
        if(danger){
            border = dangerBorderColor;
        }else if(active){
            border = activeBorderColor;
        }else if(hovering && hoverForegroundColor != null){
            border = hoverBorderColor;
        }else{
            border = defaultBorderColor;
        }
        
        paintSPanel(g, null, border);
        
        super.paintOverrideAll(g);
    }

}
