package com.learning.oopsdemo;

import java.util.Scanner;

public class OOPSDemo {
	
	int num;
	Scanner scanner=new Scanner(System.in);
	 
	void acceptNum()
	 {
		System.out.println("enter any number"); 
		num=scanner.nextInt();
	 }
	
	void dispNum()
	{
		System.out.println("The value entered: "+num);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		OOPSDemo demo=new OOPSDemo();
		demo.acceptNum();
		demo.dispNum();
	}

}
