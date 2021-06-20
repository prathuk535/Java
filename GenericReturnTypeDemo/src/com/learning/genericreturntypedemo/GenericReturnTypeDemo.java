package com.learning.genericreturntypedemo;

public class GenericReturnTypeDemo {

	public <T> T dispNum(T num)
	{
		return num;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GenericReturnTypeDemo demo=new GenericReturnTypeDemo();
		System.out.println("Generic Int Value: "+demo.dispNum(5));
		System.out.println("Generic String value: "+demo.dispNum("Sample"));
		System.out.println("Generic Float value: "+demo.dispNum(5.5F));
	}

}
