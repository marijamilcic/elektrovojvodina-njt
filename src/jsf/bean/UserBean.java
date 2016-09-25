package jsf.bean;

import jsf.domain.User;
import jsf.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.jws.soap.SOAPBinding;
import java.util.List;

/**
 * Created by marij on 9/24/2016.
 */

@ManagedBean(name="userBean")
@Scope
@Component
public class UserBean {

    @Autowired
    private UserService userService;

    private User user;
    public List<User> users;
    public UserBean() {
        user = new User();
    }

    public UserService getUserService() {
        return userService;
    }

    public void setUserService(UserService userService) {
        this.userService = userService;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public User getUserByUsernameAndPass(String name, int password){
        return userService.getUser(name, password);

    }
}
