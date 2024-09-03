import java.util.Scanner;

public class GasMileage{

	public static void main(String... args){

		Scanner input = new Scanner(System.in);

		System.out.print("Enter number of trips: ");
		double numberOfTrips = input.nextDouble();

		double totalOfMiles = 0;
		double totalOfGallons = 0;

		for(int count = 1; count <= numberOfTrips; count++){

			System.out.print("Enter the miles driven: ");
			double milesDriven = input.nextDouble();

			totalOfMiles = totalOfMiles + milesDriven;

			System.out.print("Enter the gallon used: ");
			double gallonUsed = input.nextDouble();

			totalOfGallons = totalOfGallons + gallonUsed;

			double average = milesDriven / gallonUsed;

		}

		double totalOfAverage = totalOfMiles / totalOfGallons;
		System.out.print(totalOfAverage);

		


		

	}





}