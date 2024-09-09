// AccountTest.java
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class AccountTest {
    private Account account;

    @BeforeEach
    public void setUp() {
        account = new Account();
    }

    @Test
    public void testInitialBalance() {
        assertEquals(0.0, account.getBalance(), 0.001);
    }

    @Test
    public void testDeposit() {
        account.deposit(100.0);
        assertEquals(100.0, account.getBalance(), 0.001);

        account.deposit(50.0);
        assertEquals(150.0, account.getBalance(), 0.001);
    }

    @Test
    public void testWithdraw() {
        account.deposit(100.0);

        double amountWithdrawn = account.withdraw(50.0);
        assertEquals(50.0, amountWithdrawn, 0.001);
        assertEquals(50.0, account.getBalance(), 0.001);

        amountWithdrawn = account.withdraw(60.0);
        assertEquals(0.0, amountWithdrawn, 0.001);
        assertEquals(50.0, account.getBalance(), 0.001);
    }

    @Test
    public void testNegativeDepositWithdraw() {
        account.deposit(-50.0);
        assertEquals(0.0, account.getBalance(), 0.001);

        account.deposit(100.0);
        assertEquals(100.0, account.getBalance(), 0.001);

        double amountWithdrawn = account.withdraw(-30.0);
        assertEquals(0.0, amountWithdrawn, 0.001);
        assertEquals(100.0, account.getBalance(), 0.001);
    }
}
