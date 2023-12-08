package com.BOB.entities;

public class WithdrawnTransaction {
	public void withdraw(Account account, double amount) {
		if(account.getIsActive()) {
			if(account.getAccbal()>amount) {
				account.setAccbal(account.getAccbal()-amount);
				System.out.println("Withdraw Rs "+amount+" success");
			}
			else {
				System.out.println("Withdraw Failed:due to ");
			}
		}
		else {
			System.out.println("Account is inactive ,cannot do withdraw");
		}
	}
}
