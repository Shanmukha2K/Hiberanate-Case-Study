package com.jsp.hibernate_case_study1.dao;

import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.jsp.hibernate_case_Study.enitity.Cart;
import com.jsp.hibernate_case_Study.enitity.Product;

public class CartDao {
 
	  static Scanner sc=new Scanner(System.in);
	 static Configuration cfg=new Configuration().configure().addAnnotatedClass(Cart.class).addAnnotatedClass(Product.class);
     static SessionFactory sf = cfg.buildSessionFactory();
	

		public static  void deleteCart(Cart cart) {
			
			Session session = sf.openSession();
			Transaction tr=session.beginTransaction();
			session.delete(cart);
			tr.commit();
		}
		public static  void updateCart(Cart cart) 
		{
			Session session=sf.openSession();
			Transaction transaction =session.beginTransaction();
			session.update(cart);
			transaction.commit();
			session.close();
		}
		public static  Cart getCartById(int id) 
		{
			Session session=sf.openSession();
			Transaction transaction =session.beginTransaction();
			Cart cart=session.get(Cart.class, id);
			session.close();
			transaction.commit();
			
			return cart;
			
		}
	public  static String addProductToCort() {
		
		Session session=sf.openSession();
		Transaction tran =session.beginTransaction();
        System.out.println("Enter id to be Add");
        int id=sc.nextInt();
		return "Sucessfully";
		
        
	
	}
	public void removeProductFromCort() {
		
		Session session=sf.openSession();
		Transaction tran =session.beginTransaction();
		
	}
	
	
	
}