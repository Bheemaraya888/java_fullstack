package strings;

import java.util.*;

public class StringOp {

	public static void main(String[] args) {
		String s1,s2;
		Scanner sc=new Scanner(System.in);
		try {
		System.out.print("Enter 2 string\n");
		s1=sc.nextLine();
		s2=sc.nextLine();
		
		//s1.concat(s2);
		//System.out.print(s3.length());
		
		s1 =s1.toUpperCase();
		System.out.print(s1);
		s2 =s2.toLowerCase();
		System.out.print(s2);
		}
	finally{
		sc.close();
		}
	}

}
