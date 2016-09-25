package jsf.domain;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

/**
 * Created by mmilcic on 29.6.2016..
 */

@Entity
@Table (name = "stavka_knjige")
public class ItemOfBook implements Serializable {

    @Id
    @Column(name = "id_knjige")
    private  int bookId;

    @Id
    @Column (name = "redni_broj")
    private int serialNumber;

    @Column(name = "datum_kreiranja")
    private Date dateOfCreation;

    @Column(name = "napomena")
    private String warning;

    @ManyToOne
    @JoinColumn(name = "id_sablona")
    private Pattern PaternId;

    @ManyToOne
    @JoinColumn(name = "id_liste")
    private CalendarOfMaintenance CalendarId;

    public ItemOfBook() {
    }

    public ItemOfBook(int bookId, int serialNumber, Date dateOfCreation, String warning, Pattern paternId, CalendarOfMaintenance calendarId) {
        this.bookId = bookId;
        this.serialNumber = serialNumber;
        this.dateOfCreation = dateOfCreation;
        this.warning = warning;
        PaternId = paternId;
        CalendarId = calendarId;
    }

    public int getBookId() {
        return bookId;
    }

    public void setBookId(int bookId) {
        this.bookId = bookId;
    }

    public int getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(int serialNumber) {
        this.serialNumber = serialNumber;
    }

    public Date getDateOfCreation() {
        return dateOfCreation;
    }

    public void setDateOfCreation(Date dateOfCreation) {
        this.dateOfCreation = dateOfCreation;
    }

    public String getWarning() {
        return warning;
    }

    public void setWarning(String warning) {
        this.warning = warning;
    }

    public Pattern getPaternId() {
        return PaternId;
    }

    public void setPaternId(Pattern paternId) {
        PaternId = paternId;
    }

    public CalendarOfMaintenance getCalendarId() {
        return CalendarId;
    }

    public void setCalendarId(CalendarOfMaintenance calendarId) {
        CalendarId = calendarId;
    }
}