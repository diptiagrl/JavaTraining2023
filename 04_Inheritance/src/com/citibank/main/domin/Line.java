package com.citibank.main.domin;

public class Line extends Shapes {
	public Line() {
		// TODO Auto-generated constructor stub
		System.out.println("Default onstructor of Line");
	}
	public Line(int size) {
		// TODO Auto-generated constructor stub
		System.out.println("Param Constructor of Line");
		System.out.println("Size :: " + size );
	}

	@Override
	public void draw() {
		System.out.println("Drawing Line");
	}

}
