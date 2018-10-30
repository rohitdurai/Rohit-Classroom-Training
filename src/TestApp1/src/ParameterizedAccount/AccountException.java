package ParameterizedAccount;

public class AccountException extends RuntimeException {
    public AccountException(int accountNo) {
        super("No Sufficient Fund Exception"+accountNo);
    }
}
