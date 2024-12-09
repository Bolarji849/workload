package TestFiles;

import BANK.Account;
import BANK.Bank;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class BankTest {
    @Test
    public void openAccount_findAccountByAccountNumberReturnsCreatedAccountTest() {
        Bank gtbBank = new Bank();
        Account account = gtbBank.createAccount("john", "loops", "correct pincode");
        System.out.println(account);
        int expected = 1;
        assertEquals(expected, gtbBank.getNumberOfaccount());


    }

    @Test
    public void Account_can_depsoit() {
        Bank gtbBank = new Bank();
        Account account = gtbBank.createAccount("john", "loops", "correct pincode");
        gtbBank.deposit("1", 200);
        double expected = 200;
        assertEquals(expected, account.getBalance());

    }

    @Test
    public void Account_can_withdraw() {
        Bank gtbBank = new Bank();
        Account account = gtbBank.createAccount("zebel", "chris", "correct pincode");
        gtbBank.deposit("1", 200);
        gtbBank.withdraw("1", 100, "correct pincode");
        double expected = 100;
        assertEquals(expected, account.getBalance());

    }

    @Test
    public void Account_can_Transfer() {
        Bank gtbBank = new Bank();
        Account SenderAccount = gtbBank.createAccount("Ray", "Brown", "correct pincode");
        SenderAccount.deposit(400);
        Account recipientAccount = gtbBank.createAccount("wayne", "james", "correct pincode");
        assertEquals(0, recipientAccount.getBalance());
        gtbBank.transfer("1", "2", 200, "correct pincode");
        assertEquals(200, recipientAccount.getBalance());

    }

    @Test
    public void test_you_cannot_withdraw_negative_amount() {
        Bank gtbBank = new Bank();
        Account account = gtbBank.createAccount("campbell", "white", "correct pincode");
        assertEquals(0, account.getBalance());
        assertThrows(IllegalArgumentException.class, () -> account.withdraw(-100, "correct pincode"));


    }

    @Test
    public void test_you_cannot_deposit_negative_amount() {
        Bank gtbBank = new Bank();
        Account account = gtbBank.createAccount("campbell", "white", "correct pincode");
        assertEquals(0, account.getBalance());
        assertThrows(IllegalArgumentException.class, () -> account.deposit(-100));
    }

}