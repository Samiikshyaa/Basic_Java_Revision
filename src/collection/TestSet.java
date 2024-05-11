package collection;

import java.util.HashSet;
import java.util.Set;

public class TestSet {
	public static void main(String[] args) {
		Set<Dog> dogs = new HashSet<>();
		
		
		for(int i = 0; i<3; i++) {
			Dog d = new Dog();
			if(i==0) {
				d.setName("Pinky");
				d.setAge(5);
				d.setFeatures("furry");
			}
			else{
				d.setName("punto");
				d.setAge(6);
				d.setFeatures("furry & white");
			}
			dogs.add(d);
		}
		
		System.out.println("Dogs: ");
		for(Dog d: dogs) {
			System.out.println(d);
		}
	}
}
