package com.sample.stack;

public class MyUncheckedException extends RuntimeException{ //unchecked
	/*
	 * This exception is checked as it extends Execepion and not RuntimeException
	 * Checked = I MUST deal with
	 * Unchecked = I can deal with, if I want
	 */
	
	private static final long serialVersionUID = 1L;
	
	/*
	 * Creating my own exception for tests 
	 */
	public MyUncheckedException(String msg) {
		super(msg);
	}

}
