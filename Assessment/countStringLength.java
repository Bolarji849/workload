import java.util.Scanner;
public class countStringLength {
	public static void main(String[] args){
	Scanner scan = new Scanner(System.in);
	

	System.out.print("Enter a string    ");
	String userInput = scan.nextLine();

	int length = userInput.length();



	System.out.println("The length of the string is: " + length);



}


	public static int countStringLength(String input){
	
	return input.length();
	}

}