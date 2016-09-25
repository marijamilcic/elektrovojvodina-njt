package jsf.service.impl;

import jsf.dao.UserDao;
import jsf.domain.User;
import jsf.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

/**
 * Created by marij on 9/24/2016.
 */

@Service
@Repository
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDao userDao;

    @Override
    public User getUser(String username, int pass) {
        return userDao.getUser(username,pass);
    }
}
