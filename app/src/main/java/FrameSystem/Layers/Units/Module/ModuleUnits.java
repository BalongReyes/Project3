package FrameSystem.Layers.Units.Module;

import FrameSystem.SLibrary.SComponents.SPanel;

public class ModuleUnits extends SPanel{

    public ModuleUnits(){
        initComponents();
        setOpaque(false);
        setDoubleBuffered(true);
        objectUnitWrapper.setDoubleBuffered(true);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        sPanel1 = new FrameSystem.SLibrary.SComponents.SPanel();
        sPanel2 = new FrameSystem.SLibrary.SComponents.SPanel();
        sPanel3 = new FrameSystem.SLibrary.SComponents.SPanel();
        sPanel7 = new FrameSystem.SLibrary.SComponents.SPanel();
        sLabel12 = new FrameSystem.SLibrary.SComponents.SLabel();
        sPanel8 = new FrameSystem.SLibrary.SComponents.SPanel();
        sLabel13 = new FrameSystem.SLibrary.SComponents.SLabel();
        sPanel9 = new FrameSystem.SLibrary.SComponents.SPanel();
        sLabel14 = new FrameSystem.SLibrary.SComponents.SLabel();
        sPanel6 = new FrameSystem.SLibrary.SComponents.SPanel();
        sPanel10 = new FrameSystem.SLibrary.SComponents.SPanel();
        sLabel15 = new FrameSystem.SLibrary.SComponents.SLabel();
        sPanel12 = new FrameSystem.SLibrary.SComponents.SPanel();
        sLabel16 = new FrameSystem.SLibrary.SComponents.SLabel();
        sPanel13 = new FrameSystem.SLibrary.SComponents.SPanel();
        sLabel17 = new FrameSystem.SLibrary.SComponents.SLabel();
        sPanel14 = new FrameSystem.SLibrary.SComponents.SPanel();
        sLabel18 = new FrameSystem.SLibrary.SComponents.SLabel();
        sPanel15 = new FrameSystem.SLibrary.SComponents.SPanel();
        sLabel6 = new FrameSystem.SLibrary.SComponents.SLabel();
        sPanel4 = new FrameSystem.SLibrary.SComponents.SPanel();
        jLayeredPane1 = new javax.swing.JLayeredPane();
        layerUnitsOffline = new FrameSystem.Layers.Units.Components.LayerUnits();
        jPanel1 = new javax.swing.JPanel();
        sLabel2 = new FrameSystem.SLibrary.SComponents.SLabel();
        sAnimatedOffline1 = new FrameSystem.SLibrary.SAnimated.SAnimatedOffline();
        layerUnitsLoading = new FrameSystem.Layers.Units.Components.LayerUnits();
        jPanel2 = new javax.swing.JPanel();
        sLabel3 = new FrameSystem.SLibrary.SComponents.SLabel();
        sAnimatedOffline4 = new FrameSystem.SLibrary.SAnimated.SAnimatedOffline();
        layerUnitsOnline = new FrameSystem.Layers.Units.Components.LayerUnits();
        objectUnitScrollPane = new FrameSystem.SLibrary.SComponents.SScrollPane();
        objectUnitContainer = new FrameSystem.SLibrary.SComponents.SPanel();
        objectUnitWrapper = new FrameSystem.SLibrary.SComponents.SPanel();
        layerUnitsOffline1 = new FrameSystem.Layers.Units.Components.LayerUnits();
        sTextFieldContainer1 = new FrameSystem.SLibrary.SGenericComponents.STextFieldContainer();
        sTextField1 = new FrameSystem.SLibrary.SComponents.STextField();
        sLabel1 = new FrameSystem.SLibrary.SComponents.SLabel();
        sPanel16 = new FrameSystem.SLibrary.SComponents.SPanel();
        sPanel19 = new FrameSystem.SLibrary.SComponents.SPanel();
        filler4 = new javax.swing.Box.Filler(new java.awt.Dimension(5, 0), new java.awt.Dimension(5, 0), new java.awt.Dimension(5, 32767));
        sPanel25 = new FrameSystem.SLibrary.SComponents.SPanel();
        sPanel26 = new FrameSystem.SLibrary.SComponents.SPanel();
        filler5 = new javax.swing.Box.Filler(new java.awt.Dimension(5, 0), new java.awt.Dimension(5, 0), new java.awt.Dimension(5, 32767));
        objectUnitFilter4 = new FrameSystem.Layers.Units.Components.ObjectUnitFilter();
        sLabel7 = new FrameSystem.SLibrary.SComponents.SLabel();
        objectUnitFilter5 = new FrameSystem.Layers.Units.Components.ObjectUnitFilter();
        sPanel11 = new FrameSystem.SLibrary.SComponents.SPanel();
        filler2 = new javax.swing.Box.Filler(new java.awt.Dimension(5, 0), new java.awt.Dimension(5, 0), new java.awt.Dimension(5, 32767));
        sPanel23 = new FrameSystem.SLibrary.SComponents.SPanel();
        sPanel24 = new FrameSystem.SLibrary.SComponents.SPanel();
        filler3 = new javax.swing.Box.Filler(new java.awt.Dimension(5, 0), new java.awt.Dimension(5, 0), new java.awt.Dimension(5, 32767));
        sPanel17 = new FrameSystem.SLibrary.SComponents.SPanel();
        sLabel8 = new FrameSystem.SLibrary.SComponents.SLabel();
        sPanel27 = new FrameSystem.SLibrary.SComponents.SPanel();
        sLabel9 = new FrameSystem.SLibrary.SComponents.SLabel();
        sPanel18 = new FrameSystem.SLibrary.SComponents.SPanel();
        sPanel32 = new FrameSystem.SLibrary.SComponents.SPanel();
        filterTower1 = new FrameSystem.SLibrary.SComponents.SPanel();
        sLabel4 = new FrameSystem.SLibrary.SComponents.SLabel();
        sPanel30 = new FrameSystem.SLibrary.SComponents.SPanel();
        filterTower2 = new FrameSystem.SLibrary.SComponents.SPanel();
        sLabel10 = new FrameSystem.SLibrary.SComponents.SLabel();
        sPanel31 = new FrameSystem.SLibrary.SComponents.SPanel();
        filterTower3 = new FrameSystem.SLibrary.SComponents.SPanel();
        sLabel11 = new FrameSystem.SLibrary.SComponents.SLabel();
        sPanel5 = new FrameSystem.SLibrary.SComponents.SPanel();
        sLabel5 = new FrameSystem.SLibrary.SComponents.SLabel();

        setPaintBackground(false);

        sPanel1.setRadius(20);
        sPanel1.setRounded(true);
        sPanel1.setShadowColor(new java.awt.Color(230, 230, 230));
        sPanel1.setShadowOpacity(0.3F);
        sPanel1.setShadowSize(5);
        sPanel1.setShadowX(true);
        sPanel1.setShadowY(true);

        sPanel2.setPaintBackground(false);

        sPanel3.setBorderColor(new java.awt.Color(245, 245, 245));
        sPanel3.setBorderLine(2);
        sPanel3.setDefaultBackgroundColor(new java.awt.Color(249, 249, 249));
        sPanel3.setRadius(20);
        sPanel3.setRounded(true);
        sPanel3.setMinimumSize(new java.awt.Dimension(100, 40));
        sPanel3.setPreferredSize(new java.awt.Dimension(100, 40));

        sPanel7.setPaintBackground(false);
        sPanel7.setPreferredSize(new java.awt.Dimension(75, 30));

        sLabel12.setForeground(new java.awt.Color(56, 56, 56));
        sLabel12.setText("Tower");

        javax.swing.GroupLayout sPanel7Layout = new javax.swing.GroupLayout(sPanel7);
        sPanel7.setLayout(sPanel7Layout);
        sPanel7Layout.setHorizontalGroup(
            sPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(sPanel7Layout.createSequentialGroup()
                .addComponent(sLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(43, Short.MAX_VALUE))
        );
        sPanel7Layout.setVerticalGroup(
            sPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, sPanel7Layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(sLabel12, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
                .addGap(0, 0, 0))
        );

        sPanel8.setPaintBackground(false);
        sPanel8.setPreferredSize(new java.awt.Dimension(75, 30));

        sLabel13.setForeground(new java.awt.Color(56, 56, 56));
        sLabel13.setText("Floor");

        javax.swing.GroupLayout sPanel8Layout = new javax.swing.GroupLayout(sPanel8);
        sPanel8.setLayout(sPanel8Layout);
        sPanel8Layout.setHorizontalGroup(
            sPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(sPanel8Layout.createSequentialGroup()
                .addComponent(sLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(48, Short.MAX_VALUE))
        );
        sPanel8Layout.setVerticalGroup(
            sPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, sPanel8Layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(sLabel13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(0, 0, 0))
        );

        sPanel9.setPaintBackground(false);
        sPanel9.setPreferredSize(new java.awt.Dimension(75, 30));

        sLabel14.setForeground(new java.awt.Color(56, 56, 56));
        sLabel14.setText("Unit");

        javax.swing.GroupLayout sPanel9Layout = new javax.swing.GroupLayout(sPanel9);
        sPanel9.setLayout(sPanel9Layout);
        sPanel9Layout.setHorizontalGroup(
            sPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(sPanel9Layout.createSequentialGroup()
                .addComponent(sLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(53, Short.MAX_VALUE))
        );
        sPanel9Layout.setVerticalGroup(
            sPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, sPanel9Layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(sLabel14, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(0, 0, 0))
        );

        sPanel6.setPaintBackground(false);
        sPanel6.setLayout(new java.awt.GridLayout(1, 6));

        sPanel10.setPaintBackground(false);

        sLabel15.setForeground(new java.awt.Color(56, 56, 56));
        sLabel15.setText("Model");

        javax.swing.GroupLayout sPanel10Layout = new javax.swing.GroupLayout(sPanel10);
        sPanel10.setLayout(sPanel10Layout);
        sPanel10Layout.setHorizontalGroup(
            sPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(sPanel10Layout.createSequentialGroup()
                .addComponent(sLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(194, Short.MAX_VALUE))
        );
        sPanel10Layout.setVerticalGroup(
            sPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, sPanel10Layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(sLabel15, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(0, 0, 0))
        );

        sPanel6.add(sPanel10);

        sPanel12.setPaintBackground(false);

        sLabel16.setForeground(new java.awt.Color(56, 56, 56));
        sLabel16.setText("Floor Area");

        javax.swing.GroupLayout sPanel12Layout = new javax.swing.GroupLayout(sPanel12);
        sPanel12.setLayout(sPanel12Layout);
        sPanel12Layout.setHorizontalGroup(
            sPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(sPanel12Layout.createSequentialGroup()
                .addComponent(sLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(174, Short.MAX_VALUE))
        );
        sPanel12Layout.setVerticalGroup(
            sPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, sPanel12Layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(sLabel16, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(0, 0, 0))
        );

        sPanel6.add(sPanel12);

        sPanel13.setPaintBackground(false);

        sLabel17.setForeground(new java.awt.Color(56, 56, 56));
        sLabel17.setText("Occupancy Type");

        javax.swing.GroupLayout sPanel13Layout = new javax.swing.GroupLayout(sPanel13);
        sPanel13.setLayout(sPanel13Layout);
        sPanel13Layout.setHorizontalGroup(
            sPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(sPanel13Layout.createSequentialGroup()
                .addComponent(sLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(144, Short.MAX_VALUE))
        );
        sPanel13Layout.setVerticalGroup(
            sPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, sPanel13Layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(sLabel17, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(0, 0, 0))
        );

        sPanel6.add(sPanel13);

        sPanel14.setPaintBackground(false);

        sLabel18.setForeground(new java.awt.Color(56, 56, 56));
        sLabel18.setText("Unit Status");

        javax.swing.GroupLayout sPanel14Layout = new javax.swing.GroupLayout(sPanel14);
        sPanel14.setLayout(sPanel14Layout);
        sPanel14Layout.setHorizontalGroup(
            sPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(sPanel14Layout.createSequentialGroup()
                .addComponent(sLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(171, Short.MAX_VALUE))
        );
        sPanel14Layout.setVerticalGroup(
            sPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, sPanel14Layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(sLabel18, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(0, 0, 0))
        );

        sPanel6.add(sPanel14);

        sPanel15.setPaintBackground(false);
        sPanel15.setPreferredSize(new java.awt.Dimension(75, 30));

        sLabel6.setForeground(new java.awt.Color(56, 56, 56));
        sLabel6.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        sLabel6.setText("Actions");

        javax.swing.GroupLayout sPanel15Layout = new javax.swing.GroupLayout(sPanel15);
        sPanel15.setLayout(sPanel15Layout);
        sPanel15Layout.setHorizontalGroup(
            sPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(sPanel15Layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(sLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, 75, Short.MAX_VALUE)
                .addGap(0, 0, 0))
        );
        sPanel15Layout.setVerticalGroup(
            sPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(sPanel15Layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(sLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(0, 0, 0))
        );

        javax.swing.GroupLayout sPanel3Layout = new javax.swing.GroupLayout(sPanel3);
        sPanel3.setLayout(sPanel3Layout);
        sPanel3Layout.setHorizontalGroup(
            sPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(sPanel3Layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(sPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(sPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(sPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addComponent(sPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(sPanel15, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18))
        );
        sPanel3Layout.setVerticalGroup(
            sPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(sPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(sPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
            .addComponent(sPanel8, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
            .addComponent(sPanel9, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
            .addComponent(sPanel15, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
        );

        sPanel4.setPaintBackground(false);

        jLayeredPane1.setLayout(new java.awt.CardLayout());

        layerUnitsOffline.setPaintBackground(false);
        layerUnitsOffline.setName("Offline"); // NOI18N

        jPanel1.setOpaque(false);

        sLabel2.setForeground(new java.awt.Color(205, 64, 68));
        sLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        sLabel2.setText("Database Offline");
        sLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N

        sAnimatedOffline1.setLineColor(new java.awt.Color(205, 64, 68));
        sAnimatedOffline1.setLineWidth(5.0F);
        sAnimatedOffline1.setPreferredSize(new java.awt.Dimension(160, 160));

        javax.swing.GroupLayout sAnimatedOffline1Layout = new javax.swing.GroupLayout(sAnimatedOffline1);
        sAnimatedOffline1.setLayout(sAnimatedOffline1Layout);
        sAnimatedOffline1Layout.setHorizontalGroup(
            sAnimatedOffline1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 61, Short.MAX_VALUE)
        );
        sAnimatedOffline1Layout.setVerticalGroup(
            sAnimatedOffline1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 58, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(sAnimatedOffline1, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(40, 40, 40))
                    .addComponent(sLabel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(sAnimatedOffline1, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(sLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layerUnitsOfflineLayout = new javax.swing.GroupLayout(layerUnitsOffline);
        layerUnitsOffline.setLayout(layerUnitsOfflineLayout);
        layerUnitsOfflineLayout.setHorizontalGroup(
            layerUnitsOfflineLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layerUnitsOfflineLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layerUnitsOfflineLayout.setVerticalGroup(
            layerUnitsOfflineLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layerUnitsOfflineLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jLayeredPane1.setLayer(layerUnitsOffline, javax.swing.JLayeredPane.PALETTE_LAYER);
        jLayeredPane1.add(layerUnitsOffline, "Offline");

        layerUnitsLoading.setPaintBackground(false);
        layerUnitsLoading.setName("Loading"); // NOI18N

        jPanel2.setOpaque(false);

        sLabel3.setForeground(new java.awt.Color(255, 127, 127));
        sLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        sLabel3.setText("Loading");
        sLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N

        sAnimatedOffline4.setLineColor(new java.awt.Color(255, 127, 127));
        sAnimatedOffline4.setLineWidth(5.0F);
        sAnimatedOffline4.setPreferredSize(new java.awt.Dimension(160, 160));

        javax.swing.GroupLayout sAnimatedOffline4Layout = new javax.swing.GroupLayout(sAnimatedOffline4);
        sAnimatedOffline4.setLayout(sAnimatedOffline4Layout);
        sAnimatedOffline4Layout.setHorizontalGroup(
            sAnimatedOffline4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 61, Short.MAX_VALUE)
        );
        sAnimatedOffline4Layout.setVerticalGroup(
            sAnimatedOffline4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 58, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(sAnimatedOffline4, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(40, 40, 40))
                    .addComponent(sLabel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(sAnimatedOffline4, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(sLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layerUnitsLoadingLayout = new javax.swing.GroupLayout(layerUnitsLoading);
        layerUnitsLoading.setLayout(layerUnitsLoadingLayout);
        layerUnitsLoadingLayout.setHorizontalGroup(
            layerUnitsLoadingLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layerUnitsLoadingLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layerUnitsLoadingLayout.setVerticalGroup(
            layerUnitsLoadingLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layerUnitsLoadingLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jLayeredPane1.setLayer(layerUnitsLoading, javax.swing.JLayeredPane.PALETTE_LAYER);
        jLayeredPane1.add(layerUnitsLoading, "Loading");

        layerUnitsOnline.setPaintBackground(false);
        layerUnitsOnline.setName("Online"); // NOI18N

        objectUnitScrollPane.setBackground(new java.awt.Color(229, 229, 229));
        objectUnitScrollPane.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        objectUnitScrollPane.setHoverColor(new java.awt.Color(73, 73, 73));
        objectUnitScrollPane.setScrollbarBackgroundColor(new java.awt.Color(255, 255, 255));
        objectUnitScrollPane.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);

        objectUnitWrapper.setMinimumSize(new java.awt.Dimension(100, 0));
        objectUnitWrapper.setPreferredSize(new java.awt.Dimension(964, 0));
        objectUnitWrapper.setLayout(new javax.swing.BoxLayout(objectUnitWrapper, javax.swing.BoxLayout.Y_AXIS));

        javax.swing.GroupLayout objectUnitContainerLayout = new javax.swing.GroupLayout(objectUnitContainer);
        objectUnitContainer.setLayout(objectUnitContainerLayout);
        objectUnitContainerLayout.setHorizontalGroup(
            objectUnitContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(objectUnitContainerLayout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addComponent(objectUnitWrapper, javax.swing.GroupLayout.DEFAULT_SIZE, 1269, Short.MAX_VALUE))
        );
        objectUnitContainerLayout.setVerticalGroup(
            objectUnitContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(objectUnitContainerLayout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(objectUnitWrapper, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 568, Short.MAX_VALUE))
        );

        objectUnitScrollPane.setViewportView(objectUnitContainer);

        javax.swing.GroupLayout layerUnitsOnlineLayout = new javax.swing.GroupLayout(layerUnitsOnline);
        layerUnitsOnline.setLayout(layerUnitsOnlineLayout);
        layerUnitsOnlineLayout.setHorizontalGroup(
            layerUnitsOnlineLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layerUnitsOnlineLayout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(objectUnitScrollPane, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(5, 5, 5))
        );
        layerUnitsOnlineLayout.setVerticalGroup(
            layerUnitsOnlineLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layerUnitsOnlineLayout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(objectUnitScrollPane, javax.swing.GroupLayout.DEFAULT_SIZE, 568, Short.MAX_VALUE)
                .addGap(0, 0, 0))
        );

        jLayeredPane1.setLayer(layerUnitsOnline, javax.swing.JLayeredPane.PALETTE_LAYER);
        jLayeredPane1.add(layerUnitsOnline, "Online");

        layerUnitsOffline1.setPaintBackground(false);
        layerUnitsOffline1.setName("Offline"); // NOI18N

        javax.swing.GroupLayout layerUnitsOffline1Layout = new javax.swing.GroupLayout(layerUnitsOffline1);
        layerUnitsOffline1.setLayout(layerUnitsOffline1Layout);
        layerUnitsOffline1Layout.setHorizontalGroup(
            layerUnitsOffline1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1296, Short.MAX_VALUE)
        );
        layerUnitsOffline1Layout.setVerticalGroup(
            layerUnitsOffline1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 568, Short.MAX_VALUE)
        );

        jLayeredPane1.add(layerUnitsOffline1, "card5");

        javax.swing.GroupLayout sPanel4Layout = new javax.swing.GroupLayout(sPanel4);
        sPanel4.setLayout(sPanel4Layout);
        sPanel4Layout.setHorizontalGroup(
            sPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(sPanel4Layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(jLayeredPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                .addGap(0, 0, 0))
        );
        sPanel4Layout.setVerticalGroup(
            sPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(sPanel4Layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(jLayeredPane1)
                .addGap(0, 0, 0))
        );

        javax.swing.GroupLayout sPanel2Layout = new javax.swing.GroupLayout(sPanel2);
        sPanel2.setLayout(sPanel2Layout);
        sPanel2Layout.setHorizontalGroup(
            sPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(sPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(sPanel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 1296, Short.MAX_VALUE)
        );
        sPanel2Layout.setVerticalGroup(
            sPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(sPanel2Layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(sPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(sPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(0, 0, 0))
        );

        javax.swing.GroupLayout sPanel1Layout = new javax.swing.GroupLayout(sPanel1);
        sPanel1.setLayout(sPanel1Layout);
        sPanel1Layout.setHorizontalGroup(
            sPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(sPanel1Layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(sPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(0, 0, 0))
        );
        sPanel1Layout.setVerticalGroup(
            sPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, sPanel1Layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(sPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(0, 0, 0))
        );

        sTextFieldContainer1.setRadius(20);
        sTextFieldContainer1.setRounded(true);
        sTextFieldContainer1.setShadowColor(new java.awt.Color(230, 230, 230));
        sTextFieldContainer1.setShadowOpacity(0.3F);
        sTextFieldContainer1.setShadowSize(5);
        sTextFieldContainer1.setShadowX(true);
        sTextFieldContainer1.setShadowY(true);
        sTextFieldContainer1.setTextFieldChild(sTextField1);
        sTextFieldContainer1.setPreferredSize(new java.awt.Dimension(390, 50));

        sTextField1.setBackground(new java.awt.Color(255, 255, 255));
        sTextField1.setHint("Search for units");
        sTextField1.setHintColor(new java.awt.Color(102, 102, 102));
        sTextField1.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        sTextField1.setPreferredSize(new java.awt.Dimension(370, 50));

        sLabel1.setIconSize(14);
        sLabel1.setScaledIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/search.png"))); // NOI18N

        javax.swing.GroupLayout sTextFieldContainer1Layout = new javax.swing.GroupLayout(sTextFieldContainer1);
        sTextFieldContainer1.setLayout(sTextFieldContainer1Layout);
        sTextFieldContainer1Layout.setHorizontalGroup(
            sTextFieldContainer1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(sTextFieldContainer1Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(sLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15)
                .addComponent(sTextField1, javax.swing.GroupLayout.DEFAULT_SIZE, 290, Short.MAX_VALUE)
                .addGap(5, 5, 5))
        );
        sTextFieldContainer1Layout.setVerticalGroup(
            sTextFieldContainer1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, sTextFieldContainer1Layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addGroup(sTextFieldContainer1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(sLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
                    .addComponent(sTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addGap(0, 0, 0))
        );

        sPanel16.setPaintBackground(false);
        sPanel16.setRadius(20);
        sPanel16.setRounded(true);
        sPanel16.setMaximumSize(new java.awt.Dimension(0, 32767));
        sPanel16.setMinimumSize(new java.awt.Dimension(0, 46));
        sPanel16.setPreferredSize(new java.awt.Dimension(0, 46));
        sPanel16.setLayout(new javax.swing.BoxLayout(sPanel16, javax.swing.BoxLayout.X_AXIS));

        sPanel19.setPaintBackground(false);
        sPanel19.setLayout(new javax.swing.BoxLayout(sPanel19, javax.swing.BoxLayout.LINE_AXIS));
        sPanel19.add(filler4);

        sPanel25.setPaintBackground(false);
        sPanel25.setMaximumSize(new java.awt.Dimension(2, 40));
        sPanel25.setMinimumSize(new java.awt.Dimension(2, 40));

        sPanel26.setDefaultBackgroundColor(new java.awt.Color(153, 153, 153));
        sPanel26.setMaximumSize(new java.awt.Dimension(2, 20));
        sPanel26.setMinimumSize(new java.awt.Dimension(2, 20));

        javax.swing.GroupLayout sPanel26Layout = new javax.swing.GroupLayout(sPanel26);
        sPanel26.setLayout(sPanel26Layout);
        sPanel26Layout.setHorizontalGroup(
            sPanel26Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 2, Short.MAX_VALUE)
        );
        sPanel26Layout.setVerticalGroup(
            sPanel26Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 20, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout sPanel25Layout = new javax.swing.GroupLayout(sPanel25);
        sPanel25.setLayout(sPanel25Layout);
        sPanel25Layout.setHorizontalGroup(
            sPanel25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 2, Short.MAX_VALUE)
            .addGroup(sPanel25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(sPanel25Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(sPanel26, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        sPanel25Layout.setVerticalGroup(
            sPanel25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 40, Short.MAX_VALUE)
            .addGroup(sPanel25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(sPanel25Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(sPanel26, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        sPanel19.add(sPanel25);
        sPanel19.add(filler5);

        sPanel16.add(sPanel19);

        objectUnitFilter4.setText("Test");
        sPanel16.add(objectUnitFilter4);

        sLabel7.setIconSize(8);
        sLabel7.setScaledIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/lassThan.png"))); // NOI18N
        sPanel16.add(sLabel7);

        objectUnitFilter5.setText("Test2");
        sPanel16.add(objectUnitFilter5);

        sPanel11.setPaintBackground(false);
        sPanel11.setLayout(new javax.swing.BoxLayout(sPanel11, javax.swing.BoxLayout.LINE_AXIS));
        sPanel11.add(filler2);

        sPanel23.setPaintBackground(false);
        sPanel23.setMaximumSize(new java.awt.Dimension(2, 40));
        sPanel23.setMinimumSize(new java.awt.Dimension(2, 40));
        sPanel23.setPreferredSize(new java.awt.Dimension(2, 40));

        sPanel24.setDefaultBackgroundColor(new java.awt.Color(153, 153, 153));
        sPanel24.setMaximumSize(new java.awt.Dimension(2, 20));
        sPanel24.setMinimumSize(new java.awt.Dimension(2, 20));
        sPanel24.setPreferredSize(new java.awt.Dimension(2, 20));

        javax.swing.GroupLayout sPanel24Layout = new javax.swing.GroupLayout(sPanel24);
        sPanel24.setLayout(sPanel24Layout);
        sPanel24Layout.setHorizontalGroup(
            sPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 2, Short.MAX_VALUE)
        );
        sPanel24Layout.setVerticalGroup(
            sPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 20, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout sPanel23Layout = new javax.swing.GroupLayout(sPanel23);
        sPanel23.setLayout(sPanel23Layout);
        sPanel23Layout.setHorizontalGroup(
            sPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 2, Short.MAX_VALUE)
            .addGroup(sPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(sPanel23Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(sPanel24, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        sPanel23Layout.setVerticalGroup(
            sPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 40, Short.MAX_VALUE)
            .addGroup(sPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(sPanel23Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(sPanel24, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        sPanel11.add(sPanel23);
        sPanel11.add(filler3);

        sPanel16.add(sPanel11);

        sPanel17.setCanHover(true);
        sPanel17.setHoverBackgroundColor(new java.awt.Color(230, 230, 230));
        sPanel17.setRadius(20);
        sPanel17.setRounded(true);
        sPanel17.setShadowColor(new java.awt.Color(230, 230, 230));
        sPanel17.setShadowOpacity(0.3F);
        sPanel17.setShadowSize(5);
        sPanel17.setShadowX(true);
        sPanel17.setShadowY(true);
        sPanel17.setMaximumSize(new java.awt.Dimension(100, 32767));
        sPanel17.setMinimumSize(new java.awt.Dimension(100, 0));
        sPanel17.setPreferredSize(new java.awt.Dimension(100, 40));

        sLabel8.setForeground(new java.awt.Color(56, 56, 56));
        sLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        sLabel8.setIconSize(13);
        sLabel8.setScaledIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/add.png"))); // NOI18N
        sLabel8.setText("Add Filter");
        sLabel8.setFont(new java.awt.Font("Segoe UI", 1, 10)); // NOI18N
        sLabel8.setIconTextGap(10);
        sLabel8.setMaximumSize(new java.awt.Dimension(69, 30));
        sLabel8.setMinimumSize(new java.awt.Dimension(69, 30));
        sLabel8.setPreferredSize(new java.awt.Dimension(69, 30));

        javax.swing.GroupLayout sPanel17Layout = new javax.swing.GroupLayout(sPanel17);
        sPanel17.setLayout(sPanel17Layout);
        sPanel17Layout.setHorizontalGroup(
            sPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, sPanel17Layout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addComponent(sLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(5, 5, 5))
        );
        sPanel17Layout.setVerticalGroup(
            sPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(sPanel17Layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(sLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(0, 0, 0))
        );

        sPanel16.add(sPanel17);

        sPanel27.setCanHover(true);
        sPanel27.setHoverBackgroundColor(new java.awt.Color(255, 170, 170));
        sPanel27.setRadius(20);
        sPanel27.setRounded(true);
        sPanel27.setShadowColor(new java.awt.Color(230, 230, 230));
        sPanel27.setShadowOpacity(0.3F);
        sPanel27.setShadowSize(5);
        sPanel27.setShadowX(true);
        sPanel27.setShadowY(true);
        sPanel27.setMaximumSize(new java.awt.Dimension(105, 32767));
        sPanel27.setMinimumSize(new java.awt.Dimension(105, 0));
        sPanel27.setPreferredSize(new java.awt.Dimension(105, 40));

        sLabel9.setForeground(new java.awt.Color(56, 56, 56));
        sLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        sLabel9.setIconSize(13);
        sLabel9.setScaledIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/remove.png"))); // NOI18N
        sLabel9.setText("Clear Filter");
        sLabel9.setFont(new java.awt.Font("Segoe UI", 1, 10)); // NOI18N
        sLabel9.setIconTextGap(10);

        javax.swing.GroupLayout sPanel27Layout = new javax.swing.GroupLayout(sPanel27);
        sPanel27.setLayout(sPanel27Layout);
        sPanel27Layout.setHorizontalGroup(
            sPanel27Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, sPanel27Layout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addComponent(sLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(5, 5, 5))
        );
        sPanel27Layout.setVerticalGroup(
            sPanel27Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(sPanel27Layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(sLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, 36, Short.MAX_VALUE)
                .addGap(0, 0, 0))
        );

        sPanel16.add(sPanel27);

        sPanel18.setRadius(20);
        sPanel18.setRounded(true);
        sPanel18.setShadowColor(new java.awt.Color(230, 230, 230));
        sPanel18.setShadowOpacity(0.3F);
        sPanel18.setShadowSize(5);
        sPanel18.setShadowX(true);
        sPanel18.setShadowY(true);
        sPanel18.setMaximumSize(new java.awt.Dimension(0, 46));
        sPanel18.setMinimumSize(new java.awt.Dimension(0, 46));
        sPanel18.setPreferredSize(new java.awt.Dimension(0, 46));
        sPanel18.setLayout(new javax.swing.BoxLayout(sPanel18, javax.swing.BoxLayout.LINE_AXIS));

        sPanel32.setDefaultBackgroundColor(java.awt.Color.green);
        sPanel32.setPaintBackground(false);
        sPanel32.setRadius(20);
        sPanel32.setRounded(true);
        sPanel32.setMaximumSize(new java.awt.Dimension(90, 32767));
        sPanel32.setMinimumSize(new java.awt.Dimension(90, 0));
        sPanel32.setPreferredSize(new java.awt.Dimension(90, 40));

        filterTower1.setActiveBackgroundColor(new java.awt.Color(255, 230, 230));
        filterTower1.setActiveHoverBackgroundColor(new java.awt.Color(255, 220, 220));
        filterTower1.setCanHover(true);
        filterTower1.setHoverBackgroundColor(new java.awt.Color(240, 240, 240));
        filterTower1.setRadius(16);
        filterTower1.setRounded(true);
        filterTower1.setMaximumSize(new java.awt.Dimension(70, 32767));
        filterTower1.setPreferredSize(new java.awt.Dimension(0, 0));

        sLabel4.setForeground(new java.awt.Color(56, 56, 56));
        sLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        sLabel4.setText("Tower 1");
        sLabel4.setFont(new java.awt.Font("Segoe UI", 1, 10)); // NOI18N

        javax.swing.GroupLayout filterTower1Layout = new javax.swing.GroupLayout(filterTower1);
        filterTower1.setLayout(filterTower1Layout);
        filterTower1Layout.setHorizontalGroup(
            filterTower1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(filterTower1Layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(sLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(0, 0, 0))
        );
        filterTower1Layout.setVerticalGroup(
            filterTower1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(filterTower1Layout.createSequentialGroup()
                .addComponent(sLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(0, 0, 0))
        );

        javax.swing.GroupLayout sPanel32Layout = new javax.swing.GroupLayout(sPanel32);
        sPanel32.setLayout(sPanel32Layout);
        sPanel32Layout.setHorizontalGroup(
            sPanel32Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, sPanel32Layout.createSequentialGroup()
                .addGap(4, 4, 4)
                .addComponent(filterTower1, javax.swing.GroupLayout.DEFAULT_SIZE, 86, Short.MAX_VALUE)
                .addGap(0, 0, 0))
        );
        sPanel32Layout.setVerticalGroup(
            sPanel32Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, sPanel32Layout.createSequentialGroup()
                .addGap(4, 4, 4)
                .addComponent(filterTower1, javax.swing.GroupLayout.DEFAULT_SIZE, 28, Short.MAX_VALUE)
                .addGap(4, 4, 4))
        );

        sPanel18.add(sPanel32);

        sPanel30.setDefaultBackgroundColor(java.awt.Color.blue);
        sPanel30.setPaintBackground(false);
        sPanel30.setRadius(20);
        sPanel30.setRounded(true);
        sPanel30.setMaximumSize(new java.awt.Dimension(90, 32767));
        sPanel30.setMinimumSize(new java.awt.Dimension(90, 0));
        sPanel30.setPreferredSize(new java.awt.Dimension(90, 40));

        filterTower2.setActiveBackgroundColor(new java.awt.Color(255, 230, 230));
        filterTower2.setActiveHoverBackgroundColor(new java.awt.Color(255, 220, 220));
        filterTower2.setCanHover(true);
        filterTower2.setHoverBackgroundColor(new java.awt.Color(240, 240, 240));
        filterTower2.setRadius(16);
        filterTower2.setRounded(true);
        filterTower2.setMaximumSize(new java.awt.Dimension(70, 32767));

        sLabel10.setForeground(new java.awt.Color(56, 56, 56));
        sLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        sLabel10.setText("Tower 2");
        sLabel10.setFont(new java.awt.Font("Segoe UI", 1, 10)); // NOI18N

        javax.swing.GroupLayout filterTower2Layout = new javax.swing.GroupLayout(filterTower2);
        filterTower2.setLayout(filterTower2Layout);
        filterTower2Layout.setHorizontalGroup(
            filterTower2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(filterTower2Layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(sLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(0, 0, 0))
        );
        filterTower2Layout.setVerticalGroup(
            filterTower2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(filterTower2Layout.createSequentialGroup()
                .addComponent(sLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(0, 0, 0))
        );

        javax.swing.GroupLayout sPanel30Layout = new javax.swing.GroupLayout(sPanel30);
        sPanel30.setLayout(sPanel30Layout);
        sPanel30Layout.setHorizontalGroup(
            sPanel30Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, sPanel30Layout.createSequentialGroup()
                .addGap(4, 4, 4)
                .addComponent(filterTower2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(0, 0, 0))
        );
        sPanel30Layout.setVerticalGroup(
            sPanel30Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, sPanel30Layout.createSequentialGroup()
                .addGap(4, 4, 4)
                .addComponent(filterTower2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(4, 4, 4))
        );

        sPanel18.add(sPanel30);

        sPanel31.setDefaultBackgroundColor(java.awt.Color.red);
        sPanel31.setPaintBackground(false);
        sPanel31.setRadius(20);
        sPanel31.setRounded(true);
        sPanel31.setMaximumSize(new java.awt.Dimension(90, 32767));
        sPanel31.setMinimumSize(new java.awt.Dimension(90, 0));
        sPanel31.setPreferredSize(new java.awt.Dimension(90, 40));

        filterTower3.setActiveBackgroundColor(new java.awt.Color(255, 230, 230));
        filterTower3.setActiveHoverBackgroundColor(new java.awt.Color(255, 220, 220));
        filterTower3.setCanHover(true);
        filterTower3.setHoverBackgroundColor(new java.awt.Color(240, 240, 240));
        filterTower3.setRadius(16);
        filterTower3.setRounded(true);
        filterTower3.setMaximumSize(new java.awt.Dimension(70, 32767));

        sLabel11.setForeground(new java.awt.Color(56, 56, 56));
        sLabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        sLabel11.setText("Tower 3");
        sLabel11.setFont(new java.awt.Font("Segoe UI", 1, 10)); // NOI18N

        javax.swing.GroupLayout filterTower3Layout = new javax.swing.GroupLayout(filterTower3);
        filterTower3.setLayout(filterTower3Layout);
        filterTower3Layout.setHorizontalGroup(
            filterTower3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(filterTower3Layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(sLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(0, 0, 0))
        );
        filterTower3Layout.setVerticalGroup(
            filterTower3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(filterTower3Layout.createSequentialGroup()
                .addComponent(sLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(0, 0, 0))
        );

        javax.swing.GroupLayout sPanel31Layout = new javax.swing.GroupLayout(sPanel31);
        sPanel31.setLayout(sPanel31Layout);
        sPanel31Layout.setHorizontalGroup(
            sPanel31Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, sPanel31Layout.createSequentialGroup()
                .addGap(4, 4, 4)
                .addComponent(filterTower3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(4, 4, 4))
        );
        sPanel31Layout.setVerticalGroup(
            sPanel31Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, sPanel31Layout.createSequentialGroup()
                .addGap(4, 4, 4)
                .addComponent(filterTower3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(4, 4, 4))
        );

        sPanel18.add(sPanel31);

        sPanel5.setRadius(20);
        sPanel5.setRounded(true);
        sPanel5.setShadowColor(new java.awt.Color(230, 230, 230));
        sPanel5.setShadowOpacity(0.3F);
        sPanel5.setShadowSize(5);
        sPanel5.setShadowX(true);
        sPanel5.setShadowY(true);
        sPanel5.setMaximumSize(new java.awt.Dimension(32767, 46));
        sPanel5.setMinimumSize(new java.awt.Dimension(0, 46));
        sPanel5.setPreferredSize(new java.awt.Dimension(126, 46));

        sLabel5.setForeground(new java.awt.Color(56, 56, 56));
        sLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        sLabel5.setIconSize(13);
        sLabel5.setScaledIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/Menu/tower.png"))); // NOI18N
        sLabel5.setText("Filter Tower");
        sLabel5.setFont(new java.awt.Font("Segoe UI", 1, 10)); // NOI18N
        sLabel5.setIconTextGap(10);

        javax.swing.GroupLayout sPanel5Layout = new javax.swing.GroupLayout(sPanel5);
        sPanel5.setLayout(sPanel5Layout);
        sPanel5Layout.setHorizontalGroup(
            sPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(sPanel5Layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(sLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, 116, Short.MAX_VALUE)
                .addGap(0, 0, 0))
        );
        sPanel5Layout.setVerticalGroup(
            sPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(sPanel5Layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(sLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, 36, Short.MAX_VALUE)
                .addGap(0, 0, 0))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(sPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(sPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, 0)
                                .addComponent(sPanel18, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, 0)
                                .addComponent(sPanel16, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addGap(15, 15, 15))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(sTextFieldContainer1, javax.swing.GroupLayout.PREFERRED_SIZE, 349, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(sTextFieldContainer1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(sPanel16, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(sPanel18, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(sPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addComponent(sPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(10, 10, 10))
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.Box.Filler filler2;
    private javax.swing.Box.Filler filler3;
    private javax.swing.Box.Filler filler4;
    private javax.swing.Box.Filler filler5;
    public FrameSystem.SLibrary.SComponents.SPanel filterTower1;
    public FrameSystem.SLibrary.SComponents.SPanel filterTower2;
    public FrameSystem.SLibrary.SComponents.SPanel filterTower3;
    public javax.swing.JLayeredPane jLayeredPane1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    public FrameSystem.Layers.Units.Components.LayerUnits layerUnitsLoading;
    public FrameSystem.Layers.Units.Components.LayerUnits layerUnitsOffline;
    public FrameSystem.Layers.Units.Components.LayerUnits layerUnitsOffline1;
    public FrameSystem.Layers.Units.Components.LayerUnits layerUnitsOnline;
    public FrameSystem.SLibrary.SComponents.SPanel objectUnitContainer;
    private FrameSystem.Layers.Units.Components.ObjectUnitFilter objectUnitFilter4;
    private FrameSystem.Layers.Units.Components.ObjectUnitFilter objectUnitFilter5;
    public FrameSystem.SLibrary.SComponents.SScrollPane objectUnitScrollPane;
    public FrameSystem.SLibrary.SComponents.SPanel objectUnitWrapper;
    private FrameSystem.SLibrary.SAnimated.SAnimatedOffline sAnimatedOffline1;
    private FrameSystem.SLibrary.SAnimated.SAnimatedOffline sAnimatedOffline4;
    private FrameSystem.SLibrary.SComponents.SLabel sLabel1;
    private FrameSystem.SLibrary.SComponents.SLabel sLabel10;
    private FrameSystem.SLibrary.SComponents.SLabel sLabel11;
    private FrameSystem.SLibrary.SComponents.SLabel sLabel12;
    private FrameSystem.SLibrary.SComponents.SLabel sLabel13;
    private FrameSystem.SLibrary.SComponents.SLabel sLabel14;
    private FrameSystem.SLibrary.SComponents.SLabel sLabel15;
    private FrameSystem.SLibrary.SComponents.SLabel sLabel16;
    private FrameSystem.SLibrary.SComponents.SLabel sLabel17;
    private FrameSystem.SLibrary.SComponents.SLabel sLabel18;
    private FrameSystem.SLibrary.SComponents.SLabel sLabel2;
    private FrameSystem.SLibrary.SComponents.SLabel sLabel3;
    private FrameSystem.SLibrary.SComponents.SLabel sLabel4;
    private FrameSystem.SLibrary.SComponents.SLabel sLabel5;
    private FrameSystem.SLibrary.SComponents.SLabel sLabel6;
    private FrameSystem.SLibrary.SComponents.SLabel sLabel7;
    private FrameSystem.SLibrary.SComponents.SLabel sLabel8;
    private FrameSystem.SLibrary.SComponents.SLabel sLabel9;
    private FrameSystem.SLibrary.SComponents.SPanel sPanel1;
    private FrameSystem.SLibrary.SComponents.SPanel sPanel10;
    private FrameSystem.SLibrary.SComponents.SPanel sPanel11;
    private FrameSystem.SLibrary.SComponents.SPanel sPanel12;
    private FrameSystem.SLibrary.SComponents.SPanel sPanel13;
    private FrameSystem.SLibrary.SComponents.SPanel sPanel14;
    private FrameSystem.SLibrary.SComponents.SPanel sPanel15;
    public FrameSystem.SLibrary.SComponents.SPanel sPanel16;
    private FrameSystem.SLibrary.SComponents.SPanel sPanel17;
    private FrameSystem.SLibrary.SComponents.SPanel sPanel18;
    private FrameSystem.SLibrary.SComponents.SPanel sPanel19;
    private FrameSystem.SLibrary.SComponents.SPanel sPanel2;
    private FrameSystem.SLibrary.SComponents.SPanel sPanel23;
    private FrameSystem.SLibrary.SComponents.SPanel sPanel24;
    private FrameSystem.SLibrary.SComponents.SPanel sPanel25;
    private FrameSystem.SLibrary.SComponents.SPanel sPanel26;
    private FrameSystem.SLibrary.SComponents.SPanel sPanel27;
    private FrameSystem.SLibrary.SComponents.SPanel sPanel3;
    private FrameSystem.SLibrary.SComponents.SPanel sPanel30;
    private FrameSystem.SLibrary.SComponents.SPanel sPanel31;
    private FrameSystem.SLibrary.SComponents.SPanel sPanel32;
    private FrameSystem.SLibrary.SComponents.SPanel sPanel4;
    private FrameSystem.SLibrary.SComponents.SPanel sPanel5;
    private FrameSystem.SLibrary.SComponents.SPanel sPanel6;
    private FrameSystem.SLibrary.SComponents.SPanel sPanel7;
    private FrameSystem.SLibrary.SComponents.SPanel sPanel8;
    private FrameSystem.SLibrary.SComponents.SPanel sPanel9;
    public FrameSystem.SLibrary.SComponents.STextField sTextField1;
    private FrameSystem.SLibrary.SGenericComponents.STextFieldContainer sTextFieldContainer1;
    // End of variables declaration//GEN-END:variables
}
