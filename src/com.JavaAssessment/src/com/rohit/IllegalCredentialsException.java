package com.rohit;


// Question No 1

public class IllegalCredentialsException extends Exception{
    public static final String Min_Username = "6";
    public static final String Max_Username = "12";

    IllegalCredentialsException (){

        super ("IllegalCredentialsException: Issue with Username/Password");

    }
}
