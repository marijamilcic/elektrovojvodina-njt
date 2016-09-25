package jsf.service.impl;

import jsf.dao.BookOfMaintenanceDao;
import jsf.domain.BookOfMaintenance;
import jsf.service.BookOfMaintenanceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by marij on 9/24/2016.
 */
@Service
@Repository
public class BookOfMaintenanceServiceImpl implements BookOfMaintenanceService {
    @Autowired
    private BookOfMaintenanceDao bookOfMaintenanceDao;

    @Override
    public void add(BookOfMaintenance bookOfMaintenance) {
        bookOfMaintenanceDao.add(bookOfMaintenance);
    }

    @Override
    public List<BookOfMaintenance> getAll() {
        return bookOfMaintenanceDao.findAll();
    }
}
