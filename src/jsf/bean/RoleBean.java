package jsf.bean;

import jsf.domain.Role;
import jsf.service.RoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.faces.bean.ManagedBean;
import java.util.List;

/**
 * Created by marij on 9/24/2016.
 */
@ManagedBean(name="roleBean")
@Scope
@Component
public class RoleBean {
    @Autowired
    private RoleService roleService;
    private Role role;

    public RoleService getRoleService() {
        return roleService;
    }

    public void setRoleService(RoleService roleService) {
        this.roleService = roleService;
    }

    public Role getRole() {
        return role;
    }

    public void setRole(Role role) {
        this.role = role;
    }

    public RoleBean() {
        role = new Role();
    }
    public void addRole(){
        roleService.add(role);
        role = new Role();
    }

    public List<Role> getRoleList(){
        //return new ArrayList<Student>();
        return roleService.getAll();
    }
}
