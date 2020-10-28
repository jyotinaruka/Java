package com.calculator1;

public class Calculator1 {

// Attributes
	private double operandOne = 0.0;
	private double operandTwo = 0.0;
	private String operation = "";
	private double mathTotal = 0.0;

//Constructor
	public Calculator1() {

	}

	public Calculator1(double operandOne, String operation, double operandTwo) {
		this.operandOne = operandOne;
		this.operandTwo = operandTwo;
		this.operation = operation;
	}

// Getters
	public double getOperandOne() {
		return operandOne;
	}

	public double getOperandTwo() {
		return operandTwo;
	}

	public String getOperation() {
		return operation;
	}

	public double getMathTotal() {
		return mathTotal;
	}

// Setters
	public void setOperandOne(double operandOne) {
		this.operandOne = operandOne;
	}

	public void setOperandTwo(double operandTwo) {
		this.operandTwo = operandTwo;
	}

	public void setOperation(String operation) {
		this.operation = operation;
	}

	public void setMathTotal(double mathTotal) {
		this.mathTotal = mathTotal;
	}

//Methods

	public void performOperation() {
		if (getOperation().equals("+")) {
			double total = getOperandOne() + getOperandTwo();
			setMathTotal(total);
		} else if (getOperation().equals("-")) {
			double total = getOperandOne() - getOperandTwo();
			setMathTotal(total);
		}
	}

	public void getResults() {
		System.out.println(getMathTotal());
	}

}
