package com.Rohit.app;

public class StringMain {
    public static void main(String[] args) {
        String name1 = "Rohit"; //Creates a new object as no previous object found
        String name2 = "Rohit"; // Re-uses previous object

        String name3 = new String("Rohit"); // forces new object

        System.out.println("Is name1 and name2 same? "+(name1==name2));

        System.out.println("Is name1 and name3 same? "+(name1==name3));

        name1 = name1.toUpperCase();
        System.out.println("Is name1 and name2 same? "+(name1==name2));


        String temp = name2.toUpperCase();
        System.out.println(name2+" "+temp);


        //System.out.println("Hashcode for name1 "+name1.hashCode());

        //System.out.println("Hashcode for name1 "+name2.hashCode());

        //System.out.println("Hashcode for name1 "+name3.hashCode());
    }
}


