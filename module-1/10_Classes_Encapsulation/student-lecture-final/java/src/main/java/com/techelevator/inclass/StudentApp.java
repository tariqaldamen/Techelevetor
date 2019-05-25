package com.techelevator.inclass;

public class StudentApp {

	public static void main(String[] args) {
		//we have all the info we need at construction time
		Student s1 = new Student("Billy", "Bob", 15, "111");
		
		System.out.println(Math.PI);
		
		
		System.out.println(s1.doSomething(7));
		
		//we do not have age yet.
		Student s2 = new Student("Barbara", "B");
		s2.setAge(16);


		
		s1.setAge(18);

	//	s2.setFirstName("Barb");

	}

}
