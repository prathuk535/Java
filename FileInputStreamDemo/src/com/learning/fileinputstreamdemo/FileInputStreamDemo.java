package com.learning.fileinputstreamdemo;

import java.io.FileInputStream;
import java.io.IOException;

public class FileInputStreamDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i;
		char c;
		
		try(FileInputStream fis=new FileInputStream("C:\\Users\\Shree\\eclipse-workspace\\Demo.txt"))
		{
			while((i=fis.read())!=-1)
			{
				c=(char)i;
				System.out.println(c);
			}
		}
		catch(IOException e)
		{
			System.out.println("IOException occured: "+e.getMessage());
		}
	}

}
