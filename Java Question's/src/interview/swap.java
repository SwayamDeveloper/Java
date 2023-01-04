package interview;
import java.util.*;
//public class swap {
//	
//public static void main(String[] args) {
//	
//int a=1,b=2,t;
//System.out.println("Before swapping"+a+b);
//t=a;
//a=b;
//b=t;
//
//System.out.println("Before swapping"+a+b);
//	
//
//
//}
//}

//by scanner class
//public class swap{
//	public static void main(String[] args) {
//		int a,b,t;
//		Scanner sc=new Scanner(System.in);
//		System.out.print("Enter the value of a and b:");
//		
//		a =sc.nextInt();
//		b =sc.nextInt();
//		
//		System.out.println("before swapping numbers: "+a+" "+b);
//	
//     //	swapping
//	
//		t=a;
//		a=b;
//		b=t;
//		System.out.println("after swapping numbers: "+a+" "+b);
//	}
//}



import java.util.Arrays;

public class swap {
    public static void main(String[] args) {
        int[] arr = {1, 3, 23, 9, 18, 56};
//        swap(arr, 0, 4);
        reverse(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void reverse(int[] arr) {
        int start = 0;
        int end = arr.length-1;

        while (start < end) {
            // swap
            swap(arr, start, end);
            start++;
            end--;
        }
    }
    static void swap(int[] arr, int index1, int index2) {
        int temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;
    }
}




























