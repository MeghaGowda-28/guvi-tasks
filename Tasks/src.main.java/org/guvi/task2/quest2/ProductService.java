package org.guvi.task2.quest2;

import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class ProductService {
	
	void acceptFiveProductDetails(List<Product> productsList) {
		
		Scanner input = new Scanner(System.in);
		for(int i=1 ; i<=5; i++){
			System.out.println("Enter Product"+i+" details: (ProdId Price Quantity)");
			int pId = input.nextInt();
			double price = input.nextDouble();
			int quantity = input.nextInt();
			Product product = new Product(pId, price, quantity);
			productsList.add(product);
		}
		input.close();
	}
	
	void getProdIdWithHighestPrice(List<Product> productsList) {
		
		Comparator<Product> comparator = Comparator.comparingDouble(Product::getPrice);
		productsList.sort(comparator);
		 
		System.out.println("\nProduct's Id with holding highest Price is: "
				+productsList.get(productsList.size()-1).getpId());
		
	}

	public void getTotalAmount(List<Product> productsList) {
		
		double totalAmount = 0;
		
		for(Product product : productsList){
			double productPrice = 0;
			productPrice = product.getPrice()*product.getQuantity();
			totalAmount = totalAmount + productPrice;
		}
		System.out.println("\nTotal Amount for all the Products listed : Rs." +totalAmount);
	}

}
