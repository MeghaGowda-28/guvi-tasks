package org.guvi.task2.quest4;

public class DetailApp {
	
	public static void main(String[] args) {
		
		Employee employee = new Employee("Megha", 23, 12345, 500000.987);
		
		System.out.println("Person's details: ");
		System.out.println("Name: "+employee.getName());
		System.out.println("Age: "+employee.getAge());
		System.out.println("Employee Id: "+employee.getEmpId());
		System.out.println("Salary: "+employee.getSalary());
		
	}

}
