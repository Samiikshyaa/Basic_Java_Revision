package constructor;

public class UserTest {
	public static void main(String[] args) {
		User u = new User();
		u.psw = "S12";
		u.print();
		User u1 = new User("Hari","H123");
		u1.print();
		
	}
}
