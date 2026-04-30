package FrameSystem.Layers.Tenants.Managers;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;

import DatabaseSystem.DataTable.DataTableFilter;
import DatabaseSystem.DataTable.DataTableOrder;
import DatabaseSystem.UnitTenantsData.UnitTenantsDataTable;
import EventSystem.Listeners.MousePressedAdaptor;
import FrameSystem.SLibrary.SGenericComponents.SFilterTitlePanel;

public class ManagerFilterUnitTenants extends ManagerModuleUnitTenants {

    private static boolean isFilterTower1Active = false;
    private static boolean isFilterTower2Active = false;
    private static boolean isFilterTower3Active = false;
    
    public static void initDefault(){
        setDefaultFilters();
        
        moduleUnitTenants.filterTower1.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e){
                moduleUnitTenants.filterTower1.toggleActive();
                isFilterTower1Active = moduleUnitTenants.filterTower1.isActive();
                ManagerFilterUnitTenants.activeFilterChanged();
            }
        });
        
        moduleUnitTenants.filterTower2.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e){
                moduleUnitTenants.filterTower2.toggleActive();
                isFilterTower2Active = moduleUnitTenants.filterTower2.isActive();
                ManagerFilterUnitTenants.activeFilterChanged();
            }
        });
        
        moduleUnitTenants.filterTower3.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e){
                moduleUnitTenants.filterTower3.toggleActive();
                isFilterTower3Active = moduleUnitTenants.filterTower3.isActive();
                ManagerFilterUnitTenants.activeFilterChanged();
            }
        });
        
        setFilterTitle(moduleUnitTenants.sFilterTitlePanel1);
        setFilterTitle(moduleUnitTenants.sFilterTitlePanel2);
        setFilterTitle(moduleUnitTenants.sFilterTitlePanel3);
        setFilterTitle(moduleUnitTenants.sFilterTitlePanel5);
        setFilterTitle(moduleUnitTenants.sFilterTitlePanel6);
        setFilterTitle(moduleUnitTenants.sFilterTitlePanel7);
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

            SFilterTitlePanel[] allFilterPanels = {
                moduleUnitTenants.sFilterTitlePanel1, moduleUnitTenants.sFilterTitlePanel2,
                moduleUnitTenants.sFilterTitlePanel3, moduleUnitTenants.sFilterTitlePanel5,
                moduleUnitTenants.sFilterTitlePanel6, moduleUnitTenants.sFilterTitlePanel7
            };
            
            for (SFilterTitlePanel panel : allFilterPanels) {
                if (panel != null && panel != filterTitle) {
                    panel.setArrowDirection(-1);
                }
            }

            if (activeHeaderSortFilter != null) {
                activeFilters.remove(activeHeaderSortFilter);
                activeHeaderSortFilter = null;
            }

            if(order != null){
                activeHeaderSortFilter = new DataTableFilter(dataIndex, order);
                addActiveFilter(0, activeHeaderSortFilter);
            }else{
                activeFilterChanged();
            }
        });
    }
    
// ---- Filter Retrievals ------------------------------------------------------------------------------------
    
    public static ArrayList<DataTableFilter> getFilters(){
        ArrayList<DataTableFilter> combinedFilters = new ArrayList<>(activeFilters);
                
        // Ensure your UnitTenantsDataTable has the TOWER index defined if you are filtering by tower
        if (isFilterTower1Active) combinedFilters.add(new DataTableFilter(UnitTenantsDataTable.TOWER, DataTableOrder.WHERE, "1"));
        if (isFilterTower2Active) combinedFilters.add(new DataTableFilter(UnitTenantsDataTable.TOWER, DataTableOrder.WHERE, "2"));
        if (isFilterTower3Active) combinedFilters.add(new DataTableFilter(UnitTenantsDataTable.TOWER, DataTableOrder.WHERE, "3"));
        
        return combinedFilters;
    }
    
// ---- Filters ----------------------------------------------------------------------------------------------
    
    private static javax.swing.Timer filterDebounceTimer;
    
    private static ArrayList<DataTableFilter> activeFilters = new ArrayList<>();
    
    private static DataTableFilter activeHeaderSortFilter = null;
    
    public static void setDefaultFilters() {
        clearActiveFilter();
        addActiveFilter(new DataTableFilter(UnitTenantsDataTable.TOWER, DataTableOrder.ASC));
        addActiveFilter(new DataTableFilter(UnitTenantsDataTable.FLOOR, DataTableOrder.ASC));
        addActiveFilter(new DataTableFilter(UnitTenantsDataTable.UNIT, DataTableOrder.ASC));
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
                ManagerObjectUnitTenants.resetPage(); 
            });
            filterDebounceTimer.setRepeats(false);
            filterDebounceTimer.start();
        }
    }
}