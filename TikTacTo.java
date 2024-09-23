public class TikTacTo{
	public static void main(String[] args){

	
	
	char[] [] tic = {{'X','O','X'},{'O','O','O'},{'X','O','X'}};

	for(int row = 0; row < tic.length ; row++){

		for(int column = 0; column < tic.length; column++){
			System.out.print(tic[ row][column]);
	
		}
		System.out.println();
	}


}	



}
	