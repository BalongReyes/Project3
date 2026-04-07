package FrameSystem.Layers.Units.Components;

import javax.swing.JPanel;

public class ObjectUnitDonutChart extends JPanel{

    public int owners = 0;
    public int tenants = 0;
    public int others = 0;

    public ObjectUnitDonutChart(){
        setOpaque(false); // Make background transparent
    }

    public void addData(int owners, int tenants, int others){
        this.owners += owners;
        this.tenants += tenants;
        this.others += others;
        repaint(); // Redraw the component with new data
    }

    public void addDataOwner(){
        this.owners += 1;
        repaint(); // Redraw the component with new data
    }

    public void addDataTenants(){
        this.tenants += 1;
        repaint(); // Redraw the component with new data
    }

    public void addDataOthers(){
        this.others += 1;
        repaint(); // Redraw the component with new data
    }
    
    public void resetData(){
        owners = 0;
        tenants = 0;
        others = 0;
        repaint();
    }

    @Override
    protected void paintComponent(java.awt.Graphics g){
        super.paintComponent(g);
        java.awt.Graphics2D g2d = (java.awt.Graphics2D) g.create();

        // Turn on antialiasing for smooth edges
        g2d.setRenderingHint(java.awt.RenderingHints.KEY_ANTIALIASING, java.awt.RenderingHints.VALUE_ANTIALIAS_ON);

        int total = owners + tenants + others;
        int width = getWidth();
        int height = getHeight();
        int size = Math.min(width, height) - 4; // Leave a tiny margin
        int x = (width - size) / 2;
        int y = (height - size) / 2;

        if(total == 0){
            // Draw a default gray circle if there is no data
            g2d.setColor(java.awt.Color.LIGHT_GRAY);
            g2d.fillArc(x, y, size, size, 0, 360);
        }else{
            int startAngle = 90; // Start drawing from the top (12 o'clock)

            // 1. Draw Owners (Blue: 85, 174, 245)
            int ownersAngle = (int) Math.round((owners * 360.0) / total);
            g2d.setColor(new java.awt.Color(85, 174, 245));
            g2d.fillArc(x, y, size, size, startAngle, -ownersAngle); // Negative angle to draw clockwise
            startAngle -= ownersAngle;

            // 2. Draw Tenants (Orange: 255, 153, 51)
            int tenantsAngle = (int) Math.round((tenants * 360.0) / total);
            g2d.setColor(new java.awt.Color(255, 153, 51));
            g2d.fillArc(x, y, size, size, startAngle, -tenantsAngle);
            startAngle -= tenantsAngle;

            // 3. Draw Others (Gray: 148, 163, 184)
            int othersAngle = 360 - (ownersAngle + tenantsAngle); // Use remaining angle to avoid gaps
            g2d.setColor(new java.awt.Color(148, 163, 184));
            g2d.fillArc(x, y, size, size, startAngle, -othersAngle);
        }

        // Create the "Hole" in the middle to make it a Donut Chart
        int holeSize = (int) (size * 0.65); // The hole takes up 65% of the total size
        int holeX = (width - holeSize) / 2;
        int holeY = (height - holeSize) / 2;

        // Draw a white circle to cover the center
        g2d.setColor(java.awt.Color.WHITE);
        g2d.fillOval(holeX, holeY, holeSize, holeSize);

        g2d.dispose();
    }

}
