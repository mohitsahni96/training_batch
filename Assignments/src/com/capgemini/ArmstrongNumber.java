package com.capgemini;

import java.util.Scanner;

public class ArmstrongNumber 
{
	public static int number;
	 ArmstrongNumber()
	 {
		 //DEFAULT CONSTRUCTOR
	 }
	 
	 ArmstrongNumber(int number)
	 {
		 this.number = number;
	 }
	 
	 public void setNumber(int number)
	 {
		 this.number = number; 
		 
	 }
	 
	 public int getNumber()
	 {
		 return number;
	 }
	 
	public void checkArmstrong(int number)
	{
		int temp = 0;
		temp = number;
		int remainder = 0;
		int sum = 0;
		while(number > 0)
		{
			remainder = number % 10;
			sum = sum +(remainder *remainder*remainder);
			number = number/10;
			
		}
				
		if(temp == sum)
			System.out.println("Number is Armstrong Number ");
		else
			System.out.println("Number is not an  Armstrong Number");

	}
	
	
	public static void main(String[] args) {
		ArmstrongNumber an = new ArmstrongNumber();
		
	    Scanner scan = new Scanner(System.in);
	
		System.out.println("Enter the  number : ");
	    	number = scan.nextInt();
		
		an.checkArmstrong(an.getNumber());	
		
	}

}
