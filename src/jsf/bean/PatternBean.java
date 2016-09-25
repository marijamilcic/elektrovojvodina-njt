package jsf.bean;

import jsf.domain.Pattern;
import jsf.service.PatternService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.faces.bean.ManagedBean;
import java.util.List;

/**
 * Created by marij on 9/24/2016.
 */

@ManagedBean(name="patternBean")
@Scope
@Component
public class PatternBean {

    @Autowired
    private PatternService patternService;
    private Pattern pattern;

    public PatternService getPatternService() {
        return patternService;
    }

    public void setPatternService(PatternService patternService) {
        this.patternService = patternService;
    }

    public Pattern getPattern() {
        return pattern;
    }

    public void setPattern(Pattern pattern) {
        this.pattern = pattern;
    }

    public PatternBean() {
        pattern = new Pattern();
    }

    public List<Pattern> getList(){
        return patternService.getAll();
    }

    public void add(){
        patternService.AddPattern(pattern);
    }

    public void delete(){
        patternService.deletePattern(pattern);
    }
}
