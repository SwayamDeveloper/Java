package Basic_java;

import java.util.Scanner;

public class factors {
	public static void main(String[] args) {

		// positive number

		int n =4;
	
		System.out.print("Factors of " + n + " are: ");
		for (int i = 1; i <= n; i++) {
			if (n % 1 == 0) {
				System.out.println(i + " ");
			}
		}
	}
}
