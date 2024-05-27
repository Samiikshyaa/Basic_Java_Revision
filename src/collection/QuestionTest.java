package collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class QuestionTest {
	public static void main(String[] args) {
		List<Integer> values = new LinkedList<>() {{ add(25); add(35); add(46); }};
		int sorted = 0;
		values.add(20);
		values.add(50);
		values.add(30);
		
		System.out.println(values);
		
		sorted = Collections.max(values);
		System.out.println(sorted);
//		System.out.println(sorted.get(sorted.size() -1));
	}
}
