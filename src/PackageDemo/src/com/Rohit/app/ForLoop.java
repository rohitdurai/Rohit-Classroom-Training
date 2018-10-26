package com.Rohit.app;

public class ForLoop {
    public static void main(String[] args) {
        int nums[] = {10,20,33,23,56};

        for (int i=0; i<nums.length; i++){
            System.out.println("Num :"+ nums[i]);

        }
            System.out.println("Enhanced FOR / For EACH");

        // Get one value of INT from array "nums"
        // Loop terminates after LAST element
        for (int x : nums){
            System.out.println("Num :"+x);
        }
    }
}
