package com.Rohit.logic;

public class Airplane implements Flyable {

    public void fly(){
        System.out.println("Airplane Fly");
    }

    public static void main(String[] args) {
        Airplane plane = new Airplane();
        plane.fly();
        Flyable.navigate();


    }
}
