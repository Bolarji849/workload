import java.util.Scanner;
	public class BackToSenderLogistics{
	public static void main(String[] args){
		
	Scanner inputCollection = new Scanner(System.in);
	System.out.print("Enter number of successful delivery  "); 

	int amountOfDilivery = inputCollection.nextInt();
	caculateLogistics(amountOfDilivery);











	}

		public static void caculateLogistics(int number){
		int basepay = 5000;
		

		if(number >= 70){
		int amountPerPercel = 500;
		int result = number*amountPerPercel+basepay;
		System.out.print("your wage for the day is  " + result  );
		}
			
		else if(number>=60 && number <= 69){
		     int amountPerPercel = 250; 
		     int result = number*amountPerPercel+basepay;
		     System.out.print("your wage for the day is  " + result  );
			}
		
		else if(number>=50 && number <= 59){
		     int amountPerPercel = 200;
		     int result = number*amountPerPercel+basepay;
		     System.out.print("your wage for the day is  " + result  );
		      }
		
		else{ 
		     	
			int amountPerPercel = 160;
		     	int result = number*amountPerPercel+basepay;
		     	System.out.print("your wage for the day is  " + result  );
			}
			
		}

			


		











	
	}