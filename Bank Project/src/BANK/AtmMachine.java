package BANK;

import javax.swing.*;
import java.util.Scanner;
import java.util.concurrent.TransferQueue;

public class AtmMachine {
    static Bank gtbBank = new Bank();


    public static void main(String[] args) {
        BankList.addBank("FirstBank");
        BankList.addBank("PolarisBank");
        BankList.addBank("FidelityBank");

        gotoMainMenu();

    }
    public static void gotoMainMenu(){
        String mainMenu= """
        
        1.-> CreateAccount
        2.-> Deposit
        3.-> withdraw
        4.-> Transfer
        5.-> CheckBalance
        6.-> exit
        
           
                       """;

        char userInput = input(mainMenu).charAt(0);
        switch (userInput){
            case '1': createAccount();
            case '2': deposit();
            case '3': withdraw();
            case '4': transfer();
            case '5': checkBalance();
            case '6': interBankTransfer();
            case '7': exit();
        }
    }

    private static void interBankTransfer(){
        String senderAccount = input ("Enter sender account number : ");
        String senderBankName = input ("Enter Sender bank name : ");
       String senderAccountNumber = input ("Enter sender account number: ");
       String receiverBankName = input ("Enter receiver bank name : ");
        String receiverAccountNumber = input("Enter receiver account number: ");
       String pin = input ("Enter Pin: ");
       int amount = Integer.parseInt(input("Enter amount"));
       Bank senderBank = BankList.findBankName( senderBankName);
       Bank recieverBank = BankList.findBankName( receiverBankName);
       Account foundSenderAcoount = senderBank.findAccount(senderAccountNumber);
       Account foundReceiverAccount =  recieverBank.findAccount(receiverAccountNumber);
        foundSenderAcoount.withdraw(amount,pin);
        foundReceiverAccount.deposit(amount);
    }
    private static void exit() {
        display(" THanks for coming:" );
      System.exit(49);
    }

    private static void checkBalance() {
        String accountNumber = input("Enter account Number");
        Account account =  gtbBank.findAccount(accountNumber);
        display(String.format("Balance is %,.2f: ", account.getBalance()));
        gotoMainMenu();

    }

    private static void transfer() {
        String senderAccount = input ("Enter sender account number : ");
        String recipientAccount = input ("Enter recipient account number : ");
        String pin = input ("Enter Pin: ");
        int amount =  Integer.parseInt(input ("Enter Amount :"));
        gtbBank.transfer(senderAccount,recipientAccount,amount,pin);
        display("Transfer successful");
        display(String.format("%,d transferred to %s: ", amount, recipientAccount));


        gotoMainMenu();
    }

    private static void withdraw() {
        String accountNumber = input ("Enter Account Number:");
        int amount =  Integer.parseInt(input ("Enter Amount :"));
        String pin = input ("Enter Pin: ");
        gtbBank.withdraw(accountNumber,amount,pin);

        gotoMainMenu();

    }

    private static void deposit() {
        String accountNumber = input ("Enter Account Number:");
        int amount =  Integer.parseInt(input ("Enter Amount :"));
        gtbBank.deposit(accountNumber,amount);
        gotoMainMenu();
    }

    private static void createAccount() {
        String firstName = input ("Enter First Name:");
        String lastName = input ("Enter Last Name:");
        String pin = input ("Enter Pin: ");
        gtbBank.createAccount(firstName,lastName,pin);

        gotoMainMenu();
    }

    private static String input(String prompt) {
//        Scanner scan = new Scanner(System.in);
//        return scan.nextLine();
        return JOptionPane.showInputDialog(prompt);
    }

    private static void display(String prompt) {
//            System.out.print(prompt);
        JOptionPane.showMessageDialog(null, prompt);


    }


}
