package com.service;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;


import com.model.Product;

public class ProductServiceImpl implements ProductService {

//	static List <Product> plist = new ArrayList<>(); without jdbc
	
	@Override
	public void addProd(Product p) {
//		plist.add(p); //without jdbc
//		System.out.println("Product added"+ plist.size());		
		
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/testdb", "root", "12345");
			
			String sql = "insert into product(name,company,price) values(,'"+p.getName()+"','"+p.getCompany()+"','"+p.getPrice()+"')";
			Statement stm = con.createStatement();
			stm.execute(sql);
			con.close();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		System.out.println("Product added ");
	}

	@Override
	public void deleteProd(int index) {
//		plist.remove(index);			without jdbc
//		System.out.prSintln(" Product Deleted ");
		
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/testdb", "root", "12345");
			
			String sql = "Delete from product where id = '"+index+"'";
			Statement stm = con.createStatement();
			stm.execute(sql);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		System.out.println("Product Deleted ");
	}

	@Override
	public void getProduct() {

//		return plist;	without jdbc
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/testdb","root","12345");
			
			String sql = "Select * from product";
			Statement stm = con.createStatement();
			ResultSet rs = stm.executeQuery(sql);
			
			while(rs.next()) {
				System.out.println("Id: "+rs.getInt("id"));
				System.out.println("Name: "+rs.getString("name"));
				System.out.println("Price: "+rs.getString("price"));
				System.out.println("Company: "+rs.getString("company"));
				System.out.println("--------------------------");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
