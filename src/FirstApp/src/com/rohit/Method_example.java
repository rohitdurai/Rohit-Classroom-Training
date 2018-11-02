package com.rohit;

public class Method_example {

    public static void main(String[] args) {
        System.out.println("1st line in MAIN");
        drawline(); // Method Invocation
        System.out.println("\n 2nd line is MAIN");

    }

    static void drawline()
    {
            for (int i=0;i< 100; i++)
            {
                System.out.print("-");
            }
    }
    static void drawline(int width)
        {
            for (int i=0;i< width; i++)
            {
                System.out.print("-");
            }
        }
}


