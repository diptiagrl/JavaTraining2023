package com.citibank.main.domin;

public class Triangle extends Shapes {
	public Triangle() {
		// TODO Auto-generated constructor stub
		System.out.println("Default onstructor of Triangle");
	}
	public Triangle(int size) {
		// TODO Auto-generated constructor stub
		System.out.println("Param Constructor of Triangle");
		System.out.println("Size :: " + size );
	}
	@Override
	public void draw() {
		System.out.println("Drawing Triangle");
	}

}
