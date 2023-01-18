package com.citibank.main;

import com.citibank.main.domain.MyClass;

public class MyClassMain {
	
	
	static int num2 = 20;

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		
		System.out.println("main start");
		
		MyClass myclass;
		MyClass.num2 = 10;
		myclass = new MyClass();
		
		myclass.num1 =10;
		System.out.println("main end");
		
		
		//MyClass myclass = new MyClass();
//		MyClass.setNum2(20);
//		
//		//System.out.println("Display x : " +num1); >>static function cant use variable which is not static
//		System.out.println("Display y: " +num2);
//		System.out.println("display value of static variable num2 :" +MyClass.getNum2());
//
//		MyClass myclass = new MyClass();
	}
}
//		myclass.display();
//		System.out.println("--------------------");
//		
//		myclass.num2 = 20;
//		
//		MyClass.setNum2(20);
//		
//		MyClass myclass1 = new MyClass();
//		myclass1.display();
//		
//		MyClassMain obj =  new MyClassMain();
//		obj.print();
//		obj.num1 = 10;
//		//print();
//
//	}
//	
//	public void print() {
//		num2 = 20;
//		num1 = 10;
//		
//	}

//}
