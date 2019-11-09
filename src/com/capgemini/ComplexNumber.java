package com.capgemini;

import java.util.Scanner;

public class ComplexNumber {
	
	private double real;
	private double imag;
	
	public ComplexNumber()
	{
		super();
		
	}
	public ComplexNumber(double real, double imag)
	{
		super();
		this.real = real;
		this.imag = imag;
		
	}
	
	public static ComplexNumber sum(ComplexNumber c1, ComplexNumber c2)
	{
		ComplexNumber cn = null;
		
		cn.real = c1.real + c2.real;
		cn.imag = c1.imag + c2.imag;
		return cn;
		
	}
	
	public  ComplexNumber diff(ComplexNumber cn1)
	{
		
		double real = this.real - cn1.real;
		double imag = this.imag - cn1.imag;
		
		return new ComplexNumber(real, imag);
		
	}
	
	public  ComplexNumber mul(ComplexNumber cn1)
	{
		
		double real = this.real*cn1.real - this.imag*cn1.imag;
		double imag = this.imag*cn1.real - this.real*cn1.imag;
		
		return new ComplexNumber(real, imag);
		
	}
	
	public void swap(ComplexNumber c1, ComplexNumber c2)
	{
		ComplexNumber temp = c1;
		c1 = c2;
		c2 = temp;
		
	}


}
