package FrameSystem.Layers.Units.Module;

import DatabaseSystem.UnitsData.UnitsDataTable;
import FrameSystem.SLibrary.SComponents.SPanel;

public class ModuleUnits extends SPanel{

    public ModuleUnits(){
        initComponents();
        setOpaque(false);
        setDoubleBuffered(true);
        
        for(int i = 1; i <= 20; i++){
            sComboBox1.addItem("Test " + i);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        sPanel138 = new FrameSystem.SLibrary.SComponents.SPanel();
        sTextFieldContainer1 = new FrameSystem.SLibrary.SGenericComponents.STextFieldContainer();
        sTextField1 = new FrameSystem.SLibrary.SComponents.STextField();
        sLabel1 = new FrameSystem.SLibrary.SComponents.SLabel();
        sPanel36 = new FrameSystem.SLibrary.SComponents.SPanel();
        sLabel19 = new FrameSystem.SLibrary.SComponents.SLabel();
        sPanel42 = new FrameSystem.SLibrary.SComponents.SPanel();
        sLabel20 = new FrameSystem.SLibrary.SComponents.SLabel();
        sPanel33 = new FrameSystem.SLibrary.SComponents.SPanel();
        sPanel43 = new FrameSystem.SLibrary.SComponents.SPanel();
        sPanel23 = new FrameSystem.SLibrary.SComponents.SPanel();
        sLabel30 = new FrameSystem.SLibrary.SComponents.SLabel();
        sPanel44 = new FrameSystem.SLibrary.SComponents.SPanel();
        sPanel19 = new FrameSystem.SLibrary.SComponents.SPanel();
        sLabel28 = new FrameSystem.SLibrary.SComponents.SLabel();
        sLabel29 = new FrameSystem.SLibrary.SComponents.SLabel();
        sPanel45 = new FrameSystem.SLibrary.SComponents.SPanel();
        sPanel41 = new FrameSystem.SLibrary.SComponents.SPanel();
        sPanel11 = new FrameSystem.SLibrary.SComponents.SPanel();
        sPanel24 = new FrameSystem.SLibrary.SComponents.SPanel();
        sLabel7 = new FrameSystem.SLibrary.SComponents.SLabel();
        sPanel37 = new FrameSystem.SLibrary.SComponents.SPanel();
        sPanel38 = new FrameSystem.SLibrary.SComponents.SPanel();
        sLabel25 = new FrameSystem.SLibrary.SComponents.SLabel();
        sPanel39 = new FrameSystem.SLibrary.SComponents.SPanel();
        sPanel40 = new FrameSystem.SLibrary.SComponents.SPanel();
        sLabel27 = new FrameSystem.SLibrary.SComponents.SLabel();
        sPanel47 = new FrameSystem.SLibrary.SComponents.SPanel();
        sPanel48 = new FrameSystem.SLibrary.SComponents.SPanel();
        objectUnitDonutChart1 = new FrameSystem.Layers.Units.Components.ObjectUnitDonutChart();
        sPanel50 = new FrameSystem.SLibrary.SComponents.SPanel();
        sPanel51 = new FrameSystem.SLibrary.SComponents.SPanel();
        sLabel32 = new FrameSystem.SLibrary.SComponents.SLabel();
        sLabel33 = new FrameSystem.SLibrary.SComponents.SLabel();
        sPanel52 = new FrameSystem.SLibrary.SComponents.SPanel();
        sPanel53 = new FrameSystem.SLibrary.SComponents.SPanel();
        sPanel54 = new FrameSystem.SLibrary.SComponents.SPanel();
        sPanel55 = new FrameSystem.SLibrary.SComponents.SPanel();
        sLabel34 = new FrameSystem.SLibrary.SComponents.SLabel();
        sPanel56 = new FrameSystem.SLibrary.SComponents.SPanel();
        sPanel57 = new FrameSystem.SLibrary.SComponents.SPanel();
        sLabel35 = new FrameSystem.SLibrary.SComponents.SLabel();
        sPanel58 = new FrameSystem.SLibrary.SComponents.SPanel();
        sPanel59 = new FrameSystem.SLibrary.SComponents.SPanel();
        sLabel36 = new FrameSystem.SLibrary.SComponents.SLabel();
        sPanel35 = new FrameSystem.SLibrary.SComponents.SPanel();
        sPanel25 = new FrameSystem.SLibrary.SComponents.SPanel();
        sPanel5 = new FrameSystem.SLibrary.SComponents.SPanel();
        sLabel5 = new FrameSystem.SLibrary.SComponents.SLabel();
        sPanel26 = new FrameSystem.SLibrary.SComponents.SPanel();
        sPanel16 = new FrameSystem.SLibrary.SComponents.SPanel();
        sLabel24 = new FrameSystem.SLibrary.SComponents.SLabel();
        sLabel26 = new FrameSystem.SLibrary.SComponents.SLabel();
        sPanel1 = new FrameSystem.SLibrary.SComponents.SPanel();
        jLayeredPane2 = new javax.swing.JLayeredPane();
        layerUnitsData = new FrameSystem.Layers.Units.Components.LayerUnits_Main();
        sPanel2 = new FrameSystem.SLibrary.SComponents.SPanel();
        sPanel3 = new FrameSystem.SLibrary.SComponents.SPanel();
        sPanel20 = new FrameSystem.SLibrary.SComponents.SPanel();
        filler6 = new javax.swing.Box.Filler(new java.awt.Dimension(25, 0), new java.awt.Dimension(25, 0), new java.awt.Dimension(25, 32767));
        sPanel7 = new FrameSystem.SLibrary.SComponents.SPanel();
        sFilterTitlePanel1 = new FrameSystem.SLibrary.SGenericComponents.SFilterTitlePanel();
        sPanel8 = new FrameSystem.SLibrary.SComponents.SPanel();
        sFilterTitlePanel2 = new FrameSystem.SLibrary.SGenericComponents.SFilterTitlePanel();
        sPanel9 = new FrameSystem.SLibrary.SComponents.SPanel();
        sFilterTitlePanel3 = new FrameSystem.SLibrary.SGenericComponents.SFilterTitlePanel();
        filler9 = new javax.swing.Box.Filler(new java.awt.Dimension(30, 0), new java.awt.Dimension(30, 0), new java.awt.Dimension(30, 32767));
        sPanel22 = new FrameSystem.SLibrary.SComponents.SPanel();
        sLabel21 = new FrameSystem.SLibrary.SComponents.SLabel();
        filler1 = new javax.swing.Box.Filler(new java.awt.Dimension(30, 0), new java.awt.Dimension(30, 0), new java.awt.Dimension(30, 32767));
        sPanel6 = new FrameSystem.SLibrary.SComponents.SPanel();
        sPanel29 = new FrameSystem.SLibrary.SComponents.SPanel();
        sFilterTitlePanel5 = new FrameSystem.SLibrary.SGenericComponents.SFilterTitlePanel();
        sPanel10 = new FrameSystem.SLibrary.SComponents.SPanel();
        sFilterTitlePanel6 = new FrameSystem.SLibrary.SGenericComponents.SFilterTitlePanel();
        sPanel12 = new FrameSystem.SLibrary.SComponents.SPanel();
        sFilterTitlePanel7 = new FrameSystem.SLibrary.SGenericComponents.SFilterTitlePanel();
        sPanel13 = new FrameSystem.SLibrary.SComponents.SPanel();
        sLabel17 = new FrameSystem.SLibrary.SComponents.SLabel();
        sPanel14 = new FrameSystem.SLibrary.SComponents.SPanel();
        sLabel18 = new FrameSystem.SLibrary.SComponents.SLabel();
        sPanel28 = new FrameSystem.SLibrary.SComponents.SPanel();
        sLabel22 = new FrameSystem.SLibrary.SComponents.SLabel();
        filler8 = new javax.swing.Box.Filler(new java.awt.Dimension(6, 0), new java.awt.Dimension(6, 0), new java.awt.Dimension(6, 32767));
        sPanel15 = new FrameSystem.SLibrary.SComponents.SPanel();
        sLabel6 = new FrameSystem.SLibrary.SComponents.SLabel();
        filler10 = new javax.swing.Box.Filler(new java.awt.Dimension(7, 0), new java.awt.Dimension(7, 0), new java.awt.Dimension(7, 32767));
        jLayeredPane1 = new javax.swing.JLayeredPane();
        layerUnitsOffline = new FrameSystem.Layers.Units.Components.LayerUnits();
        jPanel1 = new javax.swing.JPanel();
        sLabel2 = new FrameSystem.SLibrary.SComponents.SLabel();
        sAnimatedOffline1 = new FrameSystem.SLibrary.SAnimated.SAnimatedOffline();
        layerUnitsLoading = new FrameSystem.Layers.Units.Components.LayerUnits();
        jPanel2 = new javax.swing.JPanel();
        sLabel3 = new FrameSystem.SLibrary.SComponents.SLabel();
        sAnimatedOffline4 = new FrameSystem.SLibrary.SAnimated.SAnimatedOffline();
        layerUnitsOnline = new FrameSystem.Layers.Units.Components.LayerUnits();
        sTable1 = new FrameSystem.SLibrary.SComponents.STable();
        layerUnitsNull = new FrameSystem.Layers.Units.Components.LayerUnits();
        sPanel63 = new FrameSystem.SLibrary.SComponents.SPanel();
        sPanel18 = new FrameSystem.SLibrary.SComponents.SPanel();
        sPanel32 = new FrameSystem.SLibrary.SComponents.SPanel();
        filterTower1 = new FrameSystem.SLibrary.SComponents.SPanel();
        sLabel4 = new FrameSystem.SLibrary.SComponents.SLabel();
        sPanel30 = new FrameSystem.SLibrary.SComponents.SPanel();
        filterTower2 = new FrameSystem.SLibrary.SComponents.SPanel();
        sLabel10 = new FrameSystem.SLibrary.SComponents.SLabel();
        sPanel31 = new FrameSystem.SLibrary.SComponents.SPanel();
        filterTower3 = new FrameSystem.SLibrary.SComponents.SPanel();
        sLabel11 = new FrameSystem.SLibrary.SComponents.SLabel();
        sPanel46 = new FrameSystem.SLibrary.SComponents.SPanel();
        sLabel8 = new FrameSystem.SLibrary.SComponents.SLabel();
        jSpinner1 = new javax.swing.JSpinner();
        sPanel27 = new FrameSystem.SLibrary.SComponents.SPanel();
        sPanelPrevious = new FrameSystem.SLibrary.SComponents.SPanel();
        sPanel67 = new FrameSystem.SLibrary.SComponents.SPanel();
        sLabel9 = new FrameSystem.SLibrary.SComponents.SLabel();
        sPanel60 = new FrameSystem.SLibrary.SComponents.SPanel();
        sPanelPage1 = new FrameSystem.SLibrary.SComponents.SPanel();
        sLabel23 = new FrameSystem.SLibrary.SComponents.SLabel();
        sPanel62 = new FrameSystem.SLibrary.SComponents.SPanel();
        sPanelPage2 = new FrameSystem.SLibrary.SComponents.SPanel();
        sLabel39 = new FrameSystem.SLibrary.SComponents.SLabel();
        sPanel64 = new FrameSystem.SLibrary.SComponents.SPanel();
        sPanelPage3 = new FrameSystem.SLibrary.SComponents.SPanel();
        sLabel40 = new FrameSystem.SLibrary.SComponents.SLabel();
        sPanel65 = new FrameSystem.SLibrary.SComponents.SPanel();
        sPanelPage4 = new FrameSystem.SLibrary.SComponents.SPanel();
        sLabel41 = new FrameSystem.SLibrary.SComponents.SLabel();
        sPanel66 = new FrameSystem.SLibrary.SComponents.SPanel();
        sPanelPage5 = new FrameSystem.SLibrary.SComponents.SPanel();
        sLabel42 = new FrameSystem.SLibrary.SComponents.SLabel();
        sPanel74 = new FrameSystem.SLibrary.SComponents.SPanel();
        sPanelPage6 = new FrameSystem.SLibrary.SComponents.SPanel();
        sLabel43 = new FrameSystem.SLibrary.SComponents.SLabel();
        sPanel76 = new FrameSystem.SLibrary.SComponents.SPanel();
        sPanelPage7 = new FrameSystem.SLibrary.SComponents.SPanel();
        sLabel44 = new FrameSystem.SLibrary.SComponents.SLabel();
        sPanelNext = new FrameSystem.SLibrary.SComponents.SPanel();
        sPanel68 = new FrameSystem.SLibrary.SComponents.SPanel();
        sLabel12 = new FrameSystem.SLibrary.SComponents.SLabel();
        layerUnitsView = new FrameSystem.Layers.Units.Components.LayerUnits_Main();
        sPanel17 = new FrameSystem.SLibrary.SComponents.SPanel();
        unitsView_Title = new FrameSystem.SLibrary.SComponents.SLabel();
        unitsView_Highlight = new FrameSystem.Layers.Units.Components.ObjectUnitHighlight();
        sPanel70 = new FrameSystem.SLibrary.SComponents.SPanel();
        unitsView_Previous = new FrameSystem.SLibrary.SComponents.SPanel();
        sLabel13 = new FrameSystem.SLibrary.SComponents.SLabel();
        unitsView_Next = new FrameSystem.SLibrary.SComponents.SPanel();
        sLabel14 = new FrameSystem.SLibrary.SComponents.SLabel();
        unitsView_Close = new FrameSystem.SLibrary.SComponents.SPanel();
        sLabel15 = new FrameSystem.SLibrary.SComponents.SLabel();
        sPanel69 = new FrameSystem.SLibrary.SComponents.SPanel();
        buttonUnits_ViewTabOverview = new FrameSystem.Layers.Units.Components.ButtonUnits_ViewTab();
        buttonUnits_ViewTabDocuments = new FrameSystem.Layers.Units.Components.ButtonUnits_ViewTab();
        buttonUnits_ViewTabConcerns = new FrameSystem.Layers.Units.Components.ButtonUnits_ViewTab();
        buttonUnits_ViewTabVisitors = new FrameSystem.Layers.Units.Components.ButtonUnits_ViewTab();
        buttonUnits_ViewTabActivityLog = new FrameSystem.Layers.Units.Components.ButtonUnits_ViewTab();
        buttonUnits_ViewTabViolations = new FrameSystem.Layers.Units.Components.ButtonUnits_ViewTab();
        sPanel4 = new FrameSystem.SLibrary.SComponents.SPanel();
        jLayeredPane3 = new javax.swing.JLayeredPane();
        layerUnits_ViewLoading = new FrameSystem.Layers.Units.Components.LayerUnits_View();
        jPanel3 = new javax.swing.JPanel();
        sLabel16 = new FrameSystem.SLibrary.SComponents.SLabel();
        sAnimatedOffline5 = new FrameSystem.SLibrary.SAnimated.SAnimatedOffline();
        layerUnits_ViewOverview = new FrameSystem.Layers.Units.Components.LayerUnits_View();
        sPanel86 = new FrameSystem.SLibrary.SComponents.SPanel();
        sPanel71 = new FrameSystem.SLibrary.SComponents.SPanel();
        sPanel75 = new FrameSystem.SLibrary.SComponents.SPanel();
        sPanel81 = new FrameSystem.SLibrary.SComponents.SPanel();
        sLabel57 = new FrameSystem.SLibrary.SComponents.SLabel();
        unitsViewOverview_Edit = new FrameSystem.SLibrary.SComponents.SPanel();
        sLabel46 = new FrameSystem.SLibrary.SComponents.SLabel();
        sPanel87 = new FrameSystem.SLibrary.SComponents.SPanel();
        sLabel58 = new FrameSystem.SLibrary.SComponents.SLabel();
        sPanel88 = new FrameSystem.SLibrary.SComponents.SPanel();
        sPanel104 = new FrameSystem.SLibrary.SComponents.SPanel();
        sPanel110 = new FrameSystem.SLibrary.SComponents.SPanel();
        sLabel45 = new FrameSystem.SLibrary.SComponents.SLabel();
        sLabel_unitinfo_unitid = new FrameSystem.SLibrary.SComponents.SLabel();
        sPanel111 = new FrameSystem.SLibrary.SComponents.SPanel();
        sLabel47 = new FrameSystem.SLibrary.SComponents.SLabel();
        sLabel_unitinfo_tower = new FrameSystem.SLibrary.SComponents.SLabel();
        sPanel112 = new FrameSystem.SLibrary.SComponents.SPanel();
        sLabel49 = new FrameSystem.SLibrary.SComponents.SLabel();
        sLabel_unitinfo_floor = new FrameSystem.SLibrary.SComponents.SLabel();
        sPanel113 = new FrameSystem.SLibrary.SComponents.SPanel();
        sLabel54 = new FrameSystem.SLibrary.SComponents.SLabel();
        sLabel_unitinfo_unit = new FrameSystem.SLibrary.SComponents.SLabel();
        sPanel114 = new FrameSystem.SLibrary.SComponents.SPanel();
        sLabel56 = new FrameSystem.SLibrary.SComponents.SLabel();
        sLabel_unitinfo_model = new FrameSystem.SLibrary.SComponents.SLabel();
        sPanel115 = new FrameSystem.SLibrary.SComponents.SPanel();
        sLabel63 = new FrameSystem.SLibrary.SComponents.SLabel();
        sLabel_unitinfo_balcony = new FrameSystem.SLibrary.SComponents.SLabel();
        sPanel116 = new FrameSystem.SLibrary.SComponents.SPanel();
        sLabel65 = new FrameSystem.SLibrary.SComponents.SLabel();
        sLabel_unitinfo_floorarea = new FrameSystem.SLibrary.SComponents.SLabel();
        sPanel117 = new FrameSystem.SLibrary.SComponents.SPanel();
        sLabel68 = new FrameSystem.SLibrary.SComponents.SLabel();
        sLabel_unitinfo_status = new FrameSystem.SLibrary.SComponents.SLabel();
        sPanel118 = new FrameSystem.SLibrary.SComponents.SPanel();
        sLabel70 = new FrameSystem.SLibrary.SComponents.SLabel();
        sLabel_unitinfo_turnover = new FrameSystem.SLibrary.SComponents.SLabel();
        sPanel72 = new FrameSystem.SLibrary.SComponents.SPanel();
        sPanel77 = new FrameSystem.SLibrary.SComponents.SPanel();
        sPanel89 = new FrameSystem.SLibrary.SComponents.SPanel();
        sPanel90 = new FrameSystem.SLibrary.SComponents.SPanel();
        sLabel59 = new FrameSystem.SLibrary.SComponents.SLabel();
        sLabel62 = new FrameSystem.SLibrary.SComponents.SLabel();
        sPanel91 = new FrameSystem.SLibrary.SComponents.SPanel();
        sPanel105 = new FrameSystem.SLibrary.SComponents.SPanel();
        sPanel119 = new FrameSystem.SLibrary.SComponents.SPanel();
        sLabel74 = new FrameSystem.SLibrary.SComponents.SLabel();
        sLabel_accountinfo_accountnumber = new FrameSystem.SLibrary.SComponents.SLabel();
        sPanel120 = new FrameSystem.SLibrary.SComponents.SPanel();
        sLabel76 = new FrameSystem.SLibrary.SComponents.SLabel();
        sLabel_accountinfo_accountholder = new FrameSystem.SLibrary.SComponents.SLabel();
        sPanel121 = new FrameSystem.SLibrary.SComponents.SPanel();
        sLabel78 = new FrameSystem.SLibrary.SComponents.SLabel();
        sLabel_accountinfo_taxid = new FrameSystem.SLibrary.SComponents.SLabel();
        sPanel122 = new FrameSystem.SLibrary.SComponents.SPanel();
        sLabel80 = new FrameSystem.SLibrary.SComponents.SLabel();
        sLabel_accountinfo_acrnumber = new FrameSystem.SLibrary.SComponents.SLabel();
        sPanel123 = new FrameSystem.SLibrary.SComponents.SPanel();
        sLabel82 = new FrameSystem.SLibrary.SComponents.SLabel();
        sLabel_accountinfo_authorizedrepresentative = new FrameSystem.SLibrary.SComponents.SLabel();
        sPanel124 = new FrameSystem.SLibrary.SComponents.SPanel();
        sLabel83 = new FrameSystem.SLibrary.SComponents.SLabel();
        sLabel_accountinfo_contactnumber = new FrameSystem.SLibrary.SComponents.SLabel();
        sPanel73 = new FrameSystem.SLibrary.SComponents.SPanel();
        sPanel82 = new FrameSystem.SLibrary.SComponents.SPanel();
        sPanel92 = new FrameSystem.SLibrary.SComponents.SPanel();
        sLabel73 = new FrameSystem.SLibrary.SComponents.SLabel();
        sPanel93 = new FrameSystem.SLibrary.SComponents.SPanel();
        sLabel64 = new FrameSystem.SLibrary.SComponents.SLabel();
        sPanel94 = new FrameSystem.SLibrary.SComponents.SPanel();
        sPanel106 = new FrameSystem.SLibrary.SComponents.SPanel();
        sPanel136 = new FrameSystem.SLibrary.SComponents.SPanel();
        sLabel93 = new FrameSystem.SLibrary.SComponents.SLabel();
        sLabel_occupationdetails_occupanttype = new FrameSystem.SLibrary.SComponents.SLabel();
        sPanel128 = new FrameSystem.SLibrary.SComponents.SPanel();
        sLabel92 = new FrameSystem.SLibrary.SComponents.SLabel();
        sLabel_occupationdetails_currentoccupant = new FrameSystem.SLibrary.SComponents.SLabel();
        sPanel129 = new FrameSystem.SLibrary.SComponents.SPanel();
        sLabel94 = new FrameSystem.SLibrary.SComponents.SLabel();
        sLabel_occupationdetails_residents = new FrameSystem.SLibrary.SComponents.SLabel();
        sPanel130 = new FrameSystem.SLibrary.SComponents.SPanel();
        sLabel96 = new FrameSystem.SLibrary.SComponents.SLabel();
        sLabel_occupationdetails_dependents = new FrameSystem.SLibrary.SComponents.SLabel();
        sPanel131 = new FrameSystem.SLibrary.SComponents.SPanel();
        sLabel98 = new FrameSystem.SLibrary.SComponents.SLabel();
        sLabel_occupationdetails_spouse = new FrameSystem.SLibrary.SComponents.SLabel();
        sPanel132 = new FrameSystem.SLibrary.SComponents.SPanel();
        sLabel100 = new FrameSystem.SLibrary.SComponents.SLabel();
        sLabel_occupationdetails_contactnumber = new FrameSystem.SLibrary.SComponents.SLabel();
        sPanel133 = new FrameSystem.SLibrary.SComponents.SPanel();
        sLabel102 = new FrameSystem.SLibrary.SComponents.SLabel();
        sLabel_occupationdetails_civilstatus = new FrameSystem.SLibrary.SComponents.SLabel();
        sPanel134 = new FrameSystem.SLibrary.SComponents.SPanel();
        sLabel104 = new FrameSystem.SLibrary.SComponents.SLabel();
        sLabel_occupationdetails_weekender = new FrameSystem.SLibrary.SComponents.SLabel();
        sPanel135 = new FrameSystem.SLibrary.SComponents.SPanel();
        sLabel106 = new FrameSystem.SLibrary.SComponents.SLabel();
        sLabel_occupationdetails_noactivity = new FrameSystem.SLibrary.SComponents.SLabel();
        sPanel80 = new FrameSystem.SLibrary.SComponents.SPanel();
        sPanel83 = new FrameSystem.SLibrary.SComponents.SPanel();
        sPanel96 = new FrameSystem.SLibrary.SComponents.SPanel();
        sPanel99 = new FrameSystem.SLibrary.SComponents.SPanel();
        sLabel67 = new FrameSystem.SLibrary.SComponents.SLabel();
        sLabel69 = new FrameSystem.SLibrary.SComponents.SLabel();
        unitsViewOverview_EditNotes = new FrameSystem.SLibrary.SComponents.SPanel();
        sLabel60 = new FrameSystem.SLibrary.SComponents.SLabel();
        sPanel103 = new FrameSystem.SLibrary.SComponents.SPanel();
        jLayeredPane4 = new javax.swing.JLayeredPane();
        layerUnits_NotesEmpty = new FrameSystem.Layers.Units.Components.LayerUnits_Notes();
        sPanel95 = new FrameSystem.SLibrary.SComponents.SPanel();
        sLabel48 = new FrameSystem.SLibrary.SComponents.SLabel();
        sLabel55 = new FrameSystem.SLibrary.SComponents.SLabel();
        layerUnits_Notes = new FrameSystem.Layers.Units.Components.LayerUnits_Notes();
        sPanel79 = new FrameSystem.SLibrary.SComponents.SPanel();
        sPanel84 = new FrameSystem.SLibrary.SComponents.SPanel();
        sPanel107 = new FrameSystem.SLibrary.SComponents.SPanel();
        jLayeredPane5 = new javax.swing.JLayeredPane();
        layerUnits_ConcernsSummaryEmpty = new FrameSystem.Layers.Units.Components.LayerUnits_ConcernsSummary();
        sPanel97 = new FrameSystem.SLibrary.SComponents.SPanel();
        sLabel61 = new FrameSystem.SLibrary.SComponents.SLabel();
        sLabel66 = new FrameSystem.SLibrary.SComponents.SLabel();
        layerUnits_ConcernsSummary = new FrameSystem.Layers.Units.Components.LayerUnits_ConcernsSummary();
        sPanel102 = new FrameSystem.SLibrary.SComponents.SPanel();
        sPanel108 = new FrameSystem.SLibrary.SComponents.SPanel();
        sLabel71 = new FrameSystem.SLibrary.SComponents.SLabel();
        sLabel72 = new FrameSystem.SLibrary.SComponents.SLabel();
        unitsViewOverview_ViewAllConcerns = new FrameSystem.SLibrary.SComponents.SPanel();
        sLabel50 = new FrameSystem.SLibrary.SComponents.SLabel();
        sPanel78 = new FrameSystem.SLibrary.SComponents.SPanel();
        sPanel85 = new FrameSystem.SLibrary.SComponents.SPanel();
        sPanel125 = new FrameSystem.SLibrary.SComponents.SPanel();
        sPanel126 = new FrameSystem.SLibrary.SComponents.SPanel();
        sLabel75 = new FrameSystem.SLibrary.SComponents.SLabel();
        sLabel77 = new FrameSystem.SLibrary.SComponents.SLabel();
        sPanel109 = new FrameSystem.SLibrary.SComponents.SPanel();
        sPanel127 = new FrameSystem.SLibrary.SComponents.SPanel();
        unitsViewOverview_ViewOwner = new FrameSystem.SLibrary.SComponents.SPanel();
        sPanel98 = new FrameSystem.SLibrary.SComponents.SPanel();
        sLabel84 = new FrameSystem.SLibrary.SComponents.SLabel();
        sLabel79 = new FrameSystem.SLibrary.SComponents.SLabel();
        sLabel81 = new FrameSystem.SLibrary.SComponents.SLabel();
        filler2 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 5), new java.awt.Dimension(0, 5), new java.awt.Dimension(0, 5));
        unitsViewOverview_ViewTenant = new FrameSystem.SLibrary.SComponents.SPanel();
        sPanel100 = new FrameSystem.SLibrary.SComponents.SPanel();
        sLabel85 = new FrameSystem.SLibrary.SComponents.SLabel();
        sLabel86 = new FrameSystem.SLibrary.SComponents.SLabel();
        sLabel87 = new FrameSystem.SLibrary.SComponents.SLabel();
        filler3 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 5), new java.awt.Dimension(0, 5), new java.awt.Dimension(0, 5));
        unitsViewOverview_UploadDocument = new FrameSystem.SLibrary.SComponents.SPanel();
        sPanel101 = new FrameSystem.SLibrary.SComponents.SPanel();
        sLabel88 = new FrameSystem.SLibrary.SComponents.SLabel();
        sLabel89 = new FrameSystem.SLibrary.SComponents.SLabel();
        sLabel90 = new FrameSystem.SLibrary.SComponents.SLabel();
        filler4 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 5), new java.awt.Dimension(0, 5), new java.awt.Dimension(0, 5));
        unitsViewOverview_ReportConcern = new FrameSystem.SLibrary.SComponents.SPanel();
        sPanel141 = new FrameSystem.SLibrary.SComponents.SPanel();
        sLabel91 = new FrameSystem.SLibrary.SComponents.SLabel();
        sLabel95 = new FrameSystem.SLibrary.SComponents.SLabel();
        sLabel97 = new FrameSystem.SLibrary.SComponents.SLabel();
        filler5 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 5), new java.awt.Dimension(0, 5), new java.awt.Dimension(0, 5));
        unitsViewOverview_ReportViolation = new FrameSystem.SLibrary.SComponents.SPanel();
        sPanel142 = new FrameSystem.SLibrary.SComponents.SPanel();
        sLabel103 = new FrameSystem.SLibrary.SComponents.SLabel();
        sLabel105 = new FrameSystem.SLibrary.SComponents.SLabel();
        sLabel107 = new FrameSystem.SLibrary.SComponents.SLabel();
        layerUnits_ViewDocuments = new FrameSystem.Layers.Units.Components.LayerUnits_View();
        sLabel51 = new FrameSystem.SLibrary.SComponents.SLabel();
        layerUnits_ViewConcerns = new FrameSystem.Layers.Units.Components.LayerUnits_View();
        sPanel137 = new FrameSystem.SLibrary.SComponents.SPanel();
        layerUnits_ViewVisitors = new FrameSystem.Layers.Units.Components.LayerUnits_View();
        sLabel99 = new FrameSystem.SLibrary.SComponents.SLabel();
        layerUnits_ViewActivityLog = new FrameSystem.Layers.Units.Components.LayerUnits_View();
        sLabel53 = new FrameSystem.SLibrary.SComponents.SLabel();
        layerUnits_ViewViolations = new FrameSystem.Layers.Units.Components.LayerUnits_View();
        sLabel101 = new FrameSystem.SLibrary.SComponents.SLabel();
        layerUnits_ViewNull = new FrameSystem.Layers.Units.Components.LayerUnits_View();
        sComboBox1 = new FrameSystem.SLibrary.SComponents.SComboBox();
        sPanel21 = new FrameSystem.SLibrary.SComponents.SPanel();
        sPanel34 = new FrameSystem.SLibrary.SComponents.SPanel();
        sLabel38 = new FrameSystem.SLibrary.SComponents.SLabel();
        sPanel49 = new FrameSystem.SLibrary.SComponents.SPanel();
        sLabel37 = new FrameSystem.SLibrary.SComponents.SLabel();
        sPanel61 = new FrameSystem.SLibrary.SComponents.SPanel();
        sLabel31 = new FrameSystem.SLibrary.SComponents.SLabel();

        sPanel138.setBorderLine(1);
        sPanel138.setDefaultBorderColor(new java.awt.Color(240, 240, 240));
        sPanel138.setRadius(15);
        sPanel138.setRounded(true);
        sPanel138.setShadowColor(new java.awt.Color(230, 230, 230));
        sPanel138.setShadowOpacity(0.3F);
        sPanel138.setShadowSize(5);
        sPanel138.setShadowX(true);
        sPanel138.setShadowY(true);

        javax.swing.GroupLayout sPanel138Layout = new javax.swing.GroupLayout(sPanel138);
        sPanel138.setLayout(sPanel138Layout);
        sPanel138Layout.setHorizontalGroup(
            sPanel138Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        sPanel138Layout.setVerticalGroup(
            sPanel138Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        setPreferredSize(new java.awt.Dimension(1215, 1000));
        setPaintBackground(false);

        sTextFieldContainer1.setTextFieldChild(sTextField1);
        sTextFieldContainer1.setRadius(15);
        sTextFieldContainer1.setRounded(true);
        sTextFieldContainer1.setShadowColor(new java.awt.Color(230, 230, 230));
        sTextFieldContainer1.setShadowOpacity(0.3F);
        sTextFieldContainer1.setShadowSize(5);
        sTextFieldContainer1.setShadowX(true);
        sTextFieldContainer1.setShadowY(true);

        sTextField1.setBackground(new java.awt.Color(255, 255, 255));
        sTextField1.setHint("Search for units");
        sTextField1.setHintColor(new java.awt.Color(102, 102, 102));
        sTextField1.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        sTextField1.setPreferredSize(new java.awt.Dimension(370, 50));

        sLabel1.setIconSize(14);
        sLabel1.setScaledIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/search.png"))); // NOI18N

        javax.swing.GroupLayout sTextFieldContainer1Layout = new javax.swing.GroupLayout(sTextFieldContainer1);
        sTextFieldContainer1.setLayout(sTextFieldContainer1Layout);
        sTextFieldContainer1Layout.setHorizontalGroup(
            sTextFieldContainer1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(sTextFieldContainer1Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(sLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15)
                .addComponent(sTextField1, javax.swing.GroupLayout.DEFAULT_SIZE, 290, Short.MAX_VALUE)
                .addGap(5, 5, 5))
        );
        sTextFieldContainer1Layout.setVerticalGroup(
            sTextFieldContainer1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, sTextFieldContainer1Layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addGroup(sTextFieldContainer1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(sLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
                    .addComponent(sTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addGap(0, 0, 0))
        );

        sPanel36.setCanHover(true);
        sPanel36.setHoverBackgroundColor(new java.awt.Color(230, 230, 230));
        sPanel36.setRadius(15);
        sPanel36.setRounded(true);
        sPanel36.setShadowColor(new java.awt.Color(230, 230, 230));
        sPanel36.setShadowOpacity(0.3F);
        sPanel36.setShadowSize(5);
        sPanel36.setShadowX(true);
        sPanel36.setShadowY(true);
        sPanel36.setMaximumSize(new java.awt.Dimension(100, 32767));
        sPanel36.setMinimumSize(new java.awt.Dimension(100, 0));
        sPanel36.setPreferredSize(new java.awt.Dimension(100, 45));

        sLabel19.setForeground(new java.awt.Color(56, 56, 56));
        sLabel19.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        sLabel19.setIconSize(13);
        sLabel19.setScaledIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/modules/file.png"))); // NOI18N
        sLabel19.setText("Export");
        sLabel19.setIconTextGap(10);
        sLabel19.setMaximumSize(new java.awt.Dimension(69, 30));
        sLabel19.setMinimumSize(new java.awt.Dimension(69, 30));
        sLabel19.setPreferredSize(new java.awt.Dimension(69, 30));

        javax.swing.GroupLayout sPanel36Layout = new javax.swing.GroupLayout(sPanel36);
        sPanel36.setLayout(sPanel36Layout);
        sPanel36Layout.setHorizontalGroup(
            sPanel36Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, sPanel36Layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(sLabel19, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        sPanel36Layout.setVerticalGroup(
            sPanel36Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(sPanel36Layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(sLabel19, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE)
                .addGap(0, 0, 0))
        );

        sPanel42.setMaximumSize(new java.awt.Dimension(100, 32767));
        sPanel42.setMinimumSize(new java.awt.Dimension(100, 0));
        sPanel42.setPreferredSize(new java.awt.Dimension(100, 45));
        sPanel42.setCanHover(true);
        sPanel42.setHoverBackgroundColor(new java.awt.Color(230, 230, 230));
        sPanel42.setRadius(15);
        sPanel42.setRounded(true);
        sPanel42.setShadowColor(new java.awt.Color(230, 230, 230));
        sPanel42.setShadowOpacity(0.3F);
        sPanel42.setShadowSize(5);
        sPanel42.setShadowX(true);
        sPanel42.setShadowY(true);

        sLabel20.setForeground(new java.awt.Color(56, 56, 56));
        sLabel20.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        sLabel20.setIconSize(12);
        sLabel20.setScaledIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/modules/activity.png"))); // NOI18N
        sLabel20.setText("Activity Log");
        sLabel20.setIconTextGap(10);
        sLabel20.setMaximumSize(new java.awt.Dimension(69, 30));
        sLabel20.setMinimumSize(new java.awt.Dimension(69, 30));
        sLabel20.setPreferredSize(new java.awt.Dimension(69, 30));

        javax.swing.GroupLayout sPanel42Layout = new javax.swing.GroupLayout(sPanel42);
        sPanel42.setLayout(sPanel42Layout);
        sPanel42Layout.setHorizontalGroup(
            sPanel42Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, sPanel42Layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(sLabel20, javax.swing.GroupLayout.DEFAULT_SIZE, 113, Short.MAX_VALUE))
        );
        sPanel42Layout.setVerticalGroup(
            sPanel42Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(sPanel42Layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(sLabel20, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE)
                .addGap(0, 0, 0))
        );

        sPanel33.setPreferredSize(new java.awt.Dimension(262, 100));
        sPanel33.setRadius(15);
        sPanel33.setRounded(true);
        sPanel33.setShadowColor(new java.awt.Color(230, 230, 230));
        sPanel33.setShadowOpacity(0.3F);
        sPanel33.setShadowSize(5);
        sPanel33.setShadowX(true);
        sPanel33.setShadowY(true);
        sPanel33.setLayout(new javax.swing.BoxLayout(sPanel33, javax.swing.BoxLayout.LINE_AXIS));

        sPanel43.setPaintBackground(false);

        sPanel23.setMaximumSize(new java.awt.Dimension(50, 50));
        sPanel23.setMinimumSize(new java.awt.Dimension(50, 50));
        sPanel23.setPreferredSize(new java.awt.Dimension(50, 50));
        sPanel23.setDefaultBackgroundColor(new java.awt.Color(240, 217, 217));
        sPanel23.setRadius(50);
        sPanel23.setRounded(true);

        sLabel30.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        sLabel30.setIconSize(20);
        sLabel30.setScaledIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/moduleUnits/concerns.png"))); // NOI18N

        javax.swing.GroupLayout sPanel23Layout = new javax.swing.GroupLayout(sPanel23);
        sPanel23.setLayout(sPanel23Layout);
        sPanel23Layout.setHorizontalGroup(
            sPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(sLabel30, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
        );
        sPanel23Layout.setVerticalGroup(
            sPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, sPanel23Layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(sLabel30, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
                .addGap(0, 0, 0))
        );

        javax.swing.GroupLayout sPanel43Layout = new javax.swing.GroupLayout(sPanel43);
        sPanel43.setLayout(sPanel43Layout);
        sPanel43Layout.setHorizontalGroup(
            sPanel43Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(sPanel43Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(sPanel23, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10))
        );
        sPanel43Layout.setVerticalGroup(
            sPanel43Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(sPanel43Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(sPanel23, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        sPanel33.add(sPanel43);

        sPanel44.setPaintBackground(false);

        sLabel28.setForeground(new java.awt.Color(56, 56, 56));
        sLabel28.setText("Concerns");
        sLabel28.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        sLabel28.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N

        sLabel29.setForeground(new java.awt.Color(56, 56, 56));
        sLabel29.setText("0");
        sLabel29.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        sLabel29.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N

        javax.swing.GroupLayout sPanel19Layout = new javax.swing.GroupLayout(sPanel19);
        sPanel19.setLayout(sPanel19Layout);
        sPanel19Layout.setHorizontalGroup(
            sPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, sPanel19Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(sLabel28, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addComponent(sLabel29, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        sPanel19Layout.setVerticalGroup(
            sPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(sPanel19Layout.createSequentialGroup()
                .addComponent(sLabel28, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(sLabel29, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout sPanel44Layout = new javax.swing.GroupLayout(sPanel44);
        sPanel44.setLayout(sPanel44Layout);
        sPanel44Layout.setHorizontalGroup(
            sPanel44Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(sPanel44Layout.createSequentialGroup()
                .addComponent(sPanel19, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10))
        );
        sPanel44Layout.setVerticalGroup(
            sPanel44Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, sPanel44Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(sPanel19, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        sPanel33.add(sPanel44);

        sPanel45.setPaintBackground(false);

        sPanel41.setLayout(new javax.swing.BoxLayout(sPanel41, javax.swing.BoxLayout.PAGE_AXIS));

        sPanel24.setMaximumSize(new java.awt.Dimension(8, 8));
        sPanel24.setMinimumSize(new java.awt.Dimension(8, 8));
        sPanel24.setName(""); // NOI18N
        sPanel24.setDefaultBackgroundColor(new java.awt.Color(182, 30, 39));
        sPanel24.setRadius(5);
        sPanel24.setRounded(true);

        javax.swing.GroupLayout sPanel24Layout = new javax.swing.GroupLayout(sPanel24);
        sPanel24.setLayout(sPanel24Layout);
        sPanel24Layout.setHorizontalGroup(
            sPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 8, Short.MAX_VALUE)
        );
        sPanel24Layout.setVerticalGroup(
            sPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 8, Short.MAX_VALUE)
        );

        sLabel7.setForeground(new java.awt.Color(56, 56, 56));
        sLabel7.setText("High: 0");

        javax.swing.GroupLayout sPanel11Layout = new javax.swing.GroupLayout(sPanel11);
        sPanel11.setLayout(sPanel11Layout);
        sPanel11Layout.setHorizontalGroup(
            sPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(sPanel11Layout.createSequentialGroup()
                .addComponent(sPanel24, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(5, 5, 5)
                .addComponent(sLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(0, 0, 0))
        );
        sPanel11Layout.setVerticalGroup(
            sPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(sPanel11Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(sPanel24, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addComponent(sLabel7, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        sPanel41.add(sPanel11);

        sPanel38.setMaximumSize(new java.awt.Dimension(8, 8));
        sPanel38.setMinimumSize(new java.awt.Dimension(8, 8));
        sPanel38.setName(""); // NOI18N
        sPanel38.setDefaultBackgroundColor(new java.awt.Color(212, 147, 63));
        sPanel38.setRadius(5);
        sPanel38.setRounded(true);

        javax.swing.GroupLayout sPanel38Layout = new javax.swing.GroupLayout(sPanel38);
        sPanel38.setLayout(sPanel38Layout);
        sPanel38Layout.setHorizontalGroup(
            sPanel38Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 8, Short.MAX_VALUE)
        );
        sPanel38Layout.setVerticalGroup(
            sPanel38Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 8, Short.MAX_VALUE)
        );

        sLabel25.setForeground(new java.awt.Color(56, 56, 56));
        sLabel25.setText("Medium: 0");

        javax.swing.GroupLayout sPanel37Layout = new javax.swing.GroupLayout(sPanel37);
        sPanel37.setLayout(sPanel37Layout);
        sPanel37Layout.setHorizontalGroup(
            sPanel37Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(sPanel37Layout.createSequentialGroup()
                .addComponent(sPanel38, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(5, 5, 5)
                .addComponent(sLabel25, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(0, 0, 0))
        );
        sPanel37Layout.setVerticalGroup(
            sPanel37Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(sPanel37Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(sPanel38, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addComponent(sLabel25, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        sPanel41.add(sPanel37);

        sPanel40.setMaximumSize(new java.awt.Dimension(8, 8));
        sPanel40.setMinimumSize(new java.awt.Dimension(8, 8));
        sPanel40.setName(""); // NOI18N
        sPanel40.setDefaultBackgroundColor(new java.awt.Color(90, 184, 124));
        sPanel40.setRadius(5);
        sPanel40.setRounded(true);

        javax.swing.GroupLayout sPanel40Layout = new javax.swing.GroupLayout(sPanel40);
        sPanel40.setLayout(sPanel40Layout);
        sPanel40Layout.setHorizontalGroup(
            sPanel40Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 8, Short.MAX_VALUE)
        );
        sPanel40Layout.setVerticalGroup(
            sPanel40Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 8, Short.MAX_VALUE)
        );

        sLabel27.setForeground(new java.awt.Color(56, 56, 56));
        sLabel27.setText("Low: 0");

        javax.swing.GroupLayout sPanel39Layout = new javax.swing.GroupLayout(sPanel39);
        sPanel39.setLayout(sPanel39Layout);
        sPanel39Layout.setHorizontalGroup(
            sPanel39Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(sPanel39Layout.createSequentialGroup()
                .addComponent(sPanel40, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(5, 5, 5)
                .addComponent(sLabel27, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(0, 0, 0))
        );
        sPanel39Layout.setVerticalGroup(
            sPanel39Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(sPanel39Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(sPanel40, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addComponent(sLabel27, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        sPanel41.add(sPanel39);

        javax.swing.GroupLayout sPanel45Layout = new javax.swing.GroupLayout(sPanel45);
        sPanel45.setLayout(sPanel45Layout);
        sPanel45Layout.setHorizontalGroup(
            sPanel45Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(sPanel45Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(sPanel41, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(20, 20, 20))
        );
        sPanel45Layout.setVerticalGroup(
            sPanel45Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(sPanel45Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(sPanel41, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        sPanel33.add(sPanel45);

        sPanel47.setPreferredSize(new java.awt.Dimension(293, 100));
        sPanel47.setRadius(15);
        sPanel47.setRounded(true);
        sPanel47.setShadowColor(new java.awt.Color(230, 230, 230));
        sPanel47.setShadowOpacity(0.3F);
        sPanel47.setShadowSize(5);
        sPanel47.setShadowX(true);
        sPanel47.setShadowY(true);
        sPanel47.setLayout(new javax.swing.BoxLayout(sPanel47, javax.swing.BoxLayout.LINE_AXIS));

        sPanel48.setPaintBackground(false);

        objectUnitDonutChart1.setMaximumSize(new java.awt.Dimension(50, 50));
        objectUnitDonutChart1.setMinimumSize(new java.awt.Dimension(50, 50));
        objectUnitDonutChart1.setPreferredSize(new java.awt.Dimension(50, 50));

        javax.swing.GroupLayout objectUnitDonutChart1Layout = new javax.swing.GroupLayout(objectUnitDonutChart1);
        objectUnitDonutChart1.setLayout(objectUnitDonutChart1Layout);
        objectUnitDonutChart1Layout.setHorizontalGroup(
            objectUnitDonutChart1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 50, Short.MAX_VALUE)
        );
        objectUnitDonutChart1Layout.setVerticalGroup(
            objectUnitDonutChart1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 50, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout sPanel48Layout = new javax.swing.GroupLayout(sPanel48);
        sPanel48.setLayout(sPanel48Layout);
        sPanel48Layout.setHorizontalGroup(
            sPanel48Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(sPanel48Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(objectUnitDonutChart1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10))
        );
        sPanel48Layout.setVerticalGroup(
            sPanel48Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(sPanel48Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(objectUnitDonutChart1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        sPanel47.add(sPanel48);

        sPanel50.setPaintBackground(false);

        sLabel32.setForeground(new java.awt.Color(56, 56, 56));
        sLabel32.setText("Occupancy Rate");
        sLabel32.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        sLabel32.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N

        sLabel33.setForeground(new java.awt.Color(56, 56, 56));
        sLabel33.setText("12%");
        sLabel33.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        sLabel33.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N

        javax.swing.GroupLayout sPanel51Layout = new javax.swing.GroupLayout(sPanel51);
        sPanel51.setLayout(sPanel51Layout);
        sPanel51Layout.setHorizontalGroup(
            sPanel51Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, sPanel51Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(sLabel32, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addComponent(sLabel33, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        sPanel51Layout.setVerticalGroup(
            sPanel51Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(sPanel51Layout.createSequentialGroup()
                .addComponent(sLabel32, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(sLabel33, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout sPanel50Layout = new javax.swing.GroupLayout(sPanel50);
        sPanel50.setLayout(sPanel50Layout);
        sPanel50Layout.setHorizontalGroup(
            sPanel50Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(sPanel50Layout.createSequentialGroup()
                .addComponent(sPanel51, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10))
        );
        sPanel50Layout.setVerticalGroup(
            sPanel50Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, sPanel50Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(sPanel51, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        sPanel47.add(sPanel50);

        sPanel52.setPaintBackground(false);

        sPanel53.setLayout(new javax.swing.BoxLayout(sPanel53, javax.swing.BoxLayout.PAGE_AXIS));

        sPanel55.setMaximumSize(new java.awt.Dimension(8, 8));
        sPanel55.setMinimumSize(new java.awt.Dimension(8, 8));
        sPanel55.setName(""); // NOI18N
        sPanel55.setDefaultBackgroundColor(new java.awt.Color(85, 174, 245));
        sPanel55.setRadius(5);
        sPanel55.setRounded(true);

        javax.swing.GroupLayout sPanel55Layout = new javax.swing.GroupLayout(sPanel55);
        sPanel55.setLayout(sPanel55Layout);
        sPanel55Layout.setHorizontalGroup(
            sPanel55Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 8, Short.MAX_VALUE)
        );
        sPanel55Layout.setVerticalGroup(
            sPanel55Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 8, Short.MAX_VALUE)
        );

        sLabel34.setForeground(new java.awt.Color(56, 56, 56));
        sLabel34.setText("Owners");

        javax.swing.GroupLayout sPanel54Layout = new javax.swing.GroupLayout(sPanel54);
        sPanel54.setLayout(sPanel54Layout);
        sPanel54Layout.setHorizontalGroup(
            sPanel54Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(sPanel54Layout.createSequentialGroup()
                .addComponent(sPanel55, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(5, 5, 5)
                .addComponent(sLabel34, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(0, 0, 0))
        );
        sPanel54Layout.setVerticalGroup(
            sPanel54Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(sPanel54Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(sPanel55, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addComponent(sLabel34, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        sPanel53.add(sPanel54);

        sPanel57.setMaximumSize(new java.awt.Dimension(8, 8));
        sPanel57.setMinimumSize(new java.awt.Dimension(8, 8));
        sPanel57.setName(""); // NOI18N
        sPanel57.setDefaultBackgroundColor(new java.awt.Color(255, 153, 51));
        sPanel57.setRadius(5);
        sPanel57.setRounded(true);

        javax.swing.GroupLayout sPanel57Layout = new javax.swing.GroupLayout(sPanel57);
        sPanel57.setLayout(sPanel57Layout);
        sPanel57Layout.setHorizontalGroup(
            sPanel57Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 8, Short.MAX_VALUE)
        );
        sPanel57Layout.setVerticalGroup(
            sPanel57Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 8, Short.MAX_VALUE)
        );

        sLabel35.setForeground(new java.awt.Color(56, 56, 56));
        sLabel35.setText("Tenant");

        javax.swing.GroupLayout sPanel56Layout = new javax.swing.GroupLayout(sPanel56);
        sPanel56.setLayout(sPanel56Layout);
        sPanel56Layout.setHorizontalGroup(
            sPanel56Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(sPanel56Layout.createSequentialGroup()
                .addComponent(sPanel57, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(5, 5, 5)
                .addComponent(sLabel35, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(0, 0, 0))
        );
        sPanel56Layout.setVerticalGroup(
            sPanel56Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(sPanel56Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(sPanel57, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addComponent(sLabel35, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        sPanel53.add(sPanel56);

        sPanel59.setMaximumSize(new java.awt.Dimension(8, 8));
        sPanel59.setMinimumSize(new java.awt.Dimension(8, 8));
        sPanel59.setName(""); // NOI18N
        sPanel59.setDefaultBackgroundColor(new java.awt.Color(148, 163, 184));
        sPanel59.setRadius(5);
        sPanel59.setRounded(true);

        javax.swing.GroupLayout sPanel59Layout = new javax.swing.GroupLayout(sPanel59);
        sPanel59.setLayout(sPanel59Layout);
        sPanel59Layout.setHorizontalGroup(
            sPanel59Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 8, Short.MAX_VALUE)
        );
        sPanel59Layout.setVerticalGroup(
            sPanel59Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 8, Short.MAX_VALUE)
        );

        sLabel36.setForeground(new java.awt.Color(56, 56, 56));
        sLabel36.setText("Others");

        javax.swing.GroupLayout sPanel58Layout = new javax.swing.GroupLayout(sPanel58);
        sPanel58.setLayout(sPanel58Layout);
        sPanel58Layout.setHorizontalGroup(
            sPanel58Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(sPanel58Layout.createSequentialGroup()
                .addComponent(sPanel59, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(5, 5, 5)
                .addComponent(sLabel36, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(0, 0, 0))
        );
        sPanel58Layout.setVerticalGroup(
            sPanel58Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(sPanel58Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(sPanel59, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addComponent(sLabel36, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        sPanel53.add(sPanel58);

        javax.swing.GroupLayout sPanel52Layout = new javax.swing.GroupLayout(sPanel52);
        sPanel52.setLayout(sPanel52Layout);
        sPanel52Layout.setHorizontalGroup(
            sPanel52Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(sPanel52Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(sPanel53, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(20, 20, 20))
        );
        sPanel52Layout.setVerticalGroup(
            sPanel52Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, sPanel52Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(sPanel53, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        sPanel47.add(sPanel52);

        sPanel35.setMinimumSize(new java.awt.Dimension(50, 100));
        sPanel35.setPreferredSize(new java.awt.Dimension(181, 100));
        sPanel35.setRadius(15);
        sPanel35.setRounded(true);
        sPanel35.setShadowColor(new java.awt.Color(230, 230, 230));
        sPanel35.setShadowOpacity(0.3F);
        sPanel35.setShadowSize(5);
        sPanel35.setShadowX(true);
        sPanel35.setShadowY(true);
        sPanel35.setLayout(new javax.swing.BoxLayout(sPanel35, javax.swing.BoxLayout.LINE_AXIS));

        sPanel25.setPaintBackground(false);

        sPanel5.setDefaultBackgroundColor(new java.awt.Color(212, 232, 255));
        sPanel5.setRadius(50);
        sPanel5.setRounded(true);
        sPanel5.setMaximumSize(new java.awt.Dimension(50, 50));
        sPanel5.setMinimumSize(new java.awt.Dimension(50, 50));
        sPanel5.setPreferredSize(new java.awt.Dimension(50, 50));

        sLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        sLabel5.setIconSize(20);
        sLabel5.setScaledIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/moduleUnits/tower.png"))); // NOI18N

        javax.swing.GroupLayout sPanel5Layout = new javax.swing.GroupLayout(sPanel5);
        sPanel5.setLayout(sPanel5Layout);
        sPanel5Layout.setHorizontalGroup(
            sPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(sPanel5Layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(sLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
                .addGap(0, 0, 0))
        );
        sPanel5Layout.setVerticalGroup(
            sPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, sPanel5Layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(sLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
                .addGap(0, 0, 0))
        );

        javax.swing.GroupLayout sPanel25Layout = new javax.swing.GroupLayout(sPanel25);
        sPanel25.setLayout(sPanel25Layout);
        sPanel25Layout.setHorizontalGroup(
            sPanel25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(sPanel25Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(sPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10))
        );
        sPanel25Layout.setVerticalGroup(
            sPanel25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(sPanel25Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(sPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        sPanel35.add(sPanel25);

        sPanel26.setPaintBackground(false);

        sLabel24.setForeground(new java.awt.Color(56, 56, 56));
        sLabel24.setText("Total Units");
        sLabel24.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        sLabel24.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N

        sLabel26.setForeground(new java.awt.Color(56, 56, 56));
        sLabel26.setText("426");
        sLabel26.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        sLabel26.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N

        javax.swing.GroupLayout sPanel16Layout = new javax.swing.GroupLayout(sPanel16);
        sPanel16.setLayout(sPanel16Layout);
        sPanel16Layout.setHorizontalGroup(
            sPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(sPanel16Layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addGroup(sPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(sLabel24, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(sLabel26, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(0, 0, 0))
        );
        sPanel16Layout.setVerticalGroup(
            sPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, sPanel16Layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(sLabel24, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(sLabel26, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout sPanel26Layout = new javax.swing.GroupLayout(sPanel26);
        sPanel26.setLayout(sPanel26Layout);
        sPanel26Layout.setHorizontalGroup(
            sPanel26Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 91, Short.MAX_VALUE)
            .addGroup(sPanel26Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(sPanel26Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(sPanel16, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addContainerGap()))
        );
        sPanel26Layout.setVerticalGroup(
            sPanel26Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 90, Short.MAX_VALUE)
            .addGroup(sPanel26Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(sPanel26Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(sPanel16, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        sPanel35.add(sPanel26);

        sPanel1.setBorderLine(1);
        sPanel1.setDefaultBorderColor(new java.awt.Color(240, 240, 240));
        sPanel1.setRadius(15);
        sPanel1.setRounded(true);
        sPanel1.setShadowColor(new java.awt.Color(230, 230, 230));
        sPanel1.setShadowOpacity(0.3F);
        sPanel1.setShadowSize(5);
        sPanel1.setShadowX(true);
        sPanel1.setShadowY(true);

        jLayeredPane2.setLayout(new java.awt.CardLayout());

        layerUnitsData.setName("Data"); // NOI18N

        sPanel2.setPaintBackground(false);
        sPanel2.setBorderLine(1);

        sPanel3.setMinimumSize(new java.awt.Dimension(100, 40));
        sPanel3.setPreferredSize(new java.awt.Dimension(100, 40));
        sPanel3.setDefaultBackgroundColor(new java.awt.Color(249, 249, 249));
        sPanel3.setBorderLine(1);
        sPanel3.setBorderSideLeft(false);
        sPanel3.setBorderSideRight(false);
        sPanel3.setBorderSideTop(false);
        sPanel3.setDefaultBorderColor(new java.awt.Color(240, 240, 240));
        sPanel3.setRadius(15);
        sPanel3.setRoundBottomLeft(false);
        sPanel3.setRoundBottomRight(false);
        sPanel3.setRounded(true);

        sPanel20.setMinimumSize(new java.awt.Dimension(100, 40));
        sPanel20.setPreferredSize(new java.awt.Dimension(100, 40));
        sPanel20.setPaintBackground(false);
        sPanel20.setLayout(new javax.swing.BoxLayout(sPanel20, javax.swing.BoxLayout.LINE_AXIS));
        sPanel20.add(filler6);

        sPanel7.setPaintBackground(false);
        sPanel7.setMaximumSize(new java.awt.Dimension(70, 40));
        sPanel7.setMinimumSize(new java.awt.Dimension(70, 40));
        sPanel7.setPreferredSize(new java.awt.Dimension(70, 40));

        sFilterTitlePanel1.setArrowDirection(0);
        sFilterTitlePanel1.setDataIndex(UnitsDataTable.TOWER);
        sFilterTitlePanel1.setText("Tower");
        sFilterTitlePanel1.setDefaultBackgroundColor(new java.awt.Color(249, 249, 249));
        sFilterTitlePanel1.setCanHover(true);
        sFilterTitlePanel1.setHoverBackgroundColor(new java.awt.Color(229, 229, 229));
        sFilterTitlePanel1.setRadius(7);
        sFilterTitlePanel1.setRounded(true);

        javax.swing.GroupLayout sPanel7Layout = new javax.swing.GroupLayout(sPanel7);
        sPanel7.setLayout(sPanel7Layout);
        sPanel7Layout.setHorizontalGroup(
            sPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(sPanel7Layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(sFilterTitlePanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        sPanel7Layout.setVerticalGroup(
            sPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(sPanel7Layout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addComponent(sFilterTitlePanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(5, 5, 5))
        );

        sPanel20.add(sPanel7);

        sPanel8.setPaintBackground(false);
        sPanel8.setMaximumSize(new java.awt.Dimension(70, 40));
        sPanel8.setMinimumSize(new java.awt.Dimension(70, 40));
        sPanel8.setPreferredSize(new java.awt.Dimension(70, 40));

        sFilterTitlePanel2.setArrowDirection(0);
        sFilterTitlePanel2.setDataIndex(UnitsDataTable.FLOOR);
        sFilterTitlePanel2.setText("Floor");
        sFilterTitlePanel2.setDefaultBackgroundColor(new java.awt.Color(249, 249, 249));
        sFilterTitlePanel2.setCanHover(true);
        sFilterTitlePanel2.setHoverBackgroundColor(new java.awt.Color(229, 229, 229));
        sFilterTitlePanel2.setRadius(7);
        sFilterTitlePanel2.setRounded(true);

        javax.swing.GroupLayout sPanel8Layout = new javax.swing.GroupLayout(sPanel8);
        sPanel8.setLayout(sPanel8Layout);
        sPanel8Layout.setHorizontalGroup(
            sPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(sPanel8Layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(sFilterTitlePanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        sPanel8Layout.setVerticalGroup(
            sPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(sPanel8Layout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addComponent(sFilterTitlePanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(5, 5, 5))
        );

        sPanel20.add(sPanel8);

        sPanel9.setPaintBackground(false);
        sPanel9.setMaximumSize(new java.awt.Dimension(70, 40));
        sPanel9.setMinimumSize(new java.awt.Dimension(70, 40));
        sPanel9.setPreferredSize(new java.awt.Dimension(70, 40));

        sFilterTitlePanel3.setArrowDirection(0);
        sFilterTitlePanel3.setDataIndex(UnitsDataTable.UNIT);
        sFilterTitlePanel3.setText("Unit");
        sFilterTitlePanel3.setDefaultBackgroundColor(new java.awt.Color(249, 249, 249));
        sFilterTitlePanel3.setCanHover(true);
        sFilterTitlePanel3.setHoverBackgroundColor(new java.awt.Color(229, 229, 229));
        sFilterTitlePanel3.setRadius(7);
        sFilterTitlePanel3.setRounded(true);

        javax.swing.GroupLayout sPanel9Layout = new javax.swing.GroupLayout(sPanel9);
        sPanel9.setLayout(sPanel9Layout);
        sPanel9Layout.setHorizontalGroup(
            sPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(sPanel9Layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(sFilterTitlePanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        sPanel9Layout.setVerticalGroup(
            sPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(sPanel9Layout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addComponent(sFilterTitlePanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(5, 5, 5))
        );

        sPanel20.add(sPanel9);
        sPanel20.add(filler9);

        sPanel22.setMaximumSize(new java.awt.Dimension(80, 40));
        sPanel22.setMinimumSize(new java.awt.Dimension(80, 40));
        sPanel22.setPreferredSize(new java.awt.Dimension(80, 40));
        sPanel22.setPaintBackground(false);

        sLabel21.setForeground(new java.awt.Color(56, 56, 56));
        sLabel21.setText("Unit ID");

        javax.swing.GroupLayout sPanel22Layout = new javax.swing.GroupLayout(sPanel22);
        sPanel22.setLayout(sPanel22Layout);
        sPanel22Layout.setHorizontalGroup(
            sPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(sPanel22Layout.createSequentialGroup()
                .addComponent(sLabel21, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        sPanel22Layout.setVerticalGroup(
            sPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, sPanel22Layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(sLabel21, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(0, 0, 0))
        );

        sPanel20.add(sPanel22);
        sPanel20.add(filler1);

        sPanel6.setDefaultBackgroundColor(new java.awt.Color(255, 102, 102));
        sPanel6.setPaintBackground(false);
        sPanel6.setLayout(new java.awt.GridLayout(1, 6));

        sPanel29.setPaintBackground(false);

        sFilterTitlePanel5.setArrowDirection(0);
        sFilterTitlePanel5.setDataIndex(UnitsDataTable.ACCOUNT_NUMBER);
        sFilterTitlePanel5.setText("Account Number");
        sFilterTitlePanel5.setDefaultBackgroundColor(new java.awt.Color(249, 249, 249));
        sFilterTitlePanel5.setCanHover(true);
        sFilterTitlePanel5.setHoverBackgroundColor(new java.awt.Color(229, 229, 229));
        sFilterTitlePanel5.setRadius(7);
        sFilterTitlePanel5.setRounded(true);

        javax.swing.GroupLayout sPanel29Layout = new javax.swing.GroupLayout(sPanel29);
        sPanel29.setLayout(sPanel29Layout);
        sPanel29Layout.setHorizontalGroup(
            sPanel29Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(sPanel29Layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(sFilterTitlePanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        sPanel29Layout.setVerticalGroup(
            sPanel29Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(sPanel29Layout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addComponent(sFilterTitlePanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(5, 5, 5))
        );

        sPanel6.add(sPanel29);

        sPanel10.setPaintBackground(false);

        sFilterTitlePanel6.setArrowDirection(0);
        sFilterTitlePanel6.setDataIndex(UnitsDataTable.MODEL);
        sFilterTitlePanel6.setText("Model");
        sFilterTitlePanel6.setDefaultBackgroundColor(new java.awt.Color(249, 249, 249));
        sFilterTitlePanel6.setCanHover(true);
        sFilterTitlePanel6.setHoverBackgroundColor(new java.awt.Color(229, 229, 229));
        sFilterTitlePanel6.setRadius(7);
        sFilterTitlePanel6.setRounded(true);

        javax.swing.GroupLayout sPanel10Layout = new javax.swing.GroupLayout(sPanel10);
        sPanel10.setLayout(sPanel10Layout);
        sPanel10Layout.setHorizontalGroup(
            sPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(sPanel10Layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(sFilterTitlePanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        sPanel10Layout.setVerticalGroup(
            sPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(sPanel10Layout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addComponent(sFilterTitlePanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(5, 5, 5))
        );

        sPanel6.add(sPanel10);

        sPanel12.setPaintBackground(false);

        sFilterTitlePanel7.setArrowDirection(0);
        sFilterTitlePanel7.setDataIndex(UnitsDataTable.FLOOR_AREA);
        sFilterTitlePanel7.setText("Floor Area");
        sFilterTitlePanel7.setDefaultBackgroundColor(new java.awt.Color(249, 249, 249));
        sFilterTitlePanel7.setCanHover(true);
        sFilterTitlePanel7.setHoverBackgroundColor(new java.awt.Color(229, 229, 229));
        sFilterTitlePanel7.setRadius(7);
        sFilterTitlePanel7.setRounded(true);

        javax.swing.GroupLayout sPanel12Layout = new javax.swing.GroupLayout(sPanel12);
        sPanel12.setLayout(sPanel12Layout);
        sPanel12Layout.setHorizontalGroup(
            sPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(sPanel12Layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(sFilterTitlePanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        sPanel12Layout.setVerticalGroup(
            sPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(sPanel12Layout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addComponent(sFilterTitlePanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(5, 5, 5))
        );

        sPanel6.add(sPanel12);

        sPanel13.setPaintBackground(false);

        sLabel17.setForeground(new java.awt.Color(56, 56, 56));
        sLabel17.setText("Occupancy Type");

        javax.swing.GroupLayout sPanel13Layout = new javax.swing.GroupLayout(sPanel13);
        sPanel13.setLayout(sPanel13Layout);
        sPanel13Layout.setHorizontalGroup(
            sPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(sPanel13Layout.createSequentialGroup()
                .addComponent(sLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        sPanel13Layout.setVerticalGroup(
            sPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, sPanel13Layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(sLabel17, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(0, 0, 0))
        );

        sPanel6.add(sPanel13);

        sPanel14.setPaintBackground(false);

        sLabel18.setForeground(new java.awt.Color(56, 56, 56));
        sLabel18.setText("Unit Status");

        javax.swing.GroupLayout sPanel14Layout = new javax.swing.GroupLayout(sPanel14);
        sPanel14.setLayout(sPanel14Layout);
        sPanel14Layout.setHorizontalGroup(
            sPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(sPanel14Layout.createSequentialGroup()
                .addComponent(sLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(62, Short.MAX_VALUE))
        );
        sPanel14Layout.setVerticalGroup(
            sPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, sPanel14Layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(sLabel18, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(0, 0, 0))
        );

        sPanel6.add(sPanel14);

        sPanel28.setPaintBackground(false);

        sLabel22.setForeground(new java.awt.Color(56, 56, 56));
        sLabel22.setText("T.O. Date");

        javax.swing.GroupLayout sPanel28Layout = new javax.swing.GroupLayout(sPanel28);
        sPanel28.setLayout(sPanel28Layout);
        sPanel28Layout.setHorizontalGroup(
            sPanel28Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(sPanel28Layout.createSequentialGroup()
                .addComponent(sLabel22, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(72, Short.MAX_VALUE))
        );
        sPanel28Layout.setVerticalGroup(
            sPanel28Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, sPanel28Layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(sLabel22, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(0, 0, 0))
        );

        sPanel6.add(sPanel28);

        sPanel20.add(sPanel6);
        sPanel20.add(filler8);

        sPanel15.setDefaultBackgroundColor(new java.awt.Color(51, 255, 51));
        sPanel15.setPaintBackground(false);
        sPanel15.setMaximumSize(new java.awt.Dimension(130, 40));
        sPanel15.setMinimumSize(new java.awt.Dimension(130, 40));
        sPanel15.setPreferredSize(new java.awt.Dimension(130, 40));

        sLabel6.setForeground(new java.awt.Color(56, 56, 56));
        sLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        sLabel6.setText("Actions");
        sLabel6.setMaximumSize(new java.awt.Dimension(75, 40));
        sLabel6.setMinimumSize(new java.awt.Dimension(75, 40));
        sLabel6.setPreferredSize(new java.awt.Dimension(75, 40));

        javax.swing.GroupLayout sPanel15Layout = new javax.swing.GroupLayout(sPanel15);
        sPanel15.setLayout(sPanel15Layout);
        sPanel15Layout.setHorizontalGroup(
            sPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(sPanel15Layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(sLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(0, 0, 0))
        );
        sPanel15Layout.setVerticalGroup(
            sPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(sPanel15Layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(sLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(0, 0, 0))
        );

        sPanel20.add(sPanel15);
        sPanel20.add(filler10);

        javax.swing.GroupLayout sPanel3Layout = new javax.swing.GroupLayout(sPanel3);
        sPanel3.setLayout(sPanel3Layout);
        sPanel3Layout.setHorizontalGroup(
            sPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(sPanel3Layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(sPanel20, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(0, 0, 0))
        );
        sPanel3Layout.setVerticalGroup(
            sPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, sPanel3Layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(sPanel20, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout sPanel2Layout = new javax.swing.GroupLayout(sPanel2);
        sPanel2.setLayout(sPanel2Layout);
        sPanel2Layout.setHorizontalGroup(
            sPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, sPanel2Layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(sPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, 1081, Short.MAX_VALUE)
                .addGap(0, 0, 0))
        );
        sPanel2Layout.setVerticalGroup(
            sPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(sPanel2Layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(sPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLayeredPane1.setLayout(new java.awt.CardLayout());

        layerUnitsOffline.setName("Offline"); // NOI18N
        layerUnitsOffline.setPaintBackground(false);

        jPanel1.setOpaque(false);

        sLabel2.setForeground(new java.awt.Color(205, 64, 68));
        sLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        sLabel2.setText("Database Offline");
        sLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N

        sAnimatedOffline1.setLineColor(new java.awt.Color(205, 64, 68));
        sAnimatedOffline1.setLineWidth(5.0F);
        sAnimatedOffline1.setPreferredSize(new java.awt.Dimension(160, 160));

        javax.swing.GroupLayout sAnimatedOffline1Layout = new javax.swing.GroupLayout(sAnimatedOffline1);
        sAnimatedOffline1.setLayout(sAnimatedOffline1Layout);
        sAnimatedOffline1Layout.setHorizontalGroup(
            sAnimatedOffline1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 61, Short.MAX_VALUE)
        );
        sAnimatedOffline1Layout.setVerticalGroup(
            sAnimatedOffline1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 58, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(sAnimatedOffline1, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(40, 40, 40))
                    .addComponent(sLabel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(sAnimatedOffline1, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(sLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layerUnitsOfflineLayout = new javax.swing.GroupLayout(layerUnitsOffline);
        layerUnitsOffline.setLayout(layerUnitsOfflineLayout);
        layerUnitsOfflineLayout.setHorizontalGroup(
            layerUnitsOfflineLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layerUnitsOfflineLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layerUnitsOfflineLayout.setVerticalGroup(
            layerUnitsOfflineLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layerUnitsOfflineLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jLayeredPane1.setLayer(layerUnitsOffline, javax.swing.JLayeredPane.PALETTE_LAYER);
        jLayeredPane1.add(layerUnitsOffline, "Offline");

        layerUnitsLoading.setName("Loading"); // NOI18N
        layerUnitsLoading.setPaintBackground(false);

        jPanel2.setOpaque(false);

        sLabel3.setForeground(new java.awt.Color(255, 127, 127));
        sLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        sLabel3.setText("Loading");
        sLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N

        sAnimatedOffline4.setLineColor(new java.awt.Color(255, 127, 127));
        sAnimatedOffline4.setLineWidth(5.0F);
        sAnimatedOffline4.setPreferredSize(new java.awt.Dimension(160, 160));

        javax.swing.GroupLayout sAnimatedOffline4Layout = new javax.swing.GroupLayout(sAnimatedOffline4);
        sAnimatedOffline4.setLayout(sAnimatedOffline4Layout);
        sAnimatedOffline4Layout.setHorizontalGroup(
            sAnimatedOffline4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 61, Short.MAX_VALUE)
        );
        sAnimatedOffline4Layout.setVerticalGroup(
            sAnimatedOffline4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 58, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(sAnimatedOffline4, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(40, 40, 40))
                    .addComponent(sLabel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(sAnimatedOffline4, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(sLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layerUnitsLoadingLayout = new javax.swing.GroupLayout(layerUnitsLoading);
        layerUnitsLoading.setLayout(layerUnitsLoadingLayout);
        layerUnitsLoadingLayout.setHorizontalGroup(
            layerUnitsLoadingLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layerUnitsLoadingLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layerUnitsLoadingLayout.setVerticalGroup(
            layerUnitsLoadingLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layerUnitsLoadingLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jLayeredPane1.setLayer(layerUnitsLoading, javax.swing.JLayeredPane.PALETTE_LAYER);
        jLayeredPane1.add(layerUnitsLoading, "Loading");

        layerUnitsOnline.setName("Online"); // NOI18N
        layerUnitsOnline.setPaintBackground(false);

        sTable1.setRowHeight(50);
        sTable1.setScrollbarBackgroundColor(new java.awt.Color(250, 250, 250));
        sTable1.setScrollbarColor(new java.awt.Color(155, 155, 155));

        javax.swing.GroupLayout layerUnitsOnlineLayout = new javax.swing.GroupLayout(layerUnitsOnline);
        layerUnitsOnline.setLayout(layerUnitsOnlineLayout);
        layerUnitsOnlineLayout.setHorizontalGroup(
            layerUnitsOnlineLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(sTable1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layerUnitsOnlineLayout.setVerticalGroup(
            layerUnitsOnlineLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layerUnitsOnlineLayout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(sTable1, javax.swing.GroupLayout.DEFAULT_SIZE, 795, Short.MAX_VALUE)
                .addGap(0, 0, 0))
        );

        jLayeredPane1.setLayer(layerUnitsOnline, javax.swing.JLayeredPane.PALETTE_LAYER);
        jLayeredPane1.add(layerUnitsOnline, "Online");

        layerUnitsNull.setPaintBackground(false);

        javax.swing.GroupLayout layerUnitsNullLayout = new javax.swing.GroupLayout(layerUnitsNull);
        layerUnitsNull.setLayout(layerUnitsNullLayout);
        layerUnitsNullLayout.setHorizontalGroup(
            layerUnitsNullLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1081, Short.MAX_VALUE)
        );
        layerUnitsNullLayout.setVerticalGroup(
            layerUnitsNullLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 795, Short.MAX_VALUE)
        );

        jLayeredPane1.add(layerUnitsNull, "card5");

        sPanel63.setMinimumSize(new java.awt.Dimension(100, 35));
        sPanel63.setPreferredSize(new java.awt.Dimension(1437, 35));
        sPanel63.setDefaultBackgroundColor(new java.awt.Color(249, 249, 249));
        sPanel63.setBorderLine(1);
        sPanel63.setBorderSideBottom(false);
        sPanel63.setBorderSideLeft(false);
        sPanel63.setBorderSideRight(false);
        sPanel63.setDefaultBorderColor(new java.awt.Color(240, 240, 240));
        sPanel63.setRadius(15);
        sPanel63.setRoundTopLeft(false);
        sPanel63.setRoundTopRight(false);
        sPanel63.setRounded(true);

        sPanel18.setPaintBackground(false);
        sPanel18.setShadowColor(new java.awt.Color(230, 230, 230));
        sPanel18.setMaximumSize(new java.awt.Dimension(0, 30));
        sPanel18.setMinimumSize(new java.awt.Dimension(0, 30));
        sPanel18.setPreferredSize(new java.awt.Dimension(0, 30));
        sPanel18.setLayout(new javax.swing.BoxLayout(sPanel18, javax.swing.BoxLayout.LINE_AXIS));

        sPanel32.setDefaultBackgroundColor(java.awt.Color.green);
        sPanel32.setPaintBackground(false);
        sPanel32.setMaximumSize(new java.awt.Dimension(90, 32767));
        sPanel32.setMinimumSize(new java.awt.Dimension(90, 0));
        sPanel32.setPreferredSize(new java.awt.Dimension(90, 30));

        filterTower1.setMaximumSize(new java.awt.Dimension(70, 32767));
        filterTower1.setPreferredSize(new java.awt.Dimension(0, 0));
        filterTower1.setActiveBackgroundColor(new java.awt.Color(255, 230, 230));
        filterTower1.setActiveHoverBackgroundColor(new java.awt.Color(255, 220, 220));
        filterTower1.setBorderLine(1);
        filterTower1.setDefaultBorderColor(new java.awt.Color(221, 221, 221));
        filterTower1.setCanHover(true);
        filterTower1.setHoverBackgroundColor(new java.awt.Color(240, 240, 240));
        filterTower1.setRadius(7);
        filterTower1.setRounded(true);

        sLabel4.setForeground(new java.awt.Color(56, 56, 56));
        sLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        sLabel4.setText("Tower 1");
        sLabel4.setFont(new java.awt.Font("Segoe UI", 1, 10)); // NOI18N

        javax.swing.GroupLayout filterTower1Layout = new javax.swing.GroupLayout(filterTower1);
        filterTower1.setLayout(filterTower1Layout);
        filterTower1Layout.setHorizontalGroup(
            filterTower1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(filterTower1Layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(sLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(0, 0, 0))
        );
        filterTower1Layout.setVerticalGroup(
            filterTower1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(filterTower1Layout.createSequentialGroup()
                .addComponent(sLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(0, 0, 0))
        );

        javax.swing.GroupLayout sPanel32Layout = new javax.swing.GroupLayout(sPanel32);
        sPanel32.setLayout(sPanel32Layout);
        sPanel32Layout.setHorizontalGroup(
            sPanel32Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, sPanel32Layout.createSequentialGroup()
                .addGap(4, 4, 4)
                .addComponent(filterTower1, javax.swing.GroupLayout.DEFAULT_SIZE, 86, Short.MAX_VALUE)
                .addGap(0, 0, 0))
        );
        sPanel32Layout.setVerticalGroup(
            sPanel32Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, sPanel32Layout.createSequentialGroup()
                .addGap(4, 4, 4)
                .addComponent(filterTower1, javax.swing.GroupLayout.DEFAULT_SIZE, 27, Short.MAX_VALUE)
                .addGap(4, 4, 4))
        );

        sPanel18.add(sPanel32);

        sPanel30.setDefaultBackgroundColor(java.awt.Color.blue);
        sPanel30.setPaintBackground(false);
        sPanel30.setMaximumSize(new java.awt.Dimension(90, 32767));
        sPanel30.setMinimumSize(new java.awt.Dimension(90, 0));
        sPanel30.setPreferredSize(new java.awt.Dimension(90, 30));

        filterTower2.setMaximumSize(new java.awt.Dimension(70, 32767));
        filterTower2.setActiveBackgroundColor(new java.awt.Color(255, 230, 230));
        filterTower2.setActiveHoverBackgroundColor(new java.awt.Color(255, 220, 220));
        filterTower2.setBorderLine(1);
        filterTower2.setDefaultBorderColor(new java.awt.Color(221, 221, 221));
        filterTower2.setCanHover(true);
        filterTower2.setHoverBackgroundColor(new java.awt.Color(240, 240, 240));
        filterTower2.setRadius(7);
        filterTower2.setRounded(true);

        sLabel10.setForeground(new java.awt.Color(56, 56, 56));
        sLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        sLabel10.setText("Tower 2");
        sLabel10.setFont(new java.awt.Font("Segoe UI", 1, 10)); // NOI18N

        javax.swing.GroupLayout filterTower2Layout = new javax.swing.GroupLayout(filterTower2);
        filterTower2.setLayout(filterTower2Layout);
        filterTower2Layout.setHorizontalGroup(
            filterTower2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(filterTower2Layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(sLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(0, 0, 0))
        );
        filterTower2Layout.setVerticalGroup(
            filterTower2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(filterTower2Layout.createSequentialGroup()
                .addComponent(sLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(0, 0, 0))
        );

        javax.swing.GroupLayout sPanel30Layout = new javax.swing.GroupLayout(sPanel30);
        sPanel30.setLayout(sPanel30Layout);
        sPanel30Layout.setHorizontalGroup(
            sPanel30Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, sPanel30Layout.createSequentialGroup()
                .addGap(4, 4, 4)
                .addComponent(filterTower2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(0, 0, 0))
        );
        sPanel30Layout.setVerticalGroup(
            sPanel30Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, sPanel30Layout.createSequentialGroup()
                .addGap(4, 4, 4)
                .addComponent(filterTower2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(4, 4, 4))
        );

        sPanel18.add(sPanel30);

        sPanel31.setDefaultBackgroundColor(java.awt.Color.red);
        sPanel31.setPaintBackground(false);
        sPanel31.setMaximumSize(new java.awt.Dimension(90, 32767));
        sPanel31.setMinimumSize(new java.awt.Dimension(90, 0));
        sPanel31.setPreferredSize(new java.awt.Dimension(90, 30));

        filterTower3.setMaximumSize(new java.awt.Dimension(70, 32767));
        filterTower3.setActiveBackgroundColor(new java.awt.Color(255, 230, 230));
        filterTower3.setActiveHoverBackgroundColor(new java.awt.Color(255, 220, 220));
        filterTower3.setBorderLine(1);
        filterTower3.setDefaultBorderColor(new java.awt.Color(221, 221, 221));
        filterTower3.setCanHover(true);
        filterTower3.setHoverBackgroundColor(new java.awt.Color(240, 240, 240));
        filterTower3.setRadius(7);
        filterTower3.setRounded(true);

        sLabel11.setForeground(new java.awt.Color(56, 56, 56));
        sLabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        sLabel11.setText("Tower 3");
        sLabel11.setFont(new java.awt.Font("Segoe UI", 1, 10)); // NOI18N

        javax.swing.GroupLayout filterTower3Layout = new javax.swing.GroupLayout(filterTower3);
        filterTower3.setLayout(filterTower3Layout);
        filterTower3Layout.setHorizontalGroup(
            filterTower3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(filterTower3Layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(sLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(0, 0, 0))
        );
        filterTower3Layout.setVerticalGroup(
            filterTower3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(filterTower3Layout.createSequentialGroup()
                .addComponent(sLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(0, 0, 0))
        );

        javax.swing.GroupLayout sPanel31Layout = new javax.swing.GroupLayout(sPanel31);
        sPanel31.setLayout(sPanel31Layout);
        sPanel31Layout.setHorizontalGroup(
            sPanel31Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, sPanel31Layout.createSequentialGroup()
                .addGap(4, 4, 4)
                .addComponent(filterTower3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(4, 4, 4))
        );
        sPanel31Layout.setVerticalGroup(
            sPanel31Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, sPanel31Layout.createSequentialGroup()
                .addGap(4, 4, 4)
                .addComponent(filterTower3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(4, 4, 4))
        );

        sPanel18.add(sPanel31);

        sPanel46.setMaximumSize(new java.awt.Dimension(0, 30));
        sPanel46.setMinimumSize(new java.awt.Dimension(0, 30));
        sPanel46.setPaintBackground(false);
        sPanel46.setShadowColor(new java.awt.Color(230, 230, 230));

        sLabel8.setForeground(new java.awt.Color(56, 56, 56));
        sLabel8.setText("Rows per page:");

        jSpinner1.setOpaque(false);

        javax.swing.GroupLayout sPanel46Layout = new javax.swing.GroupLayout(sPanel46);
        sPanel46.setLayout(sPanel46Layout);
        sPanel46Layout.setHorizontalGroup(
            sPanel46Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(sPanel46Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(sLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSpinner1, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        sPanel46Layout.setVerticalGroup(
            sPanel46Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(sLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(sPanel46Layout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addComponent(jSpinner1)
                .addGap(5, 5, 5))
        );

        sPanel27.setPaintBackground(false);
        sPanel27.setShadowColor(new java.awt.Color(230, 230, 230));
        sPanel27.setMaximumSize(new java.awt.Dimension(0, 30));
        sPanel27.setMinimumSize(new java.awt.Dimension(0, 30));
        sPanel27.setPreferredSize(new java.awt.Dimension(0, 30));
        sPanel27.setLayout(new javax.swing.BoxLayout(sPanel27, javax.swing.BoxLayout.X_AXIS));

        sPanelPrevious.setPaintBackground(false);
        sPanelPrevious.setMaximumSize(new java.awt.Dimension(40, 35));
        sPanelPrevious.setMinimumSize(new java.awt.Dimension(40, 35));
        sPanelPrevious.setPreferredSize(new java.awt.Dimension(40, 35));

        sPanel67.setCanHover(true);
        sPanel67.setDefaultBackgroundColor(new java.awt.Color(249, 249, 249));
        sPanel67.setHoverBackgroundColor(new java.awt.Color(230, 230, 230));
        sPanel67.setRadius(15);
        sPanel67.setRounded(true);
        sPanel67.setMaximumSize(new java.awt.Dimension(25, 25));
        sPanel67.setMinimumSize(new java.awt.Dimension(25, 25));
        sPanel67.setPreferredSize(new java.awt.Dimension(25, 25));

        sLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        sLabel9.setIconSize(7);
        sLabel9.setScaledIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/modules/previousPage.png"))); // NOI18N

        javax.swing.GroupLayout sPanel67Layout = new javax.swing.GroupLayout(sPanel67);
        sPanel67.setLayout(sPanel67Layout);
        sPanel67Layout.setHorizontalGroup(
            sPanel67Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(sPanel67Layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(sLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, 25, Short.MAX_VALUE)
                .addGap(0, 0, 0))
        );
        sPanel67Layout.setVerticalGroup(
            sPanel67Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(sPanel67Layout.createSequentialGroup()
                .addComponent(sLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(0, 0, 0))
        );

        javax.swing.GroupLayout sPanelPreviousLayout = new javax.swing.GroupLayout(sPanelPrevious);
        sPanelPrevious.setLayout(sPanelPreviousLayout);
        sPanelPreviousLayout.setHorizontalGroup(
            sPanelPreviousLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(sPanelPreviousLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(sPanel67, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        sPanelPreviousLayout.setVerticalGroup(
            sPanelPreviousLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(sPanelPreviousLayout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addComponent(sPanel67, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(5, 5, 5))
        );

        sPanel27.add(sPanelPrevious);

        sPanel60.setPaintBackground(false);

        sPanelPage1.setMaximumSize(new java.awt.Dimension(25, 25));
        sPanelPage1.setMinimumSize(new java.awt.Dimension(25, 25));
        sPanelPage1.setActiveBackgroundColor(new java.awt.Color(230, 230, 230));
        sPanelPage1.setActiveHoverBackgroundColor(new java.awt.Color(230, 230, 230));
        sPanelPage1.setDefaultBackgroundColor(new java.awt.Color(249, 249, 249));
        sPanelPage1.setCanHover(true);
        sPanelPage1.setHoverBackgroundColor(new java.awt.Color(230, 230, 230));
        sPanelPage1.setRadius(15);
        sPanelPage1.setRounded(true);

        sLabel23.setForeground(new java.awt.Color(56, 56, 56));
        sLabel23.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        sLabel23.setIconSize(10);
        sLabel23.setText("?");
        sLabel23.setFont(new java.awt.Font("Segoe UI", 1, 10)); // NOI18N

        javax.swing.GroupLayout sPanelPage1Layout = new javax.swing.GroupLayout(sPanelPage1);
        sPanelPage1.setLayout(sPanelPage1Layout);
        sPanelPage1Layout.setHorizontalGroup(
            sPanelPage1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(sPanelPage1Layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(sLabel23, javax.swing.GroupLayout.DEFAULT_SIZE, 25, Short.MAX_VALUE)
                .addGap(0, 0, 0))
        );
        sPanelPage1Layout.setVerticalGroup(
            sPanelPage1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(sPanelPage1Layout.createSequentialGroup()
                .addComponent(sLabel23, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(0, 0, 0))
        );

        javax.swing.GroupLayout sPanel60Layout = new javax.swing.GroupLayout(sPanel60);
        sPanel60.setLayout(sPanel60Layout);
        sPanel60Layout.setHorizontalGroup(
            sPanel60Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(sPanel60Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(sPanelPage1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        sPanel60Layout.setVerticalGroup(
            sPanel60Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(sPanel60Layout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addComponent(sPanelPage1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(5, 5, 5))
        );

        sPanel27.add(sPanel60);

        sPanel62.setPaintBackground(false);

        sPanelPage2.setMaximumSize(new java.awt.Dimension(25, 25));
        sPanelPage2.setMinimumSize(new java.awt.Dimension(25, 25));
        sPanelPage2.setActiveBackgroundColor(new java.awt.Color(230, 230, 230));
        sPanelPage2.setActiveHoverBackgroundColor(new java.awt.Color(230, 230, 230));
        sPanelPage2.setDefaultBackgroundColor(new java.awt.Color(249, 249, 249));
        sPanelPage2.setCanHover(true);
        sPanelPage2.setHoverBackgroundColor(new java.awt.Color(230, 230, 230));
        sPanelPage2.setRadius(15);
        sPanelPage2.setRounded(true);

        sLabel39.setForeground(new java.awt.Color(56, 56, 56));
        sLabel39.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        sLabel39.setIconSize(10);
        sLabel39.setText("?");
        sLabel39.setFont(new java.awt.Font("Segoe UI", 1, 10)); // NOI18N

        javax.swing.GroupLayout sPanelPage2Layout = new javax.swing.GroupLayout(sPanelPage2);
        sPanelPage2.setLayout(sPanelPage2Layout);
        sPanelPage2Layout.setHorizontalGroup(
            sPanelPage2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(sPanelPage2Layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(sLabel39, javax.swing.GroupLayout.DEFAULT_SIZE, 25, Short.MAX_VALUE)
                .addGap(0, 0, 0))
        );
        sPanelPage2Layout.setVerticalGroup(
            sPanelPage2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(sPanelPage2Layout.createSequentialGroup()
                .addComponent(sLabel39, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(0, 0, 0))
        );

        javax.swing.GroupLayout sPanel62Layout = new javax.swing.GroupLayout(sPanel62);
        sPanel62.setLayout(sPanel62Layout);
        sPanel62Layout.setHorizontalGroup(
            sPanel62Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(sPanel62Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(sPanelPage2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        sPanel62Layout.setVerticalGroup(
            sPanel62Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(sPanel62Layout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addComponent(sPanelPage2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(5, 5, 5))
        );

        sPanel27.add(sPanel62);

        sPanel64.setPaintBackground(false);

        sPanelPage3.setMaximumSize(new java.awt.Dimension(25, 25));
        sPanelPage3.setMinimumSize(new java.awt.Dimension(25, 25));
        sPanelPage3.setActiveBackgroundColor(new java.awt.Color(230, 230, 230));
        sPanelPage3.setActiveHoverBackgroundColor(new java.awt.Color(230, 230, 230));
        sPanelPage3.setDefaultBackgroundColor(new java.awt.Color(249, 249, 249));
        sPanelPage3.setCanHover(true);
        sPanelPage3.setHoverBackgroundColor(new java.awt.Color(230, 230, 230));
        sPanelPage3.setRadius(15);
        sPanelPage3.setRounded(true);

        sLabel40.setForeground(new java.awt.Color(56, 56, 56));
        sLabel40.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        sLabel40.setIconSize(10);
        sLabel40.setText("?");
        sLabel40.setFont(new java.awt.Font("Segoe UI", 1, 10)); // NOI18N

        javax.swing.GroupLayout sPanelPage3Layout = new javax.swing.GroupLayout(sPanelPage3);
        sPanelPage3.setLayout(sPanelPage3Layout);
        sPanelPage3Layout.setHorizontalGroup(
            sPanelPage3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(sPanelPage3Layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(sLabel40, javax.swing.GroupLayout.DEFAULT_SIZE, 25, Short.MAX_VALUE)
                .addGap(0, 0, 0))
        );
        sPanelPage3Layout.setVerticalGroup(
            sPanelPage3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(sPanelPage3Layout.createSequentialGroup()
                .addComponent(sLabel40, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(0, 0, 0))
        );

        javax.swing.GroupLayout sPanel64Layout = new javax.swing.GroupLayout(sPanel64);
        sPanel64.setLayout(sPanel64Layout);
        sPanel64Layout.setHorizontalGroup(
            sPanel64Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(sPanel64Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(sPanelPage3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        sPanel64Layout.setVerticalGroup(
            sPanel64Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(sPanel64Layout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addComponent(sPanelPage3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(5, 5, 5))
        );

        sPanel27.add(sPanel64);

        sPanel65.setPaintBackground(false);

        sPanelPage4.setMaximumSize(new java.awt.Dimension(25, 25));
        sPanelPage4.setMinimumSize(new java.awt.Dimension(25, 25));
        sPanelPage4.setActiveBackgroundColor(new java.awt.Color(230, 230, 230));
        sPanelPage4.setActiveHoverBackgroundColor(new java.awt.Color(230, 230, 230));
        sPanelPage4.setDefaultBackgroundColor(new java.awt.Color(249, 249, 249));
        sPanelPage4.setCanHover(true);
        sPanelPage4.setHoverBackgroundColor(new java.awt.Color(230, 230, 230));
        sPanelPage4.setRadius(15);
        sPanelPage4.setRounded(true);

        sLabel41.setForeground(new java.awt.Color(56, 56, 56));
        sLabel41.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        sLabel41.setIconSize(10);
        sLabel41.setText("?");
        sLabel41.setFont(new java.awt.Font("Segoe UI", 1, 10)); // NOI18N

        javax.swing.GroupLayout sPanelPage4Layout = new javax.swing.GroupLayout(sPanelPage4);
        sPanelPage4.setLayout(sPanelPage4Layout);
        sPanelPage4Layout.setHorizontalGroup(
            sPanelPage4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(sPanelPage4Layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(sLabel41, javax.swing.GroupLayout.DEFAULT_SIZE, 25, Short.MAX_VALUE)
                .addGap(0, 0, 0))
        );
        sPanelPage4Layout.setVerticalGroup(
            sPanelPage4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(sPanelPage4Layout.createSequentialGroup()
                .addComponent(sLabel41, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(0, 0, 0))
        );

        javax.swing.GroupLayout sPanel65Layout = new javax.swing.GroupLayout(sPanel65);
        sPanel65.setLayout(sPanel65Layout);
        sPanel65Layout.setHorizontalGroup(
            sPanel65Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(sPanel65Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(sPanelPage4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        sPanel65Layout.setVerticalGroup(
            sPanel65Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(sPanel65Layout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addComponent(sPanelPage4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(5, 5, 5))
        );

        sPanel27.add(sPanel65);

        sPanel66.setPaintBackground(false);

        sPanelPage5.setMaximumSize(new java.awt.Dimension(25, 25));
        sPanelPage5.setMinimumSize(new java.awt.Dimension(25, 25));
        sPanelPage5.setActiveBackgroundColor(new java.awt.Color(230, 230, 230));
        sPanelPage5.setActiveHoverBackgroundColor(new java.awt.Color(230, 230, 230));
        sPanelPage5.setDefaultBackgroundColor(new java.awt.Color(249, 249, 249));
        sPanelPage5.setCanHover(true);
        sPanelPage5.setHoverBackgroundColor(new java.awt.Color(230, 230, 230));
        sPanelPage5.setRadius(15);
        sPanelPage5.setRounded(true);

        sLabel42.setForeground(new java.awt.Color(56, 56, 56));
        sLabel42.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        sLabel42.setIconSize(10);
        sLabel42.setText("?");
        sLabel42.setFont(new java.awt.Font("Segoe UI", 1, 10)); // NOI18N

        javax.swing.GroupLayout sPanelPage5Layout = new javax.swing.GroupLayout(sPanelPage5);
        sPanelPage5.setLayout(sPanelPage5Layout);
        sPanelPage5Layout.setHorizontalGroup(
            sPanelPage5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(sPanelPage5Layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(sLabel42, javax.swing.GroupLayout.DEFAULT_SIZE, 25, Short.MAX_VALUE)
                .addGap(0, 0, 0))
        );
        sPanelPage5Layout.setVerticalGroup(
            sPanelPage5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(sPanelPage5Layout.createSequentialGroup()
                .addComponent(sLabel42, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(0, 0, 0))
        );

        javax.swing.GroupLayout sPanel66Layout = new javax.swing.GroupLayout(sPanel66);
        sPanel66.setLayout(sPanel66Layout);
        sPanel66Layout.setHorizontalGroup(
            sPanel66Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(sPanel66Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(sPanelPage5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        sPanel66Layout.setVerticalGroup(
            sPanel66Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(sPanel66Layout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addComponent(sPanelPage5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(5, 5, 5))
        );

        sPanel27.add(sPanel66);

        sPanel74.setPaintBackground(false);

        sPanelPage6.setMaximumSize(new java.awt.Dimension(25, 25));
        sPanelPage6.setMinimumSize(new java.awt.Dimension(25, 25));
        sPanelPage6.setActiveBackgroundColor(new java.awt.Color(230, 230, 230));
        sPanelPage6.setActiveHoverBackgroundColor(new java.awt.Color(230, 230, 230));
        sPanelPage6.setDefaultBackgroundColor(new java.awt.Color(249, 249, 249));
        sPanelPage6.setCanHover(true);
        sPanelPage6.setHoverBackgroundColor(new java.awt.Color(230, 230, 230));
        sPanelPage6.setRadius(15);
        sPanelPage6.setRounded(true);

        sLabel43.setForeground(new java.awt.Color(56, 56, 56));
        sLabel43.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        sLabel43.setIconSize(10);
        sLabel43.setText("?");
        sLabel43.setFont(new java.awt.Font("Segoe UI", 1, 10)); // NOI18N

        javax.swing.GroupLayout sPanelPage6Layout = new javax.swing.GroupLayout(sPanelPage6);
        sPanelPage6.setLayout(sPanelPage6Layout);
        sPanelPage6Layout.setHorizontalGroup(
            sPanelPage6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(sPanelPage6Layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(sLabel43, javax.swing.GroupLayout.DEFAULT_SIZE, 25, Short.MAX_VALUE)
                .addGap(0, 0, 0))
        );
        sPanelPage6Layout.setVerticalGroup(
            sPanelPage6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(sPanelPage6Layout.createSequentialGroup()
                .addComponent(sLabel43, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(0, 0, 0))
        );

        javax.swing.GroupLayout sPanel74Layout = new javax.swing.GroupLayout(sPanel74);
        sPanel74.setLayout(sPanel74Layout);
        sPanel74Layout.setHorizontalGroup(
            sPanel74Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(sPanel74Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(sPanelPage6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        sPanel74Layout.setVerticalGroup(
            sPanel74Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(sPanel74Layout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addComponent(sPanelPage6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(5, 5, 5))
        );

        sPanel27.add(sPanel74);

        sPanel76.setPaintBackground(false);

        sPanelPage7.setMaximumSize(new java.awt.Dimension(25, 25));
        sPanelPage7.setMinimumSize(new java.awt.Dimension(25, 25));
        sPanelPage7.setActiveBackgroundColor(new java.awt.Color(230, 230, 230));
        sPanelPage7.setActiveHoverBackgroundColor(new java.awt.Color(230, 230, 230));
        sPanelPage7.setDefaultBackgroundColor(new java.awt.Color(249, 249, 249));
        sPanelPage7.setCanHover(true);
        sPanelPage7.setHoverBackgroundColor(new java.awt.Color(230, 230, 230));
        sPanelPage7.setRadius(15);
        sPanelPage7.setRounded(true);

        sLabel44.setForeground(new java.awt.Color(56, 56, 56));
        sLabel44.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        sLabel44.setIconSize(10);
        sLabel44.setText("?");
        sLabel44.setFont(new java.awt.Font("Segoe UI", 1, 10)); // NOI18N

        javax.swing.GroupLayout sPanelPage7Layout = new javax.swing.GroupLayout(sPanelPage7);
        sPanelPage7.setLayout(sPanelPage7Layout);
        sPanelPage7Layout.setHorizontalGroup(
            sPanelPage7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(sPanelPage7Layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(sLabel44, javax.swing.GroupLayout.DEFAULT_SIZE, 25, Short.MAX_VALUE)
                .addGap(0, 0, 0))
        );
        sPanelPage7Layout.setVerticalGroup(
            sPanelPage7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(sPanelPage7Layout.createSequentialGroup()
                .addComponent(sLabel44, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(0, 0, 0))
        );

        javax.swing.GroupLayout sPanel76Layout = new javax.swing.GroupLayout(sPanel76);
        sPanel76.setLayout(sPanel76Layout);
        sPanel76Layout.setHorizontalGroup(
            sPanel76Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(sPanel76Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(sPanelPage7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        sPanel76Layout.setVerticalGroup(
            sPanel76Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(sPanel76Layout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addComponent(sPanelPage7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(5, 5, 5))
        );

        sPanel27.add(sPanel76);

        sPanelNext.setPaintBackground(false);
        sPanelNext.setMaximumSize(new java.awt.Dimension(40, 35));
        sPanelNext.setMinimumSize(new java.awt.Dimension(40, 35));
        sPanelNext.setPreferredSize(new java.awt.Dimension(40, 35));

        sPanel68.setMaximumSize(new java.awt.Dimension(25, 25));
        sPanel68.setMinimumSize(new java.awt.Dimension(25, 25));
        sPanel68.setDefaultBackgroundColor(new java.awt.Color(249, 249, 249));
        sPanel68.setCanHover(true);
        sPanel68.setHoverBackgroundColor(new java.awt.Color(230, 230, 230));
        sPanel68.setRadius(15);
        sPanel68.setRounded(true);

        sLabel12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        sLabel12.setIconSize(7);
        sLabel12.setScaledIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/modules/nextPage.png"))); // NOI18N

        javax.swing.GroupLayout sPanel68Layout = new javax.swing.GroupLayout(sPanel68);
        sPanel68.setLayout(sPanel68Layout);
        sPanel68Layout.setHorizontalGroup(
            sPanel68Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(sPanel68Layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(sLabel12, javax.swing.GroupLayout.DEFAULT_SIZE, 25, Short.MAX_VALUE)
                .addGap(0, 0, 0))
        );
        sPanel68Layout.setVerticalGroup(
            sPanel68Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(sPanel68Layout.createSequentialGroup()
                .addComponent(sLabel12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(0, 0, 0))
        );

        javax.swing.GroupLayout sPanelNextLayout = new javax.swing.GroupLayout(sPanelNext);
        sPanelNext.setLayout(sPanelNextLayout);
        sPanelNextLayout.setHorizontalGroup(
            sPanelNextLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(sPanelNextLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(sPanel68, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        sPanelNextLayout.setVerticalGroup(
            sPanelNextLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(sPanelNextLayout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addComponent(sPanel68, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(5, 5, 5))
        );

        sPanel27.add(sPanelNext);

        javax.swing.GroupLayout sPanel63Layout = new javax.swing.GroupLayout(sPanel63);
        sPanel63.setLayout(sPanel63Layout);
        sPanel63Layout.setHorizontalGroup(
            sPanel63Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(sPanel63Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(sPanel18, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(sPanel46, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(sPanel27, javax.swing.GroupLayout.PREFERRED_SIZE, 298, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15))
        );
        sPanel63Layout.setVerticalGroup(
            sPanel63Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(sPanel18, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE)
            .addComponent(sPanel46, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(sPanel27, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layerUnitsDataLayout = new javax.swing.GroupLayout(layerUnitsData);
        layerUnitsData.setLayout(layerUnitsDataLayout);
        layerUnitsDataLayout.setHorizontalGroup(
            layerUnitsDataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(sPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jLayeredPane1)
            .addComponent(sPanel63, javax.swing.GroupLayout.DEFAULT_SIZE, 1081, Short.MAX_VALUE)
        );
        layerUnitsDataLayout.setVerticalGroup(
            layerUnitsDataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layerUnitsDataLayout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(sPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jLayeredPane1)
                .addGap(0, 0, 0)
                .addComponent(sPanel63, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0))
        );

        jLayeredPane2.add(layerUnitsData, "card1");

        layerUnitsView.setName("View"); // NOI18N

        sPanel17.setPreferredSize(new java.awt.Dimension(1687, 60));
        sPanel17.setPaintBackground(false);

        unitsView_Title.setForeground(new java.awt.Color(56, 56, 56));
        unitsView_Title.setText("Unit 1-101");
        unitsView_Title.setFont(new java.awt.Font("Segoe UI", 1, 19)); // NOI18N

        sPanel70.setPaintBackground(false);

        unitsView_Previous.setMaximumSize(new java.awt.Dimension(70, 32767));
        unitsView_Previous.setPreferredSize(new java.awt.Dimension(111, 30));
        unitsView_Previous.setActiveBackgroundColor(new java.awt.Color(255, 230, 230));
        unitsView_Previous.setActiveHoverBackgroundColor(new java.awt.Color(255, 220, 220));
        unitsView_Previous.setBorderLine(1);
        unitsView_Previous.setDefaultBorderColor(new java.awt.Color(221, 221, 221));
        unitsView_Previous.setCanHover(true);
        unitsView_Previous.setHoverBackgroundColor(new java.awt.Color(240, 240, 240));
        unitsView_Previous.setRadius(7);
        unitsView_Previous.setRounded(true);

        sLabel13.setForeground(new java.awt.Color(56, 56, 56));
        sLabel13.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        sLabel13.setIconSize(9);
        sLabel13.setScaledIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/moduleUnits/previousUnit.png"))); // NOI18N
        sLabel13.setText("Previous Unit");
        sLabel13.setFont(new java.awt.Font("Segoe UI", 1, 10)); // NOI18N
        sLabel13.setIconTextGap(10);

        javax.swing.GroupLayout unitsView_PreviousLayout = new javax.swing.GroupLayout(unitsView_Previous);
        unitsView_Previous.setLayout(unitsView_PreviousLayout);
        unitsView_PreviousLayout.setHorizontalGroup(
            unitsView_PreviousLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(unitsView_PreviousLayout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(sLabel13, javax.swing.GroupLayout.DEFAULT_SIZE, 111, Short.MAX_VALUE)
                .addGap(0, 0, 0))
        );
        unitsView_PreviousLayout.setVerticalGroup(
            unitsView_PreviousLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(unitsView_PreviousLayout.createSequentialGroup()
                .addComponent(sLabel13, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
                .addGap(0, 0, 0))
        );

        unitsView_Next.setMaximumSize(new java.awt.Dimension(70, 32767));
        unitsView_Next.setPreferredSize(new java.awt.Dimension(111, 30));
        unitsView_Next.setActiveBackgroundColor(new java.awt.Color(255, 230, 230));
        unitsView_Next.setActiveHoverBackgroundColor(new java.awt.Color(255, 220, 220));
        unitsView_Next.setBorderLine(1);
        unitsView_Next.setDefaultBorderColor(new java.awt.Color(221, 221, 221));
        unitsView_Next.setCanHover(true);
        unitsView_Next.setHoverBackgroundColor(new java.awt.Color(240, 240, 240));
        unitsView_Next.setRadius(7);
        unitsView_Next.setRounded(true);

        sLabel14.setForeground(new java.awt.Color(56, 56, 56));
        sLabel14.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        sLabel14.setIconSize(9);
        sLabel14.setScaledIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/moduleUnits/nextUnit.png"))); // NOI18N
        sLabel14.setText("Next Unit");
        sLabel14.setFont(new java.awt.Font("Segoe UI", 1, 10)); // NOI18N
        sLabel14.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        sLabel14.setIconTextGap(10);

        javax.swing.GroupLayout unitsView_NextLayout = new javax.swing.GroupLayout(unitsView_Next);
        unitsView_Next.setLayout(unitsView_NextLayout);
        unitsView_NextLayout.setHorizontalGroup(
            unitsView_NextLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(unitsView_NextLayout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(sLabel14, javax.swing.GroupLayout.DEFAULT_SIZE, 94, Short.MAX_VALUE)
                .addGap(0, 0, 0))
        );
        unitsView_NextLayout.setVerticalGroup(
            unitsView_NextLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(unitsView_NextLayout.createSequentialGroup()
                .addComponent(sLabel14, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
                .addGap(0, 0, 0))
        );

        unitsView_Close.setMaximumSize(new java.awt.Dimension(70, 32767));
        unitsView_Close.setPreferredSize(new java.awt.Dimension(30, 30));
        unitsView_Close.setActiveBackgroundColor(new java.awt.Color(255, 230, 230));
        unitsView_Close.setActiveHoverBackgroundColor(new java.awt.Color(255, 220, 220));
        unitsView_Close.setBorderLine(1);
        unitsView_Close.setDefaultBorderColor(new java.awt.Color(221, 221, 221));
        unitsView_Close.setCanHover(true);
        unitsView_Close.setHoverBackgroundColor(new java.awt.Color(240, 240, 240));
        unitsView_Close.setRadius(7);
        unitsView_Close.setRounded(true);

        sLabel15.setForeground(new java.awt.Color(56, 56, 56));
        sLabel15.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        sLabel15.setIconSize(8);
        sLabel15.setScaledIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/moduleUnits/close.png"))); // NOI18N
        sLabel15.setFont(new java.awt.Font("Segoe UI", 1, 10)); // NOI18N
        sLabel15.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        sLabel15.setIconTextGap(10);

        javax.swing.GroupLayout unitsView_CloseLayout = new javax.swing.GroupLayout(unitsView_Close);
        unitsView_Close.setLayout(unitsView_CloseLayout);
        unitsView_CloseLayout.setHorizontalGroup(
            unitsView_CloseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, unitsView_CloseLayout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(sLabel15, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
                .addGap(0, 0, 0))
        );
        unitsView_CloseLayout.setVerticalGroup(
            unitsView_CloseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(sLabel15, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout sPanel70Layout = new javax.swing.GroupLayout(sPanel70);
        sPanel70.setLayout(sPanel70Layout);
        sPanel70Layout.setHorizontalGroup(
            sPanel70Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(sPanel70Layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(unitsView_Previous, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(unitsView_Next, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addComponent(unitsView_Close, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        sPanel70Layout.setVerticalGroup(
            sPanel70Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(sPanel70Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(sPanel70Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(unitsView_Previous, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(unitsView_Close, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(unitsView_Next, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout sPanel17Layout = new javax.swing.GroupLayout(sPanel17);
        sPanel17.setLayout(sPanel17Layout);
        sPanel17Layout.setHorizontalGroup(
            sPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(sPanel17Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(unitsView_Title, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addComponent(unitsView_Highlight, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(sPanel70, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20))
        );
        sPanel17Layout.setVerticalGroup(
            sPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(sPanel17Layout.createSequentialGroup()
                .addGap(0, 11, Short.MAX_VALUE)
                .addGroup(sPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(unitsView_Highlight, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(unitsView_Title, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(sPanel70, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(0, 11, Short.MAX_VALUE))
        );

        sPanel69.setPreferredSize(new java.awt.Dimension(1675, 40));
        sPanel69.setBorderLine(2);
        sPanel69.setBorderSideLeft(false);
        sPanel69.setBorderSideRight(false);
        sPanel69.setBorderSideTop(false);
        sPanel69.setDefaultBorderColor(new java.awt.Color(240, 240, 240));

        buttonUnits_ViewTabOverview.setActiveLineColor(new java.awt.Color(205, 64, 68));
        buttonUnits_ViewTabOverview.setText("Overview");
        buttonUnits_ViewTabOverview.setToolTipText("");
        buttonUnits_ViewTabOverview.setActiveForegroundColor(new java.awt.Color(205, 64, 68));
        buttonUnits_ViewTabOverview.setDefaultForegroundColor(new java.awt.Color(56, 56, 56));

        buttonUnits_ViewTabDocuments.setActiveLineColor(new java.awt.Color(205, 64, 68));
        buttonUnits_ViewTabDocuments.setText("Documents");
        buttonUnits_ViewTabDocuments.setToolTipText("");
        buttonUnits_ViewTabDocuments.setActiveForegroundColor(new java.awt.Color(205, 64, 68));
        buttonUnits_ViewTabDocuments.setDefaultForegroundColor(new java.awt.Color(56, 56, 56));

        buttonUnits_ViewTabConcerns.setActiveLineColor(new java.awt.Color(205, 64, 68));
        buttonUnits_ViewTabConcerns.setText("Concerns");
        buttonUnits_ViewTabConcerns.setToolTipText("");
        buttonUnits_ViewTabConcerns.setActiveForegroundColor(new java.awt.Color(205, 64, 68));
        buttonUnits_ViewTabConcerns.setDefaultForegroundColor(new java.awt.Color(56, 56, 56));

        buttonUnits_ViewTabVisitors.setActiveLineColor(new java.awt.Color(205, 64, 68));
        buttonUnits_ViewTabVisitors.setText("Visitors");
        buttonUnits_ViewTabVisitors.setToolTipText("");
        buttonUnits_ViewTabVisitors.setActiveForegroundColor(new java.awt.Color(205, 64, 68));
        buttonUnits_ViewTabVisitors.setDefaultForegroundColor(new java.awt.Color(56, 56, 56));

        buttonUnits_ViewTabActivityLog.setActiveLineColor(new java.awt.Color(205, 64, 68));
        buttonUnits_ViewTabActivityLog.setText("Activity Log");
        buttonUnits_ViewTabActivityLog.setToolTipText("");
        buttonUnits_ViewTabActivityLog.setActiveForegroundColor(new java.awt.Color(205, 64, 68));
        buttonUnits_ViewTabActivityLog.setDefaultForegroundColor(new java.awt.Color(56, 56, 56));

        buttonUnits_ViewTabViolations.setActiveLineColor(new java.awt.Color(205, 64, 68));
        buttonUnits_ViewTabViolations.setText("Violations");
        buttonUnits_ViewTabViolations.setToolTipText("");
        buttonUnits_ViewTabViolations.setActiveForegroundColor(new java.awt.Color(205, 64, 68));
        buttonUnits_ViewTabViolations.setDefaultForegroundColor(new java.awt.Color(56, 56, 56));

        javax.swing.GroupLayout sPanel69Layout = new javax.swing.GroupLayout(sPanel69);
        sPanel69.setLayout(sPanel69Layout);
        sPanel69Layout.setHorizontalGroup(
            sPanel69Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(sPanel69Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(buttonUnits_ViewTabOverview, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(buttonUnits_ViewTabDocuments, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(buttonUnits_ViewTabConcerns, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(buttonUnits_ViewTabViolations, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(buttonUnits_ViewTabVisitors, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(buttonUnits_ViewTabActivityLog, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        sPanel69Layout.setVerticalGroup(
            sPanel69Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(buttonUnits_ViewTabOverview, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
            .addComponent(buttonUnits_ViewTabDocuments, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
            .addComponent(buttonUnits_ViewTabConcerns, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
            .addComponent(buttonUnits_ViewTabActivityLog, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
            .addComponent(buttonUnits_ViewTabVisitors, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
            .addComponent(buttonUnits_ViewTabViolations, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
        );

        sPanel4.setPaintBackground(false);
        sPanel4.setDangerBackgroundColor(new java.awt.Color(51, 51, 255));

        jLayeredPane3.setLayout(new java.awt.CardLayout());

        layerUnits_ViewLoading.setName("Loading"); // NOI18N

        jPanel3.setOpaque(false);

        sLabel16.setForeground(new java.awt.Color(255, 127, 127));
        sLabel16.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        sLabel16.setText("Loading");
        sLabel16.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N

        sAnimatedOffline5.setLineColor(new java.awt.Color(255, 127, 127));
        sAnimatedOffline5.setLineWidth(5.0F);
        sAnimatedOffline5.setPreferredSize(new java.awt.Dimension(160, 160));

        javax.swing.GroupLayout sAnimatedOffline5Layout = new javax.swing.GroupLayout(sAnimatedOffline5);
        sAnimatedOffline5.setLayout(sAnimatedOffline5Layout);
        sAnimatedOffline5Layout.setHorizontalGroup(
            sAnimatedOffline5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 61, Short.MAX_VALUE)
        );
        sAnimatedOffline5Layout.setVerticalGroup(
            sAnimatedOffline5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 58, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addComponent(sAnimatedOffline5, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(40, 40, 40))
                    .addComponent(sLabel16, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(sAnimatedOffline5, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(sLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layerUnits_ViewLoadingLayout = new javax.swing.GroupLayout(layerUnits_ViewLoading);
        layerUnits_ViewLoading.setLayout(layerUnits_ViewLoadingLayout);
        layerUnits_ViewLoadingLayout.setHorizontalGroup(
            layerUnits_ViewLoadingLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layerUnits_ViewLoadingLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layerUnits_ViewLoadingLayout.setVerticalGroup(
            layerUnits_ViewLoadingLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layerUnits_ViewLoadingLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jLayeredPane3.add(layerUnits_ViewLoading, "card1");

        layerUnits_ViewOverview.setLayerButton(buttonUnits_ViewTabOverview);
        layerUnits_ViewOverview.setName("Overview"); // NOI18N

        sPanel86.setLayout(new java.awt.GridLayout(2, 0));

        sPanel75.setDefaultBackgroundColor(new java.awt.Color(254, 254, 254));
        sPanel75.setBorderLine(2);
        sPanel75.setDefaultBorderColor(new java.awt.Color(240, 240, 240));
        sPanel75.setRadius(20);
        sPanel75.setRounded(true);

        sPanel81.setMinimumSize(new java.awt.Dimension(0, 60));
        sPanel81.setPreferredSize(new java.awt.Dimension(648, 60));
        sPanel81.setPaintBackground(false);

        sLabel57.setForeground(new java.awt.Color(56, 56, 56));
        sLabel57.setIconSize(15);
        sLabel57.setText("Unit Information");
        sLabel57.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        sLabel57.setIconTextGap(10);

        unitsViewOverview_Edit.setMaximumSize(new java.awt.Dimension(70, 32767));
        unitsViewOverview_Edit.setPreferredSize(new java.awt.Dimension(111, 30));
        unitsViewOverview_Edit.setActiveBackgroundColor(new java.awt.Color(255, 230, 230));
        unitsViewOverview_Edit.setActiveHoverBackgroundColor(new java.awt.Color(255, 220, 220));
        unitsViewOverview_Edit.setBorderLine(1);
        unitsViewOverview_Edit.setDefaultBorderColor(new java.awt.Color(221, 221, 221));
        unitsViewOverview_Edit.setCanHover(true);
        unitsViewOverview_Edit.setHoverBackgroundColor(new java.awt.Color(240, 240, 240));
        unitsViewOverview_Edit.setRadius(7);
        unitsViewOverview_Edit.setRounded(true);

        sLabel46.setForeground(new java.awt.Color(56, 56, 56));
        sLabel46.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        sLabel46.setIconSize(12);
        sLabel46.setScaledIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/moduleUnits/Edit.png"))); // NOI18N
        sLabel46.setText("Edit");
        sLabel46.setFont(new java.awt.Font("Segoe UI", 1, 10)); // NOI18N
        sLabel46.setIconTextGap(10);

        javax.swing.GroupLayout unitsViewOverview_EditLayout = new javax.swing.GroupLayout(unitsViewOverview_Edit);
        unitsViewOverview_Edit.setLayout(unitsViewOverview_EditLayout);
        unitsViewOverview_EditLayout.setHorizontalGroup(
            unitsViewOverview_EditLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(unitsViewOverview_EditLayout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(sLabel46, javax.swing.GroupLayout.DEFAULT_SIZE, 72, Short.MAX_VALUE)
                .addGap(0, 0, 0))
        );
        unitsViewOverview_EditLayout.setVerticalGroup(
            unitsViewOverview_EditLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(unitsViewOverview_EditLayout.createSequentialGroup()
                .addComponent(sLabel46, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
                .addGap(0, 0, 0))
        );

        sPanel87.setPreferredSize(new java.awt.Dimension(35, 35));
        sPanel87.setDefaultBackgroundColor(new java.awt.Color(228, 239, 253));
        sPanel87.setRadius(10);
        sPanel87.setRounded(true);

        sLabel58.setForeground(new java.awt.Color(56, 56, 56));
        sLabel58.setIconSize(15);
        sLabel58.setScaledIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/moduleUnits/unitInformation.png"))); // NOI18N
        sLabel58.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        sLabel58.setIconTextGap(10);

        javax.swing.GroupLayout sPanel87Layout = new javax.swing.GroupLayout(sPanel87);
        sPanel87.setLayout(sPanel87Layout);
        sPanel87Layout.setHorizontalGroup(
            sPanel87Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(sPanel87Layout.createSequentialGroup()
                .addGap(0, 10, Short.MAX_VALUE)
                .addComponent(sLabel58, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 10, Short.MAX_VALUE))
        );
        sPanel87Layout.setVerticalGroup(
            sPanel87Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, sPanel87Layout.createSequentialGroup()
                .addGap(0, 10, Short.MAX_VALUE)
                .addComponent(sLabel58, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 10, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout sPanel81Layout = new javax.swing.GroupLayout(sPanel81);
        sPanel81.setLayout(sPanel81Layout);
        sPanel81Layout.setHorizontalGroup(
            sPanel81Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(sPanel81Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(sPanel87, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(sLabel57, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 62, Short.MAX_VALUE)
                .addComponent(unitsViewOverview_Edit, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25))
        );
        sPanel81Layout.setVerticalGroup(
            sPanel81Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(sLabel57, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(sPanel81Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(sPanel81Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(unitsViewOverview_Edit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(sPanel87, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, Short.MAX_VALUE))
        );

        sPanel88.setPreferredSize(new java.awt.Dimension(100, 100));
        sPanel88.setPaintBackground(false);

        sPanel104.setPaintBackground(false);
        sPanel104.setLayout(new javax.swing.BoxLayout(sPanel104, javax.swing.BoxLayout.Y_AXIS));

        sPanel110.setMaximumSize(new java.awt.Dimension(32767, 30));
        sPanel110.setPreferredSize(new java.awt.Dimension(362, 30));
        sPanel110.setPaintBackground(false);
        sPanel110.setLayout(new java.awt.GridLayout(1, 0));

        sLabel45.setForeground(new java.awt.Color(56, 56, 56));
        sLabel45.setText("Unit ID");
        sPanel110.add(sLabel45);

        sLabel_unitinfo_unitid.setForeground(new java.awt.Color(56, 56, 56));
        sLabel_unitinfo_unitid.setText("null");
        sPanel110.add(sLabel_unitinfo_unitid);

        sPanel104.add(sPanel110);

        sPanel111.setMaximumSize(new java.awt.Dimension(32767, 30));
        sPanel111.setPreferredSize(new java.awt.Dimension(362, 30));
        sPanel111.setPaintBackground(false);
        sPanel111.setLayout(new java.awt.GridLayout(1, 0));

        sLabel47.setForeground(new java.awt.Color(56, 56, 56));
        sLabel47.setText("Tower");
        sPanel111.add(sLabel47);

        sLabel_unitinfo_tower.setForeground(new java.awt.Color(56, 56, 56));
        sLabel_unitinfo_tower.setText("null");
        sPanel111.add(sLabel_unitinfo_tower);

        sPanel104.add(sPanel111);

        sPanel112.setMaximumSize(new java.awt.Dimension(32767, 30));
        sPanel112.setPreferredSize(new java.awt.Dimension(362, 30));
        sPanel112.setPaintBackground(false);
        sPanel112.setLayout(new java.awt.GridLayout(1, 0));

        sLabel49.setForeground(new java.awt.Color(56, 56, 56));
        sLabel49.setText("Floor");
        sPanel112.add(sLabel49);

        sLabel_unitinfo_floor.setForeground(new java.awt.Color(56, 56, 56));
        sLabel_unitinfo_floor.setText("null");
        sPanel112.add(sLabel_unitinfo_floor);

        sPanel104.add(sPanel112);

        sPanel113.setMaximumSize(new java.awt.Dimension(32767, 30));
        sPanel113.setPreferredSize(new java.awt.Dimension(362, 30));
        sPanel113.setPaintBackground(false);
        sPanel113.setLayout(new java.awt.GridLayout(1, 0));

        sLabel54.setForeground(new java.awt.Color(56, 56, 56));
        sLabel54.setText("Unit");
        sPanel113.add(sLabel54);

        sLabel_unitinfo_unit.setForeground(new java.awt.Color(56, 56, 56));
        sLabel_unitinfo_unit.setText("null");
        sPanel113.add(sLabel_unitinfo_unit);

        sPanel104.add(sPanel113);

        sPanel114.setMaximumSize(new java.awt.Dimension(32767, 30));
        sPanel114.setPreferredSize(new java.awt.Dimension(362, 30));
        sPanel114.setPaintBackground(false);
        sPanel114.setLayout(new java.awt.GridLayout(1, 0));

        sLabel56.setForeground(new java.awt.Color(56, 56, 56));
        sLabel56.setText("Model");
        sPanel114.add(sLabel56);

        sLabel_unitinfo_model.setForeground(new java.awt.Color(56, 56, 56));
        sLabel_unitinfo_model.setText("null");
        sPanel114.add(sLabel_unitinfo_model);

        sPanel104.add(sPanel114);

        sPanel115.setMaximumSize(new java.awt.Dimension(32767, 30));
        sPanel115.setPreferredSize(new java.awt.Dimension(362, 30));
        sPanel115.setPaintBackground(false);
        sPanel115.setLayout(new java.awt.GridLayout(1, 0));

        sLabel63.setForeground(new java.awt.Color(56, 56, 56));
        sLabel63.setText("Balcony");
        sPanel115.add(sLabel63);

        sLabel_unitinfo_balcony.setForeground(new java.awt.Color(56, 56, 56));
        sLabel_unitinfo_balcony.setText("null");
        sPanel115.add(sLabel_unitinfo_balcony);

        sPanel104.add(sPanel115);

        sPanel116.setMaximumSize(new java.awt.Dimension(32767, 30));
        sPanel116.setPreferredSize(new java.awt.Dimension(362, 30));
        sPanel116.setPaintBackground(false);
        sPanel116.setLayout(new java.awt.GridLayout(1, 0));

        sLabel65.setForeground(new java.awt.Color(56, 56, 56));
        sLabel65.setText("Floor Area");
        sPanel116.add(sLabel65);

        sLabel_unitinfo_floorarea.setForeground(new java.awt.Color(56, 56, 56));
        sLabel_unitinfo_floorarea.setText("null");
        sPanel116.add(sLabel_unitinfo_floorarea);

        sPanel104.add(sPanel116);

        sPanel117.setMaximumSize(new java.awt.Dimension(32767, 30));
        sPanel117.setPreferredSize(new java.awt.Dimension(362, 30));
        sPanel117.setPaintBackground(false);
        sPanel117.setLayout(new java.awt.GridLayout(1, 0));

        sLabel68.setForeground(new java.awt.Color(56, 56, 56));
        sLabel68.setText("Status");
        sPanel117.add(sLabel68);

        sLabel_unitinfo_status.setForeground(new java.awt.Color(56, 56, 56));
        sLabel_unitinfo_status.setText("null");
        sPanel117.add(sLabel_unitinfo_status);

        sPanel104.add(sPanel117);

        sPanel118.setMaximumSize(new java.awt.Dimension(32767, 30));
        sPanel118.setPreferredSize(new java.awt.Dimension(362, 30));
        sPanel118.setPaintBackground(false);
        sPanel118.setLayout(new java.awt.GridLayout(1, 0));

        sLabel70.setForeground(new java.awt.Color(56, 56, 56));
        sLabel70.setText("Turn Over Date");
        sPanel118.add(sLabel70);

        sLabel_unitinfo_turnover.setForeground(new java.awt.Color(56, 56, 56));
        sLabel_unitinfo_turnover.setText("null");
        sPanel118.add(sLabel_unitinfo_turnover);

        sPanel104.add(sPanel118);

        javax.swing.GroupLayout sPanel88Layout = new javax.swing.GroupLayout(sPanel88);
        sPanel88.setLayout(sPanel88Layout);
        sPanel88Layout.setHorizontalGroup(
            sPanel88Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(sPanel88Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(sPanel104, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                .addGap(25, 25, 25))
        );
        sPanel88Layout.setVerticalGroup(
            sPanel88Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(sPanel88Layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(sPanel104, javax.swing.GroupLayout.DEFAULT_SIZE, 255, Short.MAX_VALUE)
                .addGap(20, 20, 20))
        );

        javax.swing.GroupLayout sPanel75Layout = new javax.swing.GroupLayout(sPanel75);
        sPanel75.setLayout(sPanel75Layout);
        sPanel75Layout.setHorizontalGroup(
            sPanel75Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(sPanel88, javax.swing.GroupLayout.DEFAULT_SIZE, 333, Short.MAX_VALUE)
            .addComponent(sPanel81, javax.swing.GroupLayout.DEFAULT_SIZE, 333, Short.MAX_VALUE)
        );
        sPanel75Layout.setVerticalGroup(
            sPanel75Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(sPanel75Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(sPanel81, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addComponent(sPanel88, javax.swing.GroupLayout.DEFAULT_SIZE, 275, Short.MAX_VALUE)
                .addGap(0, 0, 0))
        );

        javax.swing.GroupLayout sPanel71Layout = new javax.swing.GroupLayout(sPanel71);
        sPanel71.setLayout(sPanel71Layout);
        sPanel71Layout.setHorizontalGroup(
            sPanel71Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(sPanel71Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(sPanel75, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(10, 10, 10))
        );
        sPanel71Layout.setVerticalGroup(
            sPanel71Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(sPanel71Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(sPanel75, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(10, 10, 10))
        );

        sPanel86.add(sPanel71);

        sPanel77.setDefaultBackgroundColor(new java.awt.Color(254, 254, 254));
        sPanel77.setBorderLine(2);
        sPanel77.setDefaultBorderColor(new java.awt.Color(240, 240, 240));
        sPanel77.setRadius(20);
        sPanel77.setRounded(true);

        sPanel89.setMinimumSize(new java.awt.Dimension(0, 60));
        sPanel89.setPreferredSize(new java.awt.Dimension(648, 60));
        sPanel89.setPaintBackground(false);

        sPanel90.setPreferredSize(new java.awt.Dimension(35, 35));
        sPanel90.setDefaultBackgroundColor(new java.awt.Color(228, 239, 253));
        sPanel90.setRadius(10);
        sPanel90.setRounded(true);

        sLabel59.setForeground(new java.awt.Color(56, 56, 56));
        sLabel59.setIconSize(15);
        sLabel59.setScaledIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/moduleUnits/accountInformation.png"))); // NOI18N
        sLabel59.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        sLabel59.setIconTextGap(10);

        javax.swing.GroupLayout sPanel90Layout = new javax.swing.GroupLayout(sPanel90);
        sPanel90.setLayout(sPanel90Layout);
        sPanel90Layout.setHorizontalGroup(
            sPanel90Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(sPanel90Layout.createSequentialGroup()
                .addGap(0, 10, Short.MAX_VALUE)
                .addComponent(sLabel59, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 10, Short.MAX_VALUE))
        );
        sPanel90Layout.setVerticalGroup(
            sPanel90Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, sPanel90Layout.createSequentialGroup()
                .addGap(0, 10, Short.MAX_VALUE)
                .addComponent(sLabel59, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 10, Short.MAX_VALUE))
        );

        sLabel62.setForeground(new java.awt.Color(56, 56, 56));
        sLabel62.setIconSize(15);
        sLabel62.setText("Account Information");
        sLabel62.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        sLabel62.setIconTextGap(10);

        javax.swing.GroupLayout sPanel89Layout = new javax.swing.GroupLayout(sPanel89);
        sPanel89.setLayout(sPanel89Layout);
        sPanel89Layout.setHorizontalGroup(
            sPanel89Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(sPanel89Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(sPanel90, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(sLabel62, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(135, Short.MAX_VALUE))
        );
        sPanel89Layout.setVerticalGroup(
            sPanel89Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(sLabel62, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(sPanel89Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(sPanel90, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        sPanel91.setPreferredSize(new java.awt.Dimension(100, 100));
        sPanel91.setPaintBackground(false);

        sPanel105.setPaintBackground(false);
        sPanel105.setLayout(new javax.swing.BoxLayout(sPanel105, javax.swing.BoxLayout.Y_AXIS));

        sPanel119.setMaximumSize(new java.awt.Dimension(32767, 30));
        sPanel119.setPreferredSize(new java.awt.Dimension(362, 30));
        sPanel119.setPaintBackground(false);
        sPanel119.setLayout(new java.awt.GridLayout(1, 0));

        sLabel74.setForeground(new java.awt.Color(56, 56, 56));
        sLabel74.setText("Account Number");
        sPanel119.add(sLabel74);

        sLabel_accountinfo_accountnumber.setForeground(new java.awt.Color(56, 56, 56));
        sLabel_accountinfo_accountnumber.setText("null");
        sPanel119.add(sLabel_accountinfo_accountnumber);

        sPanel105.add(sPanel119);

        sPanel120.setMaximumSize(new java.awt.Dimension(32767, 30));
        sPanel120.setPreferredSize(new java.awt.Dimension(362, 30));
        sPanel120.setPaintBackground(false);
        sPanel120.setLayout(new java.awt.GridLayout(1, 0));

        sLabel76.setForeground(new java.awt.Color(56, 56, 56));
        sLabel76.setText("Account Holder");
        sPanel120.add(sLabel76);

        sLabel_accountinfo_accountholder.setForeground(new java.awt.Color(56, 56, 56));
        sLabel_accountinfo_accountholder.setText("null");
        sPanel120.add(sLabel_accountinfo_accountholder);

        sPanel105.add(sPanel120);

        sPanel121.setMaximumSize(new java.awt.Dimension(32767, 30));
        sPanel121.setPreferredSize(new java.awt.Dimension(362, 30));
        sPanel121.setPaintBackground(false);
        sPanel121.setLayout(new java.awt.GridLayout(1, 0));

        sLabel78.setForeground(new java.awt.Color(56, 56, 56));
        sLabel78.setText("Tax ID Number");
        sPanel121.add(sLabel78);

        sLabel_accountinfo_taxid.setForeground(new java.awt.Color(56, 56, 56));
        sLabel_accountinfo_taxid.setText("null");
        sPanel121.add(sLabel_accountinfo_taxid);

        sPanel105.add(sPanel121);

        sPanel122.setMaximumSize(new java.awt.Dimension(32767, 30));
        sPanel122.setPreferredSize(new java.awt.Dimension(362, 30));
        sPanel122.setPaintBackground(false);
        sPanel122.setLayout(new java.awt.GridLayout(1, 0));

        sLabel80.setForeground(new java.awt.Color(56, 56, 56));
        sLabel80.setText("ACR Number");
        sPanel122.add(sLabel80);

        sLabel_accountinfo_acrnumber.setForeground(new java.awt.Color(56, 56, 56));
        sLabel_accountinfo_acrnumber.setText("null");
        sPanel122.add(sLabel_accountinfo_acrnumber);

        sPanel105.add(sPanel122);

        sPanel123.setMaximumSize(new java.awt.Dimension(32767, 30));
        sPanel123.setPreferredSize(new java.awt.Dimension(362, 30));
        sPanel123.setPaintBackground(false);
        sPanel123.setLayout(new java.awt.GridLayout(1, 0));

        sLabel82.setForeground(new java.awt.Color(56, 56, 56));
        sLabel82.setText("Authorized Representative");
        sPanel123.add(sLabel82);

        sLabel_accountinfo_authorizedrepresentative.setForeground(new java.awt.Color(56, 56, 56));
        sLabel_accountinfo_authorizedrepresentative.setText("null");
        sPanel123.add(sLabel_accountinfo_authorizedrepresentative);

        sPanel105.add(sPanel123);

        sPanel124.setMaximumSize(new java.awt.Dimension(32767, 30));
        sPanel124.setPreferredSize(new java.awt.Dimension(362, 30));
        sPanel124.setPaintBackground(false);
        sPanel124.setLayout(new java.awt.GridLayout(1, 0));

        sLabel83.setForeground(new java.awt.Color(56, 56, 56));
        sLabel83.setText("Contact Number");
        sPanel124.add(sLabel83);

        sLabel_accountinfo_contactnumber.setForeground(new java.awt.Color(56, 56, 56));
        sLabel_accountinfo_contactnumber.setText("null");
        sPanel124.add(sLabel_accountinfo_contactnumber);

        sPanel105.add(sPanel124);

        javax.swing.GroupLayout sPanel91Layout = new javax.swing.GroupLayout(sPanel91);
        sPanel91.setLayout(sPanel91Layout);
        sPanel91Layout.setHorizontalGroup(
            sPanel91Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(sPanel91Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(sPanel105, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                .addGap(25, 25, 25))
        );
        sPanel91Layout.setVerticalGroup(
            sPanel91Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(sPanel91Layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(sPanel105, javax.swing.GroupLayout.DEFAULT_SIZE, 255, Short.MAX_VALUE)
                .addGap(20, 20, 20))
        );

        javax.swing.GroupLayout sPanel77Layout = new javax.swing.GroupLayout(sPanel77);
        sPanel77.setLayout(sPanel77Layout);
        sPanel77Layout.setHorizontalGroup(
            sPanel77Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(sPanel89, javax.swing.GroupLayout.DEFAULT_SIZE, 333, Short.MAX_VALUE)
            .addComponent(sPanel91, javax.swing.GroupLayout.DEFAULT_SIZE, 333, Short.MAX_VALUE)
        );
        sPanel77Layout.setVerticalGroup(
            sPanel77Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(sPanel77Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(sPanel89, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addComponent(sPanel91, javax.swing.GroupLayout.DEFAULT_SIZE, 275, Short.MAX_VALUE)
                .addGap(0, 0, 0))
        );

        javax.swing.GroupLayout sPanel72Layout = new javax.swing.GroupLayout(sPanel72);
        sPanel72.setLayout(sPanel72Layout);
        sPanel72Layout.setHorizontalGroup(
            sPanel72Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(sPanel72Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(sPanel77, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(10, 10, 10))
        );
        sPanel72Layout.setVerticalGroup(
            sPanel72Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(sPanel72Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(sPanel77, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(10, 10, 10))
        );

        sPanel86.add(sPanel72);

        sPanel82.setDefaultBackgroundColor(new java.awt.Color(254, 254, 254));
        sPanel82.setBorderLine(2);
        sPanel82.setDefaultBorderColor(new java.awt.Color(240, 240, 240));
        sPanel82.setRadius(20);
        sPanel82.setRounded(true);

        sPanel92.setMinimumSize(new java.awt.Dimension(0, 60));
        sPanel92.setPreferredSize(new java.awt.Dimension(648, 60));
        sPanel92.setPaintBackground(false);

        sLabel73.setForeground(new java.awt.Color(56, 56, 56));
        sLabel73.setIconSize(15);
        sLabel73.setText("Occupation Details");
        sLabel73.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        sLabel73.setIconTextGap(10);

        sPanel93.setPreferredSize(new java.awt.Dimension(35, 35));
        sPanel93.setDefaultBackgroundColor(new java.awt.Color(228, 239, 253));
        sPanel93.setRadius(10);
        sPanel93.setRounded(true);

        sLabel64.setForeground(new java.awt.Color(56, 56, 56));
        sLabel64.setIconSize(15);
        sLabel64.setScaledIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/moduleUnits/occupationDetails.png"))); // NOI18N
        sLabel64.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        sLabel64.setIconTextGap(10);

        javax.swing.GroupLayout sPanel93Layout = new javax.swing.GroupLayout(sPanel93);
        sPanel93.setLayout(sPanel93Layout);
        sPanel93Layout.setHorizontalGroup(
            sPanel93Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(sPanel93Layout.createSequentialGroup()
                .addGap(0, 10, Short.MAX_VALUE)
                .addComponent(sLabel64, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 10, Short.MAX_VALUE))
        );
        sPanel93Layout.setVerticalGroup(
            sPanel93Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, sPanel93Layout.createSequentialGroup()
                .addGap(0, 10, Short.MAX_VALUE)
                .addComponent(sLabel64, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 10, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout sPanel92Layout = new javax.swing.GroupLayout(sPanel92);
        sPanel92.setLayout(sPanel92Layout);
        sPanel92Layout.setHorizontalGroup(
            sPanel92Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(sPanel92Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(sPanel93, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(sLabel73, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 146, Short.MAX_VALUE))
        );
        sPanel92Layout.setVerticalGroup(
            sPanel92Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(sLabel73, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(sPanel92Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(sPanel93, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        sPanel94.setMinimumSize(new java.awt.Dimension(100, 100));
        sPanel94.setPreferredSize(new java.awt.Dimension(32767, 32767));
        sPanel94.setPaintBackground(false);

        sPanel106.setPaintBackground(false);
        sPanel106.setLayout(new javax.swing.BoxLayout(sPanel106, javax.swing.BoxLayout.Y_AXIS));

        sPanel136.setMaximumSize(new java.awt.Dimension(32767, 30));
        sPanel136.setPreferredSize(new java.awt.Dimension(362, 30));
        sPanel136.setPaintBackground(false);
        sPanel136.setLayout(new java.awt.GridLayout(1, 0));

        sLabel93.setForeground(new java.awt.Color(56, 56, 56));
        sLabel93.setText("Occupant Type");
        sPanel136.add(sLabel93);

        sLabel_occupationdetails_occupanttype.setForeground(new java.awt.Color(56, 56, 56));
        sLabel_occupationdetails_occupanttype.setText("?");
        sPanel136.add(sLabel_occupationdetails_occupanttype);

        sPanel106.add(sPanel136);

        sPanel128.setMaximumSize(new java.awt.Dimension(32767, 30));
        sPanel128.setPreferredSize(new java.awt.Dimension(362, 30));
        sPanel128.setPaintBackground(false);
        sPanel128.setLayout(new java.awt.GridLayout(1, 0));

        sLabel92.setForeground(new java.awt.Color(56, 56, 56));
        sLabel92.setText("Current Occupant");
        sPanel128.add(sLabel92);

        sLabel_occupationdetails_currentoccupant.setForeground(new java.awt.Color(56, 56, 56));
        sLabel_occupationdetails_currentoccupant.setText("?");
        sPanel128.add(sLabel_occupationdetails_currentoccupant);

        sPanel106.add(sPanel128);

        sPanel129.setMaximumSize(new java.awt.Dimension(32767, 30));
        sPanel129.setPreferredSize(new java.awt.Dimension(362, 30));
        sPanel129.setPaintBackground(false);
        sPanel129.setLayout(new java.awt.GridLayout(1, 0));

        sLabel94.setForeground(new java.awt.Color(56, 56, 56));
        sLabel94.setText("Residents");
        sPanel129.add(sLabel94);

        sLabel_occupationdetails_residents.setForeground(new java.awt.Color(56, 56, 56));
        sLabel_occupationdetails_residents.setText("?");
        sPanel129.add(sLabel_occupationdetails_residents);

        sPanel106.add(sPanel129);

        sPanel130.setMaximumSize(new java.awt.Dimension(32767, 30));
        sPanel130.setPreferredSize(new java.awt.Dimension(362, 30));
        sPanel130.setPaintBackground(false);
        sPanel130.setLayout(new java.awt.GridLayout(1, 0));

        sLabel96.setForeground(new java.awt.Color(56, 56, 56));
        sLabel96.setText("Dependents");
        sPanel130.add(sLabel96);

        sLabel_occupationdetails_dependents.setForeground(new java.awt.Color(56, 56, 56));
        sLabel_occupationdetails_dependents.setText("?");
        sPanel130.add(sLabel_occupationdetails_dependents);

        sPanel106.add(sPanel130);

        sPanel131.setMaximumSize(new java.awt.Dimension(32767, 30));
        sPanel131.setPreferredSize(new java.awt.Dimension(362, 30));
        sPanel131.setPaintBackground(false);
        sPanel131.setLayout(new java.awt.GridLayout(1, 0));

        sLabel98.setForeground(new java.awt.Color(56, 56, 56));
        sLabel98.setText("Spouse");
        sPanel131.add(sLabel98);

        sLabel_occupationdetails_spouse.setForeground(new java.awt.Color(56, 56, 56));
        sLabel_occupationdetails_spouse.setText("?");
        sPanel131.add(sLabel_occupationdetails_spouse);

        sPanel106.add(sPanel131);

        sPanel132.setMaximumSize(new java.awt.Dimension(32767, 30));
        sPanel132.setPreferredSize(new java.awt.Dimension(362, 30));
        sPanel132.setPaintBackground(false);
        sPanel132.setLayout(new java.awt.GridLayout(1, 0));

        sLabel100.setForeground(new java.awt.Color(56, 56, 56));
        sLabel100.setText("Contact Number");
        sPanel132.add(sLabel100);

        sLabel_occupationdetails_contactnumber.setForeground(new java.awt.Color(56, 56, 56));
        sLabel_occupationdetails_contactnumber.setText("?");
        sPanel132.add(sLabel_occupationdetails_contactnumber);

        sPanel106.add(sPanel132);

        sPanel133.setMaximumSize(new java.awt.Dimension(32767, 30));
        sPanel133.setPreferredSize(new java.awt.Dimension(362, 30));
        sPanel133.setPaintBackground(false);
        sPanel133.setLayout(new java.awt.GridLayout(1, 0));

        sLabel102.setForeground(new java.awt.Color(56, 56, 56));
        sLabel102.setText("Civil Status");
        sPanel133.add(sLabel102);

        sLabel_occupationdetails_civilstatus.setForeground(new java.awt.Color(56, 56, 56));
        sLabel_occupationdetails_civilstatus.setText("?");
        sPanel133.add(sLabel_occupationdetails_civilstatus);

        sPanel106.add(sPanel133);

        sPanel134.setMaximumSize(new java.awt.Dimension(32767, 30));
        sPanel134.setPreferredSize(new java.awt.Dimension(362, 30));
        sPanel134.setPaintBackground(false);
        sPanel134.setLayout(new java.awt.GridLayout(1, 0));

        sLabel104.setForeground(new java.awt.Color(56, 56, 56));
        sLabel104.setText("Weekender");
        sPanel134.add(sLabel104);

        sLabel_occupationdetails_weekender.setForeground(new java.awt.Color(56, 56, 56));
        sLabel_occupationdetails_weekender.setText("?");
        sPanel134.add(sLabel_occupationdetails_weekender);

        sPanel106.add(sPanel134);

        sPanel135.setMaximumSize(new java.awt.Dimension(32767, 30));
        sPanel135.setPreferredSize(new java.awt.Dimension(362, 30));
        sPanel135.setPaintBackground(false);
        sPanel135.setLayout(new java.awt.GridLayout(1, 0));

        sLabel106.setForeground(new java.awt.Color(56, 56, 56));
        sLabel106.setText("No Activity");
        sPanel135.add(sLabel106);

        sLabel_occupationdetails_noactivity.setForeground(new java.awt.Color(56, 56, 56));
        sLabel_occupationdetails_noactivity.setText("?");
        sPanel135.add(sLabel_occupationdetails_noactivity);

        sPanel106.add(sPanel135);

        javax.swing.GroupLayout sPanel94Layout = new javax.swing.GroupLayout(sPanel94);
        sPanel94.setLayout(sPanel94Layout);
        sPanel94Layout.setHorizontalGroup(
            sPanel94Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(sPanel94Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(sPanel106, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                .addGap(25, 25, 25))
        );
        sPanel94Layout.setVerticalGroup(
            sPanel94Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(sPanel94Layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(sPanel106, javax.swing.GroupLayout.DEFAULT_SIZE, 255, Short.MAX_VALUE)
                .addGap(20, 20, 20))
        );

        javax.swing.GroupLayout sPanel82Layout = new javax.swing.GroupLayout(sPanel82);
        sPanel82.setLayout(sPanel82Layout);
        sPanel82Layout.setHorizontalGroup(
            sPanel82Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(sPanel92, javax.swing.GroupLayout.DEFAULT_SIZE, 333, Short.MAX_VALUE)
            .addComponent(sPanel94, javax.swing.GroupLayout.DEFAULT_SIZE, 333, Short.MAX_VALUE)
        );
        sPanel82Layout.setVerticalGroup(
            sPanel82Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(sPanel82Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(sPanel92, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addComponent(sPanel94, javax.swing.GroupLayout.DEFAULT_SIZE, 275, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout sPanel73Layout = new javax.swing.GroupLayout(sPanel73);
        sPanel73.setLayout(sPanel73Layout);
        sPanel73Layout.setHorizontalGroup(
            sPanel73Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(sPanel73Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(sPanel82, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(10, 10, 10))
        );
        sPanel73Layout.setVerticalGroup(
            sPanel73Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(sPanel73Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(sPanel82, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(10, 10, 10))
        );

        sPanel86.add(sPanel73);

        sPanel83.setDefaultBackgroundColor(new java.awt.Color(254, 254, 254));
        sPanel83.setBorderLine(2);
        sPanel83.setDefaultBorderColor(new java.awt.Color(240, 240, 240));
        sPanel83.setRadius(20);
        sPanel83.setRounded(true);

        sPanel96.setMinimumSize(new java.awt.Dimension(0, 60));
        sPanel96.setPreferredSize(new java.awt.Dimension(648, 60));
        sPanel96.setPaintBackground(false);

        sPanel99.setPreferredSize(new java.awt.Dimension(35, 35));
        sPanel99.setDefaultBackgroundColor(new java.awt.Color(228, 239, 253));
        sPanel99.setRadius(10);
        sPanel99.setRounded(true);

        sLabel67.setForeground(new java.awt.Color(56, 56, 56));
        sLabel67.setIconSize(15);
        sLabel67.setScaledIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/moduleUnits/unitNotes.png"))); // NOI18N
        sLabel67.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        sLabel67.setIconTextGap(10);

        javax.swing.GroupLayout sPanel99Layout = new javax.swing.GroupLayout(sPanel99);
        sPanel99.setLayout(sPanel99Layout);
        sPanel99Layout.setHorizontalGroup(
            sPanel99Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(sPanel99Layout.createSequentialGroup()
                .addGap(0, 10, Short.MAX_VALUE)
                .addComponent(sLabel67, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 10, Short.MAX_VALUE))
        );
        sPanel99Layout.setVerticalGroup(
            sPanel99Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, sPanel99Layout.createSequentialGroup()
                .addGap(0, 10, Short.MAX_VALUE)
                .addComponent(sLabel67, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 10, Short.MAX_VALUE))
        );

        sLabel69.setForeground(new java.awt.Color(56, 56, 56));
        sLabel69.setIconSize(15);
        sLabel69.setText("Unit Notes");
        sLabel69.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        sLabel69.setIconTextGap(10);

        unitsViewOverview_EditNotes.setMaximumSize(new java.awt.Dimension(70, 32767));
        unitsViewOverview_EditNotes.setPreferredSize(new java.awt.Dimension(111, 30));
        unitsViewOverview_EditNotes.setActiveBackgroundColor(new java.awt.Color(255, 230, 230));
        unitsViewOverview_EditNotes.setActiveHoverBackgroundColor(new java.awt.Color(255, 220, 220));
        unitsViewOverview_EditNotes.setBorderLine(1);
        unitsViewOverview_EditNotes.setDefaultBorderColor(new java.awt.Color(221, 221, 221));
        unitsViewOverview_EditNotes.setCanHover(true);
        unitsViewOverview_EditNotes.setHoverBackgroundColor(new java.awt.Color(240, 240, 240));
        unitsViewOverview_EditNotes.setRadius(7);
        unitsViewOverview_EditNotes.setRounded(true);

        sLabel60.setForeground(new java.awt.Color(56, 56, 56));
        sLabel60.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        sLabel60.setIconSize(12);
        sLabel60.setText("Add Note");
        sLabel60.setFont(new java.awt.Font("Segoe UI", 1, 10)); // NOI18N
        sLabel60.setIconTextGap(10);

        javax.swing.GroupLayout unitsViewOverview_EditNotesLayout = new javax.swing.GroupLayout(unitsViewOverview_EditNotes);
        unitsViewOverview_EditNotes.setLayout(unitsViewOverview_EditNotesLayout);
        unitsViewOverview_EditNotesLayout.setHorizontalGroup(
            unitsViewOverview_EditNotesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(unitsViewOverview_EditNotesLayout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(sLabel60, javax.swing.GroupLayout.DEFAULT_SIZE, 72, Short.MAX_VALUE)
                .addGap(0, 0, 0))
        );
        unitsViewOverview_EditNotesLayout.setVerticalGroup(
            unitsViewOverview_EditNotesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(unitsViewOverview_EditNotesLayout.createSequentialGroup()
                .addComponent(sLabel60, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
                .addGap(0, 0, 0))
        );

        javax.swing.GroupLayout sPanel96Layout = new javax.swing.GroupLayout(sPanel96);
        sPanel96.setLayout(sPanel96Layout);
        sPanel96Layout.setHorizontalGroup(
            sPanel96Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(sPanel96Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(sPanel99, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(sLabel69, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(unitsViewOverview_EditNotes, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25))
        );
        sPanel96Layout.setVerticalGroup(
            sPanel96Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(sLabel69, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(sPanel96Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(sPanel96Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(sPanel99, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(unitsViewOverview_EditNotes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, Short.MAX_VALUE))
        );

        sPanel103.setPreferredSize(new java.awt.Dimension(100, 100));
        sPanel103.setPaintBackground(false);

        jLayeredPane4.setLayout(new java.awt.CardLayout());

        layerUnits_NotesEmpty.setPaintBackground(false);

        sLabel48.setForeground(new java.awt.Color(56, 56, 56));
        sLabel48.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        sLabel48.setText("No notes yet");
        sLabel48.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N

        sLabel55.setForeground(new java.awt.Color(91, 91, 91));
        sLabel55.setText("Add important notes about this unit");

        javax.swing.GroupLayout sPanel95Layout = new javax.swing.GroupLayout(sPanel95);
        sPanel95.setLayout(sPanel95Layout);
        sPanel95Layout.setHorizontalGroup(
            sPanel95Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(sPanel95Layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addGroup(sPanel95Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(sLabel55, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(sLabel48, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        sPanel95Layout.setVerticalGroup(
            sPanel95Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(sPanel95Layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(sLabel48, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(5, 5, 5)
                .addComponent(sLabel55, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout layerUnits_NotesEmptyLayout = new javax.swing.GroupLayout(layerUnits_NotesEmpty);
        layerUnits_NotesEmpty.setLayout(layerUnits_NotesEmptyLayout);
        layerUnits_NotesEmptyLayout.setHorizontalGroup(
            layerUnits_NotesEmptyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layerUnits_NotesEmptyLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(sPanel95, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layerUnits_NotesEmptyLayout.setVerticalGroup(
            layerUnits_NotesEmptyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layerUnits_NotesEmptyLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(sPanel95, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jLayeredPane4.add(layerUnits_NotesEmpty, "card1");

        layerUnits_Notes.setPaintBackground(false);

        javax.swing.GroupLayout layerUnits_NotesLayout = new javax.swing.GroupLayout(layerUnits_Notes);
        layerUnits_Notes.setLayout(layerUnits_NotesLayout);
        layerUnits_NotesLayout.setHorizontalGroup(
            layerUnits_NotesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 333, Short.MAX_VALUE)
        );
        layerUnits_NotesLayout.setVerticalGroup(
            layerUnits_NotesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 273, Short.MAX_VALUE)
        );

        jLayeredPane4.setLayer(layerUnits_Notes, javax.swing.JLayeredPane.PALETTE_LAYER);
        jLayeredPane4.add(layerUnits_Notes, "card2");

        javax.swing.GroupLayout sPanel103Layout = new javax.swing.GroupLayout(sPanel103);
        sPanel103.setLayout(sPanel103Layout);
        sPanel103Layout.setHorizontalGroup(
            sPanel103Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(sPanel103Layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(jLayeredPane4)
                .addGap(0, 0, 0))
        );
        sPanel103Layout.setVerticalGroup(
            sPanel103Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(sPanel103Layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(jLayeredPane4)
                .addGap(0, 0, 0))
        );

        javax.swing.GroupLayout sPanel83Layout = new javax.swing.GroupLayout(sPanel83);
        sPanel83.setLayout(sPanel83Layout);
        sPanel83Layout.setHorizontalGroup(
            sPanel83Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(sPanel103, javax.swing.GroupLayout.DEFAULT_SIZE, 333, Short.MAX_VALUE)
            .addComponent(sPanel96, javax.swing.GroupLayout.DEFAULT_SIZE, 333, Short.MAX_VALUE)
        );
        sPanel83Layout.setVerticalGroup(
            sPanel83Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(sPanel83Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(sPanel96, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addComponent(sPanel103, javax.swing.GroupLayout.DEFAULT_SIZE, 273, Short.MAX_VALUE)
                .addGap(2, 2, 2))
        );

        javax.swing.GroupLayout sPanel80Layout = new javax.swing.GroupLayout(sPanel80);
        sPanel80.setLayout(sPanel80Layout);
        sPanel80Layout.setHorizontalGroup(
            sPanel80Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(sPanel80Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(sPanel83, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(10, 10, 10))
        );
        sPanel80Layout.setVerticalGroup(
            sPanel80Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(sPanel80Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(sPanel83, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(10, 10, 10))
        );

        sPanel86.add(sPanel80);

        sPanel84.setDefaultBackgroundColor(new java.awt.Color(254, 254, 254));
        sPanel84.setBorderLine(2);
        sPanel84.setDefaultBorderColor(new java.awt.Color(240, 240, 240));
        sPanel84.setRadius(20);
        sPanel84.setRounded(true);

        sPanel107.setPreferredSize(new java.awt.Dimension(100, 100));
        sPanel107.setPaintBackground(false);

        jLayeredPane5.setLayout(new java.awt.CardLayout());

        layerUnits_ConcernsSummaryEmpty.setPaintBackground(false);

        sLabel61.setForeground(new java.awt.Color(56, 56, 56));
        sLabel61.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        sLabel61.setText("No concerns");
        sLabel61.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N

        sLabel66.setForeground(new java.awt.Color(91, 91, 91));
        sLabel66.setText("This unit has no reported concerns");

        javax.swing.GroupLayout sPanel97Layout = new javax.swing.GroupLayout(sPanel97);
        sPanel97.setLayout(sPanel97Layout);
        sPanel97Layout.setHorizontalGroup(
            sPanel97Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(sPanel97Layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addGroup(sPanel97Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(sLabel66, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(sLabel61, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        sPanel97Layout.setVerticalGroup(
            sPanel97Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(sPanel97Layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(sLabel61, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(5, 5, 5)
                .addComponent(sLabel66, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout layerUnits_ConcernsSummaryEmptyLayout = new javax.swing.GroupLayout(layerUnits_ConcernsSummaryEmpty);
        layerUnits_ConcernsSummaryEmpty.setLayout(layerUnits_ConcernsSummaryEmptyLayout);
        layerUnits_ConcernsSummaryEmptyLayout.setHorizontalGroup(
            layerUnits_ConcernsSummaryEmptyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layerUnits_ConcernsSummaryEmptyLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(sPanel97, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layerUnits_ConcernsSummaryEmptyLayout.setVerticalGroup(
            layerUnits_ConcernsSummaryEmptyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layerUnits_ConcernsSummaryEmptyLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(sPanel97, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jLayeredPane5.add(layerUnits_ConcernsSummaryEmpty, "card1");

        layerUnits_ConcernsSummary.setPaintBackground(false);

        javax.swing.GroupLayout layerUnits_ConcernsSummaryLayout = new javax.swing.GroupLayout(layerUnits_ConcernsSummary);
        layerUnits_ConcernsSummary.setLayout(layerUnits_ConcernsSummaryLayout);
        layerUnits_ConcernsSummaryLayout.setHorizontalGroup(
            layerUnits_ConcernsSummaryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 333, Short.MAX_VALUE)
        );
        layerUnits_ConcernsSummaryLayout.setVerticalGroup(
            layerUnits_ConcernsSummaryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 273, Short.MAX_VALUE)
        );

        jLayeredPane5.setLayer(layerUnits_ConcernsSummary, javax.swing.JLayeredPane.PALETTE_LAYER);
        jLayeredPane5.add(layerUnits_ConcernsSummary, "card2");

        javax.swing.GroupLayout sPanel107Layout = new javax.swing.GroupLayout(sPanel107);
        sPanel107.setLayout(sPanel107Layout);
        sPanel107Layout.setHorizontalGroup(
            sPanel107Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(sPanel107Layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(jLayeredPane5)
                .addGap(0, 0, 0))
        );
        sPanel107Layout.setVerticalGroup(
            sPanel107Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(sPanel107Layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(jLayeredPane5)
                .addGap(0, 0, 0))
        );

        sPanel102.setMinimumSize(new java.awt.Dimension(0, 60));
        sPanel102.setPreferredSize(new java.awt.Dimension(648, 60));
        sPanel102.setPaintBackground(false);

        sPanel108.setPreferredSize(new java.awt.Dimension(35, 35));
        sPanel108.setDefaultBackgroundColor(new java.awt.Color(240, 217, 217));
        sPanel108.setRadius(10);
        sPanel108.setRounded(true);

        sLabel71.setForeground(new java.awt.Color(56, 56, 56));
        sLabel71.setIconSize(15);
        sLabel71.setScaledIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/moduleUnits/concerns.png"))); // NOI18N
        sLabel71.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        sLabel71.setIconTextGap(10);

        javax.swing.GroupLayout sPanel108Layout = new javax.swing.GroupLayout(sPanel108);
        sPanel108.setLayout(sPanel108Layout);
        sPanel108Layout.setHorizontalGroup(
            sPanel108Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(sPanel108Layout.createSequentialGroup()
                .addGap(0, 10, Short.MAX_VALUE)
                .addComponent(sLabel71, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 10, Short.MAX_VALUE))
        );
        sPanel108Layout.setVerticalGroup(
            sPanel108Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, sPanel108Layout.createSequentialGroup()
                .addGap(0, 10, Short.MAX_VALUE)
                .addComponent(sLabel71, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 10, Short.MAX_VALUE))
        );

        sLabel72.setForeground(new java.awt.Color(56, 56, 56));
        sLabel72.setIconSize(15);
        sLabel72.setText("Concerns Summary");
        sLabel72.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        sLabel72.setIconTextGap(10);

        unitsViewOverview_ViewAllConcerns.setMaximumSize(new java.awt.Dimension(70, 32767));
        unitsViewOverview_ViewAllConcerns.setPreferredSize(new java.awt.Dimension(111, 30));
        unitsViewOverview_ViewAllConcerns.setActiveBackgroundColor(new java.awt.Color(255, 230, 230));
        unitsViewOverview_ViewAllConcerns.setActiveHoverBackgroundColor(new java.awt.Color(255, 220, 220));
        unitsViewOverview_ViewAllConcerns.setBorderLine(1);
        unitsViewOverview_ViewAllConcerns.setDefaultBorderColor(new java.awt.Color(221, 221, 221));
        unitsViewOverview_ViewAllConcerns.setCanHover(true);
        unitsViewOverview_ViewAllConcerns.setHoverBackgroundColor(new java.awt.Color(240, 240, 240));
        unitsViewOverview_ViewAllConcerns.setRadius(7);
        unitsViewOverview_ViewAllConcerns.setRounded(true);

        sLabel50.setForeground(new java.awt.Color(56, 56, 56));
        sLabel50.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        sLabel50.setIconSize(12);
        sLabel50.setText("View All");
        sLabel50.setFont(new java.awt.Font("Segoe UI", 1, 10)); // NOI18N
        sLabel50.setIconTextGap(10);

        javax.swing.GroupLayout unitsViewOverview_ViewAllConcernsLayout = new javax.swing.GroupLayout(unitsViewOverview_ViewAllConcerns);
        unitsViewOverview_ViewAllConcerns.setLayout(unitsViewOverview_ViewAllConcernsLayout);
        unitsViewOverview_ViewAllConcernsLayout.setHorizontalGroup(
            unitsViewOverview_ViewAllConcernsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(unitsViewOverview_ViewAllConcernsLayout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(sLabel50, javax.swing.GroupLayout.DEFAULT_SIZE, 72, Short.MAX_VALUE)
                .addGap(0, 0, 0))
        );
        unitsViewOverview_ViewAllConcernsLayout.setVerticalGroup(
            unitsViewOverview_ViewAllConcernsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(unitsViewOverview_ViewAllConcernsLayout.createSequentialGroup()
                .addComponent(sLabel50, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
                .addGap(0, 0, 0))
        );

        javax.swing.GroupLayout sPanel102Layout = new javax.swing.GroupLayout(sPanel102);
        sPanel102.setLayout(sPanel102Layout);
        sPanel102Layout.setHorizontalGroup(
            sPanel102Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(sPanel102Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(sPanel108, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(sLabel72, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(unitsViewOverview_ViewAllConcerns, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25))
        );
        sPanel102Layout.setVerticalGroup(
            sPanel102Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(sLabel72, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(sPanel102Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(sPanel102Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(sPanel108, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(unitsViewOverview_ViewAllConcerns, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout sPanel84Layout = new javax.swing.GroupLayout(sPanel84);
        sPanel84.setLayout(sPanel84Layout);
        sPanel84Layout.setHorizontalGroup(
            sPanel84Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(sPanel107, javax.swing.GroupLayout.DEFAULT_SIZE, 333, Short.MAX_VALUE)
            .addComponent(sPanel102, javax.swing.GroupLayout.DEFAULT_SIZE, 333, Short.MAX_VALUE)
        );
        sPanel84Layout.setVerticalGroup(
            sPanel84Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(sPanel84Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(sPanel102, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addComponent(sPanel107, javax.swing.GroupLayout.DEFAULT_SIZE, 273, Short.MAX_VALUE)
                .addGap(2, 2, 2))
        );

        javax.swing.GroupLayout sPanel79Layout = new javax.swing.GroupLayout(sPanel79);
        sPanel79.setLayout(sPanel79Layout);
        sPanel79Layout.setHorizontalGroup(
            sPanel79Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(sPanel79Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(sPanel84, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(10, 10, 10))
        );
        sPanel79Layout.setVerticalGroup(
            sPanel79Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(sPanel79Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(sPanel84, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(10, 10, 10))
        );

        sPanel86.add(sPanel79);

        sPanel85.setDefaultBackgroundColor(new java.awt.Color(254, 254, 254));
        sPanel85.setBorderLine(2);
        sPanel85.setDefaultBorderColor(new java.awt.Color(240, 240, 240));
        sPanel85.setRadius(20);
        sPanel85.setRounded(true);

        sPanel125.setMinimumSize(new java.awt.Dimension(0, 60));
        sPanel125.setPreferredSize(new java.awt.Dimension(648, 60));
        sPanel125.setPaintBackground(false);

        sPanel126.setPreferredSize(new java.awt.Dimension(35, 35));
        sPanel126.setDefaultBackgroundColor(new java.awt.Color(254, 246, 233));
        sPanel126.setRadius(10);
        sPanel126.setRounded(true);

        sLabel75.setForeground(new java.awt.Color(56, 56, 56));
        sLabel75.setIconSize(15);
        sLabel75.setScaledIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/moduleUnits/quickActions.png"))); // NOI18N
        sLabel75.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        sLabel75.setIconTextGap(10);

        javax.swing.GroupLayout sPanel126Layout = new javax.swing.GroupLayout(sPanel126);
        sPanel126.setLayout(sPanel126Layout);
        sPanel126Layout.setHorizontalGroup(
            sPanel126Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(sPanel126Layout.createSequentialGroup()
                .addGap(0, 10, Short.MAX_VALUE)
                .addComponent(sLabel75, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 10, Short.MAX_VALUE))
        );
        sPanel126Layout.setVerticalGroup(
            sPanel126Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, sPanel126Layout.createSequentialGroup()
                .addGap(0, 10, Short.MAX_VALUE)
                .addComponent(sLabel75, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 10, Short.MAX_VALUE))
        );

        sLabel77.setForeground(new java.awt.Color(56, 56, 56));
        sLabel77.setIconSize(15);
        sLabel77.setText("Quick Actions");
        sLabel77.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        sLabel77.setIconTextGap(10);

        javax.swing.GroupLayout sPanel125Layout = new javax.swing.GroupLayout(sPanel125);
        sPanel125.setLayout(sPanel125Layout);
        sPanel125Layout.setHorizontalGroup(
            sPanel125Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(sPanel125Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(sPanel126, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(sLabel77, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(178, Short.MAX_VALUE))
        );
        sPanel125Layout.setVerticalGroup(
            sPanel125Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(sLabel77, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(sPanel125Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(sPanel126, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        sPanel109.setPreferredSize(new java.awt.Dimension(100, 100));
        sPanel109.setPaintBackground(false);

        sPanel127.setPaintBackground(false);
        sPanel127.setLayout(new javax.swing.BoxLayout(sPanel127, javax.swing.BoxLayout.Y_AXIS));

        unitsViewOverview_ViewOwner.setMaximumSize(new java.awt.Dimension(32767, 40));
        unitsViewOverview_ViewOwner.setPreferredSize(new java.awt.Dimension(362, 40));
        unitsViewOverview_ViewOwner.setBorderLine(2);
        unitsViewOverview_ViewOwner.setDefaultBorderColor(new java.awt.Color(240, 240, 240));
        unitsViewOverview_ViewOwner.setCanHover(true);
        unitsViewOverview_ViewOwner.setHoverBackgroundColor(new java.awt.Color(250, 250, 250));
        unitsViewOverview_ViewOwner.setRadius(7);
        unitsViewOverview_ViewOwner.setRounded(true);

        sPanel98.setPreferredSize(new java.awt.Dimension(22, 22));
        sPanel98.setDefaultBackgroundColor(new java.awt.Color(228, 239, 253));
        sPanel98.setRadius(7);
        sPanel98.setRounded(true);

        sLabel84.setIconSize(11);
        sLabel84.setScaledIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/moduleUnits/viewOwners.png"))); // NOI18N

        javax.swing.GroupLayout sPanel98Layout = new javax.swing.GroupLayout(sPanel98);
        sPanel98.setLayout(sPanel98Layout);
        sPanel98Layout.setHorizontalGroup(
            sPanel98Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(sPanel98Layout.createSequentialGroup()
                .addGap(0, 6, Short.MAX_VALUE)
                .addComponent(sLabel84, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 5, Short.MAX_VALUE))
        );
        sPanel98Layout.setVerticalGroup(
            sPanel98Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(sPanel98Layout.createSequentialGroup()
                .addGap(0, 6, Short.MAX_VALUE)
                .addComponent(sLabel84, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 5, Short.MAX_VALUE))
        );

        sLabel79.setForeground(new java.awt.Color(56, 56, 56));
        sLabel79.setText("View Owner Details");

        sLabel81.setForeground(new java.awt.Color(56, 56, 56));
        sLabel81.setIconSize(10);
        sLabel81.setScaledIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/moduleUnits/quickActionNext.png"))); // NOI18N

        javax.swing.GroupLayout unitsViewOverview_ViewOwnerLayout = new javax.swing.GroupLayout(unitsViewOverview_ViewOwner);
        unitsViewOverview_ViewOwner.setLayout(unitsViewOverview_ViewOwnerLayout);
        unitsViewOverview_ViewOwnerLayout.setHorizontalGroup(
            unitsViewOverview_ViewOwnerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(unitsViewOverview_ViewOwnerLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(sPanel98, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15)
                .addComponent(sLabel79, javax.swing.GroupLayout.DEFAULT_SIZE, 201, Short.MAX_VALUE)
                .addGap(0, 0, 0)
                .addComponent(sLabel81, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15))
        );
        unitsViewOverview_ViewOwnerLayout.setVerticalGroup(
            unitsViewOverview_ViewOwnerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(sLabel81, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(sLabel79, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(unitsViewOverview_ViewOwnerLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(sPanel98, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        sPanel127.add(unitsViewOverview_ViewOwner);
        sPanel127.add(filler2);

        unitsViewOverview_ViewTenant.setMaximumSize(new java.awt.Dimension(32767, 40));
        unitsViewOverview_ViewTenant.setPreferredSize(new java.awt.Dimension(362, 40));
        unitsViewOverview_ViewTenant.setBorderLine(2);
        unitsViewOverview_ViewTenant.setDefaultBorderColor(new java.awt.Color(240, 240, 240));
        unitsViewOverview_ViewTenant.setCanHover(true);
        unitsViewOverview_ViewTenant.setHoverBackgroundColor(new java.awt.Color(250, 250, 250));
        unitsViewOverview_ViewTenant.setRadius(7);
        unitsViewOverview_ViewTenant.setRounded(true);

        sPanel100.setPreferredSize(new java.awt.Dimension(22, 22));
        sPanel100.setDefaultBackgroundColor(new java.awt.Color(228, 239, 253));
        sPanel100.setRadius(7);
        sPanel100.setRounded(true);

        sLabel85.setIconSize(11);
        sLabel85.setScaledIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/moduleUnits/viewTenants.png"))); // NOI18N

        javax.swing.GroupLayout sPanel100Layout = new javax.swing.GroupLayout(sPanel100);
        sPanel100.setLayout(sPanel100Layout);
        sPanel100Layout.setHorizontalGroup(
            sPanel100Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(sPanel100Layout.createSequentialGroup()
                .addGap(0, 6, Short.MAX_VALUE)
                .addComponent(sLabel85, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 5, Short.MAX_VALUE))
        );
        sPanel100Layout.setVerticalGroup(
            sPanel100Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(sPanel100Layout.createSequentialGroup()
                .addGap(0, 6, Short.MAX_VALUE)
                .addComponent(sLabel85, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 5, Short.MAX_VALUE))
        );

        sLabel86.setForeground(new java.awt.Color(56, 56, 56));
        sLabel86.setText("View Tenant Details");

        sLabel87.setForeground(new java.awt.Color(56, 56, 56));
        sLabel87.setIconSize(10);
        sLabel87.setScaledIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/moduleUnits/quickActionNext.png"))); // NOI18N

        javax.swing.GroupLayout unitsViewOverview_ViewTenantLayout = new javax.swing.GroupLayout(unitsViewOverview_ViewTenant);
        unitsViewOverview_ViewTenant.setLayout(unitsViewOverview_ViewTenantLayout);
        unitsViewOverview_ViewTenantLayout.setHorizontalGroup(
            unitsViewOverview_ViewTenantLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(unitsViewOverview_ViewTenantLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(sPanel100, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15)
                .addComponent(sLabel86, javax.swing.GroupLayout.DEFAULT_SIZE, 201, Short.MAX_VALUE)
                .addGap(0, 0, 0)
                .addComponent(sLabel87, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15))
        );
        unitsViewOverview_ViewTenantLayout.setVerticalGroup(
            unitsViewOverview_ViewTenantLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(sLabel87, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(sLabel86, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(unitsViewOverview_ViewTenantLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(sPanel100, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        sPanel127.add(unitsViewOverview_ViewTenant);
        sPanel127.add(filler3);

        unitsViewOverview_UploadDocument.setMaximumSize(new java.awt.Dimension(32767, 40));
        unitsViewOverview_UploadDocument.setPreferredSize(new java.awt.Dimension(362, 40));
        unitsViewOverview_UploadDocument.setBorderLine(2);
        unitsViewOverview_UploadDocument.setDefaultBorderColor(new java.awt.Color(240, 240, 240));
        unitsViewOverview_UploadDocument.setCanHover(true);
        unitsViewOverview_UploadDocument.setHoverBackgroundColor(new java.awt.Color(250, 250, 250));
        unitsViewOverview_UploadDocument.setRadius(7);
        unitsViewOverview_UploadDocument.setRounded(true);

        sPanel101.setPreferredSize(new java.awt.Dimension(22, 22));
        sPanel101.setDefaultBackgroundColor(new java.awt.Color(228, 247, 233));
        sPanel101.setRadius(7);
        sPanel101.setRounded(true);

        sLabel88.setIconSize(11);
        sLabel88.setScaledIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/moduleUnits/uploadDocument.png"))); // NOI18N

        javax.swing.GroupLayout sPanel101Layout = new javax.swing.GroupLayout(sPanel101);
        sPanel101.setLayout(sPanel101Layout);
        sPanel101Layout.setHorizontalGroup(
            sPanel101Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(sPanel101Layout.createSequentialGroup()
                .addGap(0, 6, Short.MAX_VALUE)
                .addComponent(sLabel88, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 5, Short.MAX_VALUE))
        );
        sPanel101Layout.setVerticalGroup(
            sPanel101Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(sPanel101Layout.createSequentialGroup()
                .addGap(0, 6, Short.MAX_VALUE)
                .addComponent(sLabel88, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 5, Short.MAX_VALUE))
        );

        sLabel89.setForeground(new java.awt.Color(56, 56, 56));
        sLabel89.setText("Upload Document");

        sLabel90.setForeground(new java.awt.Color(56, 56, 56));
        sLabel90.setIconSize(10);
        sLabel90.setScaledIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/moduleUnits/quickActionNext.png"))); // NOI18N

        javax.swing.GroupLayout unitsViewOverview_UploadDocumentLayout = new javax.swing.GroupLayout(unitsViewOverview_UploadDocument);
        unitsViewOverview_UploadDocument.setLayout(unitsViewOverview_UploadDocumentLayout);
        unitsViewOverview_UploadDocumentLayout.setHorizontalGroup(
            unitsViewOverview_UploadDocumentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(unitsViewOverview_UploadDocumentLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(sPanel101, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15)
                .addComponent(sLabel89, javax.swing.GroupLayout.DEFAULT_SIZE, 201, Short.MAX_VALUE)
                .addGap(0, 0, 0)
                .addComponent(sLabel90, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15))
        );
        unitsViewOverview_UploadDocumentLayout.setVerticalGroup(
            unitsViewOverview_UploadDocumentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(sLabel90, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(sLabel89, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(unitsViewOverview_UploadDocumentLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(sPanel101, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        sPanel127.add(unitsViewOverview_UploadDocument);
        sPanel127.add(filler4);

        unitsViewOverview_ReportConcern.setMaximumSize(new java.awt.Dimension(32767, 40));
        unitsViewOverview_ReportConcern.setPreferredSize(new java.awt.Dimension(362, 40));
        unitsViewOverview_ReportConcern.setBorderLine(2);
        unitsViewOverview_ReportConcern.setDefaultBorderColor(new java.awt.Color(240, 240, 240));
        unitsViewOverview_ReportConcern.setCanHover(true);
        unitsViewOverview_ReportConcern.setHoverBackgroundColor(new java.awt.Color(250, 250, 250));
        unitsViewOverview_ReportConcern.setRadius(7);
        unitsViewOverview_ReportConcern.setRounded(true);

        sPanel141.setPreferredSize(new java.awt.Dimension(22, 22));
        sPanel141.setDefaultBackgroundColor(new java.awt.Color(240, 217, 217));
        sPanel141.setRadius(7);
        sPanel141.setRounded(true);

        sLabel91.setIconSize(11);
        sLabel91.setScaledIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/moduleUnits/concerns.png"))); // NOI18N

        javax.swing.GroupLayout sPanel141Layout = new javax.swing.GroupLayout(sPanel141);
        sPanel141.setLayout(sPanel141Layout);
        sPanel141Layout.setHorizontalGroup(
            sPanel141Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(sPanel141Layout.createSequentialGroup()
                .addGap(0, 6, Short.MAX_VALUE)
                .addComponent(sLabel91, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 5, Short.MAX_VALUE))
        );
        sPanel141Layout.setVerticalGroup(
            sPanel141Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(sPanel141Layout.createSequentialGroup()
                .addGap(0, 6, Short.MAX_VALUE)
                .addComponent(sLabel91, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 5, Short.MAX_VALUE))
        );

        sLabel95.setForeground(new java.awt.Color(56, 56, 56));
        sLabel95.setText("Report Concern");

        sLabel97.setForeground(new java.awt.Color(56, 56, 56));
        sLabel97.setIconSize(10);
        sLabel97.setScaledIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/moduleUnits/quickActionNext.png"))); // NOI18N

        javax.swing.GroupLayout unitsViewOverview_ReportConcernLayout = new javax.swing.GroupLayout(unitsViewOverview_ReportConcern);
        unitsViewOverview_ReportConcern.setLayout(unitsViewOverview_ReportConcernLayout);
        unitsViewOverview_ReportConcernLayout.setHorizontalGroup(
            unitsViewOverview_ReportConcernLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(unitsViewOverview_ReportConcernLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(sPanel141, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15)
                .addComponent(sLabel95, javax.swing.GroupLayout.DEFAULT_SIZE, 201, Short.MAX_VALUE)
                .addGap(0, 0, 0)
                .addComponent(sLabel97, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15))
        );
        unitsViewOverview_ReportConcernLayout.setVerticalGroup(
            unitsViewOverview_ReportConcernLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(sLabel97, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(sLabel95, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(unitsViewOverview_ReportConcernLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(sPanel141, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        sPanel127.add(unitsViewOverview_ReportConcern);
        sPanel127.add(filler5);

        unitsViewOverview_ReportViolation.setMaximumSize(new java.awt.Dimension(32767, 40));
        unitsViewOverview_ReportViolation.setPreferredSize(new java.awt.Dimension(362, 40));
        unitsViewOverview_ReportViolation.setBorderLine(2);
        unitsViewOverview_ReportViolation.setDefaultBorderColor(new java.awt.Color(240, 240, 240));
        unitsViewOverview_ReportViolation.setCanHover(true);
        unitsViewOverview_ReportViolation.setHoverBackgroundColor(new java.awt.Color(250, 250, 250));
        unitsViewOverview_ReportViolation.setRadius(7);
        unitsViewOverview_ReportViolation.setRounded(true);

        sPanel142.setPreferredSize(new java.awt.Dimension(22, 22));
        sPanel142.setDefaultBackgroundColor(new java.awt.Color(240, 217, 217));
        sPanel142.setRadius(7);
        sPanel142.setRounded(true);

        sLabel103.setIconSize(11);
        sLabel103.setScaledIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/moduleUnits/violation.png"))); // NOI18N

        javax.swing.GroupLayout sPanel142Layout = new javax.swing.GroupLayout(sPanel142);
        sPanel142.setLayout(sPanel142Layout);
        sPanel142Layout.setHorizontalGroup(
            sPanel142Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(sPanel142Layout.createSequentialGroup()
                .addGap(0, 6, Short.MAX_VALUE)
                .addComponent(sLabel103, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 5, Short.MAX_VALUE))
        );
        sPanel142Layout.setVerticalGroup(
            sPanel142Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(sPanel142Layout.createSequentialGroup()
                .addGap(0, 6, Short.MAX_VALUE)
                .addComponent(sLabel103, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 5, Short.MAX_VALUE))
        );

        sLabel105.setForeground(new java.awt.Color(56, 56, 56));
        sLabel105.setText("Report Violation");

        sLabel107.setForeground(new java.awt.Color(56, 56, 56));
        sLabel107.setIconSize(10);
        sLabel107.setScaledIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/moduleUnits/quickActionNext.png"))); // NOI18N

        javax.swing.GroupLayout unitsViewOverview_ReportViolationLayout = new javax.swing.GroupLayout(unitsViewOverview_ReportViolation);
        unitsViewOverview_ReportViolation.setLayout(unitsViewOverview_ReportViolationLayout);
        unitsViewOverview_ReportViolationLayout.setHorizontalGroup(
            unitsViewOverview_ReportViolationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(unitsViewOverview_ReportViolationLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(sPanel142, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15)
                .addComponent(sLabel105, javax.swing.GroupLayout.DEFAULT_SIZE, 201, Short.MAX_VALUE)
                .addGap(0, 0, 0)
                .addComponent(sLabel107, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15))
        );
        unitsViewOverview_ReportViolationLayout.setVerticalGroup(
            unitsViewOverview_ReportViolationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(sLabel107, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(sLabel105, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(unitsViewOverview_ReportViolationLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(sPanel142, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        sPanel127.add(unitsViewOverview_ReportViolation);

        javax.swing.GroupLayout sPanel109Layout = new javax.swing.GroupLayout(sPanel109);
        sPanel109.setLayout(sPanel109Layout);
        sPanel109Layout.setHorizontalGroup(
            sPanel109Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(sPanel109Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(sPanel127, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                .addGap(25, 25, 25))
        );
        sPanel109Layout.setVerticalGroup(
            sPanel109Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(sPanel109Layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(sPanel127, javax.swing.GroupLayout.DEFAULT_SIZE, 253, Short.MAX_VALUE)
                .addGap(20, 20, 20))
        );

        javax.swing.GroupLayout sPanel85Layout = new javax.swing.GroupLayout(sPanel85);
        sPanel85.setLayout(sPanel85Layout);
        sPanel85Layout.setHorizontalGroup(
            sPanel85Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(sPanel109, javax.swing.GroupLayout.DEFAULT_SIZE, 333, Short.MAX_VALUE)
            .addComponent(sPanel125, javax.swing.GroupLayout.DEFAULT_SIZE, 333, Short.MAX_VALUE)
        );
        sPanel85Layout.setVerticalGroup(
            sPanel85Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(sPanel85Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(sPanel125, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addComponent(sPanel109, javax.swing.GroupLayout.DEFAULT_SIZE, 273, Short.MAX_VALUE)
                .addGap(2, 2, 2))
        );

        javax.swing.GroupLayout sPanel78Layout = new javax.swing.GroupLayout(sPanel78);
        sPanel78.setLayout(sPanel78Layout);
        sPanel78Layout.setHorizontalGroup(
            sPanel78Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(sPanel78Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(sPanel85, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(10, 10, 10))
        );
        sPanel78Layout.setVerticalGroup(
            sPanel78Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(sPanel78Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(sPanel85, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(10, 10, 10))
        );

        sPanel86.add(sPanel78);

        javax.swing.GroupLayout layerUnits_ViewOverviewLayout = new javax.swing.GroupLayout(layerUnits_ViewOverview);
        layerUnits_ViewOverview.setLayout(layerUnits_ViewOverviewLayout);
        layerUnits_ViewOverviewLayout.setHorizontalGroup(
            layerUnits_ViewOverviewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layerUnits_ViewOverviewLayout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(sPanel86, javax.swing.GroupLayout.DEFAULT_SIZE, 1061, Short.MAX_VALUE)
                .addGap(10, 10, 10))
        );
        layerUnits_ViewOverviewLayout.setVerticalGroup(
            layerUnits_ViewOverviewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layerUnits_ViewOverviewLayout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(sPanel86, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(10, 10, 10))
        );

        jLayeredPane3.setLayer(layerUnits_ViewOverview, javax.swing.JLayeredPane.PALETTE_LAYER);
        jLayeredPane3.add(layerUnits_ViewOverview, "card2");

        layerUnits_ViewDocuments.setLayerButton(buttonUnits_ViewTabDocuments);
        layerUnits_ViewDocuments.setName("Documents"); // NOI18N

        sLabel51.setBackground(new java.awt.Color(0, 0, 0));
        sLabel51.setForeground(new java.awt.Color(0, 0, 0));
        sLabel51.setText("Documents");
        sLabel51.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N

        javax.swing.GroupLayout layerUnits_ViewDocumentsLayout = new javax.swing.GroupLayout(layerUnits_ViewDocuments);
        layerUnits_ViewDocuments.setLayout(layerUnits_ViewDocumentsLayout);
        layerUnits_ViewDocumentsLayout.setHorizontalGroup(
            layerUnits_ViewDocumentsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layerUnits_ViewDocumentsLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(sLabel51, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layerUnits_ViewDocumentsLayout.setVerticalGroup(
            layerUnits_ViewDocumentsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layerUnits_ViewDocumentsLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(sLabel51, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jLayeredPane3.setLayer(layerUnits_ViewDocuments, javax.swing.JLayeredPane.PALETTE_LAYER);
        jLayeredPane3.add(layerUnits_ViewDocuments, "card3");

        layerUnits_ViewConcerns.setLayerButton(buttonUnits_ViewTabConcerns);
        layerUnits_ViewConcerns.setName("Concerns"); // NOI18N

        javax.swing.GroupLayout sPanel137Layout = new javax.swing.GroupLayout(sPanel137);
        sPanel137.setLayout(sPanel137Layout);
        sPanel137Layout.setHorizontalGroup(
            sPanel137Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1081, Short.MAX_VALUE)
        );
        sPanel137Layout.setVerticalGroup(
            sPanel137Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 40, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layerUnits_ViewConcernsLayout = new javax.swing.GroupLayout(layerUnits_ViewConcerns);
        layerUnits_ViewConcerns.setLayout(layerUnits_ViewConcernsLayout);
        layerUnits_ViewConcernsLayout.setHorizontalGroup(
            layerUnits_ViewConcernsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layerUnits_ViewConcernsLayout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(sPanel137, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(0, 0, 0))
        );
        layerUnits_ViewConcernsLayout.setVerticalGroup(
            layerUnits_ViewConcernsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layerUnits_ViewConcernsLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(sPanel137, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(710, Short.MAX_VALUE))
        );

        jLayeredPane3.setLayer(layerUnits_ViewConcerns, javax.swing.JLayeredPane.PALETTE_LAYER);
        jLayeredPane3.add(layerUnits_ViewConcerns, "card4");

        layerUnits_ViewVisitors.setLayerButton(buttonUnits_ViewTabVisitors);
        layerUnits_ViewVisitors.setName("Visitors"); // NOI18N

        sLabel99.setBackground(new java.awt.Color(0, 0, 0));
        sLabel99.setForeground(new java.awt.Color(0, 0, 0));
        sLabel99.setText("Visitors");
        sLabel99.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N

        javax.swing.GroupLayout layerUnits_ViewVisitorsLayout = new javax.swing.GroupLayout(layerUnits_ViewVisitors);
        layerUnits_ViewVisitors.setLayout(layerUnits_ViewVisitorsLayout);
        layerUnits_ViewVisitorsLayout.setHorizontalGroup(
            layerUnits_ViewVisitorsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layerUnits_ViewVisitorsLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(sLabel99, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layerUnits_ViewVisitorsLayout.setVerticalGroup(
            layerUnits_ViewVisitorsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layerUnits_ViewVisitorsLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(sLabel99, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jLayeredPane3.setLayer(layerUnits_ViewVisitors, javax.swing.JLayeredPane.PALETTE_LAYER);
        jLayeredPane3.add(layerUnits_ViewVisitors, "card5");

        layerUnits_ViewActivityLog.setLayerButton(buttonUnits_ViewTabActivityLog);
        layerUnits_ViewActivityLog.setName("Activity Log"); // NOI18N

        sLabel53.setBackground(new java.awt.Color(0, 0, 0));
        sLabel53.setForeground(new java.awt.Color(0, 0, 0));
        sLabel53.setText("Activity Log");
        sLabel53.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N

        javax.swing.GroupLayout layerUnits_ViewActivityLogLayout = new javax.swing.GroupLayout(layerUnits_ViewActivityLog);
        layerUnits_ViewActivityLog.setLayout(layerUnits_ViewActivityLogLayout);
        layerUnits_ViewActivityLogLayout.setHorizontalGroup(
            layerUnits_ViewActivityLogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layerUnits_ViewActivityLogLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(sLabel53, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layerUnits_ViewActivityLogLayout.setVerticalGroup(
            layerUnits_ViewActivityLogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layerUnits_ViewActivityLogLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(sLabel53, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jLayeredPane3.setLayer(layerUnits_ViewActivityLog, javax.swing.JLayeredPane.PALETTE_LAYER);
        jLayeredPane3.add(layerUnits_ViewActivityLog, "card6");

        layerUnits_ViewViolations.setLayerButton(buttonUnits_ViewTabViolations);
        layerUnits_ViewViolations.setName("Activity Log"); // NOI18N

        sLabel101.setBackground(new java.awt.Color(0, 0, 0));
        sLabel101.setForeground(new java.awt.Color(0, 0, 0));
        sLabel101.setText("Violations");
        sLabel101.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N

        javax.swing.GroupLayout layerUnits_ViewViolationsLayout = new javax.swing.GroupLayout(layerUnits_ViewViolations);
        layerUnits_ViewViolations.setLayout(layerUnits_ViewViolationsLayout);
        layerUnits_ViewViolationsLayout.setHorizontalGroup(
            layerUnits_ViewViolationsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layerUnits_ViewViolationsLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(sLabel101, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layerUnits_ViewViolationsLayout.setVerticalGroup(
            layerUnits_ViewViolationsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layerUnits_ViewViolationsLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(sLabel101, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jLayeredPane3.setLayer(layerUnits_ViewViolations, javax.swing.JLayeredPane.PALETTE_LAYER);
        jLayeredPane3.add(layerUnits_ViewViolations, "card6");

        javax.swing.GroupLayout layerUnits_ViewNullLayout = new javax.swing.GroupLayout(layerUnits_ViewNull);
        layerUnits_ViewNull.setLayout(layerUnits_ViewNullLayout);
        layerUnits_ViewNullLayout.setHorizontalGroup(
            layerUnits_ViewNullLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1081, Short.MAX_VALUE)
        );
        layerUnits_ViewNullLayout.setVerticalGroup(
            layerUnits_ViewNullLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 770, Short.MAX_VALUE)
        );

        jLayeredPane3.setLayer(layerUnits_ViewNull, javax.swing.JLayeredPane.PALETTE_LAYER);
        jLayeredPane3.add(layerUnits_ViewNull, "card7");

        javax.swing.GroupLayout sPanel4Layout = new javax.swing.GroupLayout(sPanel4);
        sPanel4.setLayout(sPanel4Layout);
        sPanel4Layout.setHorizontalGroup(
            sPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(sPanel4Layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(jLayeredPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                .addGap(0, 0, 0))
        );
        sPanel4Layout.setVerticalGroup(
            sPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(sPanel4Layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(jLayeredPane3)
                .addGap(0, 0, 0))
        );

        javax.swing.GroupLayout layerUnitsViewLayout = new javax.swing.GroupLayout(layerUnitsView);
        layerUnitsView.setLayout(layerUnitsViewLayout);
        layerUnitsViewLayout.setHorizontalGroup(
            layerUnitsViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(sPanel4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(sPanel17, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 1081, Short.MAX_VALUE)
            .addComponent(sPanel69, javax.swing.GroupLayout.DEFAULT_SIZE, 1081, Short.MAX_VALUE)
        );
        layerUnitsViewLayout.setVerticalGroup(
            layerUnitsViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layerUnitsViewLayout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(sPanel17, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(sPanel69, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(sPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(0, 0, 0))
        );

        jLayeredPane2.setLayer(layerUnitsView, javax.swing.JLayeredPane.PALETTE_LAYER);
        jLayeredPane2.add(layerUnitsView, "card2");

        javax.swing.GroupLayout sPanel1Layout = new javax.swing.GroupLayout(sPanel1);
        sPanel1.setLayout(sPanel1Layout);
        sPanel1Layout.setHorizontalGroup(
            sPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(sPanel1Layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(jLayeredPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                .addGap(0, 0, 0))
        );
        sPanel1Layout.setVerticalGroup(
            sPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, sPanel1Layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(jLayeredPane2)
                .addGap(0, 0, 0))
        );

        sComboBox1.setFont(new java.awt.Font("Segoe UI", 1, 11)); // NOI18N
        sComboBox1.setItemDefaultForegroundColor(new java.awt.Color(56, 56, 56));
        sComboBox1.setItemFont(new java.awt.Font("Segoe UI", 1, 11)); // NOI18N
        sComboBox1.setItemHoverForegroundColor(new java.awt.Color(56, 56, 56));
        sComboBox1.setItemRoundCorner(6);
        sComboBox1.setScrollbarBackgroundColor(new java.awt.Color(255, 255, 255));
        sComboBox1.setScrollbarColor(new java.awt.Color(229, 229, 229));
        sComboBox1.setScrollbarHoverColor(new java.awt.Color(73, 73, 73));
        sComboBox1.setDefaultForegroundColor(new java.awt.Color(56, 56, 56));
        sComboBox1.setShadowColor(new java.awt.Color(230, 230, 230));
        sComboBox1.setShadowOpacity(0.3F);
        sComboBox1.setShadowSize(5);
        sComboBox1.setShadowX(true);
        sComboBox1.setShadowY(true);

        sPanel21.setPreferredSize(new java.awt.Dimension(250, 0));
        sPanel21.setPaintBackground(false);
        sPanel21.setLayout(new javax.swing.BoxLayout(sPanel21, javax.swing.BoxLayout.PAGE_AXIS));

        sPanel34.setPreferredSize(new java.awt.Dimension(250, 0));
        sPanel34.setRadius(15);
        sPanel34.setRounded(true);
        sPanel34.setShadowColor(new java.awt.Color(230, 230, 230));
        sPanel34.setShadowOpacity(0.3F);
        sPanel34.setShadowSize(5);
        sPanel34.setShadowX(true);
        sPanel34.setShadowY(true);

        sLabel38.setForeground(new java.awt.Color(56, 56, 56));
        sLabel38.setText("Filters");
        sLabel38.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        sLabel38.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N

        javax.swing.GroupLayout sPanel34Layout = new javax.swing.GroupLayout(sPanel34);
        sPanel34.setLayout(sPanel34Layout);
        sPanel34Layout.setHorizontalGroup(
            sPanel34Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(sPanel34Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(sLabel38, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(161, 161, 161))
        );
        sPanel34Layout.setVerticalGroup(
            sPanel34Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(sPanel34Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(sLabel38, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(308, Short.MAX_VALUE))
        );

        sPanel21.add(sPanel34);

        sPanel49.setPreferredSize(new java.awt.Dimension(250, 0));
        sPanel49.setRadius(15);
        sPanel49.setRounded(true);
        sPanel49.setShadowColor(new java.awt.Color(230, 230, 230));
        sPanel49.setShadowOpacity(0.3F);
        sPanel49.setShadowSize(5);
        sPanel49.setShadowX(true);
        sPanel49.setShadowY(true);

        sLabel37.setForeground(new java.awt.Color(56, 56, 56));
        sLabel37.setText("Quick Actions");
        sLabel37.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        sLabel37.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N

        javax.swing.GroupLayout sPanel49Layout = new javax.swing.GroupLayout(sPanel49);
        sPanel49.setLayout(sPanel49Layout);
        sPanel49Layout.setHorizontalGroup(
            sPanel49Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(sPanel49Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(sLabel37, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(161, 161, 161))
        );
        sPanel49Layout.setVerticalGroup(
            sPanel49Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(sPanel49Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(sLabel37, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(308, Short.MAX_VALUE))
        );

        sPanel21.add(sPanel49);

        sPanel61.setPreferredSize(new java.awt.Dimension(250, 0));
        sPanel61.setRadius(15);
        sPanel61.setRounded(true);
        sPanel61.setShadowColor(new java.awt.Color(230, 230, 230));
        sPanel61.setShadowOpacity(0.3F);
        sPanel61.setShadowSize(5);
        sPanel61.setShadowX(true);
        sPanel61.setShadowY(true);

        sLabel31.setForeground(new java.awt.Color(56, 56, 56));
        sLabel31.setText("Recent Concerns");
        sLabel31.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        sLabel31.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N

        javax.swing.GroupLayout sPanel61Layout = new javax.swing.GroupLayout(sPanel61);
        sPanel61.setLayout(sPanel61Layout);
        sPanel61Layout.setHorizontalGroup(
            sPanel61Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(sPanel61Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(sLabel31, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(161, 161, 161))
        );
        sPanel61Layout.setVerticalGroup(
            sPanel61Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(sPanel61Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(sLabel31, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(308, Short.MAX_VALUE))
        );

        sPanel21.add(sPanel61);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(sPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(sTextFieldContainer1, javax.swing.GroupLayout.PREFERRED_SIZE, 349, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(sPanel36, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, 0)
                                .addComponent(sPanel42, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(23, 23, 23)
                                .addComponent(sComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(sPanel35, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(sPanel47, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(sPanel33, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 0, 0)
                .addComponent(sPanel21, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(sPanel33, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(sTextFieldContainer1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(sPanel36, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(sPanel42, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(sComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(sPanel47, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(sPanel35, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addComponent(sPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(10, 10, 10))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(sPanel21, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    public FrameSystem.Layers.Units.Components.ButtonUnits_ViewTab buttonUnits_ViewTabActivityLog;
    public FrameSystem.Layers.Units.Components.ButtonUnits_ViewTab buttonUnits_ViewTabConcerns;
    public FrameSystem.Layers.Units.Components.ButtonUnits_ViewTab buttonUnits_ViewTabDocuments;
    public FrameSystem.Layers.Units.Components.ButtonUnits_ViewTab buttonUnits_ViewTabOverview;
    public FrameSystem.Layers.Units.Components.ButtonUnits_ViewTab buttonUnits_ViewTabViolations;
    public FrameSystem.Layers.Units.Components.ButtonUnits_ViewTab buttonUnits_ViewTabVisitors;
    private javax.swing.Box.Filler filler1;
    private javax.swing.Box.Filler filler10;
    private javax.swing.Box.Filler filler2;
    private javax.swing.Box.Filler filler3;
    private javax.swing.Box.Filler filler4;
    private javax.swing.Box.Filler filler5;
    private javax.swing.Box.Filler filler6;
    private javax.swing.Box.Filler filler8;
    private javax.swing.Box.Filler filler9;
    public FrameSystem.SLibrary.SComponents.SPanel filterTower1;
    public FrameSystem.SLibrary.SComponents.SPanel filterTower2;
    public FrameSystem.SLibrary.SComponents.SPanel filterTower3;
    public javax.swing.JLayeredPane jLayeredPane1;
    public javax.swing.JLayeredPane jLayeredPane2;
    private javax.swing.JLayeredPane jLayeredPane3;
    private javax.swing.JLayeredPane jLayeredPane4;
    private javax.swing.JLayeredPane jLayeredPane5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    public javax.swing.JSpinner jSpinner1;
    public FrameSystem.Layers.Units.Components.LayerUnits_Main layerUnitsData;
    public FrameSystem.Layers.Units.Components.LayerUnits layerUnitsLoading;
    public FrameSystem.Layers.Units.Components.LayerUnits layerUnitsNull;
    public FrameSystem.Layers.Units.Components.LayerUnits layerUnitsOffline;
    public FrameSystem.Layers.Units.Components.LayerUnits layerUnitsOnline;
    public FrameSystem.Layers.Units.Components.LayerUnits_Main layerUnitsView;
    public FrameSystem.Layers.Units.Components.LayerUnits_ConcernsSummary layerUnits_ConcernsSummary;
    public FrameSystem.Layers.Units.Components.LayerUnits_ConcernsSummary layerUnits_ConcernsSummaryEmpty;
    public FrameSystem.Layers.Units.Components.LayerUnits_Notes layerUnits_Notes;
    public FrameSystem.Layers.Units.Components.LayerUnits_Notes layerUnits_NotesEmpty;
    public FrameSystem.Layers.Units.Components.LayerUnits_View layerUnits_ViewActivityLog;
    public FrameSystem.Layers.Units.Components.LayerUnits_View layerUnits_ViewConcerns;
    public FrameSystem.Layers.Units.Components.LayerUnits_View layerUnits_ViewDocuments;
    public FrameSystem.Layers.Units.Components.LayerUnits_View layerUnits_ViewLoading;
    public FrameSystem.Layers.Units.Components.LayerUnits_View layerUnits_ViewNull;
    public FrameSystem.Layers.Units.Components.LayerUnits_View layerUnits_ViewOverview;
    public FrameSystem.Layers.Units.Components.LayerUnits_View layerUnits_ViewViolations;
    public FrameSystem.Layers.Units.Components.LayerUnits_View layerUnits_ViewVisitors;
    public FrameSystem.Layers.Units.Components.ObjectUnitDonutChart objectUnitDonutChart1;
    private FrameSystem.SLibrary.SAnimated.SAnimatedOffline sAnimatedOffline1;
    private FrameSystem.SLibrary.SAnimated.SAnimatedOffline sAnimatedOffline4;
    private FrameSystem.SLibrary.SAnimated.SAnimatedOffline sAnimatedOffline5;
    private FrameSystem.SLibrary.SComponents.SComboBox sComboBox1;
    public FrameSystem.SLibrary.SGenericComponents.SFilterTitlePanel sFilterTitlePanel1;
    public FrameSystem.SLibrary.SGenericComponents.SFilterTitlePanel sFilterTitlePanel2;
    public FrameSystem.SLibrary.SGenericComponents.SFilterTitlePanel sFilterTitlePanel3;
    public FrameSystem.SLibrary.SGenericComponents.SFilterTitlePanel sFilterTitlePanel5;
    public FrameSystem.SLibrary.SGenericComponents.SFilterTitlePanel sFilterTitlePanel6;
    public FrameSystem.SLibrary.SGenericComponents.SFilterTitlePanel sFilterTitlePanel7;
    private FrameSystem.SLibrary.SComponents.SLabel sLabel1;
    private FrameSystem.SLibrary.SComponents.SLabel sLabel10;
    private FrameSystem.SLibrary.SComponents.SLabel sLabel100;
    private FrameSystem.SLibrary.SComponents.SLabel sLabel101;
    private FrameSystem.SLibrary.SComponents.SLabel sLabel102;
    private FrameSystem.SLibrary.SComponents.SLabel sLabel103;
    private FrameSystem.SLibrary.SComponents.SLabel sLabel104;
    private FrameSystem.SLibrary.SComponents.SLabel sLabel105;
    private FrameSystem.SLibrary.SComponents.SLabel sLabel106;
    private FrameSystem.SLibrary.SComponents.SLabel sLabel107;
    private FrameSystem.SLibrary.SComponents.SLabel sLabel11;
    private FrameSystem.SLibrary.SComponents.SLabel sLabel12;
    private FrameSystem.SLibrary.SComponents.SLabel sLabel13;
    private FrameSystem.SLibrary.SComponents.SLabel sLabel14;
    private FrameSystem.SLibrary.SComponents.SLabel sLabel15;
    private FrameSystem.SLibrary.SComponents.SLabel sLabel16;
    private FrameSystem.SLibrary.SComponents.SLabel sLabel17;
    private FrameSystem.SLibrary.SComponents.SLabel sLabel18;
    private FrameSystem.SLibrary.SComponents.SLabel sLabel19;
    private FrameSystem.SLibrary.SComponents.SLabel sLabel2;
    private FrameSystem.SLibrary.SComponents.SLabel sLabel20;
    private FrameSystem.SLibrary.SComponents.SLabel sLabel21;
    private FrameSystem.SLibrary.SComponents.SLabel sLabel22;
    private FrameSystem.SLibrary.SComponents.SLabel sLabel23;
    private FrameSystem.SLibrary.SComponents.SLabel sLabel24;
    private FrameSystem.SLibrary.SComponents.SLabel sLabel25;
    public FrameSystem.SLibrary.SComponents.SLabel sLabel26;
    private FrameSystem.SLibrary.SComponents.SLabel sLabel27;
    private FrameSystem.SLibrary.SComponents.SLabel sLabel28;
    private FrameSystem.SLibrary.SComponents.SLabel sLabel29;
    private FrameSystem.SLibrary.SComponents.SLabel sLabel3;
    private FrameSystem.SLibrary.SComponents.SLabel sLabel30;
    private FrameSystem.SLibrary.SComponents.SLabel sLabel31;
    private FrameSystem.SLibrary.SComponents.SLabel sLabel32;
    public FrameSystem.SLibrary.SComponents.SLabel sLabel33;
    private FrameSystem.SLibrary.SComponents.SLabel sLabel34;
    private FrameSystem.SLibrary.SComponents.SLabel sLabel35;
    private FrameSystem.SLibrary.SComponents.SLabel sLabel36;
    private FrameSystem.SLibrary.SComponents.SLabel sLabel37;
    private FrameSystem.SLibrary.SComponents.SLabel sLabel38;
    private FrameSystem.SLibrary.SComponents.SLabel sLabel39;
    private FrameSystem.SLibrary.SComponents.SLabel sLabel4;
    private FrameSystem.SLibrary.SComponents.SLabel sLabel40;
    private FrameSystem.SLibrary.SComponents.SLabel sLabel41;
    private FrameSystem.SLibrary.SComponents.SLabel sLabel42;
    private FrameSystem.SLibrary.SComponents.SLabel sLabel43;
    private FrameSystem.SLibrary.SComponents.SLabel sLabel44;
    private FrameSystem.SLibrary.SComponents.SLabel sLabel45;
    private FrameSystem.SLibrary.SComponents.SLabel sLabel46;
    private FrameSystem.SLibrary.SComponents.SLabel sLabel47;
    private FrameSystem.SLibrary.SComponents.SLabel sLabel48;
    private FrameSystem.SLibrary.SComponents.SLabel sLabel49;
    private FrameSystem.SLibrary.SComponents.SLabel sLabel5;
    private FrameSystem.SLibrary.SComponents.SLabel sLabel50;
    private FrameSystem.SLibrary.SComponents.SLabel sLabel51;
    private FrameSystem.SLibrary.SComponents.SLabel sLabel53;
    private FrameSystem.SLibrary.SComponents.SLabel sLabel54;
    private FrameSystem.SLibrary.SComponents.SLabel sLabel55;
    private FrameSystem.SLibrary.SComponents.SLabel sLabel56;
    private FrameSystem.SLibrary.SComponents.SLabel sLabel57;
    private FrameSystem.SLibrary.SComponents.SLabel sLabel58;
    private FrameSystem.SLibrary.SComponents.SLabel sLabel59;
    private FrameSystem.SLibrary.SComponents.SLabel sLabel6;
    private FrameSystem.SLibrary.SComponents.SLabel sLabel60;
    private FrameSystem.SLibrary.SComponents.SLabel sLabel61;
    private FrameSystem.SLibrary.SComponents.SLabel sLabel62;
    private FrameSystem.SLibrary.SComponents.SLabel sLabel63;
    private FrameSystem.SLibrary.SComponents.SLabel sLabel64;
    private FrameSystem.SLibrary.SComponents.SLabel sLabel65;
    private FrameSystem.SLibrary.SComponents.SLabel sLabel66;
    private FrameSystem.SLibrary.SComponents.SLabel sLabel67;
    private FrameSystem.SLibrary.SComponents.SLabel sLabel68;
    private FrameSystem.SLibrary.SComponents.SLabel sLabel69;
    private FrameSystem.SLibrary.SComponents.SLabel sLabel7;
    private FrameSystem.SLibrary.SComponents.SLabel sLabel70;
    private FrameSystem.SLibrary.SComponents.SLabel sLabel71;
    private FrameSystem.SLibrary.SComponents.SLabel sLabel72;
    private FrameSystem.SLibrary.SComponents.SLabel sLabel73;
    private FrameSystem.SLibrary.SComponents.SLabel sLabel74;
    private FrameSystem.SLibrary.SComponents.SLabel sLabel75;
    private FrameSystem.SLibrary.SComponents.SLabel sLabel76;
    private FrameSystem.SLibrary.SComponents.SLabel sLabel77;
    private FrameSystem.SLibrary.SComponents.SLabel sLabel78;
    private FrameSystem.SLibrary.SComponents.SLabel sLabel79;
    private FrameSystem.SLibrary.SComponents.SLabel sLabel8;
    private FrameSystem.SLibrary.SComponents.SLabel sLabel80;
    private FrameSystem.SLibrary.SComponents.SLabel sLabel81;
    private FrameSystem.SLibrary.SComponents.SLabel sLabel82;
    private FrameSystem.SLibrary.SComponents.SLabel sLabel83;
    private FrameSystem.SLibrary.SComponents.SLabel sLabel84;
    private FrameSystem.SLibrary.SComponents.SLabel sLabel85;
    private FrameSystem.SLibrary.SComponents.SLabel sLabel86;
    private FrameSystem.SLibrary.SComponents.SLabel sLabel87;
    private FrameSystem.SLibrary.SComponents.SLabel sLabel88;
    private FrameSystem.SLibrary.SComponents.SLabel sLabel89;
    private FrameSystem.SLibrary.SComponents.SLabel sLabel9;
    private FrameSystem.SLibrary.SComponents.SLabel sLabel90;
    private FrameSystem.SLibrary.SComponents.SLabel sLabel91;
    private FrameSystem.SLibrary.SComponents.SLabel sLabel92;
    private FrameSystem.SLibrary.SComponents.SLabel sLabel93;
    private FrameSystem.SLibrary.SComponents.SLabel sLabel94;
    private FrameSystem.SLibrary.SComponents.SLabel sLabel95;
    private FrameSystem.SLibrary.SComponents.SLabel sLabel96;
    private FrameSystem.SLibrary.SComponents.SLabel sLabel97;
    private FrameSystem.SLibrary.SComponents.SLabel sLabel98;
    private FrameSystem.SLibrary.SComponents.SLabel sLabel99;
    public FrameSystem.SLibrary.SComponents.SLabel sLabel_accountinfo_accountholder;
    public FrameSystem.SLibrary.SComponents.SLabel sLabel_accountinfo_accountnumber;
    public FrameSystem.SLibrary.SComponents.SLabel sLabel_accountinfo_acrnumber;
    public FrameSystem.SLibrary.SComponents.SLabel sLabel_accountinfo_authorizedrepresentative;
    public FrameSystem.SLibrary.SComponents.SLabel sLabel_accountinfo_contactnumber;
    public FrameSystem.SLibrary.SComponents.SLabel sLabel_accountinfo_taxid;
    public FrameSystem.SLibrary.SComponents.SLabel sLabel_occupationdetails_civilstatus;
    public FrameSystem.SLibrary.SComponents.SLabel sLabel_occupationdetails_contactnumber;
    public FrameSystem.SLibrary.SComponents.SLabel sLabel_occupationdetails_currentoccupant;
    public FrameSystem.SLibrary.SComponents.SLabel sLabel_occupationdetails_dependents;
    public FrameSystem.SLibrary.SComponents.SLabel sLabel_occupationdetails_noactivity;
    public FrameSystem.SLibrary.SComponents.SLabel sLabel_occupationdetails_occupanttype;
    public FrameSystem.SLibrary.SComponents.SLabel sLabel_occupationdetails_residents;
    public FrameSystem.SLibrary.SComponents.SLabel sLabel_occupationdetails_spouse;
    public FrameSystem.SLibrary.SComponents.SLabel sLabel_occupationdetails_weekender;
    public FrameSystem.SLibrary.SComponents.SLabel sLabel_unitinfo_balcony;
    public FrameSystem.SLibrary.SComponents.SLabel sLabel_unitinfo_floor;
    public FrameSystem.SLibrary.SComponents.SLabel sLabel_unitinfo_floorarea;
    public FrameSystem.SLibrary.SComponents.SLabel sLabel_unitinfo_model;
    public FrameSystem.SLibrary.SComponents.SLabel sLabel_unitinfo_status;
    public FrameSystem.SLibrary.SComponents.SLabel sLabel_unitinfo_tower;
    public FrameSystem.SLibrary.SComponents.SLabel sLabel_unitinfo_turnover;
    public FrameSystem.SLibrary.SComponents.SLabel sLabel_unitinfo_unit;
    public FrameSystem.SLibrary.SComponents.SLabel sLabel_unitinfo_unitid;
    private FrameSystem.SLibrary.SComponents.SPanel sPanel1;
    private FrameSystem.SLibrary.SComponents.SPanel sPanel10;
    private FrameSystem.SLibrary.SComponents.SPanel sPanel100;
    private FrameSystem.SLibrary.SComponents.SPanel sPanel101;
    private FrameSystem.SLibrary.SComponents.SPanel sPanel102;
    private FrameSystem.SLibrary.SComponents.SPanel sPanel103;
    private FrameSystem.SLibrary.SComponents.SPanel sPanel104;
    private FrameSystem.SLibrary.SComponents.SPanel sPanel105;
    private FrameSystem.SLibrary.SComponents.SPanel sPanel106;
    private FrameSystem.SLibrary.SComponents.SPanel sPanel107;
    private FrameSystem.SLibrary.SComponents.SPanel sPanel108;
    private FrameSystem.SLibrary.SComponents.SPanel sPanel109;
    private FrameSystem.SLibrary.SComponents.SPanel sPanel11;
    private FrameSystem.SLibrary.SComponents.SPanel sPanel110;
    private FrameSystem.SLibrary.SComponents.SPanel sPanel111;
    private FrameSystem.SLibrary.SComponents.SPanel sPanel112;
    private FrameSystem.SLibrary.SComponents.SPanel sPanel113;
    private FrameSystem.SLibrary.SComponents.SPanel sPanel114;
    private FrameSystem.SLibrary.SComponents.SPanel sPanel115;
    private FrameSystem.SLibrary.SComponents.SPanel sPanel116;
    private FrameSystem.SLibrary.SComponents.SPanel sPanel117;
    private FrameSystem.SLibrary.SComponents.SPanel sPanel118;
    private FrameSystem.SLibrary.SComponents.SPanel sPanel119;
    private FrameSystem.SLibrary.SComponents.SPanel sPanel12;
    private FrameSystem.SLibrary.SComponents.SPanel sPanel120;
    private FrameSystem.SLibrary.SComponents.SPanel sPanel121;
    private FrameSystem.SLibrary.SComponents.SPanel sPanel122;
    private FrameSystem.SLibrary.SComponents.SPanel sPanel123;
    private FrameSystem.SLibrary.SComponents.SPanel sPanel124;
    private FrameSystem.SLibrary.SComponents.SPanel sPanel125;
    private FrameSystem.SLibrary.SComponents.SPanel sPanel126;
    private FrameSystem.SLibrary.SComponents.SPanel sPanel127;
    private FrameSystem.SLibrary.SComponents.SPanel sPanel128;
    private FrameSystem.SLibrary.SComponents.SPanel sPanel129;
    private FrameSystem.SLibrary.SComponents.SPanel sPanel13;
    private FrameSystem.SLibrary.SComponents.SPanel sPanel130;
    private FrameSystem.SLibrary.SComponents.SPanel sPanel131;
    private FrameSystem.SLibrary.SComponents.SPanel sPanel132;
    private FrameSystem.SLibrary.SComponents.SPanel sPanel133;
    private FrameSystem.SLibrary.SComponents.SPanel sPanel134;
    private FrameSystem.SLibrary.SComponents.SPanel sPanel135;
    private FrameSystem.SLibrary.SComponents.SPanel sPanel136;
    private FrameSystem.SLibrary.SComponents.SPanel sPanel137;
    private FrameSystem.SLibrary.SComponents.SPanel sPanel138;
    private FrameSystem.SLibrary.SComponents.SPanel sPanel14;
    private FrameSystem.SLibrary.SComponents.SPanel sPanel141;
    private FrameSystem.SLibrary.SComponents.SPanel sPanel142;
    private FrameSystem.SLibrary.SComponents.SPanel sPanel15;
    private FrameSystem.SLibrary.SComponents.SPanel sPanel16;
    private FrameSystem.SLibrary.SComponents.SPanel sPanel17;
    private FrameSystem.SLibrary.SComponents.SPanel sPanel18;
    private FrameSystem.SLibrary.SComponents.SPanel sPanel19;
    private FrameSystem.SLibrary.SComponents.SPanel sPanel2;
    private FrameSystem.SLibrary.SComponents.SPanel sPanel20;
    private FrameSystem.SLibrary.SComponents.SPanel sPanel21;
    private FrameSystem.SLibrary.SComponents.SPanel sPanel22;
    private FrameSystem.SLibrary.SComponents.SPanel sPanel23;
    private FrameSystem.SLibrary.SComponents.SPanel sPanel24;
    private FrameSystem.SLibrary.SComponents.SPanel sPanel25;
    private FrameSystem.SLibrary.SComponents.SPanel sPanel26;
    private FrameSystem.SLibrary.SComponents.SPanel sPanel27;
    private FrameSystem.SLibrary.SComponents.SPanel sPanel28;
    private FrameSystem.SLibrary.SComponents.SPanel sPanel29;
    private FrameSystem.SLibrary.SComponents.SPanel sPanel3;
    private FrameSystem.SLibrary.SComponents.SPanel sPanel30;
    private FrameSystem.SLibrary.SComponents.SPanel sPanel31;
    private FrameSystem.SLibrary.SComponents.SPanel sPanel32;
    private FrameSystem.SLibrary.SComponents.SPanel sPanel33;
    private FrameSystem.SLibrary.SComponents.SPanel sPanel34;
    private FrameSystem.SLibrary.SComponents.SPanel sPanel35;
    private FrameSystem.SLibrary.SComponents.SPanel sPanel36;
    private FrameSystem.SLibrary.SComponents.SPanel sPanel37;
    private FrameSystem.SLibrary.SComponents.SPanel sPanel38;
    private FrameSystem.SLibrary.SComponents.SPanel sPanel39;
    private FrameSystem.SLibrary.SComponents.SPanel sPanel4;
    private FrameSystem.SLibrary.SComponents.SPanel sPanel40;
    private FrameSystem.SLibrary.SComponents.SPanel sPanel41;
    private FrameSystem.SLibrary.SComponents.SPanel sPanel42;
    private FrameSystem.SLibrary.SComponents.SPanel sPanel43;
    private FrameSystem.SLibrary.SComponents.SPanel sPanel44;
    private FrameSystem.SLibrary.SComponents.SPanel sPanel45;
    private FrameSystem.SLibrary.SComponents.SPanel sPanel46;
    private FrameSystem.SLibrary.SComponents.SPanel sPanel47;
    private FrameSystem.SLibrary.SComponents.SPanel sPanel48;
    private FrameSystem.SLibrary.SComponents.SPanel sPanel49;
    private FrameSystem.SLibrary.SComponents.SPanel sPanel5;
    private FrameSystem.SLibrary.SComponents.SPanel sPanel50;
    private FrameSystem.SLibrary.SComponents.SPanel sPanel51;
    private FrameSystem.SLibrary.SComponents.SPanel sPanel52;
    private FrameSystem.SLibrary.SComponents.SPanel sPanel53;
    private FrameSystem.SLibrary.SComponents.SPanel sPanel54;
    private FrameSystem.SLibrary.SComponents.SPanel sPanel55;
    private FrameSystem.SLibrary.SComponents.SPanel sPanel56;
    private FrameSystem.SLibrary.SComponents.SPanel sPanel57;
    private FrameSystem.SLibrary.SComponents.SPanel sPanel58;
    private FrameSystem.SLibrary.SComponents.SPanel sPanel59;
    private FrameSystem.SLibrary.SComponents.SPanel sPanel6;
    public FrameSystem.SLibrary.SComponents.SPanel sPanel60;
    private FrameSystem.SLibrary.SComponents.SPanel sPanel61;
    public FrameSystem.SLibrary.SComponents.SPanel sPanel62;
    private FrameSystem.SLibrary.SComponents.SPanel sPanel63;
    public FrameSystem.SLibrary.SComponents.SPanel sPanel64;
    public FrameSystem.SLibrary.SComponents.SPanel sPanel65;
    public FrameSystem.SLibrary.SComponents.SPanel sPanel66;
    public FrameSystem.SLibrary.SComponents.SPanel sPanel67;
    public FrameSystem.SLibrary.SComponents.SPanel sPanel68;
    private FrameSystem.SLibrary.SComponents.SPanel sPanel69;
    private FrameSystem.SLibrary.SComponents.SPanel sPanel7;
    private FrameSystem.SLibrary.SComponents.SPanel sPanel70;
    private FrameSystem.SLibrary.SComponents.SPanel sPanel71;
    private FrameSystem.SLibrary.SComponents.SPanel sPanel72;
    private FrameSystem.SLibrary.SComponents.SPanel sPanel73;
    public FrameSystem.SLibrary.SComponents.SPanel sPanel74;
    private FrameSystem.SLibrary.SComponents.SPanel sPanel75;
    public FrameSystem.SLibrary.SComponents.SPanel sPanel76;
    private FrameSystem.SLibrary.SComponents.SPanel sPanel77;
    private FrameSystem.SLibrary.SComponents.SPanel sPanel78;
    private FrameSystem.SLibrary.SComponents.SPanel sPanel79;
    private FrameSystem.SLibrary.SComponents.SPanel sPanel8;
    private FrameSystem.SLibrary.SComponents.SPanel sPanel80;
    private FrameSystem.SLibrary.SComponents.SPanel sPanel81;
    private FrameSystem.SLibrary.SComponents.SPanel sPanel82;
    private FrameSystem.SLibrary.SComponents.SPanel sPanel83;
    private FrameSystem.SLibrary.SComponents.SPanel sPanel84;
    private FrameSystem.SLibrary.SComponents.SPanel sPanel85;
    private FrameSystem.SLibrary.SComponents.SPanel sPanel86;
    private FrameSystem.SLibrary.SComponents.SPanel sPanel87;
    private FrameSystem.SLibrary.SComponents.SPanel sPanel88;
    private FrameSystem.SLibrary.SComponents.SPanel sPanel89;
    private FrameSystem.SLibrary.SComponents.SPanel sPanel9;
    private FrameSystem.SLibrary.SComponents.SPanel sPanel90;
    private FrameSystem.SLibrary.SComponents.SPanel sPanel91;
    private FrameSystem.SLibrary.SComponents.SPanel sPanel92;
    private FrameSystem.SLibrary.SComponents.SPanel sPanel93;
    private FrameSystem.SLibrary.SComponents.SPanel sPanel94;
    private FrameSystem.SLibrary.SComponents.SPanel sPanel95;
    private FrameSystem.SLibrary.SComponents.SPanel sPanel96;
    private FrameSystem.SLibrary.SComponents.SPanel sPanel97;
    private FrameSystem.SLibrary.SComponents.SPanel sPanel98;
    private FrameSystem.SLibrary.SComponents.SPanel sPanel99;
    private FrameSystem.SLibrary.SComponents.SPanel sPanelNext;
    public FrameSystem.SLibrary.SComponents.SPanel sPanelPage1;
    public FrameSystem.SLibrary.SComponents.SPanel sPanelPage2;
    public FrameSystem.SLibrary.SComponents.SPanel sPanelPage3;
    public FrameSystem.SLibrary.SComponents.SPanel sPanelPage4;
    public FrameSystem.SLibrary.SComponents.SPanel sPanelPage5;
    public FrameSystem.SLibrary.SComponents.SPanel sPanelPage6;
    public FrameSystem.SLibrary.SComponents.SPanel sPanelPage7;
    private FrameSystem.SLibrary.SComponents.SPanel sPanelPrevious;
    public FrameSystem.SLibrary.SComponents.STable sTable1;
    public FrameSystem.SLibrary.SComponents.STextField sTextField1;
    private FrameSystem.SLibrary.SGenericComponents.STextFieldContainer sTextFieldContainer1;
    public FrameSystem.SLibrary.SComponents.SPanel unitsViewOverview_Edit;
    public FrameSystem.SLibrary.SComponents.SPanel unitsViewOverview_EditNotes;
    public FrameSystem.SLibrary.SComponents.SPanel unitsViewOverview_ReportConcern;
    public FrameSystem.SLibrary.SComponents.SPanel unitsViewOverview_ReportViolation;
    public FrameSystem.SLibrary.SComponents.SPanel unitsViewOverview_UploadDocument;
    public FrameSystem.SLibrary.SComponents.SPanel unitsViewOverview_ViewAllConcerns;
    public FrameSystem.SLibrary.SComponents.SPanel unitsViewOverview_ViewOwner;
    public FrameSystem.SLibrary.SComponents.SPanel unitsViewOverview_ViewTenant;
    public FrameSystem.SLibrary.SComponents.SPanel unitsView_Close;
    public FrameSystem.Layers.Units.Components.ObjectUnitHighlight unitsView_Highlight;
    public FrameSystem.SLibrary.SComponents.SPanel unitsView_Next;
    public FrameSystem.SLibrary.SComponents.SPanel unitsView_Previous;
    public FrameSystem.SLibrary.SComponents.SLabel unitsView_Title;
    // End of variables declaration//GEN-END:variables
}
