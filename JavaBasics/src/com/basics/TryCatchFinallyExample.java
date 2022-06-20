package com.basics;

class TryCatchFinallyExample
{
public static void main (String[] args)
{
// array of size 4.
//int[] arr = new int[4];
try
{

System.out.println("Inside try block");
}
catch(ArrayIndexOutOfBoundsException ex)
{
System.out.println("Exception caught in catch block");
}
finally // always executed
{
System.out.println("finally block executed");
}
// rest program will be executed
System.out.println("Outside try-catch-finally clause");
}
}