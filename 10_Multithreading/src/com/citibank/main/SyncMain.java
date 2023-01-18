package com.citibank.main;

import com.citibank.main.domin.MyThread;
import com.citibank.main.domin.Resource;

public class SyncMain {

	public static void main(String[] args) {
//		Thread thread = Thread.currentThread();
//		//System.out.println(thread);
//		System.out.println(Thread.currentThread());
//		thread.setName("Main Thread");
//		thread.setPriority(9);
//		System.out.println(thread);
//		
//		Resource resource = new Resource();
//		resource.message("Hi");
//		resource.message("Hello");
//		resource.message("How are you doing today");
		
		Resource resource = new Resource();
		MyThread myThreadone = new MyThread(resource, "Hi");
		
		Thread thread1 = new Thread(myThreadone);
		thread1.start();
		
		MyThread myThreadTwo = new MyThread(resource, "Hello");
		Thread thread2 = new Thread(myThreadTwo);
		thread2.start();
		
		MyThread myThreadThree = new MyThread(resource, "How are you doing?");
		Thread thread3 = new Thread(myThreadThree);
		thread3.start();
		
		

	}

}
