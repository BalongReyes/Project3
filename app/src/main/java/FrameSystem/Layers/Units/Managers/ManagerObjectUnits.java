package FrameSystem.Layers.Units.Managers;

import java.awt.Dimension;
import java.sql.SQLException;
import java.util.ArrayList;

import ConsoleSystem.Console;
import DatabaseSystem.DataTable.DataTableFilter;
import DatabaseSystem.DataTable.DataTableOrder;
import DatabaseSystem.UnitsData.UnitsDataHandler;
import DatabaseSystem.UnitsData.UnitsDataTable;
import FrameSystem.Layers.Units.Components.LayerUnits;
import FrameSystem.Layers.Units.Components.ObjectUnit;
import FrameSystem.Layers.Units.Module.ModuleUnits;
import MainSystem.ExecutorDriver;
import MainSystem.Manager;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class ManagerObjectUnits extends Manager{

    public static ModuleUnits moduleUnits;
    
    private static ArrayList<ObjectUnit> objects = new ArrayList<>();
    
    private static boolean isFilterTower1Active = false;
    private static boolean isFilterTower2Active = false;
    private static boolean isFilterTower3Active = false;
    
    // Variables for Debouncing and Thread Cancellation
    private static javax.swing.Timer filterDebounceTimer;
    private static long currentRefreshId = 0;
    
    public static void initDefault(){
        setDefaultFilters();
                
        moduleUnits = frame.moduleHome.moduleUnits;
        
        setDefaultFilters();
                
        moduleUnits.objectUnitScrollPane.setObjectContentHeight(60);
        
        moduleUnits.filterTower1.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e){
                moduleUnits.filterTower1.toggleActive();
                isFilterTower1Active = moduleUnits.filterTower1.isActive();
                activeFilterChanged();
            }
        });
        
        moduleUnits.filterTower2.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e){
                moduleUnits.filterTower2.toggleActive();
                isFilterTower2Active = moduleUnits.filterTower2.isActive();
                activeFilterChanged();
            }
        });
        
        moduleUnits.filterTower3.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e){
                moduleUnits.filterTower3.toggleActive();
                isFilterTower3Active = moduleUnits.filterTower3.isActive();
                activeFilterChanged();
            }
        });
    }

// Main Methods ==============================================================================================
    
// Refresh ---------------------------------------------------------------------------------------------------
    
    private static void refreshObjects(boolean refresh){
        refreshObjects(currentObject, refresh);
    }
    
    public static void refreshObjects(ObjectUnit recentObject, boolean refresh) {
        // Show the loading screen right away
        LayerUnits.showLayer(moduleUnits.layerUnitsLoading);

        // Assign a unique ID to this specific request
        final long thisRefreshId = ++currentRefreshId;

        ExecutorDriver.execute(() -> {
            try {
                long startTime = System.currentTimeMillis();
                
                int limit = 20;  // How many units to fetch per SQL query
                int offset = 0;  // Start at the very beginning
                boolean isFirstBatch = true;
                boolean hasMoreData = true;

                while (hasMoreData) {
                    // Check if a newer refresh has been clicked. If so, abort this old thread.
                    if (thisRefreshId != currentRefreshId) return;

                    ArrayList<DataTableFilter> combinedFilters = new ArrayList<>(activeFilters);
                    
                    if (isFilterTower1Active) combinedFilters.add(new DataTableFilter(UnitsDataTable.TOWER, DataTableOrder.Where, "1"));
                    if (isFilterTower2Active) combinedFilters.add(new DataTableFilter(UnitsDataTable.TOWER, DataTableOrder.Where, "2"));
                    if (isFilterTower3Active) combinedFilters.add(new DataTableFilter(UnitsDataTable.TOWER, DataTableOrder.Where, "3"));
                    
                    UnitsDataTable[] dataBatch = UnitsDataHandler.getDataBatchSortedMulti(
                        refresh, 
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
                            javax.swing.SwingUtilities.invokeLater(() -> {
                                if (thisRefreshId != currentRefreshId) return; // Final UI check
                                moduleUnits.objectUnitWrapper.removeAll();
                                moduleUnits.objectUnitWrapper.add(new javax.swing.Box.Filler(new java.awt.Dimension(0, 10), new java.awt.Dimension(0, 10), new java.awt.Dimension(32767, 10)));
                                objects.clear();
                                resizeContainer();
                                LayerUnits.showLayer(moduleUnits.layerUnitsOnline);
                            });
                        }
                        break; 
                    }

                    final boolean firstBatchCopy = isFirstBatch;

                    // 4. Update the UI with the freshly loaded batch
                    javax.swing.SwingUtilities.invokeLater(() -> {
                        if (thisRefreshId != currentRefreshId) return; // Final UI check

                        if (firstBatchCopy) {
                            moduleUnits.objectUnitWrapper.removeAll();
                            moduleUnits.objectUnitWrapper.add(new javax.swing.Box.Filler(new java.awt.Dimension(0, 10), new java.awt.Dimension(0, 10), new java.awt.Dimension(32767, 10)));
                            objects.clear();
                            LayerUnits.showLayer(moduleUnits.layerUnitsOnline);
                        }

                        for (UnitsDataTable data : dataBatch) {
                            ObjectUnit o = new ObjectUnit(data);
                            objects.add(o);
                            moduleUnits.objectUnitWrapper.add(o);
                            moduleUnits.objectUnitScrollPane.addInnerListeners(o);
                        }
                        
                        resizeContainer();
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
                    ManagerModuleUnits.reconnectMode(() -> refreshObjects(recentObject, true));
                });
            }
        });
    }
    
// Resize ----------------------------------------------------------------------------------------------------
    
    private static void resizeContainer(){
        int height = (objects.size() * 60) + 10;
        moduleUnits.objectUnitContainer.setPreferredSize(new Dimension(0, height));
        moduleUnits.objectUnitWrapper.setPreferredSize(new Dimension(0, height));
        moduleUnits.revalidate();
        moduleUnits.repaint();
    }
    
// Current Object --------------------------------------------------------------------------------------------
    
    private static ObjectUnit currentObject = null;
    private static int currentObjectIndex = -1;
    
    private static void resetCurrentObject(){
        currentObject = null;
        currentObjectIndex = -1;
    }
    
    private static void changeCurrentObject(int increment){
        if(currentObject == null || objects.size() <= 1) return;
        int i = currentObjectIndex + increment;
        if(i < 0 || i > objects.size() - 1) return;
        
        changeCurrentObject(objects.get(i));
    }
    
    public static void changeCurrentObject(ObjectUnit object){
        if(object == null) return;
        int i = 0;
        for(ObjectUnit o : objects){
            o.setActive(false);
            if(o == object){
                currentObjectIndex = i;
                moduleUnits.objectUnitScrollPane.scrollToObjectContent(i + 1);
            }
            i++;
        }
        object.setActive(true);
        currentObject = object;
        moduleUnits.objectUnitScrollPane.repaint();
    }
    
// Filter ----------------------------------------------------------------------------------------------------
    
    private static String filter = "";
    private static int filterCategory = -1;
    
    // Track multiple active filters
    private static ArrayList<DataTableFilter> activeFilters = new ArrayList<>();
    
    public static void setDefaultFilters() {
        clearActiveFilter();
        // Default sort priority: Tower -> Floor -> Unit (Ascending)
        addActiveFilter(new DataTableFilter(UnitsDataTable.TOWER, DataTableOrder.Asc));
        addActiveFilter(new DataTableFilter(UnitsDataTable.FLOOR, DataTableOrder.Asc));
        addActiveFilter(new DataTableFilter(UnitsDataTable.UNIT, DataTableOrder.Asc));
    }
    
    public static void addActiveFilter(DataTableFilter dataFilter){
        addActiveFilter(null, dataFilter);
    }
    
    public static void addActiveFilter(Integer n, DataTableFilter dataFilter){
        if(n != null){
            activeFilters.add(n, dataFilter); // Fixed logic bug here!
        } else {
            activeFilters.add(dataFilter);    // Fixed logic bug here!
        }
        activeFilterChanged();
    }
    
    public static void removeActiveFilter(DataTableFilter dataFilter){
        activeFilters.remove(dataFilter);
        activeFilterChanged();
    }
    
    public static void clearActiveFilter(){
        activeFilters.clear();
        activeFilterChanged();
    }
    
    public static void activeFilterChanged(){
        if (filterDebounceTimer != null && filterDebounceTimer.isRunning()) {
            filterDebounceTimer.restart();
        } else {
            filterDebounceTimer = new javax.swing.Timer(300, e -> {
                refreshObjects(false);
            });
            filterDebounceTimer.setRepeats(false);
            filterDebounceTimer.start();
        }
    }
    
// Add Edit Remove -------------------------------------------------------------------------------------------
    
    public static void addObject(){
        // ... omitted
    }
    
    public static void removeObject(ObjectUnit object){
        // ... omitted
    }
    
    public static void editObject(ObjectUnit object){
        // ... omitted
    }

// -----------------------------------------------------------------------------------------------------------
    
    public void updateOccupancyData(int ownerWeekenders, int ownerNoActivity, 
                                    int tenantWeekenders, int tenantNoActivity, 
                                    int inventory, int unturnedOver) {
        
        // Group the categories according to your rules
        int owners = ownerWeekenders + ownerNoActivity;
        int tenants = tenantWeekenders + tenantNoActivity;
        int others = inventory + unturnedOver;
        
        // Pass the grouped data to the chart
        moduleUnits.objectUnitDonutChart1.setData(owners, tenants, others);
        
        // Calculate the percentage of (Owners + Tenants) against the Total
        int total = owners + tenants + others;
        if (total > 0) {
            double percentage = ((double) (owners + tenants) / total) * 100.0;
            // Format to show no decimal places and add a '%' sign
            moduleUnits.sLabel33.setText(String.format("%.0f%%", percentage));
        } else {
            // Fallback if there are no units at all
            moduleUnits.sLabel33.setText("0%"); 
        }
    }
    
}