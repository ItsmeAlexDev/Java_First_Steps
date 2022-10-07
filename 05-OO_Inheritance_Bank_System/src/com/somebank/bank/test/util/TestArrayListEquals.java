package com.somebank.bank.test.util;

import java.util.ArrayList;

import com.somebank.bank.model.Account;
import com.somebank.bank.model.CheckingAccount;

public class TestArrayListEquals {

	public static void main(String[] args) {

		/*
		 * Testing the behaviour of different and equal elements on lists 
		 */
		ArrayList<Account> list = new ArrayList<Account>();
		
		Account ca = new CheckingAccount(22, 11);//Creates a new and unique account and puts it in the list
		list.add(ca);
		
		Account ca2 = new CheckingAccount(22, 22);//Creates a new and unique account and puts it in the list
		list.add(ca2);
		
		Account ca3 = new CheckingAccount(22, 22);//Creates a non-unique account
		boolean isOnTheList = list.contains(ca3);//Checks if the non-unique account is the list
		
		System.out.println("Is it on the list? " + isOnTheList);//Printing out the result...
		
		/*
		 * ca3 is on the list, because ca2 is on the list and ca3 is equal to ca2
		 * as their agency and number are the same. Criteria that was defined by me
		 */
		
		for(Account account : list) {//lists the item inside the list
			System.out.println(account);
		}
		
	}

}
