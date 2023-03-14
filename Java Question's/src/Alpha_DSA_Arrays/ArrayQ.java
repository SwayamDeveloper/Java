package Alpha_DSA_Arrays;

import java.util.Scanner;

public class ArrayQ {
	
	private static void program() {
        int marks[] =new int [199];
		System.out.println("length of an array" + marks.length );
		return ;

	}

	public static void main(String[] args) {

		int marks[] = new int [100];
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter any number: ");


		marks[0]= sc.nextInt();
		marks[1]= sc.nextInt();
		marks[2]= sc.nextInt();
		System.out.println("physics:" + marks[0]);
		System.out.println("chemistry:" + marks[1]);
		System.out.println("Mathemmatics:" + marks[2]);
		
		program();
	 
	
	}	
}   