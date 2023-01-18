package com.citibank.main;

import java.util.Scanner;

import com.citibank.main.domin.GetOption;
import com.citibank.main.domin.Shapes;

public class ShapesMainV2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Welcome to my Drawing App");
		System.out.println();
		System.out.println("Enter your choice");
		System.out.println("1.Circle 2.Traingle 3.Line");
		
		Scanner scanner = new Scanner(System.in);
		int choice = 0;
		choice =scanner.nextInt();
		
		GetOption getOption = new GetOption();
		Shapes shapes = getOption.getShape(choice);
		shapes.draw();
		
		
	}

}
