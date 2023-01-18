package com.citibank.main.domin;

public class GetOption {

	public Shapes getShape(int choice) {
		if (choice == 1) {
			Shapes shapes = new Circle();
			return shapes;
		}
		if (choice == 2) {
			return new Triangle();
		}
		if (choice == 3) {
			return new Line();
		}
		//return new Shapes();
		return null;
	}
}
