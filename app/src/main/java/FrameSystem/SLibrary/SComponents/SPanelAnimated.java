
package FrameSystem.SLibrary.SComponents;

import MainSystem.CustomGraphics;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.Timer;

public class SPanelAnimated extends SPanel implements ActionListener{

    private Timer timer;
    
    public SPanelAnimated(){
        super();
        timer = new Timer(10, this);
        timer.start();
    }

// Implementations ===========================================================================================
    
    @Override
    public void actionPerformed(ActionEvent e){
        // Update the state


        // Request a redraw
        repaint();
    }
    
// Overrided Methods =========================================================================================

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2 = CustomGraphics.getGraphics2D(g);
    }

}
