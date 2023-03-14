package Alpha_DSA_Arrays;

public class Smallest {
public static int smallestnum(int num[]) {
	int smallestnum = Integer.MAX_VALUE;
	
	for(int i=0; i<num.length; i++) {
		if(smallestnum>num[i]) {
			smallestnum=num[i];
		}
	}
	return smallestnum;
}
public static void main(String[] args) {
	int num[] = {1,2,3,5,4,6};
	System.out.println("smallest number in an array: " + smallestnum(num));
}
}
