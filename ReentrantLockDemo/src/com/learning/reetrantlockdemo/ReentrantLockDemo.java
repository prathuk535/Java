package com.learning.reetrantlockdemo;

import java.util.concurrent.locks.ReentrantLock;

public class ReentrantLockDemo implements Runnable{
	// final ReentrantLock rLock=new ReentrantLock();
	
	//if Reentrant lock is given a boolean param then
	//the thread which is waiting for the highest time will
	//acquire the lock as soon as it is released by current thread
	//this is called as fair lock
	
	final ReentrantLock rLock=new ReentrantLock(true);
	synchronized public void show()
	{
		//once a lock is been acquired by a thread
		//then it keeps reentering in the same lock
		//again and again and hence it is called as 
		//Reentrant Lock
		
		System.out.println("Is currnt lock object fair?? "+rLock.isFair());
		rLock.lock();
		rLock.lock();
		rLock.lock();
		rLock.lock();
		System.out.println(Thread.currentThread().getName()+" has acquired lock");
		System.out.println(Thread.currentThread().getName()+" no of locks entered again: "+rLock.getHoldCount());
		System.out.println(5/0);
		rLock.lock();
		rLock.lock();
		rLock.lock();
		rLock.lock();
		System.out.println(Thread.currentThread().getName()+" has released lock");
	}
	
	public void run()
	{
		show();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ReentrantLockDemo demo=new ReentrantLockDemo();
		//Thread object should share the common copy of
		//object of the class otherwise all threads will
		//execute separate process
		Thread thread1=new Thread(demo);
		Thread thread2=new Thread(demo);
		Thread thread3=new Thread(demo);
		
		thread1.start();
		thread2.start();
		thread3.start();
	}

}
