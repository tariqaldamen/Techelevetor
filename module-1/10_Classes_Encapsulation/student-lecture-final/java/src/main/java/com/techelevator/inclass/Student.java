package com.techelevator.inclass;

public class Student {
	
	
	private static final int CLASS_SECTION = 200;
	private String firstName;
	private String lastName;
	private int age;
	private String ssn;
	private String misc;


	public Student(String firstName, String lastName, int age, String ssn) {
		this.age = age;
		this.firstName = firstName;
		this.lastName = lastName;
		if (validateSSN(ssn)) {
		   this.ssn = ssn;
		} 
		else {
			//throw new Exception
			System.out.println("Try again... Wrong data dummy!");
		}
	}
	
	public Student(String firstName, String lastName) {
		this.firstName = firstName;
		this.lastName = lastName;
	}
	
	private boolean validateSSN(String ssn) {
		if (ssn.length() > 9) {
		     return true;
		}
		else {
			return false;
		}
	}
	
	public String doSomething(int i) {
		//didn't do anything 
		misc = "i am local";
		return "I am here " + i + misc;
	}
	

	public String getFirstName() {
		return firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public int getAge() {
		return age;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	
	
	

}
