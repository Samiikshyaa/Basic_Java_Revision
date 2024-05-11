package collection;

import java.util.Objects;

public class Dog {
	private String name;
	private int age;
	private String features;

	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public int getAge() {
		return age;
	}


	public void setAge(int age) {
		this.age = age;
	}


	public String getFeatures() {
		return features;
	}


	public void setFeatures(String features) {
		this.features = features;
	}

/*	In a set, each element must be unique based on the criteria defined by its equals() and hashCode() methods. 
	In Java, if you want to ensure uniqueness based on specific attributes, you need to override these methods accordingly. 
	Since we're dealing with a set of dogs, let's assume that dogs are unique based on their names, ages, and colors. 
*/
	
	@Override
	public int hashCode() {
		return Objects.hash(age, features, name);
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Dog other = (Dog) obj;
		return Objects.equals(age, other.age) && Objects.equals(features, other.features)
				&& Objects.equals(name, other.name);
	}


	@Override
	public String toString() {
		return "Dog [name=" + name + ", age=" + age + ", features=" + features + "]";
	}
	
	

}
