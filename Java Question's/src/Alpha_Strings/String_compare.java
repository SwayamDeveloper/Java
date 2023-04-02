package Alpha_Strings;

public class String_compare {
public static void main(String[] args) {
	String s1="Swayam";
	String s2="Swayam";
	String s3=new String("Swayam");
	
	if(s1==s2) {
		System.out.println("String are equal");
	}
	else {
		System.out.println("String are not equal");
	}

    if(s1==s3) {
    	System.out.println("String are equal");
    }

    else {
		System.out.println("String are not equal");
	}

    if(s1.equals(s3)) 
    	 {
    		System.out.println("String are equal");
    	}
    	 else {
    			System.out.println("String are not equal");
    		}
    

}
}
