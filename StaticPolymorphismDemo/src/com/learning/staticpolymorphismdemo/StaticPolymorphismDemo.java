package com.learning.staticpolymorphismdemo;

//it is called as static polymorphism because
//methods are already aware of parameters they are going to receive
//hence each method knows when to execute
//params are already bound to methods and hence it is called as 
//early-binding
//static polymorphism takes place in one class only

public class StaticPolymorphismDemo {

	//methods without params
	void showVal()
	{
		System.out.println("Hello from no-arg method");
	}
	
	//methods with floating param
	void showVal(float val)
	{
		System.out.println("Hello from floating param method: "+val);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StaticPolymorphismDemo demo=new StaticPolymorphismDemo();
		demo.showVal();
		demo.showVal(5);
	}

}
