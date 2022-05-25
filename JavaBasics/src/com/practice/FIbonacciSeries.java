package com.practice;

import java.util.*;

public class FIbonacciSeries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int p = 0;
		int q = 1;
		Scanner sc = new Scanner(System.in);
		try {
		
		System.out.println("ENter a number");
		int n = sc.nextInt();

		if (n == 1) {

			System.out.println("0");
		}

		else if (n == 2) {
			System.out.println("0");
			System.out.println("1");
		} else {
			System.out.println("0");
			System.out.println("1");
			
			for (int i = 2; i < n; i++) {

				int result = p + q;
				System.out.println(result);
				p=q;
				q=result;
			}
		}
}
		finally {
			sc.close();
				}
	
}

}

