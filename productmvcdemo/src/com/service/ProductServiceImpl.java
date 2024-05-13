package com.service;

import java.util.ArrayList;
import java.util.List;

import com.model.Product;

public class ProductServiceImpl implements ProductService {

	static List <Product> plist = new ArrayList<>();
	
	@Override
	public void addProd(Product p) {
		
		plist.add(p);
		System.out.println("Product added"+ plist.size());		
	}

	@Override
	public void deleteProd(int index) {
		plist.remove(index);
		System.out.println(" Product Deleted ");
		
	}

	@Override
	public List<Product> getProduct() {
		System.out.println("The products are");
		return plist;	
	}

}
