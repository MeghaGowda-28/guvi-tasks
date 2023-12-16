package org.guvi.task4.quest4;

import java.util.HashMap;
import java.util.Map;

public class StudentApp {
	
	public static void main(String[] args) throws Exception {
		
		Student student1 = new Student("Megha", 90);
		Student student2 = new Student("Shetty", 86);
		Student student3 = new Student("Priya", 60);
		Student student4 = new Student("Aishu", 80);
		
		Map<String, Integer> studentMap = new HashMap<>();
		
		addStudent(studentMap, student1);
		addStudent(studentMap, student2);
		addStudent(studentMap, student3);
		addStudent(studentMap, student4);
		removeStudent(studentMap, student4);
		getStudentGrade(studentMap, student1);
		
		System.out.println(studentMap);
	}
	
	private static void addStudent(Map<String, Integer> studentMap, Student student) {
		studentMap.put(student.getName(), student.getGrade());
	}
	
	private static void removeStudent(Map<String, Integer> studentMap, Student student) throws Exception {
		if(studentMap.get(student.getName()) != null){
			studentMap.remove(student.getName());
		} else {
			throw new Exception("No such record found to perform deletion");
		}
	}
	
	private static void getStudentGrade(Map<String, Integer> studentMap, Student student) throws Exception {
		if(studentMap.get(student.getName()) != null){
			System.out.println(studentMap.get(student.getName()));
		} else {
			throw new Exception("No record found with Student name: "+student.getName()+ " to fetch their grade");
		}
	}
	
}
