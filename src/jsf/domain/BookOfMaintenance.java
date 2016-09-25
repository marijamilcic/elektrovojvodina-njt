package jsf.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;
import java.util.Date;

/**
 * Created by mmmilcic on 29.4.2016..
 */

@Entity
@Table(name = "knjiga_odrzavanja")
public class BookOfMaintenance implements Serializable {

    @Id
    @Column(name = "id_knjige")
    private int bookId;

    @Column(name = "datum_kreiranja")
    private Date dateOfCreation;

    public BookOfMaintenance() {
    }


    public BookOfMaintenance(int bookId, Date dateOfCreation) {
        this.bookId = bookId;
        this.dateOfCreation = dateOfCreation;
    }

    public int getBookId() {
        return bookId;
    }

    public void setBookId(int bookId) {
        this.bookId = bookId;
    }

    public Date getDateOfCreation() {
        return dateOfCreation;
    }

    public void setDateOfCreation(Date dateOfCreation) {
        this.dateOfCreation = dateOfCreation;
    }
}