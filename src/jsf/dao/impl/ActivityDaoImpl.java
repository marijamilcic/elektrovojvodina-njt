package jsf.dao.impl;

import jsf.dao.ActivityDao;
import jsf.domain.Activity;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by marij on 9/23/2016.
 */

@Transactional
@Repository
public class ActivityDaoImpl implements ActivityDao {

    @Autowired
    private SessionFactory sessionFactory;

    @Override
    public void add(Activity activity) {
        sessionFactory.getCurrentSession().persist(activity);
    }

    @Override
    public List<Activity> findAll() {
       return (List<Activity>) sessionFactory.getCurrentSession().createQuery("from jsf.domain.Activity ");

    }

}
