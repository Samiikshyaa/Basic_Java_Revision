package com.service;

import java.util.List;

import com.model.Product;

public interface ProductService {
	
	void add(Product p);
	void delete(int index);
	List<Product> getProduct();
}
