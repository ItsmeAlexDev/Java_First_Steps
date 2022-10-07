package com.sample.stack;

public class Connection implements AutoCloseable{
	
	/*
	 * Creating a simulation of what a connection to a server would be
	 * 
	 * Throws exceptions for the tests later on
	 */
	public Connection() {
		System.out.println("Opening connection!");
		throw new IllegalStateException();
	}

	public void readData() {
		System.out.println("Receiving data!");
		throw new IllegalStateException();
	}
	
	//from interface so I must Override close()
	@Override 
	public void close() { 
		System.out.println("Closing connection!");
		
	}
}