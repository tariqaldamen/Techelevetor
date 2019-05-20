package com.techelevator;

import java.util.Scanner;

public class LinearConvert {

	public static void main(String[] args) {

boolean more_bills=true;
		
		String chickLoop="";
		
	try (Scanner insert=new Scanner(System.in))
	{	while(more_bills) {
		
		String enter_the_length ="";
		String f_or_m="";
		int mf=0;
		
		System.out.print("Please enter the length: ");
		enter_the_length=insert.nextLine();
	//******************************************************************	
		System.out.print("Is the temperature in (m)eter, or (f)eet?: ");
		f_or_m=insert.nextLine();
		
		double parse_of_fm=Double.parseDouble(enter_the_length);
		if(f_or_m.equals("m"))
		{
		mf = (int) (parse_of_fm* 3.2808399);	
			System.out.println((int)parse_of_fm+"m"+" is "+mf+"f");
		}
		else if(f_or_m.equals("f"))
		{
			
			mf = (int) (parse_of_fm* 0.3048);
			System.out.println((int)parse_of_fm+"f"+" is "+mf+"m");
		}
		
		
		
	
		System.out.println("Do you have more temperature to Convert (Y) yes (N) No");
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
