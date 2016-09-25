package jsf.dao;

import jsf.domain.BookOfMaintenance;

import java.util.List;

/**
 * Created by marij on 9/24/2016.
 */

public interface BookOfMaintenanceDao {
    public void add(BookOfMaintenance bookOfMaintenance);
    public List<BookOfMaintenance> findAll();
}
