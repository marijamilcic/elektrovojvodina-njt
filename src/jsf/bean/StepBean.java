package jsf.bean;

import jsf.domain.Step;
import jsf.service.StepService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.faces.bean.ManagedBean;
import java.util.List;

/**
 * Created by marij on 9/24/2016.
 */

@ManagedBean(name="stepBean")
@Scope
@Component
public class StepBean {

    @Autowired
    private StepService stepService;
    private Step step;

    public StepService getStepService() {
        return stepService;
    }

    public void setStepService(StepService stepService) {
        this.stepService = stepService;
    }

    public Step getStep() {
        return step;
    }

    public void setStep(Step step) {
        this.step = step;
    }

    public StepBean() {
        step = new Step();
    }

    public List<Step> getList(){
        return stepService.getAll();
    }

    public void add(){
        stepService.AddStep(step);
    }

    public void delete(){
        stepService.deleteStep(step);
    }
}
