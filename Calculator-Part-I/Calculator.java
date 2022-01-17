package com.calculator;

public class Calculator {
	private double results;
	private double number1;
	private double number2;
	private char operator; 
	
	public Calculator() {
		
	}
	public void setOperandOne(double input) {
		this.number1 = input;
	}
	
	public void setOperation(char input) {
		this.operator = input;
	}
	
	public void setOperandTwo(double input) {
		this.number2 = input;
	}

	public void performOperation() {
		if( this.operator == '+') {
			results = (number1) + (number2);
		}
		if( this.operator == '-') {
			results = (number1) - (number2);
		}
	}
	public void getResults() {
		System.out.println(results);
	}
}
