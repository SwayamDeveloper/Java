package Alphafunctions_methods;

import java.util.Scanner;

public class Swap {

	public static void swap(int a, int b) {

		int temp = a;
		a = b;
		b = temp;

		System.out.println("a=" + a);
		System.out.println("b=" + b);
	}

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any numbers: ");

		int a = sc.nextInt();
		int b = sc.nextInt();
		swap(a, b);
	}
}
