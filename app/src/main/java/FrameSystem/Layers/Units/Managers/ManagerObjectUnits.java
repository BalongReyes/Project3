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
import java.util.concurrent.ExecutionException;
import javax.swing.SwingUtilities;
import javax.swing.SwingWorker;

public class ManagerObjectUnits extends ManagerModuleUnits {

    private static ArrayList<ObjectUnit> objects = new ArrayList<>();
    
    public static void initDefault() {
        moduleHome.layerHome_Units.addLayeredPanelShowListener((evt) -> {
            LayerUnits_Main.showLayer(moduleUnits.layerUnitsData);
        });
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

    // FIX #6: Use AtomicLong so the increment and reads are safe across threads.
    // The background thread increments this value; both the EDT and background
    // threads read it to detect stale refreshes.
    private static final AtomicLong currentRefreshId = new AtomicLong(0);

    private static void refreshObjectInBackground() {
        // Atomically bump and capture the ID for this particular refresh run.
        final long thisRefreshId = currentRefreshId.incrementAndGet();

        try {
            long startTime = System.currentTimeMillis();

            int limit = 20;  // How many units to fetch per SQL query
            int offset = 0;  // Start at the very beginning
            boolean isFirstBatch = true, hasMoreData = true;

            while (hasMoreData) {
                if (Thread.currentThread().isInterrupted()) return;

                if (thisRefreshId != currentRefreshId.get()) return;

                ArrayList<DataTableFilter> combinedFilters = ManagerFilterUnits.getFilters();

                UnitsDataTable[] dataBatch = UnitsDataHandler.getDataBatchSortedMulti(
                    combinedFilters.toArray(DataTableFilter[]::new),
                    limit,
                    offset
                );

                if (thisRefreshId != currentRefreshId.get()) return;

                if (isFirstBatch) {
                    long elapsedTime = System.currentTimeMillis() - startTime;
                    long minLoadingTime = 1000;

                    if (elapsedTime < minLoadingTime) {
                        try {
                            Thread.sleep(minLoadingTime - elapsedTime);
                        } catch (InterruptedException e) {
                            Thread.currentThread().interrupt();
                        }
                    }
                }

                if (thisRefreshId != currentRefreshId.get()) return;

                // Check if we reached the end of the database
                if (dataBatch == null || dataBatch.length == 0) {
                    hasMoreData = false;

                    if (isFirstBatch) {
                        SwingUtilities.invokeLater(() -> {
                            if (thisRefreshId != currentRefreshId.get()) return; // Final UI check
                            moduleUnits.sTable1.clearRows();
                            objects.clear();
                            resetOccupancyDataChart();
                            resetTotalUnitsDataChart();
                            LayerUnits.showLayer(moduleUnits.layerUnitsOnline);
                        });
                    }
                    break;
                }

                final boolean firstBatchCopy = isFirstBatch;

                // Update the UI with the freshly loaded batch
                SwingUtilities.invokeLater(() -> {
                    if (thisRefreshId != currentRefreshId.get()) return; // Final UI check

                    if (firstBatchCopy) {
                        moduleUnits.sTable1.clearRows();
                        objects.clear();
                        resetOccupancyDataChart();
                        resetTotalUnitsDataChart();
                        LayerUnits.showLayer(moduleUnits.layerUnitsOnline);
                    }

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
                });

                // Prepare for the next round
                isFirstBatch = false;
                offset += limit;

                try {
                    Thread.sleep(15);
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                }
            }
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