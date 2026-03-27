
package FrameSystem.LayerFolder_Main.Layers.LayerFolder_Home.Layers.LayerFolder_Units.Components;

import DatabaseSystem.UnitsData.UnitsDataTable;
import EventSystem.Listeners.MousePressedAdaptor;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import FrameSystem.LayerFolder_Main.Layers.LayerFolder_Home.Layers.LayerFolder_Units.Managers.ManagerObjectUnits;
import FrameSystem.SLibrary.SComponents.SPanel;

public class ObjectUnit extends SPanel{

    private UnitsDataTable data;
    private boolean deleteBlocked = false, editBlocked = false;
    
// Constructor ===============================================================================================
    
    public ObjectUnit(UnitsDataTable data){
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
        sPanelHighlight1.applyHoverInnerListener();
        
//        this.deleteBlocked = deleteBlocked;
//        if(deleteBlocked){
//            deleteButton.setEnabled(false);
//            deleteButton.overrideColor = new Color(32, 33, 43);
//        }
//        
//        this.editBlocked = editBlocked;
//        if(editBlocked){
//            editButton.setEnabled(false);
//            editButton.overrideColor = new Color(32, 33, 43);
//        }
        
//        if(data.getCategoryId() != null){
//            try{
//                CategoryDataTable category = CategoryDataHandler.findDataById(false, data.getCategoryId());
//                if(category != null) sLabel5.setScaledIcon(category.getImage());
//            }catch(SQLException e){
//                Console.errorOut("Getting category of item error", e);
//            }
//        }
//        if(!data.getBarcode().isEmpty()){
//            sLabel6.setScaledIcon(new ImageIcon(getClass().getResource("/Icons/barcodeStatus.png")));
//        }
        
        deleteButton.addMouseListener((MousePressedAdaptor) evt -> {
            delete();
        });
        editButton.addMouseListener((MousePressedAdaptor) evt -> {
            edit();
        });
    }
    
// Main Methods ==============================================================================================

    public UnitsDataTable getData(){
        return data;
    }
    
    public int getId(){
        return data.getId();
    }
    
// -----------------------------------------------------------------------------------------------------------
    
    private void setFocus(){
        this.requestFocus();
        ManagerObjectUnits.changeCurrentObject(this);
    }
    
    public void setActive(boolean active){
        sPanelHighlight1.setActive(active);
    }
    
    public void setDanger(boolean danger){
        sPanelHighlight1.setDanger(danger);
    }
    
// -----------------------------------------------------------------------------------------------------------
    
    private void delete(){
        setFocus();
        if(deleteBlocked) return;
        ManagerObjectUnits.removeObject(this);
    }
    
    private void edit(){
        setFocus();
        if(editBlocked) return;
        ManagerObjectUnits.editObject(this);
    }
    
// Generated =================================================================================================
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        sPanelHighlight1 = new FrameSystem.SLibrary.SComponents.SPanelHighlight();
        sLabel1 = new FrameSystem.SLibrary.SComponents.SLabel();
        sPanel1 = new FrameSystem.SLibrary.SComponents.SPanel();
        sLabel2 = new FrameSystem.SLibrary.SComponents.SLabel();
        sLabel3 = new FrameSystem.SLibrary.SComponents.SLabel();
        sLabel4 = new FrameSystem.SLibrary.SComponents.SLabel();
        sPanel2 = new FrameSystem.SLibrary.SComponents.SPanel();
        sLabel5 = new FrameSystem.SLibrary.SComponents.SLabel();
        sLabel6 = new FrameSystem.SLibrary.SComponents.SLabel();
        sPanel3 = new FrameSystem.SLibrary.SComponents.SPanel();
        editButton = new FrameSystem.SLibrary.SComponents.SLabelHover();
        deleteButton = new FrameSystem.SLibrary.SComponents.SLabelHover();

        setBackground(new java.awt.Color(24, 29, 37));
        setOpaque(false);
        setPreferredSize(new java.awt.Dimension(1010, 60));

        sPanelHighlight1.setActiveBackgroundColor(new java.awt.Color(34, 39, 52));
        sPanelHighlight1.setDangerBackgroundColor(new java.awt.Color(35, 17, 17));
        sPanelHighlight1.setDangerForegroundColor(new java.awt.Color(173, 0, 0));
        sPanelHighlight1.setHoverBackgroundColor(new java.awt.Color(30, 34, 46));
        sPanelHighlight1.setInactiveForegroundColor(new java.awt.Color(48, 48, 54));
        sPanelHighlight1.setRadius(10);
        sPanelHighlight1.setRounded(true);
        sPanelHighlight1.setPreferredSize(new java.awt.Dimension(100, 50));

        sLabel1.setForeground(new java.awt.Color(56, 56, 56));
        sLabel1.setText("Test1");
        sLabel1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N

        sPanel1.setOpaque(false);
        sPanel1.setLayout(new java.awt.GridLayout(1, 0));

        sLabel2.setForeground(new java.awt.Color(56, 56, 56));
        sLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        sLabel2.setText("Test2");
        sLabel2.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        sPanel1.add(sLabel2);

        sLabel3.setForeground(new java.awt.Color(56, 56, 56));
        sLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        sLabel3.setText("Test3");
        sLabel3.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        sPanel1.add(sLabel3);

        sLabel4.setForeground(new java.awt.Color(56, 56, 56));
        sLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        sLabel4.setText("Test4");
        sLabel4.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        sPanel1.add(sLabel4);

        sPanel2.setOpaque(false);
        sPanel2.setPreferredSize(new java.awt.Dimension(197, 50));
        sPanel2.setLayout(new java.awt.GridLayout(1, 0));

        sLabel5.setForeground(new java.awt.Color(255, 255, 255));
        sLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        sLabel5.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        sPanel2.add(sLabel5);

        sLabel6.setForeground(new java.awt.Color(255, 255, 255));
        sLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        sLabel6.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        sPanel2.add(sLabel6);

        sPanel3.setOpaque(false);
        sPanel3.setPreferredSize(new java.awt.Dimension(174, 0));

        editButton.setDefaultColor(new java.awt.Color(45, 47, 62));
        editButton.setForeground(new java.awt.Color(255, 255, 255));
        editButton.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        editButton.setHoverColor(new java.awt.Color(58, 60, 84));
        editButton.setRadius(10);
        editButton.setText("Edit");
        editButton.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        editButton.setPreferredSize(new java.awt.Dimension(72, 30));

        deleteButton.setDefaultColor(new java.awt.Color(45, 47, 62));
        deleteButton.setForeground(new java.awt.Color(255, 255, 255));
        deleteButton.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        deleteButton.setHoverColor(new java.awt.Color(173, 0, 0));
        deleteButton.setRadius(10);
        deleteButton.setText("Delete");
        deleteButton.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        deleteButton.setPreferredSize(new java.awt.Dimension(72, 30));

        javax.swing.GroupLayout sPanel3Layout = new javax.swing.GroupLayout(sPanel3);
        sPanel3.setLayout(sPanel3Layout);
        sPanel3Layout.setHorizontalGroup(
            sPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, sPanel3Layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(deleteButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(editButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12))
        );
        sPanel3Layout.setVerticalGroup(
            sPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, sPanel3Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(sPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(editButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(deleteButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout sPanelHighlight1Layout = new javax.swing.GroupLayout(sPanelHighlight1);
        sPanelHighlight1.setLayout(sPanelHighlight1Layout);
        sPanelHighlight1Layout.setHorizontalGroup(
            sPanelHighlight1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, sPanelHighlight1Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(sLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addComponent(sPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 306, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(sPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(sPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        sPanelHighlight1Layout.setVerticalGroup(
            sPanelHighlight1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(sLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(sPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(sPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
            .addComponent(sPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(sPanelHighlight1, javax.swing.GroupLayout.DEFAULT_SIZE, 1010, Short.MAX_VALUE)
                .addGap(0, 0, 0))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(sPanelHighlight1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10))
        );
    }// </editor-fold>//GEN-END:initComponents

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private FrameSystem.SLibrary.SComponents.SLabelHover deleteButton;
    private FrameSystem.SLibrary.SComponents.SLabelHover editButton;
    private FrameSystem.SLibrary.SComponents.SLabel sLabel1;
    private FrameSystem.SLibrary.SComponents.SLabel sLabel2;
    private FrameSystem.SLibrary.SComponents.SLabel sLabel3;
    private FrameSystem.SLibrary.SComponents.SLabel sLabel4;
    private FrameSystem.SLibrary.SComponents.SLabel sLabel5;
    private FrameSystem.SLibrary.SComponents.SLabel sLabel6;
    private FrameSystem.SLibrary.SComponents.SPanel sPanel1;
    private FrameSystem.SLibrary.SComponents.SPanel sPanel2;
    private FrameSystem.SLibrary.SComponents.SPanel sPanel3;
    private FrameSystem.SLibrary.SComponents.SPanelHighlight sPanelHighlight1;
    // End of variables declaration//GEN-END:variables
}
