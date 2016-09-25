package jsf.dao.impl;

import jsf.dao.StepDao;
import jsf.domain.Step;
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
public class StepDaoImpl implements StepDao {

    @Autowired
    private SessionFactory sessionFactory;

    @Override
    public List<Step> getAll() {
        return (List<Step>) sessionFactory.getCurrentSession().createQuery("from jsf.domain.Step");
    }

    @Override
    public void AddStep(Step step) {
        sessionFactory.getCurrentSession().persist(step);
    }

    @Override
    public void deleteStep(Step step) {
        sessionFactory.getCurrentSession().delete(step);
    }
}
