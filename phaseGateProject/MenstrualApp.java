import java.time.LocalDate;
import java.util.Scanner;
import java.time.format.DateTimeFormatter;



public class MenstrualApp{


	public static void main (String[] args){

	

	getMenu();

	}

	public static void getMenu(){
	Scanner scan = new Scanner(System.in);
	String menu = """
		          ***********************************
	
		          >> 1 Check Next Menstrual Period
		          >> 2 Check Ovulation Date	
		          >> 3 Check fertity period
		           ***********************************	
						                 """;
		System.out.print(menu);

	
try{
	System.out.print("Enter your number of choice please:  ");
	int userInput = scan.nextInt();



	if(userInput == 1){
		System.out.print("Enter last period full details in this format (\"dd/MM/yyyy\"): ");

		String lastPeriodDay = scan.next();
		

		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy"); 
 
		LocalDate date = LocalDate.parse(lastPeriodDay, formatter);

		System.out.print("Enter length cycle:  ");

		int lengthCycle = scan.nextInt();
		
		 if (lengthCycle < 21 || lengthCycle > 35){
			System.out.print("Please see a doctor this is not a normal cycle length");
		
		 }else{
			LocalDate nextPeriodDate = date.plusDays(lengthCycle);
		          System.out.print("Your next menstrual date is: " +nextPeriodDate);
	
		}
		}

	if(userInput == 2){


		System.out.print("Enter last period full details in this format (\"dd/MM/yyyy\"): ");

		String lastPeriodDay = scan.next();

		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy"); 
 
		LocalDate date = LocalDate.parse(lastPeriodDay, formatter);

		System.out.print("Enter length cycle ");

		int lengthCycle = scan.nextInt();

		int Ovulation = lengthCycle / 2;
		
		LocalDate dateOfOvulation = date.plusDays(Ovulation);

		System.out.print("your Ovulation date is: " +dateOfOvulation);
		
		}
		
		
	if(userInput == 3){
		System.out.print("Enter length cycle ");

		int lengthCycle = scan.nextInt();

		int Ovulation = lengthCycle / 2;

		int fertitilityStart = Ovulation - 3 ;
		
		int fertitilityEnd = Ovulation + 3;

		
		System.out.println("your fertility period Start:" +fertitilityStart);
		System.out.print("your fertility period Ends:" +fertitilityEnd);
		
		

	}

}
catch(Exception e){
	System.out.println("Please check your input and put in the correct thing");
}
		


}



}