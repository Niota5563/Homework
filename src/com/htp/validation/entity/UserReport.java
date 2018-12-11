package com.htp.validation.entity;

public class UserReport {

    private User user;

    public UserReport(User user) {
        this.user = user;
    }

    public boolean isUserValid() {
        return user.getName().contains("#");
    }
}
