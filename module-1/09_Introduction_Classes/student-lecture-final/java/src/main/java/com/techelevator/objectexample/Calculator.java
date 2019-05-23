package com.techelevator.objectexample;

public class Calculator {
	
	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	
	
	public int add (int i, int j) {
		return i + j;
	}
	
	public int add (Integer i, Integer j) {
		return i + j;
	}
	
	
	public int add (int i, int j, int k) {
		return i + j + k;
	}
	
	
	

}
