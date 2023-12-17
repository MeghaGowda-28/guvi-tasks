package org.guvi.task2.quest1;

public class Person {
	
	private String name;
	private int age;
	
	public Person(String name) {
		this.name = name;
		this.age = 18; // default age set to 18
	}
	
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	void displayDetails(Person person){
		System.out.println("Person detail: \nName : "+person.name+"\nAge: "+person.age+"\n");
	}
	
}
