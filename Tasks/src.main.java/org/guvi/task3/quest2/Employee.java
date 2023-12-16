package org.guvi.task3.quest2;

public class Employee implements Taxable{
	
	private int empId;
	private String name;
	private double salary;
	
	public Employee(int empId, String name, double salary) {
		this.empId = empId;
		this.name = name;
		this.salary = salary;
	}

	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}

	@Override
	public double calcTax() {
		double incomeTax = 0;
		incomeTax = salary*(Taxable.incomeTax/100);
		return incomeTax;
	}

}
