package jsf.service.impl;

import jsf.dao.WorkOrderItemDao;
import jsf.domain.WorkOrderItem;
import jsf.service.WorkOrderItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by marij on 9/24/2016.
 */

@Service
@Repository
public class WorkOrderItemServiceImpl implements WorkOrderItemService {

    @Autowired
    private WorkOrderItemDao workOrderItemDao;

    @Override
    public List<WorkOrderItem> getAll() {
        return workOrderItemDao.getAll();
    }

    @Override
    public void AddWorkOrderItem(WorkOrderItem workOrderItem) {
        workOrderItemDao.AddWorkOrderItem(workOrderItem);
    }

    @Override
    public void deleteWorkOrderItem(WorkOrderItem workOrderItem) {
        workOrderItemDao.deleteWorkOrderItem(workOrderItem);
    }
}
