package com.collections;
import java.util.*;
/*
 * @author Bheemaraya
 * 
 */

public class ArrayListDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//ArrayList implemented by using ArrayList Class
		ArrayList al1=new ArrayList();
		//adding elements into array List
		Integer i = new Integer(10);
		al1.add(i);
		al1.add(new String("Bheemaraya"));
		al1.add("Nayak");
		System.out.print(al1);
	}
}
