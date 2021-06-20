package com.learning.multilevelinheritancedemo;

interface DemoP
{
	//DemoP demo=new MultiLevelInheritanceDemo();
	void show();
}

interface DemoP2 extends DemoP
{
	DemoP2 demo2=new MultiLevelInheritanceDemo();
	void disp();
}

public class MultiLevelInheritanceDemo implements DemoP2 {
	
	public void show()
	{
		System.out.println("Show from DemoP");
	}
	
	public void disp()
	{
		System.out.println("Disp from DemoP2");	
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//MultiLevelInheritanceDemo demo=new MultiLevelInheritanceDemo();
		//demo.show();
		//demo.disp();
		demo2.show();
		demo2.disp();
	}

}
