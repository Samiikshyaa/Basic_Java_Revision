package basic;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class ArrayInterview {
	public static void main(String[] args){
		int [] numbers = {1,2,3,4,5,1,3,4};
//		Set<Integer> un = new HashSet<>();
//		List<Integer> cn = new ArrayList<>();
		
		Map<Integer, Integer> count = new HashMap<>();
		
		for(int a: numbers) {
			System.out.println(count.containsKey(a));
		
		}
		
		
		System.out.println(count);
		
		
		
		
		
		
		

//		for (int i = 0; i < numbers.length; i++) {
//			un.add(numbers[i]);
//			cn.add(numbers[i]);
//		}
		
		
//		for (int i = 0; i < numbers.length; i++) {
//			
//		}
		
//		System.out.println(un);
//		System.out.println(cn);
	}
}
