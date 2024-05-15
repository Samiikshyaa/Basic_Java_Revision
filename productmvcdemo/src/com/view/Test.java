package com.view;

import java.util.List;
import java.util.Scanner;

import com.model.Product;
import com.service.ProductService;
import com.service.ProductServiceImpl;

public class Test {

	public static void main(String[] args) {
//		add();
		getAll();
		delete();
		getAll();   //after deleted
//		getAll();
	}
	
	
//	add product
	static void add() {
		ProductService ps = new ProductServiceImpl();
		char flag='y';
		Scanner  sc = new Scanner(System.in);
		
		
		do {
		Product p = new Product();
		
		System.out.println("Enter id");
		p.setId(sc.nextInt());
		
		System.out.println("Enter name");
		p.setName(sc.next());
		
		System.out.println("Enter price");
		p.setPrice(sc.nextInt());
		
		System.out.println("Enter company");
		p.setCompany(sc.next());
		
		ps.addProd(p);
		
		System.out.println("Do you want to add more? [y/n] ");
		flag = sc.next().charAt(0);
		
		}while(flag == 'y');
	}
	
// delete product
	static void delete() {
		ProductService ps = new ProductServiceImpl();
		Scanner sc =  new Scanner(System.in);
		System.out.println("Enter the id you want to delete: ");
		int s = sc.nextInt();
		ps.deleteProd(s);
	}	
	
// get all products	
	static void getAll() {
		ProductService ps = new ProductServiceImpl();
//		List<Product> plist = ps.getAllProducts();
//		System.out.println(plist);
		ps.getProduct();
	}
}




