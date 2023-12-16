package org.guvi.task1;

import java.util.Scanner;

public class DiscountApp {
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		int amount = input.nextInt();
		
		if(amount<=500){
			System.out.println("Amount: "+amount+ "rs");
		} else if(amount>500 && amount<=1000){
			System.out.println("Amount: "+(amount-((amount*10)/100))+ "rs");
		} else {
			System.out.println("Amount: "+(amount-((amount*20)/100))+ "rs");
		}
		
		input.close();
	}

}
