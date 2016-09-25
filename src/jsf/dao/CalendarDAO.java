package jsf.dao;

import jsf.domain.CalendarOfMaintenance;

import java.util.List;

/**
 * Created by marij on 4/4/2016.
 */
public interface CalendarDAO {
    public List<CalendarOfMaintenance> getAll();
    public void AddCalendar(CalendarOfMaintenance calendar);
    public void deleteCalendar(CalendarOfMaintenance calendar);

}
