import org.junit.jupiter.api.Test;
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

	 	 int[] result = creditCard.covertFromStringtTOIngter(array);
		
	  	int[] expected = {4,3,8,8,5,7,6,0,1,8,4,1,0,7,0,7};

		//check

	   	assertArrayEquals(expected, result);
	}

}
}
