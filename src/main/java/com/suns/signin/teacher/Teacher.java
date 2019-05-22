package com.suns.signin.teacher;

/**
 * Created by sunshuai on 2019/5/22
 */
public class Teacher {
    private String username;
    private String password;

    public Teacher() {
    }

    public Teacher(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
