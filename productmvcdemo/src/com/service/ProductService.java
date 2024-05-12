package com.service;

import java.util.List;

import com.model.Product;

public interface ProductService {
	
	void add();
	void delete();
	List<Product> getProduct();
}
