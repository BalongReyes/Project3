package FrameSystem.Layers.Units.Managers;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicLong;

import ConsoleSystem.Console;
import DatabaseSystem.DataTable.DataTableFilter;
import DatabaseSystem.UnitsData.UnitsDataHandler;
import DatabaseSystem.UnitsData.UnitsDataTable;
import EventSystem.Listeners.MousePressedAdaptor;
import FrameSystem.Layers.Units.Components.LayerUnits;
import FrameSystem.Layers.Units.Components.LayerUnits_Main;
import FrameSystem.Layers.Units.Components.LayerUnits_View;
import FrameSystem.Layers.Units.Components.ObjectUnit;
import FrameSystem.SLibrary.SComponents.SLabel;
import FrameSystem.SLibrary.SComponents.SPanel;
import java.awt.Component;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.concurrent.ExecutionException;
import javax.swing.SpinnerNumberModel;
import javax.swing.SwingUtilities;
import javax.swing.SwingWorker;

public class ManagerObjectUnits extends ManagerModuleUnits {

    private static ArrayList<ObjectUnit> objects = new ArrayList<>();
    
    public static int currentPage = 0; 
    public static int pageSize = 100;   
    public static int totalPages = 1;
    
    private static boolean selectFirstOnLoad = false;
    private static boolean selectLastOnLoad = false;
    
    private static boolean selectFirstRowOnLoad = false;
    private static boolean selectLastRowOnLoad = false;
    
    public static void initDefault() {
        moduleHome.layerHome_Units.addLayeredPanelShowListener((evt) -> {
            LayerUnits_Main.showLayer(moduleUnits.layerUnitsData);
            scrollToCurrentObject();
        });
        
        initPaginationControls();
        initViewControls();
        initKeyBindings();
    }
    
    public static void initPaginationControls() {
        SpinnerNumberModel spinnerModel = new SpinnerNumberModel(pageSize, 10, 500, 10);
        moduleUnits.jSpinner1.setModel(spinnerModel);
        
        moduleUnits.jSpinner1.addChangeListener(e -> {
            pageSize = (int) moduleUnits.jSpinner1.getValue();
            currentPage = 0; 
            refreshObjects();
        });

        moduleUnits.sPanel67.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                if (currentPage > 0) {
                    currentPage--;
                    refreshObjects();
                }
            }
        });

        moduleUnits.sPanel68.addMouseListener(new MouseAdapter(){
            @Override
            public void mousePressed(MouseEvent e){
                if(currentPage < totalPages - 1){
                    currentPage++;
                    refreshObjects();
                }
            }
        });
        
        javax.swing.JPanel[] pagePanels = {
            moduleUnits.sPanelPage1, moduleUnits.sPanelPage2, moduleUnits.sPanelPage3, 
            moduleUnits.sPanelPage4, moduleUnits.sPanelPage5, moduleUnits.sPanelPage6, 
            moduleUnits.sPanelPage7
        };

        for (javax.swing.JPanel p : pagePanels) {
            p.addMouseListener(new java.awt.event.MouseAdapter() {
                @Override
                public void mousePressed(java.awt.event.MouseEvent e) {
                    if (!p.isEnabled() || !p.isVisible()) return;
                    
                    String text = "";
                    for (java.awt.Component c : p.getComponents()) {
                        if (c instanceof javax.swing.JLabel) {
                            text = ((javax.swing.JLabel) c).getText();
                            break;
                        }
                    }
                    
                    if (!text.isEmpty() && !text.equals("...")) {
                        int targetPage = Integer.parseInt(text) - 1; 
                        if (currentPage != targetPage) {
                            currentPage = targetPage;
                            refreshObjects(); 
                        }
                    }
                }
            });
        }
        
        updatePaginationLabels();
    }

    public static void initViewControls() {
        moduleUnits.unitsView_Close.addMouseListener((MousePressedAdaptor) evt -> {
            LayerUnits_Main.showLayer(moduleUnits.layerUnitsData);
            scrollToCurrentObject();
            currentObject.requestFocusInWindow();
        });
        
        moduleUnits.unitsView_Previous.addMouseListener((MousePressedAdaptor) evt -> {
            if (currentObject == null) return;
            int index = objects.indexOf(currentObject);
            if (index > 0) {
                changeCurrentObject(objects.get(index - 1));
                showLayerUnitsView();
            } else if (currentPage > 0) {
                selectLastOnLoad = true;
                currentPage--;
                LayerUnits_View.showLayer(moduleUnits.layerUnits_ViewLoading);
                refreshObjects();
            }
        });
        
        moduleUnits.unitsView_Next.addMouseListener((MousePressedAdaptor) evt -> {
            if (currentObject == null) return;
            int index = objects.indexOf(currentObject);
            if (index >= 0 && index < objects.size() - 1) {
                changeCurrentObject(objects.get(index + 1));
                showLayerUnitsView();
            } else if (currentPage < totalPages - 1) {
                selectFirstOnLoad = true;
                currentPage++;
                LayerUnits_View.showLayer(moduleUnits.layerUnits_ViewLoading);
                refreshObjects();
            }
        });
    }

    public static void initKeyBindings() {
        javax.swing.InputMap im = moduleUnits.layerUnitsOnline.getInputMap(javax.swing.JComponent.WHEN_IN_FOCUSED_WINDOW);
        javax.swing.ActionMap am = moduleUnits.layerUnitsOnline.getActionMap();

        im.put(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_UP, 0), "selectPreviousRow");
        im.put(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_DOWN, 0), "selectNextRow");
        im.put(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_ENTER, 0), "viewCurrentRow");

        javax.swing.AbstractAction prevAction = new javax.swing.AbstractAction() {
            @Override
            public void actionPerformed(java.awt.event.ActionEvent e) {
                if (!moduleUnits.layerUnitsOnline.isShowing()) return;
                Component focusOwner = java.awt.KeyboardFocusManager.getCurrentKeyboardFocusManager().getFocusOwner();
                if (focusOwner instanceof javax.swing.text.JTextComponent) return; 
                selectPreviousRow();
            }
        };

        javax.swing.AbstractAction nextAction = new javax.swing.AbstractAction() {
            @Override
            public void actionPerformed(java.awt.event.ActionEvent e) {
                if (!moduleUnits.layerUnitsOnline.isShowing()) return;
                Component focusOwner = java.awt.KeyboardFocusManager.getCurrentKeyboardFocusManager().getFocusOwner();
                if (focusOwner instanceof javax.swing.text.JTextComponent) return; 
                selectNextRow();
            }
        };

        javax.swing.AbstractAction enterAction = new javax.swing.AbstractAction() {
            @Override
            public void actionPerformed(java.awt.event.ActionEvent e) {
                if (!moduleUnits.layerUnitsOnline.isShowing()) return;
                Component focusOwner = java.awt.KeyboardFocusManager.getCurrentKeyboardFocusManager().getFocusOwner();
                if (focusOwner instanceof javax.swing.text.JTextComponent) return; 
                if (currentObject != null) {
                    showLayerUnitsView();
                }
            }
        };

        am.put("selectPreviousRow", prevAction);
        am.put("selectNextRow", nextAction);
        am.put("viewCurrentRow", enterAction);

        javax.swing.ActionMap scrollAm = moduleUnits.sTable1.getScrollPane().getActionMap();
        scrollAm.put("unitScrollUp", prevAction);
        scrollAm.put("unitScrollDown", nextAction);
    }

    public static void selectPreviousRow() {
        if (objects.isEmpty()) return;
        if (currentObject == null) {
            changeCurrentObject(objects.get(0));
            scrollToCurrentObject();
            return;
        }
        int index = objects.indexOf(currentObject);
        if (index > 0) {
            changeCurrentObject(objects.get(index - 1));
            scrollToCurrentObject();
        } else if (currentPage > 0) {
            selectLastRowOnLoad = true;
            currentPage--;
            refreshObjects();
        }
    }

    public static void selectNextRow() {
        if (objects.isEmpty()) return;
        if (currentObject == null) {
            changeCurrentObject(objects.get(0));
            scrollToCurrentObject();
            return;
        }
        int index = objects.indexOf(currentObject);
        if (index >= 0 && index < objects.size() - 1) {
            changeCurrentObject(objects.get(index + 1));
            scrollToCurrentObject();
        } else if (currentPage < totalPages - 1) {
            selectFirstRowOnLoad = true;
            currentPage++;
            refreshObjects();
        }
    }

// ==== Main Methods =========================================================================================
    
// ---- Refresh ----------------------------------------------------------------------------------------------

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

    private static final AtomicLong currentRefreshId = new AtomicLong(0);

    private static void refreshObjectInBackground() {
        final long thisRefreshId = currentRefreshId.incrementAndGet();

        try {
            long startTime = System.currentTimeMillis();

            int limit = pageSize;
            int offset = currentPage * pageSize; 

            ArrayList<DataTableFilter> combinedFilters = ManagerFilterUnits.getFilters();
            DataTableFilter[] filtersArray = combinedFilters.toArray(new DataTableFilter[0]);
            
            int totalItems = UnitsDataHandler.getDataCountMulti(filtersArray);

            if (thisRefreshId != currentRefreshId.get()) return;

            totalPages = (int) Math.ceil((double) totalItems / pageSize);
            if (totalPages == 0) totalPages = 1;

            UnitsDataTable[] dataBatch = UnitsDataHandler.getDataBatchSortedMulti(filtersArray, limit, offset);

            long elapsedTime = System.currentTimeMillis() - startTime;
            long minLoadingTime = 1000;
            if (elapsedTime < minLoadingTime) {
                try {
                    Thread.sleep(minLoadingTime - elapsedTime);
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                }
            }

            if (thisRefreshId != currentRefreshId.get()) return;

            SwingUtilities.invokeLater(() -> {
                if (thisRefreshId != currentRefreshId.get()) return; 

                moduleUnits.sTable1.clearRows();
                objects.clear();
                resetOccupancyDataChart();
                resetTotalUnitsDataChart();

                updatePaginationLabels(); 

                if (dataBatch == null || dataBatch.length < pageSize) {
                    moduleUnits.sPanel68.setEnabled(false); 
                } else {
                    moduleUnits.sPanel68.setEnabled(true);
                }

                try {
                    int[] occupancyTotals = UnitsDataHandler.getOccupancyTotals(filtersArray);
                    int localOwners = occupancyTotals[0];
                    int localTenants = occupancyTotals[1];
                    int localOthers = occupancyTotals[2];

                    totalUnits = totalItems;
                    moduleUnits.sLabel26.setText(String.valueOf(totalItems)); 

                    moduleUnits.objectUnitDonutChart1.addData(localOwners, localTenants, localOthers);
                    updateOccupancyPercentage(localOwners, localTenants, localOthers);
                } catch (SQLException e) {
                    Console.errorOut("Fetching occupancy totals error", e);
                }

                if (dataBatch != null && dataBatch.length > 0) {
                    for (UnitsDataTable data : dataBatch) {
                        ObjectUnit o = new ObjectUnit(data);
                        o.setOnViewClick(()->{
                            changeCurrentObject(o);
                            showLayerUnitsView();
                        });
                        objects.add(o);
                        moduleUnits.sTable1.addRow(o);
                    }
                }
                
                if (selectFirstOnLoad && !objects.isEmpty()) {
                    changeCurrentObject(objects.get(0));
                    showLayerUnitsView();
                } else if (selectLastOnLoad && !objects.isEmpty()) {
                    changeCurrentObject(objects.get(objects.size() - 1));
                    showLayerUnitsView();
                } else if (selectFirstRowOnLoad && !objects.isEmpty()) {
                    changeCurrentObject(objects.get(0));
                    scrollToCurrentObject();
                } else if (selectLastRowOnLoad && !objects.isEmpty()) {
                    changeCurrentObject(objects.get(objects.size() - 1));
                    scrollToCurrentObject();
                }
                
                boolean requestFocus = selectFirstRowOnLoad || selectLastRowOnLoad;
                
                selectFirstOnLoad = false;
                selectLastOnLoad = false;
                selectFirstRowOnLoad = false;
                selectLastRowOnLoad = false;

                LayerUnits.showLayer(moduleUnits.layerUnitsOnline);
                
                if (requestFocus && currentObject != null) {
                    currentObject.requestFocusInWindow();
                }
            });

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
            i++;
        }
        object.setActive(true);
        currentObject = object;
    }

    public static void scrollToCurrentObject() {
        if (currentObject != null) {
            SwingUtilities.invokeLater(() -> {
                currentObject.scrollRectToVisible(new java.awt.Rectangle(0, 0, currentObject.getWidth(), currentObject.getHeight()));
            });
        }
    }

// ---- Page control -----------------------------------------------------------------------------------------
    
    public static void updatePaginationLabels() {
        int displayPage = currentPage + 1; 
        String[] slots = new String[7];

        if (totalPages <= 7) {
            slots[0] = totalPages >= 1 ? "1" : "";
            slots[1] = totalPages >= 2 ? "2" : "";
            slots[2] = totalPages >= 3 ? "3" : "";
            slots[3] = totalPages >= 4 ? "4" : "";
            slots[4] = totalPages >= 5 ? "5" : "";
            slots[5] = totalPages >= 6 ? "6" : "";
            slots[6] = totalPages >= 7 ? "7" : "";
        } else {
            if (displayPage <= 4) {
                slots[0] = "1";
                slots[1] = "2";
                slots[2] = "3";
                slots[3] = "4";
                slots[4] = "5";
                slots[5] = "...";
                slots[6] = String.valueOf(totalPages);
            } else if (displayPage >= totalPages - 3) {
                slots[0] = "1";
                slots[1] = "...";
                slots[2] = String.valueOf(totalPages - 4);
                slots[3] = String.valueOf(totalPages - 3);
                slots[4] = String.valueOf(totalPages - 2);
                slots[5] = String.valueOf(totalPages - 1);
                slots[6] = String.valueOf(totalPages);
            } else {
                slots[0] = "1";
                slots[1] = "...";
                slots[2] = String.valueOf(displayPage - 1);
                slots[3] = String.valueOf(displayPage);
                slots[4] = String.valueOf(displayPage + 1);
                slots[5] = "...";
                slots[6] = String.valueOf(totalPages);
            }
        }

        setPanelText(moduleUnits.sPanelPage1, slots[0], displayPage);
        setPanelText(moduleUnits.sPanelPage2, slots[1], displayPage);
        setPanelText(moduleUnits.sPanelPage3, slots[2], displayPage);
        setPanelText(moduleUnits.sPanelPage4, slots[3], displayPage);
        setPanelText(moduleUnits.sPanelPage5, slots[4], displayPage);
        setPanelText(moduleUnits.sPanelPage6, slots[5], displayPage);
        setPanelText(moduleUnits.sPanelPage7, slots[6], displayPage);
    }
    
    private static void setPanelText(SPanel panel, String text, int displayPage) {
        for (Component c : panel.getComponents()) {
            if (c instanceof SLabel label) {
                label.setText(text);
                break;
            }
        }
        
        panel.setVisible(!text.isEmpty()); 
        panel.setCanHover(!text.equals("...")); 
        
        boolean isCurrentPage = text.equals(String.valueOf(displayPage));
        panel.setActive(isCurrentPage);
    }
    
    public static void nextPage(){
        if(currentPage < totalPages - 1){
            currentPage++;
            refreshObjects();
        }
    }

    public static void previousPage() {
        if (currentPage > 0) {
            currentPage--;
            refreshObjects();
        }
    }

    public static void resetPage() {
        currentPage = 0;
        refreshObjects();
    }
    
// -----------------------------------------------------------------------------------------------------------
    
    private static int totalUnits = 0;
    
    public static void resetTotalUnitsDataChart() {
        totalUnits = 0;
    }
    
    public static void resetOccupancyDataChart() {
        moduleUnits.objectUnitDonutChart1.resetData();
    }
    
    private static void updateOccupancyPercentage(int owners, int tenants, int others) {
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
        if (currentObject == null) return;
        UnitsDataTable data = currentObject.getData();
        
        moduleUnits.unitsView_Title.setText("Unit " + data.tower() + "-" + data.floor() + (data.unit() < 10 ? "0" : "") + data.unit());
        moduleUnits.unitsView_Highlight.setUnitStatus(data.getUnitStatus());
        
        int index = objects.indexOf(currentObject);
        moduleUnits.unitsView_Previous.setVisible(index > 0 || currentPage > 0);
        moduleUnits.unitsView_Next.setVisible((index >= 0 && index < objects.size() - 1) || currentPage < totalPages - 1);
        
        LayerUnits_Main.showLayer(moduleUnits.layerUnitsView);
        LayerUnits_View.showLayer(moduleUnits.layerUnits_ViewOverview);
    }
    
}