package com.somebank.bank.model;

public class TaxCalculator {

	private double totalTax;

	/*
	 * Setting up a class to control all the taxes that would need to be controled.
	 * 
	 * similar to "BonusControl.java" in the last project
	 * ("04-OO_Inheritance")
	 */
	public void register(Taxable t) {
		double value = t.getValueTax();
		this.totalTax += value;
	}

	public double getTotalTax() {
		return totalTax;
	}

}
