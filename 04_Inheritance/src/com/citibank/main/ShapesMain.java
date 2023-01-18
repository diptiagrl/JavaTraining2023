package com.citibank.main;

import java.util.Scanner;

import com.citibank.main.domin.Circle;
import com.citibank.main.domin.Line;
import com.citibank.main.domin.Shapes;
import com.citibank.main.domin.Triangle;

public class ShapesMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Circle circle = new Circle();
//		circle.draw();
//		Circle circle = new Circle();
//		circle.draw();
		
//		Shapes shapes = new Circle();
//		shapes.draw();
//following doesnt work because print() method is not present in parent class
//shapes.print();
//following executes, because all the methods of base class and common method of base and child class.
//		shapes.convertShapes();
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Draw your pattern");
		System.out.println();
		System.out.println("1. Circle 2. Triangle 3.Line");
		System.out.println("Enter your choice");

		int choice = scanner.nextInt();
		Shapes shapes = getShape(choice);
		shapes.draw();
		
	}
		public static Shapes getShape(int choice) {
			if (choice==1) {
				Shapes shapes = new Circle();
				return shapes;
			}
			if (choice==2) {
				return new Triangle();
			}
			if (choice==3) {
				return new Line(); 
			}
		//return new Shapes();
		return null;

	}

}
