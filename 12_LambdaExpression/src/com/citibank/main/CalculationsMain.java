package com.citibank.main;

import com.citibank.main.domain.CalculationsInterface;

public class CalculationsMain {

	public static void main(String[] args) {
		double result= 0;
//anonymous class implementation		
//		CalculationsInterface calculationsInterface = new CalculationsInterface() {
//			
//			@Override
//			public double doCalculations(double number1, double number2) {
//					return number1 + number2;
//			}
//		};
//		
//		result = calculationsInterface.doCalculations(3, 4);
//		System.out.println("Addition is: " +result);
		
		System.out.println("----------------------------------------------");
		//Lambda expression implementation
		CalculationsInterface calculationsInterface = (n1, n2) -> n1 + n2;
		System.out.println("Result::" +calculationsInterface.doCalculations(5, 10));
		
		System.out.println("------------------------");
		CalculationsInterface calculationsInterface2 = (n1, n2) -> {
			double res = n1 + n2;
			return res;
		};
		result = calculationsInterface2.doCalculations(10, 20);
		System.out.println("Result :: " +result);
	}

}
