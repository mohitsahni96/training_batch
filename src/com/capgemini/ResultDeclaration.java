package com.capgemini;

import java.util.Scanner;

public class ResultDeclaration {
	public float marks, marks2, marks3;
	
	public ResultDeclaration()
	{
		// This is the default constructor
	}
	public ResultDeclaration(float marks, float marks2, float marks3)
	{
		this.marks = marks;
		this.marks2 = marks2;
		this.marks3 = marks3;
	}
	public void setMarks(float marks)
	{
		this.marks = marks;
	}
	public float getMarks()
	{
		return marks;
	}
	public float getMarks2() {
		return marks2;
	}
	public void setMarks2(float marks2) {
		this.marks2 = marks2;
	}
	public float getMarks3() {
		return marks3;
	}
	public void setMarks3(float marks3) {
		this.marks3 = marks3;
	}


	public static void main(String [] args)
	{
		Scanner scan = new Scanner(System.in);
		
		float marks, marks2,marks3;
		int result = 0;
		
		System.out.println("Enter first subject marks :" );
		marks = scan.nextFloat();
		System.out.println("Enter second subject marks :");
		marks2 = scan.nextFloat();
		System.out.println("Enter third subject marks :");
		marks3 = scan.nextFloat();
		ResultDeclaration rd = new ResultDeclaration(marks,marks2,marks3);
		
		//Condition Statements for the result declaration
		
		 if(rd.getMarks() >60 && rd.getMarks2()>60 && rd.getMarks3( )>60)
			{
				System.out.println("Result is : Passed" );
				
			}
		
		 else if(rd.getMarks() <60 && rd.getMarks2()>60 && rd.getMarks3( )>60)
			{
				System.out.println("Result is : Promoted" );
				
			}
		 else if(rd.getMarks() >60 && rd.getMarks3()<60 && rd.getMarks2( )>60)
			{
				System.out.println("Result is : Promoted" );
				
			}
		 else if(rd.getMarks() >60 && rd.getMarks2()<60 && rd.getMarks3()>60)
			{
				System.out.println("Result is : Promoted" );
				
			}
		 else if(rd.getMarks() <60 && rd.getMarks2()<60 && rd.getMarks3()<60)
			{
				System.out.println("Result is : failed" );
				
			}
		 else if(rd.getMarks() <60 && rd.getMarks2()<60 && rd.getMarks3()>60)
			{
				System.out.println("Result is : failed" );
			}
		 else if(rd.getMarks() >60 && rd.getMarks2()<60 && rd.getMarks3()<60)
			{
				System.out.println("Result is : failed" );
				
			}
		 else if(rd.getMarks() <60 && rd.getMarks2()>60 && rd.getMarks3()<60)
			{
				System.out.println("Result is : failed" );
				
			}
		 else
		 {
			 System.out.println("Invalid marks added");

		
		}
}
		
		
	}
	

