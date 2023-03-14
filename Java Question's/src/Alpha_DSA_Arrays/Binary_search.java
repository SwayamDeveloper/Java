package Alpha_DSA_Arrays;

public class Binary_search {
public static int binarysearch(int num[], int key) {
	int start=0, end=num.length-1;
	while(start<=end) {
		int mid = (start + end)/2;
		
		//comparisons
		if(num [mid]==key) {
			return mid;
		}
		if(num[mid] < key){ //right
			start = mid+1;
		}
		else {
			end = mid - 1;
		}
	}
	return -1;
}

public static void main(String[] args) {
	int num[] = {2,4,6,8,10,12,14};
	int key= 12;
	
	System.out.println("index for key is: " + binarysearch(num,key));
}
}
