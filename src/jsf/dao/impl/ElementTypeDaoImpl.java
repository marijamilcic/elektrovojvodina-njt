package jsf.dao.impl;

import jsf.dao.ElementTypeDao;
import jsf.domain.Element;
import jsf.domain.ElementType;
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
public class ElementTypeDaoImpl implements ElementTypeDao{
    @Autowired
    private SessionFactory sessionFactory;

    @Override
    public void add(ElementType elementType) {
        sessionFactory.getCurrentSession().persist(elementType);
    }

    @Override
    public List<ElementType> findAll() {
        return (List<ElementType>) sessionFactory.getCurrentSession().createQuery("from jsf.domain.ElementType");
    }
}
