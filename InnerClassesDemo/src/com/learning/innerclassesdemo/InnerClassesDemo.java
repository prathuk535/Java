package com.learning.innerclassesdemo;

public class InnerClassesDemo {
	
	private int val=7;
	
	class DemoClass
	{
		void showVal()
		{
			System.out.println("Private value from outer class :"+val);
		}
	}
	
	void invokeMethod()
	{
		DemoClass demo=new DemoClass();
		demo.showVal();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		InnerClassesDemo demo=new InnerClassesDemo();
		demo.invokeMethod();
	}

}
