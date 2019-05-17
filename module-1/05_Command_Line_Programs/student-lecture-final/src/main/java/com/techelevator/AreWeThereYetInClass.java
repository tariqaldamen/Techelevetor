package com.techelevator;

import java.util.Scanner;

public class AreWeThereYetInClass {

	public static void main(String[] args) {
	
		try (Scanner in = new Scanner(System.in)) {
		
		boolean isTrue = true;
		
		while (isTrue) {
			
			System.out.println("Are We There Yet? (Y) Yes  (N) No");
			String answer = in.nextLine();
			System.out.println(answer);
			
			
			if(answer.equalsIgnoreCase("Y")) {
				isTrue = false;
			}
			else {
				System.out.println("Why Not?");
				String pleaseExplain = in.nextLine();
				System.out.println(pleaseExplain + "\n");
			}
		}
		
		System.out.println("About time!");
		
		}
		
	}	
		

}
