package I_Output;

import java.util.Scanner;

public class palindrome {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str;
		System.out.print("Enter a string: ");
		str = sc.nextLine();
		String rev = new StringBuilder(str).reverse().toString();
		if (str.equalsIgnoreCase(rev)) {
			System.out.println(str + " is a palindrome.");
		} else {
			System.out.println(str + " is not a palindrome.");
		}
	}
}
