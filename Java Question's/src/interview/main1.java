package interview;

import java.util.Scanner;

public class main1 {

	public static void main(String args[]) {
		String[] a = { "a", "e", "i", "o", "u" };
		
		System.out.println("Enter a character:");
		Scanner sc = new Scanner(System.in);
		sc.nextInt();
		for (int i = 0; i < a.length; i++)
			System.out.println("vowels:" + a);

	}
}
