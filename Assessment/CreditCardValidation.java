import java.util.Arrays;
public class CreditCard{

	public static void main(String[] args){
	String cardNumber = "1234567895432";
		System.out.print(Arrays.toString(splitNumber(cardNumber)));
		

}
//public static int checkValidty(String[] card){
//	int convert [] = new int[card.length];
//	int add = 0;

//	for(int index = 0; index < convert.length; index++){
//		if(index % 2 == 0){
//		add = 2 * covert[index] ;
//		}	
//	
//}return add;	
//}

public int[] splitNumber(String cardNumber){
	int[] convertedValue = new int[cardNumber.length];
	for(int count = 0; count<convertedValue.length; count++) convertedValue[count] = cardNumber.charAt(count) -'0';
	return convertedValue;
}






}