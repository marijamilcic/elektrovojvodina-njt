package jsf.dao.impl;

import jsf.dao.RoleDao;
import jsf.domain.Role;
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
public class RoleDaoImpl implements RoleDao{
    @Autowired
    private SessionFactory sessionFactory;

    @Override
    public void add(Role role) {
        sessionFactory.getCurrentSession().persist(role);
    }

    @Override
    public List<Role> findAll() {
        return (List<Role>)sessionFactory.getCurrentSession().createQuery("from  jsf.domain.Role ");
    }
}
