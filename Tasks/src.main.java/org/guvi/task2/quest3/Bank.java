package org.guvi.task2.quest3;

import java.util.Scanner;

public class Bank {
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		BankService service = new BankService();
		System.out.println("Accounts available to test: 11111, 22222, 33333, 44444, 55555");
		System.out.println("Please do input any one number accordingly: ");
		System.out.println("1 to Deposit Amount");
		System.out.println("2 to Withdraw Amount");
		System.out.println("3 to Check Balance");
		int enteredValue = input.nextInt();
		
		if(enteredValue == 1){
			service.depositAmount();
			
		} else if(enteredValue == 2){
			service.withdrawAmount();
			
		} else if(enteredValue == 3){
			service.getBalance();
		} 
		input.close();
	}

}
