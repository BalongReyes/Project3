package FrameSystem.LayerFolder_Main.Layers.LayerFolder_Home.Layers.LayerFolder_Units.Module;

import FrameSystem.SLibrary.SComponents.SPanel;

public class ModuleUnits extends SPanel{

    public ModuleUnits(){
        initComponents();
        setOpaque(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        sPanel1 = new FrameSystem.SLibrary.SComponents.SPanel();
        sPanel2 = new FrameSystem.SLibrary.SComponents.SPanel();
        sPanel3 = new FrameSystem.SLibrary.SComponents.SPanel();
        sPanel4 = new FrameSystem.SLibrary.SComponents.SPanel();
        jLayeredPane1 = new javax.swing.JLayeredPane();
        layerUnitsOffline = new FrameSystem.LayerFolder_Main.Layers.LayerFolder_Home.Layers.LayerFolder_Units.Layers.LayerUnits();
        jPanel1 = new javax.swing.JPanel();
        sLabel2 = new FrameSystem.SLibrary.SComponents.SLabel();
        sAnimatedOffline1 = new FrameSystem.SLibrary.SAnimated.SAnimatedOffline();
        layerUnitsLoading = new FrameSystem.LayerFolder_Main.Layers.LayerFolder_Home.Layers.LayerFolder_Units.Layers.LayerUnits();
        jPanel2 = new javax.swing.JPanel();
        sLabel3 = new FrameSystem.SLibrary.SComponents.SLabel();
        sAnimatedOffline4 = new FrameSystem.SLibrary.SAnimated.SAnimatedOffline();
        layerUnitsOnline = new FrameSystem.LayerFolder_Main.Layers.LayerFolder_Home.Layers.LayerFolder_Units.Layers.LayerUnits();
        sFilterTower1 = new FrameSystem.SLibrary.SGenericComponents.SFilterTower();
        sFilterTower2 = new FrameSystem.SLibrary.SGenericComponents.SFilterTower();
        sFilterTower3 = new FrameSystem.SLibrary.SGenericComponents.SFilterTower();
        sPanelHover1 = new FrameSystem.SLibrary.SComponents.SPanelHover();
        sLabel1 = new FrameSystem.SLibrary.SComponents.SLabel();
        sPanelHover2 = new FrameSystem.SLibrary.SComponents.SPanelHover();
        sLabel4 = new FrameSystem.SLibrary.SComponents.SLabel();

        setBackground(new java.awt.Color(255, 247, 247));

        sPanel1.setBackground(new java.awt.Color(255, 255, 255));
        sPanel1.setRadius(20);
        sPanel1.setRounded(true);
        sPanel1.setShadowColor(new java.awt.Color(230, 230, 230));
        sPanel1.setShadowOpacity(0.3F);
        sPanel1.setShadowSize(5);
        sPanel1.setShadowX(true);
        sPanel1.setShadowY(true);

        sPanel2.setOpaque(false);

        sPanel3.setBackground(new java.awt.Color(240, 240, 240));
        sPanel3.setRadius(20);
        sPanel3.setRounded(true);
        sPanel3.setMinimumSize(new java.awt.Dimension(100, 40));
        sPanel3.setPreferredSize(new java.awt.Dimension(100, 40));

        javax.swing.GroupLayout sPanel3Layout = new javax.swing.GroupLayout(sPanel3);
        sPanel3.setLayout(sPanel3Layout);
        sPanel3Layout.setHorizontalGroup(
            sPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        sPanel3Layout.setVerticalGroup(
            sPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 40, Short.MAX_VALUE)
        );

        sPanel4.setOpaque(false);

        jLayeredPane1.setLayout(new java.awt.CardLayout());

        layerUnitsOffline.setName("Offline"); // NOI18N
        layerUnitsOffline.setOpaque(false);

        jPanel1.setOpaque(false);

        sLabel2.setForeground(new java.awt.Color(205, 64, 68));
        sLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        sLabel2.setText("Database Offline");
        sLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N

        sAnimatedOffline1.setLineColor(new java.awt.Color(205, 64, 68));
        sAnimatedOffline1.setLineWidth(5.0F);
        sAnimatedOffline1.setOpaque(false);
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

        layerUnitsLoading.setName("Loading"); // NOI18N
        layerUnitsLoading.setOpaque(false);

        jPanel2.setOpaque(false);

        sLabel3.setForeground(new java.awt.Color(255, 127, 127));
        sLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        sLabel3.setText("Loading");
        sLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N

        sAnimatedOffline4.setLineColor(new java.awt.Color(255, 127, 127));
        sAnimatedOffline4.setLineWidth(5.0F);
        sAnimatedOffline4.setOpaque(false);
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

        layerUnitsOnline.setName("Online"); // NOI18N
        layerUnitsOnline.setOpaque(false);

        javax.swing.GroupLayout layerUnitsOnlineLayout = new javax.swing.GroupLayout(layerUnitsOnline);
        layerUnitsOnline.setLayout(layerUnitsOnlineLayout);
        layerUnitsOnlineLayout.setHorizontalGroup(
            layerUnitsOnlineLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1024, Short.MAX_VALUE)
        );
        layerUnitsOnlineLayout.setVerticalGroup(
            layerUnitsOnlineLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 619, Short.MAX_VALUE)
        );

        jLayeredPane1.setLayer(layerUnitsOnline, javax.swing.JLayeredPane.PALETTE_LAYER);
        jLayeredPane1.add(layerUnitsOnline, "Online");

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
            .addComponent(sPanel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 1024, Short.MAX_VALUE)
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
        sFilterTower1.setActiveLineHeight(10);
        sFilterTower1.setInactiveForegroundColor(new java.awt.Color(56, 56, 56));
        sFilterTower1.setInactiveLineHeight(10);
        sFilterTower1.setText("Tower 1");
        sFilterTower1.setPreferredSize(new java.awt.Dimension(100, 50));

        sFilterTower2.setActiveForegroundColor(new java.awt.Color(255, 127, 127));
        sFilterTower2.setActiveLineHeight(10);
        sFilterTower2.setInactiveForegroundColor(new java.awt.Color(56, 56, 56));
        sFilterTower2.setInactiveLineHeight(10);
        sFilterTower2.setText("Tower 2");
        sFilterTower2.setPreferredSize(new java.awt.Dimension(100, 50));

        sFilterTower3.setActiveForegroundColor(new java.awt.Color(255, 127, 127));
        sFilterTower3.setActiveLineHeight(10);
        sFilterTower3.setInactiveForegroundColor(new java.awt.Color(56, 56, 56));
        sFilterTower3.setInactiveLineHeight(10);
        sFilterTower3.setText("Tower 3");
        sFilterTower3.setPreferredSize(new java.awt.Dimension(100, 50));

        sPanelHover1.setBackground(new java.awt.Color(255, 255, 255));
        sPanelHover1.setHoverBackgroundColor(new java.awt.Color(245, 245, 245));
        sPanelHover1.setRadius(20);
        sPanelHover1.setRounded(true);
        sPanelHover1.setShadowColor(new java.awt.Color(230, 230, 230));
        sPanelHover1.setShadowOpacity(0.3F);
        sPanelHover1.setShadowSize(5);
        sPanelHover1.setShadowX(true);
        sPanelHover1.setShadowY(true);
        sPanelHover1.setPreferredSize(new java.awt.Dimension(150, 10));

        sLabel1.setForeground(new java.awt.Color(56, 56, 56));
        sLabel1.setScaledIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/Menu/tower.png"))); // NOI18N
        sLabel1.setText("Filter Tower");
        sLabel1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        sLabel1.setIconTextGap(10);

        javax.swing.GroupLayout sPanelHover1Layout = new javax.swing.GroupLayout(sPanelHover1);
        sPanelHover1.setLayout(sPanelHover1Layout);
        sPanelHover1Layout.setHorizontalGroup(
            sPanelHover1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(sPanelHover1Layout.createSequentialGroup()
                .addGap(0, 23, Short.MAX_VALUE)
                .addComponent(sLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 23, Short.MAX_VALUE))
        );
        sPanelHover1Layout.setVerticalGroup(
            sPanelHover1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(sPanelHover1Layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(sLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(0, 0, 0))
        );

        sPanelHover2.setBackground(new java.awt.Color(255, 255, 255));
        sPanelHover2.setHoverBackgroundColor(new java.awt.Color(245, 245, 245));
        sPanelHover2.setRadius(20);
        sPanelHover2.setRounded(true);
        sPanelHover2.setShadowColor(new java.awt.Color(230, 230, 230));
        sPanelHover2.setShadowOpacity(0.3F);
        sPanelHover2.setShadowSize(5);
        sPanelHover2.setShadowX(true);
        sPanelHover2.setShadowY(true);
        sPanelHover2.setPreferredSize(new java.awt.Dimension(150, 10));

        sLabel4.setForeground(new java.awt.Color(56, 56, 56));
        sLabel4.setText("Clear Filter");
        sLabel4.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        sLabel4.setIconTextGap(10);

        javax.swing.GroupLayout sPanelHover2Layout = new javax.swing.GroupLayout(sPanelHover2);
        sPanelHover2.setLayout(sPanelHover2Layout);
        sPanelHover2Layout.setHorizontalGroup(
            sPanelHover2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(sPanelHover2Layout.createSequentialGroup()
                .addGap(0, 20, Short.MAX_VALUE)
                .addComponent(sLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 19, Short.MAX_VALUE))
        );
        sPanelHover2Layout.setVerticalGroup(
            sPanelHover2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(sPanelHover2Layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(sLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, 44, Short.MAX_VALUE)
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
                        .addGap(10, 10, 10))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(sPanelHover1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(sFilterTower1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(sFilterTower2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(sFilterTower3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(30, 30, 30)
                        .addComponent(sPanelHover2, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(90, 90, 90)
                .addComponent(sPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(sFilterTower1, javax.swing.GroupLayout.DEFAULT_SIZE, 54, Short.MAX_VALUE)
                        .addComponent(sFilterTower2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(sFilterTower3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(sPanelHover1, javax.swing.GroupLayout.DEFAULT_SIZE, 54, Short.MAX_VALUE))
                    .addComponent(sPanelHover2, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(15, 15, 15))
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JLayeredPane jLayeredPane1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    public FrameSystem.LayerFolder_Main.Layers.LayerFolder_Home.Layers.LayerFolder_Units.Layers.LayerUnits layerUnitsLoading;
    public FrameSystem.LayerFolder_Main.Layers.LayerFolder_Home.Layers.LayerFolder_Units.Layers.LayerUnits layerUnitsOffline;
    public FrameSystem.LayerFolder_Main.Layers.LayerFolder_Home.Layers.LayerFolder_Units.Layers.LayerUnits layerUnitsOnline;
    private FrameSystem.SLibrary.SAnimated.SAnimatedOffline sAnimatedOffline1;
    private FrameSystem.SLibrary.SAnimated.SAnimatedOffline sAnimatedOffline4;
    public FrameSystem.SLibrary.SGenericComponents.SFilterTower sFilterTower1;
    public FrameSystem.SLibrary.SGenericComponents.SFilterTower sFilterTower2;
    public FrameSystem.SLibrary.SGenericComponents.SFilterTower sFilterTower3;
    private FrameSystem.SLibrary.SComponents.SLabel sLabel1;
    private FrameSystem.SLibrary.SComponents.SLabel sLabel2;
    private FrameSystem.SLibrary.SComponents.SLabel sLabel3;
    private FrameSystem.SLibrary.SComponents.SLabel sLabel4;
    private FrameSystem.SLibrary.SComponents.SPanel sPanel1;
    private FrameSystem.SLibrary.SComponents.SPanel sPanel2;
    private FrameSystem.SLibrary.SComponents.SPanel sPanel3;
    private FrameSystem.SLibrary.SComponents.SPanel sPanel4;
    private FrameSystem.SLibrary.SComponents.SPanelHover sPanelHover1;
    public FrameSystem.SLibrary.SComponents.SPanelHover sPanelHover2;
    // End of variables declaration//GEN-END:variables
}
