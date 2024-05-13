package com.service;

import java.util.List;

import com.model.Product;

public interface ProductService {
	
	void addProd(Product p);
	void deleteProd(int index);
	List<Product> getProduct();
}
