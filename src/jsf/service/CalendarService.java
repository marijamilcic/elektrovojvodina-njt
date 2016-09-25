package jsf.service;


import jsf.domain.CalendarOfMaintenance;

import java.util.Date;
import java.util.List;

/**
 * Created by marija on 4/12/2016.
 */
public interface CalendarService {
    public CalendarOfMaintenance getCalendarByID(int id);
    public List<CalendarOfMaintenance> getAllByDate(Date date);
    public void addCalendar(CalendarOfMaintenance calendarOfMaintenance);
    public List<CalendarOfMaintenance> calendars();
    public void deleteCalendar(CalendarOfMaintenance calendarOfMaintenance);
}
