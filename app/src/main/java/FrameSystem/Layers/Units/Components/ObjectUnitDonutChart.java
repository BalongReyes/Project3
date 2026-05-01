package FrameSystem.Layers.Units.Components;

import javax.swing.JPanel;

public class ObjectUnitDonutChart extends JPanel{

    public int owners = 0;
    public int tenants = 0;
    public int others = 0;

    private static final java.awt.Color COLOR_OWNERS = new java.awt.Color(85, 174, 245);
    private static final java.awt.Color COLOR_TENANTS = new java.awt.Color(255, 153, 51);
    private static final java.awt.Color COLOR_OTHERS = new java.awt.Color(148, 163, 184);

// ==== Constructor ==========================================================================================

    public ObjectUnitDonutChart(){
        setOpaque(false); 
    }

// ==== Data Management ======================================================================================

    public void addData(int owners, int tenants, int others){
        this.owners += owners;
        this.tenants += tenants;
        this.others += others;
        repaint(); 
    }

    public void addDataOwner(){
        this.owners += 1;
        repaint(); 
    }

    public void addDataTenants(){
        this.tenants += 1;
        repaint(); 
    }

    public void addDataOthers(){
        this.others += 1;
        repaint(); 
    }
    
    public void resetData(){
        owners = 0;
        tenants = 0;
        others = 0;
        repaint();
    }

// ==== Rendering ============================================================================================

    @Override
    protected void paintComponent(java.awt.Graphics g){
        super.paintComponent(g);
        java.awt.Graphics2D g2d = (java.awt.Graphics2D) g.create();

        g2d.setRenderingHint(java.awt.RenderingHints.KEY_ANTIALIASING, java.awt.RenderingHints.VALUE_ANTIALIAS_ON);

        int total = owners + tenants + others;
        int width = getWidth();
        int height = getHeight();
        
        int maxDiameter = Math.min(width, height) - 4; 
        
        float thickness = maxDiameter * 0.18f; 
        
        int size = (int) (maxDiameter - thickness); 
        int x = (width - size) / 2;
        int y = (height - size) / 2;

        g2d.setStroke(new java.awt.BasicStroke(thickness, java.awt.BasicStroke.CAP_BUTT, java.awt.BasicStroke.JOIN_ROUND));

        if(total == 0){
            g2d.setColor(java.awt.Color.LIGHT_GRAY);
            g2d.drawArc(x, y, size, size, 0, 360); 
        }else{
            int startAngle = 90; 

            int ownersAngle = (int) Math.round((owners * 360.0) / total);
            g2d.setColor(COLOR_OWNERS);
            g2d.drawArc(x, y, size, size, startAngle, -ownersAngle); 
            startAngle -= ownersAngle;

            int tenantsAngle = (int) Math.round((tenants * 360.0) / total);
            g2d.setColor(COLOR_TENANTS);
            g2d.drawArc(x, y, size, size, startAngle, -tenantsAngle);
            startAngle -= tenantsAngle;

            int othersAngle = 360 - (ownersAngle + tenantsAngle); 
            g2d.setColor(COLOR_OTHERS);
            g2d.drawArc(x, y, size, size, startAngle, -othersAngle);
        }

        g2d.dispose();
    }

}
