package com.citibank.main.domin;

public class Circle extends Shapes {
	public Circle() {
		// TODO Auto-generated constructor stub
		super();
		System.out.println("Default onstructor of Circle");
	}
	
	public Circle(int size) {
		// TODO Auto-generated constructor stub
		super(size);
		System.out.println("Param Constructor of Circle");
		System.out.println("Size :: " + size );
	}
	
	@Override
	public void draw() {
		System.out.println("Drawing Circle");
	}
	
	public void print() {
		System.out.println("print");
	}
	
	
}
