import java.util.Scanner;
public class PizzaApp{
	public static void main(String[] args){
	Scanner inputCollection = new Scanner(System.in);
	

	String menu = """
			.................................................
			Pizza type    Number of Slices    Price per box
			.................................................
			1.) Sapa size            4                 2,000

			2.) Small Money          6                 2,400

			3.) Big boys             8                 3,000

			4.) Odogwu              12                 4,200
			................................................


								""";


	System.out.println(menu);
	int pizzaType = inputCollection.nextInt();
	System.out.println("Enter the amount of people you're hosting");
	int numberOfPeople =  inputCollection.nextInt();



	
	  switch(pizzaType){
			case 1: caculateSizeOfpizza(numberOfPeople, 4, 2000.00);break;
			case 2: caculateSizeOfpizza(numberOfPeople, 6, 2400.00);break;
			case 3: caculateSizeOfpizza(numberOfPeople, 8, 3000.00);break;
			case 4: caculateSizeOfpizza(numberOfPeople, 12, 4200.00);break;
			default:
				System.out.println("You have enter wrong input goode bye ");
			}





}


		public static void caculateSizeOfpizza(int numberOfPeople, int numberOfSlice,double price){
		int sliceRemainder = 0;
		int numberOfPacks = numberOfPeople/numberOfSlice;


		
		numberOfPacks = numberOfPeople/numberOfSlice;
		if(numberOfPeople % numberOfSlice != 0)numberOfPacks = numberOfPacks+1;
		sliceRemainder = numberOfPacks*numberOfSlice - numberOfPeople;
		price = numberOfPacks*price;
		System.out.printf(" Number of boxes of pizza is %d%n", numberOfPacks);
		System.out.printf(" Number Of left over slice after serving %d%n", sliceRemainder);
		System.out.print(" price is  " + price  );

		}







}