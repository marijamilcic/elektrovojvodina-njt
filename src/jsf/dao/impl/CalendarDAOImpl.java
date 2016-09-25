package jsf.dao.impl;

import jsf.dao.CalendarDAO;
import jsf.domain.CalendarOfMaintenance;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by marij on 8/27/2016.
 */

@Transactional
@Repository
public class CalendarDAOImpl implements CalendarDAO {

    @Autowired
    private SessionFactory sessionFactory;

    @Override
    public List<CalendarOfMaintenance> getAll() {
        return sessionFactory.getCurrentSession().createQuery("from jsf.domain.CalendarOfMaintenance ").list();
    }

    @Override
    public void AddCalendar(CalendarOfMaintenance calendar) {
        sessionFactory.getCurrentSession().persist(calendar);
    }

    @Override
    public void deleteCalendar(CalendarOfMaintenance calendar) {
        sessionFactory.getCurrentSession().delete(calendar);
    }
}
