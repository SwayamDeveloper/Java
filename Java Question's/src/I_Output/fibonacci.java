package I_Output;

import java.util.Scanner;

public class fibonacci {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n;
		int a = 0, b = 1, c;

		System.out.print("Enter the number of terms: ");
		n = scanner.nextInt();

		System.out.print("Fibonacci Series: ");
		for (int i = 2; i <= n; i++) {
			System.out.print(a + " ");

			c = a + b;
			a = b;
			b = c;
		}
	}
}
