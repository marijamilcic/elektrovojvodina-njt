package jsf.service.impl;

import jsf.dao.StepDao;
import jsf.domain.Step;
import jsf.service.StepService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by marij on 9/24/2016.
 */

@Service
@Repository
public class StepServiceImpl implements StepService {

    @Autowired
    private StepDao stepDao;
    @Override
    public List<Step> getAll() {
        return stepDao.getAll();
    }

    @Override
    public void AddStep(Step step) {
        stepDao.AddStep(step);
    }

    @Override
    public void deleteStep(Step step) {
        stepDao.deleteStep(step);
    }
}
