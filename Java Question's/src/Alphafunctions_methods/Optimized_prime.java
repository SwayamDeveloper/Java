package Alphafunctions_methods;

//Optimized way to solve prime number
public class Optimized_prime {
	public static boolean isprime(int n) {
		if (n == 2) {
			return false;
		}
		for (int i = 2; i <= Math.sqrt(n); i++) {
			if (n % i == 0) {
				return true;
			}
		}
		return true;

	}

	public static void main(String[] args) {
		System.out.println(isprime(7));
		
	}
}
