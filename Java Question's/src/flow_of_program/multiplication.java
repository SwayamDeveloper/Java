package flow_of_program;

import java.util.Scanner;

public class multiplication {
	public static void main(String[] args) {
		int n;
		System.out.print("Multiplication of this num:");
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();

		for (int i = 1; i <= 10; i++) {
			System.out.println(n + " * " + i + " = " + n * i);
		}
	}
}
