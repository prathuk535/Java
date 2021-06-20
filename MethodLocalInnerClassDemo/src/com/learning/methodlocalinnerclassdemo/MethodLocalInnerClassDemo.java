package com.learning.methodlocalinnerclassdemo;

public class MethodLocalInnerClassDemo {

	private int num=7;
	
	void invokeMethod()
	{
		class DemoClass
		{
			void showVal()
			{
				System.out.println("Private value from outer class:  "+num);
			}
		}
		
		DemoClass demo=new DemoClass();
		demo.showVal();
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MethodLocalInnerClassDemo demo=new MethodLocalInnerClassDemo();
		demo.invokeMethod();
	}

}
