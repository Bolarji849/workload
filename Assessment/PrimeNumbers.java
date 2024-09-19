


import java.util.Scanner;
public class PrimeNumber{
	public static void main(String[] args){
	Scanner scan = new Scanner(System.in);
	
	System.out.print("Enter the number" );
	int number = scan.nextInt();
	 Boolean result = isPrimeNumber(number);
	
	System.out.print(result);


	}





public static boolean isPrimeNumber(int integer){
	int factorCount = 0;
 	for(int counter = 1;counter <= integer; counter++){

	   if(integer % counter == 0){ 
		factorCount++;
	    }
	}	  
	
	if(factorCount == 2){
		 return true;
	
	 }
		
		return false;	
	 }




}