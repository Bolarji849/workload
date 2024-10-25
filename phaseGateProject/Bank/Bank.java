import java.util.ArrayList;

public class Bank{
	private static String name;
	private ArrayList<Account> accounts = new ArrayList<>();
	
	public String createAccount(String firstName, String lastName, String pin){
		Account newAccount = new Account();
		newAccount.setFirstName(firstName);
		newAccount.setLastName(lastName);
		newAccount.setPin(pin);	
		accounts.add(newAccount);
	
		return "Account created successfully";
	}

}