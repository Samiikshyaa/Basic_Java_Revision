package Array;

import java.util.Scanner;

public class Age {

	public static void main(String[] args) {
		int age[] = new int[5];
		
		Scanner sc = new Scanner(System.in);
		
		for (int i = 0; i<age.length; i++) {
			System.out.println("Enter the age: ");
			age[i] = sc.nextInt();
		}
		
		System.out.println("The ages are: ");
		for(int x: age) {
			System.out.println(x);
		}
	}
}
