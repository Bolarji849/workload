import java.util.Scanner;
public class PalindromeInMethods{
	public static void main(String[] args){
	Scanner scan = new Scanner(System.in);
	
	System.out.print("Enter the number  " );
	int number = scan.nextInt();
	int reversedNumber = reverse(number);
		if(number == reversedNumber){
		System.out.println("it's a palindrome");
		}else{
		    System.out.println("it's not a palindrome");
		 }

	

	
	}
	
	public static int reverse(int number){
	
	int userInputedNumber = number ;
	int reverse = 0;

	while (number != 0 ){
	reverse = reverse * 10 + number % 10;
	number = number / 10;
	}
	
	return reverse;

	}
	
	
	
	
}