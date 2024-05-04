package polymorphism;

import java.util.Scanner;

public class ProdTest {
	
	public static void main(String[] args) {
		Product[] products = new Product[5];
		
		Scanner sc = new Scanner(System.in);
		for(int i = 0; i<products.length; i++) {
			Product p = new Product();
			System.out.println("Enter the id: ");
			p.setId(sc.nextInt());
			System.out.println("Enter the name: ");
			p.setName(sc.next());
			System.out.println("Enter the price");
			p.setPrice(sc.nextInt());
			System.out.println("Enter the company");
			p.setCompany(sc.next());
			products[i] = p;
		}
		
		for(Product x: products ){
			System.out.println(x);
		}
		
	}
}
