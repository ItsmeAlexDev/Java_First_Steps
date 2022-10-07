package com.somebank.bank.test;

import com.somebank.bank.model.CheckingAccount;
import com.somebank.bank.model.SavingsAccount;
import com.somebank.bank.model.BalanceNotEnoughException;

public class TestAccounts {

	public static void main(String[] args) throws BalanceNotEnoughException{
		
		/*
		 * Testing the behaviour of accounts, and the interaction between them
		 */
		CheckingAccount ca = new CheckingAccount(111, 111);
		ca.deposit(100.0);
		
		SavingsAccount sa = new SavingsAccount(222, 222);
		sa.deposit(200.0);
		
		ca.transfer(10.0, sa);
		
		System.out.println("CA: " + ca.getBalance());//this value should be 89.8 as this kind of account have a 0.2 tax
		System.out.println("SA: " + sa.getBalance());


	}

}
