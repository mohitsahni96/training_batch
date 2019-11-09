package com.capgemini;

import java.util.Scanner;

public class IncomeTax {
	public double ctc;

	public IncomeTax()
	{
		super();
	}
	
	public IncomeTax(double ctc)
	{
		super();
		this.ctc = ctc;
		
	}
	
	
	public double getCtc() {
		return ctc;
	}

	public void setCtc(double ctc) {
		this.ctc = ctc;
	}

	public void taxCalculator()
	{
		double tax;
		
		if(ctc >= 0 && ctc <180000)
		{
			System.out.println("NIL");
		}
		else if (ctc >= 181001 && ctc <300000)
			 {tax = (ctc * 10)/100;
			System.out.println("Tax Amount is :- " + tax);
			 }
		else if(ctc >= 300001 && ctc <500000)
			{tax = (ctc * 20)/100;
			System.out.println("Tax Amount is :- " + tax);
			}
		else if(ctc >= 500000 && ctc <1000000)
		{ tax = (ctc * 30)/100;
			System.out.println("Tax Amount is :- " + tax);
		}
		else
			System.out.println("Invalid");
	}

	
	
	
	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		
		
//		IncomeTax it = new IncomeTax(200000);
		IncomeTax it = new IncomeTax(400000);
//		IncomeTax it = new IncomeTax(600000);


	
		it.taxCalculator();
	}

}
