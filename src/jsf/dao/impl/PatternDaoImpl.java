package jsf.dao.impl;

import jdk.nashorn.internal.ir.annotations.Reference;
import jsf.dao.PatternDao;
import jsf.domain.Pattern;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by marij on 9/24/2016.
 */

@Transactional
@Repository
public class PatternDaoImpl implements PatternDao {

    @Autowired
    private SessionFactory sessionFactory;

    @Override
    public List<Pattern> getAll() {
        return (List<Pattern>) sessionFactory.getCurrentSession().createQuery("from jsf.domain.Pattern");
    }

    @Override
    public void AddPattern(Pattern pattern) {
        sessionFactory.getCurrentSession().persist(pattern);
    }

    @Override
    public void deletePattern(Pattern pattern) {
        sessionFactory.getCurrentSession().delete(pattern);
    }
}
