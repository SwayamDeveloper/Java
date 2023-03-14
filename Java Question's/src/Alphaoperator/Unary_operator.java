package Alphaoperator;

public class Unary_operator {
	public static void main(String[] args) {
		int a = 10;
		int b = ++a; // pre increment
		System.out.println(a);
		System.out.println(b);

		int x = 10;
		int y = x++; // post increment
		System.out.println(x);
		System.out.println(y);
	
		System.out.println("---------------------------------------------------------------");
		
		int u = 10;
		int n = --u; // pre decrement
		System.out.println(u);
		System.out.println(n);

		int o = 10;
		int p = o--; // post decrement
		System.out.println(o);
		System.out.println(p);

	}
}
