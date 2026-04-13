package FrameSystem.Layers.Units.Managers;

import java.sql.SQLException;
import java.util.ArrayList;

import ConsoleSystem.Console;
import DatabaseSystem.DataTable.DataTableFilter;
import DatabaseSystem.UnitsData.UnitsDataHandler;
import DatabaseSystem.UnitsData.UnitsDataTable;
import FrameSystem.Layers.Units.Components.LayerUnits;
import FrameSystem.Layers.Units.Components.ObjectUnit;
import java.util.concurrent.ExecutionException;
import javax.swing.SwingUtilities;
import javax.swing.SwingWorker;

public class ManagerObjectUnits extends ManagerModuleUnits{

    private static ArrayList<ObjectUnit> objects = new ArrayList<>();
    
    public static void initDefault(){
    }

// Main Methods ==============================================================================================
    
// Refresh ---------------------------------------------------------------------------------------------------
    
    private static SwingWorker<Void, Void> activeWorker = null;

    public static void refreshObjects() {
        if(!moduleHome.layerHome_Units.isShowing()){
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
    
    private static long currentRefreshId = 0;
    
    private static void refreshObjectInBackground(){
        final long thisRefreshId = ++currentRefreshId;
        
        try {
            long startTime = System.currentTimeMillis();

            int limit = 20;  // How many units to fetch per SQL query
            int offset = 0;  // Start at the very beginning
            boolean isFirstBatch = true, hasMoreData = true;

            while (hasMoreData) {
                if (Thread.currentThread().isInterrupted()) return;
                
                if (thisRefreshId != currentRefreshId) return;

                ArrayList<DataTableFilter> combinedFilters = ManagerFilterUnits.getFilters();

                UnitsDataTable[] dataBatch = UnitsDataHandler.getDataBatchSortedMulti(
                    combinedFilters.toArray(DataTableFilter[]::new), 
                    limit, 
                    offset
                );

                if (thisRefreshId != currentRefreshId) return;

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

                if (thisRefreshId != currentRefreshId) return;

                // 3. Check if we reached the end of the database
                if (dataBatch == null || dataBatch.length == 0) {
                    hasMoreData = false;

                    if (isFirstBatch) {
                        SwingUtilities.invokeLater(() -> {
                            if (thisRefreshId != currentRefreshId) return; // Final UI check
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

                // 4. Update the UI with the freshly loaded batch
                SwingUtilities.invokeLater(() -> {
                    if (thisRefreshId != currentRefreshId) return; // Final UI check

                    if (firstBatchCopy) {
                        moduleUnits.sTable1.clearRows();
                        objects.clear();
                        resetOccupancyDataChart();
                        resetTotalUnitsDataChart();
                        LayerUnits.showLayer(moduleUnits.layerUnitsOnline);
                    }

                    for (UnitsDataTable data : dataBatch) {
                        ObjectUnit o = new ObjectUnit(data);
                        objects.add(o);
                        moduleUnits.sTable1.addRow(o);
//                        moduleUnits.objectUnitScrollPane.addInnerListeners(o);
                        addOccupancyDataChart(data);
                        addTotalUnitsDataChart();
                    }
                });

                // 5. Prepare for the next round
                isFirstBatch = false;
                offset += limit; 

                try {
                    Thread.sleep(15); 
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                }
            }
        } catch (SQLException e) {
            javax.swing.SwingUtilities.invokeLater(() -> {
                Console.errorOut("Gathering object unit error", e);
                ManagerModuleUnits.reconnectMode(() -> refreshObjects());
            });
        }
    }
    
// Current Object --------------------------------------------------------------------------------------------
    
    private static ObjectUnit currentObject = null;
    
    public static void changeCurrentObject(ObjectUnit object){
        if(object == null) return;
        int i = 0;
        for(ObjectUnit o : objects){
            o.setActive(false);
            if(o == object){
//                moduleUnits.objectUnitScrollPane.scrollToObjectContent(i + 1);
            }
            i++;
        }
        object.setActive(true);
        currentObject = object;
//        moduleUnits.objectUnitScrollPane.repaint();
    }
    
// -----------------------------------------------------------------------------------------------------------
    
    private static int totalUnits = 0;
    
    public static void resetTotalUnitsDataChart(){
        totalUnits = 0;
    }
    
    public static void addTotalUnitsDataChart(){
        totalUnits++;
        moduleUnits.sLabel26.setText(String.valueOf(totalUnits));
    }
    
    public static void resetOccupancyDataChart(){
        moduleUnits.objectUnitDonutChart1.resetData();
    }
    
    public static void addOccupancyDataChart(UnitsDataTable data) {
        
        switch(data.getOccupancy()){
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
        
        int owners = moduleUnits.objectUnitDonutChart1.owners;
        int tenants = moduleUnits.objectUnitDonutChart1.tenants;
        int others = moduleUnits.objectUnitDonutChart1.others;
        
        // Calculate the percentage of (Owners + Tenants) against the Total
        int total = owners + tenants + others;
        if (total > 0) {
            double percentage = ((double) (owners + tenants) / total) * 100.0;
            // Format to show no decimal places and add a '%' sign
            moduleUnits.sLabel33.setText(String.format("%.2f%%", percentage));
        } else {
            // Fallback if there are no units at all
            moduleUnits.sLabel33.setText("0%"); 
        }
    }
    
}