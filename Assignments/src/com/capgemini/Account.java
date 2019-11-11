package com.capgemini;

import java.util.Scanner;

public class Account {
	public double accountNo;
	public String name;
	public double deposit;
	public double withdraw;
	public double balance = 1000;
	
	//Constructors
	public Account()
	{
		super();
		
	}
	public Account(double accountNo, String name, double deposit, double withdraw)
	{
		super();
		this.accountNo = accountNo;
		this.name = name;
		this.deposit = deposit;
		this.withdraw = withdraw;
	}
	//Getters and Setters Method
	public double getAccountNo() {
		return accountNo;
	}
	public void setAccountNo(double accountNo) {
		this.accountNo = accountNo;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getDeposit() {
		return deposit;
	}
	public void setDeposit(double deposit) {
		this.deposit = deposit;
	}
	public double getWithdraw() {
		return withdraw;
	}
	public void setWithdraw(double withdraw) {
		this.withdraw = withdraw;
	}
	//Method to deposit amount
	public void deposit()
	{
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter amount to deposit :-- ");
		deposit = scan.nextDouble();
		balance += deposit;
		System.out.println("New Balance is : --" +balance);
	}
	//Method to withdraw amount
	public void withdraw()
	{
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter amount to withdraw :-- ");
		withdraw = scan.nextDouble();
		balance =  balance - withdraw;
		System.out.println("New Balance is : --" +balance);
	}
	//Method to print balance
	public void print()
	{
		System.out.println("Current Balance is :- " + balance);
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		Account a1 = new Account();
	    
		double accountNo,deposit,withdraw;
	    String name;
	    
	    System.out.println("Enter Account Number :-- ");
	    accountNo = scan.nextDouble();
	    System.out.println("Enter Name :-- ");
	    name = scan.next();
	    a1.print();
	    a1.deposit();
	    a1.withdraw();		
	}
}

