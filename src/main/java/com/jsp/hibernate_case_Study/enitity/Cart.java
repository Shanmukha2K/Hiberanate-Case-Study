package com.jsp.hibernate_case_Study.enitity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Cart {
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Id
	private int cartId;
	@OneToMany(fetch = FetchType.EAGER)
	private List<Product> plist=new ArrayList<Product>();
	
	public List<Product> getPlist() {
		return plist;
	}
	public void setPlist(List<Product> plist) {
		this.plist = plist;
	}
	public int getCartId() {
		return cartId;
	}
	public void setCartId(int cartId) {
		this.cartId = cartId;
	}
	@Override
	public String toString() {
		return "Cart [cartId=" + cartId + ", plist=" + plist + "]";
	}
	
	
}
