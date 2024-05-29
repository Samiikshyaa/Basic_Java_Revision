package basic;

import java.util.HashMap;
import java.util.Map;

public class ArrayInterview {
	public static void main(String[] args){
		int [] numbers = {1,2,3,4,5,1,3,4,100,101};
		
		Map<Integer, Integer> count = new HashMap<>();
		
		for(int a: numbers) {
			if(count.containsKey(a)) {
				count.put(a, count.get(a)+1);			
			}
			else {
				count.put(a, 1);
			}
		
		}
		
		
		for(int key: count.keySet()) {
			System.out.println(key + "=" + count.get(key));
		}
		
	}
}
