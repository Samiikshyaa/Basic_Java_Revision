package oop;

public class Employee {
	int EmpId;
	String fname;
	String lname;
	String depart;
	String phone;
	
	void print() {
		System.out.println("Employee Id "+ EmpId);
		System.out.println("First Name "+fname);
		System.out.println("Last Name "+lname);
		System.out.println("Department "+depart);
		System.out.println("Phone Number "+phone);
	}
}
