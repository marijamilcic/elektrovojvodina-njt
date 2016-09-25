package jsf.service.impl;

import jsf.dao.RoleDao;
import jsf.domain.Role;
import jsf.model.Student;
import jsf.service.RoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by marij on 9/24/2016.
 */
@Service
@Repository
public class RoleServiceImpl implements RoleService{
    @Autowired
    private RoleDao roleDao;

    @Override
    public void add(Role role) {
        roleDao.add(role);
    }

    @Override
    public List<Role> getAll() {
        return roleDao.findAll();
    }
}
