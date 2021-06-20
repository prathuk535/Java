package com.learning.userinputdemo;

import java.util.Scanner;

public class UserInputDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num;
		double price;
		char alpha;
		String name;
		
		//instructing user to enter numeric value
		System.out.println("Enter any number");

		//creating object of scanner class to accept
		//user input
		Scanner scanner=new Scanner(System.in);
		
		//default data type of java is string
		//so we need to convert it into int bt invoking a method called
		//nextInt from Scanner class
		num=scanner.nextInt();
		
		System.out.println("Enter sny price");
		price=scanner.nextDouble();
		System.out.println("Enter any alphabet");
		alpha=scanner.next().charAt(0);
		System.out.println("Enter any name");
		name=scanner.next();
	}

}
