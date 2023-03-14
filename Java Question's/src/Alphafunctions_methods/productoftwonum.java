package Alphafunctions_methods;

import java.util.Scanner;

public class productoftwonum {
	public static int multiply(int a, int b) {

		int product = a * b;
		return product;
	}

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter number's : ");
		int a = sc.nextInt();
		int b = sc.nextInt();

		int prod = multiply(a, b);
		System.out.println("a*b= " + prod);
	    int prod1=multiply(5,20);
		System.out.println(prod1);
	}
}
