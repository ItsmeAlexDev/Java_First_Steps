package com.somebank.bank.model;

public class SavingsAccount extends Account {
	
	/*
	 * Account type that extends Account with pretty much no changes at all
	 */
	public SavingsAccount(int agency, int number) {
		super(agency, number);
	}
	
	//Overriding the methods that need to be Overrided
	@Override
	public void deposit(double value) {
		super.balance += value;	
	}
	
	@Override
	public String toString() {
		return "SavingsAccount, " + super.toString();
	}
	
}
