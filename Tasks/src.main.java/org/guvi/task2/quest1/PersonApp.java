package org.guvi.task2.quest1;

public class PersonApp {
	
	public static void main(String[] args) {
		
		Person person1 = new Person("John");
		Person person2 = new Person("Peter", 25);
		
		person1.displayDetails(person1);
		person2.displayDetails(person2);
		
	}

}
