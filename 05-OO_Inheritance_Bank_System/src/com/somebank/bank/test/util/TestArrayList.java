package com.somebank.bank.test.util;

import java.util.ArrayList;
import java.util.List;

import com.somebank.bank.model.Account;
import com.somebank.bank.model.CheckingAccount;

public class TestArrayList {

	public static void main(String[] args) {

		/*
		 * Testing "real" lists and not arrays as before
		 * 
		 * There is multiple kinds of lists
		 * basically all kinds of lists extends "List"
		 * "List" is abstract so I can NOT instanciate it directly
		 * but I can use it as a reference to an specific kind of list
		 * (example shown after the comment)
		 * 
		 * There also is "Set", both "Set" and "List" extends "Collection"
		 */
		List<Account> list = new ArrayList<Account>();
		
		Account ca = new CheckingAccount(22, 11);//Creates an account
		list.add(ca);//and puts it on the list
		
		Account ca2 = new CheckingAccount(22, 22);//Creates another account
		list.add(ca2);//and again puts it on the list
		
		System.out.println("Size: " + list.size()); //gets the size of the list, should be 2
		
		list.remove(0);//removes the first item of the list
		
		System.out.println("Size: " + list.size()); //gets the size of the list, should be 1
		
		Account ca3 = new CheckingAccount(33, 311);//Creates 2 new accounts
		list.add(ca3);
		Account ca4 = new CheckingAccount(33, 322);//and puts both of them in the list
		list.add(ca4);
		

		System.out.println("Size: " + list.size()); //gets the size of the list, should be 3
		
		
		/*
		 * Here it's a demonstration on 2 ways of printing out every item on "list"
		 * 
		 * using the for as seen before
		 * 
		 * and using for in a kind of a different way
		 */
		for(int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
		
		System.out.println("--------------------------------------------------");
		
		for(Account account : list) {
			System.out.println(account);
		}
		
		
	}

}


