package com.basics;

import java.io.IOException;

class Hello {
	void m()throws IOException
	
	{
		throw new IOException("decvice error");
	}
	void n()throws IOException
	{
		m();
	}
	void p() 
	{
		try 
		{
			n();
		}
		catch(Exception e) {System.out.println("Exceptions handled");}
	}
	public static void main(String args[]) 
	{
		Hello obj = new Hello();
		obj.p();
		System.out.println("Normal flow");
	}

}
