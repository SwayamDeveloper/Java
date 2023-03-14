package Alpha_DSA_Arrays;

public class linear_search {
	
	public static String linearsearch(String food[],String key) {
		for(int i=0; i<food.length; i++) {
			if(food[i]==key ) {
			   return food[i] ;
			}
			
		}
		return null; //key doesn't exist
	}
	
public static void main(String args[]) {
	String food[] = {"dosa","Chole bhature","kachori","Samosa","Bread pakoda"};
	String key= "Samosa";
	
	String index= linearsearch(food,key);
	if(index==null) {
		System.out.println("key not found");
	}
	else {
		System.out.println(" key is at index "+ index);
	}
	
}
}
