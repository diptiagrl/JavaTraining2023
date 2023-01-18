package com.citibank.main.domain;

public class MyClass {

	public MyClass() {
		// TODO Auto-generated constructor stub
		System.out.println("Default constructor of MyClass");
	}
	public MyClass(int i) {
		// TODO Auto-generated constructor stub
		System.out.println("Integer param constructor of MyClass: " +i);
	}
	public MyClass(int i, int j) {
		// TODO Auto-generated constructor stub
		System.out.println("Integer param constructor of MyClass: " +i + " & " +j);
	}
	public MyClass(String i) {
		// TODO Auto-generated constructor stub
		System.out.println("String param constructor of MyClass: " +i);
	}
	public MyClass(char i) {
		// TODO Auto-generated constructor stub
		System.out.println("Char param constructor of MyClass:" +i);
	}
	public void show() {
		System.out.println("Hi");
	}
	
	
}