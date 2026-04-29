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
        // 1. Setup Spinner (Start at 20, Min 10, Max 500, Step by 10)
        SpinnerNumberModel spinnerModel = new SpinnerNumberModel(pageSize, 10, 500, 10);
        moduleUnits.jSpinner1.setModel(spinnerModel);
        
        moduleUnits.jSpinner1.addChangeListener(e -> {
            pageSize = (int) moduleUnits.jSpinner1.getValue();
            currentPage = 0; // Reset to the first page when size changes
            refreshObjects();
        });

        // 2. Setup Previous Page (sPanel67)
        moduleUnits.sPanel67.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                if (currentPage > 0) {
                    currentPage--;
                    refreshObjects();
                }
            }
        });

        // 3. Setup Next Page (sPanel68)
        moduleUnits.sPanel68.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                // You can add a check here to ensure you aren't on the last page
                currentPage++;
                refreshObjects();
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

// Main Methods ==============================================================================================
    
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

            // 2. Fetch only a single page of data
            ArrayList<DataTableFilter> combinedFilters = ManagerFilterUnits.getFilters();
            
            int totalItems = UnitsDataHandler.getDataCountMulti(combinedFilters.toArray(DataTableFilter[]::new));
            totalPages = (int) Math.ceil((double) totalItems / pageSize);
            if (totalPages == 0) totalPages = 1;
            
            UnitsDataTable[] dataBatch = UnitsDataHandler.getDataBatchSortedMulti(
                combinedFilters.toArray(new DataTableFilter[0]),
                limit,
                offset
            );

            if (thisRefreshId != currentRefreshId.get()) return;

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

            // 3. Update the UI with the single fetched page
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
                    // Note: You might need to adjust alpha/colors manually depending on your custom SPanel
                } else {
                    moduleUnits.sPanel68.setEnabled(true);
                }

                if (dataBatch != null && dataBatch.length > 0) {
                    for (UnitsDataTable data : dataBatch) {
                        ObjectUnit o = new ObjectUnit(data);
                        o.setOnViewClick(()->{
                            showLayerUnitsView();
                        });
                        objects.add(o);
                        moduleUnits.sTable1.addRow(o);
                        addOccupancyDataChart(data);
                        addTotalUnitsDataChart();
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

        // Apply text to the 7 designated panels
        setPanelText(moduleUnits.sPanelPage1, slots[0]);
        setPanelText(moduleUnits.sPanelPage2, slots[1]);
        setPanelText(moduleUnits.sPanelPage3, slots[2]);
        setPanelText(moduleUnits.sPanelPage4, slots[3]);
        setPanelText(moduleUnits.sPanelPage5, slots[4]);
        setPanelText(moduleUnits.sPanelPage6, slots[5]);
        setPanelText(moduleUnits.sPanelPage7, slots[6]);
    }
    
    // Helper to extract the label from inside the SPanel and set text
    private static void setPanelText(javax.swing.JPanel panel, String text) {
        for (java.awt.Component c : panel.getComponents()) {
            if (c instanceof javax.swing.JLabel) {
                ((javax.swing.JLabel) c).setText(text);
                break;
            }
        }
        panel.setVisible(!text.isEmpty()); // Hide if the slot is unused
        panel.setEnabled(!text.equals("...")); // Disable clicking on ellipses
    }
    
    public static void nextPage() {
        currentPage++;
        refreshObjects(); // triggers the background worker again
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