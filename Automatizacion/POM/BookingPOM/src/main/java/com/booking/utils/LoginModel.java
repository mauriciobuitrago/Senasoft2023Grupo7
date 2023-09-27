package com.booking.utils;

public class LoginModel {
    //login model data
    private String email;
    private String password;
    //constructor
    public LoginModel(String email, String password) {
        this.email = email;
        this.password = password;
    }

    //setters y getters
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
