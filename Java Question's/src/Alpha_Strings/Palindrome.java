package Alpha_Strings;

public class Palindrome {
	public static boolean ispalindrome(String str) {
		for(int i=0; i<str.length()/2; i++) {
			int n=str.length();
			if(str.charAt(i)!=str.charAt(n-1-i)) {
				//not a palindrome
				return false;
			}
		}
	       return true;
	
	}
	
	public static boolean checkpalindrome(String str1) {
		for(int i=0; i<str1.length()/2; i++) {
			int n=str1.length();
			if(str1.charAt(i)!=str1.charAt(n-1-i)) {
				//not a palindrome
				return false;
			}
		}
	      return true;
	}
	
public static void main(String[] args) {
	String str ="noon";
	String str1 ="Swayam";
	System.out.println(ispalindrome(str));
	System.out.println(checkpalindrome(str1));
	
}
}

