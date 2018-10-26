package com.Rohit.app;
import java.util.Scanner;


public class ScannerDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        System.out.println("Enter your Name");
        String name = scanner.nextLine();

        System.out.println("Enter your Age");
        int age = scanner.nextInt();

        System.out.println("Hello "+name+" you are "+age);

    }
}
