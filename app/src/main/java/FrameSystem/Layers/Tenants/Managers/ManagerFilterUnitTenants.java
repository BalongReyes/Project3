
package FrameSystem.Layers.Tenants.Managers;

import DatabaseSystem.DataTable.DataTableFilter;
import FrameSystem.SLibrary.SGenericComponents.SFilterTitlePanel;
import java.util.ArrayList;

public class ManagerFilterUnitTenants extends ManagerModuleUnitTenants{

    
    public static void initDefault(){
    }
    
    public static void setFilterTitle(SFilterTitlePanel filterTitle){
    }
    
// -----------------------------------------------------------------------------------------------------------
    
    public static ArrayList<DataTableFilter> getFilters(){
        ArrayList<DataTableFilter> combinedFilters = new ArrayList<>(activeFilters);
                
        return combinedFilters;
    }
    
// ---- Filters ----------------------------------------------------------------------------------------------
    
    private static javax.swing.Timer filterDebounceTimer;
    
    // Track multiple active filters
    private static ArrayList<DataTableFilter> activeFilters = new ArrayList<>();
    
    private static DataTableFilter activeHeaderSortFilter = null;
    
    public static void setDefaultFilters() {
        clearActiveFilter();
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
//                ManagerObjectUnitTenants.resetPage(); FIX
            });
            filterDebounceTimer.setRepeats(false);
            filterDebounceTimer.start();
        }
    }

}
