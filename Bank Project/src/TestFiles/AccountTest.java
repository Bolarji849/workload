package TestFiles;

import BANK.Account;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class AccountTest {

    @Test
    public void test_account_can_deposit() {
        Account bolarji = new Account( "correct pincode", "00745501","Adewale");
        bolarji.deposit(10000);
        assertEquals(10000, bolarji.getBalance());
    }
    @Test
    public void test_account_can_withdraw() {
        Account bolarji = new Account( "correct pincode", "00745501","john");
        bolarji.deposit(10000);
        assertEquals(10000, bolarji.getBalance());
        bolarji.withdraw(5000,"correct pincode");
        assertEquals(5000, bolarji.getBalance());
    }
    @Test
    public void test_account_for_neative_deposit() {
        Account bolarji = new Account( "correct pincode", "00745501","femi");

        assertThrows( IllegalArgumentException.class, ()-> bolarji.deposit(-10000));
    }
    @Test
    public void test_account_for_neative_withdrawal() {
        Account bolarji = new Account( "correct pincode", "00745501","sk");

        assertThrows( IllegalArgumentException.class, ()-> bolarji.withdraw(-10000,"correct pincode"));
    }
}
