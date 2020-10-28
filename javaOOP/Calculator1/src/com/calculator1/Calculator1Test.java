package com.calculator1;

public class Calculator1Test {

	public static void main(String[] args) {
		Calculator1 testCalc1 = new Calculator1(10.5, "+", 5.2);
		Calculator1 testCalc2 = new Calculator1(34.9, "-", 19.2);
		Calculator1 testCalc3 = new Calculator1(20.32, "+", 29.99);

		testCalc1.performOperation();
		testCalc2.performOperation();
		testCalc3.performOperation();

		testCalc1.getResults();
		testCalc2.getResults();
		testCalc3.getResults();

	}

}
