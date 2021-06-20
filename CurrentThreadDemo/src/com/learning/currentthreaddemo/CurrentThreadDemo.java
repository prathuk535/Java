package com.learning.currentthreaddemo;

public class CurrentThreadDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Main Started");
		System.out.println("Main running in its own thread");
		
		Thread th=Thread.currentThread();
		th.setName("Main Thread");
		
		System.out.println("Current running thread is: "+th.getName());
		System.out.println("Main finished");
	}

}
