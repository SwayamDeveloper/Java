package Alpha_Strings;
//Strings are immutable: it means that we cannot change string once it declared. 
import java.util.*;
public class Strng {

	public static void printletters(String str){
		
		for(int i=0; i<str.length(); i++) {
			System.out.print(str.charAt(i)+" ");
		}
		System.out.println();
		
	}
	public static void main(String [] args) {
	char ch[] = {'a','b','c','d'};
	String str="abcd";
	String str2 = new String("xyz");
	
//	Scanner sc= new Scanner(System.in);
//	System.out.print("Enter the String: ");
//	String name;
//	name=sc.next(); //it will print only single word
//	name=sc.nextLine(); //it will print whole line
//	System.out.println(name);
	
//	concatenation
	String firstname = "Swayam";
	String lastname = "jugran";
	String fullname= firstname + " " +lastname;
	
	System.out.println(fullname);
	
	
	//charAt
	System.out.println(fullname.charAt(7));
	
	
	printletters(fullname);
	
}
}
