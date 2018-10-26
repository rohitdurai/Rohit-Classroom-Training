package com.rohit;

import java.util.ArrayList;

public class UserValidate implements UserInterface {

    static ArrayList<User_Data> userlst;

    Void Add(User_Data user) {

        userlst.add(user);
    }

    public String validateUserid(User_Data uvd) throws Exception {
        String uFlag = "True";
        String rruser = uvd.getUserid();

        try {
            if ((rruser.length() < Min_Username) || (rruser.length() > Max_Username)) {
                uFlag = "False";
                throw new IllegalCredentialsException();
            }
            if (rruser.isEmpty()) {
                uFlag = "False";
                throw new IllegalCredentialsException();
            }


        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        return (uFlag);
    }
}
