package FrameSystem.SLibrary.SComponents;

import java.awt.Component;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.beans.BeanProperty;
import java.beans.JavaBean;

import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import EventSystem.Interface.InnerListener;
import MainSystem.CustomGraphics;
import java.awt.Color;
import java.awt.Cursor;
import java.awt.HeadlessException;
import java.awt.MouseInfo;
import java.awt.Point;
import java.awt.Rectangle;
import java.awt.event.ComponentAdapter;
import java.awt.event.ComponentEvent;

@JavaBean(description = "A versatile component that handles shadows, borders, and interactive states (Hover, Active, Danger)")
public class SPanel extends JPanel implements InnerListener{

    protected MouseAdapter hoverListener;
    protected ComponentAdapter componentAdapter;

// ==== Constructor ==========================================================================================
    
    public SPanel(){
        super();
        super.setBorder(null);
        setOpaque(false);

        hoverListener = new MouseAdapter(){
            @Override
            public void mouseEntered(MouseEvent evt){
                setHovering(true);
            }

            @Override
            public void mouseExited(MouseEvent evt){
                setHovering(false);
            }
        };
        componentAdapter = new ComponentAdapter(){
            @Override
            public void componentResized(ComponentEvent e){
                super.componentResized(e);
                checkHoverState();
            }
            @Override
            public void componentMoved(ComponentEvent e){
                super.componentMoved(e);
                checkHoverState();
            }
        };
        super.addComponentListener(componentAdapter);
        applyHoverInnerListener();
    }

// ==== Controls Setter & Getters ============================================================================
    
    protected boolean paintBackground = true;
    protected boolean canHover = false;

// ---- Background -------------------------------------------------------------------------------------------
    
    @BeanProperty(preferred = true, visualUpdate = true, description = "If true, paints the background state colors. Set false for custom painting.")
    public void setPaintBackground(boolean paintBackground){
        if(this.paintBackground == paintBackground){
            return;
        }
        this.paintBackground = paintBackground;
        repaint();
    }

    public boolean isPaintBackground(){
        return paintBackground;
    }

// ---- Hover ------------------------------------------------------------------------------------------------
    
    @BeanProperty(preferred = true, visualUpdate = true, description = "If true, the panel can be hovered")
    public void setCanHover(boolean canHover){
        this.canHover = canHover;
        if(canHover && getCursor().getType() == Cursor.DEFAULT_CURSOR){
            setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        }
    }

    public boolean isCanHover(){
        return canHover;
    }
    
    private void checkHoverState() {
        if (hovering && isShowing()) {
            try {
                Point mousePos = MouseInfo.getPointerInfo().getLocation();
                Point compPos = getLocationOnScreen();
                Rectangle bounds = new Rectangle(compPos, getSize());
                if (!bounds.contains(mousePos)) {
                    setHovering(false);
                }
            } catch (HeadlessException ex) {
                setHovering(false);
            }
        }
    }
    
// ==== State Properties Setters & Getters ===================================================================
    
    protected boolean active = false;
    protected boolean danger = false;
    protected boolean hovering = false;

    protected Color defaultBackgroundColor = Color.white;
    protected Color activeBackgroundColor = Color.white;
    protected Color activeHoverBackgroundColor = Color.white;
    protected Color hoverBackgroundColor = Color.white;
    protected Color dangerBackgroundColor = Color.white;

    protected Color defaultForegroundColor = Color.white;
    protected Color activeForegroundColor = Color.white;
    protected Color activeHoverForegroundColor = Color.white;
    protected Color hoverForegroundColor = Color.white;
    protected Color dangerForegroundColor = Color.white;

// ---- Hover ------------------------------------------------------------------------------------------------
    
    @BeanProperty(preferred = true, visualUpdate = true, description = "If panel is hovered")
    public void setHovering(boolean hovering){
        if(this.hovering == hovering){
            return;
        }
        this.hovering = hovering;
        repaint();
    }

    public boolean isHovering(){
        return hovering;
    }

    @BeanProperty(preferred = true, visualUpdate = true, description = "The hover background color")
    public void setHoverBackgroundColor(Color hoverBackgroundColor){
        this.hoverBackgroundColor = hoverBackgroundColor;
    }

    public Color getHoverBackgroundColor(){
        return hoverBackgroundColor;
    }

    @BeanProperty(preferred = true, visualUpdate = true, description = "The hover foreground color")
    public void setHoverForegroundColor(Color hoverForegroundColor){
        this.hoverForegroundColor = hoverForegroundColor;
    }

    public Color getHoverForegroundColor(){
        return hoverForegroundColor;
    }

// ---- Active -----------------------------------------------------------------------------------------------
    
    @BeanProperty(preferred = true, visualUpdate = true, description = "If panel is active")
    public void setActive(boolean active){
        if(this.active == active){
            return;
        }
        this.active = active;
        repaint();
    }

    public boolean isActive(){
        return active;
    }
    
    public void toggleActive(){
        setActive(!active);
    }

    @BeanProperty(preferred = true, visualUpdate = true, description = "The active background color")
    public void setActiveBackgroundColor(Color activeBackgroundColor){
        this.activeBackgroundColor = activeBackgroundColor;
    }

    public Color getActiveBackgroundColor(){
        return activeBackgroundColor;
    }

    @BeanProperty(preferred = true, visualUpdate = true, description = "The active foreground color")
    public void setActiveForegroundColor(Color activeForegroundColor){
        this.activeForegroundColor = activeForegroundColor;
    }

    public Color getActiveForegroundColor(){
        return activeForegroundColor;
    }

// ---- Active Hover -----------------------------------------------------------------------------------------
    
    
    @BeanProperty(preferred = true, visualUpdate = true, description = "The active hover background color")
    public void setActiveHoverBackgroundColor(Color activeHoverBackgroundColor){
        this.activeHoverBackgroundColor = activeHoverBackgroundColor;
    }

    public Color getActiveHoverBackgroundColor(){
        return activeHoverBackgroundColor;
    }

    @BeanProperty(preferred = true, visualUpdate = true, description = "The active foreground color")
    public void setActiveHoverForegroundColor(Color activeHoverForegroundColor){
        this.activeHoverForegroundColor = activeHoverForegroundColor;
    }

    public Color getActiveHoverForegroundColor(){
        return activeHoverForegroundColor;
    }

// ---- Danger -----------------------------------------------------------------------------------------------
    
    @BeanProperty(preferred = true, visualUpdate = true, description = "If panel is in danger state")
    public void setDanger(boolean danger){
        if(this.danger == danger){
            return;
        }
        this.danger = danger;
        repaint();
    }

    public boolean isDanger(){
        return danger;
    }

    @BeanProperty(preferred = true, description = "The danger background color")
    public void setDangerBackgroundColor(Color dangerBackgroundColor){
        this.dangerBackgroundColor = dangerBackgroundColor;
    }

    public Color getDangerBackgroundColor(){
        return dangerBackgroundColor;
    }

    @BeanProperty(preferred = true, description = "The danger foreground color")
    public void setDangerForegroundColor(Color dangerForegroundColor){
        this.dangerForegroundColor = dangerForegroundColor;
    }

    public Color getDangerForegroundColor(){
        return dangerForegroundColor;
    }

// ---- Defaults ---------------------------------------------------------------------------------------------   
    
    @BeanProperty(preferred = true, visualUpdate = true, description = "The default background color")
    public void setDefaultBackgroundColor(Color inactiveBackgroundColor){
        this.defaultBackgroundColor = inactiveBackgroundColor;
    }

    public Color getDefaultBackgroundColor(){
        return defaultBackgroundColor;
    }

    @BeanProperty(preferred = true, visualUpdate = true, description = "The default foreground color")
    public void setDefaultForegroundColor(Color inactiveForegroundColor){
        this.defaultForegroundColor = inactiveForegroundColor;
    }

    public Color getDefaultForegroundColor(){
        return defaultForegroundColor;
    }
    
    @Override
    @BeanProperty(hidden = true)
    public void setBackground(Color bg){
    }

// ==== Core SPanel Setters & Getters (Radius, Border, Shadows) ==============================================
    
    protected int radius = 0;
    protected boolean rounded = false;

    protected int borderLine = 0;
    protected Color borderColor = Color.white;

    protected boolean shadowX = false;
    protected boolean shadowY = false;
    protected int shadowSize;
    protected float shadowOpacity;
    protected Color shadowColor = Color.white;
    protected int shadowOffsetX;
    protected int shadowOffsetY;

// ---- Radius -----------------------------------------------------------------------------------------------
    
    @BeanProperty(preferred = true, visualUpdate = true, description = "The corner radius")
    public void setRadius(int radius){
        this.radius = radius;
    }

    public int getRadius(){
        return radius;
    }

    public int getRadius(int add){
        return radius + add;
    }

    @BeanProperty(preferred = true, visualUpdate = true, description = "If the panel is rounded")
    public void setRounded(boolean rounded){
        this.rounded = rounded;
        if(rounded){
            setOpaque(false);
        }
    }

    public boolean isRounded(){
        return rounded;
    }

// ---- Border Line ------------------------------------------------------------------------------------------
    
    @BeanProperty(preferred = true, visualUpdate = true, description = "The border line width")
    public void setBorderLine(int borderLine){
        this.borderLine = borderLine;
        if(borderLine != 0){
            setOpaque(false);
        }
    }

    public int getBorderLine(){
        return borderLine;
    }

    @BeanProperty(preferred = true, visualUpdate = true, description = "The border color")
    public void setBorderColor(Color borderColor){
        this.borderColor = borderColor;
    }

    public Color getBorderColor(){
        return borderColor;
    }

// ---- Shadow -----------------------------------------------------------------------------------------------
    
    @BeanProperty(preferred = true, visualUpdate = true, description = "")
    public void setShadowX(boolean shadowX){
        this.shadowX = shadowX;
        setBorderPadding();
        if(shadowX){
            setOpaque(false);
        }
    }

    public boolean isShadowX(){
        return shadowX;
    }

    @BeanProperty(preferred = true, visualUpdate = true, description = "")
    public void setShadowY(boolean shadowY){
        this.shadowY = shadowY;
        setBorderPadding();
        if(shadowY){
            setOpaque(false);
        }
    }

    public boolean isShadowY(){
        return shadowY;
    }

    @BeanProperty(preferred = true, visualUpdate = true, description = "")
    public void setShadowSize(int shadowSize){
        this.shadowSize = shadowSize;
        setBorderPadding();
    }

    public int getShadowSize(){
        return shadowSize;
    }

    @BeanProperty(preferred = true, visualUpdate = true, description = "")
    public void setShadowOpacity(float shadowOpacity){
        this.shadowOpacity = shadowOpacity;
    }

    public float getShadowOpacity(){
        return shadowOpacity;
    }

    @BeanProperty(preferred = true, visualUpdate = true, description = "")
    public void setShadowColor(Color shadowColor){
        this.shadowColor = shadowColor;
    }

    public Color getShadowColor(){
        return shadowColor;
    }

    @BeanProperty(preferred = true, visualUpdate = true, description = "")
    public void setShadowOffsetX(int shadowOffsetX){
        this.shadowOffsetX = shadowOffsetX;
        setBorderPadding();
    }

    public int getShadowOffsetX(){
        return shadowOffsetX;
    }

    @BeanProperty(preferred = true, visualUpdate = true, description = "")
    public void setShadowOffsetY(int shadowOffsetY){
        this.shadowOffsetY = shadowOffsetY;
        setBorderPadding();
    }

    public int getShadowOffsetY(){
        return shadowOffsetY;
    }

    protected void setBorderPadding(){
        setBorder(new EmptyBorder(
                shadowY ? shadowSize - shadowOffsetY : 0,
                shadowX ? shadowSize - shadowOffsetX : 0,
                shadowY ? shadowSize + shadowOffsetY : 0,
                shadowX ? shadowSize + shadowOffsetX : 0
        ));
    }

// ==== Overrided Methods ====================================================================================

    public void applyHoverInnerListener(){
        addInnerListeners(hoverListener);
    }

    @Override
    public void addInnerListeners(MouseListener listener){
        super.addMouseListener(listener);
        synchronized(getTreeLock()){
            int i = getComponentCount() - 1;
            if(i < 0){
                return;
            }
            for(; i >= 0; i--){
                Component c = getComponent(i);
                if(c == null){
                    continue;
                }
                if(c instanceof InnerListener innerListener){
                    innerListener.addInnerListeners(listener);
                }else{
                    c.addMouseListener(listener);
                }
            }
        }
    }

// -----------------------------------------------------------------------------------------------------------
    
    @Override
    public void setEnabled(boolean enabled){
        if(!enabled){
            setHovering(false);
        }
        super.setEnabled(enabled);
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

    @Override
    public void paint(Graphics g){
        paintSPanel(g);
        paintOverrideAll(g);
    }
    
    protected void paintSPanel(Graphics g){
        paintSPanel(g, null, null);
    }
    
    protected void paintSPanel(Graphics g, Color overideBackground, Color overideBorder){
        int radiusPaint = rounded ? this.radius : 0;
        Graphics2D g2 = CustomGraphics.getGraphics2D(g);

        int width = getWidth();
        int height = getHeight();

        int x = isShadowX() ? shadowSize - shadowOffsetX : 0;
        int y = isShadowY() ? shadowSize - shadowOffsetY : 0;
        int w = isShadowX() ? width - (shadowSize * 2) : width;
        int h = isShadowY() ? height - (shadowSize * 2) : height;

        // 1. Draw Shadows
        for(int i = 0; i < shadowSize; i++){
            float opacity = shadowOpacity * (1.0f - ((float) i / shadowSize));
            g.setColor(new Color(
                    shadowColor.getRed(), shadowColor.getGreen(), shadowColor.getBlue(), (int) (opacity * 255)
            ));
            g.fillRoundRect(
                    x - i + shadowOffsetX, y - i + shadowOffsetY,
                    w + (i * 2), h + (i * 2),
                    radiusPaint + i, radiusPaint + i
            );
        }

        // 2. Draw Outer Border (Only if borderline > 0 so it doesn't paint unnecessarily)
        if(borderLine > 0){
            if(overideBorder != null){
                g2.setColor(overideBorder);
            }else{
                g2.setColor(borderColor);
            }
            g2.fillRoundRect(x, y, w, h, radiusPaint, radiusPaint);
        }

        // 3. Determine Foreground Color based on Priority State
        if(danger){
            setForeground(dangerForegroundColor);
        }else if(active && (canHover && hovering && activeHoverForegroundColor != null)){
            setForeground(activeHoverForegroundColor);
        }else if(active){
            setForeground(activeForegroundColor);
        }else if(canHover && hovering && hoverForegroundColor != null){
            setForeground(hoverForegroundColor);
        }else{
            setForeground(defaultForegroundColor);
        }

        // 4. Draw Inner Body ONLY if paintBackground is True
        if(paintBackground){
            Color currentBgColor;
            if(overideBackground != null){
                currentBgColor = overideBackground;
            }else if(danger){
                currentBgColor = dangerBackgroundColor;
            }else if(active && (canHover && hovering && activeHoverBackgroundColor != null)){
                currentBgColor = activeHoverBackgroundColor;
            }else if(active){
                currentBgColor = activeBackgroundColor;
            }else if(canHover && hovering && hoverBackgroundColor != null){
                currentBgColor = hoverBackgroundColor;
            }else{
                currentBgColor = defaultBackgroundColor;
            }

            g2.setColor(currentBgColor);
            g2.fillRoundRect(
                    x + borderLine, y + borderLine,
                    w - (borderLine * 2), h - (borderLine * 2),
                    radiusPaint - borderLine, radiusPaint - borderLine
            );
        }
    }
}
