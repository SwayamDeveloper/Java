package interview;

public class StringContainsVowels {

	public static void main(String[] args) {
		System.out.println(stringContainsVowels("Hello")); //true
		System.out.println(stringContainsVowels("Swayam")); //false
		
		
	}
	
	public static boolean stringContainsVowels(String input) {
		return input.toLowerCase().matches(".*[hz].*");
	}
}


