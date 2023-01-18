package com.citibank.main.domin;

public class Resource {
	
	public synchronized void message(String textMessage) {
		System.out.print("[");
		System.out.print(textMessage);
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("]");
		
		
	}

}
