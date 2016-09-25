package jsf.domain;

import javax.persistence.*;
import java.io.Serializable;

/**
 * Created by mmilcic on 29.4.2016..
 */

@Entity
@Table(name = "stavka_rn")
public class WorkOrderItem implements Serializable {

    @Id
    @Column(name = "id_stavke_rn")
    private int itemID;

    @Id
    @ManyToOne
    @JoinColumn(name = "id_rn")
    private WorkOrder workOrder;

    @Column(name = "redni_broj")
    private int serialNo;

    @Column(name = "status")
    private String status;


    public WorkOrderItem() {
    }

    public WorkOrderItem(int itemID, WorkOrder workOrder, int serialNo, String status) {
        this.itemID = itemID;
        this.workOrder = workOrder;
        this.serialNo = serialNo;
        this.status = status;
    }

    public int getItemID() {
        return itemID;
    }

    public void setItemID(int itemID) {
        this.itemID = itemID;
    }

    public WorkOrder getWorkOrder() {
        return workOrder;
    }

    public void setWorkOrder(WorkOrder workOrder) {
        this.workOrder = workOrder;
    }

    public int getSerialNo() {
        return serialNo;
    }

    public void setSerialNo(int serialNo) {
        this.serialNo = serialNo;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "WorkOrderItemDao{" +
                "itemID=" + itemID +
                ", workOrder=" + workOrder +
                ", serialNo=" + serialNo +
                ", status='" + status + '\'' +
                '}';
    }
}
