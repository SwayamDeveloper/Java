
package Alphafunctions_methods;

import java.util.Scanner;

//Average of 3 numbers
public class sum {

	public static int calculateSum(int num1, int num2) {

		int sum = num1 + num2;
		return sum;

	}

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter two number:");
		int a = sc.nextInt();
		int b = sc.nextInt();
		int sum = calculateSum(a, b);
		System.out.println("Sum is: " + sum);
	}
}
