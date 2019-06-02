package com.techelevator.bank;

import java.math.BigDecimal;

public abstract class Account {
	
	private String accountNumber;
	
	public String retrieveAccountOwner(String id) {
		return null;
	}
	
	public abstract BigDecimal calculateInterestRate();
	
	
	public final String dontChangeMe() {
		return "kjhjkhjkh";
	}
	
	
	

}
