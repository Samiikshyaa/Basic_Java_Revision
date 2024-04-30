package basic;

import java.util.Scanner;

public class Hello1 {
	int a = 5;
	static int d = 8;
	static int add() {
		int b; 
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		b = sc.nextInt();
		return (b+8);
	}
	
	public static final  void main(String ram[]) {
		Hello1 h = new Hello1();
		System.out.println(h.a);
		Hello1.d = 6;
		System.out.println(Hello1.d);
		int f = Hello1.add();
		System.out.println(f);
		System.out.println("----------------------------");
		System.out.println("|S.N. | Name   | Age | City|");
		System.out.println("----------------------------");
		System.out.println("|1    | Ram    |  22 | Ktm  |");
		System.out.println("----------------------------");
	}
}
