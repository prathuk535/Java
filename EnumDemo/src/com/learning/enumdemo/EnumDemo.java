package com.learning.enumdemo;

enum Colors{Red,Orange,Purple,Blue};

public class EnumDemo {
	
	void showColor(Colors color)
	{
		switch(color)
		{
		case Red:
			System.out.println("You choose Red Color");
			break;
		case Orange:
			System.out.println("You choose Orange Color");
			break;
		case Purple:
			System.out.println("You choose Purple Color");
			break;
		case Blue:
			System.out.println("You choose Blue Color");
			break;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EnumDemo demo=new EnumDemo();
		demo.showColor(Colors.Purple);
	}

}
