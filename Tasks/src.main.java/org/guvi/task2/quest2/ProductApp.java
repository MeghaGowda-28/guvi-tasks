package org.guvi.task2.quest2;

import java.util.ArrayList;
import java.util.List;


public class ProductApp {
	
	public static void main(String[] args) {
		
		List<Product> productsList = new ArrayList<>();
		
		ProductService service = new ProductService();
		
		service.acceptFiveProductDetails(productsList);
		
		service.getProdIdWithHighestPrice(productsList);
		
		service.getTotalAmount(productsList);
	}
}
