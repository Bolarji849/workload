public class largest{
	public static void main(String[]args){
	
	int [] array = {1,7,3};
	
	
	System.out.printf("%d ",calculateForLargest(array));
	
	}

public static int calculateForLargest(int [] number){

	int largest = number[0] ;


	for(int count = 0; count < number.length; count++){

		if(number[count] > largest )largest = number[count];

	
	}

	return largest;



}






	}