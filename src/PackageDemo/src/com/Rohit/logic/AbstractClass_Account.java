package com.Rohit.logic;

public abstract class AbstractClass_Account {
    protected int accountNo;
    private String accountHolder;
    protected double balance;

    AbstractClass_Account(int accountNo, String accountHolder, double balance){
        this.accountNo = accountNo;
        this.accountHolder = accountHolder;
        this.balance = balance;

    }
    public double getBalance() {
        return balance;
    }

    public int getAccountNo() {
        return accountNo;
    }

    public String getAccountHolder() {
        return accountHolder;
    }
}


