package jsf.bean;

import jsf.domain.User;
import jsf.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.context.FacesContext;
import javax.jws.soap.SOAPBinding;
import java.util.List;

/**
 * Created by marij on 9/24/2016.
 */

@ManagedBean(name="userBean")
@RequestScoped
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
        FacesContext facesContext = FacesContext.getCurrentInstance();

        if(userService.getUser(name,password) == null || userService.getUser(name,password).equals("") ){
            facesContext.addMessage(null, new FacesMessage("Warning!","Please login!"));
             return null;
        }
       else {
            facesContext.addMessage(null, new FacesMessage("Successful!", "Welcome!"));
            return userService.getUser(name, password);
        }
    }


}
