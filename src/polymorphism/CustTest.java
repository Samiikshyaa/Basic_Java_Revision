package polymorphism;

public class CustTest {
		
	public static void main(String[] args) {
		Customer c = new Customer();
		c.setId(12);
		c.setName("Book");
		c.setCity("Kathmandu");
		
		CustTest t = new CustTest();
		t.printCust(c);
		Customer x = t.getCustomer();
		t.printCust(x);
		
		
	}
	//object as return type
	Customer getCustomer() {
		Customer cu = new Customer();
		cu.setId(12);
		cu.setName("Hari");
		cu.setCity("Bhaktapur");
		return cu;
	}
	
	
	//object as parameter
	void printCust(Customer a) {
		System.out.println(a.getId());
		System.out.println(a.getName());
		System.out.println(a.getCity());
	}
}
