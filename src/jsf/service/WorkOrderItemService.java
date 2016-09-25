package jsf.service;

import jsf.dao.WorkOrderItemDao;
import jsf.domain.WorkOrderItem;

import java.util.List;

/**
 * Created by marij on 9/24/2016.
 */
public interface WorkOrderItemService {
    public List<WorkOrderItem> getAll();
    public void AddWorkOrderItem(WorkOrderItem workOrderItem);
    public void deleteWorkOrderItem(WorkOrderItem workOrderItem);
}
