package com.Rohit.app;

import com.Rohit.logic.Account;

public class ObjectDemo {
    public static void main(String[] args) {
        Account a1 = new Account ();
        Account a2 = new Account ();
        Account a3 = a1;

        System.out.println("Hashcode for a1: "+a1.hashCode());

        System.out.println("Hashcode for a1: "+a2.hashCode());

        System.out.println("Hashcode for a1: "+a3.hashCode());

        System.out.println("toString for a1: "+a1.toString());

        System.out.println("getClass for a1: "+a2.getClass());

        System.out.println("toString for a1: "+a3.toString());


    }
}
