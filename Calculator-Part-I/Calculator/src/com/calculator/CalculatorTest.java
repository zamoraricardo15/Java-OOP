package com.calculator;

public class CalculatorTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Calculator o = new Calculator();
        o.setOperandOne(10.5);
        o.setOperation('+');
        o.setOperandTwo(5.2);
        o.performOperation();
        o.getResults();
	}

}
