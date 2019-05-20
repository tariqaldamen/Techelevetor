package com.techelevator;

public class ArrayExample {

	public static void main(String[] args) {
		
		
		//String[] cities = new String[5];
		String[] cities = new String[5];
		
		cities[0] = "Columbus";
		cities[1] = "Cleveland";
		cities[2] = "Boise";
		cities[3] = "Cincinnatti";
		cities[4] = "Youngstown";
		
		//System.out.println(cities.length);
		//System.out.println(cities[0] + cities[1] + cities[2]);
		//cities[0] = "Akron";
		//System.out.println(cities[0]);
		
		
	
		for (int i = cities.length-1; i>=0; i--) {
			System.out.println(cities[i]);
		}
		
		
		
		int[] scores = new int[] { 90, 87, 73, 23, 99, 100, 200, 76, 42 }; 
		
		System.out.println(scores.length);
		
		for (int i=0; i<scores.length; i++) {
			
			if ((scores[i] % 2 == 0) && (scores[i] >= 100 && scores[i] <=200 )) {
			   System.out.println("i: " + i + " " + scores[i]);
			}  
		}
		
		
		

				
		
		

	}

}
