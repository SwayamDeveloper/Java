package Basic_java;
import java.util.Scanner;

public class Square {
public static void main(String [] args) {
	int n;
	int fact = 0;
	System.out.println("Enter a number: ");
	Scanner sc= new Scanner(System.in);
	n=sc.nextInt();
	
	for(int i=1; i<=n; i++) {
		fact=n*i;
	}
	
	System.out.println("factorial of number:"+fact);
}
}

