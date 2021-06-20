package com.learning.filereaderdemo;

import java.io.FileReader;
import java.io.IOException;

public class FileReaderDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try(FileReader fr=new FileReader("C:\\\\Users\\\\Shree\\\\eclipse-workspace\\\\Demo.txt"))
		{
			char[] a=new char[50];
			fr.read(a);
			for(char c:a)
			{
				System.out.println(c);
			}
		}
		catch(IOException e)
		{
			System.out.println(e.getMessage());
		}
	}

}
