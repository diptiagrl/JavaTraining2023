package com.citibank.main;

import com.citibank.main.domin.ThreadTwo;

public class ThreadTwoMain {

	public static void main(String[] args) {
		
		ThreadTwo threadTwo = new ThreadTwo();
		
		System.out.println("main start");
		Thread thread = new Thread(threadTwo);
		thread.start();
		for (int i = 0; i < 10; i++) {
			System.out.println("main :: " + i);
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		System.out.println("main end");
	}

}
