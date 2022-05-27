package free;

public class Rectangle {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//int length;
		//int width;
		System.out.printf("The rectangle area is " + rect(5,7)+"\n");
		System.out.printf("The rectangle perimeter is " + peri(6,8)+"\n");

	}
	
	public static int rect(int length,int width) {
		
		return length * width;
	}
	
     public static int peri(int length,int width) {
		
		return 2 * length * width;
	}

}
