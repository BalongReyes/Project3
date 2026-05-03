
package FrameSystem.Layers.Units.Managers;

import ConsoleSystem.Console;
import DatabaseSystem.Database;
import DatabaseSystem.DependentData.DependentDataHandler;
import DatabaseSystem.PersonStayingData.PersonStayingDataHandler;
import DatabaseSystem.ResidentData.ResidentDataHandler;
import DatabaseSystem.ResidentData.ResidentDataTable;
import DatabaseSystem.SpouseData.SpouseDataHandler;
import DatabaseSystem.UnitsData.UnitsDataTable;
import FrameSystem.Layers.Units.Components.LayerUnits_Main;
import FrameSystem.Layers.Units.Components.LayerUnits_View;
import FrameSystem.Layers.Units.Components.ObjectUnit;
import java.sql.SQLException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class ManagerViewUnits extends ManagerModuleUnits {

    public static void initDefault() {
    }
    
    public static void showLayerUnitsView() {
        ObjectUnit currentObject = ManagerObjectUnits.getCurrentObject();
        if (currentObject == null) return;
        UnitsDataTable data = currentObject.getData();
        
        String unitId = data.tower() + "-" + data.floor() + (data.unit() < 10 ? "0" : "") + data.unit();
        moduleUnits.unitsView_Title.setText("Unit " + unitId);
        
        moduleUnits.sLabel_unitinfo_unitid.setText(unitId);
        moduleUnits.sLabel_unitinfo_tower.setText(data.tower());
        moduleUnits.sLabel_unitinfo_floor.setText(String.valueOf(data.floor()));
        moduleUnits.sLabel_unitinfo_unit.setText(String.valueOf(data.unit()));
        
        String modelText = switch (data.model()) {
            case 1 -> "1 Bedroom";
            case 2 -> "2 Bedroom";
            case 3 -> "Studio";
            default -> "N/A";
        };
        moduleUnits.sLabel_unitinfo_model.setText(modelText);
        moduleUnits.sLabel_unitinfo_balcony.setText(data.balcony() == 1 ? "Yes" : "No");
        moduleUnits.sLabel_unitinfo_floorarea.setText(data.floorArea() + " sqm");
        moduleUnits.sLabel_unitinfo_status.setText(data.getUnitStatus().getStringName());
        
        java.sql.Date turnedOver = data.turnedOver();
        if (turnedOver != null) {
            LocalDate localDate = turnedOver.toLocalDate();
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MMMM dd, yyyy");
            moduleUnits.sLabel_unitinfo_turnover.setText(localDate.format(formatter));
        } else {
            moduleUnits.sLabel_unitinfo_turnover.setText("N/A");
        }
        
        moduleUnits.sLabel_accountinfo_accountnumber.setText(data.accountNumber() != null && !data.accountNumber().isEmpty() ? data.accountNumber() : "N/A");
        
        ResidentDataTable ownerData = null;
        try {
            ownerData = ResidentDataHandler.getOwnerResidentByUnitId(data.id());
            if (ownerData != null) {
                moduleUnits.sLabel_accountinfo_accountholder.setText(ownerData.getFullName());
                moduleUnits.sLabel_accountinfo_taxid.setText(ownerData.taxNo() != 0 ? String.valueOf(ownerData.taxNo()) : "N/A");
                moduleUnits.sLabel_accountinfo_acrnumber.setText(ownerData.acrNo() != null && !ownerData.acrNo().isEmpty() ? ownerData.acrNo() : "N/A");
                moduleUnits.sLabel_accountinfo_authorizedrepresentative.setText(ownerData.authorizedRepresentative() != null && !ownerData.authorizedRepresentative().isEmpty() ? ownerData.authorizedRepresentative() : "N/A");
                moduleUnits.sLabel_accountinfo_contactnumber.setText(ownerData.mobileNos() != null && !ownerData.mobileNos().isEmpty() ? ownerData.mobileNos() : "N/A");
            } else {
                moduleUnits.sLabel_accountinfo_accountholder.setText("N/A");
                moduleUnits.sLabel_accountinfo_taxid.setText("N/A");
                moduleUnits.sLabel_accountinfo_acrnumber.setText("N/A");
                moduleUnits.sLabel_accountinfo_authorizedrepresentative.setText("N/A");
                moduleUnits.sLabel_accountinfo_contactnumber.setText("N/A");
            }
        } catch (SQLException e) {
            Console.errorOut("Error fetching unit owner resident data", e);
            moduleUnits.sLabel_accountinfo_accountholder.setText("Error");
            moduleUnits.sLabel_accountinfo_taxid.setText("Error");
            moduleUnits.sLabel_accountinfo_acrnumber.setText("Error");
            moduleUnits.sLabel_accountinfo_authorizedrepresentative.setText("Error");
            moduleUnits.sLabel_accountinfo_contactnumber.setText("Error");
        }
        
        ResidentDataTable tenantData = null;
        try {
            tenantData = ResidentDataHandler.getTenantResidentByUnitId(data.id());
        } catch (SQLException e) {
            Console.errorOut("Error fetching unit tenant resident data", e);
        }

        ResidentDataTable occupantData = null;
        String occupantType = "None";
        boolean isWeekender = false;
        boolean isNoActivity = false;
        
        int personsStayingCount = 0;
        int dependentsCount = 0;
        String spouseName = "N/A";
        int totalResidents = 0;

        try {
            if (tenantData != null) {
                occupantType = "Tenant";
                occupantData = tenantData;
                String q = "SELECT weekenders, noactivity FROM unittenants WHERE units_id = ? AND residents_id = ? ORDER BY id DESC LIMIT 1";
                java.util.Optional<int[]> flags = Database.queryForObject(q, rs -> new int[]{rs.getInt(1), rs.getInt(2)}, data.id(), tenantData.id());
                if (flags.isPresent()) {
                    isWeekender = flags.get()[0] == 1;
                    isNoActivity = flags.get()[1] == 1;
                }
            } else if (ownerData != null) {
                occupantType = "Owner";
                occupantData = ownerData;
                String q = "SELECT weekenders, noactivity FROM unitowners WHERE units_id = ? AND residents_id = ? ORDER BY id DESC LIMIT 1";
                java.util.Optional<int[]> flags = Database.queryForObject(q, rs -> new int[]{rs.getInt(1), rs.getInt(2)}, data.id(), ownerData.id());
                if (flags.isPresent()) {
                    isWeekender = flags.get()[0] == 1;
                    isNoActivity = flags.get()[1] == 1;
                }
            }
            
            if (occupantData != null) {
                personsStayingCount = PersonStayingDataHandler.getPersonsStayingByResidentId(occupantData.id()).size();
                dependentsCount = DependentDataHandler.getDependentsByResidentId(occupantData.id()).size();
                DatabaseSystem.SpouseData.SpouseDataTable spouseData = SpouseDataHandler.getSpouseByResidentId(occupantData.id());
                int spouseCount = 0;
                if (spouseData != null) {
                    spouseName = spouseData.getFullName();
                    spouseCount = 1;
                }
                totalResidents = 1 + personsStayingCount + dependentsCount + spouseCount;
            }
        } catch (SQLException e) {
            Console.errorOut("Error fetching occupation details", e);
        }

        moduleUnits.sLabel_occupationdetails_occupanttype.setText(occupantType);
        moduleUnits.sLabel_occupationdetails_currentoccupant.setText(occupantData != null ? occupantData.getFullName() : "N/A");
        moduleUnits.sLabel_occupationdetails_contactnumber.setText(occupantData != null && occupantData.mobileNos() != null && !occupantData.mobileNos().isEmpty() ? occupantData.mobileNos() : "N/A");
        moduleUnits.sLabel_occupationdetails_civilstatus.setText(occupantData != null && occupantData.civilStatus() != null && !occupantData.civilStatus().isEmpty() ? occupantData.civilStatus() : "N/A");
        
        moduleUnits.sLabel_occupationdetails_weekender.setText(isWeekender ? "Yes" : "No");
        moduleUnits.sLabel_occupationdetails_noactivity.setText(isNoActivity ? "Yes" : "No");
        
        moduleUnits.sLabel_occupationdetails_residents.setText(occupantData != null ? String.valueOf(totalResidents) : "N/A");
        moduleUnits.sLabel_occupationdetails_dependents.setText(occupantData != null ? String.valueOf(dependentsCount) : "N/A");
        moduleUnits.sLabel_occupationdetails_spouse.setText(occupantData != null ? spouseName : "N/A");
        
        moduleUnits.unitsView_Highlight.setUnitStatus(data.getUnitStatus());
        
        int index = ManagerObjectUnits.getObjectIndex(currentObject);
        moduleUnits.unitsView_Previous.setVisible(index > 0 || ManagerObjectUnits.currentPage > 0);
        moduleUnits.unitsView_Next.setVisible((index >= 0 && index < ManagerObjectUnits.getObjectsSize() - 1) || ManagerObjectUnits.currentPage < ManagerObjectUnits.totalPages - 1);
        
        LayerUnits_Main.showLayer(moduleUnits.layerUnitsView);
        LayerUnits_View.showLayer(moduleUnits.layerUnits_ViewOverview);
    }

}
