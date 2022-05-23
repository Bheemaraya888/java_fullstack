package com.innerclass;

final   class A
{
	private class B
	{
		public void method() 
		{ 
		System.out.println("THIS IS CLASS B");
		}
	}
	
	public void method1() 
	{ 
		System.out.println("THIS IS CLASS A");
		B b= new B();
		b.method();
		
		
	
	}
	
}


public class DifferentClass 
{

	final class B
	{
		public void method() 
		{ 
		System.out.println("THIS IS DCLASS B");
		}
	}
	
	public void method1() 
	{ 
		System.out.println("THIS IS DCLASS A");
		B b= new B();
		b.method();
		
		
	
	}
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		A a=new A();
		a.method1();
		DifferentClass d=new DifferentClass();
		d.method1();

	}
}

