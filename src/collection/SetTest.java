package collection;

import java.util.Set;
import java.util.TreeSet;

public class SetTest {
	public static void main(String[] args) {
		Set<Integer> emp = new TreeSet<>();
		
		
		Employee e1 = new Employee();
		e1.setId(1);
		e1.setName("Raju");
		e1.setPost("CEO");
		e1.setSalary(2000);
		
		Employee e2 = new Employee();
		e2.setId(1);
		e2.setName("Raju");
		e2.setPost("CEO");
		e2.setSalary(3000);
		
		Employee e3 = new Employee();
		e3.setSalary(2000);
		
		int a=e1.getSalary();
		emp.add(a);
		emp.add(e2.getSalary());
		emp.add(e3.getSalary());
		
		for(int e: emp) {
			System.out.println(e);
		}
	}
}
