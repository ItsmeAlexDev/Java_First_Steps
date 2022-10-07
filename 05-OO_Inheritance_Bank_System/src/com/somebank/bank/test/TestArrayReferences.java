package com.somebank.bank.test;

import com.somebank.bank.model.Client;
import com.somebank.bank.model.CheckingAccount;
import com.somebank.bank.model.SavingsAccount;

public class TestArrayReferences {
	
	public static void main(String[] args) {
		
		/*
		 * Testing references and arrays
		 * 
		 * when one does say "this object is inside that"
		 * in java, this would be wrong, it's a reference
		 * that is usually put on the place needed, not the whole object
		 * 
		 * an Object can have multiple references
		 */
		Object[] references = new Object[5];
		
		System.out.println(references.length);
		
		CheckingAccount ca1 = new CheckingAccount(22, 11);
		references[0] = ca1;
		
		SavingsAccount sa2 = new SavingsAccount(22, 22);
		references[1] = sa2;	
		
		Client client = new Client();
		references[2] = client;
		
		
		
		SavingsAccount ref = (SavingsAccount) references[1];
		System.out.println(sa2.getNumber());
		System.out.println(ref.getNumber());
		
	}

}
