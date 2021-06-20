package com.learning.finaldemo;

	//final class cannot be inherited
	//any any variable which is declared as static and final is considered as constant

	class DemoP
	{
		//final variable cannot be re-initialized
		final int val=7;
		
		final void show()	//final method cannot be overridden in child
		{
			System.out.println("Method from Parent class");
		}
	}
public class FinalDemo extends DemoP {
	
	void showVal()
	{
		//val=8;
		System.out.println("Method from Child class :"+val);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FinalDemo demo=new FinalDemo();
		demo.show();
		demo.showVal();
	}

}
