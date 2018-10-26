package com.Rohit.logic;

public interface Flyable {
    int speed =100; // variable final and Static and public

     void fly(); // abstract and Public method

    default void fly1(){
        System.out.println("default fly");

    }
        // interface CAN have static method

    public static void navigate(){
        System.out.println("Static Method");
    }
}
