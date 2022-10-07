package com.somebank.bank.special;

import com.somebank.bank.model.Account;

public class SpecialAccount extends Account {

	/*
	 * Test for an unique account that could be done if needed
	 */
	public SpecialAccount(int agency, int number) {
		super(agency, number);
	}

	@Override
	public void deposit(double value) {
		super.balance += value;

	}

}
