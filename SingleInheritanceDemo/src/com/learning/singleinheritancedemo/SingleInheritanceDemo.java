package com.learning.singleinheritancedemo;

class DemoP
{
	int num=7;
	void show()
	{
		System.out.println("hello from Parent");
	}
}
public class SingleInheritanceDemo extends DemoP{
	 void disp()
	 {
		 System.out.println("Hello from child "+num);
	 }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SingleInheritanceDemo DEMO=new SingleInheritanceDemo();
		DEMO.disp();
		DEMO.show();
	}

}
