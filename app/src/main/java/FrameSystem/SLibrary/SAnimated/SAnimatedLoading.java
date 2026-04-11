package FrameSystem.SLibrary.SAnimated;

import MainSystem.CustomGraphics;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.ActionEvent;
import java.awt.geom.RoundRectangle2D;
import java.beans.BeanProperty;

public class SAnimatedLoading extends SPanelAnimated {

    // Progress tracking (0.0f to 1.0f)
    private float targetProgress = 0.0f;   // The actual progress set by the worker
    private float currentProgress = 0.0f;  // The currently drawn/animated progress
    
    // How fast the visual bar catches up to the target progress
    private final float ANIMATION_SPEED = 0.02f; 

    public SAnimatedLoading() {
        super(15); // 15ms delay for smooth ~60fps rendering
    }

// Implementations ===========================================================================================
    
    @Override
    public void actionPerformed(ActionEvent e) {
        // Smoothly animate the current progress towards the target progress
        if (currentProgress < targetProgress) {
            currentProgress += ANIMATION_SPEED;
            if (currentProgress > targetProgress) {
                currentProgress = targetProgress; // Snap to target if it overshoots
            }
            repaint();
        } else if (currentProgress > targetProgress) {
            // Allows the bar to smoothly shrink back down if progress is reset
            currentProgress -= ANIMATION_SPEED;
            if (currentProgress < targetProgress) {
                currentProgress = targetProgress;
            }
            repaint();
        }
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
     * Updates the progress of the loading bar.
     * Call this from your SwingWorker's process() or doInBackground() method.
     * @param progress A float representing the percentage (0.0f to 1.0f)
     */
    public void setProgress(float progress) {
        // Clamp the value between 0.0 and 1.0 to prevent drawing errors
        this.targetProgress = Math.max(0.0f, Math.min(1.0f, progress));
    }

    /**
     * Overloaded method to accept standard 0-100 integer percentages.
     */
    public void setProgressPercentage(int percentage) {
        setProgress(percentage / 100.0f);
    }
    
    public float getProgress() {
        return this.targetProgress;
    }

// Overridden Methods ========================================================================================

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2 = CustomGraphics.getGraphics2D(g);

        int width = getWidth();
        int height = getHeight();
        
        // Calculate the actual thickness of the bar. 
        // Defaults to 80% of panel height if lineWidth is left at 0.
        float actualHeight = (lineWidth != 0) ? lineWidth : height * 0.8f;
        float arc = actualHeight; // Fully rounded pill shape
        
        // Calculate Y position to perfectly center the bar vertically
        double yPos = (height - actualHeight) / 2.0;

        // 1. Draw the background track
        g2.setColor(trackColor);
        g2.fill(new RoundRectangle2D.Double(0, yPos, width, actualHeight, arc, arc));

        // 2. Draw the foreground progress fill using your requested `lineColor`
        double fillWidth = width * currentProgress;
        
        // Only draw the progress if it is greater than 0
        if (fillWidth > 0) {
            g2.setColor(lineColor);
            g2.fill(new RoundRectangle2D.Double(0, yPos, fillWidth, actualHeight, arc, arc));
        }
    }
}