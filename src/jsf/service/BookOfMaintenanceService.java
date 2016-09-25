package jsf.service;

import jsf.domain.BookOfMaintenance;

import java.util.List;

/**
 * Created by marij on 9/24/2016.
 */
public interface BookOfMaintenanceService {
    public void add(BookOfMaintenance bookOfMaintenance);
    public List<BookOfMaintenance> getAll();
}
