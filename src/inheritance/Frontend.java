package inheritance;

public class Frontend extends Programmer{
	String department;
	
	void print () {
//		printing();
		super.print();
		System.out.println("Department: "+department);
	}
}
