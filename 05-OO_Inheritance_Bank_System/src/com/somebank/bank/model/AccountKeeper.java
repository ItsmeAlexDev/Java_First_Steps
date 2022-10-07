package com.somebank.bank.model;

public class AccountKeeper {
	
	/*
	 * Testing on how to make a keeper for Accounts (the references for Accounts) 
	 */
	private Account[] references;
	private int freePosition;
	
	public AccountKeeper() {
		this.references = new Account[10];
		this.freePosition = 0;
	}
	
	public void add(Account ref) {
		this.references[this.freePosition] = ref;
		this.freePosition++;
	}

	public int getNumberOfElements() {
		return this.freePosition;
	}

	public Account getReference(int pos) {
		return this.references[pos];
	}
}
