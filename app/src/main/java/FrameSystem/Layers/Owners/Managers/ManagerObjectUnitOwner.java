package FrameSystem.Layers.Owners.Managers;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicLong;

import ConsoleSystem.Console;
import DatabaseSystem.DataTable.DataTableFilter;
import DatabaseSystem.UnitOwnersData.UnitOwnersDataHandler;
import DatabaseSystem.UnitOwnersData.UnitOwnersDataTable;
import FrameSystem.Layers.Owners.Components.LayerUnitOwners;
import FrameSystem.Layers.Owners.Components.LayerUnitOwners_Main;
import FrameSystem.Layers.Owners.Components.ObjectUnitOwner;
import FrameSystem.SLibrary.SComponents.SLabel;
import FrameSystem.SLibrary.SComponents.SPanel;
import java.awt.Component;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.concurrent.ExecutionException;
import javax.swing.JLabel;
import javax.swing.SpinnerNumberModel;
import javax.swing.SwingUtilities;
import javax.swing.SwingWorker;

public class ManagerObjectUnitOwner extends ManagerModuleUnitOwner {

    private static ArrayList<ObjectUnitOwner> objects = new ArrayList<>();
    
    public static int currentPage = 0; 
    public static int pageSize = 100;   
    public static int totalPages = 1;
    
    public static void initDefault() {
        moduleHome.layerHome_Owners.addLayeredPanelShowListener((evt) -> {
            LayerUnitOwners_Main.showLayer(moduleUnitOwners.layerUnitOwnersData);
        });
        
        initPaginationControls();
    }
    
    public static void initPaginationControls() {
        SpinnerNumberModel spinnerModel = new SpinnerNumberModel(pageSize, 10, 500, 10);
        moduleUnitOwners.jSpinner1.setModel(spinnerModel);
        
        moduleUnitOwners.jSpinner1.addChangeListener(e -> {
            pageSize = (int) moduleUnitOwners.jSpinner1.getValue();
            currentPage = 0; 
            refreshObjects();
        });

        moduleUnitOwners.sPanel67.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                if (currentPage > 0) {
                    currentPage--;
                    refreshObjects();
                }
            }
        });

        moduleUnitOwners.sPanel68.addMouseListener(new MouseAdapter(){
            @Override
            public void mousePressed(MouseEvent e){
                if(currentPage < totalPages - 1){
                    currentPage++;
                    refreshObjects();
                }
            }
        });
        
        javax.swing.JPanel[] pagePanels = {
            moduleUnitOwners.sPanelPage1, moduleUnitOwners.sPanelPage2, moduleUnitOwners.sPanelPage3, 
            moduleUnitOwners.sPanelPage4, moduleUnitOwners.sPanelPage5, moduleUnitOwners.sPanelPage6, 
            moduleUnitOwners.sPanelPage7
        };

        for (javax.swing.JPanel p : pagePanels) {
            p.addMouseListener(new java.awt.event.MouseAdapter() {
                @Override
                public void mousePressed(java.awt.event.MouseEvent e) {
                    if (!p.isEnabled() || !p.isVisible()) return;
                    
                    String text = "";
                    for (java.awt.Component c : p.getComponents()) {
                        if (c instanceof JLabel jLabel) {
                            text = jLabel.getText();
                            break;
                        }
                    }
                    
                    if (!text.isEmpty() && !text.equals("...")) {
                        int targetPage = Integer.parseInt(text) - 1;
                        if (currentPage != targetPage) {
                            currentPage = targetPage;
                            refreshObjects(); 
                        }
                    }
                }
            });
        }
        
        updatePaginationLabels();
    }

// ==== Main Methods =========================================================================================

    private static SwingWorker<Void, Void> activeWorker = null;

    public static void refreshObjects() {
        if (!moduleHome.layerHome_Owners.isShowing()) {
            return;
        }
        if (activeWorker != null && !activeWorker.isDone()) {
            activeWorker.cancel(true);
        }

        LayerUnitOwners.showLayer(moduleUnitOwners.layerUnitOwnersLoading);

        activeWorker = new SwingWorker<Void, Void>() {
            @Override
            protected Void doInBackground() throws Exception {
                refreshObjectInBackground();
                return null;
            }

            @Override
            protected void done() {
                try {
                    if (isCancelled()) {
                        Console.out("Loading was cancelled.");
                        return;
                    }
                    get();
                } catch (InterruptedException | ExecutionException e) {
                    Console.errorOut("Error during background loading", e);
                    ManagerModuleUnitOwner.reconnectMode(() -> refreshObjects());
                } finally {
                    activeWorker = null;
                }
            }
        };
        activeWorker.execute();
    }

    private static final AtomicLong currentRefreshId = new AtomicLong(0);

    private static void refreshObjectInBackground() {
        final long thisRefreshId = currentRefreshId.incrementAndGet();

        try {
            long startTime = System.currentTimeMillis();

            int limit = pageSize;
            int offset = currentPage * pageSize; 

            ArrayList<DataTableFilter> combinedFilters = ManagerFilterUnitOwners.getFilters();
            
            UnitOwnersDataTable[] fullDataBatch = UnitOwnersDataHandler.getDataBatchSortedMulti(
                combinedFilters.toArray(new DataTableFilter[0]),
                999999, 
                0
            );

            if (thisRefreshId != currentRefreshId.get()) return;

            int totalItems = fullDataBatch != null ? fullDataBatch.length : 0;
            totalPages = (int) Math.ceil((double) totalItems / pageSize);
            if (totalPages == 0) totalPages = 1;

            ArrayList<UnitOwnersDataTable> pageDataList = new ArrayList<>();
            if (fullDataBatch != null) {
                for (int i = offset; i < Math.min(offset + limit, fullDataBatch.length); i++) {
                    pageDataList.add(fullDataBatch[i]);
                }
            }
            UnitOwnersDataTable[] dataBatch = pageDataList.toArray(new UnitOwnersDataTable[0]);

            long elapsedTime = System.currentTimeMillis() - startTime;
            long minLoadingTime = 1000;
            if (elapsedTime < minLoadingTime) {
                try {
                    Thread.sleep(minLoadingTime - elapsedTime);
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                }
            }

            if (thisRefreshId != currentRefreshId.get()) return;

            SwingUtilities.invokeLater(() -> {
                if (thisRefreshId != currentRefreshId.get()) return; 

                moduleUnitOwners.sTable1.clearRows();
                objects.clear();
                resetTotalOwnersDataChart();

                updatePaginationLabels(); 

                if (dataBatch == null || dataBatch.length < pageSize) {
                    moduleUnitOwners.sPanel68.setEnabled(false); 
                } else {
                    moduleUnitOwners.sPanel68.setEnabled(true);
                }

                if (fullDataBatch != null && fullDataBatch.length > 0) {
                    for (UnitOwnersDataTable data : fullDataBatch) {
                        addTotalOwnersDataChart();
                    }
                }

                if (dataBatch != null && dataBatch.length > 0) {
                    for (UnitOwnersDataTable data : dataBatch) {
                        ObjectUnitOwner o = new ObjectUnitOwner(data);
                        o.setOnViewClick(()->{
                            showLayerUnitOwnersView();
                        });
                        objects.add(o);
                        moduleUnitOwners.sTable1.addRow(o);
                    }
                }

                LayerUnitOwners.showLayer(moduleUnitOwners.layerUnitOwnersOnline);
            });

        } catch (SQLException e) {
            SwingUtilities.invokeLater(() -> {
                Console.errorOut("Gathering object unit owner error", e);
                ManagerModuleUnitOwner.reconnectMode(() -> refreshObjects());
            });
        }
    }

// ---- Current Object ---------------------------------------------------------------------------------------
    
    private static ObjectUnitOwner currentObject = null;
    
    public static void changeCurrentObject(ObjectUnitOwner object) {
        if (object == null) return;
        for (ObjectUnitOwner o : objects) {
            o.setActive(false);
        }
        object.setActive(true);
        currentObject = object;
    }

// ---- Page control -----------------------------------------------------------------------------------------
    
    public static void updatePaginationLabels() {
        int displayPage = currentPage + 1; 
        String[] slots = new String[7];

        if (totalPages <= 7) {
            slots[0] = totalPages >= 1 ? "1" : "";
            slots[1] = totalPages >= 2 ? "2" : "";
            slots[2] = totalPages >= 3 ? "3" : "";
            slots[3] = totalPages >= 4 ? "4" : "";
            slots[4] = totalPages >= 5 ? "5" : "";
            slots[5] = totalPages >= 6 ? "6" : "";
            slots[6] = totalPages >= 7 ? "7" : "";
        } else {
            if (displayPage <= 4) {
                slots[0] = "1";
                slots[1] = "2";
                slots[2] = "3";
                slots[3] = "4";
                slots[4] = "5";
                slots[5] = "...";
                slots[6] = String.valueOf(totalPages);
            } else if (displayPage >= totalPages - 3) {
                slots[0] = "1";
                slots[1] = "...";
                slots[2] = String.valueOf(totalPages - 4);
                slots[3] = String.valueOf(totalPages - 3);
                slots[4] = String.valueOf(totalPages - 2);
                slots[5] = String.valueOf(totalPages - 1);
                slots[6] = String.valueOf(totalPages);
            } else {
                slots[0] = "1";
                slots[1] = "...";
                slots[2] = String.valueOf(displayPage - 1);
                slots[3] = String.valueOf(displayPage);
                slots[4] = String.valueOf(displayPage + 1);
                slots[5] = "...";
                slots[6] = String.valueOf(totalPages);
            }
        }

        setPanelText(moduleUnitOwners.sPanelPage1, slots[0], displayPage);
        setPanelText(moduleUnitOwners.sPanelPage2, slots[1], displayPage);
        setPanelText(moduleUnitOwners.sPanelPage3, slots[2], displayPage);
        setPanelText(moduleUnitOwners.sPanelPage4, slots[3], displayPage);
        setPanelText(moduleUnitOwners.sPanelPage5, slots[4], displayPage);
        setPanelText(moduleUnitOwners.sPanelPage6, slots[5], displayPage);
        setPanelText(moduleUnitOwners.sPanelPage7, slots[6], displayPage);
    }
    
    private static void setPanelText(SPanel panel, String text, int displayPage) {
        for (Component c : panel.getComponents()) {
            if (c instanceof SLabel label) {
                label.setText(text);
                break;
            }
        }
        
        panel.setVisible(!text.isEmpty()); 
        panel.setCanHover(!text.equals("...")); 
        
        boolean isCurrentPage = text.equals(String.valueOf(displayPage));
        panel.setActive(isCurrentPage);
    }
    
    public static void nextPage(){
        if(currentPage < totalPages - 1){
            currentPage++;
            refreshObjects();
        }
    }

    public static void previousPage() {
        if (currentPage > 0) {
            currentPage--;
            refreshObjects();
        }
    }

    public static void resetPage() {
        currentPage = 0;
        refreshObjects();
    }
    
// -----------------------------------------------------------------------------------------------------------
    
    private static int totalOwners = 0;
    
    public static void resetTotalOwnersDataChart() {
        totalOwners = 0;
    }
    
    public static void addTotalOwnersDataChart() {
        totalOwners++;
    }
    
// ---- View -------------------------------------------------------------------------------------------------
    
    public static void showLayerUnitOwnersView() {
        LayerUnitOwners_Main.showLayer(moduleUnitOwners.layerUnitOwnersView);
    }
}