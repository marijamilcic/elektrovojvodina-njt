package jsf.bean;

import jsf.domain.WorkOrderItem;
import jsf.service.WorkOrderItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.faces.bean.ManagedBean;
import java.util.List;

/**
 * Created by marij on 9/24/2016.
 */

@ManagedBean(name="workOrderItemBean")
@Scope
@Component
public class WorkOrderItemBean {

    @Autowired
    private WorkOrderItemService workOrderItemService;
    private WorkOrderItem workOrderItem;

    public WorkOrderItemBean() {
        workOrderItem = new WorkOrderItem();
    }

    public WorkOrderItemService getWorkOrderItemService() {
        return workOrderItemService;
    }

    public void setWorkOrderItemService(WorkOrderItemService workOrderItemService) {
        this.workOrderItemService = workOrderItemService;
    }

    public WorkOrderItem getWorkOrderItem() {
        return workOrderItem;
    }

    public void setWorkOrderItem(WorkOrderItem workOrderItem) {
        this.workOrderItem = workOrderItem;
    }

    public List<WorkOrderItem> getList(){
        return workOrderItemService.getAll();
    }

    public void add(){
        workOrderItemService.AddWorkOrderItem(workOrderItem);
    }

    public void delete(){
        workOrderItemService.deleteWorkOrderItem(workOrderItem);
    }
}
