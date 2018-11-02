package com.rohit.DateTimeThread;

public class CurrentDateTimeMain {
    public static void main(String[] args) {
        Thread t1 = new Thread(new CurrentDateTime());
        t1.start();
    }





}
