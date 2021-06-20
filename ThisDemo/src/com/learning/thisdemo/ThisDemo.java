package com.learning.thisdemo;

public class ThisDemo {

		String val;
		
		void showVal(String val)
		{
			this.val=val;
			System.out.println("The value received: "+this.val);
		}
		
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ThisDemo demo=new ThisDemo();
		demo.showVal("Test");
	}

}
