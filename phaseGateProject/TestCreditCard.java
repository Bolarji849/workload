import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;


public class TestCreditCard{
		
	@Test
	public void covertFromStringtTOIngter(){
		//Given


	 String cardNumber = "4388576018410707";

	 CreditCard   creditCard = new CreditCard();

		// when

	int[] result = creditCard.covertFromStringtTOIngter(cardNumber);
		
	int[] expected = {4,3,8,8,5,7,6,0,1,8,4,1,0,7,0,7};

		//check

	assertArrayEquals(expected, result);

}


	@Test
	public void multiplyAllIndex(){
		//Given


	 int [] card = {4,3,8,8,5,7,6,0,1,8,4,0,2,6,2,6};

	 CreditCard   creditCard = new CreditCard();

		// when

	int[] result = creditCard.multiplyAllIndex(card);
		
	int[] expected = {8,3,16,8,10,7,12,0,2,8,8,0,4,6,4,6};

		//check

	assertArrayEquals(expected, result);
}


	@Test
	public void splitDoubleNumbers(){
		//Given


	 int [] number = {8,3,16,8,10,7,12,0,2,8,8,0,4,6,4,6};

	 CreditCard   creditCard = new CreditCard();

		// when

	int[] result = creditCard.splitDoubleNumbers(number);
		
	int[] expected = {8,3,7,8,1,7,3,0,2,8,8,0,4,6,4,6};

		//check

	assertArrayEquals(expected, result);
	}




	@Test
	public void addAllIndex(){
		//Given


	 int [] number = {8,3,7,8,1,7,3,0,2,8,8,0,4,6,4,6};

	 CreditCard   creditCard = new CreditCard();

		// when

	int result = creditCard.addAllIndex(number);
		
	int expected = (75);

		//check

	assertEquals(expected, result);
	}



		@Test
	public void checkNumberCardStartWith(){
		//Given
	String cardNumber = "4388576018410707";
	String cardNumber2 = "5388576018410707";
	String cardNumber3 = "3788576018410707";
	String cardNumber4 = "6788576018410707";

	 CreditCard   creditCard = new CreditCard();

		// when

	boolean result = cardNumber.startsWith("4");
	boolean result2 = cardNumber2.startsWith("5");
	boolean result3 = cardNumber3.startsWith("37");
	boolean result4 = cardNumber4.startsWith("6");

		
	String expected = ("VisaCard");
	String expected2 = ("MasterCard");
	String expected3 = ("American Express Card");
	String expected4 = ("Discover Card");
	

		//check

	assertTrue(result, expected);
	assertTrue(result2, expected2);
	assertTrue(result3, expected3);
	assertTrue(result4, expected4);
	}

	

}


