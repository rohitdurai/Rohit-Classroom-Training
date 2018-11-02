package com.rohit;

public class Account{
    String accountNo;
    String accountType;
    String accHolderName;
    String branchName;
    double currentBalance;

    public Account(String accountNo, String accountType, String accHolderName, String branchName, double currentBalance) {
        this.accountNo = accountNo;
        this.accountType = accountType;
        this.accHolderName = accHolderName;
        this.branchName = branchName;
        this.currentBalance = currentBalance;
    }

    public String getAccountNo() {
        return accountNo;
    }

    public String getAccountType() {
        return accountType;
    }

    public String getAccHolderName() {
        return accHolderName;
    }

    public String getBranchName() {
        return branchName;
    }

    public double getCurrentBalance() {
        return currentBalance;
    }

    public void setAccountNo(String accountNo) {
        this.accountNo = accountNo;
    }

    public void setAccountType(String accountType) {
        this.accountType = accountType;
    }

    public void setAccHolderName(String accHolderName) {
        this.accHolderName = accHolderName;
    }

    public void setBranchName(String branchName) {
        this.branchName = branchName;
    }

    public void setCurrentBalance(double currentBalance) {
        this.currentBalance = currentBalance;
    }

    @Override
    public String toString() {
        return "Account{" +
                "accountNo='" + accountNo + '\'' +
                ", accountType='" + accountType + '\'' +
                ", accHolderName='" + accHolderName + '\'' +
                ", branchName='" + branchName + '\'' +
                ", currentBalance=" + currentBalance +
                '}';
    }

}
