import java.util.Scanner;
public class creditlimitCalculator {
	public static void main(String[] args){
	Scanner inputCollection = new Scanner(System.in);



	System.out.print("Enter account number  ");
	String accountNumber = inputCollection.nextLine();
	System.out.print("Enter Beginning balance  ");
	int userInitialBalance = inputCollection.nextInt();
	System.out.print("Enter number item charged  ");
	int chargedAmount = inputCollection.nextInt();
	System.out.print("Enter total of all credits applied to your account this month   ");
	int totalCredit = inputCollection.nextInt();
	System.out.print("Enter credit limit ");
	int creditlimit = inputCollection.nextInt();

	

	
	int newBalance = userInitialBalance + chargedAmount - totalCredit;

	System.out.println("Balance is " +  newBalance);
	
	if(newBalance > creditlimit )
	System.out.print("Credit limit exceeded");








	}
	}