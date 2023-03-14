package interview;

import java.util.Scanner;

public class Total_Average {
	public static void main(String[] marks) {

		// declare variables to store marks
		int mark1, mark2,mark3;
		
		// declare variable to store sum and average marks
		int totalMark;
		double avgMark;
	
		//Create scanner class object to take input
		Scanner sc= new Scanner(System.in);
		System.out.print("Enter marks of three subjects: ");
		mark1=sc.nextInt();
		mark2=sc.nextInt();
		mark3=sc.nextInt();
		
		//calculate sum of marks
		totalMark=mark1+mark2+mark3;
		
//		calculate average of marks
		avgMark = (double)totalMark / 3;
		
		System.out.println("Total Mark: "+ totalMark);
		System.out.println("Average Mark: "+ (avgMark));
	
	sc.close();
	}
}
