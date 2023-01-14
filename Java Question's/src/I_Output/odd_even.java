package I_Output;

import java.util.Scanner;

public class odd_even {
	public static void main(String[] args) {
		int n;
		System.out.println("Enter any number:");
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		if (n % 2 == 0) {
			System.out.println("even");
		} else {
			System.out.println("odd");
		}
	}
}
