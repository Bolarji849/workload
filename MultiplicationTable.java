import java.util.Scanner;

public class MultiplicationTable{

	public static void main(String[] multuplication){
		
	Scanner scanner = new Scanner(System.in);

	System.out.println("Enter a number: ");
	int userInput = scanner.nextInt();
	
	int digit = 1;
	int count = 1;

	while (digit <= 10){

		count  = userInput * digit;
		System.out.printf("%d %c %d %c %d %n", userInput, '*' , digit , '=', count);
			digit++;
	}

	}


}