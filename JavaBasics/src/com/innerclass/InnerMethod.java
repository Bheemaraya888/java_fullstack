package com.innerclass;

public class InnerMethod {

	public  void method() 
	{
		System.out.println("THIS IS A OUTER CLASS");
		class MyName
		{
			public void my_method() 
			{
				System.out.println("HI THIS IS INNER METHOD CLASS NAME IS MYNAME");
			}
		}
		
		MyName m=new MyName();
		 m.my_method();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		InnerMethod i = new InnerMethod();
		i.method();

	}

}
