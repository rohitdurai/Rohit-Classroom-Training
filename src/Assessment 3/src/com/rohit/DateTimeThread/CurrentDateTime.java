package com.rohit.DateTimeThread;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class CurrentDateTime implements Runnable {

    /*public void displayDateTime(String display){
        if(display.equalsIgnoreCase("date")){
        }
    }
    */

    public void delay() {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException ie) {
            ie.printStackTrace();
        }
    }
        @Override
            public void run(){
                while (Thread.currentThread().isAlive()){
                    DateFormat df2 = new SimpleDateFormat("dd/MM/yy HH:mm:ss");
                    Date dateobj2 = new Date();
                    System.out.println(df2.format(dateobj2));
                    delay();
                }


            }
        }




