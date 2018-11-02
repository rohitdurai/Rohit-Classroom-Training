package com.rohit;

public class Dog {

    String breed;
    String size;
    int age;
    String color;

    // No Argument constructor (uses same name as Class name)
    public Dog(){
        breed = "indian";
        size = "small";
        age=1;

    }
    //Parametrized Constructor
    public Dog(String breed, String size, int age){
        // use 'this' to distinguish instance variable from local variable
        this.breed = breed;
        this.size = size;
        this.age = age;

    }

    public String dogMethod(){
        return("\nBreed is: " +breed+ "\nSize is: " +size+ "\nAge is: " +age+ "\nColor is: "+color);
    }
}
