package FileInOut;

import java.io.*;

public class CopyFile1 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		FileReader in =null;
		FileWriter out =null;
		
		try 
		{
			in = new FileReader("D:\\Books\\Java\\JavaBasics\\src\\FileInOut\\Input.txt");
			out= new FileWriter("D:\\Books\\Java\\JavaBasics\\src\\FileInOut\\Output.txt");
			
			int c;
			while((c = in.read() ) != -1) 
			{
				out.write(c);
			}
		
		}
		
		finally 
		{
		if ( in != null) 
			in.close();
		
		if (out !=null)
			out.close();
		}

	}
}
