package com.citibank.main.domin;

public class ThreadOne extends Thread {
	@Override
	public void run() {
		System.out.println("We are in ThreadOne");
		
		for (int i = 0; i < 10; i++) {
			System.out.println("Thread1 :: " + i);
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
