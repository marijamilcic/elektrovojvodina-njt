package jsf.dao;

import jsf.domain.User;

/**
 * Created by marij on 9/24/2016.
 */
public interface UserDao {
    public User getUser(String username, int pass);
}
