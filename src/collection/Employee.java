package collection;

public class Employee {
	private int Id;
	private String name;
	private String post;
	public int getId() {
		return Id;
	}
	public void setId(int id) {
		Id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPost() {
		return post;
	}
	public void setPost(String post) {
		this.post = post;
	}
	@Override
	public String toString() {
		return "Employee [Id=" + Id + ", name=" + name + ", post=" + post + "]";
	}
	
}
