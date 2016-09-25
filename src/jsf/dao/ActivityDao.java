package jsf.dao;

import jsf.domain.Activity;

import java.util.List;

/**
 * Created by marij on 9/23/2016.
 */
public interface ActivityDao {
    public void add(Activity activity);
    public List<Activity> findAll();
}
