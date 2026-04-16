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
import java.awt.Shape;
import java.awt.event.ComponentAdapter;
import java.awt.event.ComponentEvent;
import java.awt.geom.Path2D;
import java.awt.geom.RoundRectangle2D;

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
    
    // New variables for customizable corners
    protected boolean roundTopLeft = true;
    protected boolean roundTopRight = true;
    protected boolean roundBottomLeft = true;
    protected boolean roundBottomRight = true;

    protected int borderLine = 0;
    protected Color borderColor = Color.white;

    protected boolean shadowX = false;
    protected boolean shadowY = false;
    protected int shadowSize;
    protected float shadowOpacity;
    protected Color shadowColor = Color.white;
    protected int shadowOffsetX;
    protected int shadowOffsetY;

// ---- Radius & Corners -------------------------------------------------------------------------------------
    
    @BeanProperty(preferred = true, visualUpdate = true, description = "The corner radius")
    public void setRadius(int radius){
        this.radius = radius;
        repaint();
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
        repaint();
    }

    public boolean isRounded(){
        return rounded;
    }

    // New getters and setters for specific corners
    @BeanProperty(preferred = true, visualUpdate = true, description = "Round Top Left corner")
    public void setRoundTopLeft(boolean roundTopLeft) {
        this.roundTopLeft = roundTopLeft;
        repaint();
    }

    public boolean isRoundTopLeft() { return roundTopLeft; }

    @BeanProperty(preferred = true, visualUpdate = true, description = "Round Top Right corner")
    public void setRoundTopRight(boolean roundTopRight) {
        this.roundTopRight = roundTopRight;
        repaint();
    }

    public boolean isRoundTopRight() { return roundTopRight; }

    @BeanProperty(preferred = true, visualUpdate = true, description = "Round Bottom Left corner")
    public void setRoundBottomLeft(boolean roundBottomLeft) {
        this.roundBottomLeft = roundBottomLeft;
        repaint();
    }

    public boolean isRoundBottomLeft() { return roundBottomLeft; }

    @BeanProperty(preferred = true, visualUpdate = true, description = "Round Bottom Right corner")
    public void setRoundBottomRight(boolean roundBottomRight) {
        this.roundBottomRight = roundBottomRight;
        repaint();
    }

    public boolean isRoundBottomRight() { return roundBottomRight; }

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
    public void setDefaultBorderColor(Color borderColor){
        this.borderColor = borderColor;
    }

    public Color getDefaultBorderColor(){
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

    /**
     * Helper method to generate a shape with specific rounded corners.
     */
    private Shape createCustomRoundedShape(int x, int y, int w, int h, int r) {
        // Prevent negative/oversized radius issues
        int maxRadius = Math.min(w / 2, h / 2);
        r = Math.min(r, maxRadius);

        // 1. FAST PATH: If all corners are rounded, use standard Java 2D shape.
        // This completely bypasses the buggy Path2D geometric engine!
        if (roundTopLeft && roundTopRight && roundBottomLeft && roundBottomRight) {
            return new RoundRectangle2D.Double(x, y, w, h, r * 2, r * 2);
        }

        // 2. FAST PATH: If radius is 0, it's just a standard rectangle.
        if (r <= 0) {
            return new Rectangle(x, y, w, h);
        }

        // 3. CUSTOM CORNERS: Build the path safely without zero-length lines.
        Path2D.Double path = new Path2D.Double();

        // Top Left
        if (roundTopLeft) {
            path.moveTo(x + r, y);
        } else {
            path.moveTo(x, y);
        }

        // Top edge to Top-Right
        if (roundTopRight) {
            // ONLY draw the line if there is actual distance between the corners!
            // This prevents the zero-length line bug that causes the infinite loop.
            if (w - (roundTopLeft ? r : 0) - r > 0) {
                path.lineTo(x + w - r, y);
            }
            path.quadTo(x + w, y, x + w, y + r);
        } else {
            path.lineTo(x + w, y);
        }

        // Right edge to Bottom-Right
        if (roundBottomRight) {
            if (h - (roundTopRight ? r : 0) - r > 0) {
                path.lineTo(x + w, y + h - r);
            }
            path.quadTo(x + w, y + h, x + w - r, y + h);
        } else {
            path.lineTo(x + w, y + h);
        }

        // Bottom edge to Bottom-Left
        if (roundBottomLeft) {
            if (w - (roundBottomRight ? r : 0) - r > 0) {
                path.lineTo(x + r, y + h);
            }
            path.quadTo(x, y + h, x, y + h - r);
        } else {
            path.lineTo(x, y + h);
        }

        // Left edge back to Top-Left
        if (roundTopLeft) {
            if (h - (roundBottomLeft ? r : 0) - r > 0) {
                path.lineTo(x, y + r);
            }
            path.quadTo(x, y, x + r, y);
        } else {
            path.lineTo(x, y);
        }
        
        path.closePath();
        return path;
    }

    @Override
    public void paint(Graphics g){
        // 1. Paint the background, shadows, and borders first
        paintSPanel(g);
        
        // 2. Save the original clipping area
        Shape oldClip = g.getClip();
        
        // 3. If the panel is rounded, apply a rounded clip for the children
        if (rounded && radius > 0) {
            Graphics2D g2 = CustomGraphics.getGraphics2D(g);
            int width = getWidth();
            int height = getHeight();

            int x = isShadowX() ? shadowSize - shadowOffsetX : 0;
            int y = isShadowY() ? shadowSize - shadowOffsetY : 0;
            int w = isShadowX() ? width - (shadowSize * 2) : width;
            int h = isShadowY() ? height - (shadowSize * 2) : height;

            if(width != 0 && height != 0){
                Shape clipShape = createCustomRoundedShape(x, y, w, h, radius);
                g2.clip(clipShape);
            }
        }
        
        // 4. Draw all child components
        paintOverrideAll(g);
        
        // 5. Restore the original clip
        g.setClip(oldClip);
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
            g2.setColor(new Color(
                    shadowColor.getRed(), shadowColor.getGreen(), shadowColor.getBlue(), (int) (opacity * 255)
            ));
            
            Shape shadowShape = createCustomRoundedShape(
                    x - i + shadowOffsetX, y - i + shadowOffsetY,
                    w + (i * 2), h + (i * 2),
                    radiusPaint + i
            );
            g2.fill(shadowShape);
        }

        // 2. Draw Outer Border
        if(borderLine > 0){
            if(overideBorder != null){
                g2.setColor(overideBorder);
            }else{
                g2.setColor(borderColor);
            }
            Shape borderShape = createCustomRoundedShape(x, y, w, h, radiusPaint);
            g2.fill(borderShape);
        }

        // 3. Determine Foreground Color
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
            
            // Draw background using custom shape
            int bgRadius = Math.max(0, radiusPaint - borderLine); // Prevents negative radius on large borders
            Shape bgShape = createCustomRoundedShape(
                    x + borderLine, y + borderLine,
                    w - (borderLine * 2), h - (borderLine * 2),
                    bgRadius
            );
            g2.fill(bgShape);
        }
    }
}