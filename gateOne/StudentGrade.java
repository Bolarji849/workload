

import java.util.Arrays;
import java.util.Scanner;

public class StudentGrade{

	public static void main(String[] args){

	Scanner scan = new Scanner(System.in);

	System.out.print("HOW MANY STUDENT DO HAVE?:  ");
	int numberOfStudent = scan.nextInt();
		
	System.out.print("HOW MANY SUBJECT DO THEY OFFER?:  ");
	int numberOfSubject = scan.nextInt();

	System.out.println();
	System.out.println("Saving >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");

	System.out.println("Save successfully");

	System.out.println();


	int [][] studentAndSubject = new int [numberOfStudent][numberOfSubject]; 

	for(int index = 0; index < numberOfStudent; index++ ){			
		for(int index2 = 0; index2 < numberOfSubject ; index2++ ){
			System.out.print("Enter score of Student" + (index + 1) + " in Subject " + (index2 + 1) +" ");
			
			studentAndSubject[index][index2]= scan.nextInt();
			
			
					}
			}

		System.out.println("===========================================================");
		System.out.println();

		System.out.print("Student" + "\t");
	for(int line = 0; line < numberOfSubject; line++){
		
			System.out.print("\t" + "Sub" + (line+1) +"\t");
			}

			System.out.print("" +"TOT");
			System.out.print(" \t " +   "AVE");
			System.out.print(" \t " + "POS");
			System.out.println();

		System.out.print("==========================================================================");
		System.out.println();
	
	for(int index = 0; index < numberOfStudent; index++ ){	
		 int sum = 0;
		 double roundOff = 0;
		 double average = numberOfStudent;
		System.out.print("Student" + (index+1));	
		for(int index2 = 0; index2 < numberOfSubject ; index2++ ){
			sum += studentAndSubject[index][index2];					
			System.out.print("\t" + studentAndSubject[index][index2] + "\t");
			}
			average = sum / average;
			roundOff = Math.round(average*100)/100;
		System.out.print(sum +"\t");
		System.out.print(roundOff +"\t");
		System.out.println();
			}
		System.out.println("===========================================================================");
		System.out.println("===========================================================================");
		System.out.println();	
		
	
		for(int index = 0; index < numberOfSubject; index++ ){
		   int total = 0;
		    int highest = 0;
		    int lowest = 100;
			for(int index2 = 0; index2 < numberOfStudent; index2++ ){
				if(studentAndSubject[index2][index] > highest) highest = studentAndSubject[index2][index];
				if(studentAndSubject[index2][index] < lowest) lowest = studentAndSubject[index2][index];
				total += studentAndSubject[index2][index];
		
			}
		
			
			System.out.println("subject" + (index+1));
			System.out.println("Higest scoring student is :" + "Student" + "Scoring" + highest);
			System.out.println("Lowest Scoring student is :" + "Student"  + "Scoring" + lowest);
			System.out.println("Total Score is:" + total); 
			System.out.println("Average score is:");
			System.out.println("Number of passes:");
			System.out.println("Number of Fails:"); 

				System.out.println(); 

		              
		}
}
}