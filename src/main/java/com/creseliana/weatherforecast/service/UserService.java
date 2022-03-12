package com.creseliana.weatherforecast.service;

import com.creseliana.weatherforecast.model.User;
import java.util.List;

/**
 * @author Valeria Sterzhanova
 */
public interface UserService {

    User getUser(String username, String password);

    boolean userExistsByUsername(String username);

    List<User> getAll();
}
