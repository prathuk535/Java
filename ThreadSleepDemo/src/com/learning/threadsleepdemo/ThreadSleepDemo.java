package com.learning.threadsleepdemo;

public class ThreadSleepDemo implements Runnable {
	
	@Override
	public void run()
	{
		System.out.println("From run method");
		for(int i=0;i<10;i++)
		{
			try
			{
				System.out.println("From child method: "+i);
				//time is provided in milliseconds
				Thread.sleep(500);
			}
			catch(InterruptedException e)
			{
				System.out.println("Exception: "+e.getMessage());
			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Main Started");
		
		System.out.println("Main creating object of class");
		ThreadSleepDemo demo=new ThreadSleepDemo();
		Thread thread=new Thread(demo);
		
		System.out.println("Mian invoking function");
		thread.start();
		//time is provided in milliseconds
		try
		{
			//in order to handle the error of
			//getting the thread interrupted between sleep time
			//we should surround it with try catch
			//Thread keyword refers to current thread
			Thread.sleep(2000);
			//thraed.interrupt();
			thread.stop();
		}
		catch(InterruptedException e)
		{
			e.printStackTrace();
		}
		System.out.println("Main Finished");
	}

}
