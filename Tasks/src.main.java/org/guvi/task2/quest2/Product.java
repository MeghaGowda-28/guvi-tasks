package org.guvi.task2.quest2;

public class Product {
	
	private int pId;
	private double price;
	private int quantity;
	
	public Product(int pId, double price, int quantity) {
		this.pId = pId;
		this.price = price;
		this.quantity = quantity;
	}
	
	public int getpId() {
		return pId;
	}
	public void setpId(int pId) {
		this.pId = pId;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

}
