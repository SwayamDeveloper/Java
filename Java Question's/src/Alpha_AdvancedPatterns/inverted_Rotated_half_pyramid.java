package Alpha_AdvancedPatterns;

public class inverted_Rotated_half_pyramid {

	public static void inverted_Rotated_half_pyramid(int n) {
		//outer loop
		for(int i=1; i<=n; i++) {
			//spaces
			for(int j=1; j<=n-i; j++) {
				System.out.print(" ");
			}
//			Stars
			for(int j=1; j<=i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	
	
	public static void main(String[] args) {
	inverted_Rotated_half_pyramid(4);
}
}
