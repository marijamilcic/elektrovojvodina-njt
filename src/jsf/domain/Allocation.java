package jsf.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;
import java.util.Date;

/**
 * Created by mmilcic on 29.6.2016..
 */

@Entity
@Table(name = "dodela")
public class Allocation implements Serializable{

    @Id
    @Column(name = "id_rn")
    private String workOrderID;

    @Id
    @Column(name = "id_radnika")
    private String workerID;

    @Id
    @Column(name = "id_uloge")
    private String roleID;

    @Column(name = "odgovorno_lice")
    private String responssiblePerson;

    @Column(name = "datum_od")
    private Date dateFrom;
    @Column(name = "datum_do")
    private Date dateTo;

    public Allocation() {
    }

    public Allocation(String workOrderID, String workerID, String roleID, String responssiblePerson, Date dateFrom, Date dateTo) {
        this.workOrderID = workOrderID;
        this.workerID = workerID;
        this.roleID = roleID;
        this.responssiblePerson = responssiblePerson;
        this.dateFrom = dateFrom;
        this.dateTo = dateTo;
    }

    public String getWorkOrderID() {
        return workOrderID;
    }

    public void setWorkOrderID(String workOrderID) {
        this.workOrderID = workOrderID;
    }

    public String getWorkerID() {
        return workerID;
    }

    public void setWorkerID(String workerID) {
        this.workerID = workerID;
    }

    public String getRoleID() {
        return roleID;
    }

    public void setRoleID(String roleID) {
        this.roleID = roleID;
    }

    public String getResponssiblePerson() {
        return responssiblePerson;
    }

    public void setResponssiblePerson(String responssiblePerson) {
        this.responssiblePerson = responssiblePerson;
    }

    public Date getDateFrom() {
        return dateFrom;
    }

    public void setDateFrom(Date dateFrom) {
        this.dateFrom = dateFrom;
    }

    public Date getDateTo() {
        return dateTo;
    }

    public void setDateTo(Date dateTo) {
        this.dateTo = dateTo;
    }

    @Override
    public String toString() {
        return "Allocation{" +
                "workOrderID='" + workOrderID + '\'' +
                ", workerID='" + workerID + '\'' +
                ", roleID='" + roleID + '\'' +
                ", responssiblePerson='" + responssiblePerson + '\'' +
                ", dateFrom=" + dateFrom +
                ", dateTo=" + dateTo +
                '}';
    }
}
