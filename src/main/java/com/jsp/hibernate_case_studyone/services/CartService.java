package com.jsp.hibernate_case_studyone.services;

import java.util.Scanner;
import com.jsp.hibernate_case_Study.enitity.Cart;
import com.jsp.hibernate_case_Study.enitity.Product;
import com.jsp.hibernate_case_study1.dao.CartDao;
import com.jsp.hibernate_case_study1.dao.ProductDao;

public class CartService {
	static Scanner sc = new Scanner(System.in);
	 
	 private CartDao cartdao;
	public void setCartdao(CartDao cartdao) {
		this.cartdao = cartdao;
	}
	public static void createCart() {
		System.out.println("Enter cartId");
		int id=sc.nextInt();
		
		Cart cart=new Cart();
		cart.setCartId(id);
		
		String message=CartDao.addProductToCort();
		System.out.println(message);
		
		
	}
	public static void getCart() {
		System.out.println(" Enter id");
		int id=sc.nextInt();
		
		Cart cart=CartDao.getCartById(id);
		System.out.println(cart.getCartId());
		
	   }

	public static void deleteCart() {
		
		System.out.println("Enter the Cart Id for delete");
		int cid = sc.nextInt();
		Cart cart = CartDao.getCartById(cid);
		if (cart != null)
			CartDao.deleteCart(cart);
		else
			System.err.println("Invalid Cart id");
	}

	public static void updateCart() {
		
		System.out.println("Enter the Cart Id for Updation");
		int cid = sc.nextInt();
		Cart cart = CartDao.getCartById(cid);
		if (cart != null) {
			System.out.println("Enter the New Cart Id");
			int newCid = sc.nextInt();
			cart.setCartId(newCid);
			CartDao.updateCart(cart);
		} else {
			System.out.println("Invalid Cart id");
		}
	}
   
	public static  void removeProduct() {
		
		System.out.println("Enter productId to remove product from cart");
		int id=sc.nextInt();
		
		Product product=ProductDao.getProductById(id);
		if(product!=null) {
			
		String message=ProductDao.deleteProductById(product);
		System.out.println("product is deleted");
		
		}
		else {
			System.err.println("product is not there");
		}
		
		
	}

}
