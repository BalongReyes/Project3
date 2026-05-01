package FrameSystem.Layers.Units.Components;

import FrameSystem.SLibrary.SAbstractComponents.SLayerButton;
import MainSystem.CustomGraphics;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.MouseListener;
import java.beans.BeanProperty;

public class ButtonUnits_ViewTab extends SLayerButton{
    
    public ButtonUnits_ViewTab(){
        initComponents();
        sLabel1.addMouseListener(hoverListener);
    }

// ==== Main Methods =========================================================================================

    private MouseListener layerPanelMouseListener = null;
    
    @Override
    public void addLayeredPanelMouseListener(MouseListener m){
        this.layerPanelMouseListener = m;
        
        addMouseListener(m);
        sLabel1.addMouseListener(m);
    }

    @Override
    public void setActiveButton(boolean active){
        setActive(active);
    }
    
    private int linePadding = 12;

    @Override
    public void paint(Graphics g){
        Graphics2D g2 = CustomGraphics.getGraphics2D(g);
        Dimension s = getSize();
        
        if(active){
            g2.setColor(activeLineColor);
            g2.fillRoundRect(linePadding, s.height - 3, s.width - (linePadding * 2), 3, 3, 3);
        }
        
        super.paintOverrideAll(g);
    }
    
// ==== Setters and Getters ==================================================================================

    public String text = "";

    @BeanProperty(preferred = true, visualUpdate = true, description = "The text of panel")
    public void setText(String text){
        this.text = text;
        sLabel1.setText(text);
        
        int prefWidth = sLabel1.getPreferredSize().width + 40;
        setPreferredSize(new java.awt.Dimension(prefWidth, getPreferredSize().height));
        revalidate();
    }

    public String getText(){
        return text;
    }
    
// -----------------------------------------------------------------------------------------------------------
    
    private Color activeLineColor = new Color(255, 255, 255);

    @BeanProperty(preferred = true, visualUpdate = true, description = "The color of the active line indicator")
    public void setActiveLineColor(Color activeLineColor){
        this.activeLineColor = activeLineColor;
    }

    public Color getActiveLineColor(){
        return activeLineColor;
    }
    
// ==== Overrided Methods ====================================================================================

    @Override
    public void setDefaultForegroundColor(Color defaultForegroundColor){
        super.setDefaultForegroundColor(defaultForegroundColor);
        sLabel1.setForeground(defaultForegroundColor);
    }

    @Override
    public void setActive(boolean active){
        super.setActive(active);
        if(active){
            sLabel1.setForeground(getActiveForegroundColor());
        }else{
            sLabel1.setForeground(getDefaultForegroundColor());
        }
    }
    
// ==== Generated ============================================================================================
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        sLabel1 = new FrameSystem.SLibrary.SComponents.SLabel();

        sLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        sLabel1.setText("test");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(sLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(20, 20, 20))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 20, Short.MAX_VALUE)
                .addComponent(sLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 20, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public FrameSystem.SLibrary.SComponents.SLabel sLabel1;
    // End of variables declaration//GEN-END:variables
}
