package abstraction;

public class UserServiceImpl implements UserService{
	
	@Override
	public void addUser() {
		System.out.println("Added Success");
		
	}

	@Override
	public void deleteUser() {
		System.out.println("Deletion success");
		
	}
}