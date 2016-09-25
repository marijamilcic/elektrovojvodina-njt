package jsf.service;

import jsf.domain.WorkOrder;

import java.util.List;

/**
 * Created by marij on 9/24/2016.
 */
public interface WorkOrderService {
    public List<WorkOrder> getAll();
    public void AddWorkOrder(WorkOrder workOrder);
    public void deleteWorkOrder(WorkOrder workOrder);
}
