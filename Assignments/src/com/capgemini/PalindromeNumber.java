package com.capgemini;

import java.util.Scanner;

public class PalindromeNumber {
	private int number;
	
	public PalindromeNumber()
	{
	  super();	
	}
	
	public PalindromeNumber(int number)
	{
		super();
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
	public void checkPalindrome(int number)
	{
		int temp = number;
		int sum = 0;
		int r = 0;
		while(number > 0 )
		{
			r = number % 10;
			sum = sum * 10 + r;
			number = number / 10;
			
		}
		System.out.println("Reverse of a number is :-- " + sum);
//		if(temp == sum)
//		{
//			System.out.println("Number is Plaindrome");
//		}
//		else
//		{
//			System.out.println("Number is not Palindrome ");
//		}
//		
	
		
	}
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		PalindromeNumber pn = new PalindromeNumber();
		System.out.println("Enter number : ");
		int number =  scan.nextInt();
		pn.checkPalindrome(number);
		
		
	}
	

}
