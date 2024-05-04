package constructor;

public class User {
	String uname;
	String psw;
	

	
	User(String uname,String psw){
//		this();//calling default constructor
		this.uname = uname;
		this.psw = psw;
//		this.print();//calling instance method
		
		
	}
	
	User(){
		this("Sita","Rs123");//calling parameterized constructor
		uname = "Samikshya";
		psw = "T123";
		
	}
	
	void print() {
		
		System.out.println("User Name: "+uname);
		System.out.println("Password: "+psw);
	}
}
