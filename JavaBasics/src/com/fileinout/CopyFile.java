package com.fileinout;

import java.io.*;

public class CopyFile {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		FileInputStream in =null;
		FileOutputStream out =null;
		
		try 
		{
			in = new FileInputStream("D:\\Books\\Java\\JavaBasics\\src\\FileInOut\\Input.txt");
			out= new FileOutputStream("D:\\Books\\Java\\JavaBasics\\src\\FileInOut\\Output.txt");
			
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
