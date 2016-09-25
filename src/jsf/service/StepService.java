package jsf.service;

import jsf.domain.Step;

import java.util.List;

/**
 * Created by marij on 9/24/2016.
 */
public interface StepService {
    public List<Step> getAll();
    public void AddStep(Step step);
    public void deleteStep(Step step);
}
