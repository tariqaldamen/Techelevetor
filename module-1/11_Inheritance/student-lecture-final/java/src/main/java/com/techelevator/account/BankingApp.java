package com.techelevator.account;

import java.util.ArrayList;
import java.util.List;

public class BankingApp {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		CheckingAccount checking = new CheckingAccount("ABC123", 20);
	
		SavingsAccount savings = new SavingsAccount("CDE123", 100.00);
		
		Account myAccount = new Account("EFGJJJ", 10000.00);

		
		
		List<Account> myListOfAccounts = new ArrayList<Account>();
		myListOfAccounts.add(checking);
		myListOfAccounts.add(savings);
		myListOfAccounts.add(myAccount);
	
		
		for (Account a : myListOfAccounts) {
		        
		
				if (a instanceof CheckingAccount) {
					System.out.println(a.getAccountNumber() + " " + a.getBalance());
					System.out.println("I am a checking account");
				}
				else if (a instanceof SavingsAccount) {
					System.out.println(a.getAccountNumber() + " " + a.getBalance());
					System.out.println("I am a savings account");
				}
				else if (a instanceof Account) {
					System.out.println(a.getAccountNumber() + " " + a.getBalance());
					System.out.println("I am an Account");
				}
				else {
					System.out.println("I am confused");
				}
		
		}
		

	}

}
