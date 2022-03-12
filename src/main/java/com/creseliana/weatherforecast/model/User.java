package com.creseliana.weatherforecast.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * @author Valeria Sterzhanova
 */
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class User {

    private String username;

    private String password;

    private Role role;
}
