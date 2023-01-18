package com.citibank.main.domin;

public class ThreadTwo implements Runnable {

	@Override
	public void run() {
		System.out.println("We are in ThreadTwo");
		for (int i = 0; i < 10; i++) {
			System.out.println("Thread2 :: " + i);
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
}
