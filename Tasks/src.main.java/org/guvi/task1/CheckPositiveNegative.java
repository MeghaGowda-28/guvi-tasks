package org.guvi.task1;

import java.util.Scanner;

public class CheckPositiveNegative {
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		int number = input.nextInt();
		if(number < 0){
			System.out.println("Given number is Negative");
		} else {
			System.out.println("Given number is Positive");
		}
		input.close();
	}
	
}
