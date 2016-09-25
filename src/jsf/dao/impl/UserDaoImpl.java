package jsf.dao.impl;

import jsf.dao.UserDao;
import jsf.domain.User;
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
public class UserDaoImpl implements UserDao {

    @Autowired
    private SessionFactory sessionFactory;

    @Override
    public User getUser(String username, int pass) {

        List<User> lista = (List<User>) sessionFactory.getCurrentSession().createQuery("from jsf.domain.User ").list();
        for (User u : lista){
            if(u.getUser().equals(username) && u.getPass()== pass ){
                System.out.println("User" +u.getIme());
                return u;
            }
        }
        return null;
    }
}
