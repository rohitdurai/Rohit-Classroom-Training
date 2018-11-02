package com.rohit;

public class Main {

    public static void main(String[] args) {
	// write your code here
        byte byteVar = 16;
        // example of Widening / Implicit conversion

        int intVar = byteVar;

        float floatVar = intVar;

        long longVar = intVar;

        floatVar = longVar;

        double doubleVar = floatVar;

        char charVal = '\u0041';

        intVar = charVal;

        System.out.println("Char in INT:"+ intVar);

        int n = 22/7;
        System.out.println("n = "+n); // Loss of Precision

        float f = 22/7;
        System.out.println("n = "+f); // still Loss of Precision

        float x = (float) 22/7;
        System.out.println("n = "+x); // No loss of Precision

        double y = 22/7.0;
        System.out.println("n = "+y);

        int k = 144;
        int m = k<<2;
        System.out.println(m);

        k=10;
        System.out.println(k++);

        System.out.println(++k);


    }
}
