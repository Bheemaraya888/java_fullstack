package com.basics;

public class Star 
{

	public static void main(String[] args) 
	{
		
		int n=3;
		// TODO Auto-generated method stub
		for (int i=0;i <n+1;i++)
		{
			for (int j=n+1;j>i;j--)
			{
				System.out.print(" ");
			}
			
			for (int k=0;k<i;k++)
			{
				System.out.print(" * ");
			}
		
		System.out.print("\n");
		}
		/*for (int i=0 ;i<n;i++) 
		{
			for (int k=n; k<i ; k--)
			{
				System.out.print(" * ");
			}
			for (int j=0;j<i;j++)
			{
				System.out.print(" ");
			}
			System.out.print("\n");
		}*/
	}
}
