package jsf.service.impl;

import jsf.dao.CalendarDAO;
import jsf.domain.CalendarOfMaintenance;
import jsf.service.CalendarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * Created by marij on 9/24/2016.
 */
@Service
@Repository
public class CalendarServiceImpl implements CalendarService{
    @Autowired
    private CalendarDAO calendarDAO;
    @Override
    public CalendarOfMaintenance getCalendarByID(int id) {
        for(CalendarOfMaintenance cm : calendars()){
            if(cm.getCalendarID() == id){
                return cm;
            }
        }
        return null;
    }

    @Override
    public List<CalendarOfMaintenance> getAllByDate(Date date) {
        List<CalendarOfMaintenance> newCalendars = new ArrayList<>();
        for(CalendarOfMaintenance cm : calendars()){
            if(cm.getDateOfCreation().equals(date)){
                newCalendars.add(cm);
            }
        }
        return newCalendars;
    }

    @Override
    public void addCalendar(CalendarOfMaintenance calendarOfMaintenance) {
            calendarDAO.AddCalendar(calendarOfMaintenance);
    }

    @Override
    public List<CalendarOfMaintenance> calendars() {
        return calendarDAO.getAll();
    }

    @Override
    public void deleteCalendar(CalendarOfMaintenance calendarOfMaintenance) {
        calendarDAO.deleteCalendar(calendarOfMaintenance);
    }
}
