package Account;

import java.util.*;

public class AccountService {

    private Map<Integer,Account> accounts = new HashMap<Integer,Account>();

    public AccountService(){

    }
    public void setData(Map<Integer, Account> accounts){
        this.accounts = accounts;
    }


    public Account findAccount(int accountNo){
        if(accounts.containsKey(accountNo)){
            return accounts.get(accountNo);
        }
        else throw new RuntimeException("Account No "+accountNo+" does not exists!");
    }

    public void withdraw(int accountNo, double amount)throws AccountException{
        Account acc = accounts.get(accountNo);
        if(acc.getAmount()<amount)
            //System.out.println("Withdrawal failed");
            throw new AccountException(accountNo);
        else
            acc.setAmount( acc.getAmount()-amount );
    }

    public void deposit (int accountNo, double amount){
        Account account = findAccount(accountNo);
        account.setAmount(account.getAmount()+amount);
    }
}
