package array;

import java.util.Scanner;

public class Array2D {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//int [][]a= {{10,20,30,40,50,60},{80,90,0}};
		//System.out.println(a.length);
		//System.out.println(a[0].length);
		//System.out.println(a[1].length);
		//a[0][0]= 100;
		//for (int i = 0 ; i< a.length ; i++)
		//{
			//for (int j=0; j<a[i].length;j++)
			//{
				//System.out.print(a[i][j]+" ");			
		    //}
		
	   // }
	
	  // for (int i = 0 ; i< a.length ; i++)
	   //{
		 //  for (int j=0; j< a[i].length ;j++)
		   //{
			//System.out.println(a[i][j]);			
	    	//}
		//}
  
		Scanner sc = new Scanner(System.in);
		try 
		{
			int b[][]= new int[2][2];
			for (int i=0;i<2;i++)
			{
				for(int j=0;j<2;j++)
				{
					System.out.println("Enter a number in the Array");
					b[i][j]=sc.nextInt();
				}
				
			}
			
			System.out.print("THE ARRAY IS\n ");
			for (int i=0;i<2;i++)
			{
				for(int j=0;j<2;j++)
				{
				System.out.print(b[i][j]+" ");		
			    }
				System.out.print("\n");
		    }
		}

		finally
		{
			sc.close();
		}
	}
}