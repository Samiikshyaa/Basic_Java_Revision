package Method;

import java.util.Scanner;

public class Method {
	
	static void area() {
		int l = 2,  b = 3, h = 4;
		int arear = l*b*h;
		System.out.println("Area of rectangle: "+ arear);
	}
	
	static void perimeter(int l, int b) {

		int p = (2*(l + b));
		System.out.println("Perimeter of rectangle: "+ p);
	}
	
	static double bonus (int salary) {
		double bonus = ((20/100)*salary);
		return bonus;
	}
	
	static double totalsalary (int salary, double bonus) {
		double total = salary + bonus;
		return total;
	}
	
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the parameters: ");
		int l = sc.nextInt();
		int b = sc.nextInt();
		perimeter(l,b);
		area();
		
		System.out.println( );
		System.out.println("Enter the salary: ");
		int salary = sc.nextInt();
		
		
		double bo = bonus(salary);
		double x = totalsalary(salary, bo);
		
		System.out.println("Total Salary "+ x);
		
	}
}
