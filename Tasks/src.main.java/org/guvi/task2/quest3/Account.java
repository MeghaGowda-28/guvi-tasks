package org.guvi.task2.quest3;

public class Account {
	
	private int acctNum;
	private double balance;
	
	public Account() {} // no param constructor
	
	public Account(int acctNum, double balance) {
		this.acctNum = acctNum;
		this.balance = balance;	
	}
	
	public int getAcctNum() {
		return acctNum;
	}
	public void setAcctNum(int acctNum) {
		this.acctNum = acctNum;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	
}
