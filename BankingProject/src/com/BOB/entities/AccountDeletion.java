package com.BOB.entities;

public class AccountDeletion {
	public void deleteAccount(Account account) {
		if(account.getIsActive()) {
			account.setIsActive(false);
			System.out.println("Account Inactivated.......");
		}
	}
}
