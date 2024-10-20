public class MutiplicationTables{

	public static void main(String[] multuplication){
		
	


	for(int counter = 1; counter <=9 ; counter++ ){
	System.out.println("  ");
	int digit = 1;
	int count = 1;

	while (digit <= 9){

		count  = counter * digit;
		System.out.print( counter+ "x" + digit + "=" + counter*digit + "   ");
		digit++;
		
	}
	System.out.println();	
	}

	}
	
}