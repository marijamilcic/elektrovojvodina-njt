package jsf.service.impl;

import jsf.dao.PatternDao;
import jsf.domain.Pattern;
import jsf.service.PatternService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by marij on 9/24/2016.
 */

@Service
@Repository
public class PatternServiceImpl implements PatternService {

    @Autowired
    private PatternDao patternDao;

    @Override
    public List<Pattern> getAll() {
        return patternDao.getAll();
    }

    @Override
    public void AddPattern(Pattern pattern) {
        patternDao.AddPattern(pattern);
    }

    @Override
    public void deletePattern(Pattern pattern) {
        patternDao.deletePattern(pattern);
    }
}
