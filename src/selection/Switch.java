package selection;

import java.util.Scanner;

public class Switch {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the alphabet (a/b/c): ");
		char ch = sc.next().charAt(0);
		
		String s = Character.toString(ch);
		String in = s.toLowerCase();
		
		switch (in) {
		case "a":
			System.out.println("a for apple.");
		break;
		case "b":
			System.out.println("b for ball.");
			break;
		case "c":
			System.out.println("c for cat.");
		default:
			break;
		}
	}
}
