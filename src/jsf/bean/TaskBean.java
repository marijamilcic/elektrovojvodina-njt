package jsf.bean;

import jsf.domain.Task;
import jsf.service.TaskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.faces.bean.ManagedBean;
import java.util.List;

/**
 * Created by marij on 9/24/2016.
 */

@ManagedBean(name="taskBean")
@Scope
@Component
public class TaskBean {
    @Autowired
    private TaskService taskService;
    private Task task;

    public TaskBean() {
        task = new Task();
    }

    public TaskService getTaskService() {
        return taskService;
    }

    public void setTaskService(TaskService taskService) {
        this.taskService = taskService;
    }

    public Task getTask() {
        return task;
    }

    public void setTask(Task task) {
        this.task = task;
    }

    public List<Task> getList(){
        return taskService.getAll();
    }

    public void add(){
        taskService.AddTask(task);
    }

    public void delete(){
        taskService.deleteTask(task);
    }
}
