package oop;

public class EmployeeTest {
	
	public static void main(String[] args) {
		Employee e = new Employee();
		e.EmpId = 101;
		e.fname= "Ram";
		e.lname= "Bhattrai";
		e.depart= "Software Engineer";
		e.phone= "9849898410";
		
		e.print();
		
	}
}
