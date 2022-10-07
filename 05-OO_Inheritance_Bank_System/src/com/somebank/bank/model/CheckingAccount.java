package com.somebank.bank.model;

public class CheckingAccount extends Account implements Taxable {

	/*
	 * Basically this is the same thing as a "normal" Account
	 * but with little changes, like a 0.2 tax on the withdrawal
	 */
	public CheckingAccount(int agency, int number) {
		super(agency, number);
	}
	
	@Override
	public void withdrawal(double value) throws BalanceNotEnoughException{
		double valueToWithdrawal = value + 0.2;
		super.withdrawal(valueToWithdrawal);
	}

	@Override
	public void deposit(double value) {
        super.balance += value;
    }

	@Override
	public double getValueTax() {	
		return super.balance * 0.01;
	}
	
	@Override
	public String toString() {
		return "CheckingAccount, " + super.toString();
	}
	
}
