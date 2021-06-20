package com.learning.dynamicpolymorphismdemo;

class DemoP
{
	void showVal()
	{
		System.out.println("Method from parent class");
	}
}

public class DynamicPolymorphismDemo extends DemoP {
	
	//it takes place using function with same signature
	//in parent and child class
	//function call is decided at runtime
	//objects are bound to methods dynamically
	//hence also called as late-binding
	
	void showVal()
	{
		System.out.println("Method from child class");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DynamicPolymorphismDemo demo=new DynamicPolymorphismDemo();
		demo.showVal();
		
		//this is straight initialization and invocation
		DemoP demo1=new DemoP();
		demo1.showVal();
		
		//this is an example of dynamic polymorphism
		//object will be initialized with the class at runtime
		//and hence function call would also be decided at runtime
		//DemoP demo2=new DynamicPolymorphismDemo();
		//demo2.showVal();
		
		//I am creating object of parent
		//DemoP demo2=new DemoP();
		//to make following statement valid
		//w need to cast object of parent into child type
		//as follows
		//following lines compile successfully but throws an error
		//at runtime
		//as this casting is valid from compilation point of view
		//but practically parent cannot access child properties
		//DynamicPolymorphismDemo demo=(DynamicPolymorphismDemo)dp;
		//demo.showVal();
		
		//this is called as auto-boxing
		//also known as upward-casting
		//consider putting small box into a bigger one
		//which can be done easily
		//DemoP demo2=new DynamicPolymorphismDemo();
		
		//this is called as auto-boxing
		//also known as downward-casting
		//consider putting big box into smaller one
		//which cannot be done easily
		//DemoP demo2=new DemoP();
		//DynamicPolymorphismDemo demo=(DynamicPolymorphismDemo)demo2;
		//demo.showVal();
	}

}
