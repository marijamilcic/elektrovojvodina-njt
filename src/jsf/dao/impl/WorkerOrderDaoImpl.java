package jsf.dao.impl;

import jsf.dao.WorkOrderDao;
import jsf.domain.WorkOrder;
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

public class WorkerOrderDaoImpl implements WorkOrderDao {

    @Autowired
    private SessionFactory sessionFactory;

    @Override
    public List<WorkOrder> getAll() {
        return (List<WorkOrder>) sessionFactory.getCurrentSession().createQuery("from jsf.domain.WorkOrder");
    }

    @Override
    public void AddWorkOrder(WorkOrder workOrder) {
        sessionFactory.getCurrentSession().persist(workOrder);
    }

    @Override
    public void deleteWorkOrder(WorkOrder workOrder) {
    sessionFactory.getCurrentSession().delete(workOrder);
    }
}
