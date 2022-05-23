package com.innerclass;

public class OuterDemo {
	
	static class InnerDemo
	{
		public void method() 
		{
			System.out.println("hi this is Bheemaraya inner method");
		}
	}
	
	public void method1() 
	{ 
		InnerDemo k= new InnerDemo();
		k.method();
		System.out.println("hi this is my program of outerdemo");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		OuterDemo.InnerDemo d = new OuterDemo.InnerDemo();
		OuterDemo d1 = new OuterDemo();
		//d.method();
		//d.method();
		d.method();
		d1.method1();
	}

}
