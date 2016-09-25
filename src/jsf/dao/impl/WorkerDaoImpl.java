package jsf.dao.impl;

import jsf.dao.WorkerDAO;
import jsf.domain.Worker;
import org.hibernate.Query;
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
public class WorkerDaoImpl implements WorkerDAO {


    @Autowired
    private SessionFactory sessionFactory;

    @Override
    public void addWorker(Worker worker) {
        sessionFactory.getCurrentSession().persist(worker);

    }

    @Override
    public List<Worker> listWorkers() {
        return (List<Worker>) sessionFactory.getCurrentSession().createQuery("from jsf.domain.Worker").list();
    }

    @Override
    public Worker getWorker(int workerId) {
        return (Worker) sessionFactory.getCurrentSession().get(Worker.class,workerId);
    }
}
