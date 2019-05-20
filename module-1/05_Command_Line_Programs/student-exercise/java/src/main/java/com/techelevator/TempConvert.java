package com.techelevator;

import java.util.Scanner;

public class TempConvert {

	public static void main(String[] args) {
		boolean more_bills=true;
		
		String chickLoop="";
		
	try (Scanner insert=new Scanner(System.in))
	{	while(more_bills) {
		
		String enter_the_temperature ="";
		String crlcius_or_farenheit="";
		int Tc=0;
		
		System.out.print("Please enter the temperature: ");
		enter_the_temperature=insert.nextLine();
	//******************************************************************	
		System.out.print("Is the temperature in (C)elcius, or (F)arenheit?: ");
		crlcius_or_farenheit=insert.nextLine();
		
		double parse_of_temperature=Double.parseDouble(enter_the_temperature);
		if(crlcius_or_farenheit.equals("C"))
		{
		Tc = (int) (parse_of_temperature* 1.8 + 32);	
			System.out.println((int)parse_of_temperature+"C"+" is "+Tc+"F");
		}
		else if(crlcius_or_farenheit.equals("F"))
		{
			
			Tc = (int) ((parse_of_temperature- 32) / 1.8);
			System.out.println((int)parse_of_temperature+"F"+" is "+Tc+"C");
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
