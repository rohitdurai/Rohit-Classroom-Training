package com.rohit;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        UserManager um1 = new UserManager("Ashish", "pass@12245", "Admin", true );
         um1 = new UserManager("Anish", "My$pass123", "User", true );
         um1 = new UserManager("Alok", "$$xyz$$12345", "User", true );
         um1 = new UserManager("Aditi", "Opps_forgot_1", "Userge:", true );

        UserValidate uvd = new UserValidate();

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Input through keyboard");
        System.out.println("Enter 1: to Login");
        System.out.println("Enter 2 : to print User details");
        System.out.println("Enter 3 : to Exit");

        String inp = sc.nextLine().trim();

        System.out.println("Enter Username: ");

        String rusername = sc.nextLine().trim();
        System.out.println("Enter Password");

        String rpwd = sc.nextLine().trim();

        User_Data ud = uvd.validateUserid();

        if ((rusername.contains("True") && rpwd.contains("True"))){
            System.out.println("Login Successful");
        }

    }
}
