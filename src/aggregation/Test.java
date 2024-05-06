package aggregation;

public class Test {
	
	public static void main(String[] args) {
		Car c = new Car();
		c.setCarno("BA-123");
		c.setModel("ASN987");
		c.setCompany("Mercedes");
		c.setColour("Black");
		
		Student s = new Student();
		s.setName("Raj");
		s.setAge(20);
		s.setAddress("Kathmandu");
		s.setCar(c);
		
		System.out.println(s);
		System.out.println(s.getName());
		System.out.println(s.getCar().getCarno());
		System.out.println(s.getCar().getCompany());
	}
}
