package com.citibank.main.domain;

public class MyClass {
	
	final int max = 500;
	public int num1 = 10;
	public static int num2 = 10;
	
	public MyClass() {
		// TODO Auto-generated constructor stub
		System.out.println("default constructor of my class");
	}
	static {
		System.out.println("static block of my class");
	}
	
	{
		System.out.println("non static block of my class");
	}
	public static int getNum2() {
		return num2;
	}

	public static void setNum2(int num2) {
		MyClass.num2 = num2;
	}

	public void display() {
	System.out.println("Display num1 : " +num1);
	System.out.println("Display num2 : " +num2);
	System.out.println("final variable is :" +max);
	
	num1 = num1 + 10;
	num2 = num2 + 10;
	
	System.out.println("Display num1 : " +num1);
	System.out.println("Display num2 : " +num2);
		
	}
	
}
