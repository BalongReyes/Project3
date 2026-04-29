package FrameSystem.Layers.Tenants.Module;

import DatabaseSystem.UnitsData.UnitsDataTable;
import FrameSystem.SLibrary.SComponents.SPanel;

public class ModuleUnitTenants extends SPanel{

    public ModuleUnitTenants(){
        initComponents();
        setOpaque(false);
        setDoubleBuffered(true);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        sPanel21 = new FrameSystem.SLibrary.SComponents.SPanel();
        sPanel34 = new FrameSystem.SLibrary.SComponents.SPanel();
        sLabel38 = new FrameSystem.SLibrary.SComponents.SLabel();
        sPanel49 = new FrameSystem.SLibrary.SComponents.SPanel();
        sLabel37 = new FrameSystem.SLibrary.SComponents.SLabel();
        sPanel61 = new FrameSystem.SLibrary.SComponents.SPanel();
        sLabel31 = new FrameSystem.SLibrary.SComponents.SLabel();
        sTextFieldContainer1 = new FrameSystem.SLibrary.SGenericComponents.STextFieldContainer();
        sTextField1 = new FrameSystem.SLibrary.SComponents.STextField();
        sLabel1 = new FrameSystem.SLibrary.SComponents.SLabel();
        sPanel36 = new FrameSystem.SLibrary.SComponents.SPanel();
        sLabel19 = new FrameSystem.SLibrary.SComponents.SLabel();
        sPanel42 = new FrameSystem.SLibrary.SComponents.SPanel();
        sLabel20 = new FrameSystem.SLibrary.SComponents.SLabel();
        sPanel1 = new FrameSystem.SLibrary.SComponents.SPanel();
        jLayeredPane2 = new javax.swing.JLayeredPane();
        layerUnitTenantsData = new FrameSystem.Layers.Tenants.Components.LayerUnitTenants_Main();
        sPanel2 = new FrameSystem.SLibrary.SComponents.SPanel();
        sPanel3 = new FrameSystem.SLibrary.SComponents.SPanel();
        sPanel20 = new FrameSystem.SLibrary.SComponents.SPanel();
        filler6 = new javax.swing.Box.Filler(new java.awt.Dimension(25, 0), new java.awt.Dimension(25, 0), new java.awt.Dimension(25, 32767));
        sPanel7 = new FrameSystem.SLibrary.SComponents.SPanel();
        sFilterTitlePanel1 = new FrameSystem.SLibrary.SGenericComponents.SFilterTitlePanel();
        sPanel8 = new FrameSystem.SLibrary.SComponents.SPanel();
        sFilterTitlePanel2 = new FrameSystem.SLibrary.SGenericComponents.SFilterTitlePanel();
        sPanel9 = new FrameSystem.SLibrary.SComponents.SPanel();
        sFilterTitlePanel3 = new FrameSystem.SLibrary.SGenericComponents.SFilterTitlePanel();
        filler9 = new javax.swing.Box.Filler(new java.awt.Dimension(30, 0), new java.awt.Dimension(30, 0), new java.awt.Dimension(30, 32767));
        sPanel22 = new FrameSystem.SLibrary.SComponents.SPanel();
        sLabel21 = new FrameSystem.SLibrary.SComponents.SLabel();
        filler1 = new javax.swing.Box.Filler(new java.awt.Dimension(30, 0), new java.awt.Dimension(30, 0), new java.awt.Dimension(30, 32767));
        sPanel6 = new FrameSystem.SLibrary.SComponents.SPanel();
        sPanel29 = new FrameSystem.SLibrary.SComponents.SPanel();
        sFilterTitlePanel5 = new FrameSystem.SLibrary.SGenericComponents.SFilterTitlePanel();
        sPanel10 = new FrameSystem.SLibrary.SComponents.SPanel();
        sFilterTitlePanel6 = new FrameSystem.SLibrary.SGenericComponents.SFilterTitlePanel();
        sPanel12 = new FrameSystem.SLibrary.SComponents.SPanel();
        sFilterTitlePanel7 = new FrameSystem.SLibrary.SGenericComponents.SFilterTitlePanel();
        sPanel13 = new FrameSystem.SLibrary.SComponents.SPanel();
        sLabel17 = new FrameSystem.SLibrary.SComponents.SLabel();
        sPanel14 = new FrameSystem.SLibrary.SComponents.SPanel();
        sLabel18 = new FrameSystem.SLibrary.SComponents.SLabel();
        sPanel28 = new FrameSystem.SLibrary.SComponents.SPanel();
        sLabel22 = new FrameSystem.SLibrary.SComponents.SLabel();
        filler8 = new javax.swing.Box.Filler(new java.awt.Dimension(6, 0), new java.awt.Dimension(6, 0), new java.awt.Dimension(6, 32767));
        sPanel15 = new FrameSystem.SLibrary.SComponents.SPanel();
        sLabel6 = new FrameSystem.SLibrary.SComponents.SLabel();
        filler10 = new javax.swing.Box.Filler(new java.awt.Dimension(7, 0), new java.awt.Dimension(7, 0), new java.awt.Dimension(7, 32767));
        jLayeredPane1 = new javax.swing.JLayeredPane();
        layerUnitTenantsOffline = new FrameSystem.Layers.Tenants.Components.LayerUnitTenants();
        jPanel1 = new javax.swing.JPanel();
        sLabel2 = new FrameSystem.SLibrary.SComponents.SLabel();
        sAnimatedOffline1 = new FrameSystem.SLibrary.SAnimated.SAnimatedOffline();
        layerUnitTenantsLoading = new FrameSystem.Layers.Tenants.Components.LayerUnitTenants();
        jPanel2 = new javax.swing.JPanel();
        sLabel3 = new FrameSystem.SLibrary.SComponents.SLabel();
        sAnimatedOffline4 = new FrameSystem.SLibrary.SAnimated.SAnimatedOffline();
        layerUnitTenantsOnline = new FrameSystem.Layers.Tenants.Components.LayerUnitTenants();
        sTable1 = new FrameSystem.SLibrary.SComponents.STable();
        sPanel63 = new FrameSystem.SLibrary.SComponents.SPanel();
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
        sPanel46 = new FrameSystem.SLibrary.SComponents.SPanel();
        sLabel8 = new FrameSystem.SLibrary.SComponents.SLabel();
        jSpinner1 = new javax.swing.JSpinner();
        sPanel27 = new FrameSystem.SLibrary.SComponents.SPanel();
        sPanelPrevious = new FrameSystem.SLibrary.SComponents.SPanel();
        sPanel67 = new FrameSystem.SLibrary.SComponents.SPanel();
        sLabel9 = new FrameSystem.SLibrary.SComponents.SLabel();
        sPanel60 = new FrameSystem.SLibrary.SComponents.SPanel();
        sPanelPage1 = new FrameSystem.SLibrary.SComponents.SPanel();
        sLabel23 = new FrameSystem.SLibrary.SComponents.SLabel();
        sPanel62 = new FrameSystem.SLibrary.SComponents.SPanel();
        sPanelPage2 = new FrameSystem.SLibrary.SComponents.SPanel();
        sLabel39 = new FrameSystem.SLibrary.SComponents.SLabel();
        sPanel64 = new FrameSystem.SLibrary.SComponents.SPanel();
        sPanelPage3 = new FrameSystem.SLibrary.SComponents.SPanel();
        sLabel40 = new FrameSystem.SLibrary.SComponents.SLabel();
        sPanel65 = new FrameSystem.SLibrary.SComponents.SPanel();
        sPanelPage4 = new FrameSystem.SLibrary.SComponents.SPanel();
        sLabel41 = new FrameSystem.SLibrary.SComponents.SLabel();
        sPanel66 = new FrameSystem.SLibrary.SComponents.SPanel();
        sPanelPage5 = new FrameSystem.SLibrary.SComponents.SPanel();
        sLabel42 = new FrameSystem.SLibrary.SComponents.SLabel();
        sPanel74 = new FrameSystem.SLibrary.SComponents.SPanel();
        sPanelPage6 = new FrameSystem.SLibrary.SComponents.SPanel();
        sLabel43 = new FrameSystem.SLibrary.SComponents.SLabel();
        sPanel76 = new FrameSystem.SLibrary.SComponents.SPanel();
        sPanelPage7 = new FrameSystem.SLibrary.SComponents.SPanel();
        sLabel44 = new FrameSystem.SLibrary.SComponents.SLabel();
        sPanelNext = new FrameSystem.SLibrary.SComponents.SPanel();
        sPanel68 = new FrameSystem.SLibrary.SComponents.SPanel();
        sLabel12 = new FrameSystem.SLibrary.SComponents.SLabel();
        layerUnitTenantsMain = new FrameSystem.Layers.Tenants.Components.LayerUnitTenants_Main();

        sPanel21.setPaintBackground(false);
        sPanel21.setPreferredSize(new java.awt.Dimension(250, 0));
        sPanel21.setLayout(new javax.swing.BoxLayout(sPanel21, javax.swing.BoxLayout.PAGE_AXIS));

        sPanel34.setRadius(15);
        sPanel34.setRounded(true);
        sPanel34.setShadowColor(new java.awt.Color(230, 230, 230));
        sPanel34.setShadowOpacity(0.3F);
        sPanel34.setShadowSize(5);
        sPanel34.setShadowX(true);
        sPanel34.setShadowY(true);
        sPanel34.setPreferredSize(new java.awt.Dimension(250, 0));

        sLabel38.setForeground(new java.awt.Color(56, 56, 56));
        sLabel38.setText("Filters");
        sLabel38.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        sLabel38.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N

        javax.swing.GroupLayout sPanel34Layout = new javax.swing.GroupLayout(sPanel34);
        sPanel34.setLayout(sPanel34Layout);
        sPanel34Layout.setHorizontalGroup(
            sPanel34Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(sPanel34Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(sLabel38, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(161, 161, 161))
        );
        sPanel34Layout.setVerticalGroup(
            sPanel34Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(sPanel34Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(sLabel38, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(308, Short.MAX_VALUE))
        );

        sPanel21.add(sPanel34);

        sPanel49.setRadius(15);
        sPanel49.setRounded(true);
        sPanel49.setShadowColor(new java.awt.Color(230, 230, 230));
        sPanel49.setShadowOpacity(0.3F);
        sPanel49.setShadowSize(5);
        sPanel49.setShadowX(true);
        sPanel49.setShadowY(true);
        sPanel49.setPreferredSize(new java.awt.Dimension(250, 0));

        sLabel37.setForeground(new java.awt.Color(56, 56, 56));
        sLabel37.setText("Quick Actions");
        sLabel37.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        sLabel37.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N

        javax.swing.GroupLayout sPanel49Layout = new javax.swing.GroupLayout(sPanel49);
        sPanel49.setLayout(sPanel49Layout);
        sPanel49Layout.setHorizontalGroup(
            sPanel49Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(sPanel49Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(sLabel37, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(161, 161, 161))
        );
        sPanel49Layout.setVerticalGroup(
            sPanel49Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(sPanel49Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(sLabel37, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(308, Short.MAX_VALUE))
        );

        sPanel21.add(sPanel49);

        sPanel61.setRadius(15);
        sPanel61.setRounded(true);
        sPanel61.setShadowColor(new java.awt.Color(230, 230, 230));
        sPanel61.setShadowOpacity(0.3F);
        sPanel61.setShadowSize(5);
        sPanel61.setShadowX(true);
        sPanel61.setShadowY(true);
        sPanel61.setPreferredSize(new java.awt.Dimension(250, 0));

        sLabel31.setForeground(new java.awt.Color(56, 56, 56));
        sLabel31.setText("Recent Concerns");
        sLabel31.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        sLabel31.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N

        javax.swing.GroupLayout sPanel61Layout = new javax.swing.GroupLayout(sPanel61);
        sPanel61.setLayout(sPanel61Layout);
        sPanel61Layout.setHorizontalGroup(
            sPanel61Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(sPanel61Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(sLabel31, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(161, 161, 161))
        );
        sPanel61Layout.setVerticalGroup(
            sPanel61Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(sPanel61Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(sLabel31, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(308, Short.MAX_VALUE))
        );

        sPanel21.add(sPanel61);

        setPaintBackground(false);

        sTextFieldContainer1.setRadius(15);
        sTextFieldContainer1.setRounded(true);
        sTextFieldContainer1.setShadowColor(new java.awt.Color(230, 230, 230));
        sTextFieldContainer1.setShadowOpacity(0.3F);
        sTextFieldContainer1.setShadowSize(5);
        sTextFieldContainer1.setShadowX(true);
        sTextFieldContainer1.setShadowY(true);
        sTextFieldContainer1.setTextFieldChild(sTextField1);

        sTextField1.setBackground(new java.awt.Color(255, 255, 255));
        sTextField1.setHint("Search for tenants");
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

        sPanel36.setCanHover(true);
        sPanel36.setHoverBackgroundColor(new java.awt.Color(230, 230, 230));
        sPanel36.setRadius(15);
        sPanel36.setRounded(true);
        sPanel36.setShadowColor(new java.awt.Color(230, 230, 230));
        sPanel36.setShadowOpacity(0.3F);
        sPanel36.setShadowSize(5);
        sPanel36.setShadowX(true);
        sPanel36.setShadowY(true);
        sPanel36.setMaximumSize(new java.awt.Dimension(100, 32767));
        sPanel36.setMinimumSize(new java.awt.Dimension(100, 0));
        sPanel36.setPreferredSize(new java.awt.Dimension(100, 45));

        sLabel19.setForeground(new java.awt.Color(56, 56, 56));
        sLabel19.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        sLabel19.setIconSize(13);
        sLabel19.setScaledIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/moduleUnits/file.png"))); // NOI18N
        sLabel19.setText("Export");
        sLabel19.setIconTextGap(10);
        sLabel19.setMaximumSize(new java.awt.Dimension(69, 30));
        sLabel19.setMinimumSize(new java.awt.Dimension(69, 30));
        sLabel19.setPreferredSize(new java.awt.Dimension(69, 30));

        javax.swing.GroupLayout sPanel36Layout = new javax.swing.GroupLayout(sPanel36);
        sPanel36.setLayout(sPanel36Layout);
        sPanel36Layout.setHorizontalGroup(
            sPanel36Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, sPanel36Layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(sLabel19, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        sPanel36Layout.setVerticalGroup(
            sPanel36Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(sPanel36Layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(sLabel19, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE)
                .addGap(0, 0, 0))
        );

        sPanel42.setCanHover(true);
        sPanel42.setHoverBackgroundColor(new java.awt.Color(230, 230, 230));
        sPanel42.setRadius(15);
        sPanel42.setRounded(true);
        sPanel42.setShadowColor(new java.awt.Color(230, 230, 230));
        sPanel42.setShadowOpacity(0.3F);
        sPanel42.setShadowSize(5);
        sPanel42.setShadowX(true);
        sPanel42.setShadowY(true);
        sPanel42.setMaximumSize(new java.awt.Dimension(100, 32767));
        sPanel42.setMinimumSize(new java.awt.Dimension(100, 0));
        sPanel42.setPreferredSize(new java.awt.Dimension(100, 45));

        sLabel20.setForeground(new java.awt.Color(56, 56, 56));
        sLabel20.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        sLabel20.setIconSize(12);
        sLabel20.setScaledIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/moduleUnits/activity.png"))); // NOI18N
        sLabel20.setText("Activity Log");
        sLabel20.setIconTextGap(10);
        sLabel20.setMaximumSize(new java.awt.Dimension(69, 30));
        sLabel20.setMinimumSize(new java.awt.Dimension(69, 30));
        sLabel20.setPreferredSize(new java.awt.Dimension(69, 30));

        javax.swing.GroupLayout sPanel42Layout = new javax.swing.GroupLayout(sPanel42);
        sPanel42.setLayout(sPanel42Layout);
        sPanel42Layout.setHorizontalGroup(
            sPanel42Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, sPanel42Layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(sLabel20, javax.swing.GroupLayout.DEFAULT_SIZE, 113, Short.MAX_VALUE))
        );
        sPanel42Layout.setVerticalGroup(
            sPanel42Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(sPanel42Layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(sLabel20, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE)
                .addGap(0, 0, 0))
        );

        sPanel1.setBorderLine(1);
        sPanel1.setDefaultBorderColor(new java.awt.Color(240, 240, 240));
        sPanel1.setRadius(15);
        sPanel1.setRounded(true);
        sPanel1.setShadowColor(new java.awt.Color(230, 230, 230));
        sPanel1.setShadowOpacity(0.3F);
        sPanel1.setShadowSize(5);
        sPanel1.setShadowX(true);
        sPanel1.setShadowY(true);

        jLayeredPane2.setLayout(new java.awt.CardLayout());

        sPanel2.setBorderLine(1);
        sPanel2.setPaintBackground(false);

        sPanel3.setBorderLine(1);
        sPanel3.setBorderSideLeft(false);
        sPanel3.setBorderSideRight(false);
        sPanel3.setBorderSideTop(false);
        sPanel3.setDefaultBackgroundColor(new java.awt.Color(249, 249, 249));
        sPanel3.setDefaultBorderColor(new java.awt.Color(240, 240, 240));
        sPanel3.setRadius(15);
        sPanel3.setRoundBottomLeft(false);
        sPanel3.setRoundBottomRight(false);
        sPanel3.setRounded(true);
        sPanel3.setMinimumSize(new java.awt.Dimension(100, 40));
        sPanel3.setPreferredSize(new java.awt.Dimension(100, 40));

        sPanel20.setPaintBackground(false);
        sPanel20.setMinimumSize(new java.awt.Dimension(100, 40));
        sPanel20.setPreferredSize(new java.awt.Dimension(100, 40));
        sPanel20.setLayout(new javax.swing.BoxLayout(sPanel20, javax.swing.BoxLayout.LINE_AXIS));
        sPanel20.add(filler6);

        sPanel7.setPaintBackground(false);
        sPanel7.setMaximumSize(new java.awt.Dimension(70, 40));
        sPanel7.setMinimumSize(new java.awt.Dimension(70, 40));
        sPanel7.setPreferredSize(new java.awt.Dimension(70, 40));

        sFilterTitlePanel1.setArrowDirection(0);
        sFilterTitlePanel1.setCanHover(true);
        sFilterTitlePanel1.setDataIndex(UnitsDataTable.TOWER);
        sFilterTitlePanel1.setDefaultBackgroundColor(new java.awt.Color(249, 249, 249));
        sFilterTitlePanel1.setHoverBackgroundColor(new java.awt.Color(229, 229, 229));
        sFilterTitlePanel1.setRadius(7);
        sFilterTitlePanel1.setRounded(true);
        sFilterTitlePanel1.setText("Tower");

        javax.swing.GroupLayout sPanel7Layout = new javax.swing.GroupLayout(sPanel7);
        sPanel7.setLayout(sPanel7Layout);
        sPanel7Layout.setHorizontalGroup(
            sPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(sPanel7Layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(sFilterTitlePanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        sPanel7Layout.setVerticalGroup(
            sPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(sPanel7Layout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addComponent(sFilterTitlePanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(5, 5, 5))
        );

        sPanel20.add(sPanel7);

        sPanel8.setPaintBackground(false);
        sPanel8.setMaximumSize(new java.awt.Dimension(70, 40));
        sPanel8.setMinimumSize(new java.awt.Dimension(70, 40));
        sPanel8.setPreferredSize(new java.awt.Dimension(70, 40));

        sFilterTitlePanel2.setArrowDirection(0);
        sFilterTitlePanel2.setCanHover(true);
        sFilterTitlePanel2.setDataIndex(UnitsDataTable.FLOOR);
        sFilterTitlePanel2.setDefaultBackgroundColor(new java.awt.Color(249, 249, 249));
        sFilterTitlePanel2.setHoverBackgroundColor(new java.awt.Color(229, 229, 229));
        sFilterTitlePanel2.setRadius(7);
        sFilterTitlePanel2.setRounded(true);
        sFilterTitlePanel2.setText("Floor");

        javax.swing.GroupLayout sPanel8Layout = new javax.swing.GroupLayout(sPanel8);
        sPanel8.setLayout(sPanel8Layout);
        sPanel8Layout.setHorizontalGroup(
            sPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(sPanel8Layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(sFilterTitlePanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        sPanel8Layout.setVerticalGroup(
            sPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(sPanel8Layout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addComponent(sFilterTitlePanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(5, 5, 5))
        );

        sPanel20.add(sPanel8);

        sPanel9.setPaintBackground(false);
        sPanel9.setMaximumSize(new java.awt.Dimension(70, 40));
        sPanel9.setMinimumSize(new java.awt.Dimension(70, 40));
        sPanel9.setPreferredSize(new java.awt.Dimension(70, 40));

        sFilterTitlePanel3.setArrowDirection(0);
        sFilterTitlePanel3.setCanHover(true);
        sFilterTitlePanel3.setDataIndex(UnitsDataTable.UNIT);
        sFilterTitlePanel3.setDefaultBackgroundColor(new java.awt.Color(249, 249, 249));
        sFilterTitlePanel3.setHoverBackgroundColor(new java.awt.Color(229, 229, 229));
        sFilterTitlePanel3.setRadius(7);
        sFilterTitlePanel3.setRounded(true);
        sFilterTitlePanel3.setText("Unit");

        javax.swing.GroupLayout sPanel9Layout = new javax.swing.GroupLayout(sPanel9);
        sPanel9.setLayout(sPanel9Layout);
        sPanel9Layout.setHorizontalGroup(
            sPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(sPanel9Layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(sFilterTitlePanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        sPanel9Layout.setVerticalGroup(
            sPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(sPanel9Layout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addComponent(sFilterTitlePanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(5, 5, 5))
        );

        sPanel20.add(sPanel9);
        sPanel20.add(filler9);

        sPanel22.setPaintBackground(false);
        sPanel22.setMaximumSize(new java.awt.Dimension(80, 40));
        sPanel22.setMinimumSize(new java.awt.Dimension(80, 40));
        sPanel22.setPreferredSize(new java.awt.Dimension(80, 40));

        sLabel21.setForeground(new java.awt.Color(56, 56, 56));
        sLabel21.setText("Unit ID");

        javax.swing.GroupLayout sPanel22Layout = new javax.swing.GroupLayout(sPanel22);
        sPanel22.setLayout(sPanel22Layout);
        sPanel22Layout.setHorizontalGroup(
            sPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(sPanel22Layout.createSequentialGroup()
                .addComponent(sLabel21, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        sPanel22Layout.setVerticalGroup(
            sPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, sPanel22Layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(sLabel21, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(0, 0, 0))
        );

        sPanel20.add(sPanel22);
        sPanel20.add(filler1);

        sPanel6.setDefaultBackgroundColor(new java.awt.Color(255, 102, 102));
        sPanel6.setPaintBackground(false);
        sPanel6.setLayout(new java.awt.GridLayout(1, 6));

        sPanel29.setPaintBackground(false);

        sFilterTitlePanel5.setArrowDirection(0);
        sFilterTitlePanel5.setCanHover(true);
        sFilterTitlePanel5.setDataIndex(UnitsDataTable.ACCOUNT_NUMBER);
        sFilterTitlePanel5.setDefaultBackgroundColor(new java.awt.Color(249, 249, 249));
        sFilterTitlePanel5.setHoverBackgroundColor(new java.awt.Color(229, 229, 229));
        sFilterTitlePanel5.setRadius(7);
        sFilterTitlePanel5.setRounded(true);
        sFilterTitlePanel5.setText("Account Number");

        javax.swing.GroupLayout sPanel29Layout = new javax.swing.GroupLayout(sPanel29);
        sPanel29.setLayout(sPanel29Layout);
        sPanel29Layout.setHorizontalGroup(
            sPanel29Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(sPanel29Layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(sFilterTitlePanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        sPanel29Layout.setVerticalGroup(
            sPanel29Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(sPanel29Layout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addComponent(sFilterTitlePanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(5, 5, 5))
        );

        sPanel6.add(sPanel29);

        sPanel10.setPaintBackground(false);

        sFilterTitlePanel6.setArrowDirection(0);
        sFilterTitlePanel6.setCanHover(true);
        sFilterTitlePanel6.setDataIndex(UnitsDataTable.MODEL);
        sFilterTitlePanel6.setDefaultBackgroundColor(new java.awt.Color(249, 249, 249));
        sFilterTitlePanel6.setHoverBackgroundColor(new java.awt.Color(229, 229, 229));
        sFilterTitlePanel6.setRadius(7);
        sFilterTitlePanel6.setRounded(true);
        sFilterTitlePanel6.setText("Model");

        javax.swing.GroupLayout sPanel10Layout = new javax.swing.GroupLayout(sPanel10);
        sPanel10.setLayout(sPanel10Layout);
        sPanel10Layout.setHorizontalGroup(
            sPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(sPanel10Layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(sFilterTitlePanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        sPanel10Layout.setVerticalGroup(
            sPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(sPanel10Layout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addComponent(sFilterTitlePanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(5, 5, 5))
        );

        sPanel6.add(sPanel10);

        sPanel12.setPaintBackground(false);

        sFilterTitlePanel7.setArrowDirection(0);
        sFilterTitlePanel7.setCanHover(true);
        sFilterTitlePanel7.setDataIndex(UnitsDataTable.FLOOR_AREA);
        sFilterTitlePanel7.setDefaultBackgroundColor(new java.awt.Color(249, 249, 249));
        sFilterTitlePanel7.setHoverBackgroundColor(new java.awt.Color(229, 229, 229));
        sFilterTitlePanel7.setRadius(7);
        sFilterTitlePanel7.setRounded(true);
        sFilterTitlePanel7.setText("Floor Area");

        javax.swing.GroupLayout sPanel12Layout = new javax.swing.GroupLayout(sPanel12);
        sPanel12.setLayout(sPanel12Layout);
        sPanel12Layout.setHorizontalGroup(
            sPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(sPanel12Layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(sFilterTitlePanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        sPanel12Layout.setVerticalGroup(
            sPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(sPanel12Layout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addComponent(sFilterTitlePanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(5, 5, 5))
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
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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
                .addContainerGap(144, Short.MAX_VALUE))
        );
        sPanel14Layout.setVerticalGroup(
            sPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, sPanel14Layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(sLabel18, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(0, 0, 0))
        );

        sPanel6.add(sPanel14);

        sPanel28.setPaintBackground(false);

        sLabel22.setForeground(new java.awt.Color(56, 56, 56));
        sLabel22.setText("T.O. Date");

        javax.swing.GroupLayout sPanel28Layout = new javax.swing.GroupLayout(sPanel28);
        sPanel28.setLayout(sPanel28Layout);
        sPanel28Layout.setHorizontalGroup(
            sPanel28Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(sPanel28Layout.createSequentialGroup()
                .addComponent(sLabel22, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(154, Short.MAX_VALUE))
        );
        sPanel28Layout.setVerticalGroup(
            sPanel28Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, sPanel28Layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(sLabel22, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(0, 0, 0))
        );

        sPanel6.add(sPanel28);

        sPanel20.add(sPanel6);
        sPanel20.add(filler8);

        sPanel15.setDefaultBackgroundColor(new java.awt.Color(51, 255, 51));
        sPanel15.setPaintBackground(false);
        sPanel15.setMaximumSize(new java.awt.Dimension(90, 40));
        sPanel15.setMinimumSize(new java.awt.Dimension(90, 40));
        sPanel15.setPreferredSize(new java.awt.Dimension(90, 40));

        sLabel6.setForeground(new java.awt.Color(56, 56, 56));
        sLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        sLabel6.setText("Actions");
        sLabel6.setMaximumSize(new java.awt.Dimension(75, 40));
        sLabel6.setMinimumSize(new java.awt.Dimension(75, 40));
        sLabel6.setPreferredSize(new java.awt.Dimension(75, 40));

        javax.swing.GroupLayout sPanel15Layout = new javax.swing.GroupLayout(sPanel15);
        sPanel15.setLayout(sPanel15Layout);
        sPanel15Layout.setHorizontalGroup(
            sPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(sPanel15Layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(sLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(0, 0, 0))
        );
        sPanel15Layout.setVerticalGroup(
            sPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(sPanel15Layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(sLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(0, 0, 0))
        );

        sPanel20.add(sPanel15);
        sPanel20.add(filler10);

        javax.swing.GroupLayout sPanel3Layout = new javax.swing.GroupLayout(sPanel3);
        sPanel3.setLayout(sPanel3Layout);
        sPanel3Layout.setHorizontalGroup(
            sPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(sPanel3Layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(sPanel20, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(0, 0, 0))
        );
        sPanel3Layout.setVerticalGroup(
            sPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, sPanel3Layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(sPanel20, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout sPanel2Layout = new javax.swing.GroupLayout(sPanel2);
        sPanel2.setLayout(sPanel2Layout);
        sPanel2Layout.setHorizontalGroup(
            sPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, sPanel2Layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(sPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, 1687, Short.MAX_VALUE)
                .addGap(0, 0, 0))
        );
        sPanel2Layout.setVerticalGroup(
            sPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(sPanel2Layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(sPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLayeredPane1.setLayout(new java.awt.CardLayout());

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

        javax.swing.GroupLayout layerUnitTenantsOfflineLayout = new javax.swing.GroupLayout(layerUnitTenantsOffline);
        layerUnitTenantsOffline.setLayout(layerUnitTenantsOfflineLayout);
        layerUnitTenantsOfflineLayout.setHorizontalGroup(
            layerUnitTenantsOfflineLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layerUnitTenantsOfflineLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layerUnitTenantsOfflineLayout.setVerticalGroup(
            layerUnitTenantsOfflineLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layerUnitTenantsOfflineLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jLayeredPane1.add(layerUnitTenantsOffline, "card1");

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

        javax.swing.GroupLayout layerUnitTenantsLoadingLayout = new javax.swing.GroupLayout(layerUnitTenantsLoading);
        layerUnitTenantsLoading.setLayout(layerUnitTenantsLoadingLayout);
        layerUnitTenantsLoadingLayout.setHorizontalGroup(
            layerUnitTenantsLoadingLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layerUnitTenantsLoadingLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layerUnitTenantsLoadingLayout.setVerticalGroup(
            layerUnitTenantsLoadingLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layerUnitTenantsLoadingLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jLayeredPane1.setLayer(layerUnitTenantsLoading, javax.swing.JLayeredPane.PALETTE_LAYER);
        jLayeredPane1.add(layerUnitTenantsLoading, "card2");

        sTable1.setRowHeight(50);
        sTable1.setScrollbarBackgroundColor(new java.awt.Color(250, 250, 250));
        sTable1.setScrollbarColor(new java.awt.Color(155, 155, 155));

        javax.swing.GroupLayout layerUnitTenantsOnlineLayout = new javax.swing.GroupLayout(layerUnitTenantsOnline);
        layerUnitTenantsOnline.setLayout(layerUnitTenantsOnlineLayout);
        layerUnitTenantsOnlineLayout.setHorizontalGroup(
            layerUnitTenantsOnlineLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(sTable1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layerUnitTenantsOnlineLayout.setVerticalGroup(
            layerUnitTenantsOnlineLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layerUnitTenantsOnlineLayout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(sTable1, javax.swing.GroupLayout.DEFAULT_SIZE, 862, Short.MAX_VALUE)
                .addGap(0, 0, 0))
        );

        jLayeredPane1.setLayer(layerUnitTenantsOnline, javax.swing.JLayeredPane.PALETTE_LAYER);
        jLayeredPane1.add(layerUnitTenantsOnline, "card3");

        sPanel63.setBorderLine(1);
        sPanel63.setBorderSideBottom(false);
        sPanel63.setBorderSideLeft(false);
        sPanel63.setBorderSideRight(false);
        sPanel63.setDefaultBackgroundColor(new java.awt.Color(249, 249, 249));
        sPanel63.setDefaultBorderColor(new java.awt.Color(240, 240, 240));
        sPanel63.setRadius(15);
        sPanel63.setRoundTopLeft(false);
        sPanel63.setRoundTopRight(false);
        sPanel63.setRounded(true);
        sPanel63.setMinimumSize(new java.awt.Dimension(100, 35));
        sPanel63.setPreferredSize(new java.awt.Dimension(1437, 35));

        sPanel18.setPaintBackground(false);
        sPanel18.setShadowColor(new java.awt.Color(230, 230, 230));
        sPanel18.setMaximumSize(new java.awt.Dimension(0, 30));
        sPanel18.setMinimumSize(new java.awt.Dimension(0, 30));
        sPanel18.setPreferredSize(new java.awt.Dimension(0, 30));
        sPanel18.setLayout(new javax.swing.BoxLayout(sPanel18, javax.swing.BoxLayout.LINE_AXIS));

        sPanel32.setDefaultBackgroundColor(java.awt.Color.green);
        sPanel32.setPaintBackground(false);
        sPanel32.setMaximumSize(new java.awt.Dimension(90, 32767));
        sPanel32.setMinimumSize(new java.awt.Dimension(90, 0));
        sPanel32.setPreferredSize(new java.awt.Dimension(90, 30));

        filterTower1.setActiveBackgroundColor(new java.awt.Color(255, 230, 230));
        filterTower1.setActiveHoverBackgroundColor(new java.awt.Color(255, 220, 220));
        filterTower1.setBorderLine(1);
        filterTower1.setCanHover(true);
        filterTower1.setDefaultBorderColor(new java.awt.Color(221, 221, 221));
        filterTower1.setHoverBackgroundColor(new java.awt.Color(240, 240, 240));
        filterTower1.setRadius(7);
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
                .addComponent(filterTower1, javax.swing.GroupLayout.DEFAULT_SIZE, 27, Short.MAX_VALUE)
                .addGap(4, 4, 4))
        );

        sPanel18.add(sPanel32);

        sPanel30.setDefaultBackgroundColor(java.awt.Color.blue);
        sPanel30.setPaintBackground(false);
        sPanel30.setMaximumSize(new java.awt.Dimension(90, 32767));
        sPanel30.setMinimumSize(new java.awt.Dimension(90, 0));
        sPanel30.setPreferredSize(new java.awt.Dimension(90, 30));

        filterTower2.setActiveBackgroundColor(new java.awt.Color(255, 230, 230));
        filterTower2.setActiveHoverBackgroundColor(new java.awt.Color(255, 220, 220));
        filterTower2.setBorderLine(1);
        filterTower2.setCanHover(true);
        filterTower2.setDefaultBorderColor(new java.awt.Color(221, 221, 221));
        filterTower2.setHoverBackgroundColor(new java.awt.Color(240, 240, 240));
        filterTower2.setRadius(7);
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
        sPanel31.setMaximumSize(new java.awt.Dimension(90, 32767));
        sPanel31.setMinimumSize(new java.awt.Dimension(90, 0));
        sPanel31.setPreferredSize(new java.awt.Dimension(90, 30));

        filterTower3.setActiveBackgroundColor(new java.awt.Color(255, 230, 230));
        filterTower3.setActiveHoverBackgroundColor(new java.awt.Color(255, 220, 220));
        filterTower3.setBorderLine(1);
        filterTower3.setCanHover(true);
        filterTower3.setDefaultBorderColor(new java.awt.Color(221, 221, 221));
        filterTower3.setHoverBackgroundColor(new java.awt.Color(240, 240, 240));
        filterTower3.setRadius(7);
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

        sPanel46.setPaintBackground(false);
        sPanel46.setShadowColor(new java.awt.Color(230, 230, 230));
        sPanel46.setMaximumSize(new java.awt.Dimension(0, 30));
        sPanel46.setMinimumSize(new java.awt.Dimension(0, 30));

        sLabel8.setForeground(new java.awt.Color(56, 56, 56));
        sLabel8.setText("Rows per page:");

        jSpinner1.setOpaque(false);

        javax.swing.GroupLayout sPanel46Layout = new javax.swing.GroupLayout(sPanel46);
        sPanel46.setLayout(sPanel46Layout);
        sPanel46Layout.setHorizontalGroup(
            sPanel46Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(sPanel46Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(sLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSpinner1, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        sPanel46Layout.setVerticalGroup(
            sPanel46Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(sLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(sPanel46Layout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addComponent(jSpinner1)
                .addGap(5, 5, 5))
        );

        sPanel27.setPaintBackground(false);
        sPanel27.setShadowColor(new java.awt.Color(230, 230, 230));
        sPanel27.setMaximumSize(new java.awt.Dimension(0, 30));
        sPanel27.setMinimumSize(new java.awt.Dimension(0, 30));
        sPanel27.setPreferredSize(new java.awt.Dimension(0, 30));
        sPanel27.setLayout(new javax.swing.BoxLayout(sPanel27, javax.swing.BoxLayout.X_AXIS));

        sPanelPrevious.setPaintBackground(false);
        sPanelPrevious.setMaximumSize(new java.awt.Dimension(40, 35));
        sPanelPrevious.setMinimumSize(new java.awt.Dimension(40, 35));
        sPanelPrevious.setPreferredSize(new java.awt.Dimension(40, 35));

        sPanel67.setCanHover(true);
        sPanel67.setDefaultBackgroundColor(new java.awt.Color(249, 249, 249));
        sPanel67.setHoverBackgroundColor(new java.awt.Color(230, 230, 230));
        sPanel67.setRadius(15);
        sPanel67.setRounded(true);
        sPanel67.setMaximumSize(new java.awt.Dimension(25, 25));
        sPanel67.setMinimumSize(new java.awt.Dimension(25, 25));
        sPanel67.setPreferredSize(new java.awt.Dimension(25, 25));

        sLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        sLabel9.setIconSize(7);
        sLabel9.setScaledIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/moduleUnits/previousPage.png"))); // NOI18N

        javax.swing.GroupLayout sPanel67Layout = new javax.swing.GroupLayout(sPanel67);
        sPanel67.setLayout(sPanel67Layout);
        sPanel67Layout.setHorizontalGroup(
            sPanel67Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(sPanel67Layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(sLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, 25, Short.MAX_VALUE)
                .addGap(0, 0, 0))
        );
        sPanel67Layout.setVerticalGroup(
            sPanel67Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(sPanel67Layout.createSequentialGroup()
                .addComponent(sLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(0, 0, 0))
        );

        javax.swing.GroupLayout sPanelPreviousLayout = new javax.swing.GroupLayout(sPanelPrevious);
        sPanelPrevious.setLayout(sPanelPreviousLayout);
        sPanelPreviousLayout.setHorizontalGroup(
            sPanelPreviousLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(sPanelPreviousLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(sPanel67, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        sPanelPreviousLayout.setVerticalGroup(
            sPanelPreviousLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(sPanelPreviousLayout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addComponent(sPanel67, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(5, 5, 5))
        );

        sPanel27.add(sPanelPrevious);

        sPanel60.setPaintBackground(false);

        sPanelPage1.setActiveBackgroundColor(new java.awt.Color(230, 230, 230));
        sPanelPage1.setActiveHoverBackgroundColor(new java.awt.Color(230, 230, 230));
        sPanelPage1.setCanHover(true);
        sPanelPage1.setDefaultBackgroundColor(new java.awt.Color(249, 249, 249));
        sPanelPage1.setHoverBackgroundColor(new java.awt.Color(230, 230, 230));
        sPanelPage1.setRadius(15);
        sPanelPage1.setRounded(true);
        sPanelPage1.setMaximumSize(new java.awt.Dimension(25, 25));
        sPanelPage1.setMinimumSize(new java.awt.Dimension(25, 25));

        sLabel23.setForeground(new java.awt.Color(56, 56, 56));
        sLabel23.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        sLabel23.setIconSize(10);
        sLabel23.setText("?");
        sLabel23.setFont(new java.awt.Font("Segoe UI", 1, 10)); // NOI18N

        javax.swing.GroupLayout sPanelPage1Layout = new javax.swing.GroupLayout(sPanelPage1);
        sPanelPage1.setLayout(sPanelPage1Layout);
        sPanelPage1Layout.setHorizontalGroup(
            sPanelPage1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(sPanelPage1Layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(sLabel23, javax.swing.GroupLayout.DEFAULT_SIZE, 25, Short.MAX_VALUE)
                .addGap(0, 0, 0))
        );
        sPanelPage1Layout.setVerticalGroup(
            sPanelPage1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(sPanelPage1Layout.createSequentialGroup()
                .addComponent(sLabel23, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(0, 0, 0))
        );

        javax.swing.GroupLayout sPanel60Layout = new javax.swing.GroupLayout(sPanel60);
        sPanel60.setLayout(sPanel60Layout);
        sPanel60Layout.setHorizontalGroup(
            sPanel60Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(sPanel60Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(sPanelPage1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        sPanel60Layout.setVerticalGroup(
            sPanel60Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(sPanel60Layout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addComponent(sPanelPage1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(5, 5, 5))
        );

        sPanel27.add(sPanel60);

        sPanel62.setPaintBackground(false);

        sPanelPage2.setActiveBackgroundColor(new java.awt.Color(230, 230, 230));
        sPanelPage2.setActiveHoverBackgroundColor(new java.awt.Color(230, 230, 230));
        sPanelPage2.setCanHover(true);
        sPanelPage2.setDefaultBackgroundColor(new java.awt.Color(249, 249, 249));
        sPanelPage2.setHoverBackgroundColor(new java.awt.Color(230, 230, 230));
        sPanelPage2.setRadius(15);
        sPanelPage2.setRounded(true);
        sPanelPage2.setMaximumSize(new java.awt.Dimension(25, 25));
        sPanelPage2.setMinimumSize(new java.awt.Dimension(25, 25));

        sLabel39.setForeground(new java.awt.Color(56, 56, 56));
        sLabel39.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        sLabel39.setIconSize(10);
        sLabel39.setText("?");
        sLabel39.setFont(new java.awt.Font("Segoe UI", 1, 10)); // NOI18N

        javax.swing.GroupLayout sPanelPage2Layout = new javax.swing.GroupLayout(sPanelPage2);
        sPanelPage2.setLayout(sPanelPage2Layout);
        sPanelPage2Layout.setHorizontalGroup(
            sPanelPage2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(sPanelPage2Layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(sLabel39, javax.swing.GroupLayout.DEFAULT_SIZE, 25, Short.MAX_VALUE)
                .addGap(0, 0, 0))
        );
        sPanelPage2Layout.setVerticalGroup(
            sPanelPage2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(sPanelPage2Layout.createSequentialGroup()
                .addComponent(sLabel39, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(0, 0, 0))
        );

        javax.swing.GroupLayout sPanel62Layout = new javax.swing.GroupLayout(sPanel62);
        sPanel62.setLayout(sPanel62Layout);
        sPanel62Layout.setHorizontalGroup(
            sPanel62Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(sPanel62Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(sPanelPage2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        sPanel62Layout.setVerticalGroup(
            sPanel62Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(sPanel62Layout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addComponent(sPanelPage2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(5, 5, 5))
        );

        sPanel27.add(sPanel62);

        sPanel64.setPaintBackground(false);

        sPanelPage3.setActiveBackgroundColor(new java.awt.Color(230, 230, 230));
        sPanelPage3.setActiveHoverBackgroundColor(new java.awt.Color(230, 230, 230));
        sPanelPage3.setCanHover(true);
        sPanelPage3.setDefaultBackgroundColor(new java.awt.Color(249, 249, 249));
        sPanelPage3.setHoverBackgroundColor(new java.awt.Color(230, 230, 230));
        sPanelPage3.setRadius(15);
        sPanelPage3.setRounded(true);
        sPanelPage3.setMaximumSize(new java.awt.Dimension(25, 25));
        sPanelPage3.setMinimumSize(new java.awt.Dimension(25, 25));

        sLabel40.setForeground(new java.awt.Color(56, 56, 56));
        sLabel40.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        sLabel40.setIconSize(10);
        sLabel40.setText("?");
        sLabel40.setFont(new java.awt.Font("Segoe UI", 1, 10)); // NOI18N

        javax.swing.GroupLayout sPanelPage3Layout = new javax.swing.GroupLayout(sPanelPage3);
        sPanelPage3.setLayout(sPanelPage3Layout);
        sPanelPage3Layout.setHorizontalGroup(
            sPanelPage3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(sPanelPage3Layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(sLabel40, javax.swing.GroupLayout.DEFAULT_SIZE, 25, Short.MAX_VALUE)
                .addGap(0, 0, 0))
        );
        sPanelPage3Layout.setVerticalGroup(
            sPanelPage3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(sPanelPage3Layout.createSequentialGroup()
                .addComponent(sLabel40, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(0, 0, 0))
        );

        javax.swing.GroupLayout sPanel64Layout = new javax.swing.GroupLayout(sPanel64);
        sPanel64.setLayout(sPanel64Layout);
        sPanel64Layout.setHorizontalGroup(
            sPanel64Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(sPanel64Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(sPanelPage3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        sPanel64Layout.setVerticalGroup(
            sPanel64Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(sPanel64Layout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addComponent(sPanelPage3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(5, 5, 5))
        );

        sPanel27.add(sPanel64);

        sPanel65.setPaintBackground(false);

        sPanelPage4.setActiveBackgroundColor(new java.awt.Color(230, 230, 230));
        sPanelPage4.setActiveHoverBackgroundColor(new java.awt.Color(230, 230, 230));
        sPanelPage4.setCanHover(true);
        sPanelPage4.setDefaultBackgroundColor(new java.awt.Color(249, 249, 249));
        sPanelPage4.setHoverBackgroundColor(new java.awt.Color(230, 230, 230));
        sPanelPage4.setRadius(15);
        sPanelPage4.setRounded(true);
        sPanelPage4.setMaximumSize(new java.awt.Dimension(25, 25));
        sPanelPage4.setMinimumSize(new java.awt.Dimension(25, 25));

        sLabel41.setForeground(new java.awt.Color(56, 56, 56));
        sLabel41.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        sLabel41.setIconSize(10);
        sLabel41.setText("?");
        sLabel41.setFont(new java.awt.Font("Segoe UI", 1, 10)); // NOI18N

        javax.swing.GroupLayout sPanelPage4Layout = new javax.swing.GroupLayout(sPanelPage4);
        sPanelPage4.setLayout(sPanelPage4Layout);
        sPanelPage4Layout.setHorizontalGroup(
            sPanelPage4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(sPanelPage4Layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(sLabel41, javax.swing.GroupLayout.DEFAULT_SIZE, 25, Short.MAX_VALUE)
                .addGap(0, 0, 0))
        );
        sPanelPage4Layout.setVerticalGroup(
            sPanelPage4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(sPanelPage4Layout.createSequentialGroup()
                .addComponent(sLabel41, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(0, 0, 0))
        );

        javax.swing.GroupLayout sPanel65Layout = new javax.swing.GroupLayout(sPanel65);
        sPanel65.setLayout(sPanel65Layout);
        sPanel65Layout.setHorizontalGroup(
            sPanel65Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(sPanel65Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(sPanelPage4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        sPanel65Layout.setVerticalGroup(
            sPanel65Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(sPanel65Layout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addComponent(sPanelPage4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(5, 5, 5))
        );

        sPanel27.add(sPanel65);

        sPanel66.setPaintBackground(false);

        sPanelPage5.setActiveBackgroundColor(new java.awt.Color(230, 230, 230));
        sPanelPage5.setActiveHoverBackgroundColor(new java.awt.Color(230, 230, 230));
        sPanelPage5.setCanHover(true);
        sPanelPage5.setDefaultBackgroundColor(new java.awt.Color(249, 249, 249));
        sPanelPage5.setHoverBackgroundColor(new java.awt.Color(230, 230, 230));
        sPanelPage5.setRadius(15);
        sPanelPage5.setRounded(true);
        sPanelPage5.setMaximumSize(new java.awt.Dimension(25, 25));
        sPanelPage5.setMinimumSize(new java.awt.Dimension(25, 25));

        sLabel42.setForeground(new java.awt.Color(56, 56, 56));
        sLabel42.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        sLabel42.setIconSize(10);
        sLabel42.setText("?");
        sLabel42.setFont(new java.awt.Font("Segoe UI", 1, 10)); // NOI18N

        javax.swing.GroupLayout sPanelPage5Layout = new javax.swing.GroupLayout(sPanelPage5);
        sPanelPage5.setLayout(sPanelPage5Layout);
        sPanelPage5Layout.setHorizontalGroup(
            sPanelPage5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(sPanelPage5Layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(sLabel42, javax.swing.GroupLayout.DEFAULT_SIZE, 25, Short.MAX_VALUE)
                .addGap(0, 0, 0))
        );
        sPanelPage5Layout.setVerticalGroup(
            sPanelPage5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(sPanelPage5Layout.createSequentialGroup()
                .addComponent(sLabel42, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(0, 0, 0))
        );

        javax.swing.GroupLayout sPanel66Layout = new javax.swing.GroupLayout(sPanel66);
        sPanel66.setLayout(sPanel66Layout);
        sPanel66Layout.setHorizontalGroup(
            sPanel66Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(sPanel66Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(sPanelPage5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        sPanel66Layout.setVerticalGroup(
            sPanel66Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(sPanel66Layout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addComponent(sPanelPage5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(5, 5, 5))
        );

        sPanel27.add(sPanel66);

        sPanel74.setPaintBackground(false);

        sPanelPage6.setActiveBackgroundColor(new java.awt.Color(230, 230, 230));
        sPanelPage6.setActiveHoverBackgroundColor(new java.awt.Color(230, 230, 230));
        sPanelPage6.setCanHover(true);
        sPanelPage6.setDefaultBackgroundColor(new java.awt.Color(249, 249, 249));
        sPanelPage6.setHoverBackgroundColor(new java.awt.Color(230, 230, 230));
        sPanelPage6.setRadius(15);
        sPanelPage6.setRounded(true);
        sPanelPage6.setMaximumSize(new java.awt.Dimension(25, 25));
        sPanelPage6.setMinimumSize(new java.awt.Dimension(25, 25));

        sLabel43.setForeground(new java.awt.Color(56, 56, 56));
        sLabel43.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        sLabel43.setIconSize(10);
        sLabel43.setText("?");
        sLabel43.setFont(new java.awt.Font("Segoe UI", 1, 10)); // NOI18N

        javax.swing.GroupLayout sPanelPage6Layout = new javax.swing.GroupLayout(sPanelPage6);
        sPanelPage6.setLayout(sPanelPage6Layout);
        sPanelPage6Layout.setHorizontalGroup(
            sPanelPage6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(sPanelPage6Layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(sLabel43, javax.swing.GroupLayout.DEFAULT_SIZE, 25, Short.MAX_VALUE)
                .addGap(0, 0, 0))
        );
        sPanelPage6Layout.setVerticalGroup(
            sPanelPage6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(sPanelPage6Layout.createSequentialGroup()
                .addComponent(sLabel43, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(0, 0, 0))
        );

        javax.swing.GroupLayout sPanel74Layout = new javax.swing.GroupLayout(sPanel74);
        sPanel74.setLayout(sPanel74Layout);
        sPanel74Layout.setHorizontalGroup(
            sPanel74Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(sPanel74Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(sPanelPage6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        sPanel74Layout.setVerticalGroup(
            sPanel74Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(sPanel74Layout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addComponent(sPanelPage6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(5, 5, 5))
        );

        sPanel27.add(sPanel74);

        sPanel76.setPaintBackground(false);

        sPanelPage7.setActiveBackgroundColor(new java.awt.Color(230, 230, 230));
        sPanelPage7.setActiveHoverBackgroundColor(new java.awt.Color(230, 230, 230));
        sPanelPage7.setCanHover(true);
        sPanelPage7.setDefaultBackgroundColor(new java.awt.Color(249, 249, 249));
        sPanelPage7.setHoverBackgroundColor(new java.awt.Color(230, 230, 230));
        sPanelPage7.setRadius(15);
        sPanelPage7.setRounded(true);
        sPanelPage7.setMaximumSize(new java.awt.Dimension(25, 25));
        sPanelPage7.setMinimumSize(new java.awt.Dimension(25, 25));

        sLabel44.setForeground(new java.awt.Color(56, 56, 56));
        sLabel44.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        sLabel44.setIconSize(10);
        sLabel44.setText("?");
        sLabel44.setFont(new java.awt.Font("Segoe UI", 1, 10)); // NOI18N

        javax.swing.GroupLayout sPanelPage7Layout = new javax.swing.GroupLayout(sPanelPage7);
        sPanelPage7.setLayout(sPanelPage7Layout);
        sPanelPage7Layout.setHorizontalGroup(
            sPanelPage7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(sPanelPage7Layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(sLabel44, javax.swing.GroupLayout.DEFAULT_SIZE, 25, Short.MAX_VALUE)
                .addGap(0, 0, 0))
        );
        sPanelPage7Layout.setVerticalGroup(
            sPanelPage7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(sPanelPage7Layout.createSequentialGroup()
                .addComponent(sLabel44, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(0, 0, 0))
        );

        javax.swing.GroupLayout sPanel76Layout = new javax.swing.GroupLayout(sPanel76);
        sPanel76.setLayout(sPanel76Layout);
        sPanel76Layout.setHorizontalGroup(
            sPanel76Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(sPanel76Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(sPanelPage7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        sPanel76Layout.setVerticalGroup(
            sPanel76Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(sPanel76Layout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addComponent(sPanelPage7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(5, 5, 5))
        );

        sPanel27.add(sPanel76);

        sPanelNext.setPaintBackground(false);
        sPanelNext.setMaximumSize(new java.awt.Dimension(40, 35));
        sPanelNext.setMinimumSize(new java.awt.Dimension(40, 35));
        sPanelNext.setPreferredSize(new java.awt.Dimension(40, 35));

        sPanel68.setCanHover(true);
        sPanel68.setDefaultBackgroundColor(new java.awt.Color(249, 249, 249));
        sPanel68.setHoverBackgroundColor(new java.awt.Color(230, 230, 230));
        sPanel68.setRadius(15);
        sPanel68.setRounded(true);
        sPanel68.setMaximumSize(new java.awt.Dimension(25, 25));
        sPanel68.setMinimumSize(new java.awt.Dimension(25, 25));

        sLabel12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        sLabel12.setIconSize(7);
        sLabel12.setScaledIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/moduleUnits/nextPage.png"))); // NOI18N

        javax.swing.GroupLayout sPanel68Layout = new javax.swing.GroupLayout(sPanel68);
        sPanel68.setLayout(sPanel68Layout);
        sPanel68Layout.setHorizontalGroup(
            sPanel68Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(sPanel68Layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(sLabel12, javax.swing.GroupLayout.DEFAULT_SIZE, 25, Short.MAX_VALUE)
                .addGap(0, 0, 0))
        );
        sPanel68Layout.setVerticalGroup(
            sPanel68Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(sPanel68Layout.createSequentialGroup()
                .addComponent(sLabel12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(0, 0, 0))
        );

        javax.swing.GroupLayout sPanelNextLayout = new javax.swing.GroupLayout(sPanelNext);
        sPanelNext.setLayout(sPanelNextLayout);
        sPanelNextLayout.setHorizontalGroup(
            sPanelNextLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(sPanelNextLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(sPanel68, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        sPanelNextLayout.setVerticalGroup(
            sPanelNextLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(sPanelNextLayout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addComponent(sPanel68, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(5, 5, 5))
        );

        sPanel27.add(sPanelNext);

        javax.swing.GroupLayout sPanel63Layout = new javax.swing.GroupLayout(sPanel63);
        sPanel63.setLayout(sPanel63Layout);
        sPanel63Layout.setHorizontalGroup(
            sPanel63Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(sPanel63Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(sPanel18, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(sPanel46, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(sPanel27, javax.swing.GroupLayout.PREFERRED_SIZE, 298, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15))
        );
        sPanel63Layout.setVerticalGroup(
            sPanel63Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(sPanel18, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE)
            .addComponent(sPanel46, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(sPanel27, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layerUnitTenantsDataLayout = new javax.swing.GroupLayout(layerUnitTenantsData);
        layerUnitTenantsData.setLayout(layerUnitTenantsDataLayout);
        layerUnitTenantsDataLayout.setHorizontalGroup(
            layerUnitTenantsDataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(sPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jLayeredPane1)
            .addComponent(sPanel63, javax.swing.GroupLayout.DEFAULT_SIZE, 1687, Short.MAX_VALUE)
        );
        layerUnitTenantsDataLayout.setVerticalGroup(
            layerUnitTenantsDataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layerUnitTenantsDataLayout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(sPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jLayeredPane1)
                .addGap(0, 0, 0)
                .addComponent(sPanel63, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0))
        );

        jLayeredPane2.add(layerUnitTenantsData, "card6");

        javax.swing.GroupLayout layerUnitTenantsMainLayout = new javax.swing.GroupLayout(layerUnitTenantsMain);
        layerUnitTenantsMain.setLayout(layerUnitTenantsMainLayout);
        layerUnitTenantsMainLayout.setHorizontalGroup(
            layerUnitTenantsMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1687, Short.MAX_VALUE)
        );
        layerUnitTenantsMainLayout.setVerticalGroup(
            layerUnitTenantsMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 937, Short.MAX_VALUE)
        );

        jLayeredPane2.setLayer(layerUnitTenantsMain, javax.swing.JLayeredPane.PALETTE_LAYER);
        jLayeredPane2.add(layerUnitTenantsMain, "card7");

        javax.swing.GroupLayout sPanel1Layout = new javax.swing.GroupLayout(sPanel1);
        sPanel1.setLayout(sPanel1Layout);
        sPanel1Layout.setHorizontalGroup(
            sPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(sPanel1Layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(jLayeredPane2)
                .addGap(0, 0, 0))
        );
        sPanel1Layout.setVerticalGroup(
            sPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, sPanel1Layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(jLayeredPane2)
                .addGap(0, 0, 0))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(sPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(sTextFieldContainer1, javax.swing.GroupLayout.PREFERRED_SIZE, 349, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(sPanel36, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, 0)
                                .addComponent(sPanel42, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGap(15, 15, 15))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(sTextFieldContainer1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(sPanel36, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(sPanel42, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(5, 5, 5)
                .addComponent(sPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(10, 10, 10))
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.Box.Filler filler1;
    private javax.swing.Box.Filler filler10;
    private javax.swing.Box.Filler filler6;
    private javax.swing.Box.Filler filler8;
    private javax.swing.Box.Filler filler9;
    public FrameSystem.SLibrary.SComponents.SPanel filterTower1;
    public FrameSystem.SLibrary.SComponents.SPanel filterTower2;
    public FrameSystem.SLibrary.SComponents.SPanel filterTower3;
    public javax.swing.JLayeredPane jLayeredPane1;
    public javax.swing.JLayeredPane jLayeredPane2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    public javax.swing.JSpinner jSpinner1;
    private FrameSystem.Layers.Tenants.Components.LayerUnitTenants_Main layerUnitTenantsData;
    private FrameSystem.Layers.Tenants.Components.LayerUnitTenants layerUnitTenantsLoading;
    private FrameSystem.Layers.Tenants.Components.LayerUnitTenants_Main layerUnitTenantsMain;
    private FrameSystem.Layers.Tenants.Components.LayerUnitTenants layerUnitTenantsOffline;
    private FrameSystem.Layers.Tenants.Components.LayerUnitTenants layerUnitTenantsOnline;
    private FrameSystem.SLibrary.SAnimated.SAnimatedOffline sAnimatedOffline1;
    private FrameSystem.SLibrary.SAnimated.SAnimatedOffline sAnimatedOffline4;
    public FrameSystem.SLibrary.SGenericComponents.SFilterTitlePanel sFilterTitlePanel1;
    public FrameSystem.SLibrary.SGenericComponents.SFilterTitlePanel sFilterTitlePanel2;
    public FrameSystem.SLibrary.SGenericComponents.SFilterTitlePanel sFilterTitlePanel3;
    public FrameSystem.SLibrary.SGenericComponents.SFilterTitlePanel sFilterTitlePanel5;
    public FrameSystem.SLibrary.SGenericComponents.SFilterTitlePanel sFilterTitlePanel6;
    public FrameSystem.SLibrary.SGenericComponents.SFilterTitlePanel sFilterTitlePanel7;
    private FrameSystem.SLibrary.SComponents.SLabel sLabel1;
    private FrameSystem.SLibrary.SComponents.SLabel sLabel10;
    private FrameSystem.SLibrary.SComponents.SLabel sLabel11;
    private FrameSystem.SLibrary.SComponents.SLabel sLabel12;
    private FrameSystem.SLibrary.SComponents.SLabel sLabel17;
    private FrameSystem.SLibrary.SComponents.SLabel sLabel18;
    private FrameSystem.SLibrary.SComponents.SLabel sLabel19;
    private FrameSystem.SLibrary.SComponents.SLabel sLabel2;
    private FrameSystem.SLibrary.SComponents.SLabel sLabel20;
    private FrameSystem.SLibrary.SComponents.SLabel sLabel21;
    private FrameSystem.SLibrary.SComponents.SLabel sLabel22;
    private FrameSystem.SLibrary.SComponents.SLabel sLabel23;
    private FrameSystem.SLibrary.SComponents.SLabel sLabel3;
    private FrameSystem.SLibrary.SComponents.SLabel sLabel31;
    private FrameSystem.SLibrary.SComponents.SLabel sLabel37;
    private FrameSystem.SLibrary.SComponents.SLabel sLabel38;
    private FrameSystem.SLibrary.SComponents.SLabel sLabel39;
    private FrameSystem.SLibrary.SComponents.SLabel sLabel4;
    private FrameSystem.SLibrary.SComponents.SLabel sLabel40;
    private FrameSystem.SLibrary.SComponents.SLabel sLabel41;
    private FrameSystem.SLibrary.SComponents.SLabel sLabel42;
    private FrameSystem.SLibrary.SComponents.SLabel sLabel43;
    private FrameSystem.SLibrary.SComponents.SLabel sLabel44;
    private FrameSystem.SLibrary.SComponents.SLabel sLabel6;
    private FrameSystem.SLibrary.SComponents.SLabel sLabel8;
    private FrameSystem.SLibrary.SComponents.SLabel sLabel9;
    private FrameSystem.SLibrary.SComponents.SPanel sPanel1;
    private FrameSystem.SLibrary.SComponents.SPanel sPanel10;
    private FrameSystem.SLibrary.SComponents.SPanel sPanel12;
    private FrameSystem.SLibrary.SComponents.SPanel sPanel13;
    private FrameSystem.SLibrary.SComponents.SPanel sPanel14;
    private FrameSystem.SLibrary.SComponents.SPanel sPanel15;
    private FrameSystem.SLibrary.SComponents.SPanel sPanel18;
    private FrameSystem.SLibrary.SComponents.SPanel sPanel2;
    private FrameSystem.SLibrary.SComponents.SPanel sPanel20;
    private FrameSystem.SLibrary.SComponents.SPanel sPanel21;
    private FrameSystem.SLibrary.SComponents.SPanel sPanel22;
    private FrameSystem.SLibrary.SComponents.SPanel sPanel27;
    private FrameSystem.SLibrary.SComponents.SPanel sPanel28;
    private FrameSystem.SLibrary.SComponents.SPanel sPanel29;
    private FrameSystem.SLibrary.SComponents.SPanel sPanel3;
    private FrameSystem.SLibrary.SComponents.SPanel sPanel30;
    private FrameSystem.SLibrary.SComponents.SPanel sPanel31;
    private FrameSystem.SLibrary.SComponents.SPanel sPanel32;
    private FrameSystem.SLibrary.SComponents.SPanel sPanel34;
    private FrameSystem.SLibrary.SComponents.SPanel sPanel36;
    private FrameSystem.SLibrary.SComponents.SPanel sPanel42;
    private FrameSystem.SLibrary.SComponents.SPanel sPanel46;
    private FrameSystem.SLibrary.SComponents.SPanel sPanel49;
    private FrameSystem.SLibrary.SComponents.SPanel sPanel6;
    public FrameSystem.SLibrary.SComponents.SPanel sPanel60;
    private FrameSystem.SLibrary.SComponents.SPanel sPanel61;
    public FrameSystem.SLibrary.SComponents.SPanel sPanel62;
    private FrameSystem.SLibrary.SComponents.SPanel sPanel63;
    public FrameSystem.SLibrary.SComponents.SPanel sPanel64;
    public FrameSystem.SLibrary.SComponents.SPanel sPanel65;
    public FrameSystem.SLibrary.SComponents.SPanel sPanel66;
    public FrameSystem.SLibrary.SComponents.SPanel sPanel67;
    public FrameSystem.SLibrary.SComponents.SPanel sPanel68;
    private FrameSystem.SLibrary.SComponents.SPanel sPanel7;
    public FrameSystem.SLibrary.SComponents.SPanel sPanel74;
    public FrameSystem.SLibrary.SComponents.SPanel sPanel76;
    private FrameSystem.SLibrary.SComponents.SPanel sPanel8;
    private FrameSystem.SLibrary.SComponents.SPanel sPanel9;
    private FrameSystem.SLibrary.SComponents.SPanel sPanelNext;
    public FrameSystem.SLibrary.SComponents.SPanel sPanelPage1;
    public FrameSystem.SLibrary.SComponents.SPanel sPanelPage2;
    public FrameSystem.SLibrary.SComponents.SPanel sPanelPage3;
    public FrameSystem.SLibrary.SComponents.SPanel sPanelPage4;
    public FrameSystem.SLibrary.SComponents.SPanel sPanelPage5;
    public FrameSystem.SLibrary.SComponents.SPanel sPanelPage6;
    public FrameSystem.SLibrary.SComponents.SPanel sPanelPage7;
    private FrameSystem.SLibrary.SComponents.SPanel sPanelPrevious;
    public FrameSystem.SLibrary.SComponents.STable sTable1;
    public FrameSystem.SLibrary.SComponents.STextField sTextField1;
    private FrameSystem.SLibrary.SGenericComponents.STextFieldContainer sTextFieldContainer1;
    // End of variables declaration//GEN-END:variables
}
