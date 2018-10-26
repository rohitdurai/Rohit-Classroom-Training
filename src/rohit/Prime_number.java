package com.rohit;

public class Prime_number {

    public static void main(String[] args) {

        int num = 13;
        boolean isPrime = true;


        for (int i=2; i< num/2; i++)
            if (num%i==0) {
                isPrime = false;
                break;
            }



        if(isPrime)
    {
        System.out.println(num + "is prime!");
    }
        else
    {
        System.out.println(num + "is NOT prime!");
    }

}}
