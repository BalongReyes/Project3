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
        sFilterTitlePanel1 = new FrameSystem.SLibrary.SGenericComponents.SFilterTitlePanel();
        sPanel8 = new FrameSystem.SLibrary.SComponents.SPanel();
        sFilterTitlePanel2 = new FrameSystem.SLibrary.SGenericComponents.SFilterTitlePanel();
        sPanel9 = new FrameSystem.SLibrary.SComponents.SPanel();
        sFilterTitlePanel3 = new FrameSystem.SLibrary.SGenericComponents.SFilterTitlePanel();
        sPanel6 = new FrameSystem.SLibrary.SComponents.SPanel();
        sPanel10 = new FrameSystem.SLibrary.SComponents.SPanel();
        sFilterTitlePanel5 = new FrameSystem.SLibrary.SGenericComponents.SFilterTitlePanel();
        sPanel12 = new FrameSystem.SLibrary.SComponents.SPanel();
        sFilterTitlePanel4 = new FrameSystem.SLibrary.SGenericComponents.SFilterTitlePanel();
        sPanel13 = new FrameSystem.SLibrary.SComponents.SPanel();
        sFilterTitlePanel7 = new FrameSystem.SLibrary.SGenericComponents.SFilterTitlePanel();
        sPanel14 = new FrameSystem.SLibrary.SComponents.SPanel();
        sFilterTitlePanel8 = new FrameSystem.SLibrary.SGenericComponents.SFilterTitlePanel();
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
        sFilterTower1 = new FrameSystem.SLibrary.SGenericComponents.SFilterTower();
        sFilterTower2 = new FrameSystem.SLibrary.SGenericComponents.SFilterTower();
        sFilterTower3 = new FrameSystem.SLibrary.SGenericComponents.SFilterTower();
        sTextFieldContainer1 = new FrameSystem.SLibrary.SGenericComponents.STextFieldContainer();
        sTextField1 = new FrameSystem.SLibrary.SComponents.STextField();
        sLabel1 = new FrameSystem.SLibrary.SComponents.SLabel();
        sPanel5 = new FrameSystem.SLibrary.SComponents.SPanel();
        sLabel5 = new FrameSystem.SLibrary.SComponents.SLabel();
        sPanel11 = new FrameSystem.SLibrary.SComponents.SPanel();
        sLabel7 = new FrameSystem.SLibrary.SComponents.SLabel();

        setDefaultBackgroundColor(new java.awt.Color(255, 247, 247));

        sPanel1.setRadius(20);
        sPanel1.setRounded(true);
        sPanel1.setShadowColor(new java.awt.Color(230, 230, 230));
        sPanel1.setShadowOpacity(0.3F);
        sPanel1.setShadowSize(5);
        sPanel1.setShadowX(true);
        sPanel1.setShadowY(true);

        sPanel2.setPaintBackground(false);

        sPanel3.setDefaultBackgroundColor(new java.awt.Color(249, 249, 249));
        sPanel3.setRadius(20);
        sPanel3.setRounded(true);
        sPanel3.setMinimumSize(new java.awt.Dimension(100, 40));
        sPanel3.setPreferredSize(new java.awt.Dimension(100, 40));

        sPanel7.setPaintBackground(false);
        sPanel7.setPreferredSize(new java.awt.Dimension(75, 30));

        sFilterTitlePanel1.setForeground(new java.awt.Color(56, 56, 56));
        sFilterTitlePanel1.setPaintBackground(false);
        sFilterTitlePanel1.setText("Tower");
        sFilterTitlePanel1.setMaximumSize(new java.awt.Dimension(400, 32767));
        sFilterTitlePanel1.setPreferredSize(new java.awt.Dimension(50, 30));

        javax.swing.GroupLayout sPanel7Layout = new javax.swing.GroupLayout(sPanel7);
        sPanel7.setLayout(sPanel7Layout);
        sPanel7Layout.setHorizontalGroup(
            sPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(sPanel7Layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(sFilterTitlePanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        sPanel7Layout.setVerticalGroup(
            sPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(sFilterTitlePanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        sPanel8.setPaintBackground(false);
        sPanel8.setPreferredSize(new java.awt.Dimension(75, 30));

        sFilterTitlePanel2.setForeground(new java.awt.Color(56, 56, 56));
        sFilterTitlePanel2.setPaintBackground(false);
        sFilterTitlePanel2.setText("Floor");
        sFilterTitlePanel2.setMaximumSize(new java.awt.Dimension(400, 32767));
        sFilterTitlePanel2.setPreferredSize(new java.awt.Dimension(50, 30));

        javax.swing.GroupLayout sPanel8Layout = new javax.swing.GroupLayout(sPanel8);
        sPanel8.setLayout(sPanel8Layout);
        sPanel8Layout.setHorizontalGroup(
            sPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(sPanel8Layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(sFilterTitlePanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(25, Short.MAX_VALUE))
        );
        sPanel8Layout.setVerticalGroup(
            sPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(sPanel8Layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(sFilterTitlePanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        sPanel9.setPaintBackground(false);
        sPanel9.setPreferredSize(new java.awt.Dimension(75, 30));

        sFilterTitlePanel3.setForeground(new java.awt.Color(56, 56, 56));
        sFilterTitlePanel3.setPaintBackground(false);
        sFilterTitlePanel3.setText("Unit");
        sFilterTitlePanel3.setMaximumSize(new java.awt.Dimension(400, 32767));
        sFilterTitlePanel3.setPreferredSize(new java.awt.Dimension(50, 30));

        javax.swing.GroupLayout sPanel9Layout = new javax.swing.GroupLayout(sPanel9);
        sPanel9.setLayout(sPanel9Layout);
        sPanel9Layout.setHorizontalGroup(
            sPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(sPanel9Layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(sFilterTitlePanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(25, Short.MAX_VALUE))
        );
        sPanel9Layout.setVerticalGroup(
            sPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(sFilterTitlePanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        sPanel6.setPaintBackground(false);
        sPanel6.setLayout(new java.awt.GridLayout(1, 6));

        sPanel10.setBackground(new java.awt.Color(255, 255, 255));
        sPanel10.setPaintBackground(false);

        sFilterTitlePanel5.setForeground(new java.awt.Color(56, 56, 56));
        sFilterTitlePanel5.setPaintBackground(false);
        sFilterTitlePanel5.setText("Model");
        sFilterTitlePanel5.setMaximumSize(new java.awt.Dimension(400, 32767));
        sFilterTitlePanel5.setPreferredSize(new java.awt.Dimension(50, 30));

        javax.swing.GroupLayout sPanel10Layout = new javax.swing.GroupLayout(sPanel10);
        sPanel10.setLayout(sPanel10Layout);
        sPanel10Layout.setHorizontalGroup(
            sPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(sPanel10Layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(sFilterTitlePanel5, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(129, Short.MAX_VALUE))
        );
        sPanel10Layout.setVerticalGroup(
            sPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, sPanel10Layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(sFilterTitlePanel5, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
                .addGap(0, 0, 0))
        );

        sPanel6.add(sPanel10);

        sPanel12.setPaintBackground(false);

        sFilterTitlePanel4.setForeground(new java.awt.Color(56, 56, 56));
        sFilterTitlePanel4.setPaintBackground(false);
        sFilterTitlePanel4.setText("Floor Area");
        sFilterTitlePanel4.setMaximumSize(new java.awt.Dimension(400, 32767));
        sFilterTitlePanel4.setPreferredSize(new java.awt.Dimension(50, 30));

        javax.swing.GroupLayout sPanel12Layout = new javax.swing.GroupLayout(sPanel12);
        sPanel12.setLayout(sPanel12Layout);
        sPanel12Layout.setHorizontalGroup(
            sPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(sPanel12Layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(sFilterTitlePanel4, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(115, Short.MAX_VALUE))
        );
        sPanel12Layout.setVerticalGroup(
            sPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(sPanel12Layout.createSequentialGroup()
                .addComponent(sFilterTitlePanel4, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
                .addGap(0, 0, 0))
        );

        sPanel6.add(sPanel12);

        sPanel13.setPaintBackground(false);

        sFilterTitlePanel7.setForeground(new java.awt.Color(56, 56, 56));
        sFilterTitlePanel7.setPaintBackground(false);
        sFilterTitlePanel7.setText("Occupancy Type");
        sFilterTitlePanel7.setMaximumSize(new java.awt.Dimension(400, 32767));
        sFilterTitlePanel7.setPreferredSize(new java.awt.Dimension(50, 30));

        javax.swing.GroupLayout sPanel13Layout = new javax.swing.GroupLayout(sPanel13);
        sPanel13.setLayout(sPanel13Layout);
        sPanel13Layout.setHorizontalGroup(
            sPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(sPanel13Layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(sFilterTitlePanel7, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(78, Short.MAX_VALUE))
        );
        sPanel13Layout.setVerticalGroup(
            sPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(sFilterTitlePanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        sPanel6.add(sPanel13);

        sPanel14.setBackground(new java.awt.Color(255, 255, 255));
        sPanel14.setPaintBackground(false);

        sFilterTitlePanel8.setForeground(new java.awt.Color(56, 56, 56));
        sFilterTitlePanel8.setPaintBackground(false);
        sFilterTitlePanel8.setText("Unit Status");
        sFilterTitlePanel8.setMaximumSize(new java.awt.Dimension(400, 32767));
        sFilterTitlePanel8.setPreferredSize(new java.awt.Dimension(50, 30));

        javax.swing.GroupLayout sPanel14Layout = new javax.swing.GroupLayout(sPanel14);
        sPanel14.setLayout(sPanel14Layout);
        sPanel14Layout.setHorizontalGroup(
            sPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(sPanel14Layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(sFilterTitlePanel8, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(109, Short.MAX_VALUE))
        );
        sPanel14Layout.setVerticalGroup(
            sPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(sFilterTitlePanel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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
                .addComponent(objectUnitWrapper, javax.swing.GroupLayout.DEFAULT_SIZE, 1154, Short.MAX_VALUE))
        );
        objectUnitContainerLayout.setVerticalGroup(
            objectUnitContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(objectUnitContainerLayout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(objectUnitWrapper, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 553, Short.MAX_VALUE))
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
                .addGap(10, 10, 10)
                .addComponent(objectUnitScrollPane, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(10, 10, 10))
        );

        jLayeredPane1.setLayer(layerUnitsOnline, javax.swing.JLayeredPane.PALETTE_LAYER);
        jLayeredPane1.add(layerUnitsOnline, "Online");

        layerUnitsOffline1.setPaintBackground(false);
        layerUnitsOffline1.setName("Offline"); // NOI18N

        javax.swing.GroupLayout layerUnitsOffline1Layout = new javax.swing.GroupLayout(layerUnitsOffline1);
        layerUnitsOffline1.setLayout(layerUnitsOffline1Layout);
        layerUnitsOffline1Layout.setHorizontalGroup(
            layerUnitsOffline1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1181, Short.MAX_VALUE)
        );
        layerUnitsOffline1Layout.setVerticalGroup(
            layerUnitsOffline1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 573, Short.MAX_VALUE)
        );

        jLayeredPane1.setLayer(layerUnitsOffline1, javax.swing.JLayeredPane.PALETTE_LAYER);
        jLayeredPane1.add(layerUnitsOffline1, "Offline");

        javax.swing.GroupLayout sPanel4Layout = new javax.swing.GroupLayout(sPanel4);
        sPanel4.setLayout(sPanel4Layout);
        sPanel4Layout.setHorizontalGroup(
            sPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(sPanel4Layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(jLayeredPane1)
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
            .addComponent(sPanel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 1181, Short.MAX_VALUE)
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

        sFilterTower1.setActiveForegroundColor(new java.awt.Color(255, 127, 127));
        sFilterTower1.setActiveLineHeight(12);
        sFilterTower1.setInactiveForegroundColor(new java.awt.Color(56, 56, 56));
        sFilterTower1.setInactiveLineHeight(16);
        sFilterTower1.setText("Tower 1");
        sFilterTower1.setPreferredSize(new java.awt.Dimension(100, 50));

        sFilterTower2.setActiveForegroundColor(new java.awt.Color(255, 127, 127));
        sFilterTower2.setActiveLineHeight(12);
        sFilterTower2.setInactiveForegroundColor(new java.awt.Color(56, 56, 56));
        sFilterTower2.setInactiveLineHeight(16);
        sFilterTower2.setText("Tower 2");
        sFilterTower2.setPreferredSize(new java.awt.Dimension(100, 50));

        sFilterTower3.setActiveForegroundColor(new java.awt.Color(255, 127, 127));
        sFilterTower3.setActiveLineHeight(12);
        sFilterTower3.setInactiveForegroundColor(new java.awt.Color(56, 56, 56));
        sFilterTower3.setInactiveLineHeight(16);
        sFilterTower3.setText("Tower 3");
        sFilterTower3.setPreferredSize(new java.awt.Dimension(100, 50));

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
                .addComponent(sTextField1, javax.swing.GroupLayout.DEFAULT_SIZE, 331, Short.MAX_VALUE)
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

        sPanel5.setRadius(20);
        sPanel5.setRounded(true);
        sPanel5.setShadowColor(new java.awt.Color(230, 230, 230));
        sPanel5.setShadowOpacity(0.3F);
        sPanel5.setShadowSize(5);
        sPanel5.setShadowX(true);
        sPanel5.setShadowY(true);
        sPanel5.setPreferredSize(new java.awt.Dimension(150, 50));

        sLabel5.setForeground(new java.awt.Color(56, 56, 56));
        sLabel5.setScaledIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/Menu/tower.png"))); // NOI18N
        sLabel5.setText("Filter Tower");
        sLabel5.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        sLabel5.setIconTextGap(10);

        javax.swing.GroupLayout sPanel5Layout = new javax.swing.GroupLayout(sPanel5);
        sPanel5.setLayout(sPanel5Layout);
        sPanel5Layout.setHorizontalGroup(
            sPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(sPanel5Layout.createSequentialGroup()
                .addGap(0, 23, Short.MAX_VALUE)
                .addComponent(sLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 23, Short.MAX_VALUE))
        );
        sPanel5Layout.setVerticalGroup(
            sPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(sPanel5Layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(sLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(0, 0, 0))
        );

        sPanel11.setCanHover(true);
        sPanel11.setHoverBackgroundColor(new java.awt.Color(245, 245, 245));
        sPanel11.setRadius(20);
        sPanel11.setRounded(true);
        sPanel11.setShadowColor(new java.awt.Color(230, 230, 230));
        sPanel11.setShadowOpacity(0.3F);
        sPanel11.setShadowSize(5);
        sPanel11.setShadowX(true);
        sPanel11.setShadowY(true);
        sPanel11.setPreferredSize(new java.awt.Dimension(109, 50));

        sLabel7.setForeground(new java.awt.Color(56, 56, 56));
        sLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        sLabel7.setText("Clear Filter");
        sLabel7.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        sLabel7.setIconTextGap(10);

        javax.swing.GroupLayout sPanel11Layout = new javax.swing.GroupLayout(sPanel11);
        sPanel11.setLayout(sPanel11Layout);
        sPanel11Layout.setHorizontalGroup(
            sPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, sPanel11Layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(sLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, 99, Short.MAX_VALUE)
                .addGap(0, 0, 0))
        );
        sPanel11Layout.setVerticalGroup(
            sPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(sPanel11Layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(sLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
                .addGap(0, 0, 0))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(sPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(15, 15, 15))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(sPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(sFilterTower1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(sFilterTower2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(sFilterTower3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(30, 30, 30)
                        .addComponent(sPanel11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(sTextFieldContainer1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(sTextFieldContainer1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(sPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(sFilterTower1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(sFilterTower2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(sFilterTower3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(sPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(sPanel11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(15, 15, 15))
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JLayeredPane jLayeredPane1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    public FrameSystem.Layers.Units.Components.LayerUnits layerUnitsLoading;
    public FrameSystem.Layers.Units.Components.LayerUnits layerUnitsOffline;
    public FrameSystem.Layers.Units.Components.LayerUnits layerUnitsOffline1;
    public FrameSystem.Layers.Units.Components.LayerUnits layerUnitsOnline;
    public FrameSystem.SLibrary.SComponents.SPanel objectUnitContainer;
    public FrameSystem.SLibrary.SComponents.SScrollPane objectUnitScrollPane;
    public FrameSystem.SLibrary.SComponents.SPanel objectUnitWrapper;
    private FrameSystem.SLibrary.SAnimated.SAnimatedOffline sAnimatedOffline1;
    private FrameSystem.SLibrary.SAnimated.SAnimatedOffline sAnimatedOffline4;
    public FrameSystem.SLibrary.SGenericComponents.SFilterTitlePanel sFilterTitlePanel1;
    public FrameSystem.SLibrary.SGenericComponents.SFilterTitlePanel sFilterTitlePanel2;
    public FrameSystem.SLibrary.SGenericComponents.SFilterTitlePanel sFilterTitlePanel3;
    public FrameSystem.SLibrary.SGenericComponents.SFilterTitlePanel sFilterTitlePanel4;
    public FrameSystem.SLibrary.SGenericComponents.SFilterTitlePanel sFilterTitlePanel5;
    public FrameSystem.SLibrary.SGenericComponents.SFilterTitlePanel sFilterTitlePanel7;
    public FrameSystem.SLibrary.SGenericComponents.SFilterTitlePanel sFilterTitlePanel8;
    public FrameSystem.SLibrary.SGenericComponents.SFilterTower sFilterTower1;
    public FrameSystem.SLibrary.SGenericComponents.SFilterTower sFilterTower2;
    public FrameSystem.SLibrary.SGenericComponents.SFilterTower sFilterTower3;
    private FrameSystem.SLibrary.SComponents.SLabel sLabel1;
    private FrameSystem.SLibrary.SComponents.SLabel sLabel2;
    private FrameSystem.SLibrary.SComponents.SLabel sLabel3;
    private FrameSystem.SLibrary.SComponents.SLabel sLabel5;
    private FrameSystem.SLibrary.SComponents.SLabel sLabel6;
    private FrameSystem.SLibrary.SComponents.SLabel sLabel7;
    private FrameSystem.SLibrary.SComponents.SPanel sPanel1;
    private FrameSystem.SLibrary.SComponents.SPanel sPanel10;
    public FrameSystem.SLibrary.SComponents.SPanel sPanel11;
    private FrameSystem.SLibrary.SComponents.SPanel sPanel12;
    private FrameSystem.SLibrary.SComponents.SPanel sPanel13;
    private FrameSystem.SLibrary.SComponents.SPanel sPanel14;
    private FrameSystem.SLibrary.SComponents.SPanel sPanel15;
    private FrameSystem.SLibrary.SComponents.SPanel sPanel2;
    private FrameSystem.SLibrary.SComponents.SPanel sPanel3;
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
