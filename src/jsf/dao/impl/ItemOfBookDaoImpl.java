package jsf.dao.impl;

import jsf.dao.ItemOfBookDao;
import jsf.domain.ItemOfBook;
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
public class ItemOfBookDaoImpl implements ItemOfBookDao {

    @Autowired
    private SessionFactory sessionFactory;

    @Override
    public List<ItemOfBook> getAll() {
        return (List<ItemOfBook>) sessionFactory.getCurrentSession().createQuery("from jsf.domain.ItemOfBook");
    }

    @Override
    public void AddItem(ItemOfBook itemOfBook) {
        sessionFactory.getCurrentSession().persist(itemOfBook);
    }

    @Override
    public void deleteItem(ItemOfBook itemOfBook) {
        sessionFactory.getCurrentSession().delete(itemOfBook);
    }
}
