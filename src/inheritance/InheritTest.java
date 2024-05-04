package inheritance;

public class InheritTest {
	public static void main(String[] args) {
//		Programmer p = new Programmer();
		Frontend p = new Frontend();
		p.id= 123;
		p.name= "Samikshya";
		p.salary = 30000;
		p.company = "Leapfrog";
		p.proglang = "Java";
		p.project = "SpringBoot";
		p.bonus = 5000;
		p.department = "UI";
		
		p.print();
		
//		p.print();
	}
	
	
}
