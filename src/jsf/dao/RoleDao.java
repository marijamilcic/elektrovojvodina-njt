package jsf.dao;

import jsf.domain.Role;

import java.util.List;

/**
 * Created by marij on 9/24/2016.
 */
public interface RoleDao {
    public void add(Role role);
    public List<Role> findAll();
}
