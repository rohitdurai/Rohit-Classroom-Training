package com.Rohit.logic;

public class MethodOverloadMain {
    public static void main(String[] args) {
        int aa = MethodOverload.methodA(4,10);
        int bb = MethodOverload.methodA(4,5,5);

        System.out.println(aa);
        System.out.println(bb);
    }
}
