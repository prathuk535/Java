package com.learning.bufferedinputstreamdemo;

import java.io.BufferedInputStream;
import java.io.ByteArrayInputStream;
import java.io.IOException;

public class BufferedInputstreamDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="Welcome to Java";
		byte[] b=s.getBytes();
		
		//try(ByteArrayInputStream in=new ByteArrayInputStream(b);
		//			BufferedInputStream bis=new BufferedInputStream(in))
		
		try(BufferedInputStream bis=new BufferedInputStream(new ByteArrayInputStream(b)))
		{
			int c;
			while((c=bis.read())!=-1)
			{
				System.out.println((char)c);
			}
		}
		catch(IOException e)
		{
			System.out.println("Error: "+e.getMessage());
		}
	}

}
