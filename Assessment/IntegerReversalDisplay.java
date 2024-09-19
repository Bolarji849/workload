import java.util.Scanner;
public class IntegerReversalDisplay{
	public static void main(String[] args){
	Scanner scan = new Scanner(System.in);
	
	System.out.print("Enter the number" );
	int number = scan.nextInt();
	 patternDisplay(number);
	



	}









public static void patternDisplay(int number){

int reverse = 0;

while (number != 0){
	
reverse = reverse * 10 + number % 10;
number = number/ 10;


}
 System.out.print(reverse);



}
}