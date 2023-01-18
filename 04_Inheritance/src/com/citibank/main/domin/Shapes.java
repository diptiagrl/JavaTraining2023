package com.citibank.main.domin;

//Generalization
public abstract class Shapes extends Object {
	public Shapes() {
		// TODO Auto-generated constructor stub
		System.out.println("Default Constructor of Shapes");
	}
	public Shapes(int size) {
		// TODO Auto-generated constructor stub
		System.out.println("Param Constructor of Shapes");
		System.out.println("Size :: " + size );
	}
//	public void draw() {
//		System.out.println("Drawing Shapes");
//	}
	public abstract void draw();
	
	public void convertShapes() {
		// TODO Auto-generated method stub
		System.out.println("convert shape method");
		
	}

}
