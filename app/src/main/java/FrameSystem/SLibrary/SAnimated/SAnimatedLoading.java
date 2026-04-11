package FrameSystem.SLibrary.SAnimated;

import MainSystem.CustomGraphics;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.ActionEvent;
import java.awt.geom.RoundRectangle2D;
import java.beans.BeanProperty;
import java.util.concurrent.CountDownLatch;

public class SAnimatedLoading extends SPanelAnimated {

    // Progress tracking (0.0f to 1.0f)
    private float targetProgress = 0.0f;   
    private float currentProgress = 0.0f;  
    
    // The dynamic speed calculated based on the requested duration
    private float currentAnimationSpeed = 0.0f;

    public SAnimatedLoading() {
        super(15); // 15ms delay for smooth ~60fps rendering
    }

// Implementations ===========================================================================================
    
    private CountDownLatch currentLatch;

    @Override
    public void actionPerformed(ActionEvent e) {
        if (currentAnimationSpeed == 0) return; 

        currentProgress += currentAnimationSpeed;

        if ((currentAnimationSpeed > 0 && currentProgress >= targetProgress) || 
            (currentAnimationSpeed < 0 && currentProgress <= targetProgress)) {
            
            currentProgress = targetProgress; 
            currentAnimationSpeed = 0.0f;     
            
            // WAKE UP THE BACKGROUND THREAD!
            if (currentLatch != null) {
                currentLatch.countDown(); 
                currentLatch = null; // Clear it out so we don't call it again
            }
        }
        
        repaint();
    }
    
// Setters and Getters =======================================================================================
    
    protected Color lineColor = Color.WHITE;

    @BeanProperty(preferred = true, visualUpdate = true, description = "Sets the color of the loading bar")
    public void setLineColor(Color lineColor){
        this.lineColor = lineColor;
    }

    public Color getLineColor(){
        return lineColor;
    }
    
// -----------------------------------------------------------------------------------------------------------
    
    protected float lineWidth = 0;

    @BeanProperty(preferred = true, visualUpdate = true, description = "Sets the thickness of the loading bar")
    public void setLineWidth(float lineWidth){
        this.lineWidth = lineWidth;
    }

    public float getLineWidth(){
        return lineWidth;
    }

// -----------------------------------------------------------------------------------------------------------

    protected Color trackColor = new Color(255, 255, 255, 50); // Semi-transparent background track

    @BeanProperty(preferred = true, visualUpdate = true, description = "Sets the background track color")
    public void setTrackColor(Color trackColor){
        this.trackColor = trackColor;
    }

    public Color getTrackColor(){
        return trackColor;
    }

// Progress Control ==========================================================================================

    /**
     * Updates the progress over a specific duration.
     * @param progress A float representing the percentage (0.0f to 1.0f)
     * @param durationMs How many milliseconds it should take to visually reach this progress
     */
    public void setProgress(float progress, int durationMs) {
        this.targetProgress = Math.max(0.0f, Math.min(1.0f, progress));
        
        if (durationMs <= 0) {
            // If duration is 0, snap instantly without animating
            this.currentProgress = this.targetProgress;
            this.currentAnimationSpeed = 0;
            repaint();
            return;
        }

        // Calculate exactly how much to move the bar per 15ms frame to finish on time!
        float distance = this.targetProgress - this.currentProgress;
        float totalFrames = durationMs / 15.0f; 
        this.currentAnimationSpeed = distance / totalFrames;
    }

    /**
     * Legacy method: defaults to a smooth 500ms transition
     * @param progress
     */
    public void setProgress(float progress) {
        setProgress(progress, 500);
    }

    public void setProgressPercentage(int percentage, int durationMs, CountDownLatch latch) {
        this.currentLatch = latch;
        setProgress(percentage / 100.0f, durationMs); // Calls the existing setProgress logic
    }
    
    /**
     * Overloaded method to accept standard 0-100 integer percentages with a duration!
     * @param percentage
     * @param durationMs
     */
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

// Overridden Methods ========================================================================================

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2 = CustomGraphics.getGraphics2D(g);

        int width = getWidth();
        int height = getHeight();
        
        float actualHeight = (lineWidth != 0) ? lineWidth : height * 0.8f;
        float arc = actualHeight; 
        
        double yPos = (height - actualHeight) / 2.0;

        g2.setColor(trackColor);
        g2.fill(new RoundRectangle2D.Double(0, yPos, width, actualHeight, arc, arc));

        double fillWidth = width * currentProgress;
        
        if (fillWidth > 0) {
            g2.setColor(lineColor);
            g2.fill(new RoundRectangle2D.Double(0, yPos, fillWidth, actualHeight, arc, arc));
        }
    }
}