package Alpha_patterns;

public class inverted_star {
public static void main(String[] args) {
	int n=5;
//	outer loop
	for(int line=1; line<=n; line++) {
//		inner loop
		
		for(int star1=1; star1<=n-line+1; star1++) {    //'.' n-line+1 is formula '.'
			System.out.print("*");
		}
		
		System.out.println();
	}
}
}
