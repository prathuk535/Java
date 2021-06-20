package com.learning.threadusingconstructor;

public class ThreadUsingConstructor implements Runnable {
	
	//object of thread class declared here
	Thread thread;
	
	public ThreadUsingConstructor()
	{
		System.out.println("Thread being initialized in constructor");
		
		//object being initialized in constructor
		//reference of class constructor is given to Thread class constructor using this keyword
		thread=new Thread(this);	//object of thread is referencing to current class
		System.out.println("invoking run method using object of Thread in constructor");
		//invoking run method using object of Thread
		thread.start();
		System.out.println("Is child Thread active in constructor??"+thread.isAlive());;
	}
	
	public void run()
	{
		System.out.println("Thread invoked using constructor");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Main started");
		System.out.println("Main creating object of class");
		
		ThreadUsingConstructor demo=new ThreadUsingConstructor();
		
		System.out.println("Main finished");
		System.out.println("Is child thread active in main??"+demo.thread.isAlive());
	}

}

