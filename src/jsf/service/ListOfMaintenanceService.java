package jsf.service;

import jsf.domain.ListOfMaintenance;

import java.util.List;

/**
 * Created by marij on 9/24/2016.
 */
public interface ListOfMaintenanceService {
    public void add(ListOfMaintenance listOfMaintenance);
    public List<ListOfMaintenance> getAll();
}
