package com.techelevator;

import java.util.Scanner;

public class InputASequenceOfNumbersAndParseInClass {
	
	public static void main(String[] args) {
		
		try (Scanner in = new Scanner(System.in)) {
			
			System.out.println("Please enter some numbers separated by a space");
			String numbers = in.nextLine();
			System.out.println(numbers);
			String[] nums = numbers.split(" ");
			
			int sum = 0;
			for (int i=0;i<nums.length;i++) {
				System.out.println(nums[i] + " before");
				
				int myNum = Integer.parseInt(nums[i]);
			
			}
			
			
			
		}
	}
	
}
