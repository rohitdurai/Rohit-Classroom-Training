package com.Rohit.app; // Define CURRENT package

// Import Classes from other package

        import com.Rohit.logic.Calculator;

public class Main {
    public static void main(String[] args) {

        Calculator c = new Calculator();
        double k = c.doSum(12.02, 55.5);
        System.out.println("Answer "+k);
    }
}
