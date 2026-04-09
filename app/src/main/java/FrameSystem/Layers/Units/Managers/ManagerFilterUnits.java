
package FrameSystem.Layers.Units.Managers;

import DatabaseSystem.DataTable.DataTableFilter;
import DatabaseSystem.DataTable.DataTableOrder;
import DatabaseSystem.UnitsData.UnitsDataTable;
import static FrameSystem.Layers.Units.Managers.ManagerModuleUnits.moduleUnits;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;

public class ManagerFilterUnits extends ManagerModuleUnits{

    public static void initDefault(){
        setDefaultFilters();
        
        moduleUnits.filterTower1.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e){
                toggleFilterTower(1);
            }
        });
        
        moduleUnits.filterTower2.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e){
                toggleFilterTower(2);
            }
        });
        
        moduleUnits.filterTower3.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e){
                toggleFilterTower(3);
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
    
// ---- Tower Filters ----------------------------------------------------------------------------------------
    
    private static boolean isFilterTower1Active = false;
    private static boolean isFilterTower2Active = false;
    private static boolean isFilterTower3Active = false;
    
    public static void toggleFilterTower(int tower){
        switch(tower){
            case 1 -> {
                moduleUnits.filterTower1.toggleActive();
                isFilterTower1Active = moduleUnits.filterTower1.isActive();
            }
            case 2 -> {
                moduleUnits.filterTower2.toggleActive();
                isFilterTower2Active = moduleUnits.filterTower2.isActive();
            }
            case 3 -> {
                moduleUnits.filterTower3.toggleActive();
                isFilterTower3Active = moduleUnits.filterTower3.isActive();
            }
        }
        ManagerFilterUnits.activeFilterChanged();
    }
    
// ---- Filters ----------------------------------------------------------------------------------------------
    
    private static javax.swing.Timer filterDebounceTimer;
    
    // Track multiple active filters
    private static ArrayList<DataTableFilter> activeFilters = new ArrayList<>();
    
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
                ManagerObjectUnits.refreshObjects();
            });
            filterDebounceTimer.setRepeats(false);
            filterDebounceTimer.start();
        }
    }

}
