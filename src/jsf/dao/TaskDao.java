package jsf.dao;

import jsf.domain.Task;

import java.util.List;

/**
 * Created by marij on 9/24/2016.
 */
public interface TaskDao {
    public List<Task> getAll();
    public void AddTask(Task task);
    public void deleteTask(Task task);
}
