import java.util.Scanner;
public class Kata{

	public static void main (String[] args){
	Scanner numbercollection = new Scanner(System.in);
	System.out.println("Enter a number to check if it's an even number");
	int userinput = numbercollection.nextInt();
	System.out.println(calculateEvenNumbers(userinput));

	System.out.println("Enter a number to check if it's a prime number");
	int integer = numbercollection.nextInt();
	System.out.println(calculatePrimeNumber(integer));

	System.out.println("Enter a the first integer  ");
	int inputCollection = numbercollection.nextInt();
	System.out.println("Enter a the second integer  ");
	int integerCollection = numbercollection.nextInt();
	System.out.println(caculateAbsolute (integerCollection,inputCollection) );
	
	System.out.println("Enter a number to know it's factors");
	int integerOne = numbercollection.nextInt();
	System.out.println(calculateFactoria( integerOne)+ " numbers are factors of "  + integerOne   );

	
	System.out.println("Enter a number to know if it's a square number");
	int digitCollection = numbercollection.nextInt();
	System.out.println(calculateSquare(digitCollection));










}
   



 	public static boolean calculateEvenNumbers(int number){
 	if(number%2 == 0){
         return true ;
	 }
	 return false;
	 }


	public static boolean calculatePrimeNumber(int integer){
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








      public static int calculateFactoria(int integer){
	int factor = 0;
 	for(int counter = 1;counter <= integer; counter++){

	   if(integer % counter == 0){ 
		factor++;
	    }
	    }return factor;
	    }

	public static boolean calculateSquare(int integer){

	 double squareNumber = Math.sqrt(integer);

		if( integer % squareNumber == 0){
			return true;

		}return false;

		}

	public static int caculateAbsolute (int number1, int number2){
	int result = Math.abs(number1-number2);
	return result;
	 }

}