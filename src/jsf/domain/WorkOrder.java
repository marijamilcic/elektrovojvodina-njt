package jsf.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;
import java.util.Date;

/**
 * Created by mmilcic on 29.5.2016..
 */
@Entity
@Table(name = "radni_nalog")
public class WorkOrder implements Serializable {


    @Id
    @Column(name = "id_rn")
    private String id_rn;

    @Column(name = "datum_otvaranja")
    private Date openingDate;
    @Column(name = "datum_zatvaranja")
    private Date closingDate;
    @Column(name = "status")
    private String status;

    public WorkOrder() {

    }

    public WorkOrder(String id_rn, Date openingDate, String status, Date closingDate) {
        this.id_rn = id_rn;
        this.openingDate = openingDate;
        this.status = status;
        this.closingDate = closingDate;
    }

    public String getId_rn() {
        return id_rn;
    }

    public void setId_rn(String id_rn) {
        this.id_rn = id_rn;
    }

    public Date getOpeningDate() {
        return openingDate;
    }

    public void setOpeningDate(Date openingDate) {
        this.openingDate = openingDate;
    }

    public Date getClosingDate() {
        return closingDate;
    }

    public void setClosingDate(Date closingDate) {
        this.closingDate = closingDate;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "WorkOrder{" +
                "id_rn='" + id_rn + '\'' +
                ", openingDate=" + openingDate +
                ", closingDate=" + closingDate +
                ", status='" + status + '\'' +
                '}';
    }
}
