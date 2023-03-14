package AlphaConditional_statements;

public class Largestof3 {

	public static void main(String[] args) {
		int a=5,b=2,c=6;
		
		if(a>=b && a>=c) {
			System.out.println("largest is A");
		}
		else if(b>=c) {
			System.out.println("Largest is B");
		}
		else {
			System.out.println("Largest is C");
		}
	}
}
