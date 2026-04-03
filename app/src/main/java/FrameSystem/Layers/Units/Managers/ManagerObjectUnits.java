package FrameSystem.Layers.Units.Managers;

import java.awt.Dimension;
import java.awt.event.MouseListener;
import java.sql.SQLException;
import java.util.ArrayList;

import ConsoleSystem.Console;
import DatabaseSystem.DataTable.DataTableFilter;
import DatabaseSystem.DataTable.DataTableOrder;
import DatabaseSystem.UnitsData.UnitsDataHandler;
import DatabaseSystem.UnitsData.UnitsDataTable;
import EventSystem.Listeners.MousePressedAdaptor;
import FrameSystem.Layers.Units.Components.LayerUnits;
import FrameSystem.Layers.Units.Components.ObjectUnit;
import FrameSystem.Layers.Units.Components.ObjectUnitFilter;
import FrameSystem.Layers.Units.Module.ModuleUnits;
import FrameSystem.SLibrary.SGenericComponents.SFilterTitlePanel;
import MainSystem.ExecutorDriver;
import MainSystem.Manager;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class ManagerObjectUnits extends Manager{

    public static ModuleUnits moduleUnits;
    
    private static ArrayList<ObjectUnit> objects = new ArrayList<>();
    
    // Variables for Debouncing and Thread Cancellation
    private static javax.swing.Timer filterDebounceTimer;
    private static long currentRefreshId = 0;
    
    public static void initDefault(){
        setDefaultFilters();
                
        moduleUnits = frame.moduleHome.moduleUnits;
        
        // Grab the layout spacers BEFORE we set default filters
        initFilterUI(); 
        
        setDefaultFilters();
                
        moduleUnits.objectUnitScrollPane.setObjectContentHeight(60);
        
        moduleUnits.sFilterTitlePanel1.addMouseListener(buildFilterTitleMouseListener(UnitsDataTable.TOWER, moduleUnits.sFilterTitlePanel1));
        moduleUnits.sFilterTitlePanel2.addMouseListener(buildFilterTitleMouseListener(UnitsDataTable.FLOOR, moduleUnits.sFilterTitlePanel2));
        moduleUnits.sFilterTitlePanel3.addMouseListener(buildFilterTitleMouseListener(UnitsDataTable.UNIT, moduleUnits.sFilterTitlePanel3));
        moduleUnits.sFilterTitlePanel5.addMouseListener(buildFilterTitleMouseListener(UnitsDataTable.MODEL, moduleUnits.sFilterTitlePanel5));
        moduleUnits.sFilterTitlePanel4.addMouseListener(buildFilterTitleMouseListener(UnitsDataTable.FLOOR_AREA, moduleUnits.sFilterTitlePanel4));
        
        moduleUnits.filterTower1.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e){
                moduleUnits.filterTower1.toggleActive();
                activeFilterChanged();
            }
        });
        
        moduleUnits.filterTower2.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e){
                moduleUnits.filterTower2.toggleActive();
                activeFilterChanged();
            }
        });
        
        moduleUnits.filterTower3.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e){
                moduleUnits.filterTower3.toggleActive();
                activeFilterChanged();
            }
        });
    }

// Main Methods ==============================================================================================
    
// Filter Title ----------------------------------------------------------------------------------------------
    
    private static MouseListener buildFilterTitleMouseListener(int f, SFilterTitlePanel c){
        return (MousePressedAdaptor) (var evt) -> {
            // Reset the previous arrow if clicking a new column
            if(getCurrentFilterTitlePanel() != c){
                resetCurrentFilterTitlePanel();
            }

            int direction = c.setNextArrowDirection();

            // 1. Remove the existing filter for this column so we don't get duplicates
            for(DataTableFilter checkFilter : activeFilters.toArray(DataTableFilter[]::new)){
                if(checkFilter.getDataIndex() == f){
                    removeActiveFilter(checkFilter);
                }
            }

            // 2. Add the new filter based on the click direction to the front (index 0) for highest priority
            switch(direction){
                case 1 -> {
                    addActiveFilter(0, new DataTableFilter(f, DataTableOrder.Desc));
                }
                case 2 -> {
                    addActiveFilter(0, new DataTableFilter(f, DataTableOrder.Asc));
                }
                // If direction is 0 (neutral), it just remains removed!
            }

            setCurrentFilterTitlePanel(c);
        };
    }
    
    private static SFilterTitlePanel currentFilterTitlePanel = null;
    
    private static void setCurrentFilterTitlePanel(SFilterTitlePanel c){
        currentFilterTitlePanel = c;
    }
    
    private static SFilterTitlePanel getCurrentFilterTitlePanel(){
        return currentFilterTitlePanel;
    }
    
    private static void resetCurrentFilterTitlePanel(){
        if(currentFilterTitlePanel != null) currentFilterTitlePanel.setArrowDirection(-1);
    }
    
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

                    UnitsDataTable[] dataBatch = UnitsDataHandler.getDataBatchSortedMulti(
                        refresh, 
                        activeFilters.toArray(DataTableFilter[]::new), 
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
        int height = (objects.size() * 60);
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
    
    // UI Elements for sPanel16 tracking
    private static java.awt.Component leftFiller;
    private static java.awt.Component rightFiller;
    private static java.awt.Component addFilterBtn;
    private static java.awt.Component clearFilterBtn;

    // Call this to initialize the fixed components of your Filter UI layout
    public static void initFilterUI() {
        int count = moduleUnits.sPanel16.getComponentCount();
        if(count >= 4) {
            // Grab the fixed elements based on your GUI builder layout
            leftFiller = moduleUnits.sPanel16.getComponent(0);
            rightFiller = moduleUnits.sPanel16.getComponent(count - 3);
            addFilterBtn = moduleUnits.sPanel16.getComponent(count - 2);
            clearFilterBtn = moduleUnits.sPanel16.getComponent(count - 1);
        }
    }
    
    // Updates the visual panel to exactly match the activeFilters array
    private static void refreshFilterUI(){
        if(leftFiller == null){
            return; // Safety check in case it hasn't initialized
        }
        moduleUnits.sPanel16.removeAll();
        moduleUnits.sPanel16.add(leftFiller); // 1. Add left spacer

        // 2. Loop through active filters BACKWARDS to reverse the display order
        for(int i = activeFilters.size() - 1; i >= 0; i--){
            ObjectUnitFilter filterComponent = new ObjectUnitFilter(activeFilters.get(i));
            moduleUnits.sPanel16.add(filterComponent);

            // Add the arrow separator (lassThan.png) if it's not the last filter being rendered
            // Since we are counting down to 0, we add an arrow as long as i > 0
            if(i > 0){
                FrameSystem.SLibrary.SComponents.SLabel arrow = new FrameSystem.SLibrary.SComponents.SLabel();
                arrow.setIconSize(8);
                arrow.setScaledIcon(new javax.swing.ImageIcon(ManagerObjectUnits.class.getResource("/Icons/lassThan.png")));
                moduleUnits.sPanel16.add(arrow);
            }
        }

        if(!activeFilters.isEmpty()){
            // 3. Add the trailing fixed UI items back
            moduleUnits.sPanel16.add(rightFiller);
        }
        moduleUnits.sPanel16.add(addFilterBtn);
        moduleUnits.sPanel16.add(clearFilterBtn);

        // 4. Force the panel to update visually
        moduleUnits.sPanel16.revalidate();
        moduleUnits.sPanel16.repaint();
    }

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
        refreshFilterUI(); // Sync UI
        activeFilterChanged();
    }
    
    public static void removeActiveFilter(DataTableFilter dataFilter){
        activeFilters.remove(dataFilter);
        refreshFilterUI(); // Sync UI
        activeFilterChanged();
    }
    
    public static void clearActiveFilter(){
        activeFilters.clear();
        refreshFilterUI(); // Sync UI
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

}