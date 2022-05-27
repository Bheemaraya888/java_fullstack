package array;

import java.util.Scanner;



public class Array1D {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {10,20,30,40,50,60};
		System.out.println(a.length);
		//System.out.println(a.length);
		//for (int i=0;i<a.length ; i++)
		//{
		//	System.out.println(a[i]);
		//}
		
		a[0]=90;
		for (int i=0;i<a.length ; i++)
		{
			System.out.println(a[i]);
		}
		
		
		Scanner sc = new Scanner(System.in);
		try 
		{
			int b[]= new int[5];
			for (int i=0;i<5;i++)
			{
				System.out.println("Enter a number in the Array");
				b[i]=sc.nextInt();
			}
			for (int i=0;i<5;i++)
			{
				System.out.println(b[i] + " ");		
			}
		}

		finally
		{
			sc.close();
		}
	}
}
