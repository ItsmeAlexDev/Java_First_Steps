package com.sample.stack;
public class TestExceptionChecked {

	public static void main(String[] args) {

		/*
		 * I MUST deal with the checked Exceptions
		 */
		AccountCE ace = new AccountCE();
		try {
			ace.deposit();//method that throws an (checked) exception
		} catch(MyCheckedException ex) {
			System.out.println("tratamento ....");
		}
		
		/*
		 * I dont HAVE to deal with the unchecked Exceptions 
		 */
		AccountUE aue = new AccountUE();
		aue.deposit();//method that throws an (unchecked) exception
	
	}

}
