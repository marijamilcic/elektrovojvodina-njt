package jsf.service.impl;

import jsf.dao.ListOfMaintenanceDao;
import jsf.dao.impl.ListOfMaintenanceDaoImpl;
import jsf.domain.ListOfMaintenance;
import jsf.service.ListOfMaintenanceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by marij on 9/24/2016.
 */
@Service
@Repository
public class ListOfMaintenanceImpl implements ListOfMaintenanceService{
    @Autowired
    private ListOfMaintenanceDao listOfMaintenanceDao;
    @Override
    public void add(ListOfMaintenance listOfMaintenance) {
        listOfMaintenanceDao.add(listOfMaintenance);
    }

    @Override
    public List<ListOfMaintenance> getAll() {
        return listOfMaintenanceDao.findAll();
    }
}
