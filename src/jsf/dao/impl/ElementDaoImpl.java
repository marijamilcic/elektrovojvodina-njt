package jsf.dao.impl;

import jsf.dao.ElementDao;
import jsf.domain.Element;
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
public class ElementDaoImpl implements ElementDao {

    @Autowired
    private SessionFactory sessionFactory;


    @Override
    public void add(Element element) {
        sessionFactory.getCurrentSession().persist(element);
    }

    @Override
    public List<Element> findAll() {
        return (List<Element>) sessionFactory.getCurrentSession().createQuery("from jsf.domain.Element");
    }
}
