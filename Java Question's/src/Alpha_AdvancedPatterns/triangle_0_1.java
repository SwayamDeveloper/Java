package Alpha_AdvancedPatterns;

public class triangle_0_1 {
public static void zero_onetriangle(int n) {
	for(int i=1; i<=n; i++) {
		for(int j=1; j<=i; j++) {
		if((i+j)%2==0) //even 
			{
			System.out.print(1+" ");
		}
		else {
			System.out.print(0+" ");
		}
		
		}
		System.out.println();
	}
	
}
public static void main(String[] args) {
	zero_onetriangle(5);
}
}
