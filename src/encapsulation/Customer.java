package encapsulation;

public class Customer {
	private int id;
	private String name;
	private String phone;
	private int age;
	private String city;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	@Override
	public String toString() {
		return "Customer [id=" + id + ", name=" + name + ", phone=" + phone + ", age=" + age + ", city=" + city + "]";
	}
	
	void print() {
		System.out.println("ID: "+getId());
		System.out.println("Name "+getName());
		System.out.println("Phone "+getPhone());
		System.out.println("Age "+getAge());
		System.out.println("City "+getCity());
	}
}
