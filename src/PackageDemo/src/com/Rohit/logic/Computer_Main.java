package com.Rohit.logic;


public class Computer_Main {
    public static void main(String[] args) {
        // Type of variable could be Class, Interface or Primitive
        // Variable of BASE type can old Object of Derived type
        
        Display hd = new Monitor();
        Storage mt = new HardDisk();
        Computer comp = new Computer(hd,mt);

        // invoke Constructor
        //Computer (hd, mt)
        //display = hd, disk = mt
    }
}
