package FrameSystem.SLibrary.SGenericComponents;

import FrameSystem.SLibrary.SComponents.SPanel;
import java.awt.event.MouseListener;
import java.beans.BeanProperty;
import java.beans.JavaBean;

import javax.swing.ImageIcon;


@JavaBean(description = "")
public class SFilterTitlePanel extends SPanel{

    public SFilterTitlePanel(){
        super();
        initComponents();
        
        sLabel1.addMouseListener(hoverListener);
        sLabel2.addMouseListener(hoverListener);
    }
    
// Setters and Getters =======================================================================================

    private String text = "";

    @BeanProperty(preferred = true, visualUpdate = true, description = "")
    public void setText(String text){
        this.text = text;
        sLabel1.setText(text);
    }

    public String getText(){
        return text;
    }
    
    private int arrowDirection = -1;
    
    @BeanProperty(preferred = true, visualUpdate = true, description = "")
    public void setArrowDirection(int n){
        arrowDirection = n;
        switch(n){
            case 1 -> { // down
                sLabel2.setScaledIcon(new ImageIcon(getClass().getResource("/Icons/arrowDown.png")));
            }
            case 2 -> { // up
                sLabel2.setScaledIcon(new ImageIcon(getClass().getResource("/Icons/arrowUp.png")));
            }
            default -> {
                sLabel2.setScaledIcon(new ImageIcon(getClass().getResource("/Icons/arrowNeutral.png")));
                arrowDirection = -1;
            }
        }
    }

    public int getArrowDirection(){
        return arrowDirection;
    }
    
    public int setNextArrowDirection(){
        switch(arrowDirection){
            case 1 -> {
                setArrowDirection(2);
                return 2;
            }
            case 2 -> {
                setArrowDirection(-1);
                return -1;
            }
            default -> {
                setArrowDirection(1);
                return 1;
            }
        }
    }
    
// ---- Data Index -------------------------------------------------------------------------------------------
    
    private int dataIndex;

    @BeanProperty(preferred = true, visualUpdate = true, description = "")
    public void setDataIndex(int dataIndex){
        this.dataIndex = dataIndex;
    }

    public int getDataIndex(){
        return dataIndex;
    }
    
// Overrided Methods =========================================================================================

    @Override
    public synchronized void addMouseListener(MouseListener l){
        addInnerListeners(l);
    }
    
// Generated =================================================================================================

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        sLabel1 = new FrameSystem.SLibrary.SComponents.SLabel();
        sLabel2 = new FrameSystem.SLibrary.SComponents.SLabel();

        sLabel1.setForeground(new java.awt.Color(56, 56, 56));
        sLabel1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        sLabel1.setText("test");

        sLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        sLabel2.setIconSize(12);
        sLabel2.setScaledIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/arrowNeutral.png"))); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(sLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(sLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(6, 6, 6))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(sLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(sLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(0, 0, 0))
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private FrameSystem.SLibrary.SComponents.SLabel sLabel1;
    private FrameSystem.SLibrary.SComponents.SLabel sLabel2;
    // End of variables declaration//GEN-END:variables
}
