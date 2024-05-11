package collection;

//import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class MapTest {
	public static void main(String[] args) {
		Map<Integer, String> emps = new TreeMap<>();
		
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
		e3.setName("Malla Kumar");
		e3.setSalary(1000);
		
		int a=e1.getSalary();
//		emps.put(e1.getName(),a);
//		emps.put(e2.getName(),e2.getSalary());
//		emps.put(e3.getName(),e3.getSalary());
//		
		emps.put(a,e1.getName());
		emps.put(e2.getSalary(),e2.getName());
		emps.put(e3.getSalary(),e3.getName());

		
		for(Integer key : emps.keySet()) {
			System.out.println(key + "="+ emps.get(key));
		}
	}
}
