package com.rohit;

public class Greet {
    public static void main(String[] args) {
        Greet_Class g = new Greet_Class(); // create an instance of main class

        g.Greet("Rohit"); // invoking  greet() method

        g.n =100; // n exist as long as g exist
    } // g is destroyed

}
