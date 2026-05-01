package FrameSystem.Layers.Tenants.Managers;

import DatabaseSystem.DataTable.DataTableFilter;
import DatabaseSystem.DataTable.DataTableOrder;
import DatabaseSystem.UnitTenantsData.UnitTenantsDataTable;
import EventSystem.Listeners.MousePressedAdaptor;
import FrameSystem.SLibrary.SGenericComponents.SFilterTitlePanel;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ManagerFilterUnitTenants extends ManagerModuleUnitTenants {

    private static boolean isFilterTower1Active = false;
    private static boolean isFilterTower2Active = false;
    private static boolean isFilterTower3Active = false;
    
// ==== Initialization =======================================================================================

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
        
        setFilterTitle(moduleUnitTenants.sFilterTitlePanel_Tower);
        setFilterTitle(moduleUnitTenants.sFilterTitlePanel_Floor);
        setFilterTitle(moduleUnitTenants.sFilterTitlePanel_Unit);
        setFilterTitle(moduleUnitTenants.sFilterTitlePanel_LastName);
        setFilterTitle(moduleUnitTenants.sFilterTitlePanel_FirstName);
        setFilterTitle(moduleUnitTenants.sFilterTitlePanel_MiddleName);
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
                moduleUnitTenants.sFilterTitlePanel_Tower, moduleUnitTenants.sFilterTitlePanel_Floor,
                moduleUnitTenants.sFilterTitlePanel_Unit, moduleUnitTenants.sFilterTitlePanel_LastName,
                moduleUnitTenants.sFilterTitlePanel_FirstName, moduleUnitTenants.sFilterTitlePanel_MiddleName
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
        ArrayList<DataTableFilter> combinedFilters;
        synchronized(activeFilters) {
            combinedFilters = new ArrayList<>(activeFilters);
        }
                
        if (isFilterTower1Active) combinedFilters.add(new DataTableFilter(UnitTenantsDataTable.TOWER, DataTableOrder.WHERE, "1"));
        if (isFilterTower2Active) combinedFilters.add(new DataTableFilter(UnitTenantsDataTable.TOWER, DataTableOrder.WHERE, "2"));
        if (isFilterTower3Active) combinedFilters.add(new DataTableFilter(UnitTenantsDataTable.TOWER, DataTableOrder.WHERE, "3"));
        
        return combinedFilters;
    }
    
// ---- Filters ----------------------------------------------------------------------------------------------
    
    private static javax.swing.Timer filterDebounceTimer;
    
    private static final List<DataTableFilter> activeFilters = Collections.synchronizedList(new ArrayList<>());
    
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