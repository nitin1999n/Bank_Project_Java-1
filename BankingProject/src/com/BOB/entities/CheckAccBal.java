package com.BOB.entities;

public class CheckAccBal {
	public void viewBalance(Account account) {
		if(account.getIsActive()) {
			System.out.println("Account Balance: "+account.getAccbal());
		}
		else {
			System.out.println("Account is not active");
		}
	}
}
