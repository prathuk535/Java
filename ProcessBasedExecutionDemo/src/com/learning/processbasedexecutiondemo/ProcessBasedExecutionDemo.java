package com.learning.processbasedexecutiondemo;

public class ProcessBasedExecutionDemo {
	
	void showMsg()
	{
		System.out.println("Hello from method");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("From main Function");
		System.out.println("Main creating object of class");
		ProcessBasedExecutionDemo demo=new ProcessBasedExecutionDemo();
		System.out.println("Main invoking child function");
		demo.showMsg();
		System.out.println("Main finished execution");
	}

}
