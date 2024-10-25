import java.util.Scanner;

public class BankDriver{
	private static Scanner scanner = new Scanner(System.in);
	private static Bank bank1 = new Bank();

	public static void main(String[] args){	
		mainMenu();
		
	}

	public static void mainMenu(){
		System.out.println("======================================");
		System.out.println("WELCOME TO SEMICOLON BANK");	
		System.out.println("1. Create Account");
		System.out.println("2. Close Account");
		System.out.println("3. Deposit money");
		System.out.println("0. Exit");
		String response = scanner.nextLine();

		if (response.equals("1")){	
			createAccount();
		}
		
		if (response.equals("0")){
			System.out.println("Goodbye.....");
			System.exit(-1);

		}
		
		System.out.println("======================================");
	}	

	public static void createAccount(){
	    try{
		System.out.println("Enter firstName: ");
		String firstName = scanner.nextLine();
		System.out.println("Enter lastName: ");
		String lastName = scanner.nextLine();
		System.out.println("Enter pin");
		String pin = scanner.nextLine();
		
		String response = bank1.createAccount(firstName, lastName, pin);
		System.out.println(response);
	    } catch(Exception e){
		System.out.print(e);
	    } finally{
		mainMenu();
	    }
	}

}