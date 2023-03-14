package Basic_java;

import java.util.Scanner;

public class Vowel_consonant {

	public static void main(String[] args) {

		char ch = 0;
		System.out.print("Enter a character: ");
		Scanner sc = new Scanner(System.in);
		char c = sc.next().charAt(0);

		if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u')
			System.out.print(ch + " is vowel");
		else
			System.out.print(ch + " is consonant");
	}
}
