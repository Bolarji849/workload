import java.util.Scanner;
public class palindromeTest{

	public static void main(String[] multuplication){
	Scanner inputCollection = new Scanner(System.in);
	System.out.print("Enter number to check if a palindrome");
	int number = inputCollection.nextInt();

	int firstNumber = number / 10000;
	int LastNumber = number % 10;
	int fourthNumber = number / 10;
	int finalFourthNumber = fourthNumber % 10;
	int ThirdNumber = fourthNumber / 10;
	int finalThirdNumber = ThirdNumber % 10;
	int secondNumber = ThirdNumber / 10;
	int finalSecondNumber = secondNumber % 10;


	if(firstNumber==LastNumber){
		System.out.print("It is a palindrome");

	}
	else{
		System.out.print("It is not a palindrome");

	}
	
}
	
}




