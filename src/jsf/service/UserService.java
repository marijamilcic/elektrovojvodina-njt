package jsf.service;

import jsf.domain.User;

/**
 * Created by marij on 9/24/2016.
 */
public interface UserService {
    public User getUser(String username, int pass);
}
