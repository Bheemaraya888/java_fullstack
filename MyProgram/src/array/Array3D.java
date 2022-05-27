package array;

public class Array3D {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [][][]a= {{{1,2,3,4},{6,7,8,9,10}},{{11,12,13,14,15},{16,17,18,19,20}}};
		
		System.out.println(a.length);
		System.out.println(a[1][0].length);
		//System.out.println(a);
		for (int i=0; i < a.length ; i++) 
		{
			for (int j=0; j <a[i].length; j++)
			{
				for (int k=0;k<a[i][j].length; k++)
				{
					System.out.print(a[i][j][k] + " ");
				}
			}
		}

	}

}
