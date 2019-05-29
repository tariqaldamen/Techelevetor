package com.techelevator.account;

public class CheckingAccount extends Account {
	
	private int numberOfChecks;
	
	
	
	public CheckingAccount(String accountNumber, int numberOfChecks) {
		super(accountNumber, 0.00);
		this.numberOfChecks = numberOfChecks;

	}
	
	public double calculateFees()  {
		return super.calculateFees() + 100.00;
		
	}



	public int getNumberOfChecks() {
		return numberOfChecks;
	}



	public void setNumberOfChecks(int numberOfChecks) {
		
		this.numberOfChecks = numberOfChecks;
	}
	

	

}
