import java.util.Scanner;
public class CryptographyPrivacy {
	public static void main(String[] args){
	Scanner inputCollection = new Scanner(System.in);



	System.out.print("Enter a four digit integer ");
	int digit = inputCollection.nextInt();
	
	int firstDigit = digit/1000;
	int secondDigit = (digit/100)%10;
	int thirdDigit = (digit/10)%10;
	int fourthDigit = digit%10;	

	 int firstinteger = (firstDigit + 7)%10;
	 int secondinteger = (secondDigit +7)%10;
	 int thirdinteger = (thirdDigit + 7)%10;
	 int fourthinteger = (fourthDigit + 7)%10;
	  
	

	int encrypt = (thirdinteger*1000 )+(fourthinteger*100) + (firstinteger * 10 )+( secondinteger);
	
	System.out.print(encrypt );

	}

	
}