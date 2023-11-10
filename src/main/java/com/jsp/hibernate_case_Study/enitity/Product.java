package com.jsp.hibernate_case_Study.enitity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Product {
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Id
	private int productId;
	private String productName;
	private double productPrice;
	private int productQuaninty;
	public int getProductId() {
		return productId;
	}
	public void setProductId(int productId) {
		this.productId = productId;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public double getProductPrice() {
		return productPrice;
	}
	public void setProductPrice(double productPrice) {
		this.productPrice = productPrice;
	}
	public int getProductQuaninty() {
		return productQuaninty;
	}
	public void setProductQuaninty(int productQuaninty) {
		this.productQuaninty = productQuaninty;
	}
	@Override
	public String toString() {
		return "Product [productId=" + productId + ", productName=" + productName + ", productPrice=" + productPrice
				+ ", productQuaninty=" + productQuaninty + "]";
	}
	
	

}
