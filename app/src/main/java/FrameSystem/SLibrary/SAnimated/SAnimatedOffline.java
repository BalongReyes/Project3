
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

    private int angle = 0; // Tracks the rotation state
    private final int SPEED = 5; // Pixels/degrees to increment per tick

    public SAnimatedOffline() {
        super(10);
    }

// Implementations ===========================================================================================
    
    @Override
    public void actionPerformed(ActionEvent e) {
        // Update the rotation angle
        angle += SPEED;
        if (angle >= 360) {
            angle = 0;
        }

        // Request a redraw to show the new position
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

        int width = getWidth();
        int height = getHeight();
        
        // Calculate dimensions based on container size
        // Using a stroke width proportional to the size (e.g., 10% of width)
        float strokeWidth;
        if(lineWidth != 0){
            strokeWidth = lineWidth;
        }else{
            strokeWidth = width * 0.1f;
        }
        g2.setStroke(new BasicStroke(strokeWidth, BasicStroke.CAP_ROUND, BasicStroke.JOIN_ROUND));

        // Define the bounds of the loading arc (the "line with rounded ends")
        // Subtract stroke width to ensure the animation stays within the container
        double x = strokeWidth / 2;
        double y = strokeWidth / 2;
        double w = width - strokeWidth;
        double h = height - strokeWidth;

        g2.setColor(lineColor);
        
        // Draw a partial arc (90 degrees) that rotates
        // Start angle is our animated 'angle' variable
        g2.draw(new Arc2D.Double(x, y, w, h, angle, 90, Arc2D.OPEN));
    }

}
