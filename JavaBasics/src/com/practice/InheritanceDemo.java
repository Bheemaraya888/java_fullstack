package com.practice;
class A
{
	int a;
	int b;
public A()
{
	System.out.println("In A class default constructor");
}
public A(int a,int b)
{
	System.out.println("In A class parameterized constructor");
	this.a=a;
	this.b=b;
}
}

class B extends A
{
	int c;
 public B() {
	 super();
	 System.out.println("the B class default constructor");
	 super.a=10;
	 super.b=20;
 }
 public B(int c) {
	 super();
	 this.c=c;
	 System.out.println("the B class parameterized  constructor");
	 
 }
}
public class InheritanceDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		B b=new B();
		System.out.println(b.a);
		System.out.println(b.b);

	}

}
