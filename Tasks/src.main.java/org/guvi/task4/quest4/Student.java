package org.guvi.task4.quest4;

public class Student {
	
	public Student(String name, int grade) {
		this.name = name;
		this.grade = grade;
	}
	
	private String name;
	private int grade;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getGrade() {
		return grade;
	}
	public void setGrade(int grade) {
		this.grade = grade;
	} 

}
