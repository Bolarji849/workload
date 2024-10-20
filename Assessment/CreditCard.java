import java.util.Arrays;
import java.util.Scanner;
import java.lang.IllegalArgumentException;
public class CreditCard{

	public static void main(String[] args){
	Scanner scan = new Scanner(System.in);

   
	System.out.print("Hello,Kindly Enter Card detials to verify : ");
	
	String cardNumber = scan.nextLine();
		if(!checkStringIsDigit(cardNumber))throw new IllegalArgumentException("Card Number Must Be Digit Only");
		int lengthSize =  cardNumber.length();
		if(lengthSize < 13 || lengthSize >16)throw new IllegalArgumentException("Card Number Must Be Witin 13-16");
		
		System.out.println("**Credit Card Digit length : " +lengthSize);

		int [] covertedNumbers = covertFromStringtTOIngter(cardNumber);
		int [] multipliedNumbers = multiplyAllIndex(covertedNumbers);
		int [] doubleSplitedNumbers = splitDoubleNumbers(multipliedNumbers);
		int result = addAllIndex(doubleSplitedNumbers);
		
		if(result % 10 == 0)System.out.println("**Credit Card Validity Status: Valid");
		
		else{
			System.out.println("**Credit Card Validity Status: Invalid");
			}
	
		
		if(cardNumber.startsWith("4"))System.out.println("**Credit Card Type: VisaCard");

		else if( cardNumber.startsWith("5"))System.out.println("**Credit Card Type: MasterCard");

		else if(cardNumber.startsWith("37"))System.out.println("**Credit Card Type: American Express Card");

		else{
			cardNumber.startsWith("6");
			System.out.println("**Credit Card Type: Discover Card");
		}
	

		System.out.println("**Credit Card Number : " +cardNumber);
	
	
	
	
}
public static int addAllIndex(int [] digit){
	int total = 0;
	for(int counter = 0; counter< digit.length; counter++){
		total += digit[counter];
	
	}

	
return total;
	
}


public static int[] splitDoubleNumbers(int [] number){
	int sum = 0;
	for(int index = 0; index< number.length; index++){
		if(number[index] > 9){
		   sum = (number[index]/10) + (number[index]%10);
		number[index]= sum;
		}
	}
	return number;
}


public static int [] multiplyAllIndex(int [] card){
	int[] product = new int [card.length];
	if(card.length % 2 == 0){
		for(int index = 0; index < card.length; index++){
			if(index % 2 == 0)card[index] = card[index] * 2;	
	}
	}

	if(card.length % 2 == 1){
		for(int index = 0; index < card.length; index++){
			if(index % 2 == 1)card[index] = card[index] * 2;

	}
	}
	return card;
}	

public static int[] covertFromStringtTOIngter(String cardNumber){
	int[] convertedValue = new int[cardNumber.length()];
	for(int count = 0; count<convertedValue.length; count++) convertedValue[count] = cardNumber.charAt(count) -'0';
	return convertedValue;
}

public static boolean checkStringIsDigit(String str){
	return str.matches("\\d+");

}
}