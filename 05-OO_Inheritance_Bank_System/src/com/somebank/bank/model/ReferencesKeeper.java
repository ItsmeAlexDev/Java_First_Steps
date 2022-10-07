package com.somebank.bank.model;

import java.util.Iterator;

public class ReferencesKeeper implements Iterable<Object> {
	
	/*
	 * Testing how to get references on a "list" 
	 */
	private Object[] references;
	private int freePosition;
	
	public ReferencesKeeper() {
		this.references = new Object[10];
		this.freePosition = 0;
	}
	
	public void add(Object ref) {
		this.references[this.freePosition] = ref;
		this.freePosition++;
	}

	public int getNumberOfElements() {
		return this.freePosition;
	}

	public Object getReference(int pos) {
		return this.references[pos];
	}
	
	//Iterator: was used more commonly quite some time ago, now there is some better ways to do what "Iterator" could do
	@Override
	public Iterator<Object> iterator() {
		return null;
	}
	
}
