package Basic_java;

import java.util.Scanner;

public class Reverse {
	public static void main(String[] arg) {
		String str = null;
		System.out.println("Enter a name: ");
		Scanner sc = new Scanner(System.in);
		str = sc.nextLine();
		System.out.println("Reverse of a String '" + str + "' is  :");
		for (int j = str.length(); j > 0; --j) {
			System.out.print(str.charAt(j - 1));
		}
	}
}
