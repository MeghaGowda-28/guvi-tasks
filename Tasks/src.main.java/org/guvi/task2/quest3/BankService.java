package org.guvi.task2.quest3;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.function.Predicate;

public class BankService {
	
	Scanner input = new Scanner(System.in);
	
	private Account checkAccountExists(int accountNumber){
		
		Account account1 = new Account(11111, 20500.34);
		Account account2 = new Account(22222, 500.00);
		Account account3 = new Account(33333, 2500.99);
		Account account4 = new Account(44444, 9876.65);
		Account account5 = new Account(55555, 3467.87);
		
		List<Account> validAccounts = Arrays.asList(account1, account2, account3, account4, account5);
		
		Predicate<Account> predict = account -> account.getAcctNum()==accountNumber;
		for(Account account : validAccounts){
			if(predict.test(account)){
				return account;
			}
		}
		return null;
	}
	
	public void depositAmount(){
		
		System.out.println("Enter Account Number: ");
		int acctNum = input.nextInt();
		Account account = checkAccountExists(acctNum);
		if(account != null){
			System.out.println("Enter Amount to deposit: ");
			double amount = input.nextDouble();
			System.out.println("Balance before deposit attempt: "+account.getBalance());
			if(account.getBalance() != 0){
				account.setBalance(account.getBalance()+amount);
			} else {
				account.setBalance(amount);
			}
			System.out.println("Amount deposit Successfull :)\nCurrent Balance: "+account.getBalance());
			
		} else {
			System.out.println("\nAccount Not Found :(\nCheck Account number or Create new Account");
		}
		input.close();
	}

	public void withdrawAmount() {
		
		System.out.println("Enter Account Number: ");
		int acctNum = input.nextInt();
		Account account = checkAccountExists(acctNum);
		if(account != null){
			System.out.println("Enter Amount to withdraw: ");
			double amount = input.nextDouble();
			System.out.println("Balance before withdraw attempt: "+account.getBalance());
			if(account.getBalance() != 0 && account.getBalance() > amount){
				account.setBalance(account.getBalance()-amount);
				System.out.println("\nAmount Withdrawn Successfully :)\nCurrent Balance: "+account.getBalance());
			} else {
				System.out.println("\nInsufficient balance, Withdraw Unsuccessfull :(");
			}
		} else {
			System.out.println("Account Not Found :(\nCheck Account number or Create new Account");
		}
		input.close();
	}

	public void getBalance() {
		
		System.out.println("Enter Account Number: ");
		int acctNum = input.nextInt();
		Account account = checkAccountExists(acctNum);
		if(account != null){
			System.out.println("Balance for Account "+acctNum+ " is: "+account.getBalance());
		} else {
			System.out.println("Account Not Found :(\nCheck Account number or Create new Account");
		}
		input.close();
		
	}
	
}
