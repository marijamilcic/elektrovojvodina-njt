package jsf.bean;

import jsf.domain.Activity;
import jsf.model.Student;
import jsf.service.ActivityService;
import jsf.service.StudentService;
import jsf.service.impl.AcitvityServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.faces.bean.ManagedBean;
import java.util.List;

/**
 * Created by marij on 9/23/2016.
 */

@ManagedBean(name="activityBean")
@Scope
@Component

public class AcitvityBean {

    @Autowired
    private ActivityService activityService;
    private Activity activity;

    public ActivityService getActivityService() {
        return activityService;
    }

    public void setActivityService(ActivityService activityService) {
        this.activityService = activityService;
    }

    public AcitvityBean(Activity activity) {
        this.activity = activity;
    }

    public AcitvityBean() {

    }

    public void addActivity(){
        activityService.add(activity);
        activity = new Activity();
    }

    public List<Activity> getActivityList(){
        //return new ArrayList<Student>();
        return activityService.getAll();
    }

    public Activity getActivity() {
        return activity;
    }

    public void setActivity(Activity activity) {
        this.activity = activity;
    }
}
