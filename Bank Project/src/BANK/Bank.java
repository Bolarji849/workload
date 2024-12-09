package BANK;


import java.util.ArrayList;

public class Bank {
    private ArrayList<Account> accounts = new ArrayList<>();
    private  int numberOfaccount;
    private  String accountName;
    private  static String bankName;




    public String generateAccountNumber() {

        return Integer.toString(numberOfaccount);

    }

    public Account createAccount(String firstname,String lastname,String pinCode){
        numberOfaccount++;
        String accountNumber = generateAccountNumber();
        String accountName =firstname +" "+ lastname;
        Account account = new Account(pinCode, accountNumber, accountName);
        accounts.add(account);
        return account;
    }

    public int getNumberOfaccount() {
        return numberOfaccount;
    }

    public Account findAccount(String accountNumber){
      for(Account account : accounts){
          if(account.getNumber().equals(accountNumber)) return account;
      };
      return null;
    }

    public void deposit(String number, int amount) {
       Account account = findAccount(number);
       account.deposit(amount);


    }

    public void withdraw(String number, int amount,String pin) {
        findAccount(number).withdraw(amount,pin);

    }

    public void transfer(String sender, String  recipent, int amount , String pincode) {
        Account senderAccount = findAccount(sender);
        Account recipentAccount = findAccount(recipent);
        senderAccount.withdraw(amount,pincode);
        recipentAccount.deposit(amount);



    }

    public static String getBankName() { return bankName;
    }
}
