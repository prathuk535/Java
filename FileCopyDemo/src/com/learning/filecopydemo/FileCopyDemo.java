package com.learning.filecopydemo;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class FileCopyDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Path trgPath=Paths.get(null);
		Path srcPath=Paths.get(null);
		
		try 
		{
			Files.copy(srcPath,  trgPath);
		}
		catch(IOException e)
		{
			System.out.println(e);
		}
	}

}
