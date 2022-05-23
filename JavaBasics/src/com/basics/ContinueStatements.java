package com.basics;
import java.util.Scanner;

public class ContinueStatements {

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
				if (i==5) 
				{
					continue;
				}
				System.out.print(i);
				System.out.print("\n");
				
			}

		}
		
	}
	finally
	{
		sc.close();
	}
}
}
