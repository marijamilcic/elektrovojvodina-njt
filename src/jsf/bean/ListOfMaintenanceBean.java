package jsf.bean;

import jsf.domain.ListOfMaintenance;
import jsf.service.ListOfMaintenanceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.faces.bean.ManagedBean;
import java.util.List;

/**
 * Created by marij on 9/24/2016.
 */
@ManagedBean(name="listOfMaintenanceBean")
@Scope
@Component
public class ListOfMaintenanceBean {
    @Autowired
    private ListOfMaintenanceService listOfMaintenanceService;
    private ListOfMaintenance listOfMaintenance;

    public ListOfMaintenanceService getListOfMaintenanceService() {
        return listOfMaintenanceService;
    }

    public void setListOfMaintenanceService(ListOfMaintenanceService listOfMaintenanceService) {
        this.listOfMaintenanceService = listOfMaintenanceService;
    }

    public ListOfMaintenance getListOfMaintenance() {
        return listOfMaintenance;
    }

    public void setListOfMaintenance(ListOfMaintenance listOfMaintenance) {
        this.listOfMaintenance = listOfMaintenance;
    }
    public ListOfMaintenanceBean(){
        listOfMaintenance = new ListOfMaintenance();
    }

    public void addListOfMaintenance(){
        listOfMaintenanceService.add(listOfMaintenance);
        listOfMaintenance = new ListOfMaintenance();
    }

    public List<ListOfMaintenance> getListOfMaintenanceList(){
        return listOfMaintenanceService.getAll();
    }
}
