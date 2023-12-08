package com.BOB.entities;

public class AccountCreation {
	private int randnum=100001;

	Account createAccount (String custnum,double accbal) {
		System.out.println("creating an Account..........");
		Account acc=new Account(randnum++, accbal, custnum, true);
		return acc;
	}
	 
}
