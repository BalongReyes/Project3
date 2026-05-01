
package FrameSystem.SLibrary.SAnimated;

import MainSystem.CustomGraphics;
import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.ActionEvent;
import java.awt.geom.Path2D;
import java.beans.BeanProperty;

public class SAnimatedOffline extends SPanelAnimated{

    private float headPos = 0.05f; 
    private float tailPos = 0.0f;  
    private boolean growing = true;

    private final float BASE_SPEED = 0.0025f;  
    private final float SWEEP_SPEED = 0.015f;  
    private final float ACCELERATION = 0.0005f; 

    private float currentHeadSweep = SWEEP_SPEED;
    private float currentTailSweep = 0.0f;

    public SAnimatedOffline() {
        super(10);
    }

// ==== Implementations ======================================================================================
    
    @Override
    public void actionPerformed(ActionEvent e) {
        if (growing) {
            if (currentHeadSweep < SWEEP_SPEED) currentHeadSweep += ACCELERATION;
            if (currentHeadSweep > SWEEP_SPEED) currentHeadSweep = SWEEP_SPEED;
            
            if (currentTailSweep > 0) currentTailSweep -= ACCELERATION;
            if (currentTailSweep < 0) currentTailSweep = 0;
            
            if (headPos - tailPos >= 0.7f) {
                growing = false;
            }
        } else {
            if (currentHeadSweep > 0) currentHeadSweep -= ACCELERATION;
            if (currentHeadSweep < 0) currentHeadSweep = 0;
            
            if (currentTailSweep < SWEEP_SPEED) currentTailSweep += ACCELERATION;
            if (currentTailSweep > SWEEP_SPEED) currentTailSweep = SWEEP_SPEED;
            
            if (headPos - tailPos <= 0.2f) {
                growing = true;
            }
        }

        headPos += BASE_SPEED + currentHeadSweep;
        tailPos += BASE_SPEED + currentTailSweep;

        if (tailPos >= 1.0f) {
            tailPos -= 1.0f;
            headPos -= 1.0f;
        }

        repaint();
    }
    
// ==== Setters and Getters ==================================================================================
    
    protected Color lineColor = Color.white;

    @BeanProperty(preferred = true, visualUpdate = true, description = "The color of the animated line")
    public void setLineColor(Color lineColor){
        this.lineColor = lineColor;
    }

    public Color getLineColor(){
        return lineColor;
    }
    
// -----------------------------------------------------------------------------------------------------------
    
    protected float lineWidth = 0;

    @BeanProperty(preferred = true, visualUpdate = true, description = "The width of the animated line")
    public void setLineWidth(float lineWidth){
        this.lineWidth = lineWidth;
    }

    public float getLineWidth(){
        return lineWidth;
    }
    
// ==== Overrided Methods ====================================================================================

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2 = CustomGraphics.getGraphics2D(g);

        int width = getWidth();
        int height = getHeight();
        int size = Math.min(width, height);
        
        float strokeWidth;
        if(lineWidth != 0){
            strokeWidth = lineWidth;
        }else{
            strokeWidth = size * 0.1f;
        }
        
        double centerX = width / 2.0;
        double centerY = height / 2.0;
        
        double R = (size / 2.0) - strokeWidth;

        double px1 = centerX;
        double py1 = centerY - R; 
        
        double px2 = centerX + R * Math.cos(Math.PI / 6.0);
        double py2 = centerY + R * Math.sin(Math.PI / 6.0); 
        
        double px3 = centerX - R * Math.cos(Math.PI / 6.0);
        double py3 = centerY + R * Math.sin(Math.PI / 6.0); 

        double S = R * Math.sqrt(3); 
        double P = 3 * S;            

        double tailAbsolute = tailPos * P;
        double headAbsolute = headPos * P;

        Path2D.Double path = new Path2D.Double();
        
        path.moveTo(getX(tailAbsolute, S, px1, px2, px3), getY(tailAbsolute, S, py1, py2, py3));

        long nextCornerIdx = (long) Math.floor(tailAbsolute / S) + 1;
        double nextCornerDist = nextCornerIdx * S;

        while (nextCornerDist < headAbsolute) {
            path.lineTo(getX(nextCornerDist, S, px1, px2, px3), getY(nextCornerDist, S, py1, py2, py3));
            nextCornerIdx++;
            nextCornerDist = nextCornerIdx * S;
        }

        path.lineTo(getX(headAbsolute, S, px1, px2, px3), getY(headAbsolute, S, py1, py2, py3));

        g2.setStroke(new BasicStroke(strokeWidth, BasicStroke.CAP_ROUND, BasicStroke.JOIN_ROUND));
        g2.setColor(lineColor);
        g2.draw(path);
    }
    
    private double getX(double absoluteDistance, double sideLength, double px1, double px2, double px3) {
        double d = absoluteDistance % (3 * sideLength);
        if (d < 0) d += 3 * sideLength; 

        if (d <= sideLength) return px1 + (px2 - px1) * (d / sideLength); 
        if (d <= 2 * sideLength) return px2 + (px3 - px2) * ((d - sideLength) / sideLength); 
        return px3 + (px1 - px3) * ((d - 2 * sideLength) / sideLength); 
    }

    private double getY(double absoluteDistance, double sideLength, double py1, double py2, double py3) {
        double d = absoluteDistance % (3 * sideLength);
        if (d < 0) d += 3 * sideLength; 

        if (d <= sideLength) return py1 + (py2 - py1) * (d / sideLength); 
        if (d <= 2 * sideLength) return py2 + (py3 - py2) * ((d - sideLength) / sideLength); 
        return py3 + (py1 - py3) * ((d - 2 * sideLength) / sideLength); 
    }

}
