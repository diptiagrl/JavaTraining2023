package com.citibank.main;

public class JarDemoMain {

	public static void main(String[] args) {
		System.out.println("Java Program is Getting Executed");
		
		for (int i = 0; i < 10; i++) {
			try {
				Thread.sleep(1000);
				System.out.println("i = " +i);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}

	}

}
