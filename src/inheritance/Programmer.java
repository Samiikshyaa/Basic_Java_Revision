package inheritance;

public class Programmer extends Employee {
	String proglang;
	int bonus;
	String project;
	
	void print() {
//		print(); //stack overflow
		printing();
//		super.print();
		System.out.println("Programming language: "+ proglang);
		System.out.println("Bonus: "+ bonus);
		System.out.println("Project: "+ project);
	}
}
