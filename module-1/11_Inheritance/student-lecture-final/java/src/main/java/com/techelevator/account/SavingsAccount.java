package com.techelevator.account;

public class SavingsAccount extends Account{
	
	private double withDrawLimit;
	
	public SavingsAccount(String accountNumber, double balance) {
		super(accountNumber, balance);
	}
	
	public double calculateFees() {
		return super.calculateFees() + 1000;
	}
	
	
	

}
