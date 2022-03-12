package com.creseliana.weatherforecast.util;

import com.creseliana.weatherforecast.model.Role;
import com.creseliana.weatherforecast.model.User;
import java.util.ArrayList;
import java.util.List;
import lombok.Getter;

/**
 * @author Valeria Sterzhanova
 */
public class UserCreator {

    @Getter
    private final List<User> userList;

    public UserCreator() {
        User user1 = new User("pigwidgeon", "123", Role.USER);
        User user2 = new User("wattlebird", "123", Role.USER);
        User user3 = new User("hogwarts", "123", Role.USER);
        User user4 = new User("spinnet", "123", Role.USER);
        User admin1 = new User("keeper", "123", Role.ADMIN);
        User admin2 = new User("firebolt", "123", Role.ADMIN);

        userList = new ArrayList<>(List.of(user1, user2, user3, user4, admin1, admin2));
    }
}
