package jsf.dao.impl;

import jsf.dao.BookOfMaintenanceDao;
import jsf.domain.BookOfMaintenance;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by marij on 9/24/2016.
 */

@Transactional
@Repository
public class BookOfMaintenanceDaoImpl implements BookOfMaintenanceDao {

    @Autowired
    private SessionFactory sessionFactory;

    @Override
    public void add(BookOfMaintenance bookOfMaintenance) {
        sessionFactory.getCurrentSession().persist(bookOfMaintenance);
    }

    @Override
    public List<BookOfMaintenance> findAll() {
        return (List<BookOfMaintenance>) sessionFactory.getCurrentSession().createQuery("from jsf.domain.BookOfMaintenance ");
    }
}
