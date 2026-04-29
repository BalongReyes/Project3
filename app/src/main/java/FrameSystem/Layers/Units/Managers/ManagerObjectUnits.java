package FrameSystem.Layers.Units.Managers;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicLong;

import ConsoleSystem.Console;
import DatabaseSystem.DataTable.DataTableFilter;
import DatabaseSystem.UnitsData.UnitsDataHandler;
import DatabaseSystem.UnitsData.UnitsDataTable;
import FrameSystem.Layers.Units.Components.LayerUnits;
import FrameSystem.Layers.Units.Components.LayerUnits_Main;
import FrameSystem.Layers.Units.Components.ObjectUnit;
import FrameSystem.SLibrary.SComponents.SLabel;
import FrameSystem.SLibrary.SComponents.SPanel;
import java.awt.Component;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.concurrent.ExecutionException;
import javax.swing.SpinnerNumberModel;
import javax.swing.SwingUtilities;
import javax.swing.SwingWorker;

public class ManagerObjectUnits extends ManagerModuleUnits {

    private static ArrayList<ObjectUnit> objects = new ArrayList<>();
    
    // Add these variables for pagination
    public static int currentPage = 0; 
    public static int pageSize = 100;   // Default, will be overridden by jSpinner1
    public static int totalPages = 1;
    
    public static void initDefault() {
        moduleHome.layerHome_Units.addLayeredPanelShowListener((evt) -> {
            LayerUnits_Main.showLayer(moduleUnits.layerUnitsData);
        });
        
        initPaginationControls();
    }
    
    public static void initPaginationControls() {
        SpinnerNumberModel spinnerModel = new SpinnerNumberModel(pageSize, 10, 500, 10);
        moduleUnits.jSpinner1.setModel(spinnerModel);
        
        moduleUnits.jSpinner1.addChangeListener(e -> {
            pageSize = (int) moduleUnits.jSpinner1.getValue();
            currentPage = 0; // Reset to the first page when size changes
            refreshObjects();
        });

        moduleUnits.sPanel67.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                if (currentPage > 0) {
                    currentPage--;
                    refreshObjects();
                }
            }
        });

        moduleUnits.sPanel68.addMouseListener(new MouseAdapter(){
            @Override
            public void mousePressed(MouseEvent e){
                // Prevent going past the last page!
                if(currentPage < totalPages - 1){
                    currentPage++;
                    refreshObjects();
                }
            }
        });
        
        // Array of all 7 page panels
        javax.swing.JPanel[] pagePanels = {
            moduleUnits.sPanelPage1, moduleUnits.sPanelPage2, moduleUnits.sPanelPage3, 
            moduleUnits.sPanelPage4, moduleUnits.sPanelPage5, moduleUnits.sPanelPage6, 
            moduleUnits.sPanelPage7
        };

        // Attach a click listener to all of them
        for (javax.swing.JPanel p : pagePanels) {
            p.addMouseListener(new java.awt.event.MouseAdapter() {
                @Override
                public void mousePressed(java.awt.event.MouseEvent e) {
                    if (!p.isEnabled() || !p.isVisible()) return;
                    
                    String text = "";
                    for (java.awt.Component c : p.getComponents()) {
                        if (c instanceof javax.swing.JLabel) {
                            text = ((javax.swing.JLabel) c).getText();
                            break;
                        }
                    }
                    
                    // Proceed only if the slot contains a valid number (and not the ellipsis)
                    if (!text.isEmpty() && !text.equals("...")) {
                        int targetPage = Integer.parseInt(text) - 1; // Convert UI text back to 0-based code index
                        if (currentPage != targetPage) {
                            currentPage = targetPage;
                            refreshObjects(); // Triggers your background UI update
                        }
                    }
                }
            });
        }
        
        // Initial setup for the labels
        updatePaginationLabels();
    }

// ==== Main Methods =========================================================================================
    
// ---- Refresh ----------------------------------------------------------------------------------------------

    // activeWorker is only ever read and written on the EDT (refreshObjects and done()),
    // so no extra synchronization is needed here.
    private static SwingWorker<Void, Void> activeWorker = null;

    public static void refreshObjects() {
        if (!moduleHome.layerHome_Units.isShowing()) {
            return;
        }
        if (activeWorker != null && !activeWorker.isDone()) {
            activeWorker.cancel(true);
        }

        LayerUnits.showLayer(moduleUnits.layerUnitsLoading);

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
                    ManagerModuleUnits.reconnectMode(() -> refreshObjects());
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

            // 1. Calculate offset based on current page
            int limit = pageSize;
            int offset = currentPage * pageSize; 

            // 2. Fetch ALL matching data so charts can calculate the full filtered set
            ArrayList<DataTableFilter> combinedFilters = ManagerFilterUnits.getFilters();
            
            UnitsDataTable[] fullDataBatch = UnitsDataHandler.getDataBatchSortedMulti(
                combinedFilters.toArray(new DataTableFilter[0]),
                999999, // Use a high limit to get all records for the charts
                0
            );

            if (thisRefreshId != currentRefreshId.get()) return;

            // Calculate total pages based on full filtered results
            int totalItems = fullDataBatch != null ? fullDataBatch.length : 0;
            totalPages = (int) Math.ceil((double) totalItems / pageSize);
            if (totalPages == 0) totalPages = 1;

            // 3. Manually slice the data to grab ONLY the current page for the table
            ArrayList<UnitsDataTable> pageDataList = new ArrayList<>();
            if (fullDataBatch != null) {
                for (int i = offset; i < Math.min(offset + limit, fullDataBatch.length); i++) {
                    pageDataList.add(fullDataBatch[i]);
                }
            }
            UnitsDataTable[] dataBatch = pageDataList.toArray(new UnitsDataTable[0]);

            // Artificial loading delay
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

            // 4. Update the UI
            SwingUtilities.invokeLater(() -> {
                if (thisRefreshId != currentRefreshId.get()) return; 

                moduleUnits.sTable1.clearRows();
                objects.clear();
                resetOccupancyDataChart();
                resetTotalUnitsDataChart();

                // Update the UI labels here!
                updatePaginationLabels(); 

                // Disable NEXT button if the batch is smaller than the page size (meaning it's the last page)
                if (dataBatch == null || dataBatch.length < pageSize) {
                    moduleUnits.sPanel68.setEnabled(false); 
                } else {
                    moduleUnits.sPanel68.setEnabled(true);
                }

                // A) Feed the charts with the FULL dataset
                if (fullDataBatch != null && fullDataBatch.length > 0) {
                    for (UnitsDataTable data : fullDataBatch) {
                        addOccupancyDataChart(data);
                        addTotalUnitsDataChart();
                    }
                }

                // B) Populate the Table with ONLY the paginated slice
                if (dataBatch != null && dataBatch.length > 0) {
                    for (UnitsDataTable data : dataBatch) {
                        ObjectUnit o = new ObjectUnit(data);
                        o.setOnViewClick(()->{
                            showLayerUnitsView();
                        });
                        objects.add(o);
                        moduleUnits.sTable1.addRow(o);
                    }
                }

                LayerUnits.showLayer(moduleUnits.layerUnitsOnline);
            });

        } catch (SQLException e) {
            SwingUtilities.invokeLater(() -> {
                Console.errorOut("Gathering object unit error", e);
                ManagerModuleUnits.reconnectMode(() -> refreshObjects());
            });
        }
    }

// ---- Current Object ---------------------------------------------------------------------------------------
    
    private static ObjectUnit currentObject = null;
    
    public static void changeCurrentObject(ObjectUnit object) {
        if (object == null) return;
        int i = 0;
        for (ObjectUnit o : objects) {
            o.setActive(false);
            if (o == object) {
                // moduleUnits.objectUnitScrollPane.scrollToObjectContent(i + 1);
            }
            i++;
        }
        object.setActive(true);
        currentObject = object;
        // moduleUnits.objectUnitScrollPane.repaint();
    }

// ---- Page control -----------------------------------------------------------------------------------------
    
    public static void updatePaginationLabels() {
        int displayPage = currentPage + 1; // 1-based index for UI
        String[] slots = new String[7];

        if (totalPages <= 7) {
            // Less than or equal to 7 pages: Display them sequentially
            slots[0] = totalPages >= 1 ? "1" : "";
            slots[1] = totalPages >= 2 ? "2" : "";
            slots[2] = totalPages >= 3 ? "3" : "";
            slots[3] = totalPages >= 4 ? "4" : "";
            slots[4] = totalPages >= 5 ? "5" : "";
            slots[5] = totalPages >= 6 ? "6" : "";
            slots[6] = totalPages >= 7 ? "7" : "";
        } else {
            if (displayPage <= 4) {
                // Near beginning: 1 2 3 4 5 ... Last
                slots[0] = "1";
                slots[1] = "2";
                slots[2] = "3";
                slots[3] = "4";
                slots[4] = "5";
                slots[5] = "...";
                slots[6] = String.valueOf(totalPages);
            } else if (displayPage >= totalPages - 3) {
                // Near end: 1 ... Last-4 Last-3 Last-2 Last-1 Last
                slots[0] = "1";
                slots[1] = "...";
                slots[2] = String.valueOf(totalPages - 4);
                slots[3] = String.valueOf(totalPages - 3);
                slots[4] = String.valueOf(totalPages - 2);
                slots[5] = String.valueOf(totalPages - 1);
                slots[6] = String.valueOf(totalPages);
            } else {
                // In the middle: 1 ... Current-1 Current Current+1 ... Last
                slots[0] = "1";
                slots[1] = "...";
                slots[2] = String.valueOf(displayPage - 1);
                slots[3] = String.valueOf(displayPage);
                slots[4] = String.valueOf(displayPage + 1);
                slots[5] = "...";
                slots[6] = String.valueOf(totalPages);
            }
        }

        // Apply text and active state to the 7 designated panels
        setPanelText(moduleUnits.sPanelPage1, slots[0], displayPage);
        setPanelText(moduleUnits.sPanelPage2, slots[1], displayPage);
        setPanelText(moduleUnits.sPanelPage3, slots[2], displayPage);
        setPanelText(moduleUnits.sPanelPage4, slots[3], displayPage);
        setPanelText(moduleUnits.sPanelPage5, slots[4], displayPage);
        setPanelText(moduleUnits.sPanelPage6, slots[5], displayPage);
        setPanelText(moduleUnits.sPanelPage7, slots[6], displayPage);
    }
    
    // Helper to extract the label from inside the SPanel and set text
    private static void setPanelText(SPanel panel, String text, int displayPage) {
        for (Component c : panel.getComponents()) {
            if (c instanceof SLabel label) {
                label.setText(text);
                break;
            }
        }
        
        panel.setVisible(!text.isEmpty()); // Hide if the slot is unused
        panel.setCanHover(!text.equals("...")); // Disable clicking on ellipses
        
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
    
    private static int totalUnits = 0;
    
    public static void resetTotalUnitsDataChart() {
        totalUnits = 0;
    }
    
    public static void addTotalUnitsDataChart() {
        totalUnits++;
        moduleUnits.sLabel26.setText(String.valueOf(totalUnits));
    }
    
    public static void resetOccupancyDataChart() {
        moduleUnits.objectUnitDonutChart1.resetData();
    }
    
    public static void addOccupancyDataChart(UnitsDataTable data) {
        switch (data.getOccupancy()) {
            case Owner, OwnerWeekenders, OwnerNoActivity -> {
                moduleUnits.objectUnitDonutChart1.addDataOwner();
            }
            case Tenant, TenantWeekenders, TenantNoActivity -> {
                moduleUnits.objectUnitDonutChart1.addDataTenants();
            }
            case Inventory, UnturnedOver -> {
                moduleUnits.objectUnitDonutChart1.addDataOthers();
            }
        }
        
        int owners  = moduleUnits.objectUnitDonutChart1.owners;
        int tenants = moduleUnits.objectUnitDonutChart1.tenants;
        int others  = moduleUnits.objectUnitDonutChart1.others;
        
        int total = owners + tenants + others;
        if (total > 0) {
            double percentage = ((double) (owners + tenants) / total) * 100.0;
            moduleUnits.sLabel33.setText(String.format("%.2f%%", percentage));
        } else {
            moduleUnits.sLabel33.setText("0%");
        }
    }
    
// ---- View -------------------------------------------------------------------------------------------------
    
    public static void showLayerUnitsView() {
        LayerUnits_Main.showLayer(moduleUnits.layerUnitsView);
    }
    
}