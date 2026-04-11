package MainSystem;

import java.awt.KeyboardFocusManager;
import java.awt.event.KeyEvent;
import java.sql.SQLException;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.Timer;

import ConsoleSystem.Console;
import ConsoleSystem.ConsoleColors;
import DatabaseSystem.Database;
import EventSystem.Interface.ReconnectExecute;
import FrameSystem.Layers.Main.Components.LayerMain;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutionException;
import javax.swing.SwingUtilities;
import javax.swing.SwingWorker;

public class SFrame extends JFrame {

    public SFrame() {
        initComponents();
        setIconImage(new ImageIcon(getClass().getResource("/Icons/main.png")).getImage());

        setLocationRelativeTo(null);
        setExtendedState(this.getExtendedState() | JFrame.MAXIMIZED_BOTH);
        setListeners();
    }

// Methods ===================================================================================================

    public void initShowDefaultLayer(){
        LayerMain.showLayer(layerMain_Loading);
        
        SwingWorker<Void, Void> loadingWorker = new SwingWorker<Void, Void>() {
            
            @Override
            protected Void doInBackground() throws Exception {
                CountDownLatch waitLatch1 = new CountDownLatch(1);
                SwingUtilities.invokeLater(() -> {
                    sAnimatedLoading1.setProgressPercentage(33, 300, waitLatch1);
                });
                Database.openConnection();
                waitLatch1.await();
                
                CountDownLatch waitLatch2 = new CountDownLatch(1);
                SwingUtilities.invokeLater(() -> {
                    sAnimatedLoading1.setProgressPercentage(66, 300, waitLatch2);
                });
                Manager.initDefaults();
                waitLatch2.await();
                
                CountDownLatch waitLatch3 = new CountDownLatch(1);
                SwingUtilities.invokeLater(() -> {
                    sAnimatedLoading1.setProgressPercentage(100, 1500, waitLatch3);
                });
                waitLatch3.await();
                
                return null;
            }

            @Override
            protected void done() {
                try {
                    get(); // Catch any exceptions that might have happened in the background
                    LayerMain.showLayer(layerMain_Login);
                } catch (InterruptedException | ExecutionException e) {
                    Console.errorOut("Error during loading phase", e);
                }
            }
        };
        
        loadingWorker.execute();
    }
    
    private void setListeners() {
        KeyboardFocusManager.getCurrentKeyboardFocusManager().addKeyEventDispatcher((KeyEvent evt) -> {
            if (SFrame.getKeyLock()) {
                return false;
            }
            if (evt.getID() == KeyEvent.KEY_PRESSED) {
                LayerMain.keyPressed(evt);
                switch (evt.getKeyCode()) {
                    case KeyEvent.VK_F11 -> {
                        toggleFullscreen();
                    }
                }
            }
            return false;
        });
    }

    private boolean fullscreen = false;

    public void toggleFullscreen(){
        fullscreen = !fullscreen;
        
        dispose();
        setUndecorated(fullscreen);
        setExtendedState(JFrame.MAXIMIZED_BOTH);
        setVisible(true);

        moduleHome.menuSwitch_Fullscreen.setActive(fullscreen);
        moduleHome.menuMinSwitch_Fullscreen.setActive(fullscreen);
        
        repaint();
    }

// -----------------------------------------------------------------------------------------------------------
    
    private Timer refreshTimer;
    
    private volatile ReconnectExecute currentReconnectExecute;
    
    public void reconnectMode(String caller, ReconnectExecute reconnectExecute){
        currentReconnectExecute = reconnectExecute;
        
        if(refreshTimer != null && refreshTimer.isRunning()) return;
        refreshTimer = new Timer(5000, (evt) -> { // refreshing connection every 5 seconds
            try{
                Database.openConnection();
                if(Database.getConnection() != null && !Database.getConnection().isClosed()){
                    Console.line().out("RECONNECTION OF " + caller, ConsoleColors.GREEN);
                    currentReconnectExecute.reconnect();
                    ((Timer)evt.getSource()).stop();
                }
            }catch(SQLException e){
                Console.errorOut("Reconnecting failed", e);
            }
        });
        refreshTimer.start();
    }
    
// Static Methods ============================================================================================
    
    private static boolean keyLock = false;

    public static void setKeyLock(boolean keyLock) {
        SFrame.keyLock = keyLock;
    }

    public static boolean getKeyLock() {
        return keyLock;
    }

// Generated =================================================================================================
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        layeredPane_Main = new javax.swing.JLayeredPane();
        layerMain_Loading = new FrameSystem.Layers.Main.Components.LayerMain();
        sPanel1 = new FrameSystem.SLibrary.SComponents.SPanel();
        sLabel1 = new FrameSystem.SLibrary.SComponents.SLabel();
        sPanel2 = new FrameSystem.SLibrary.SComponents.SPanel();
        sAnimatedLoading1 = new FrameSystem.SLibrary.SAnimated.SAnimatedLoading();
        layerMain_Login = new FrameSystem.Layers.Main.Components.LayerMain();
        moduleLogin = new FrameSystem.Layers.Login.Module.ModuleLogin();
        layerMain_Home = new FrameSystem.Layers.Main.Components.LayerMain();
        moduleHome = new FrameSystem.Layers.Home.Module.ModuleHome();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Avida Prime Taft");
        setBackground(new java.awt.Color(0, 0, 0));
        setIconImages(null);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        layeredPane_Main.setOpaque(true);
        layeredPane_Main.setLayout(new java.awt.CardLayout());

        layerMain_Loading.setName("Main-Loading"); // NOI18N

        sLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        sLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/mainSmallLogo.png"))); // NOI18N

        sAnimatedLoading1.setLineColor(new java.awt.Color(205, 64, 68));
        sAnimatedLoading1.setTrackColor(new java.awt.Color(198, 198, 198));

        javax.swing.GroupLayout sAnimatedLoading1Layout = new javax.swing.GroupLayout(sAnimatedLoading1);
        sAnimatedLoading1.setLayout(sAnimatedLoading1Layout);
        sAnimatedLoading1Layout.setHorizontalGroup(
            sAnimatedLoading1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 429, Short.MAX_VALUE)
        );
        sAnimatedLoading1Layout.setVerticalGroup(
            sAnimatedLoading1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 11, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout sPanel2Layout = new javax.swing.GroupLayout(sPanel2);
        sPanel2.setLayout(sPanel2Layout);
        sPanel2Layout.setHorizontalGroup(
            sPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(sPanel2Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(sAnimatedLoading1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        sPanel2Layout.setVerticalGroup(
            sPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, sPanel2Layout.createSequentialGroup()
                .addContainerGap(26, Short.MAX_VALUE)
                .addComponent(sAnimatedLoading1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(45, 45, 45))
        );

        javax.swing.GroupLayout sPanel1Layout = new javax.swing.GroupLayout(sPanel1);
        sPanel1.setLayout(sPanel1Layout);
        sPanel1Layout.setHorizontalGroup(
            sPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(sLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 696, Short.MAX_VALUE)
            .addComponent(sPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        sPanel1Layout.setVerticalGroup(
            sPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(sPanel1Layout.createSequentialGroup()
                .addGap(99, 99, 99)
                .addComponent(sLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(sPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(160, 160, 160))
        );

        javax.swing.GroupLayout layerMain_LoadingLayout = new javax.swing.GroupLayout(layerMain_Loading);
        layerMain_Loading.setLayout(layerMain_LoadingLayout);
        layerMain_LoadingLayout.setHorizontalGroup(
            layerMain_LoadingLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layerMain_LoadingLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(sPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layerMain_LoadingLayout.setVerticalGroup(
            layerMain_LoadingLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layerMain_LoadingLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(sPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        layeredPane_Main.add(layerMain_Loading, "card3");

        layerMain_Login.setName("Main-Login"); // NOI18N

        javax.swing.GroupLayout layerMain_LoginLayout = new javax.swing.GroupLayout(layerMain_Login);
        layerMain_Login.setLayout(layerMain_LoginLayout);
        layerMain_LoginLayout.setHorizontalGroup(
            layerMain_LoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layerMain_LoginLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(moduleLogin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layerMain_LoginLayout.setVerticalGroup(
            layerMain_LoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layerMain_LoginLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(moduleLogin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        layeredPane_Main.setLayer(layerMain_Login, javax.swing.JLayeredPane.PALETTE_LAYER);
        layeredPane_Main.add(layerMain_Login, "card1");
        layerMain_Login.getAccessibleContext().setAccessibleName("");

        layerMain_Home.setName("Main-Home"); // NOI18N

        javax.swing.GroupLayout layerMain_HomeLayout = new javax.swing.GroupLayout(layerMain_Home);
        layerMain_Home.setLayout(layerMain_HomeLayout);
        layerMain_HomeLayout.setHorizontalGroup(
            layerMain_HomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layerMain_HomeLayout.createSequentialGroup()
                .addComponent(moduleHome, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(0, 0, 0))
        );
        layerMain_HomeLayout.setVerticalGroup(
            layerMain_HomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layerMain_HomeLayout.createSequentialGroup()
                .addComponent(moduleHome, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(0, 0, 0))
        );

        layeredPane_Main.setLayer(layerMain_Home, javax.swing.JLayeredPane.PALETTE_LAYER);
        layeredPane_Main.add(layerMain_Home, "card2");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(layeredPane_Main)
                .addGap(0, 0, 0))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(layeredPane_Main)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        try{
            Database.closeConnection();
        }catch(Exception e){
        }
        try{
            ExecutorDriver.closeExecutor();
        }catch(Exception e){
        }
    }//GEN-LAST:event_formWindowClosing

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public FrameSystem.Layers.Main.Components.LayerMain layerMain_Home;
    public FrameSystem.Layers.Main.Components.LayerMain layerMain_Loading;
    public FrameSystem.Layers.Main.Components.LayerMain layerMain_Login;
    private javax.swing.JLayeredPane layeredPane_Main;
    public FrameSystem.Layers.Home.Module.ModuleHome moduleHome;
    public FrameSystem.Layers.Login.Module.ModuleLogin moduleLogin;
    private FrameSystem.SLibrary.SAnimated.SAnimatedLoading sAnimatedLoading1;
    private FrameSystem.SLibrary.SComponents.SLabel sLabel1;
    private FrameSystem.SLibrary.SComponents.SPanel sPanel1;
    private FrameSystem.SLibrary.SComponents.SPanel sPanel2;
    // End of variables declaration//GEN-END:variables

}
