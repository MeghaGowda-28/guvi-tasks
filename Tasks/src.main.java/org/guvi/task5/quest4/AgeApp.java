package org.guvi.task5.quest4;

import java.util.Scanner;

public class AgeApp {
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter your birthdate (yyyy-mm-dd): ");
		String birthDate = input.next();
		
		input.nextLine();
		
		int year = 0;
		int month = 0;
		int date = 0;
		
		System.out.print("\nYour age is: "+year+" years, "+month+" months, and "+date+" days.");
		
		input.close();
	}

}
