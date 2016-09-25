package jsf.bean;

import jsf.domain.CalendarOfMaintenance;
import jsf.service.BookOfMaintenanceService;
import jsf.service.CalendarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.faces.bean.ManagedBean;
import java.util.List;

/**
 * Created by marij on 9/24/2016.
 */

@ManagedBean(name="calendarBean")
@Scope
@Component
public class CalendarBean {

    @Autowired
    private CalendarService calendarService;
    private CalendarOfMaintenance calendarOfMaintenance;


    public CalendarService getCalendarService() {
        return calendarService;
    }

    public void setCalendarService(CalendarService calendarService) {
        this.calendarService = calendarService;
    }

    public CalendarOfMaintenance getCalendarOfMaintenance() {
        return calendarOfMaintenance;
    }

    public void setCalendarOfMaintenance(CalendarOfMaintenance calendarOfMaintenance) {
        this.calendarOfMaintenance = calendarOfMaintenance;
    }


    public CalendarBean() {
        calendarOfMaintenance = new CalendarOfMaintenance();
    }

    public void addBook(){
        calendarService.addCalendar(calendarOfMaintenance);
        calendarOfMaintenance = new CalendarOfMaintenance();
    }

    public List<CalendarOfMaintenance> getBookList(){
        return calendarService.calendars();
    }
}
