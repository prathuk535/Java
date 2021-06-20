package com.learning.fileoutputstreamdemo;

import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStreamDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="Demo data to be written on file";
		byte[] buf=s.getBytes();
		
		try(FileOutputStream fos=new FileOutputStream("C:\\Users\\Shree\\eclipse-workspace\\Demo.txt"))
		{
			for(int i=0;i<buf.length;i++)
			{
				fos.write(buf[i]);
			}
				System.out.println("Done");
			
		}
		catch(IOException e)
		{
			System.out.println(e.getMessage());
		}
	}

}
