package encapsulation;

public class CustomerTest {
	
	public static void main(String[] args) {
		Customer c = new Customer();
		c.setId(1);
		c.setName("Samikshya");
		c.setAge(20);
		c.setCity("Noida");
		c.setPhone("9849898410");
		
		c.print();
		
		System.out.println(c.toString());
		
		System.out.println(c);
	}
}
