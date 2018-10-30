package ParameterizedAccount;
import Account.AccountServiceTest;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

@RunWith(Suite.class)
@Suite.SuiteClasses({AccountServiceTest.class,AccountParameterizedTest.class })
public class MySuite {

    // Do not define any test cases here
}
