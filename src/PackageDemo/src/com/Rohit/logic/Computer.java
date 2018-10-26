package com.Rohit.logic;

public class Computer {
    // Non Accessible to outsider
    private Storage storage;
    private Display display;

    // Accessible to Outsiders
    public Computer(Storage storage, Display display){
        this.storage = storage;
        this.display = display;
    }

}
