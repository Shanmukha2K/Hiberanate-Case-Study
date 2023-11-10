package com.jsp.hibernate_case_studyone.services;

import java.util.List;
import java.util.Scanner;

import com.jsp.hibernate_case_Study.enitity.Product;
import com.jsp.hibernate_case_study1.dao.ProductDao;

public class ProductService {

	Scanner input=new Scanner(System.in);
//	ProductDao productDao=new ProductDao();
	
	 private ProductDao productDao;
	 
	public void setProductDao(ProductDao productDao) {
		this.productDao = productDao;
	}

	public void addProduct() {
		
		System.out.println("Enter product name");
		String name=input.next();
		
		System.out.println("Enter product price");
		double price=input.nextDouble();
		
		System.out.println("Enter product quantity");
		int quantity=input.nextInt();
		
		Product product=new Product();
		product.setProductName(name);
		product.setProductPrice(price);
		product.setProductQuaninty(quantity);
		
		String message=productDao.addProduct(product);
		System.out.println(message);
	}
	
	 public void getAllProduct() {
		 
		 List<Product> product=productDao.getAllProduct();
		 for(Product product1:product) {
			 
			 System.out.println(product1.getProductId()+" "+product1.getProductName()+" "+product1.getProductPrice()+" "+product1.getProductQuaninty());
		 }
		  
 }
	
	 public void getProduct() {
		 
		 System.out.println("Enter id");
		 int id=input.nextInt();
		 
		 Product product=productDao.getProductById(id);
		 System.out.println(product.getProductName()+" "+product.getProductPrice()+" "+product.getProductQuaninty());
		 

	 }
	
	public void updateProduct() {
		
		System.out.println("Enter the Product Id to update");
		int id=input.nextInt();
		
		Product product=productDao.getProductById(id);
		if(product!=null) {
			System.out.println(product.getProductName()+" "+product.getProductPrice()+" "+product.getProductQuaninty());
			
			System.out.println("Enter product name");
			String name=input.next();
			
			System.out.println("Enter product price ");
			double price=input.nextDouble();
			
			System.out.println("Enter product quantity");
			int quantity=input.nextInt();
			
			product.setProductName(name);
			product.setProductPrice(price);
			product.setProductQuaninty(quantity);
			
			productDao.updateProductById(product);
			
		}
		else {
			System.err.println("product is not there");
		}
	}
	public void deleteProduct() {
		
		System.out.println("Enter id to be Deleted");
		int id=input.nextInt();
		Product product=productDao.getProductById(id);
		if(product!=null) {
			
		String message=productDao.deleteProductById(product);
		System.out.println("product is deleted");
		
		}
		else {
			System.err.println("product is not there");
		}
		
	}
}


