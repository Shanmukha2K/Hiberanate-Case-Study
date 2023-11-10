package com.jsp.hibernate_case_study_1;

import java.util.Scanner;

import com.jsp.hibernate_case_study1.dao.ProductDao;
import com.jsp.hibernate_case_studyone.services.CartService;
import com.jsp.hibernate_case_studyone.services.ProductService;

public class App {
	
	public static void main(String[] args) {
		
		ProductService productservice=new ProductService();
		CartService cartservice=new CartService();
		Scanner sc=new Scanner(System.in);
		System.out.println("1.Enter 1 to save data\n2.Enter 2 to get product by id\n3.Enter 3 to get All products\n4.Enter 4 to update product\n5.Enter 5 to Delete product"
				+"\n6.CreateCart\n7.GetCartById\n8.DeleteCartById\n9.updateCart\n10.RemoveProductFromCart");
		int choice=sc.nextInt();

		switch (choice) {
		case 1:productservice.addProduct();
		break;
		case 2:productservice. getAllProduct();
		break;
		case 3:productservice. getProduct();
		break;
		case 4:productservice.updateProduct();
		break;
		case 5:productservice.deleteProduct();
		break;
		case 6: CartService.createCart();
		break;
		case 7:CartService.getCart();
		break;
		case 8:CartService.deleteCart();
		break;
		case 9:CartService.updateCart();
		break;
		case 10:CartService.removeProduct();
		break;

		default:System.out.println("Invalid choice");
			
		
		}
		
	}

}
