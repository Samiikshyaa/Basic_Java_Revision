package selection;

import java.util.Scanner;

public class SimpleCalculator {
	
	public static void main(String[] args) {
		
		int result = 0, difference = 0;
		String again= "Y";
		Scanner sc = new Scanner(System.in);
	
	do {	
		System.out.println("Enter the first operand: ");
		int a = sc.nextInt();
		
		System.out.println("Enter the second operand: ");
		int b = sc.nextInt();
		
		System.out.println("Enter the operator : \n + \n - \n * \n /");
		char operator = sc.next().charAt(0);
	
		switch (operator) {
		case '+':
			result = a + b;
			System.out.println("The result is: "+ result);
			break;
			
		case '-':
			if (a >= b) {
				difference = a - b;
				System.out.println(" The result is: "+ difference);
			}
			else {
				difference = b - a;
				System.out.println(" The result is: -"+ difference);
			}
			break;
		
		case '*':
			result = a * b;
			System.out.println("The result is: "+ result);
			break;
			
		case '/':
			double x = a, y = b;
			double divide = x / y;
			System.out.println("The result is: "+ divide);
			break;
			
		default:
			break;
		}
		
		System.out.println("Do you want to calculate again? (Y/N)? ");
		again = sc.next();
		
	}while (again.equalsIgnoreCase("Y"));
	
	System.out.println("Bye!");

	}
}
