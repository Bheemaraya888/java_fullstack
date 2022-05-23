package com.basics;
import java.util.Scanner;

public class BreakStatements {

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		int n;
		Scanner sc= new Scanner(System.in);
		try
		{
		System.out.print("Enter a number ");
		n=sc.nextInt();
		if (n>1)
		{
			for (int i=0;i<n;i++) 
			{
				System.out.print(i);
				System.out.print("\n");
				if (i==5) 
				{
					break;
				}
			}

		}
		
	}
	finally
	{
		sc.close();
	}
}
}
