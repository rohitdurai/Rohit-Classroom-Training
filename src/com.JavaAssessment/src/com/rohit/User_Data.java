package com.rohit;


public class User_Data {

    public String username;
    public String password;


    User_Data (String username, String password){
        this.username = username;
        this.password = password;
    }
    @Override
    public String toString(){
        return "userDetails{" +
                "userId = " +username + '\'' +
                ", password = " +password + '\'' +
                ')';
    }
    public String getPassword(){
        return password;

    }

    public void setPassword(){
        this.password = password;
    }

    public String getUserid(){
        return username;
    }
}

