package interview;
import java.util.Scanner;

//A=65,a=97
//S=83,a=115
//C=67,c=99
//I=73,i=105

public class ASCII {

	public static void main(String[] args) {
		
		//declare character
		char ch;
		
		//declare integer
		int value;
		
		//create Scanner class object
		//to read input
		Scanner sc= new Scanner(System.in);
		
		//read alphabet
		System.out.print("Enter an alphabet: ");
		ch = sc.next().charAt(0);	
		//convert char to ascii value
		value = ch;
		
		//display ascii value
		System.out.println("ASCII value of "+ch+"=" +value);
		
		
	}
	
	
}
