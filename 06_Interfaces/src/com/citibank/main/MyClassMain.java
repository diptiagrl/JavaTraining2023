package com.citibank.main;

import java.util.Scanner;

import com.citibank.main.domain.MyClass;
import com.citibank.main.domain.MyInterface;
import com.citibank.main.domain.YourClass;
import com.citibank.main.factory.MyFactory;

public class MyClassMain {
	
	public void display() {
		System.out.println("show variable. " +MyInterface.message);
	}
	public static void main(String[] args) {
		MyClassMain myClassMain = new MyClassMain();
		myClassMain.display();
		
		System.out.println("Main Start");
		MyClass myClass = new MyClass();
		myClass.show();
		
		System.out.println("---------");
		
		//MyInterface myInterface = new MyClass();
		//myInterface.show();
		
		System.out.println("---------");
		System.out.println(MyInterface.message);
		
		//static variables of interface can be accessess by any class which implements that interface
		System.out.println(MyClass.message);
		System.out.println(YourClass.message);
		
		System.out.println("---------------------");
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("1. MyClass object");
		System.out.println("2. YourClass object");
		System.out.println("Enter your choice");
		int choice = scanner.nextInt();
		
		MyInterface myInterface = MyFactory.getObject(choice);
		
		if (myInterface != null)
			myInterface.show();
		else
			System.out.println("Invalid Choice");
			
		System.out.println("Main End");
	}

}
