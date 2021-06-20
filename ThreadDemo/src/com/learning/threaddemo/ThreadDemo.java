package com.learning.threaddemo;

public class ThreadDemo extends Thread {
	//In thread based execution,currently running thread finishes its execution first
	//and then runs other thread
	//to implement threading in our program ,we either need to inherit
	//thread class or runnable interface
	//both parent classes have method called as run in it which needs to be overridden
	//reference of object of our class has to be given to object of thread and
	//we need to invoke run using start method of thread object
	
	public void run()
	{
		System.out.println("Hello from disp");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//by default main is the current thread
		System.out.println("Main Started");
		System.out.println("Main creating object of class");
		
		//As ThreadDemo is inheriting the Thread class which is a child class of
		//Runnable interface we can directly invoke method from child class without mentioning
		//child class reference
		ThreadDemo demo=new ThreadDemo();
		System.out.println("Main invoking child function");
		demo.start();
		System.out.println("Main finished");
	}

}
