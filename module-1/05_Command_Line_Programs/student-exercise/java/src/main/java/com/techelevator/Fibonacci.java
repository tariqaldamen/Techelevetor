package com.techelevator;

import java.util.Scanner;

public class Fibonacci {

	public static void main(String[] args) {
		boolean more_bills=true;
		
		
		
		try (Scanner insert=new Scanner(System.in))
		{	while(more_bills) {
			String the_Fibonacci_number ="";
			String chickLoop="";
			int a=0;
			int b=1;
		
			
			System.out.print("Please enter the Fibonacci number: ");
			the_Fibonacci_number=insert.nextLine();
		//******************************************************************	
	
			int parse_of_bill=Integer.parseInt(the_Fibonacci_number);
			System.out.print("0,1");

			for (int i = 0; i <parse_of_bill ; i++) {
				i=a+b;
				if(i<=parse_of_bill)
				System.out.print(", "+i);
				a=b;
				b=i;
				
			}
			
	
			System.out.println("\nDo you have more Fibonacci number (Y) yes (N) No");
			chickLoop=insert.nextLine();
			
			if(chickLoop.equals("Y")||chickLoop.equals("y"))
			{
				more_bills=true;
			}
			else if(chickLoop.equals("N")||chickLoop.equals("n"))
			{
				more_bills=false;
				System.out.println("*************************Thank you ***************************");
			}
		
		}
		}
	}

}
