package com.somebank.bank.model;

//extends "Exception" so it is a "Checked" exception
public class BalanceNotEnoughException extends Exception {

	// IDK what this thing is, but I will study it later
	// I put it here to get rid of my IDE warning
	private static final long serialVersionUID = 1L;

	/*
	 * Testing my own exception, Following the pattern I could see in other
	 * exceptions
	 */
	public BalanceNotEnoughException(String msg) {
		super(msg);
	}

}
