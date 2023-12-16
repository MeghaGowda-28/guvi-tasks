package org.guvi.task1;

import java.util.Scanner;

public class ReverseNumber {
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		int number = input.nextInt();
		
		char[] givenNumber = String.valueOf(number).toCharArray();
		
		String reversedNumber = "";
		
		for(int i=0; i<givenNumber.length; i++){
			System.out.print(reversedNumber+(String.valueOf((givenNumber[givenNumber.length-i-1]))));
		}
		
		input.close();
	}

}
