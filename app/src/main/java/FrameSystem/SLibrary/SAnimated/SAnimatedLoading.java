package FrameSystem.SLibrary.SAnimated;

import MainSystem.CustomGraphics;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.ActionEvent;
import java.beans.BeanProperty;
import java.util.concurrent.CountDownLatch;

public class SAnimatedLoading extends SPanelAnimated {

    private float targetProgress = 0.0f;   
    private float currentProgress = 0.0f;  
    
    private float currentAnimationSpeed = 0.0f;

    public SAnimatedLoading() {
        super(15); 
    }

// ==== Implementations ======================================================================================
    
    private CountDownLatch currentLatch;

    @Override
    public void actionPerformed(ActionEvent e) {
        if (currentAnimationSpeed == 0) return; 

        currentProgress += currentAnimationSpeed;

        if ((currentAnimationSpeed > 0 && currentProgress >= targetProgress) || 
            (currentAnimationSpeed < 0 && currentProgress <= targetProgress)) {
            
            currentProgress = targetProgress; 
            currentAnimationSpeed = 0.0f;     
            
            if (currentLatch != null) {
                currentLatch.countDown(); 
                currentLatch = null; 
            }
        }
        
        repaint();
    }
    
// ==== Setters and Getters ==================================================================================
    
    protected Color lineColor = Color.WHITE;

    @BeanProperty(preferred = true, visualUpdate = true, description = "Sets the color of the loading bar")
    public void setLineColor(Color lineColor){
        this.lineColor = lineColor;
    }

    public Color getLineColor(){
        return lineColor;
    }
    
// ---- Line Width -------------------------------------------------------------------------------------------
    
    protected float lineWidth = 0;

    @BeanProperty(preferred = true, visualUpdate = true, description = "Sets the thickness of the loading bar")
    public void setLineWidth(float lineWidth){
        this.lineWidth = lineWidth;
    }

    public float getLineWidth(){
        return lineWidth;
    }

// ---- Track Color ------------------------------------------------------------------------------------------

    protected Color trackColor = new Color(255, 255, 255, 50); 

    @BeanProperty(preferred = true, visualUpdate = true, description = "Sets the background track color")
    public void setTrackColor(Color trackColor){
        this.trackColor = trackColor;
    }

    public Color getTrackColor(){
        return trackColor;
    }

// ==== Progress Control =====================================================================================

    public void setProgress(float progress, int durationMs) {
        this.targetProgress = Math.max(0.0f, Math.min(1.0f, progress));
        
        if (durationMs <= 0) {
            this.currentProgress = this.targetProgress;
            this.currentAnimationSpeed = 0;
            repaint();
            return;
        }

        float distance = this.targetProgress - this.currentProgress;
        float totalFrames = durationMs / 15.0f; 
        this.currentAnimationSpeed = distance / totalFrames;
    }

    public void setProgress(float progress) {
        setProgress(progress, 500);
    }

    public void setProgressPercentage(int percentage, int durationMs, CountDownLatch latch) {
        this.currentLatch = latch;
        setProgress(percentage / 100.0f, durationMs); 
    }
    
    public void setProgressPercentage(int percentage, int durationMs) {
        setProgress(percentage / 100.0f, durationMs);
    }
    
    public void setProgressPercentage(int percentage) {
        setProgress(percentage / 100.0f, 500);
    }

    public float getProgress() {
        return this.targetProgress;
    }
    
    public boolean isFinished() {
        return this.currentProgress == this.targetProgress;
    }

// ==== Overridden Methods ===================================================================================

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2 = CustomGraphics.getGraphics2D(g);

        int width = getWidth();
        int height = getHeight();
        
        float actualHeight = (lineWidth != 0) ? lineWidth : height * 0.8f;
        float arc = actualHeight; 
        
        int yPos = (int) ((height - actualHeight) / 2.0);

        g2.setColor(trackColor);
        g2.fillRoundRect(0, yPos, width, (int) actualHeight, (int) arc, (int) arc);

        int fillWidth = (int) (width * currentProgress);
        
        if (fillWidth > 0) {
            g2.setColor(lineColor);
            g2.fillRoundRect(0, yPos, fillWidth, (int) actualHeight, (int) arc, (int) arc);
        }
    }
}