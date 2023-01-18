package com.citibank.main;

import com.citibank.main.domain.MyClass;

public class MyClassMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Main Start");
		
		MyClass myClass = new MyClass();
		myClass.show();
		System.out.println("------------------------");
		new MyClass();
		new MyClass().show();
		new MyClass(10);
		new MyClass(15,20);
		new MyClass("test");
		new MyClass('a');
		
		//new MyClass(10).show();
		//new MyClass();
		
		System.out.println("Main End");
	}

}
