package com.co.demomobile.lineabase.models.builder;


import com.co.demomobile.lineabase.models.User;
import com.co.demomobile.lineabase.utils.Builder;

public class UserBuilder implements Builder<User> {

    private String username;
    private String password;

    public UserBuilder(String username) {
        this.username = username;
    }

    public static UserBuilder user(String username){
        return new UserBuilder(username);
    }

    public User withPassword(String password) {
        this.password = password;
        return build();
    }

    @Override
    public User build() {
        return new User(this);
    }

    public String getPassword() {
        return password;
    }

    public String getUsername() {
        return username;
    }

}
