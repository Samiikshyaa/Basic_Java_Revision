package basic;

public class Interesting2 {
	    public static void main(String[] args) {
	        // Creating an object of type String
	        String str1 = "Hello";
	        
	        // Creating another reference to the same object
	        String str2 = str1;
	        
	        // Modifying the object through one reference
	        str1 += " world!";
	        
	        // Printing both references
	        System.out.println("str1: " + str1); // Output: str1: Hello, world!
	        System.out.println("str2: " + str2); // Output: str2: Hello
	    }
}