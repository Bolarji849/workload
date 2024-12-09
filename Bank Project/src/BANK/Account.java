package BANK;

import java.lang.IllegalArgumentException;


public class Account {
    private String number;
    private String pinCode;
    private double balance;

    private String name;

    public Account(String pinCode,String number,String name) {
        this.balance = 0;
        this.pinCode = pinCode;
        this.number = number;
        this.name = name;

    }


    public String updatedPin(String formerPin, String newPin) {
        this.pinCode = formerPin;
        if(formerPin.equals(newPin)){
            throw new IllegalArgumentException("Invalid pin entered.");
        } else {
            return "Pin Changed.";
        }
    }
    public void validatePin(String pin){
        if (!this.pinCode.equals(pin)) {
            throw new IllegalArgumentException("Invalid pin entered.");
        }
    }

    public String getPin(String pincode) {
        return this.pinCode;
    }

    public void deposit(double amount ) {
        validateNegativeAmount( amount);
       this.balance += amount;
    }

    public double getBalance(){
        return this.balance;
    }

    public void withdraw(int amount,String pin) {
        if(amount > balance)throw  new IllegalArgumentException("Insufficient Balance");
        validatePin(pin);
        validateNegativeAmount(amount);
        this.balance -= amount;
    }
    public void validateNegativeAmount(double amount){
        if( amount < 0){
            throw new IllegalArgumentException("Enter a valid amount");
        }

    }

    public  String getNumber() {
        return number;
    }
}
