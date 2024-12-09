package BANK;

import java.util.HashMap;
import java.util.Map;

public class BankList {

    static Map<String,Bank> banks = new HashMap<>();
    private static int numberOfBanks;


    public static Bank addBank(String bankName){
        Bank bank = new Bank();
        banks.put(bankName,bank);
        numberOfBanks++;
        return bank;

    }
    public int getNumberOfBanks(){
        return numberOfBanks;
    }
    public static Bank findBankName(String bankName){
        for(Bank bank : banks.values()) {
            if (bank.getBankName().equals(bankName)) return bank;
            }

        return null;
    }
}

