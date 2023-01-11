package interview;

import java.util.*;

public class Average {

	public static void main(String[] args) {

		// Create scanner class object
		Scanner sc = new Scanner(System.in);

		// declare two number
		double num1 = 0;
		double num2 = 0;

		// declare sum variable
		// and initialize with 0

		double sum = 0.0;

//	    declare average variable
		double avg = 0.0;

//	    take two numbers
		System.out.println("Enter two number: ");
		num1 = sc.nextDouble();
		num2 = sc.nextDouble();

		// calculate the sum value
		sum = num1 + num2;

		// calculate the average value
		avg = sum / 2;

		// display result
		System.out.println("Total of sum: " + sum);
		System.out.println("Average: " + avg);

	}

}
