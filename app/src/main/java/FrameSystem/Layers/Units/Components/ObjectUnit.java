
package FrameSystem.Layers.Units.Components;

import DatabaseSystem.UnitsData.UnitsDataTable;
import EventSystem.Listeners.MousePressedAdaptor;
import FrameSystem.Layers.Units.Managers.ManagerObjectUnits;
import FrameSystem.SLibrary.SComponents.SPanel;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.sql.Date;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class ObjectUnit extends SPanel{

    private UnitsDataTable data;
    private boolean deleteBlocked = false, editBlocked = false;
    
// ==== Constructor ==========================================================================================
    
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
        
        applyHoverInnerListener();
        view.applyHoverInnerListener();
        edit.applyHoverInnerListener();
        concern.applyHoverInnerListener();
        
        String accountNumber = data.accountNumber();
        if(accountNumber != null){
            sLabel3.setText(String.valueOf(accountNumber));
        }else{
            sLabel3.setText("-");
        }
        
        sLabel2.setText(
            switch(data.model()){
                case 1 -> "1 Bedroom";
                case 2 -> "2 Bedroom";
                case 3 -> "Studio";
                default -> "NULL";
            }
            +
            switch(data.balcony()){
                case 1 -> " w/ Balcony";
                default -> "";
            }
        );
        
        sLabel9.setText(data.tower() + "-" + data.floor() + (data.unit() < 10 ? "0" : "") + data.unit());
        
        Date turnedOver = data.turnedOver();
        if(turnedOver != null){
            LocalDate localDate = turnedOver.toLocalDate();
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MMMM dd, yyyy");
            sLabel5.setText(localDate.format(formatter));
        }else{
            sLabel5.setText("-");
        }
        
        occupancyType.setOccupancy(data.getOccupancy());
        unitStatus.setUnitStatus(data.getUnitStatus());
        
        view.addInnerListeners((MousePressedAdaptor) (MouseEvent evt) -> {
            if (onViewClick != null) {
                onViewClick.run(); 
            }
        });
        
    }
    
// ==== Main Methods =========================================================================================

    public UnitsDataTable getData(){
        return data;
    }
    
    public int getId(){
        return data.id();
    }
    
// -----------------------------------------------------------------------------------------------------------
    
    private void setFocus(){
        this.requestFocus();
        ManagerObjectUnits.changeCurrentObject(this);
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
    
// ==== Generated ============================================================================================
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        filler6 = new javax.swing.Box.Filler(new java.awt.Dimension(25, 0), new java.awt.Dimension(25, 0), new java.awt.Dimension(25, 32767));
        sPanel7 = new FrameSystem.SLibrary.SComponents.SPanel();
        sLabel1 = new FrameSystem.SLibrary.SComponents.SLabel();
        sPanel8 = new FrameSystem.SLibrary.SComponents.SPanel();
        sLabel7 = new FrameSystem.SLibrary.SComponents.SLabel();
        sPanel9 = new FrameSystem.SLibrary.SComponents.SPanel();
        sLabel8 = new FrameSystem.SLibrary.SComponents.SLabel();
        filler10 = new javax.swing.Box.Filler(new java.awt.Dimension(30, 0), new java.awt.Dimension(30, 0), new java.awt.Dimension(30, 32767));
        sPanel10 = new FrameSystem.SLibrary.SComponents.SPanel();
        sLabel9 = new FrameSystem.SLibrary.SComponents.SLabel();
        filler1 = new javax.swing.Box.Filler(new java.awt.Dimension(30, 0), new java.awt.Dimension(30, 0), new java.awt.Dimension(30, 32767));
        sPanel1 = new FrameSystem.SLibrary.SComponents.SPanel();
        sPanel4 = new FrameSystem.SLibrary.SComponents.SPanel();
        sLabel3 = new FrameSystem.SLibrary.SComponents.SLabel();
        sPanel5 = new FrameSystem.SLibrary.SComponents.SPanel();
        sLabel2 = new FrameSystem.SLibrary.SComponents.SLabel();
        sPanel6 = new FrameSystem.SLibrary.SComponents.SPanel();
        sLabel4 = new FrameSystem.SLibrary.SComponents.SLabel();
        occupancyType = new FrameSystem.Layers.Units.Components.ObjectUnitHighlight();
        unitStatus = new FrameSystem.Layers.Units.Components.ObjectUnitHighlight();
        sLabel5 = new FrameSystem.SLibrary.SComponents.SLabel();
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
        sPanel14 = new FrameSystem.SLibrary.SComponents.SPanel();
        concern = new FrameSystem.SLibrary.SComponents.SPanel();
        sLabel12 = new FrameSystem.SLibrary.SComponents.SLabel();
        filler5 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 0), new java.awt.Dimension(0, 0), new java.awt.Dimension(32767, 0));

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

        sPanel7.setPaintBackground(false);
        sPanel7.setMaximumSize(new java.awt.Dimension(70, 50));
        sPanel7.setMinimumSize(new java.awt.Dimension(70, 50));
        sPanel7.setPreferredSize(new java.awt.Dimension(70, 50));

        sLabel1.setBackground(new java.awt.Color(255, 255, 255));
        sLabel1.setForeground(new java.awt.Color(70, 70, 70));
        sLabel1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        sLabel1.setText(String.valueOf(data.tower()));
        sLabel1.setMaximumSize(new java.awt.Dimension(64, 50));
        sLabel1.setMinimumSize(new java.awt.Dimension(64, 50));
        sLabel1.setPreferredSize(new java.awt.Dimension(64, 50));

        javax.swing.GroupLayout sPanel7Layout = new javax.swing.GroupLayout(sPanel7);
        sPanel7.setLayout(sPanel7Layout);
        sPanel7Layout.setHorizontalGroup(
            sPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(sPanel7Layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(sLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(0, 0, 0))
        );
        sPanel7Layout.setVerticalGroup(
            sPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(sPanel7Layout.createSequentialGroup()
                .addComponent(sLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(0, 0, 0))
        );

        add(sPanel7);

        sPanel8.setPaintBackground(false);
        sPanel8.setMaximumSize(new java.awt.Dimension(70, 50));
        sPanel8.setMinimumSize(new java.awt.Dimension(70, 50));
        sPanel8.setPreferredSize(new java.awt.Dimension(70, 50));

        sLabel7.setForeground(new java.awt.Color(70, 70, 70));
        sLabel7.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        sLabel7.setText(String.valueOf(data.floor()));
        sLabel7.setMaximumSize(new java.awt.Dimension(64, 50));
        sLabel7.setMinimumSize(new java.awt.Dimension(64, 50));
        sLabel7.setPreferredSize(new java.awt.Dimension(64, 50));

        javax.swing.GroupLayout sPanel8Layout = new javax.swing.GroupLayout(sPanel8);
        sPanel8.setLayout(sPanel8Layout);
        sPanel8Layout.setHorizontalGroup(
            sPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, sPanel8Layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(sLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        sPanel8Layout.setVerticalGroup(
            sPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(sPanel8Layout.createSequentialGroup()
                .addComponent(sLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(0, 0, 0))
        );

        add(sPanel8);

        sPanel9.setPaintBackground(false);
        sPanel9.setMaximumSize(new java.awt.Dimension(70, 50));
        sPanel9.setMinimumSize(new java.awt.Dimension(70, 50));
        sPanel9.setPreferredSize(new java.awt.Dimension(70, 50));

        sLabel8.setForeground(new java.awt.Color(70, 70, 70));
        sLabel8.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        sLabel8.setText(String.valueOf(data.unit()));
        sLabel8.setMaximumSize(new java.awt.Dimension(64, 50));
        sLabel8.setMinimumSize(new java.awt.Dimension(64, 50));
        sLabel8.setPreferredSize(new java.awt.Dimension(64, 50));

        javax.swing.GroupLayout sPanel9Layout = new javax.swing.GroupLayout(sPanel9);
        sPanel9.setLayout(sPanel9Layout);
        sPanel9Layout.setHorizontalGroup(
            sPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(sPanel9Layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(sLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(0, 0, 0))
        );
        sPanel9Layout.setVerticalGroup(
            sPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(sPanel9Layout.createSequentialGroup()
                .addComponent(sLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(0, 0, 0))
        );

        add(sPanel9);
        add(filler10);

        sPanel10.setPaintBackground(false);
        sPanel10.setMaximumSize(new java.awt.Dimension(80, 50));
        sPanel10.setMinimumSize(new java.awt.Dimension(80, 50));

        sLabel9.setForeground(new java.awt.Color(70, 70, 70));
        sLabel9.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        sLabel9.setMaximumSize(new java.awt.Dimension(74, 50));
        sLabel9.setMinimumSize(new java.awt.Dimension(74, 50));
        sLabel9.setPreferredSize(new java.awt.Dimension(74, 50));

        javax.swing.GroupLayout sPanel10Layout = new javax.swing.GroupLayout(sPanel10);
        sPanel10.setLayout(sPanel10Layout);
        sPanel10Layout.setHorizontalGroup(
            sPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(sPanel10Layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(sLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(0, 0, 0))
        );
        sPanel10Layout.setVerticalGroup(
            sPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, sPanel10Layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(sLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(0, 0, 0))
        );

        add(sPanel10);
        add(filler1);

        sPanel1.setDefaultBackgroundColor(new java.awt.Color(255, 102, 102));
        sPanel1.setPaintBackground(false);
        sPanel1.setLayout(new java.awt.GridLayout(1, 0));

        sPanel4.setPaintBackground(false);

        sLabel3.setBackground(new java.awt.Color(255, 255, 255));
        sLabel3.setForeground(new java.awt.Color(70, 70, 70));
        sLabel3.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        sLabel3.setText("Code");

        javax.swing.GroupLayout sPanel4Layout = new javax.swing.GroupLayout(sPanel4);
        sPanel4.setLayout(sPanel4Layout);
        sPanel4Layout.setHorizontalGroup(
            sPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(sPanel4Layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(sLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 84, Short.MAX_VALUE)
                .addGap(0, 0, 0))
        );
        sPanel4Layout.setVerticalGroup(
            sPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(sPanel4Layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(sLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
                .addGap(0, 0, 0))
        );

        sPanel1.add(sPanel4);

        sPanel5.setPaintBackground(false);

        sLabel2.setBackground(new java.awt.Color(255, 255, 255));
        sLabel2.setForeground(new java.awt.Color(70, 70, 70));
        sLabel2.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        sLabel2.setText("Model");

        javax.swing.GroupLayout sPanel5Layout = new javax.swing.GroupLayout(sPanel5);
        sPanel5.setLayout(sPanel5Layout);
        sPanel5Layout.setHorizontalGroup(
            sPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, sPanel5Layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(sLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 84, Short.MAX_VALUE)
                .addGap(0, 0, 0))
        );
        sPanel5Layout.setVerticalGroup(
            sPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, sPanel5Layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(sLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
                .addGap(0, 0, 0))
        );

        sPanel1.add(sPanel5);

        sPanel6.setPaintBackground(false);

        sLabel4.setForeground(new java.awt.Color(70, 70, 70));
        sLabel4.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        sLabel4.setText(String.valueOf(data.floorArea())
        );

        javax.swing.GroupLayout sPanel6Layout = new javax.swing.GroupLayout(sPanel6);
        sPanel6.setLayout(sPanel6Layout);
        sPanel6Layout.setHorizontalGroup(
            sPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(sPanel6Layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(sLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, 84, Short.MAX_VALUE)
                .addGap(0, 0, 0))
        );
        sPanel6Layout.setVerticalGroup(
            sPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(sPanel6Layout.createSequentialGroup()
                .addComponent(sLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
                .addGap(0, 0, 0))
        );

        sPanel1.add(sPanel6);
        sPanel1.add(occupancyType);
        sPanel1.add(unitStatus);

        sLabel5.setForeground(new java.awt.Color(70, 70, 70));
        sLabel5.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        sLabel5.setText("TO");
        sPanel1.add(sLabel5);

        add(sPanel1);
        add(filler8);

        sPanel3.setDefaultBackgroundColor(new java.awt.Color(51, 255, 51));
        sPanel3.setPaintBackground(false);
        sPanel3.setMaximumSize(new java.awt.Dimension(130, 50));
        sPanel3.setMinimumSize(new java.awt.Dimension(130, 50));
        sPanel3.setPreferredSize(new java.awt.Dimension(130, 50));
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
        sLabel10.setScaledIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/modules/view.png"))); // NOI18N

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
        sLabel11.setScaledIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/modules/Edit.png"))); // NOI18N

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

        sPanel14.setDefaultBackgroundColor(new java.awt.Color(51, 255, 51));
        sPanel14.setPaintBackground(false);
        sPanel14.setMaximumSize(new java.awt.Dimension(25, 50));
        sPanel14.setMinimumSize(new java.awt.Dimension(25, 50));

        concern.setCanHover(true);
        concern.setDefaultBackgroundColor(new java.awt.Color(239, 239, 239));
        concern.setHoverBackgroundColor(new java.awt.Color(209, 209, 209));
        concern.setRadius(10);
        concern.setRounded(true);
        concern.setPreferredSize(new java.awt.Dimension(25, 25));

        sLabel12.setForeground(new java.awt.Color(255, 255, 255));
        sLabel12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        sLabel12.setIconSize(12);
        sLabel12.setScaledIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/modules/concernsSmall.png"))); // NOI18N

        javax.swing.GroupLayout concernLayout = new javax.swing.GroupLayout(concern);
        concern.setLayout(concernLayout);
        concernLayout.setHorizontalGroup(
            concernLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(sLabel12, javax.swing.GroupLayout.DEFAULT_SIZE, 25, Short.MAX_VALUE)
        );
        concernLayout.setVerticalGroup(
            concernLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(sLabel12, javax.swing.GroupLayout.DEFAULT_SIZE, 25, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout sPanel14Layout = new javax.swing.GroupLayout(sPanel14);
        sPanel14.setLayout(sPanel14Layout);
        sPanel14Layout.setHorizontalGroup(
            sPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(sPanel14Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(concern, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        sPanel14Layout.setVerticalGroup(
            sPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, sPanel14Layout.createSequentialGroup()
                .addGap(0, 12, Short.MAX_VALUE)
                .addComponent(concern, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 13, Short.MAX_VALUE))
        );

        sPanel3.add(sPanel14);
        sPanel3.add(filler5);

        add(sPanel3);
    }// </editor-fold>//GEN-END:initComponents

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private FrameSystem.SLibrary.SComponents.SPanel concern;
    private FrameSystem.SLibrary.SComponents.SPanel edit;
    private javax.swing.Box.Filler filler1;
    private javax.swing.Box.Filler filler10;
    private javax.swing.Box.Filler filler2;
    private javax.swing.Box.Filler filler3;
    private javax.swing.Box.Filler filler4;
    private javax.swing.Box.Filler filler5;
    private javax.swing.Box.Filler filler6;
    private javax.swing.Box.Filler filler8;
    private FrameSystem.Layers.Units.Components.ObjectUnitHighlight occupancyType;
    private FrameSystem.SLibrary.SComponents.SLabel sLabel1;
    private FrameSystem.SLibrary.SComponents.SLabel sLabel10;
    private FrameSystem.SLibrary.SComponents.SLabel sLabel11;
    private FrameSystem.SLibrary.SComponents.SLabel sLabel12;
    private FrameSystem.SLibrary.SComponents.SLabel sLabel2;
    private FrameSystem.SLibrary.SComponents.SLabel sLabel3;
    private FrameSystem.SLibrary.SComponents.SLabel sLabel4;
    private FrameSystem.SLibrary.SComponents.SLabel sLabel5;
    private FrameSystem.SLibrary.SComponents.SLabel sLabel7;
    private FrameSystem.SLibrary.SComponents.SLabel sLabel8;
    private FrameSystem.SLibrary.SComponents.SLabel sLabel9;
    private FrameSystem.SLibrary.SComponents.SPanel sPanel1;
    private FrameSystem.SLibrary.SComponents.SPanel sPanel10;
    private FrameSystem.SLibrary.SComponents.SPanel sPanel11;
    private FrameSystem.SLibrary.SComponents.SPanel sPanel13;
    private FrameSystem.SLibrary.SComponents.SPanel sPanel14;
    private FrameSystem.SLibrary.SComponents.SPanel sPanel3;
    private FrameSystem.SLibrary.SComponents.SPanel sPanel4;
    private FrameSystem.SLibrary.SComponents.SPanel sPanel5;
    private FrameSystem.SLibrary.SComponents.SPanel sPanel6;
    private FrameSystem.SLibrary.SComponents.SPanel sPanel7;
    private FrameSystem.SLibrary.SComponents.SPanel sPanel8;
    private FrameSystem.SLibrary.SComponents.SPanel sPanel9;
    private FrameSystem.Layers.Units.Components.ObjectUnitHighlight unitStatus;
    public FrameSystem.SLibrary.SComponents.SPanel view;
    // End of variables declaration//GEN-END:variables
}
