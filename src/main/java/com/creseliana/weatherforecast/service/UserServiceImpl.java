package com.creseliana.weatherforecast.service;

import com.creseliana.weatherforecast.model.User;
import com.creseliana.weatherforecast.util.UserCreator;
import java.util.List;

/**
 * @author Valeria Sterzhanova
 */
public class UserServiceImpl implements UserService {

    private final List<User> userList;

    public UserServiceImpl() {
        this.userList = new UserCreator().getUserList();
    }

    @Override
    public User getUser(String username, String password) {
        return userList.stream()
            .filter(user -> user.getUsername().equals(username)
                && user.getPassword().equals(password))
            .findFirst()
            .orElse(null);
    }

    @Override
    public boolean userExistsByUsername(String username) {
        return userList.stream()
            .map(user -> user.getUsername().equals(username))
            .findFirst().orElse(false);
    }

    @Override
    public List<User> getAll() {
        return userList;
    }
}
