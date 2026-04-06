
package FrameSystem.Layers.Units.Components;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import DatabaseSystem.UnitsData.UnitsDataTable;
import FrameSystem.Layers.Units.Managers.ManagerObjectUnits;
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
        
        sLabel2.setText(
            switch(data.getModel()){
                case 1 -> "1 Bedroom";
                case 2 -> "2 Bedroom";
                case 3 -> "Studio";
                default -> "NULL";
            }
            +
            switch(data.getBalcony()){
                case 1 -> "w/ Balcony";
                default -> "";
            }
        );
        
        sLabel9.setText(data.getTower() + "-" + data.getFloor() + (data.getUnit() < 10 ? "0" : "") + data.getUnit());
        
        occupancyType.setOccupancy(data.getOccupancy());
        unitStatus.setUnitStatus(data.getUnitStatus());
        
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
        
//        deleteButton.addMouseListener((MousePressedAdaptor) evt -> {
//            delete();
//        });
//        editButton.addMouseListener((MousePressedAdaptor) evt -> {
//            edit();
//        });
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
        filler6 = new javax.swing.Box.Filler(new java.awt.Dimension(25, 0), new java.awt.Dimension(25, 0), new java.awt.Dimension(25, 32767));
        sLabel1 = new FrameSystem.SLibrary.SComponents.SLabel();
        sLabel7 = new FrameSystem.SLibrary.SComponents.SLabel();
        sLabel8 = new FrameSystem.SLibrary.SComponents.SLabel();
        filler10 = new javax.swing.Box.Filler(new java.awt.Dimension(20, 0), new java.awt.Dimension(20, 0), new java.awt.Dimension(20, 32767));
        sLabel9 = new FrameSystem.SLibrary.SComponents.SLabel();
        filler1 = new javax.swing.Box.Filler(new java.awt.Dimension(30, 0), new java.awt.Dimension(30, 0), new java.awt.Dimension(30, 32767));
        sPanel1 = new FrameSystem.SLibrary.SComponents.SPanel();
        sLabel2 = new FrameSystem.SLibrary.SComponents.SLabel();
        sLabel4 = new FrameSystem.SLibrary.SComponents.SLabel();
        occupancyType = new FrameSystem.Layers.Units.Components.ObjectUnitHighlight();
        unitStatus = new FrameSystem.Layers.Units.Components.ObjectUnitHighlight();
        sLabel5 = new FrameSystem.SLibrary.SComponents.SLabel();
        filler8 = new javax.swing.Box.Filler(new java.awt.Dimension(6, 0), new java.awt.Dimension(6, 0), new java.awt.Dimension(6, 32767));
        sPanel3 = new FrameSystem.SLibrary.SComponents.SPanel();
        filler9 = new javax.swing.Box.Filler(new java.awt.Dimension(12, 0), new java.awt.Dimension(12, 0), new java.awt.Dimension(12, 32767));

        setPaintBackground(false);
        setPreferredSize(new java.awt.Dimension(1010, 60));

        sPanelHighlight1.setActiveBackgroundColor(new java.awt.Color(255, 245, 245));
        sPanelHighlight1.setActiveBorderColor(new java.awt.Color(255, 235, 235));
        sPanelHighlight1.setActiveHoverBackgroundColor(new java.awt.Color(255, 245, 245));
        sPanelHighlight1.setBorderLine(2);
        sPanelHighlight1.setCanHover(true);
        sPanelHighlight1.setDefaultBorderColor(new java.awt.Color(240, 240, 240));
        sPanelHighlight1.setHoverBackgroundColor(new java.awt.Color(250, 250, 250));
        sPanelHighlight1.setHoverBorderColor(new java.awt.Color(240, 240, 240));
        sPanelHighlight1.setRadius(10);
        sPanelHighlight1.setRounded(true);
        sPanelHighlight1.setPreferredSize(new java.awt.Dimension(100, 50));
        sPanelHighlight1.setLayout(new javax.swing.BoxLayout(sPanelHighlight1, javax.swing.BoxLayout.LINE_AXIS));
        sPanelHighlight1.add(filler6);

        sLabel1.setBackground(new java.awt.Color(255, 255, 255));
        sLabel1.setForeground(new java.awt.Color(70, 70, 70));
        sLabel1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        sLabel1.setText(String.valueOf(data.getTower()));
        sLabel1.setMaximumSize(new java.awt.Dimension(60, 50));
        sLabel1.setMinimumSize(new java.awt.Dimension(60, 50));
        sLabel1.setPreferredSize(new java.awt.Dimension(60, 50));
        sPanelHighlight1.add(sLabel1);

        sLabel7.setForeground(new java.awt.Color(70, 70, 70));
        sLabel7.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        sLabel7.setText(String.valueOf(data.getFloor()));
        sLabel7.setMaximumSize(new java.awt.Dimension(60, 50));
        sLabel7.setMinimumSize(new java.awt.Dimension(60, 50));
        sLabel7.setPreferredSize(new java.awt.Dimension(60, 50));
        sPanelHighlight1.add(sLabel7);

        sLabel8.setForeground(new java.awt.Color(70, 70, 70));
        sLabel8.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        sLabel8.setText(String.valueOf(data.getUnit()));
        sLabel8.setMaximumSize(new java.awt.Dimension(60, 50));
        sLabel8.setMinimumSize(new java.awt.Dimension(60, 50));
        sLabel8.setPreferredSize(new java.awt.Dimension(60, 50));
        sPanelHighlight1.add(sLabel8);
        sPanelHighlight1.add(filler10);

        sLabel9.setForeground(new java.awt.Color(70, 70, 70));
        sLabel9.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        sLabel9.setText("Code");
        sLabel9.setMaximumSize(new java.awt.Dimension(60, 50));
        sLabel9.setMinimumSize(new java.awt.Dimension(60, 50));
        sLabel9.setPreferredSize(new java.awt.Dimension(60, 50));
        sPanelHighlight1.add(sLabel9);
        sPanelHighlight1.add(filler1);

        sPanel1.setPaintBackground(false);
        sPanel1.setLayout(new java.awt.GridLayout(1, 0));

        sLabel2.setBackground(new java.awt.Color(255, 255, 255));
        sLabel2.setForeground(new java.awt.Color(70, 70, 70));
        sLabel2.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        sLabel2.setText("Model");
        sPanel1.add(sLabel2);

        sLabel4.setForeground(new java.awt.Color(70, 70, 70));
        sLabel4.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        sLabel4.setText(String.valueOf(data.getFloorArea())
        );
        sPanel1.add(sLabel4);
        sPanel1.add(occupancyType);
        sPanel1.add(unitStatus);

        sLabel5.setForeground(new java.awt.Color(70, 70, 70));
        sLabel5.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        sLabel5.setText("TO");
        sPanel1.add(sLabel5);

        sPanelHighlight1.add(sPanel1);
        sPanelHighlight1.add(filler8);

        sPanel3.setPaintBackground(false);
        sPanel3.setMaximumSize(new java.awt.Dimension(75, 50));
        sPanel3.setMinimumSize(new java.awt.Dimension(75, 50));
        sPanel3.setPreferredSize(new java.awt.Dimension(75, 50));

        javax.swing.GroupLayout sPanel3Layout = new javax.swing.GroupLayout(sPanel3);
        sPanel3.setLayout(sPanel3Layout);
        sPanel3Layout.setHorizontalGroup(
            sPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 75, Short.MAX_VALUE)
        );
        sPanel3Layout.setVerticalGroup(
            sPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        sPanelHighlight1.add(sPanel3);
        sPanelHighlight1.add(filler9);

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
    private javax.swing.Box.Filler filler1;
    private javax.swing.Box.Filler filler10;
    private javax.swing.Box.Filler filler6;
    private javax.swing.Box.Filler filler8;
    private javax.swing.Box.Filler filler9;
    private FrameSystem.Layers.Units.Components.ObjectUnitHighlight occupancyType;
    private FrameSystem.SLibrary.SComponents.SLabel sLabel1;
    private FrameSystem.SLibrary.SComponents.SLabel sLabel2;
    private FrameSystem.SLibrary.SComponents.SLabel sLabel4;
    private FrameSystem.SLibrary.SComponents.SLabel sLabel5;
    private FrameSystem.SLibrary.SComponents.SLabel sLabel7;
    private FrameSystem.SLibrary.SComponents.SLabel sLabel8;
    private FrameSystem.SLibrary.SComponents.SLabel sLabel9;
    private FrameSystem.SLibrary.SComponents.SPanel sPanel1;
    private FrameSystem.SLibrary.SComponents.SPanel sPanel3;
    private FrameSystem.SLibrary.SComponents.SPanelHighlight sPanelHighlight1;
    private FrameSystem.Layers.Units.Components.ObjectUnitHighlight unitStatus;
    // End of variables declaration//GEN-END:variables
}
