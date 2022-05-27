package free;

import java.util.*;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String number;
		int age;
		double cgpa;
		
		Scanner sc = new Scanner(System.in);
		try {
		System.out.println("Enter a Name");
		number=sc.nextLine();
		System.out.println("Enter your age ");
		age=sc.nextInt();
		System.out.println("Enter your CGPA");
		cgpa=sc.nextDouble();
		System.out.printf(" %s  is %d years old and has cgpa of %4f ",number,age,cgpa);
		}
		finally {
			sc.close();
		}
		
	}

}
