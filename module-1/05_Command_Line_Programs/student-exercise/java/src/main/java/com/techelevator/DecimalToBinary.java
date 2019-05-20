package com.techelevator;

import java.util.Scanner;

public class DecimalToBinary {

	public static void main(String[] args) {

		
	boolean more_series=true;
		
		
		
		try (Scanner insert=new Scanner(System.in))
		{	while(more_series) {
			String Decimal_to_Binary ="";
			String chickLoop="";
			int long_of_the_array=0;
			int b=1;
		    
			
			System.out.print("Please enter in a series of decimal values (separated by spaces): ");
			Decimal_to_Binary=insert.nextLine();
		//*ß*****************************************************************	
			String []space_separated=Decimal_to_Binary.split(" ");
			int []change_space_separated_to_int= new int[space_separated.length];
			
			for (int i = 0; i < space_separated.length; i++) {
				change_space_separated_to_int[i]=Integer.parseInt(space_separated[i]);
			}
			
			for (int j = 0; j < change_space_separated_to_int.length; j++) {


			for (int i = change_space_separated_to_int[j]; i >0 ;) {
				i=i/2;
				long_of_the_array++;
				}
			
			
				//*******
				
				
				int []series_divid= new int[long_of_the_array];//1,2,4,8,16.......
				series_divid[0]=1;
				for (int i = 0; i < series_divid.length-1; i++) {
					series_divid[i+1]=series_divid[i]*2;
				}
		
			
			
				
			
			int divid=0;
			System.out.print(change_space_separated_to_int[j]+" in binary is : ");
			for (int i = series_divid.length-1; i >=0; i--) {
				divid=change_space_separated_to_int[j]/series_divid[i];
				System.out.print(divid);
				change_space_separated_to_int[j]=change_space_separated_to_int[j]%series_divid[i];
			}
			System.out.println("\n");
	}
			
			
			System.out.println("\nDo you have more series number (Y) yes (N) No");
			chickLoop=insert.nextLine();
			
			if(chickLoop.equals("Y")||chickLoop.equals("y"))
			{
				more_series=true;
			}
			else if(chickLoop.equals("N")||chickLoop.equals("n"))
			{
				more_series=false;
				System.out.println("*************************Thank you ***************************");
			}
		
		}
		}
	
	}

}
