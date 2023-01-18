package com.citibank.main;

import com.citibank.main.domain.GoodmorningGreeter;
import com.citibank.main.domain.Greeter;

public class GreeterMain {

	public static void main(String[] args) {
		
		Greeter greeter = new GoodmorningGreeter();
		
		greeter.greet();
		
		System.out.println("-----------------------------------");
		
	//below is anonymous class which implements Greeter interface. Here basically you are creating a class,
	//you dont know the name of that class, so it implements interface
		Greeter greeter1 = new Greeter() {
			@Override
			public void greet() {
				System.out.println("Goodevening!!");
				
			}
		};
		greeter1.greet();
		System.out.println("-----------------------------------");
		
//this is an example of Lambda expression. It is an alternate way of writing anonymous class. And the whole
//purpose of it is to implement interface
		Greeter greeter2 = () -> {
			System.out.println("Lambda Expression");
		};
		greeter2.greet();
//this is an example of Lambda expression
		Greeter greeter3 = () -> {
			System.out.println("Goodnight Java");
		};
		greeter3.greet();
		
		System.out.println("-----------------------------------");
		
//		Runnable runnable = new Runnable() {
//			@Override
//			public void run() {
//				System.out.println("We are in thread!!");
//				
//			}
//		};
		Runnable runnable = () -> System.out.println("We are in thread");
		Thread thread = new Thread(runnable);
		thread.start();
		
		System.out.println("-----------------------------------------");
		Thread thread2 = new Thread(() -> System.out.println("We are in thread2"));
		thread2.start();
		
		
		new Thread(() -> System.out.println("We are in thread -shortcut ways")).start();
		
		System.out.println("---------------------------------------------");
		
		new Thread (() -> {
			
		
		for (int i = 0; i < 10; i++) {
//			Runnable runnable1 = new Runnable() {
//				public void run() {
//					System.out.println("Lambda expression in a loop!!");
//			
//			Thread threadLoop = new Thread();
//			threadLoop.start();
			
			try {
				Thread.sleep(1000);
				System.out.println("Thread is running in loop");
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			}
		}).start();
	}
	}


