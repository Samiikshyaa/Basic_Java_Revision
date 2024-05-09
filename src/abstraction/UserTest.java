package abstraction;

public class UserTest {
	
	public static void main(String[] args) {
		UserService us = new UserServiceImpl();
		us.addUser();
		us.deleteUser();
	}
}
