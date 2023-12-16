package org.guvi.task3.quest2;

import java.text.DecimalFormat;
import java.util.Scanner;

public class TaxApp {
	
	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter Employee details: (EmpId Name Salary) ");
		int empId = input.nextInt();
		String name = input.next();
		double salary = input.nextDouble();
		
		input.nextLine();
		
		System.out.println("\nEnter Product details: (ProdId Price Quantity)");
		int pId = input.nextInt();
		double price = input.nextDouble();
		int quantity = input.nextInt();
		
		Employee employee = new Employee(empId, name, salary);
		Product product = new Product(pId, price, quantity);
		
		DecimalFormat decimalFormat = new DecimalFormat("#.###");
		
		System.out.println("\nEmployee with Id: "+employee.getEmpId()+ "- Income Tax deducted is Rs."+decimalFormat.format(employee.calcTax()));
		System.out.println("\nProduct with Id: "+product.getpId()+ "- Sales Tax deducted is Rs."+decimalFormat.format(product.calcTax()));
		
		input.close();
	}
}
