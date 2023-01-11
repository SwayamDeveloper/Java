package Patterns;

public class invertedAlphabet_pattern {
public static void main(String [] args) {
	for(int i=1; i<=5; i++) {
		char alp='A';
		for(int j=5; j>=i; j--) {
			System.out.print(alp++);
		}
	System.out.println();
	}
}
}
