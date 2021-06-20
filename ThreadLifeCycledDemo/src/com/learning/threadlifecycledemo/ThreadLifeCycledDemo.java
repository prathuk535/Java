package com.learning.threadlifecycledemo;

public class ThreadLifeCycledDemo implements Runnable {
	
	public void run()
	{
		for(int i=0;i<10;i++)
		{
			try
			{
				Thread.sleep(500);
				System.out.println(i);
				
				//checking if current thread is interrupted by another thread or not
				//System.out.println("Is interrupted: "+Thread.interrupted());
			}
			catch(InterruptedException e)
			{
				System.out.println("Interrupted by main thread");
			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Main Started");
		System.out.println("Main Creating object of child class");
		//new
		ThreadLifeCycledDemo demo=new ThreadLifeCycledDemo();
		Thread thread=new Thread(demo);
		
		System.out.println("Main invoking child function");
		//runnable
		thread.start();
		try
		{
			//as soon as main goes to sleep child thread will be active
			//and will get its work done
			Thread.sleep(2000);
			
			//Interrupt() method interrupted child thread and hence it would go to catch block
			//in child thread for that iteration
			//thread.interrupt();
			
			//thread.stop();
		}
		catch(InterruptedException e)
		{
			e.printStackTrace();
		}
		System.out.println("Main finished");
	}

}
