import java.util.Scanner;
public class DecrementalHighestToLowest {


	public static void highestToLowest(int number1, int number2, int number3){
		
	int highest = Math.max(Math.max(number1, number2),number3);


	int smallest = Math.min(Math.min(number1, number2), number3);



	int sum = number1 + number2 + number3;
	int high = sum - highest - smallest ;


	 
	System.out.printf("Highest:%d%n",highest);
	System.out.printf("High:%d%n",high);
	System.out.printf("Smallest:%d%n",smallest);
	}


	public static void main(String[] args){
	Scanner scan = new Scanner(System.in);
	
	System.out.print("Enter the first number " );
	int number1 = scan.nextInt();
	System.out.print("Enter the second number " );
	int number2 = scan.nextInt();
	System.out.print("Enter the third number " );
	int number3 = scan.nextInt();
	
	
	highestToLowest( number1,  number2,  number3);

	}
	

	
}