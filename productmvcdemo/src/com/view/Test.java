package com.view;

import java.util.List;

import com.model.Product;
import com.service.ProductService;
import com.service.ProductServiceImpl;

public class Test {
	public static void main(String[] args) {
		add();
		getProduct();
		delete();
		getProduct();
	}

	static void add() {
		ProductService ps = new ProductServiceImpl();
			
		Product p = new Product();
			p.setId(1);
			p.setName("Mobile");
			p.setCompany("Apple");
			p.setPrice(100000);		
		
		ps.addProd(p);
		
		Product p1 = new Product();
		p1.setId(2);
		p1.setName("Laptop");
		p1.setCompany("Lenevo");
		p1.setPrice(70000);		
	
		ps.addProd(p1);
	}
	
	static void delete() {
		ProductService ps = new ProductServiceImpl();
			ps.deleteProd(0);
		
	}
	
	static void getProduct(){
		ProductService ps = new ProductServiceImpl();
		List<Product>	plist = ps.getProduct();
		System.out.println(plist);
	}
}


