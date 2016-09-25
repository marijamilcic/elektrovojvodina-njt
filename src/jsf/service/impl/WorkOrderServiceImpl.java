package jsf.service.impl;

import jsf.dao.WorkOrderDao;
import jsf.domain.WorkOrder;
import jsf.service.WorkOrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by marij on 9/24/2016.
 */

@Service
@Repository
public class WorkOrderServiceImpl implements WorkOrderService {

    @Autowired
    private WorkOrderDao workOrderDao;

    @Override
    public List<WorkOrder> getAll() {
        return workOrderDao.getAll();
    }

    @Override
    public void AddWorkOrder(WorkOrder workOrder) {
        workOrderDao.AddWorkOrder(workOrder);
    }

    @Override
    public void deleteWorkOrder(WorkOrder workOrder) {
        workOrderDao.deleteWorkOrder(workOrder);
    }
}
