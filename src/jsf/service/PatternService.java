package jsf.service;

import jsf.domain.Pattern;

import java.util.List;

/**
 * Created by marij on 9/24/2016.
 */
public interface PatternService {
    public List<Pattern> getAll();
    public void AddPattern(Pattern pattern);
    public void deletePattern(Pattern pattern);
}
