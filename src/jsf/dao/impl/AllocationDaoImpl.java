package jsf.dao.impl;

import jsf.dao.AllocationDao;
import jsf.domain.Allocation;
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
public class AllocationDaoImpl implements AllocationDao{
    @Autowired
    private SessionFactory sessionFactory;

    @Override
    public void add(Allocation allocation) {
        sessionFactory.getCurrentSession().persist(allocation);
    }

    @Override
    public List<Allocation> findAll() {
        return (List<Allocation>) sessionFactory.getCurrentSession().createQuery("from jsf.domain.Allocation ");
    }
}
