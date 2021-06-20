package com.learning.filewriterdemo;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriterDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try(FileWriter fw=new FileWriter("C:\\Users\\Shree\\eclipse-workspace\\Demo.txt"))
		{
			String s="New way to write file";
			char [] buffer=new char[s.length()];
			s.getChars(0, s.length(), buffer, 0);
			fw.write(buffer);
		}
		catch(IOException e)
		{
			System.out.println(e.getMessage());
		}
	}

}
