package flow_of_program;

import java.util.Scanner;

//1.Take integer variable year
//2. Assign a value to the variable
//3. Check if the year is divisible by 4 but not 100, DISPLAY "leap year"
//4. Check if the year is divisible by 400, DISPLAY "leap year"
//5. Otherwise, DISPLAY "not leap year"
public class leap_year {
	public static void main(String[] args) {
		int year = 0;
		System.out.println("Enter an Year :: ");
		Scanner sc = new Scanner(System.in);
		year = sc.nextInt();
		if (((year % 4 == 0) && (year % 100 != 0)) || (year % 400 == 0))
			System.out.println("Specified year is a leap year");

		else
			System.out.println("Specified year is not a leap year");
	}
}
