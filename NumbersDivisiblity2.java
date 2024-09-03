public class NumbersDivisiblity2 {
	public static void main(String[] args){


	int counter = 0;
	
	for(int number = 100; number <= 1000; number++){
	

	if(number % 3 == 0 && number % 4 == 0) counter++;
	
	System.out.print(number + "  ");

	if ( counter %10 == 0) System.out.println();

	
	}

	}


}