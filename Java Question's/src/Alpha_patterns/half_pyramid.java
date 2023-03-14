package Alpha_patterns;

public class half_pyramid {
public static void main(String[] args) {
	int n=4;
//	outer lopp
	for(int line=1; line<=n; line++) {
//		inner loop
		for(int number=1; number<=line; number++)
		{
			System.out.print(number);
		}
		System.out.println();
	}
}
}
