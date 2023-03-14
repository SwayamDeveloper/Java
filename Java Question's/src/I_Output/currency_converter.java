package I_Output;

import java.util.Scanner;

public class currency_converter {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		double rupees;
		double usd;

		System.out.print("Enter the amount in rupees: ");
		rupees = scanner.nextDouble();

		usd = rupees / 74.25;

		System.out.println("The equivalent amount in USD is: $" + usd);

	} 

}
