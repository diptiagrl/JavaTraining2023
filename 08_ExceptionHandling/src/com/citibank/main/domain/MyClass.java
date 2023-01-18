package com.citibank.main.domain;

import java.util.InputMismatchException;
import java.util.Scanner;

public class MyClass {
	private double num1;
	private double num2;
	private double result;

	public void accept() {
		// accept 2 numbers from user
		Scanner scanner = new Scanner(System.in);
		try {
			System.out.println("Enter num1 : ");
			num1 = scanner.nextDouble();
			System.out.println("Value of num1 : " + num1);
			System.out.println();
			System.out.println("Enter num2 : ");
			num2 = scanner.nextDouble();
			System.out.println("Value of num2 : " + num2);
		} catch (InputMismatchException e) {
			// if you dont know exception class name then simply use Exception as class name
			// } catch( exception) {
			System.out.println("Invalid Input from user");
			System.out.println("Program will continue its execution!!");
			System.out.println(e.getMessage());
		} catch (Exception e) {
			System.out.println("Exception in code!!");
			System.out.println(e.getMessage());
		} finally {
			try {
				System.out.println("Thank you");
				scanner.close();
			} catch (Exception e) {
				
			} finally {
			}
		}

	}

	public void calculate() {
		// calculate result = num1/unm2
		System.out.println("Calculating Result");
		result = num1 / num2;
	}

	public void display() {
		// print value of result
		System.out.println("Value of result : " + result);
	}
}
