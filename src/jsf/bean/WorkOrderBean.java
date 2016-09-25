package jsf.bean;

import jsf.domain.WorkOrder;
import jsf.service.WorkOrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.faces.bean.ManagedBean;
import java.util.List;

/**
 * Created by marij on 9/24/2016.
 */

@ManagedBean(name="workOrderBean")
@Scope
@Component
public class WorkOrderBean {
    @Autowired
    private WorkOrderService workOrderService;
    private WorkOrder workOrder;

    public WorkOrderBean() {
       workOrder = new WorkOrder();
    }

    public WorkOrderService getWorkOrderService() {
        return workOrderService;
    }

    public void setWorkOrderService(WorkOrderService workOrderService) {
        this.workOrderService = workOrderService;
    }

    public WorkOrder getWorkOrder() {
        return workOrder;
    }

    public void setWorkOrder(WorkOrder workOrder) {
        this.workOrder = workOrder;
    }

    public List<WorkOrder> getList(){
        return workOrderService.getAll();
    }

    public void add(){
        workOrderService.AddWorkOrder(workOrder);
    }

    public void delete(){
        workOrderService.deleteWorkOrder(workOrder);
    }
}
