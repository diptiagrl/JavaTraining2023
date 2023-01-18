package com.citibank.main;

import java.util.Iterator;

import com.citibank.main.domin.ThreadOne;

public class ThreadOneMain {

	public static void main(String[] args) {
		System.out.println("Main Start");
		
		ThreadOne threadOne = new ThreadOne();
		
		threadOne.start(); //this is where JVM will create Thread in background
		
		for (int i = 0; i < 1000; i++) {
			System.out.println("main :: " + i);
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		System.out.println("Main End");

	}

}
