package com.practice;
import java.util.*;

public class PrimeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		try { 
			
			System.out.println("Enter a number to find whether a number is prime or not ");
			int n =sc.nextInt();
			int m=n/2;
			int k=0;
			if( n==0 || n==1)
				System.out.print("please enter a correct number to find prime number");
			else {
				for (int i=2;i<=m;i++) 
				{
					if (n%i==0) 
					{
						System.out.println("The given number is not  Prime ");
						k=1;
						break;
						
					}
					
				}
				
			}
			if(k==0)
			{
			System.out.println("The given number is  prime ");
			}
			
			}
finally 
{
	sc.close();
}
	}

}
