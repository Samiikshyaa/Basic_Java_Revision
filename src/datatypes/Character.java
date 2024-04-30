package datatypes;

import java.util.Scanner;

public class Character {
 public static void main(String[] args) {
	
	 char ch;
	String s;
	
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the character");
	ch = sc.next().charAt(0);
	
	// After Space evrything is ommitted
	System.out.println("Enter the string");
	s = sc.next();
	
	//If you want to enter the name use first nane and second name
	System.out.println("Enter the first name");
	String fname = sc.next();
	System.out.println("Enter the last name");
	String lname = sc.next();
	
	System.out.println("\n");
	System.out.println("Character: "+ch);
	System.out.println("String: "+s);
	System.out.println("Full name: "+ fname + " "+ lname);
	
	
	
}
}
