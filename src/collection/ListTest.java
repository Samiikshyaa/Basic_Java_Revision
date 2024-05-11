package collection;

import java.util.ArrayList;
import java.util.List;

public class ListTest {
	
	public static void main(String[] args) {
		List<Employee> emp = new ArrayList<>();
		
		Employee e1 = new Employee();
		e1.setId(1);
		e1.setName("Ram");
		e1.setPost("CEO");
		
		emp.add(e1);
		
		Employee e2 = new Employee();
		e2.setId(2);
		e2.setName("Ramu");
		e2.setPost("Vice chairman");
		
		emp.add(e2);
		
		System.out.println(emp);
		System.out.println("\n");
		
		for(Employee e : emp) {
			System.out.println(e);
			
		}
		
	}
}
