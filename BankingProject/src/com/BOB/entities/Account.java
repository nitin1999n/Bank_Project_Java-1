package com.BOB.entities;

public class Account {
	private final int accnum;
	private double accbal;
	private String custname;
	private boolean IsActive;
	
	public Account(int accnum, double accbal, String custname, boolean IsActive) {
		this.accnum = accnum;
		this.accbal = accbal;
		this.custname = custname;
		this.IsActive = IsActive;
	}
	public double getAccbal() {
		return accbal;
	}
	public void setAccbal(double accbal) {
		this.accbal = accbal;
	}
	public String getCustname() {
		return custname;
	}
	public void setCustname(String custname) {
		this.custname = custname;
	}
	public boolean IsActive() {
		return IsActive;
	}
	public void setIsActive(boolean IsActive) {
		this.IsActive = IsActive;
	}
	public int getAccnum() {
		return accnum;
	}
	public boolean getIsActive() {
		return true;
	}
	
	
}
