package selection;

import java.util.Scanner;

public class TotalSalarySwitchProblem {
	public static void main(String[] args) {
		int salary = 0;
		double bonus = 0, total=0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the post:");
		String post= sc.next();
		post = post.toUpperCase();
		
		switch (post) {
		case "MD":
			salary = 230000;
			bonus = ((20/100)* salary);
			total = salary + bonus;
			break;
		
		case "CEO":
			salary = 250000;
			bonus = ((25.79/100)* salary);
			total = salary + bonus;
			break;
		
		case "MANAGER":
			salary = 176000;
			bonus = ((16/100)* salary);
			total = salary + bonus;
			break;
			
		case "HELPER":
			salary = 145900;
			bonus = ((9/100)* salary);
			total = salary + bonus;
			break;
			
		default:
			break;
		}
		
		System.out.println("The total salary of "+ post + " is "+ total);
	}
}
