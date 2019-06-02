package com.techelevator.bank;

import java.util.ArrayList;
import java.util.List;

public class BankApp {

	public static void main(String[] args) {
		
		
		CheckingAccount checking = new CheckingAccount();
		checking.writeCheck();
		CreditAccount credit = new CreditAccount();
		
		List<Account> myist = new ArrayList<Account>();
		
		
		Account account = new CheckingAccount();

		Account account2 = new CreditAccount();
		
		
		CheckingAccount newAccount = (CheckingAccount)account;

		
		
		
		
		
		
		
		


	}

}
