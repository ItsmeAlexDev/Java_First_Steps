package com.somebank.bank.model;

public class LifeInsurance implements Taxable {

	/*
	 * Just Testing something that implements "Taxable"
	 */
	@Override
	public double getValueTax() {
		return 42;
	}

}
