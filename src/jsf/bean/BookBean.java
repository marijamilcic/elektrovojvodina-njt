package jsf.bean;

import jsf.domain.BookOfMaintenance;
import jsf.service.BookOfMaintenanceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.faces.bean.ManagedBean;
import java.awt.print.Book;
import java.util.List;

/**
 * Created by marij on 9/24/2016.
 */
@ManagedBean(name="bookBean")
@Scope
@Component
public class BookBean {
    @Autowired
    private BookOfMaintenanceService bookOfMaintenanceService;
    private BookOfMaintenance bookOfMaintenance;

    public BookOfMaintenanceService getBookOfMaintenanceService() {
        return bookOfMaintenanceService;
    }

    public void setBookOfMaintenanceService(BookOfMaintenanceService bookOfMaintenanceService) {
        this.bookOfMaintenanceService = bookOfMaintenanceService;
    }

    public BookOfMaintenance getBookOfMaintenance() {
        return bookOfMaintenance;
    }

    public void setBookOfMaintenance(BookOfMaintenance bookOfMaintenance) {
        this.bookOfMaintenance = bookOfMaintenance;
    }
    public BookBean(){
        bookOfMaintenance = new BookOfMaintenance();
    }

    public void addBook(){
        bookOfMaintenanceService.add(bookOfMaintenance);
        bookOfMaintenance = new BookOfMaintenance();
    }

    public List<BookOfMaintenance> getBookList(){
        return bookOfMaintenanceService.getAll();
    }
}
