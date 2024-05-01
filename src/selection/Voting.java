package selection;

import java.util.Scanner;

public class Voting {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the nationality: ");
		String citizen= sc.next();
		
		
		if (citizen.equalsIgnoreCase("Nepali")) {
			
			System.out.println("Enter the age: ");
			int age= sc.nextInt();
			
			if (age >=18) {
				
				System.out.println("Do you have the voter ID? (true/false)");
				boolean hasVoterId = sc.nextBoolean();
				
				if (hasVoterId) {
				System.out.println("\n Eligibe to vote");
				}
				else {
					System.out.println("\n You are not eligible  to vote");
				}
			}
		}
		else {
			System.out.println("You are not eligible  to vote");
		}
	}
}
