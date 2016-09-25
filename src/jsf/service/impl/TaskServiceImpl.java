package jsf.service.impl;

import jsf.dao.TaskDao;
import jsf.domain.Task;
import jsf.service.TaskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import javax.persistence.SqlResultSetMapping;
import java.util.List;

/**
 * Created by marij on 9/24/2016.
 */

@Service
@Repository
public class TaskServiceImpl implements TaskService {

    @Autowired
    private TaskDao taskDao;

    @Override
    public List<Task> getAll() {
        return taskDao.getAll();
    }

    @Override
    public void AddTask(Task task) {
        taskDao.AddTask(task);
    }

    @Override
    public void deleteTask(Task task) {
        taskDao.deleteTask(task);
    }
}
