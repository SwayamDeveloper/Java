package interview;

import java.util.Scanner;

//A number which is divisible by 1 and it self.

public class primeno {
public static void main(String[] args) {
  
	//declare integer
	int num=0;
	System.out.println("Enter a number: ");
	Scanner sc= new Scanner(System.in);
	num=sc.nextInt();
	
	
	boolean flag= false;
	for(int i=2; i<num/2; i++) {
		if(num%i == 0) {
			flag = true;
			break;
		}
	}
	if(!flag) {
		System.out.println(num+"is a prime number");
	}
	else {
		System.out.println(num+"is not a prime number");
	}
	
	
}}



	