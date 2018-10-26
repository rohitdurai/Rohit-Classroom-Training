package com.rohit;

// Question No 3

public class User extends User_Data {
    String username;
    String password;
    String role;
    boolean active;

    User(String username, String password, String role, boolean active){
    super(username, password);
    this.active = active;
    this.role = role;

    }
}
