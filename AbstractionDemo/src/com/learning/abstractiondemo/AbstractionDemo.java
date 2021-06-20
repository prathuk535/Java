package com.learning.abstractiondemo;

abstract class MyAbstractClass
{	
	//Abstract class will have Abstract and Non Abstract Methods
	//methods with no body is called as Abstract Method
	//if the class contains any abstract method then class also has to be declared abstract
	abstract void show();
	
	void disp()
	{
		System.out.println("Method from Abstract Class");
	}
	
	//as the class contains Abstract method,the class is said to be incomplete class
	//and hence we cannot create object of Abstract class
	//in order to complete this we have to inherit it and override abstract method 
	//in child
}
public class AbstractionDemo extends MyAbstractClass {
	
	@Override
	void show()
	{
		System.out.println("Overridden method in child");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyAbstractClass demo=new AbstractionDemo();
		demo.show();
		demo.disp();
	}

}
