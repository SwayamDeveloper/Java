package Alphafunctions_methods;

public class function_overloading {
//sum of 2 number
	public static int sum(int a, int b) {  //Function or method is same but having different parameters.
		return a + b;
	}

	public static int sum(int a, int b, int c) {  //Function or method is same but having different parameters.
		return a + b + c;
	}
	public static float sum(float a, float b, float c) {  //Function or method is same but having different parameters.
		return a + b + c;
	}

	public static void main(String args[]) {

		System.out.println(sum(3, 5));
		System.out.println(sum(2, 3, 4));
		System.out.println((float)sum(2, 3, 4));
	}

}
 