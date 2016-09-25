package jsf.dao.impl;

import jsf.dao.WorkOrderItemDao;
import jsf.domain.WorkOrderItem;
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
public class WorkOrderItemDaoImpl implements WorkOrderItemDao{

    @Autowired
    private SessionFactory sessionFactory;

    @Override
    public List<WorkOrderItem> getAll() {
        return (List<WorkOrderItem>) sessionFactory.getCurrentSession().createQuery("from jsf.domain.WorkOrderItem");
    }

    @Override
    public void AddWorkOrderItem(WorkOrderItem workOrderItem) {
        sessionFactory.getCurrentSession().persist(workOrderItem);
    }

    @Override
    public void deleteWorkOrderItem(WorkOrderItem workOrderItem) {
        sessionFactory.getCurrentSession().delete(workOrderItem);
    }
}
