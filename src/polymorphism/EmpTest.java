package polymorphism;

import java.util.Arrays;
import java.util.Scanner;

//Q. WAP to store and print data of 10 Employee(id, name, company, salary, department,  post, city)
//
//a.) find total salary of employee
//b.) print employees of IT department
//c.) count employees of Admin department.
//d.) count and print employees of particular department.
//e.) calculate total salary of particular department.
//f.) find the highest and lowest salary of employee.

public class EmpTest {
	public static void main(String[] args) {
		Employee[] employees = new Employee[5];
		
		Scanner sc = new Scanner(System.in);
		
		for(int i = 0; i < employees.length; i++) {
			Employee e = new Employee();
			
			System.out.println("Enter the ID: ");
			e.setId(sc.nextInt());
			System.out.println("Enter the name: ");
			e.setName(sc.next());
			System.out.println("Enter the company: ");
			e.setCompany(sc.next());
			System.out.println("Enter the salary: ");
			e.setSalary(sc.nextInt());
			System.out.println("Enter the department: ");
			e.setDepartment(sc.next());
			System.out.println("Enter the post: ");
			e.setPost(sc.next());
			System.out.println("Enter the city: ");
			e.setCity(sc.next());
			
			employees[i]= e;			
		}
		
		for(Employee x: employees) {
			System.out.println(x);
		}
		
		EmpTest t = new EmpTest();
			System.out.println("Employee of IT department: ");
			t.printIT(employees);

			int ts = t.totalsalary(employees);
			System.out.println("The total salary is: "+ ts);
			
			t.AdminCount(employees);
			
			t.printEmployeeCity(employees);
			
			t.depTotalSalary(employees);
			
			t.highLowSalary(employees);
	}
	
	int totalsalary(Employee[] emp) {
		int total =0;
		for(Employee x: emp) {
			total = total + x.getSalary();
		}
		return total;
	}
	
	void printIT(Employee employees[]) {
		int count=0;
		for (Employee x: employees) {
			if (x.getDepartment().equalsIgnoreCase("IT")){
				System.out.println(x);
				count ++;
			}
		}
		if (count == 0) {
			System.out.println("NULL");
			}
	}
	
	
	void AdminCount(Employee[] emp) {
		int count = 0;
		for(Employee x: emp) {
			if(x.getDepartment().equalsIgnoreCase("Admin")) {
				count++;
			}
		}
		System.out.println("The total number  of employees from Admin department is = "+count);
	}
	
	void printEmployeeCity(Employee[] emp) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the city: ");
		String city = sc.next();
		
		for (Employee x: emp) {
			if (x.getCity().equals(city)) {
				System.out.println(x);
			}
		}
	}
	
	void depTotalSalary(Employee[] emp) {
		int totalsalary =0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the department to find total salary of that department: ");
		String dep = sc.next();
		
		for(Employee x: emp) {
			if(x.getDepartment().equalsIgnoreCase(dep)) {
				totalsalary = totalsalary + x.getSalary();
			}
		}
		
		System.out.println("The total salary of "+ dep + " department is "+ totalsalary);
	}
	
	void highLowSalary(Employee[] emp) {
		int i = 0;
		int array[] = new int [emp.length];
		for (Employee x: emp) {
			if (i< emp.length) {
				array[i]= x.getSalary();
				i++;
			}
		}
		Arrays.sort(array);
		System.out.println("Highest salary: "+ array[array.length-1]);
		System.out.println("Lowest salary: "+ array[0]);
	}
	
}
