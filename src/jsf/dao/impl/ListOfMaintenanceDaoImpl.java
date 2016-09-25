package jsf.dao.impl;

import jsf.dao.ListOfMaintenanceDao;
import jsf.domain.ListOfMaintenance;
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
public class ListOfMaintenanceDaoImpl implements ListOfMaintenanceDao {
    @Autowired
    private SessionFactory sessionFactory;
    @Override
    public void add(ListOfMaintenance listOfMaintenance) {
        sessionFactory.getCurrentSession().persist(listOfMaintenance);
    }

    @Override
    public List<ListOfMaintenance> findAll() {
        return (List<ListOfMaintenance>) sessionFactory.getCurrentSession().createQuery("from jsf.domain.ListOfMaintenance");
    }
}
