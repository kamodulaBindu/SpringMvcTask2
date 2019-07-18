package com.stackroute;

public class User {

    private String UserName;

    public String getUserName() {
        return UserName;
    }

    public void setUserName(String userName) {
        UserName = userName;
    }

    @Override
    public String toString() {
        return "User{" +
                "UserName='" + UserName + '\'' +
                '}';
    }
}


