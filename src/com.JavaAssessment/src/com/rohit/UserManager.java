package com.rohit;

// Question No 4

import java.util.ArrayList;
import java.util.List;

public class UserManager extends User {

    String usernameF;
    String passwordF;
    String roleF;
    boolean activeF;

    UserManager(String usernameF, String passwordF, String roleF, boolean activeF) {
        super(usernameF, passwordF, roleF, activeF);

    }

    static ArrayList<User_Data> userlist;

    public void add(UserManager usr) {
        userlist.add(usr);

    }

    public List<User_Data> findByName(String uname) {
        List<User_Data> temp = null;

        if (!userlist.isEmpty()) {
            temp = new ArrayList<>();
            for (User_Data b : userlist) {
                if (b.getUserid().toLowerCase().contains(uname.toLowerCase())) {
                    temp.add(b);
                }

            }
        } else {
            System.out.println("No records found");
        }
        return temp;
    }


    public void ListAll() {
        try {
            for (User_Data e : userlist) {
                System.out.println(e);
            }
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }

    }
}

