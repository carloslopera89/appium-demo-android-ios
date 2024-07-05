package com.co.demomobile.lineabase.models;


import com.co.demomobile.lineabase.models.builder.UserBuilder;

public class User {

    private final String username;
    private final String password;

    public User(UserBuilder builder) {
        this.username = builder.getUsername();
        this.password = builder.getPassword();
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }
}
