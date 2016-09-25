package jsf.service;

import jsf.domain.Activity;
import jsf.model.Student;

import java.util.List;

/**
 * Created by marij on 9/23/2016.
 */
public interface ActivityService {
    public void add(Activity activity);
    public List<Activity> getAll();
}
