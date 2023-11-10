package com.jsp.hibernate_case_study1.dao;

import java.util.List;
import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

import com.jsp.hibernate_case_Study.enitity.Product;

public class ProductDao {

	Scanner sc=new Scanner(System.in);
	static Configuration cfg=new Configuration().configure().addAnnotatedClass(Product.class);
	static SessionFactory sf = cfg.buildSessionFactory();

	public String addProduct(Product product) {
		Session session=sf.openSession();
		Transaction transaction=session.beginTransaction();
		session.save(product);
		transaction.commit();
		session.close();
		return "Product added successfully";
	}

	@SuppressWarnings("unchecked")
	public List<Product> getAllProduct() {
		Session session=sf.openSession();
		Transaction transaction=session.beginTransaction();
		Query<Product> query=session.createQuery("from Product");
		List<Product> products=query.getResultList();
			transaction.commit();
			session.close();
			return products;
		}
	

	public static Product getProductById(int id) {
		Session session=sf.openSession();
		Transaction transaction=session.beginTransaction();
		Product product=session.get(Product.class, id);
		transaction.commit();
		session.close();
		return product;
	}

	public void updateProductById(Product product) {
		Session session=sf.openSession();
		Transaction transaction=session.beginTransaction();
		session.update(product);
		transaction.commit();
		session.close();
	}


	public static String deleteProductById(Product product) {
		
		Session session=sf.openSession();
		Transaction transaction=session.beginTransaction();
		session.delete(product);
		transaction.commit();
		session.close();
		return "Deleted successfully";
	}
	
}
