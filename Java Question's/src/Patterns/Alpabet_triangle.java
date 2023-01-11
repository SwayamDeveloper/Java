package Patterns;

public class Alpabet_triangle {
public static void main(String[] args) {
	for(int i=1; i<=5; i++) {
	char alp='A';
	for(int j=5; j>i; j--) {
		System.out.print(" ");
	}
    for(int j=1; j<=i; j++) {
    	System.out.print(alp++);
    }
    --alp;
    for(int j=1; j<i; j++ ) {
    	System.out.print(--alp);
    }
    System.out.println();
	}
}
}