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
        
        // 1. Calculate the maximum size the chart can be
        int maxDiameter = Math.min(width, height) - 4; 
        
        // 2. Set the thickness of the donut ring (e.g., 18% of the total size)
        float thickness = maxDiameter * 0.18f; 
        
        // 3. Setup the bounding box. We subtract 'thickness' so the thick line doesn't get clipped off the edges.
        int size = (int) (maxDiameter - thickness); 
        int x = (width - size) / 2;
        int y = (height - size) / 2;

        // 4. Apply the thick stroke to the graphics object
        g2d.setStroke(new java.awt.BasicStroke(thickness, java.awt.BasicStroke.CAP_BUTT, java.awt.BasicStroke.JOIN_ROUND));

        if(total == 0){
            // Draw a default gray ring if there is no data
            g2d.setColor(java.awt.Color.LIGHT_GRAY);
            g2d.drawArc(x, y, size, size, 0, 360); // Notice we use drawArc instead of fillArc
        }else{
            int startAngle = 90; // Start drawing from the top (12 o'clock)

            // 1. Draw Owners (Blue: 85, 174, 245)
            int ownersAngle = (int) Math.round((owners * 360.0) / total);
            g2d.setColor(new java.awt.Color(85, 174, 245));
            g2d.drawArc(x, y, size, size, startAngle, -ownersAngle); 
            startAngle -= ownersAngle;

            // 2. Draw Tenants (Orange: 255, 153, 51)
            int tenantsAngle = (int) Math.round((tenants * 360.0) / total);
            g2d.setColor(new java.awt.Color(255, 153, 51));
            g2d.drawArc(x, y, size, size, startAngle, -tenantsAngle);
            startAngle -= tenantsAngle;

            // 3. Draw Others (Gray: 148, 163, 184)
            int othersAngle = 360 - (ownersAngle + tenantsAngle); 
            g2d.setColor(new java.awt.Color(148, 163, 184));
            g2d.drawArc(x, y, size, size, startAngle, -othersAngle);
        }

        // We don't need to draw a white center hole anymore, it's naturally empty!

        g2d.dispose();
    }

}
