package com.BOB.entities;

public class RunBankApp {

	public static void main(String[] args) {
		AccountCreation ac=new AccountCreation();
		AccountDeletion ad=new AccountDeletion();
		WithdrawnTransaction wt=new WithdrawnTransaction();
		CheckAccBal cab=new CheckAccBal();
		
		Account a1=ac.createAccount("Nitin ", 100000);
		
		cab.viewBalance(a1);
		wt.withdraw(a1, 50000);
		cab.viewBalance(a1);
		
		ad.deleteAccount(a1);
		cab.viewBalance(a1);
		wt.withdraw(a1, 1000.00);

	}

}
