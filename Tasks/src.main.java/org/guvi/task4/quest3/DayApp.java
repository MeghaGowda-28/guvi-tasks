package org.guvi.task4.quest3;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class DayApp {
	
	public static void main(String[] args) throws Exception {
		
		List<String> daysList = Arrays.asList("Sunday", "Monday", "Tuesday", 
				"Wednesday", "Thursday", "Friday", "Saturday");
		
		Scanner input = new Scanner(System.in);
		int index = input.nextInt();
		
		try{
			System.out.println(daysList.get(index));
			input.close();
		}catch (Exception e){
			throw new Exception("Array index should range between 0 to 6 only");
		}
	}

}
