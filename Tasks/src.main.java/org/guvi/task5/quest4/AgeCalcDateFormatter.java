package org.guvi.task5.quest4;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.Scanner;

public class AgeCalcDateFormatter {
	
	public static void main(String[] args) {
		
		String[] dateFormatsToTry = {"dd/MM/yyyy", "dd-MM-yyyy", "MM-dd-yyyy", "MM/dd/yyyy", 
				"yyyy/MM/dd", "yyyy-MM-dd", "ddMMyyyy"};
		
		Scanner input = new Scanner(System.in);
		System.out.println("Enter your BirthDate: ");
		String enteredBirthDate = input.next();
		
		LocalDate birthDate = null;
		
		for(String format : dateFormatsToTry){
			try{
				DateTimeFormatter formatter = DateTimeFormatter.ofPattern(format);
				birthDate = LocalDate.parse(enteredBirthDate, formatter);
				break;
			} catch (DateTimeParseException e) {
				//System.out.println(e.getMessage());
			}
		}
		
		if(birthDate != null){
			LocalDate currentdate = LocalDate.now();
			Period period = Period.between(birthDate, currentdate);
			int year = period.getYears();
			int month = period.getMonths();
			int days = period.getDays();
			System.out.println("Age: "+year+ " years, "+month+" months, and "+days+ " days.");
		}
		
		input.close();
	}

}
