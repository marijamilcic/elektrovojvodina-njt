package jsf.service.impl;

import jsf.dao.ActivityDao;
import jsf.dao.StudentDao;
import jsf.domain.Activity;
import jsf.model.Student;
import jsf.service.ActivityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by marij on 9/23/2016.
 */

@Service
@Repository
public class AcitvityServiceImpl implements ActivityService {

    @Autowired
    private ActivityDao activityDao;

    @Override
    public void add(Activity activity) {
    activityDao.add(activity);
    }

    @Override
    public List<Activity> getAll() {
        return activityDao.findAll();
    }
}
