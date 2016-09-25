package jsf.dao.impl;

import jsf.dao.TaskDao;
import jsf.domain.Task;
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
public class TaskDaoImpl implements TaskDao {

    @Autowired
    private SessionFactory sessionFactory;

    public List<Task> getAll(){

       return (List<Task>) sessionFactory.getCurrentSession().createQuery("from jsf.domain.Task");
    }
    public void AddTask(Task task){
        sessionFactory.getCurrentSession().persist(task);
    }
    public void deleteTask(Task task){
        sessionFactory.getCurrentSession().delete(task);
    }
}
