
package FrameSystem.SLibrary.SAnimated;

import FrameSystem.SLibrary.SComponents.SPanelAnimated;
import MainSystem.CustomGraphics;
import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.ActionEvent;
import java.awt.geom.Arc2D;
import java.beans.BeanProperty;

public class SAnimatedOffline extends SPanelAnimated{

    // Animation states
    private float startAngle = 0;
    private float extent = 10;
    private boolean growing = true;

    // Google animation physics
    private final float MAX_EXTENT = 310f;
    private final float MIN_EXTENT = 30f;
    private final float SWEEP_SPEED = 3.0f;
    
    private float SPIN_SPEED = 2.0f;
    private final float SPIN_SPEED_MIN = 1.0f;
    private final float SPIN_SPEED_MAX = 7.0f;
    private boolean speedup = true;

    public SAnimatedOffline() {
        super(10);
    }

// Implementations ===========================================================================================
    
    @Override
    public void actionPerformed(ActionEvent e) {
        
        if(speedup){
            if(SPIN_SPEED < SPIN_SPEED_MAX){
                SPIN_SPEED += 0.025f;
            }else{
                speedup = false;
            }
        }else{
            if(SPIN_SPEED > SPIN_SPEED_MIN){
                SPIN_SPEED -= 0.1f;
            }else{
                speedup = true;
            }
        }
        
        // 1. The entire spinner is always rotating at a constant base speed.
        startAngle += SPIN_SPEED;
        if (startAngle >= 360) startAngle -= 360;

        // 2. The "sweeping" effect: Growing and catching up
        if (growing) {
            extent += SWEEP_SPEED;
            if (extent >= MAX_EXTENT) {
                growing = false;
            }
        } else {
            // When shrinking, the tail needs to move much faster to catch up to the head.
            // We do this by decreasing the extent but pushing the start angle forward.
            extent -= SWEEP_SPEED;
            startAngle += SWEEP_SPEED; 
            
            if (extent <= MIN_EXTENT) {
                growing = true;
            }
        }

        repaint();
    }
    
// Setters and Getters =======================================================================================
    
    protected Color lineColor = Color.white;

    @BeanProperty(preferred = true, visualUpdate = true, description = "")
    public void setLineColor(Color lineColor){
        this.lineColor = lineColor;
    }

    public Color getLineColor(){
        return lineColor;
    }
    
// -----------------------------------------------------------------------------------------------------------
    
    protected float lineWidth = 0;

    @BeanProperty(preferred = true, visualUpdate = true, description = "")
    public void setLineWidth(float lineWidth){
        this.lineWidth = lineWidth;
    }

    public float getLineWidth(){
        return lineWidth;
    }
    
// Overrided Methods =========================================================================================

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2 = CustomGraphics.getGraphics2D(g);

        int size = Math.min(getWidth(), getHeight());
        
        g2.setStroke(new BasicStroke(lineWidth, BasicStroke.CAP_ROUND, BasicStroke.JOIN_ROUND));
        
        g2.setColor(lineColor);

        // Center the arc in the panel bounds
        double x = (getWidth() - size) / 2.0 + (lineWidth / 2.0);
        double y = (getHeight() - size) / 2.0 + (lineWidth / 2.0);
        double w = size - lineWidth;
        double h = size - lineWidth;

        // Draw the arc using negative values so it spins Clockwise (Google's standard)
        g2.draw(new Arc2D.Double(x, y, w, h, -startAngle, -extent, Arc2D.OPEN));
    }

}
