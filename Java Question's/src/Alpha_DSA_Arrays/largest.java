package Alpha_DSA_Arrays;

public class largest {
	public static int largestnumber(int num[]) {
		int largestnumber = Integer.MIN_VALUE;
		for (int i = 0; i < num.length; i++) {
			if (largestnumber < num[i]) {
				largestnumber = num[i];
			}
		}
		return largestnumber;
	}

	public static void main(String[] args) {
		int num[] = { 1, 2, 6, 3, 5 };
		System.out.println("largest value is : " + largestnumber(num));

	}

}
