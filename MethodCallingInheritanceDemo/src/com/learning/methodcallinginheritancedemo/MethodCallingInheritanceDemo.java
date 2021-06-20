package com.learning.methodcallinginheritancedemo;
	
//Super Keyword
//helps to access members of parent class in child
//in case if the declaration is same
	class DemoP
	{
		void show()
		{
			System.out.println("Show method from Parent class");
		}
		 void disp()
		 {
			 System.out.println("Show Methid from Parent class");
		 }
	}
public class MethodCallingInheritanceDemo extends DemoP{

	void show()
	{
		super.show();
		System.out.println("Show method from child class");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MethodCallingInheritanceDemo demo=new MethodCallingInheritanceDemo();
		demo.show();
	}

}
