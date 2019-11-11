package com.capgemini;

import java.util.Scanner;

public class IntegerNumber 
{
	public static void main(String[] args) 
	{
		//For getting the user input
		Scanner scan = new Scanner(System.in);
		
		int i;
		int n;
		
		System.out.println("Enter number of elements you want to enter :-- ");
        n = scan.nextInt();
        
        //creating array to store elements at run time
        int[] arr = new int[n];
		
        for(i=0; i< arr.length; i++)
		{
          arr[i] = scan.nextInt();
		}
        //Displaying Array entered
		System.out.println("Array Becomes : -- " );
		
		for(i=0; i< arr.length; i++)
		{
          System.out.println(arr[i]);
		}

       //Logic too sort array  in Ascending  order 
		System.out.println("After Sorting the Array becomes:- ");
		{
			for(i=0; i < arr.length; i++)
				{
				for(int j = i+1; j < arr.length; j++)
				{
					if(arr[i] > arr[j])
					{
						int temp;
						temp = arr[i];
						arr[i] = arr[j];
						arr[j] = temp;
					}
				}
				}
		}
		//Displaying Sorted Array (Ascending Order)
		for(i=0; i< arr.length; i++)
		{
          System.out.println(arr[i]);
		}

	}

}
