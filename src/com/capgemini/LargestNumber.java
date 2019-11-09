package com.capgemini;

import java.util.Scanner;

public class LargestNumber {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int n;
		System.out.println("How many numbers you want to add in array:- ");
		n = scan.nextInt();
		int arr[] = new int[n];
		System.out.println("Entered Elements are :- ");

		for(int i = 0; i < arr.length; i++)
		{
			arr[i] = scan.nextInt();
			
		}
		
		for(int i = 0; i < arr.length; i++)
		{
			for(int j = i+1; j < arr.length; j++ )
			{
				if(arr[i] < arr[j])
				{
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}

	}
}
		System.out.println("Largest Element is : -- " + arr[0]);

	    System.out.println("Second Largest Element is : -- " + arr[1]);

		
		System.out.println("After Sorting in Descending Order : --");

		for(int i = 0; i < arr.length; i++)
		{
			System.out.println(arr[i]);

			
		}
	}
}

