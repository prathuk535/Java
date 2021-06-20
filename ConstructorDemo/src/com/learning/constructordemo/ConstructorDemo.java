package com.learning.constructordemo;

public class ConstructorDemo {
	
	int val;
	
	ConstructorDemo()
	{
		val=5;
		
		//Constructor is a special type of method used to initailize
		//member variables of the class dynamically
		//constructor cannot have logic within
		//hence it cannot have any return type 
		//it can have access-specifiers
		//if we don not provide any constructor in our code
		//compiler creates a default constructor
		//cannot be inherited
	}
	
	ConstructorDemo(int num)
	{
		val=num;
	}

	void dispVal()
	{
		System.out.println("Value from Constructor: "+val);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Constructor need not to be invked explicitly
		//it gets invoked as soon as object of the class is created
		ConstructorDemo demo=new ConstructorDemo();
		demo.dispVal();
		ConstructorDemo demo2=new ConstructorDemo(12);
		demo2.dispVal();
	}

}
