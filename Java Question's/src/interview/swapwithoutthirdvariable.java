package interview;
import java.util.*;
public class swapwithoutthirdvariable {

	public static void main(String[] args) {
//		int x,y;
//		System.out.println("Enter x and y");
//		Scanner sc= new Scanner(System.in);
//		
//		x=sc.nextInt();
//		y=sc.nextInt();
//
//	    System.out.println("Before Swapping: " +x+" "+y);
//	
//	    
//	    x = x+y;
//	    y = x-y;
//	    x = x-y;
//	    
//	    System.out.println("After Swapping without the third variable: " +x+" "+y);
		
		int x,y;
		System.out.println("Enter x and y");
		Scanner sc= new Scanner(System.in);
		x=sc.nextInt();
		y=sc.nextInt();
		
		System.out.println("Before swapping: "+x+" "+y);
		
		x=x+y;
		y=x-y;
		x=x-y;
		
		System.out.println("After swapping without the third variable: "+x+" "+y);
			
	}
}
