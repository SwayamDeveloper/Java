package Alpha_DSA_Arrays;

public class Reversed_array {
public static void reversed(int num[]) {
	int first=0, last=num.length-1;
	
	while(first<last) {
		//swap
	    int temp = num[last];
	    num[last] = num[first];
	    num[first] = temp;
	    
	    first++;
	    last--;
	}
}

public static void main(String[] args) {
	 int num[] = {2,4,6,8,10};
      reversed(num);

      //print array
      for(int i=0; i<num.length; i++) {
    	  System.out.print(num[i] + " ");
      }
      System.out.println();
}
}
