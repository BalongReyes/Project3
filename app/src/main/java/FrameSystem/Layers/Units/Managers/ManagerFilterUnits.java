
package FrameSystem.Layers.Units.Managers;

import DatabaseSystem.DataTable.DataTableFilter;
import DatabaseSystem.DataTable.DataTableOrder;
import DatabaseSystem.UnitsData.UnitsDataTable;
import EventSystem.Listeners.MousePressedAdaptor;
import FrameSystem.SLibrary.SGenericComponents.SFilterTitlePanel;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;

public class ManagerFilterUnits extends ManagerModuleUnits{

    private static boolean isFilterTower1Active = false;
    private static boolean isFilterTower2Active = false;
    private static boolean isFilterTower3Active = false;
    
    public static void initDefault(){
        setDefaultFilters();
        
        moduleUnits.filterTower1.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e){
                moduleUnits.filterTower1.toggleActive();
                isFilterTower1Active = moduleUnits.filterTower1.isActive();
                ManagerFilterUnits.activeFilterChanged();
            }
        });
        
        moduleUnits.filterTower2.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e){
                moduleUnits.filterTower2.toggleActive();
                isFilterTower2Active = moduleUnits.filterTower2.isActive();
                ManagerFilterUnits.activeFilterChanged();
            }
        });
        
        moduleUnits.filterTower3.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e){
                moduleUnits.filterTower3.toggleActive();
                isFilterTower3Active = moduleUnits.filterTower3.isActive();
                ManagerFilterUnits.activeFilterChanged();
            }
        });
        
        setFilterTitle(moduleUnits.sFilterTitlePanel1);
        setFilterTitle(moduleUnits.sFilterTitlePanel2);
        setFilterTitle(moduleUnits.sFilterTitlePanel3);
        setFilterTitle(moduleUnits.sFilterTitlePanel5);
        setFilterTitle(moduleUnits.sFilterTitlePanel6);
        setFilterTitle(moduleUnits.sFilterTitlePanel7);
    }
    
    public static void setFilterTitle(SFilterTitlePanel filterTitle){
        filterTitle.addMouseListener((MousePressedAdaptor) (MouseEvent e) -> {
            int direction = filterTitle.setNextArrowDirection();

            DataTableOrder order = null;
            if(direction == 1){
                order = DataTableOrder.DESC;
            }else if(direction == 2){
                order = DataTableOrder.ASC;
            }

            int dataIndex = filterTitle.getDataIndex(); 

            // Make sure no other filtertitle is set to 1 or 2 (reset to neutral: -1)
            SFilterTitlePanel[] allFilterPanels = {
                moduleUnits.sFilterTitlePanel1, moduleUnits.sFilterTitlePanel2,
                moduleUnits.sFilterTitlePanel3, moduleUnits.sFilterTitlePanel5,
                moduleUnits.sFilterTitlePanel6, moduleUnits.sFilterTitlePanel7
            };
            
            for (SFilterTitlePanel panel : allFilterPanels) {
                if (panel != null && panel != filterTitle) {
                    panel.setArrowDirection(-1);
                }
            }

            // Remove ONLY the previously active dynamic header sort.
            // This safely protects your default Tower -> Floor -> Unit filters!
            if (activeHeaderSortFilter != null) {
                activeFilters.remove(activeHeaderSortFilter);
                activeHeaderSortFilter = null;
            }

            // Add the new filter to index 0, so it takes priority over the defaults
            if(order != null){
                activeHeaderSortFilter = new DataTableFilter(dataIndex, order);
                addActiveFilter(0, activeHeaderSortFilter);
            }else{
                activeFilterChanged();
            }
        });
    }
    
// -----------------------------------------------------------------------------------------------------------
    
    public static ArrayList<DataTableFilter> getFilters(){
        ArrayList<DataTableFilter> combinedFilters = new ArrayList<>(activeFilters);
                
        if (isFilterTower1Active) combinedFilters.add(new DataTableFilter(UnitsDataTable.TOWER, DataTableOrder.WHERE, "1"));
        if (isFilterTower2Active) combinedFilters.add(new DataTableFilter(UnitsDataTable.TOWER, DataTableOrder.WHERE, "2"));
        if (isFilterTower3Active) combinedFilters.add(new DataTableFilter(UnitsDataTable.TOWER, DataTableOrder.WHERE, "3"));
        
        return combinedFilters;
    }
    
// ---- Filters ----------------------------------------------------------------------------------------------
    
    private static javax.swing.Timer filterDebounceTimer;
    
    // Track multiple active filters
    private static ArrayList<DataTableFilter> activeFilters = new ArrayList<>();
    
    private static DataTableFilter activeHeaderSortFilter = null;
    
    public static void setDefaultFilters() {
        clearActiveFilter();
        // Default sort priority: Tower -> Floor -> Unit (Ascending)
        addActiveFilter(new DataTableFilter(UnitsDataTable.TOWER, DataTableOrder.ASC));
        addActiveFilter(new DataTableFilter(UnitsDataTable.FLOOR, DataTableOrder.ASC));
        addActiveFilter(new DataTableFilter(UnitsDataTable.UNIT, DataTableOrder.ASC));
    }
    
    public static void addActiveFilter(DataTableFilter dataFilter){
        addActiveFilter(null, dataFilter);
    }
    
    public static void addActiveFilter(Integer n, DataTableFilter dataFilter){
        if(n != null){
            activeFilters.add(n, dataFilter);
        } else {
            activeFilters.add(dataFilter);
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
                ManagerObjectUnits.resetPage(); 
            });
            filterDebounceTimer.setRepeats(false);
            filterDebounceTimer.start();
        }
    }

}
