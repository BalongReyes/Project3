package FrameSystem.Layers.Owners.Managers;

import DatabaseSystem.DataTable.DataTableFilter;
import DatabaseSystem.DataTable.DataTableOrder;
import DatabaseSystem.UnitOwnersData.UnitOwnersDataTable;
import EventSystem.Listeners.MousePressedAdaptor;
import FrameSystem.SLibrary.SGenericComponents.SFilterTitlePanel;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ManagerFilterUnitOwners extends ManagerModuleUnitOwner {

    private static boolean isFilterTower1Active = false;
    private static boolean isFilterTower2Active = false;
    private static boolean isFilterTower3Active = false;
    
// ==== Initialization =======================================================================================

    public static void initDefault(){
        setDefaultFilters();
        
        moduleUnitOwners.filterTower1.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e){
                moduleUnitOwners.filterTower1.toggleActive();
                isFilterTower1Active = moduleUnitOwners.filterTower1.isActive();
                ManagerFilterUnitOwners.activeFilterChanged();
            }
        });
        
        moduleUnitOwners.filterTower2.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e){
                moduleUnitOwners.filterTower2.toggleActive();
                isFilterTower2Active = moduleUnitOwners.filterTower2.isActive();
                ManagerFilterUnitOwners.activeFilterChanged();
            }
        });
        
        moduleUnitOwners.filterTower3.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e){
                moduleUnitOwners.filterTower3.toggleActive();
                isFilterTower3Active = moduleUnitOwners.filterTower3.isActive();
                ManagerFilterUnitOwners.activeFilterChanged();
            }
        });
        
        setFilterTitle(moduleUnitOwners.sFilterTitlePanel_Tower);
        setFilterTitle(moduleUnitOwners.sFilterTitlePanel_Floor);
        setFilterTitle(moduleUnitOwners.sFilterTitlePanel_Unit);
        setFilterTitle(moduleUnitOwners.sFilterTitlePanel_LastName);
        setFilterTitle(moduleUnitOwners.sFilterTitlePanel_FirstName);
        setFilterTitle(moduleUnitOwners.sFilterTitlePanel_MiddleName);
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
                moduleUnitOwners.sFilterTitlePanel_Tower, moduleUnitOwners.sFilterTitlePanel_Floor,
                moduleUnitOwners.sFilterTitlePanel_Unit, moduleUnitOwners.sFilterTitlePanel_LastName,
                moduleUnitOwners.sFilterTitlePanel_FirstName, moduleUnitOwners.sFilterTitlePanel_MiddleName
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
                
        // Ensure your UnitOwnersDataTable has the TOWER index defined if you are filtering by tower
        if (isFilterTower1Active) combinedFilters.add(new DataTableFilter(UnitOwnersDataTable.TOWER, DataTableOrder.WHERE, "1"));
        if (isFilterTower2Active) combinedFilters.add(new DataTableFilter(UnitOwnersDataTable.TOWER, DataTableOrder.WHERE, "2"));
        if (isFilterTower3Active) combinedFilters.add(new DataTableFilter(UnitOwnersDataTable.TOWER, DataTableOrder.WHERE, "3"));
        
        return combinedFilters;
    }
    
// ---- Filters ----------------------------------------------------------------------------------------------
    
    private static javax.swing.Timer filterDebounceTimer;
    
    private static final List<DataTableFilter> activeFilters = Collections.synchronizedList(new ArrayList<>());
    
    private static DataTableFilter activeHeaderSortFilter = null;
    
    public static void setDefaultFilters() {
        clearActiveFilter();
        addActiveFilter(new DataTableFilter(UnitOwnersDataTable.TOWER, DataTableOrder.ASC));
        addActiveFilter(new DataTableFilter(UnitOwnersDataTable.FLOOR, DataTableOrder.ASC));
        addActiveFilter(new DataTableFilter(UnitOwnersDataTable.UNIT, DataTableOrder.ASC));
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
                ManagerObjectUnitOwner.resetPage(); 
            });
            filterDebounceTimer.setRepeats(false);
            filterDebounceTimer.start();
        }
    }
}