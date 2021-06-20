package com.learning.nestedclassesddemo;

public class NestedClassesDemo {

	private static int val=7;
	
	static class DemoClass
	{
		static void showVal()
		{
			System.out.println("Private value from outer class: "+val);
		}
	}
	
	void invokeMethod()
	{
		DemoClass.showVal();
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		NestedClassesDemo demo=new NestedClassesDemo();
		demo.invokeMethod();
	}

}
