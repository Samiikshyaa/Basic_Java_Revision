package com.service;


import com.model.Product;

public interface ProductService {
	
	void addProd(Product p);
	void deleteProd(int index);
	void getProduct();
}
