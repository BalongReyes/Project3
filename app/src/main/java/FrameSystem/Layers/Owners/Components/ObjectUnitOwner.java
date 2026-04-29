
package FrameSystem.Layers.Owners.Components;

import DatabaseSystem.UnitOwnersData.UnitOwnersDataTable;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import FrameSystem.SLibrary.SComponents.SPanel;

public class ObjectUnitOwner extends SPanel{

    private UnitOwnersDataTable data;
    private boolean deleteBlocked = false, editBlocked = false;
    
// Constructor ===============================================================================================
    
    public ObjectUnitOwner(UnitOwnersDataTable data){
        this.data = data;
        
        initComponents();
        addInnerListeners(new MouseAdapter(){
            @Override
            public void mousePressed(MouseEvent evt){
                if(evt.getButton() == MouseEvent.BUTTON1){
                    setFocus();
                }
            }
            @Override
            public void mouseClicked(MouseEvent evt){
                if(evt.getClickCount() == 2 && !evt.isConsumed()){
                    evt.consume();
                    edit();
                }
            }
        });
        
        applyHoverInnerListener();
        view.applyHoverInnerListener();
        edit.applyHoverInnerListener();
        
    }
    
// Main Methods ==============================================================================================

    public UnitOwnersDataTable getData(){
        return data;
    }
    
    public int getId(){
        return data.id();
    }
    
// -----------------------------------------------------------------------------------------------------------
    
    private void setFocus(){
        this.requestFocus();
//        ManagerObjectUnits.changeCurrentObject(this); NEEDED TO BE CHANGED
    }

    @Override
    public void setActive(boolean active){
        super.setActive(active);
    }
    
// -----------------------------------------------------------------------------------------------------------
    
    private void delete(){
        setFocus();
        if(deleteBlocked) return;
    }
    
    private void edit(){
        setFocus();
        if(editBlocked) return;
    }
    
// ---- View -------------------------------------------------------------------------------------------------
    
    private Runnable onViewClick;
    
    public void setOnViewClick(Runnable onViewClick) {
        this.onViewClick = onViewClick;
    }
    
// Generated =================================================================================================
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        filler6 = new javax.swing.Box.Filler(new java.awt.Dimension(25, 0), new java.awt.Dimension(25, 0), new java.awt.Dimension(25, 32767));
        filler8 = new javax.swing.Box.Filler(new java.awt.Dimension(6, 0), new java.awt.Dimension(6, 0), new java.awt.Dimension(6, 32767));
        sPanel3 = new FrameSystem.SLibrary.SComponents.SPanel();
        filler2 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 0), new java.awt.Dimension(0, 0), new java.awt.Dimension(32767, 0));
        sPanel11 = new FrameSystem.SLibrary.SComponents.SPanel();
        view = new FrameSystem.SLibrary.SComponents.SPanel();
        sLabel10 = new FrameSystem.SLibrary.SComponents.SLabel();
        filler4 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 0), new java.awt.Dimension(0, 0), new java.awt.Dimension(32767, 0));
        sPanel13 = new FrameSystem.SLibrary.SComponents.SPanel();
        edit = new FrameSystem.SLibrary.SComponents.SPanel();
        sLabel11 = new FrameSystem.SLibrary.SComponents.SLabel();
        filler3 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 0), new java.awt.Dimension(0, 0), new java.awt.Dimension(32767, 0));

        setActiveBackgroundColor(new java.awt.Color(255, 245, 245));
        setActiveHoverBackgroundColor(new java.awt.Color(255, 245, 245));
        setActiveHoverForegroundColor(new java.awt.Color(250, 250, 250));
        setBorderLine(1);
        setBorderSideLeft(false);
        setBorderSideRight(false);
        setCanHover(true);
        setDefaultBorderColor(new java.awt.Color(240, 240, 240));
        setHoverBackgroundColor(new java.awt.Color(250, 250, 250));
        setPreferredSize(new java.awt.Dimension(1010, 50));
        setLayout(new javax.swing.BoxLayout(this, javax.swing.BoxLayout.LINE_AXIS));
        add(filler6);
        add(filler8);

        sPanel3.setDefaultBackgroundColor(new java.awt.Color(51, 255, 51));
        sPanel3.setPaintBackground(false);
        sPanel3.setMaximumSize(new java.awt.Dimension(90, 50));
        sPanel3.setMinimumSize(new java.awt.Dimension(90, 50));
        sPanel3.setPreferredSize(new java.awt.Dimension(90, 50));
        sPanel3.setLayout(new javax.swing.BoxLayout(sPanel3, javax.swing.BoxLayout.LINE_AXIS));
        sPanel3.add(filler2);

        sPanel11.setDefaultBackgroundColor(new java.awt.Color(51, 255, 51));
        sPanel11.setPaintBackground(false);
        sPanel11.setMaximumSize(new java.awt.Dimension(25, 50));
        sPanel11.setMinimumSize(new java.awt.Dimension(25, 50));

        view.setCanHover(true);
        view.setDefaultBackgroundColor(new java.awt.Color(239, 239, 239));
        view.setHoverBackgroundColor(new java.awt.Color(209, 209, 209));
        view.setRadius(10);
        view.setRounded(true);
        view.setPreferredSize(new java.awt.Dimension(25, 25));

        sLabel10.setForeground(new java.awt.Color(255, 255, 255));
        sLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        sLabel10.setIconSize(12);
        sLabel10.setScaledIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/moduleUnits/view.png"))); // NOI18N

        javax.swing.GroupLayout viewLayout = new javax.swing.GroupLayout(view);
        view.setLayout(viewLayout);
        viewLayout.setHorizontalGroup(
            viewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(sLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, 25, Short.MAX_VALUE)
        );
        viewLayout.setVerticalGroup(
            viewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(sLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, 25, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout sPanel11Layout = new javax.swing.GroupLayout(sPanel11);
        sPanel11.setLayout(sPanel11Layout);
        sPanel11Layout.setHorizontalGroup(
            sPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(sPanel11Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(view, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        sPanel11Layout.setVerticalGroup(
            sPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, sPanel11Layout.createSequentialGroup()
                .addGap(0, 12, Short.MAX_VALUE)
                .addComponent(view, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 13, Short.MAX_VALUE))
        );

        sPanel3.add(sPanel11);
        sPanel3.add(filler4);

        sPanel13.setDefaultBackgroundColor(new java.awt.Color(51, 255, 51));
        sPanel13.setPaintBackground(false);
        sPanel13.setMaximumSize(new java.awt.Dimension(25, 50));
        sPanel13.setMinimumSize(new java.awt.Dimension(25, 50));
        sPanel13.setPreferredSize(new java.awt.Dimension(25, 50));

        edit.setCanHover(true);
        edit.setDefaultBackgroundColor(new java.awt.Color(239, 239, 239));
        edit.setHoverBackgroundColor(new java.awt.Color(209, 209, 209));
        edit.setRadius(10);
        edit.setRounded(true);
        edit.setPreferredSize(new java.awt.Dimension(25, 25));

        sLabel11.setForeground(new java.awt.Color(255, 255, 255));
        sLabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        sLabel11.setIconSize(10);
        sLabel11.setScaledIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/moduleUnits/Edit.png"))); // NOI18N

        javax.swing.GroupLayout editLayout = new javax.swing.GroupLayout(edit);
        edit.setLayout(editLayout);
        editLayout.setHorizontalGroup(
            editLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(sLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, 25, Short.MAX_VALUE)
        );
        editLayout.setVerticalGroup(
            editLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(sLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, 25, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout sPanel13Layout = new javax.swing.GroupLayout(sPanel13);
        sPanel13.setLayout(sPanel13Layout);
        sPanel13Layout.setHorizontalGroup(
            sPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(sPanel13Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(edit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        sPanel13Layout.setVerticalGroup(
            sPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, sPanel13Layout.createSequentialGroup()
                .addGap(0, 12, Short.MAX_VALUE)
                .addComponent(edit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 13, Short.MAX_VALUE))
        );

        sPanel3.add(sPanel13);
        sPanel3.add(filler3);

        add(sPanel3);
    }// </editor-fold>//GEN-END:initComponents

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private FrameSystem.SLibrary.SComponents.SPanel edit;
    private javax.swing.Box.Filler filler2;
    private javax.swing.Box.Filler filler3;
    private javax.swing.Box.Filler filler4;
    private javax.swing.Box.Filler filler6;
    private javax.swing.Box.Filler filler8;
    private FrameSystem.SLibrary.SComponents.SLabel sLabel10;
    private FrameSystem.SLibrary.SComponents.SLabel sLabel11;
    private FrameSystem.SLibrary.SComponents.SPanel sPanel11;
    private FrameSystem.SLibrary.SComponents.SPanel sPanel13;
    private FrameSystem.SLibrary.SComponents.SPanel sPanel3;
    public FrameSystem.SLibrary.SComponents.SPanel view;
    // End of variables declaration//GEN-END:variables
}
