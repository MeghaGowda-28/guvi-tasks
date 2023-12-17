package org.guvi.task5.quest4;

import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;

public class AgeCalculator {
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter your birthdate (yyyy-mm-dd): ");
		String birthDate = input.nextLine();
		
		LocalDate parseBirthdate = LocalDate.parse(birthDate);
		
		LocalDate currentDate = LocalDate.now();
		
		Period period = Period.between(parseBirthdate, currentDate);
		
		int year = period.getYears();
		int month = period.getMonths();
		int date = period.getDays();
		
		System.out.print("\nYour age is: "+year+" years, "+month+" months, and "+date+" days.");
		
		input.close();
	}

}
