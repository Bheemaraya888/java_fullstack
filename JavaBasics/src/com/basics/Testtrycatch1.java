package com.basics;

import java.util.Scanner;
public class Testtrycatch1 {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		try {
			
			int a, b;
			System.out.println("enter the value of a and b");
			a = sc.nextInt();
			b = sc.nextInt();
			int data = a / b; // may throw exception
			System.out.println("data value is " + data);
		} catch (ArithmeticException ae) {
			System.out.println(ae);
		}
			
		finally
		{
			sc.close();
		}
		
		System.out.println("rest of the code...");
	}
}
