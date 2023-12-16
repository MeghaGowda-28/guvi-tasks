package org.guvi.task5.quest3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Teacher {
	
	public static void main(String[] args) {
		
		List<String> studentNames = Arrays.asList("Abhi", "Megha", "Kantha", "Aditya", "Karunya", "Amogha", 
				"Namitha", "Abdul", "Jaanu", "Keerthi", "Manju", "Ganesh", "Hanumantha", "Ananya", 
				"Koushik", "Balaji", "Namratha", "Nuthan", "Anmol");
		
		List<String> studentsChosenToGift = new ArrayList<>();
		
		studentNames.stream().filter(name -> name.startsWith("A"))
			.forEach(name -> studentsChosenToGift.add(name));
		
		System.out.println("Students chosen to get special gift from Teacher are : "+studentsChosenToGift);
	}

}
