package com.capgemini;

import java.util.Scanner;

public class Welcome {
	
	private static boolean isCheck(String userName, String password) {
		
		userName = "mohit";
		password = "1234";
		return false;
	}
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Please Enter USERNAME :-- ");
		String userName = scan.nextLine();
		System.out.println("Please Enter PASSWORD :-- ");
		String password = scan.nextLine();
		
		int index = 1;
		
		while(true)
		{
			if(isCheck(userName,password) == true)
				System.out.println("********************Welcome**********************");
			else
				index++;
			
			if(index > 3)
			{
				System.out.println("Invalid Credentials");
				System.out.println("Your maximum login attempt limit has reached, Contact Admin");
				System.out.println("Or Please try again with Correct Credentials");
				break;
			}
			
			System.out.println("Please Re-Enter USERNAME :-- ");
			 userName = scan.nextLine();
			System.out.println("Please Re-Enter PASSWORD :-- ");
			 password = scan.nextLine();
		}		
	}
}
