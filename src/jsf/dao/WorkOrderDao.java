package jsf.dao;

import jsf.domain.WorkOrder;

import java.util.List;

/**
 * Created by marij on 9/24/2016.
 */
public interface WorkOrderDao {
    public List<WorkOrder> getAll();
    public void AddWorkOrder(WorkOrder workOrder);
    public void deleteWorkOrder(WorkOrder workOrder);
}
